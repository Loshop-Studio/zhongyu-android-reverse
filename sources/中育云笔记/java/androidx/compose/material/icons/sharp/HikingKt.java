package androidx.compose.material.icons.sharp;

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

/* loaded from: classes.dex */
public final class HikingKt {
    private static ImageVector _hiking;

    public static final ImageVector getHiking(Icons.Sharp sharp) {
        ImageVector imageVector = _hiking;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Hiking", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.5f, 5.5f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 10.78f);
        pathBuilder.curveToRelative(-1.23f, -0.37f, -2.22f, -1.17f, -2.8f, -2.18f);
        pathBuilder.lineToRelative(-1.0f, -1.6f);
        pathBuilder.curveToRelative(-0.41f, -0.65f, -1.11f, -1.0f, -1.84f, -1.0f);
        pathBuilder.curveToRelative(-0.78f, 0.0f, -1.59f, 0.5f, -1.78f, 1.44f);
        pathBuilder.reflectiveCurveTo(7.0f, 23.0f, 7.0f, 23.0f);
        pathBuilder.horizontalLineToRelative(2.1f);
        pathBuilder.lineToRelative(1.8f, -8.0f);
        pathBuilder.lineToRelative(2.1f, 2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-7.5f);
        pathBuilder.lineToRelative(-2.1f, -2.0f);
        pathBuilder.lineToRelative(0.6f, -3.0f);
        pathBuilder.curveToRelative(1.0f, 1.15f, 2.41f, 2.01f, 4.0f, 2.34f);
        pathBuilder.verticalLineTo(23.0f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.lineTo(17.5f, 10.78f);
        pathBuilder.close();
        pathBuilder.moveTo(7.43f, 13.13f);
        pathBuilder.lineToRelative(-3.1f, -0.6f);
        pathBuilder.lineToRelative(1.34f, -6.87f);
        pathBuilder.lineToRelative(3.13f, 0.61f);
        pathBuilder.lineTo(7.43f, 13.13f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hiking = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
