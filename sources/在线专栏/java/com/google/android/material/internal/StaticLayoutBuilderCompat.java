package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.lang.reflect.Constructor;
import p011b0.C1025h;

/* loaded from: classes.dex */
final class StaticLayoutBuilderCompat {
    private static final String TEXT_DIRS_CLASS = "android.text.TextDirectionHeuristics";
    private static final String TEXT_DIR_CLASS = "android.text.TextDirectionHeuristic";
    private static final String TEXT_DIR_CLASS_LTR = "LTR";
    private static final String TEXT_DIR_CLASS_RTL = "RTL";
    private static Constructor<StaticLayout> constructor;
    private static boolean initialized;
    private static Object textDirection;
    private int end;
    private boolean isRtl;
    private final TextPaint paint;
    private CharSequence source;
    private final int width;
    private int start = 0;
    private Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
    private int maxLines = Integer.MAX_VALUE;
    private boolean includePad = true;
    private TextUtils.TruncateAt ellipsize = null;

    static class StaticLayoutBuilderCompatException extends Exception {
        StaticLayoutBuilderCompatException(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    private StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.source = charSequence;
        this.paint = textPaint;
        this.width = i4;
        this.end = charSequence.length();
    }

    private void createConstructorWithReflection() throws NoSuchMethodException, SecurityException, StaticLayoutBuilderCompatException {
        if (initialized) {
            return;
        }
        try {
            textDirection = this.isRtl && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            constructor = declaredConstructor;
            declaredConstructor.setAccessible(true);
            initialized = true;
        } catch (Exception e4) {
            throw new StaticLayoutBuilderCompatException(e4);
        }
    }

    public static StaticLayoutBuilderCompat obtain(CharSequence charSequence, TextPaint textPaint, int i4) {
        return new StaticLayoutBuilderCompat(charSequence, textPaint, i4);
    }

    public StaticLayout build() throws NoSuchMethodException, SecurityException, StaticLayoutBuilderCompatException {
        if (this.source == null) {
            this.source = "";
        }
        int iMax = Math.max(0, this.width);
        CharSequence charSequenceEllipsize = this.source;
        if (this.maxLines == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.paint, iMax, this.ellipsize);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.end);
        this.end = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            createConstructorWithReflection();
            try {
                return (StaticLayout) ((Constructor) C1025h.m4782f(constructor)).newInstance(charSequenceEllipsize, Integer.valueOf(this.start), Integer.valueOf(this.end), this.paint, Integer.valueOf(iMax), this.alignment, C1025h.m4782f(textDirection), Float.valueOf(1.0f), Float.valueOf(IGoodView.DEFAULT_TO_ALPHA), Boolean.valueOf(this.includePad), null, Integer.valueOf(iMax), Integer.valueOf(this.maxLines));
            } catch (Exception e4) {
                throw new StaticLayoutBuilderCompatException(e4);
            }
        }
        if (this.isRtl) {
            this.alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.start, iMin, this.paint, iMax);
        builderObtain.setAlignment(this.alignment);
        builderObtain.setIncludePad(this.includePad);
        builderObtain.setTextDirection(this.isRtl ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.ellipsize;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.maxLines);
        return builderObtain.build();
    }

    public StaticLayoutBuilderCompat setAlignment(Layout.Alignment alignment) {
        this.alignment = alignment;
        return this;
    }

    public StaticLayoutBuilderCompat setEllipsize(TextUtils.TruncateAt truncateAt) {
        this.ellipsize = truncateAt;
        return this;
    }

    public StaticLayoutBuilderCompat setEnd(int i4) {
        this.end = i4;
        return this;
    }

    public StaticLayoutBuilderCompat setIncludePad(boolean z3) {
        this.includePad = z3;
        return this;
    }

    public StaticLayoutBuilderCompat setIsRtl(boolean z3) {
        this.isRtl = z3;
        return this;
    }

    public StaticLayoutBuilderCompat setMaxLines(int i4) {
        this.maxLines = i4;
        return this;
    }

    public StaticLayoutBuilderCompat setStart(int i4) {
        this.start = i4;
        return this;
    }
}
