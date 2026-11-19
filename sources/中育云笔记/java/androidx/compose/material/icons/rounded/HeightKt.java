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
public final class HeightKt {
    private static ImageVector _height;

    public static final ImageVector getHeight(Icons.Rounded rounded) {
        ImageVector imageVector = _height;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Height", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 6.99f);
        pathBuilder.horizontalLineToRelative(1.79f);
        pathBuilder.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        pathBuilder.lineToRelative(-2.79f, -2.78f);
        pathBuilder.curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.0f);
        pathBuilder.lineTo(8.86f, 6.14f);
        pathBuilder.curveTo(8.54f, 6.45f, 8.76f, 6.99f, 9.21f, 6.99f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(10.02f);
        pathBuilder.horizontalLineTo(9.21f);
        pathBuilder.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        pathBuilder.lineToRelative(2.79f, 2.78f);
        pathBuilder.curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0.0f);
        pathBuilder.lineToRelative(2.79f, -2.78f);
        pathBuilder.curveToRelative(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineTo(6.99f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _height = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
