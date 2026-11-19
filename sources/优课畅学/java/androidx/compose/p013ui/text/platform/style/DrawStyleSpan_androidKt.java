package androidx.compose.p013ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;

/* loaded from: classes2.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m26651toAndroidCapBeK7IIE(int i10) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        return StrokeCap.m24625equalsimpl0(i10, companion.m24629getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m24625equalsimpl0(i10, companion.m24630getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m24625equalsimpl0(i10, companion.m24631getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m26652toAndroidJoinWw9F2mQ(int i10) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        return StrokeJoin.m24635equalsimpl0(i10, companion.m24640getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m24635equalsimpl0(i10, companion.m24641getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m24635equalsimpl0(i10, companion.m24639getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
