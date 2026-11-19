package androidx.compose.material.icons.automirrored.outlined;

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
public final class PhoneMissedKt {
    private static ImageVector _phoneMissed;

    public static final ImageVector getPhoneMissed(Icons.AutoMirrored.Outlined outlined) {
        ImageVector imageVector = _phoneMissed;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Outlined.PhoneMissed", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.71f, 16.67f);
        pathBuilder.curveTo(20.66f, 13.78f, 16.54f, 12.0f, 12.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(3.34f, 13.78f, 0.29f, 16.67f);
        pathBuilder.curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.11f, 0.53f, 0.29f, 0.71f);
        pathBuilder.lineToRelative(2.48f, 2.48f);
        pathBuilder.curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f);
        pathBuilder.curveToRelative(0.27f, 0.0f, 0.52f, -0.11f, 0.7f, -0.28f);
        pathBuilder.curveToRelative(0.79f, -0.74f, 1.69f, -1.36f, 2.66f, -1.85f);
        pathBuilder.curveToRelative(0.33f, -0.16f, 0.56f, -0.5f, 0.56f, -0.9f);
        pathBuilder.verticalLineToRelative(-3.1f);
        pathBuilder.curveToRelative(1.45f, -0.48f, 3.0f, -0.73f, 4.6f, -0.73f);
        pathBuilder.reflectiveCurveToRelative(3.15f, 0.25f, 4.6f, 0.72f);
        pathBuilder.verticalLineToRelative(3.1f);
        pathBuilder.curveToRelative(0.0f, 0.39f, 0.23f, 0.74f, 0.56f, 0.9f);
        pathBuilder.curveToRelative(0.98f, 0.49f, 1.87f, 1.12f, 2.67f, 1.85f);
        pathBuilder.curveToRelative(0.18f, 0.18f, 0.43f, 0.28f, 0.7f, 0.28f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f);
        pathBuilder.lineToRelative(2.48f, -2.48f);
        pathBuilder.curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.12f, -0.52f, -0.3f, -0.7f);
        pathBuilder.close();
        pathBuilder.moveTo(5.4f, 17.23f);
        pathBuilder.curveToRelative(-0.66f, 0.37f, -1.29f, 0.8f, -1.87f, 1.27f);
        pathBuilder.lineToRelative(-1.07f, -1.07f);
        pathBuilder.curveToRelative(0.91f, -0.75f, 1.9f, -1.39f, 2.95f, -1.9f);
        pathBuilder.verticalLineToRelative(1.7f);
        pathBuilder.close();
        pathBuilder.moveTo(20.48f, 18.49f);
        pathBuilder.curveToRelative(-0.6f, -0.48f, -1.22f, -0.9f, -1.88f, -1.27f);
        pathBuilder.verticalLineToRelative(-1.7f);
        pathBuilder.curveToRelative(1.05f, 0.51f, 2.03f, 1.15f, 2.95f, 1.9f);
        pathBuilder.lineToRelative(-1.07f, 1.07f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 6.43f);
        pathBuilder.lineToRelative(4.94f, 4.94f);
        pathBuilder.lineToRelative(7.07f, -7.07f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.lineTo(8.4f, 5.0f);
        pathBuilder.lineTo(11.0f, 5.0f);
        pathBuilder.lineTo(11.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneMissed = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
