package ru.msu.cmc.webprak.model.dao;

import lombok.Builder;
import lombok.Getter;
import ru.msu.cmc.webprak.model.entity.Flights;

import java.time.LocalDateTime;
import java.util.Collection;

public interface FlightsDAO extends BaseDAO<Flights> {
    @Builder
    @Getter
    class Filter {
        private String timeDepMin;
        private String timeDepMax;
        private String timeArrMin;
        private String timeArrMax;
        private Integer flightCostMin;
        private Integer flightCostMax;
        private Integer cntSeatsMin;
        private Integer cntSeatsMax;
        private Integer cntAvailableSeatsMin;
        private Integer cntAvailableSeatsMax;
    }

    static Filter.FilterBuilder getFilterBuilder() {
        return Filter.builder();
    }

    Collection<Flights> getFlightsByFilter(Filter filter);
}
