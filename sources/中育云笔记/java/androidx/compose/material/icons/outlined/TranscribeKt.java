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
public final class TranscribeKt {
    private static ImageVector _transcribe;

    public static final ImageVector getTranscribe(Icons.Outlined outlined) {
        ImageVector imageVector = _transcribe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Transcribe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 13.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveTo(5.0f, 6.79f, 5.0f, 9.0f);
        pathBuilder.curveTo(5.0f, 11.21f, 6.79f, 13.0f, 9.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 7.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.curveTo(7.0f, 7.9f, 7.9f, 7.0f, 9.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.39f, 15.56f);
        pathBuilder.curveTo(13.71f, 14.7f, 11.53f, 14.0f, 9.0f, 14.0f);
        pathBuilder.curveToRelative(-2.53f, 0.0f, -4.71f, 0.7f, -6.39f, 1.56f);
        pathBuilder.curveTo(1.61f, 16.07f, 1.0f, 17.1f, 1.0f, 18.22f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(-2.78f);
        pathBuilder.curveTo(17.0f, 17.1f, 16.39f, 16.07f, 15.39f, 15.56f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 19.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(-0.78f);
        pathBuilder.curveToRelative(0.0f, -0.38f, 0.2f, -0.72f, 0.52f, -0.88f);
        pathBuilder.curveTo(4.71f, 16.73f, 6.63f, 16.0f, 9.0f, 16.0f);
        pathBuilder.curveToRelative(2.37f, 0.0f, 4.29f, 0.73f, 5.48f, 1.34f);
        pathBuilder.curveTo(14.8f, 17.5f, 15.0f, 17.84f, 15.0f, 18.22f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.93f, 16.0f);
        pathBuilder.lineToRelative(1.63f, -1.63f);
        pathBuilder.curveToRelative(-2.77f, -3.02f, -2.77f, -7.56f, 0.0f, -10.74f);
        pathBuilder.lineTo(17.93f, 2.0f);
        pathBuilder.curveTo(14.03f, 5.89f, 14.02f, 11.95f, 17.93f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.92f, 10.95f);
        pathBuilder.curveToRelative(-0.84f, -1.18f, -0.84f, -2.71f, 0.0f, -3.89f);
        pathBuilder.lineToRelative(-1.68f, -1.69f);
        pathBuilder.curveToRelative(-2.02f, 2.02f, -2.02f, 5.07f, 0.0f, 7.27f);
        pathBuilder.lineTo(22.92f, 10.95f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _transcribe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
