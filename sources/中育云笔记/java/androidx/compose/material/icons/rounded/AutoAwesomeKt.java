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
public final class AutoAwesomeKt {
    private static ImageVector _autoAwesome;

    public static final ImageVector getAutoAwesome(Icons.Rounded rounded) {
        ImageVector imageVector = _autoAwesome;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AutoAwesome", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.46f, 8.0f);
        pathBuilder.lineToRelative(0.79f, -1.75f);
        pathBuilder.lineTo(22.0f, 5.46f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(-1.75f, -0.79f);
        pathBuilder.lineTo(19.46f, 2.0f);
        pathBuilder.curveToRelative(-0.18f, -0.39f, -0.73f, -0.39f, -0.91f, 0.0f);
        pathBuilder.lineToRelative(-0.79f, 1.75f);
        pathBuilder.lineTo(16.0f, 4.54f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(1.75f, 0.79f);
        pathBuilder.lineTo(18.54f, 8.0f);
        pathBuilder.curveTo(18.72f, 8.39f, 19.28f, 8.39f, 19.46f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.5f, 9.5f);
        pathBuilder.lineTo(9.91f, 6.0f);
        pathBuilder.curveTo(9.56f, 5.22f, 8.44f, 5.22f, 8.09f, 6.0f);
        pathBuilder.lineTo(6.5f, 9.5f);
        pathBuilder.lineTo(3.0f, 11.09f);
        pathBuilder.curveToRelative(-0.78f, 0.36f, -0.78f, 1.47f, 0.0f, 1.82f);
        pathBuilder.lineToRelative(3.5f, 1.59f);
        pathBuilder.lineTo(8.09f, 18.0f);
        pathBuilder.curveToRelative(0.36f, 0.78f, 1.47f, 0.78f, 1.82f, 0.0f);
        pathBuilder.lineToRelative(1.59f, -3.5f);
        pathBuilder.lineToRelative(3.5f, -1.59f);
        pathBuilder.curveToRelative(0.78f, -0.36f, 0.78f, -1.47f, 0.0f, -1.82f);
        pathBuilder.lineTo(11.5f, 9.5f);
        pathBuilder.close();
        pathBuilder.moveTo(18.54f, 16.0f);
        pathBuilder.lineToRelative(-0.79f, 1.75f);
        pathBuilder.lineTo(16.0f, 18.54f);
        pathBuilder.curveToRelative(-0.39f, 0.18f, -0.39f, 0.73f, 0.0f, 0.91f);
        pathBuilder.lineToRelative(1.75f, 0.79f);
        pathBuilder.lineTo(18.54f, 22.0f);
        pathBuilder.curveToRelative(0.18f, 0.39f, 0.73f, 0.39f, 0.91f, 0.0f);
        pathBuilder.lineToRelative(0.79f, -1.75f);
        pathBuilder.lineTo(22.0f, 19.46f);
        pathBuilder.curveToRelative(0.39f, -0.18f, 0.39f, -0.73f, 0.0f, -0.91f);
        pathBuilder.lineToRelative(-1.75f, -0.79f);
        pathBuilder.lineTo(19.46f, 16.0f);
        pathBuilder.curveTo(19.28f, 15.61f, 18.72f, 15.61f, 18.54f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _autoAwesome = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
