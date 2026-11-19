package androidx.compose.p013ui.text.platform.style;

import android.graphics.Paint;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, m13558d2 = {"toAndroidCap", "Landroid/graphics/Paint$Cap;", "Landroidx/compose/ui/graphics/StrokeCap;", "toAndroidCap-BeK7IIE", "(I)Landroid/graphics/Paint$Cap;", "toAndroidJoin", "Landroid/graphics/Paint$Join;", "Landroidx/compose/ui/graphics/StrokeJoin;", "toAndroidJoin-Ww9F2mQ", "(I)Landroid/graphics/Paint$Join;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class DrawStyleSpan_androidKt {
    /* renamed from: toAndroidCap-BeK7IIE, reason: not valid java name */
    public static final Paint.Cap m23313toAndroidCapBeK7IIE(int i10) {
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        return StrokeCap.m21325equalsimpl0(i10, companion.m21329getButtKaPHkGw()) ? Paint.Cap.BUTT : StrokeCap.m21325equalsimpl0(i10, companion.m21330getRoundKaPHkGw()) ? Paint.Cap.ROUND : StrokeCap.m21325equalsimpl0(i10, companion.m21331getSquareKaPHkGw()) ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
    }

    /* renamed from: toAndroidJoin-Ww9F2mQ, reason: not valid java name */
    public static final Paint.Join m23314toAndroidJoinWw9F2mQ(int i10) {
        StrokeJoin.Companion companion = StrokeJoin.INSTANCE;
        return StrokeJoin.m21335equalsimpl0(i10, companion.m21340getMiterLxFBmk8()) ? Paint.Join.MITER : StrokeJoin.m21335equalsimpl0(i10, companion.m21341getRoundLxFBmk8()) ? Paint.Join.ROUND : StrokeJoin.m21335equalsimpl0(i10, companion.m21339getBevelLxFBmk8()) ? Paint.Join.BEVEL : Paint.Join.MITER;
    }
}
