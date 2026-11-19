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
public final class WhatshotKt {
    private static ImageVector _whatshot;

    public static final ImageVector getWhatshot(Icons.Outlined outlined) {
        ImageVector imageVector = _whatshot;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Whatshot", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.57f, 13.16f);
        pathBuilder.curveToRelative(-1.36f, 0.28f, -2.17f, 1.16f, -2.17f, 2.41f);
        pathBuilder.curveToRelative(0.0f, 1.34f, 1.11f, 2.42f, 2.49f, 2.42f);
        pathBuilder.curveToRelative(2.05f, 0.0f, 3.71f, -1.66f, 3.71f, -3.71f);
        pathBuilder.curveToRelative(0.0f, -1.07f, -0.15f, -2.12f, -0.46f, -3.12f);
        pathBuilder.curveToRelative(-0.79f, 1.07f, -2.2f, 1.72f, -3.57f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 0.67f);
        pathBuilder.reflectiveCurveToRelative(0.74f, 2.65f, 0.74f, 4.8f);
        pathBuilder.curveToRelative(0.0f, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        pathBuilder.curveToRelative(-2.07f, 0.0f, -3.63f, -1.67f, -3.63f, -3.73f);
        pathBuilder.lineToRelative(0.03f, -0.36f);
        pathBuilder.curveTo(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, -3.58f, 8.0f, -8.0f);
        pathBuilder.curveTo(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.curveToRelative(0.0f, -1.53f, 0.3f, -3.04f, 0.86f, -4.43f);
        pathBuilder.curveToRelative(1.01f, 1.01f, 2.41f, 1.63f, 3.97f, 1.63f);
        pathBuilder.curveToRelative(2.66f, 0.0f, 4.75f, -1.83f, 5.28f, -4.43f);
        pathBuilder.curveTo(17.34f, 8.97f, 18.0f, 11.44f, 18.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whatshot = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
