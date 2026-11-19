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
public final class TramKt {
    private static ImageVector _tram;

    public static final ImageVector getTram(Icons.Rounded rounded) {
        ImageVector imageVector = _tram;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Tram", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 5.0f);
        pathBuilder.lineToRelative(0.75f, -1.5f);
        pathBuilder.lineTo(17.0f, 3.5f);
        pathBuilder.lineTo(17.0f, 2.0f);
        pathBuilder.lineTo(7.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.lineTo(11.0f, 5.0f);
        pathBuilder.curveToRelative(-3.13f, 0.09f, -6.0f, 0.73f, -6.0f, 3.5f);
        pathBuilder.lineTo(5.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 1.5f, 1.11f, 2.73f, 2.55f, 2.95f);
        pathBuilder.lineToRelative(-1.19f, 1.19f);
        pathBuilder.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        pathBuilder.lineTo(7.8f, 22.0f);
        pathBuilder.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        pathBuilder.lineTo(10.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(1.85f, 1.85f);
        pathBuilder.curveToRelative(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f);
        pathBuilder.horizontalLineToRelative(1.09f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineToRelative(-1.19f, -1.19f);
        pathBuilder.curveTo(17.89f, 19.73f, 19.0f, 18.5f, 19.0f, 17.0f);
        pathBuilder.lineTo(19.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, -2.77f, -2.87f, -3.41f, -6.0f, -3.5f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.5f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 14.0f);
        pathBuilder.lineTo(7.0f, 14.0f);
        pathBuilder.lineTo(7.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tram = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
