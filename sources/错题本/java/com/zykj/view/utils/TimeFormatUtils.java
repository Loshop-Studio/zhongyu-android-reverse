package com.zykj.view.utils;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.timepicker.TimeModel;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m5110d2 = {"Lcom/zykj/view/utils/TimeFormatUtils;", "", "<init>", "()V", "formatTime", "", "ms", "", "formatTimeWithHour", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TimeFormatUtils {

    @NotNull
    public static final TimeFormatUtils INSTANCE = new TimeFormatUtils();

    private TimeFormatUtils() {
    }

    @NotNull
    public final String formatTime(long ms) {
        long j7 = 60000;
        long j8 = ms / j7;
        long j9 = (ms - (j7 * j8)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j8 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1)).concat(":"));
        }
        if (j9 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j9)}, 1)));
        }
        String string = stringBuffer.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String formatTimeWithHour(long ms) {
        long j7 = 3600000;
        long j8 = ms / j7;
        long j9 = ms - (j7 * j8);
        long j10 = 60000;
        long j11 = j9 / j10;
        long j12 = (j9 - (j10 * j11)) / 1000;
        StringBuffer stringBuffer = new StringBuffer();
        if (j8 > 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j8)}, 1)).concat(":"));
        }
        if (j11 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j11)}, 1)).concat(":"));
        }
        if (j12 >= 0) {
            stringBuffer.append(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j12)}, 1)));
        }
        String string = stringBuffer.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
        return string;
    }
}
