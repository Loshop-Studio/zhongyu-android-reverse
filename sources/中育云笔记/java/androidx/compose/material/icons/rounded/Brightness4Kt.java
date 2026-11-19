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
public final class Brightness4Kt {
    private static ImageVector _brightness4;

    public static final ImageVector getBrightness4(Icons.Rounded rounded) {
        ImageVector imageVector = _brightness4;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness4", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.6f, 11.29f);
        pathBuilder.lineTo(20.0f, 8.69f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.69f);
        pathBuilder.lineToRelative(-2.6f, -2.6f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(8.69f, 4.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(4.45f, 4.0f, 4.0f, 4.45f, 4.0f, 5.0f);
        pathBuilder.verticalLineToRelative(3.69f);
        pathBuilder.lineToRelative(-2.6f, 2.6f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(4.0f, 15.3f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(3.69f);
        pathBuilder.lineToRelative(2.6f, 2.6f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.6f, -2.6f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-3.69f);
        pathBuilder.lineToRelative(2.6f, -2.6f);
        pathBuilder.curveTo(22.99f, 12.32f, 22.99f, 11.68f, 22.6f, 11.29f);
        pathBuilder.close();
        pathBuilder.moveTo(17.92f, 12.98f);
        pathBuilder.curveToRelative(-0.34f, 2.12f, -1.85f, 3.94f, -3.88f, 4.66f);
        pathBuilder.curveToRelative(-1.21f, 0.43f, -2.41f, 0.45f, -3.5f, 0.18f);
        pathBuilder.curveToRelative(-0.41f, -0.1f, -0.48f, -0.65f, -0.13f, -0.9f);
        pathBuilder.curveTo(11.98f, 15.84f, 13.0f, 14.04f, 13.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.02f, -3.84f, -2.58f, -4.92f);
        pathBuilder.curveToRelative(-0.35f, -0.24f, -0.29f, -0.79f, 0.13f, -0.9f);
        pathBuilder.curveToRelative(1.09f, -0.27f, 2.29f, -0.25f, 3.5f, 0.18f);
        pathBuilder.curveToRelative(2.02f, 0.72f, 3.54f, 2.54f, 3.88f, 4.66f);
        pathBuilder.curveTo(17.98f, 11.35f, 18.0f, 11.68f, 18.0f, 12.0f);
        pathBuilder.curveTo(17.99f, 12.32f, 17.97f, 12.65f, 17.92f, 12.98f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness4 = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
