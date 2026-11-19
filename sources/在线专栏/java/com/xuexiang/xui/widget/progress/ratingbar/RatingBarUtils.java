package com.xuexiang.xui.widget.progress.ratingbar;

import android.view.MotionEvent;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes.dex */
final class RatingBarUtils {
    private static final int MAX_CLICK_DISTANCE = 5;
    private static final int MAX_CLICK_DURATION = 200;
    private static DecimalFormat mDecimalFormat;

    private RatingBarUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    static float calculateRating(PartialView partialView, float f4, float f5) {
        return Float.parseFloat(getDecimalFormat().format(((Integer) partialView.getTag()).intValue() - (1.0f - (Math.round(Float.parseFloat(r0.format((f5 - partialView.getLeft()) / partialView.getWidth())) / f4) * f4))));
    }

    static DecimalFormat getDecimalFormat() {
        if (mDecimalFormat == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
            decimalFormatSymbols.setDecimalSeparator('.');
            mDecimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
        }
        return mDecimalFormat;
    }

    static float getValidMinimumStars(float f4, int i4, float f5) {
        if (f4 < IGoodView.DEFAULT_TO_ALPHA) {
            f4 = IGoodView.DEFAULT_TO_ALPHA;
        }
        float f6 = i4;
        if (f4 > f6) {
            f4 = f6;
        }
        return f4 % f5 != IGoodView.DEFAULT_TO_ALPHA ? f5 : f4;
    }

    static boolean isClickEvent(float f4, float f5, MotionEvent motionEvent) {
        if (motionEvent.getEventTime() - motionEvent.getDownTime() > 200.0f) {
            return false;
        }
        return Math.abs(f4 - motionEvent.getX()) <= 5.0f && Math.abs(f5 - motionEvent.getY()) <= 5.0f;
    }
}
