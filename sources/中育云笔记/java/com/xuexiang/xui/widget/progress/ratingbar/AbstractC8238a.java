package com.xuexiang.xui.widget.progress.ratingbar;

import android.view.MotionEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: com.xuexiang.xui.widget.progress.ratingbar.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8238a {

    /* renamed from: a */
    public static DecimalFormat f16899a;

    /* renamed from: a */
    public static float m13179a(PartialView partialView, float f10, float f11) {
        return Float.parseFloat(m13180b().format(((Integer) partialView.getTag()).intValue() - (1.0f - (Math.round(Float.parseFloat(r0.format((f11 - partialView.getLeft()) / partialView.getWidth())) / f10) * f10))));
    }

    /* renamed from: b */
    public static DecimalFormat m13180b() {
        if (f16899a == null) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.ENGLISH);
            decimalFormatSymbols.setDecimalSeparator('.');
            f16899a = new DecimalFormat("#.##", decimalFormatSymbols);
        }
        return f16899a;
    }

    /* renamed from: c */
    public static float m13181c(float f10, int i10, float f11) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        float f12 = i10;
        if (f10 > f12) {
            f10 = f12;
        }
        return f10 % f11 != 0.0f ? f11 : f10;
    }

    /* renamed from: d */
    public static boolean m13182d(float f10, float f11, MotionEvent motionEvent) {
        if (motionEvent.getEventTime() - motionEvent.getDownTime() > 200.0f) {
            return false;
        }
        return Math.abs(f10 - motionEvent.getX()) <= 5.0f && Math.abs(f11 - motionEvent.getY()) <= 5.0f;
    }
}
