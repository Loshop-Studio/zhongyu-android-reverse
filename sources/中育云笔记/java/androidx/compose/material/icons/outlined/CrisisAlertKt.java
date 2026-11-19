package androidx.compose.material.icons.outlined;

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
public final class CrisisAlertKt {
    private static ImageVector _crisisAlert;

    public static final ImageVector getCrisisAlert(Icons.Outlined outlined) {
        ImageVector imageVector = _crisisAlert;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CrisisAlert", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.5f, 2.5f);
        pathBuilder.curveToRelative(0.0f, 1.5f, -1.5f, 6.0f, -1.5f, 6.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, -1.5f, -4.5f, -1.5f, -6.0f);
        pathBuilder.curveTo(9.5f, 1.12f, 10.62f, 0.0f, 12.0f, 0.0f);
        pathBuilder.reflectiveCurveTo(14.5f, 1.12f, 14.5f, 2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 10.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 10.0f, 12.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.08f, 5.11f);
        pathBuilder.curveToRelative(0.18f, -0.75f, 0.33f, -1.47f, 0.39f, -2.06f);
        pathBuilder.curveTo(19.75f, 4.69f, 22.0f, 8.08f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, -4.48f, 10.0f, -10.0f, 10.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -3.92f, 2.25f, -7.31f, 5.53f, -8.95f);
        pathBuilder.curveTo(7.6f, 3.64f, 7.74f, 4.37f, 7.92f, 5.11f);
        pathBuilder.curveTo(5.58f, 6.51f, 4.0f, 9.07f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.curveTo(20.0f, 9.07f, 18.42f, 6.51f, 16.08f, 5.11f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.curveToRelative(0.0f, -2.0f, 0.98f, -3.77f, 2.48f, -4.86f);
        pathBuilder.curveToRelative(0.23f, 0.81f, 0.65f, 2.07f, 0.65f, 2.07f);
        pathBuilder.curveTo(8.43f, 9.93f, 8.0f, 10.92f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -1.08f, -0.43f, -2.07f, -1.13f, -2.79f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.41f, -1.22f, 0.65f, -2.07f);
        pathBuilder.curveTo(17.02f, 8.23f, 18.0f, 10.0f, 18.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _crisisAlert = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
