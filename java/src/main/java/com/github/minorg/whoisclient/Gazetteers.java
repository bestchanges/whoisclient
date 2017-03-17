package com.github.minorg.whoisclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.google.common.collect.ImmutableMap;
import com.opencsv.CSVReader;

public final class Gazetteers {
    public static Gazetteers getInstance() {
        if (instance == null) {
            instance = new Gazetteers();
        }
        return instance;
    }

    private Gazetteers() {
        {
            final Map<String, String> airportsBuilder = new LinkedHashMap<>();
            for (final String[] csvRow : __readCsvFile("airports.dat", false)) {
                if (StringUtils.isBlank(csvRow[2])) {
                    continue;
                }
                if (!StringUtils.isBlank(csvRow[4])) {
                    airportsBuilder.put(csvRow[4], csvRow[2]);
                }
                if (!StringUtils.isBlank(csvRow[5]) && !csvRow[5].equals("N")) {
                    airportsBuilder.put(csvRow[5], csvRow[2]);
                }
            }
            airportNamesByCode = ImmutableMap.copyOf(airportsBuilder);
        }

        {
            final ImmutableMap.Builder<String, String> countryNamesByCodeBuilder = ImmutableMap.builder();
            final ImmutableMap.Builder<String, String> countryCodesByNameBuilder = ImmutableMap.builder();
            for (final String[] csvRow : __readCsvFile("countries.dat", true)) {
                if (csvRow[0].equals("N")) {
                    continue;
                }
                final String countryCode = csvRow[0].toUpperCase();
                final String countryName = csvRow[1];
                countryCodesByNameBuilder.put(countryName.toUpperCase(), countryCode);
                countryNamesByCodeBuilder.put(countryCode, countryName);
            }
            for (final String[] csvRow : __readCsvFile("countries3.dat", true)) {
                if (csvRow[3].equals("N")) {
                    continue;
                }
                final String countryCode = csvRow[3].toUpperCase();
                final String countryName = csvRow[0];
                // Don't do name->three character mapping
                // countryCodesByNameBuilder.put(countryName.toUpperCase(),
                // countryCode);
                countryNamesByCodeBuilder.put(countryCode, countryName);
            }
            countryCodesByName = countryCodesByNameBuilder.build();
            countryNamesByCode = countryNamesByCodeBuilder.build();
        }

        {
            final ImmutableMap.Builder<String, String> statesAuBuilder = ImmutableMap.builder();
            for (final String[] csvRow : __readCsvFile("states_au.dat", false)) {
                statesAuBuilder.put(csvRow[0], csvRow[1]);
            }
            australianStateNamesByCode = statesAuBuilder.build();
        }

        {
            final ImmutableMap.Builder<String, String> statesCaBuilder = ImmutableMap.builder();
            for (final String[] csvRow : __readCsvFile("states_ca.dat", true)) {
                statesCaBuilder.put(csvRow[2], csvRow[1]);
            }
            canadianStateNamesByCode = statesCaBuilder.build();
        }

        {
            final ImmutableMap.Builder<String, String> statesUsBuilder = ImmutableMap.builder();
            for (final String[] csvRow : __readCsvFile("states_us.dat", true)) {
                statesUsBuilder.put(csvRow[2], csvRow[1]);
            }
            americanStateNamesByCode = statesUsBuilder.build();
        }
    }

    public ImmutableMap<String, String> getAirportNamesByCode() {
        return airportNamesByCode;
    }

    public ImmutableMap<String, String> getAmericanStateNamesByCode() {
        return americanStateNamesByCode;
    }

    public ImmutableMap<String, String> getAustralianStateNamesByCode() {
        return australianStateNamesByCode;
    }

    public ImmutableMap<String, String> getCanadianStateNamesByCode() {
        return canadianStateNamesByCode;
    }

    public ImmutableMap<String, String> getCountryCodesByName() {
        return countryCodesByName;
    }

    public ImmutableMap<String, String> getCountryNamesByCode() {
        return countryNamesByCode;
    }

    private List<String[]> __readCsvFile(final String fileName, final boolean skipHeaderRow) {
        final InputStream fileInputStream = getClass().getResourceAsStream(fileName);
        if (fileInputStream == null) {
            throw new RuntimeException("unable to open resource " + fileName);
        }
        try (final InputStream inputStream = fileInputStream) {
            try (final CSVReader csvReader = new CSVReader(new InputStreamReader(inputStream))) {
                List<String[]> csvRows = csvReader.readAll();
                if (skipHeaderRow) {
                    csvRows = csvRows.subList(1, csvRows.size());
                }
                return csvRows;
            }
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }
    }

    private final ImmutableMap<String, String> airportNamesByCode;
    private final ImmutableMap<String, String> americanStateNamesByCode;
    private final ImmutableMap<String, String> australianStateNamesByCode;
    private final ImmutableMap<String, String> canadianStateNamesByCode;
    private final ImmutableMap<String, String> countryCodesByName;
    private final ImmutableMap<String, String> countryNamesByCode;
    private static Gazetteers instance = null;
}
