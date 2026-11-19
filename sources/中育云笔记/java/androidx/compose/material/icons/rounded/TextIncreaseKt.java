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
public final class TextIncreaseKt {
    private static ImageVector _textIncrease;

    public static final ImageVector getTextIncrease(Icons.Rounded rounded) {
        ImageVector imageVector = _textIncrease;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TextIncrease", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.61f, 19.0f);
        pathBuilder.lineTo(2.61f, 19.0f);
        pathBuilder.curveToRelative(0.48f, 0.0f, 0.91f, -0.3f, 1.06f, -0.75f);
        pathBuilder.lineToRelative(1.01f, -2.83f);
        pathBuilder.horizontalLineToRelative(5.65f);
        pathBuilder.lineToRelative(0.99f, 2.82f);
        pathBuilder.curveTo(11.48f, 18.7f, 11.91f, 19.0f, 12.39f, 19.0f);
        pathBuilder.curveToRelative(0.79f, 0.0f, 1.33f, -0.79f, 1.05f, -1.52f);
        pathBuilder.lineTo(9.19f, 6.17f);
        pathBuilder.curveTo(8.93f, 5.47f, 8.25f, 5.0f, 7.5f, 5.0f);
        pathBuilder.reflectiveCurveTo(6.07f, 5.47f, 5.81f, 6.17f);
        pathBuilder.lineTo(1.56f, 17.48f);
        pathBuilder.curveTo(1.28f, 18.21f, 1.83f, 19.0f, 2.61f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.44f, 7.6f);
        pathBuilder.horizontalLineToRelative(0.12f);
        pathBuilder.lineToRelative(2.03f, 5.79f);
        pathBuilder.horizontalLineTo(5.41f);
        pathBuilder.lineTo(7.44f, 7.6f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(15.45f, 13.0f, 15.0f, 12.55f, 15.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textIncrease = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
