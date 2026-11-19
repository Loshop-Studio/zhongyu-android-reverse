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
public final class BedroomBabyKt {
    private static ImageVector _bedroomBaby;

    public static final ImageVector getBedroomBaby(Icons.Outlined outlined) {
        ImageVector imageVector = _bedroomBaby;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BedroomBaby", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.94f, 14.04f);
        pathBuilder.curveToRelative(-0.34f, 0.34f, -0.71f, 0.64f, -1.1f, 0.92f);
        pathBuilder.lineTo(16.0f, 13.5f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(-5.62f);
        pathBuilder.lineTo(9.65f, 7.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.lineToRelative(1.0f, 0.76f);
        pathBuilder.lineTo(5.5f, 9.5f);
        pathBuilder.lineToRelative(0.95f, 1.0f);
        pathBuilder.lineTo(8.0f, 9.51f);
        pathBuilder.verticalLineToRelative(3.99f);
        pathBuilder.lineToRelative(-0.84f, 1.46f);
        pathBuilder.curveToRelative(-0.39f, -0.27f, -0.76f, -0.58f, -1.1f, -0.92f);
        pathBuilder.lineTo(5.0f, 15.1f);
        pathBuilder.curveToRelative(1.87f, 1.87f, 4.36f, 2.9f, 7.0f, 2.9f);
        pathBuilder.reflectiveCurveToRelative(5.13f, -1.03f, 7.0f, -2.9f);
        pathBuilder.lineTo(17.94f, 14.04f);
        pathBuilder.close();
        pathBuilder.moveTo(8.45f, 15.71f);
        pathBuilder.lineToRelative(0.03f, -0.06f);
        pathBuilder.lineToRelative(0.81f, -1.41f);
        pathBuilder.curveToRelative(1.74f, 0.65f, 3.66f, 0.65f, 5.4f, 0.0f);
        pathBuilder.lineToRelative(0.81f, 1.41f);
        pathBuilder.lineToRelative(0.03f, 0.06f);
        pathBuilder.curveToRelative(-1.1f, 0.51f, -2.3f, 0.79f, -3.55f, 0.79f);
        pathBuilder.reflectiveCurveTo(9.55f, 16.23f, 8.45f, 15.71f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomBaby = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
