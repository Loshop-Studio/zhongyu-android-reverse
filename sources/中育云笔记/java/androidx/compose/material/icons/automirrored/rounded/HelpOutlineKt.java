package androidx.compose.material.icons.automirrored.rounded;

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
public final class HelpOutlineKt {
    private static ImageVector _helpOutline;

    public static final ImageVector getHelpOutline(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _helpOutline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.HelpOutline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.61f, 6.04f);
        pathBuilder.curveToRelative(-2.06f, -0.3f, -3.88f, 0.97f, -4.43f, 2.79f);
        pathBuilder.curveToRelative(-0.18f, 0.58f, 0.26f, 1.17f, 0.87f, 1.17f);
        pathBuilder.horizontalLineToRelative(0.2f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.74f, -0.29f, 0.88f, -0.67f);
        pathBuilder.curveToRelative(0.32f, -0.89f, 1.27f, -1.5f, 2.3f, -1.28f);
        pathBuilder.curveToRelative(0.95f, 0.2f, 1.65f, 1.13f, 1.57f, 2.1f);
        pathBuilder.curveToRelative(-0.1f, 1.34f, -1.62f, 1.63f, -2.45f, 2.88f);
        pathBuilder.curveToRelative(0.0f, 0.01f, -0.01f, 0.01f, -0.01f, 0.02f);
        pathBuilder.curveToRelative(-0.01f, 0.02f, -0.02f, 0.03f, -0.03f, 0.05f);
        pathBuilder.curveToRelative(-0.09f, 0.15f, -0.18f, 0.32f, -0.25f, 0.5f);
        pathBuilder.curveToRelative(-0.01f, 0.03f, -0.03f, 0.05f, -0.04f, 0.08f);
        pathBuilder.curveToRelative(-0.01f, 0.02f, -0.01f, 0.04f, -0.02f, 0.07f);
        pathBuilder.curveToRelative(-0.12f, 0.34f, -0.2f, 0.75f, -0.2f, 1.25f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.42f, 0.11f, -0.77f, 0.28f, -1.07f);
        pathBuilder.curveToRelative(0.02f, -0.03f, 0.03f, -0.06f, 0.05f, -0.09f);
        pathBuilder.curveToRelative(0.08f, -0.14f, 0.18f, -0.27f, 0.28f, -0.39f);
        pathBuilder.curveToRelative(0.01f, -0.01f, 0.02f, -0.03f, 0.03f, -0.04f);
        pathBuilder.curveToRelative(0.1f, -0.12f, 0.21f, -0.23f, 0.33f, -0.34f);
        pathBuilder.curveToRelative(0.96f, -0.91f, 2.26f, -1.65f, 1.99f, -3.56f);
        pathBuilder.curveToRelative(-0.24f, -1.74f, -1.61f, -3.21f, -3.35f, -3.47f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _helpOutline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
