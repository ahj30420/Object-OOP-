package chapter14.step02;

import chapter14.Call;
import chapter14.DateTimeInterval;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayOfWeekFeeCondition implements FeeCondition {
    private List<DayOfWeek> daysOfWeek = new ArrayList<>();

    public DayOfWeekFeeCondition(DayOfWeek ...dayOfWeeks) {
        this.daysOfWeek = Arrays.asList(dayOfWeeks);
    }

    @Override
    public List<DateTimeInterval> findTimeIntervals(Call call) {
        return call.getInterval()
                .splitByDay()
                .stream()
                .filter(each -> daysOfWeek.contains(each.getFrom().getDayOfWeek()))
                .collect(Collectors.toList());
    }
}
