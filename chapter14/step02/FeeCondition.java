package chapter14.step02;

import chapter14.Call;
import chapter14.DateTimeInterval;

import java.util.List;

public interface FeeCondition {
    List<DateTimeInterval> findTimeIntervals(Call call);
}
