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
public final class DangerousKt {
    private static ImageVector _dangerous;

    public static final ImageVector getDangerous(Icons.Rounded rounded) {
        ImageVector imageVector = _dangerous;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Dangerous", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.9f, 3.0f);
        pathBuilder.horizontalLineTo(9.1f);
        pathBuilder.curveTo(8.57f, 3.0f, 8.06f, 3.21f, 7.68f, 3.59f);
        pathBuilder.lineToRelative(-4.1f, 4.1f);
        pathBuilder.curveTo(3.21f, 8.06f, 3.0f, 8.57f, 3.0f, 9.1f);
        pathBuilder.verticalLineToRelative(5.8f);
        pathBuilder.curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        pathBuilder.lineToRelative(4.1f, 4.1f);
        pathBuilder.curveTo(8.06f, 20.79f, 8.57f, 21.0f, 9.1f, 21.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        pathBuilder.lineToRelative(4.1f, -4.1f);
        pathBuilder.curveTo(20.79f, 15.94f, 21.0f, 15.43f, 21.0f, 14.9f);
        pathBuilder.verticalLineTo(9.1f);
        pathBuilder.curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f);
        pathBuilder.lineToRelative(-4.1f, -4.1f);
        pathBuilder.curveTo(15.94f, 3.21f, 15.43f, 3.0f, 14.9f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.54f, 15.54f);
        pathBuilder.lineTo(15.54f, 15.54f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(12.0f, 13.41f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineTo(10.59f, 12.0f);
        pathBuilder.lineTo(8.46f, 9.88f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineTo(12.0f, 10.59f);
        pathBuilder.lineToRelative(2.12f, -2.12f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(13.41f, 12.0f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.curveTo(15.93f, 14.51f, 15.93f, 15.15f, 15.54f, 15.54f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dangerous = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
