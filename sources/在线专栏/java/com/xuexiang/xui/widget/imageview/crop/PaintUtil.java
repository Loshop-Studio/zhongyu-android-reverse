package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import com.xuexiang.xui.utils.ThemeUtils;

/* loaded from: classes.dex */
final class PaintUtil {
    private static final String DEFAULT_BACKGROUND_COLOR_ID = "#B0000000";
    private static final float DEFAULT_CORNER_THICKNESS_DP = 5.0f;
    private static final float DEFAULT_GUIDELINE_THICKNESS_PX = 1.0f;
    private static final String DEFAULT_LINE_COLOR_ID = "#AAFFFFFF";
    private static final float DEFAULT_LINE_THICKNESS_DP = 3.0f;

    private PaintUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    static float getCornerThickness() {
        return DEFAULT_CORNER_THICKNESS_DP;
    }

    static float getLineThickness() {
        return 3.0f;
    }

    static Paint newBackgroundPaint(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(DEFAULT_BACKGROUND_COLOR_ID));
        return paint;
    }

    static Paint newBorderPaint(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(DEFAULT_LINE_COLOR_ID));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    static Paint newCornerPaint(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, DEFAULT_CORNER_THICKNESS_DP, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(ThemeUtils.getMainThemeColor(context));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    static Paint newGuidelinePaint(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor(DEFAULT_LINE_COLOR_ID));
        paint.setStrokeWidth(1.0f);
        return paint;
    }
}
