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
public final class PolylineKt {
    private static ImageVector _polyline;

    public static final ImageVector getPolyline(Icons.Rounded rounded) {
        ImageVector imageVector = _polyline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Polyline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.04f, 6.85f);
        pathBuilder.lineTo(7.3f, 10.0f);
        pathBuilder.horizontalLineTo(4.5f);
        pathBuilder.curveTo(3.67f, 10.0f, 3.0f, 10.67f, 3.0f, 11.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(3.0f, 15.33f, 3.67f, 16.0f, 4.5f, 16.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.14f, 0.0f, 0.27f, -0.02f, 0.39f, -0.05f);
        pathBuilder.lineTo(15.0f, 19.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.75f, 0.0f, -1.37f, 0.55f, -1.48f, 1.27f);
        pathBuilder.lineTo(9.0f, 14.26f);
        pathBuilder.verticalLineTo(11.5f);
        pathBuilder.curveToRelative(0.0f, -0.12f, -0.01f, -0.24f, -0.04f, -0.36f);
        pathBuilder.lineTo(11.7f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.8f);
        pathBuilder.curveTo(15.33f, 8.0f, 16.0f, 7.33f, 16.0f, 6.5f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveTo(16.0f, 2.67f, 15.33f, 2.0f, 14.5f, 2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveTo(10.67f, 2.0f, 10.0f, 2.67f, 10.0f, 3.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveTo(10.0f, 6.62f, 10.01f, 6.74f, 10.04f, 6.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _polyline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
