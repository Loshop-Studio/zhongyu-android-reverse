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
public final class HouseboatKt {
    private static ImageVector _houseboat;

    public static final ImageVector getHouseboat(Icons.Rounded rounded) {
        ImageVector imageVector = _houseboat;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Houseboat", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 17.83f);
        pathBuilder.curveToRelative(0.0f, -0.42f, -0.27f, -0.8f, -0.67f, -0.94f);
        pathBuilder.curveTo(20.62f, 16.62f, 20.21f, 16.0f, 18.67f, 16.0f);
        pathBuilder.curveToRelative(-1.91f, 0.0f, -2.14f, 1.0f, -3.33f, 1.0f);
        pathBuilder.curveToRelative(-1.24f, 0.0f, -1.39f, -1.0f, -3.34f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-2.1f, 1.0f, -3.34f, 1.0f);
        pathBuilder.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -1.95f, 0.62f, -2.66f, 0.88f);
        pathBuilder.curveTo(2.27f, 17.03f, 2.0f, 17.4f, 2.0f, 17.83f);
        pathBuilder.curveToRelative(0.0f, 0.7f, 0.69f, 1.19f, 1.35f, 0.95f);
        pathBuilder.curveToRelative(0.8f, -0.29f, 1.18f, -0.78f, 2.0f, -0.78f);
        pathBuilder.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        pathBuilder.curveToRelative(1.95f, 0.0f, 2.08f, -1.0f, 3.32f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.37f, 1.0f, 3.32f, 1.0f);
        pathBuilder.curveToRelative(1.91f, 0.0f, 2.14f, -1.0f, 3.33f, -1.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.21f, 0.49f, 2.0f, 0.78f);
        pathBuilder.curveTo(21.31f, 19.02f, 22.0f, 18.52f, 22.0f, 17.83f);
        pathBuilder.close();
        pathBuilder.moveTo(18.91f, 9.81f);
        pathBuilder.curveToRelative(0.33f, -0.45f, 0.23f, -1.07f, -0.22f, -1.4f);
        pathBuilder.lineToRelative(-6.1f, -4.47f);
        pathBuilder.curveToRelative(-0.35f, -0.26f, -0.83f, -0.26f, -1.18f, 0.0f);
        pathBuilder.lineToRelative(-6.1f, 4.47f);
        pathBuilder.curveToRelative(-0.45f, 0.33f, -0.54f, 0.95f, -0.22f, 1.4f);
        pathBuilder.curveToRelative(0.33f, 0.45f, 0.95f, 0.54f, 1.4f, 0.22f);
        pathBuilder.lineTo(7.0f, 9.65f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.horizontalLineTo(5.74f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.71f, -0.29f);
        pathBuilder.lineToRelative(-0.66f, -0.66f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.66f, 0.66f);
        pathBuilder.curveTo(4.18f, 14.68f, 4.95f, 15.0f, 5.74f, 15.0f);
        pathBuilder.horizontalLineToRelative(12.51f);
        pathBuilder.curveToRelative(0.8f, 0.0f, 1.56f, -0.32f, 2.12f, -0.88f);
        pathBuilder.lineToRelative(0.66f, -0.66f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.66f, 0.66f);
        pathBuilder.curveTo(18.78f, 12.89f, 18.52f, 13.0f, 18.26f, 13.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.verticalLineTo(9.65f);
        pathBuilder.lineToRelative(0.51f, 0.37f);
        pathBuilder.curveTo(17.96f, 10.35f, 18.58f, 10.25f, 18.91f, 9.81f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _houseboat = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
