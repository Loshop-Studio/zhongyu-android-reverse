package com.google.android.material.slider;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class BasicLabelFormatter implements LabelFormatter {
    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;
    private static final long TRILLION = 1000000000000L;

    @Override // com.google.android.material.slider.LabelFormatter
    @NonNull
    public String getFormattedValue(float f6) {
        return f6 >= 1.0E12f ? String.format(Locale.US, "%.1fT", Float.valueOf(f6 / 1.0E12f)) : f6 >= 1.0E9f ? String.format(Locale.US, "%.1fB", Float.valueOf(f6 / 1.0E9f)) : f6 >= 1000000.0f ? String.format(Locale.US, "%.1fM", Float.valueOf(f6 / 1000000.0f)) : f6 >= 1000.0f ? String.format(Locale.US, "%.1fK", Float.valueOf(f6 / 1000.0f)) : String.format(Locale.US, "%.0f", Float.valueOf(f6));
    }
}
