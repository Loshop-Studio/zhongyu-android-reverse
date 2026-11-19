package androidx.compose.material.icons.rounded;

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
public final class DisabledVisibleKt {
    private static ImageVector _disabledVisible;

    public static final ImageVector getDisabledVisible(Icons.Rounded rounded) {
        ImageVector imageVector = _disabledVisible;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DisabledVisible", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.99f, 12.34f);
        pathBuilder.curveTo(22.0f, 12.23f, 22.0f, 12.11f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.17f, 3.93f, 9.43f, 8.96f, 9.95f);
        pathBuilder.curveToRelative(-0.93f, -0.73f, -1.72f, -1.64f, -2.32f, -2.68f);
        pathBuilder.curveTo(5.9f, 18.0f, 4.0f, 15.22f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.85f, 0.63f, -3.55f, 1.69f, -4.9f);
        pathBuilder.lineToRelative(5.66f, 5.66f);
        pathBuilder.curveToRelative(0.56f, -0.4f, 1.17f, -0.73f, 1.82f, -1.0f);
        pathBuilder.lineTo(7.1f, 5.69f);
        pathBuilder.curveTo(8.45f, 4.63f, 10.15f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(4.24f, 0.0f, 7.7f, 3.29f, 7.98f, 7.45f);
        pathBuilder.curveTo(20.69f, 11.67f, 21.37f, 11.97f, 21.99f, 12.34f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 13.0f);
        pathBuilder.curveToRelative(-3.18f, 0.0f, -5.9f, 1.87f, -7.0f, 4.5f);
        pathBuilder.curveToRelative(1.1f, 2.63f, 3.82f, 4.5f, 7.0f, 4.5f);
        pathBuilder.reflectiveCurveToRelative(5.9f, -1.87f, 7.0f, -4.5f);
        pathBuilder.curveTo(22.9f, 14.87f, 20.18f, 13.0f, 17.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 20.0f);
        pathBuilder.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        pathBuilder.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        pathBuilder.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        pathBuilder.curveTo(19.5f, 18.88f, 18.38f, 20.0f, 17.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 17.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(18.5f, 16.67f, 18.5f, 17.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _disabledVisible = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
