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
public final class IceSkatingKt {
    private static ImageVector _iceSkating;

    public static final ImageVector getIceSkating(Icons.Rounded rounded) {
        ImageVector imageVector = _iceSkating;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.IceSkating", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.87f, 17.0f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.85f, 0.34f, -0.98f, 0.8f);
        pathBuilder.curveTo(20.54f, 19.07f, 19.38f, 20.0f, 18.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineToRelative(0.0f, -0.88f);
        pathBuilder.curveToRelative(0.0f, -2.1f, -1.55f, -3.53f, -3.03f, -3.88f);
        pathBuilder.lineToRelative(-2.7f, -0.67f);
        pathBuilder.curveTo(12.4f, 10.35f, 11.7f, 9.76f, 11.32f, 9.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(8.22f, 9.0f, 8.0f, 8.78f, 8.0f, 8.5f);
        pathBuilder.reflectiveCurveTo(8.22f, 8.0f, 8.5f, 8.0f);
        pathBuilder.horizontalLineToRelative(2.52f);
        pathBuilder.lineTo(11.0f, 7.0f);
        pathBuilder.horizontalLineTo(8.5f);
        pathBuilder.curveTo(8.22f, 7.0f, 8.0f, 6.78f, 8.0f, 6.5f);
        pathBuilder.curveTo(8.0f, 6.22f, 8.22f, 6.0f, 8.5f, 6.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.curveToRelative(2.33f, 0.0f, 4.29f, -1.6f, 4.84f, -3.75f);
        pathBuilder.curveTo(23.01f, 17.62f, 22.52f, 17.0f, 21.87f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 20.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iceSkating = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
