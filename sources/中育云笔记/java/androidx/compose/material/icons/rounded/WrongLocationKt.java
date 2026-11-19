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
public final class WrongLocationKt {
    private static ImageVector _wrongLocation;

    public static final ImageVector getWrongLocation(Icons.Rounded rounded) {
        ImageVector imageVector = _wrongLocation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WrongLocation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.42f, 4.5f);
        pathBuilder.lineToRelative(1.38f, -1.38f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(19.0f, 3.08f);
        pathBuilder.lineToRelative(-1.38f, -1.38f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(1.38f, 1.38f);
        pathBuilder.lineToRelative(-1.38f, 1.38f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(19.0f, 5.92f);
        pathBuilder.lineToRelative(1.38f, 1.38f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(20.42f, 4.5f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.67f, 8.0f);
        pathBuilder2.lineTo(19.0f, 7.33f);
        pathBuilder2.lineToRelative(-0.59f, 0.59f);
        pathBuilder2.curveToRelative(-0.7f, 0.7f, -1.84f, 0.88f, -2.65f, 0.3f);
        pathBuilder2.curveToRelative(-1.03f, -0.74f, -1.12f, -2.19f, -0.26f, -3.05f);
        pathBuilder2.lineToRelative(0.67f, -0.67f);
        pathBuilder2.lineTo(15.5f, 3.83f);
        pathBuilder2.curveToRelative(-0.36f, -0.36f, -0.54f, -0.81f, -0.57f, -1.28f);
        pathBuilder2.curveTo(14.01f, 2.19f, 13.02f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        pathBuilder2.curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f);
        pathBuilder2.curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f);
        pathBuilder2.curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f);
        pathBuilder2.curveToRelative(0.0f, -0.76f, -0.1f, -1.47f, -0.26f, -2.14f);
        pathBuilder2.curveTo(19.72f, 8.04f, 19.69f, 8.02f, 19.67f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(13.1f, 12.0f, 12.0f, 12.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wrongLocation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
