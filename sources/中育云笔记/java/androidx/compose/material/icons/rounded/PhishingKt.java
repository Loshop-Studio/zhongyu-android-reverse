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
public final class PhishingKt {
    private static ImageVector _phishing;

    public static final ImageVector getPhishing(Icons.Rounded rounded) {
        ImageVector imageVector = _phishing;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Phishing", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -1.3f, -0.84f, -2.4f, -2.0f, -2.82f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.18f);
        pathBuilder.curveTo(13.84f, 6.6f, 13.0f, 7.7f, 13.0f, 9.0f);
        pathBuilder.reflectiveCurveToRelative(0.84f, 2.4f, 2.0f, 2.82f);
        pathBuilder.lineToRelative(0.0f, 3.01f);
        pathBuilder.curveToRelative(0.0f, 2.09f, -1.52f, 3.96f, -3.6f, 4.16f);
        pathBuilder.curveTo(9.02f, 19.21f, 7.0f, 17.34f, 7.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineTo(5.85f, 9.85f);
        pathBuilder.curveTo(5.54f, 9.54f, 5.0f, 9.76f, 5.0f, 10.21f);
        pathBuilder.lineToRelative(0.0f, 4.58f);
        pathBuilder.curveToRelative(0.0f, 3.05f, 2.19f, 5.77f, 5.21f, 6.16f);
        pathBuilder.curveTo(13.87f, 21.42f, 17.0f, 18.57f, 17.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-3.18f);
        pathBuilder.curveTo(18.16f, 11.4f, 19.0f, 10.3f, 19.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 10.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(16.55f, 10.0f, 16.0f, 10.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phishing = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
