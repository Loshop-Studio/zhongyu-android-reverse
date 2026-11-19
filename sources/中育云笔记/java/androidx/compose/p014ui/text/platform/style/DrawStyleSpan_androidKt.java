package androidx.compose.p014ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;

/* loaded from: classes2.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m33253toAndroidCapBeK7IIE(int i10) {
        StrokeCap.Companion companion = StrokeCap.Companion;
        return StrokeCap.m31227equalsimpl0(i10, companion.m31231getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m31227equalsimpl0(i10, companion.m31232getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m31227equalsimpl0(i10, companion.m31233getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m33254toAndroidJoinWw9F2mQ(int i10) {
        StrokeJoin.Companion companion = StrokeJoin.Companion;
        return StrokeJoin.m31237equalsimpl0(i10, companion.m31242getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m31237equalsimpl0(i10, companion.m31243getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m31237equalsimpl0(i10, companion.m31241getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
