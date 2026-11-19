package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class DownhillSkiingKt {
    private static ImageVector _downhillSkiing;

    public static final ImageVector getDownhillSkiing(Icons.TwoTone twoTone) {
        ImageVector imageVector = _downhillSkiing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DownhillSkiing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 4.5f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(18.5f, 3.4f, 18.5f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(15.78f, 20.9f);
        pathBuilder.lineToRelative(0.76f, 0.27f);
        pathBuilder.curveToRelative(0.62f, 0.21f, 1.27f, 0.33f, 1.96f, 0.33f);
        pathBuilder.curveToRelative(0.84f, 0.0f, 1.65f, -0.18f, 2.38f, -0.5f);
        pathBuilder.lineTo(22.0f, 22.13f);
        pathBuilder.curveTo(20.95f, 22.68f, 19.76f, 23.0f, 18.5f, 23.0f);
        pathBuilder.curveToRelative(-0.86f, 0.0f, -1.68f, -0.14f, -2.45f, -0.41f);
        pathBuilder.lineTo(2.0f, 17.47f);
        pathBuilder.lineToRelative(0.5f, -1.41f);
        pathBuilder.lineToRelative(6.9f, 2.51f);
        pathBuilder.lineToRelative(1.72f, -4.44f);
        pathBuilder.lineTo(7.55f, 10.4f);
        pathBuilder.curveTo(6.66f, 9.46f, 6.88f, 7.93f, 8.0f, 7.28f);
        pathBuilder.lineToRelative(3.48f, -2.01f);
        pathBuilder.curveToRelative(1.1f, -0.64f, 2.52f, -0.1f, 2.91f, 1.11f);
        pathBuilder.lineToRelative(0.33f, 1.08f);
        pathBuilder.curveToRelative(0.44f, 1.42f, 1.48f, 2.57f, 2.83f, 3.14f);
        pathBuilder.lineTo(18.07f, 9.0f);
        pathBuilder.lineToRelative(1.43f, 0.46f);
        pathBuilder.lineToRelative(-1.12f, 3.45f);
        pathBuilder.curveToRelative(-2.45f, -0.4f, -4.48f, -2.07f, -5.38f, -4.32f);
        pathBuilder.lineToRelative(-2.53f, 1.45f);
        pathBuilder.lineToRelative(3.03f, 3.46f);
        pathBuilder.lineToRelative(-2.22f, 5.76f);
        pathBuilder.lineToRelative(3.09f, 1.12f);
        pathBuilder.lineToRelative(2.1f, -6.44f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.46f, 0.18f, 0.94f, 0.31f, 1.44f, 0.41f);
        pathBuilder.lineTo(15.78f, 20.9f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downhillSkiing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
