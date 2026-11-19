package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class ScheduleSendKt {
    private static ImageVector _scheduleSend;

    public static final ImageVector getScheduleSend(Icons.Filled filled) {
        ImageVector imageVector = _scheduleSend;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ScheduleSend", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 12.5f);
        pathBuilder.lineTo(15.0f, 12.5f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineToRelative(3.0f, 2.0f);
        pathBuilder.lineToRelative(0.75f, -1.23f);
        pathBuilder.lineToRelative(-2.25f, -1.52f);
        pathBuilder.lineTo(16.5f, 12.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 9.0f);
        pathBuilder.lineTo(2.0f, 3.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(9.0f, 2.0f);
        pathBuilder.lineToRelative(-9.0f, 2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(7.27f, -3.11f);
        pathBuilder.curveTo(10.09f, 20.83f, 12.79f, 23.0f, 16.0f, 23.0f);
        pathBuilder.curveToRelative(3.86f, 0.0f, 7.0f, -3.14f, 7.0f, -7.0f);
        pathBuilder.reflectiveCurveToRelative(-3.14f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 21.0f);
        pathBuilder.curveToRelative(-2.75f, 0.0f, -4.98f, -2.22f, -5.0f, -4.97f);
        pathBuilder.verticalLineToRelative(-0.07f);
        pathBuilder.curveToRelative(0.02f, -2.74f, 2.25f, -4.97f, 5.0f, -4.97f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveTo(18.76f, 21.0f, 16.0f, 21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _scheduleSend = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getScheduleSend$annotations(Icons.Filled filled) {
    }
}
