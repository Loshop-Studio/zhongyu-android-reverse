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
public final class DryCleaningKt {
    private static ImageVector _dryCleaning;

    public static final ImageVector getDryCleaning(Icons.Rounded rounded) {
        ImageVector imageVector = _dryCleaning;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DryCleaning", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.56f, 11.36f);
        pathBuilder.lineTo(13.0f, 8.44f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.72f, 0.22f, 0.88f, 0.53f);
        pathBuilder.curveTo(13.04f, 4.84f, 13.39f, 5.0f, 13.73f, 5.0f);
        pathBuilder.curveToRelative(0.74f, 0.0f, 1.26f, -0.79f, 0.91f, -1.44f);
        pathBuilder.curveToRelative(-0.6f, -1.1f, -1.86f, -1.78f, -3.24f, -1.51f);
        pathBuilder.curveToRelative(-1.17f, 0.23f, -2.12f, 1.2f, -2.34f, 2.37f);
        pathBuilder.curveTo(8.77f, 5.98f, 9.67f, 7.35f, 11.0f, 7.82f);
        pathBuilder.verticalLineToRelative(0.63f);
        pathBuilder.lineToRelative(-6.56f, 2.92f);
        pathBuilder.curveTo(3.56f, 11.75f, 3.0f, 12.62f, 3.0f, 13.57f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveTo(3.0f, 14.92f, 4.08f, 16.0f, 5.42f, 16.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(1.58f);
        pathBuilder.curveToRelative(1.34f, 0.0f, 2.42f, -1.08f, 2.42f, -2.42f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveTo(21.0f, 12.62f, 20.44f, 11.75f, 19.56f, 11.36f);
        pathBuilder.close();
        pathBuilder.moveTo(18.58f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.86f);
        pathBuilder.curveToRelative(-0.35f, -0.6f, -0.98f, -1.0f, -1.72f, -1.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(-0.74f, 0.0f, -1.38f, 0.4f, -1.72f, 1.0f);
        pathBuilder.horizontalLineTo(5.42f);
        pathBuilder.curveToRelative(-0.46f, 0.0f, -0.58f, -0.65f, -0.17f, -0.81f);
        pathBuilder.lineToRelative(6.75f, -3.0f);
        pathBuilder.lineToRelative(6.75f, 3.0f);
        pathBuilder.curveTo(19.17f, 13.38f, 19.03f, 14.0f, 18.58f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dryCleaning = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
