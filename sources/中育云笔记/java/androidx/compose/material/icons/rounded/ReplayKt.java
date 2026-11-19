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
public final class ReplayKt {
    private static ImageVector _replay;

    public static final ImageVector getReplay(Icons.Rounded rounded) {
        ImageVector imageVector = _replay;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Replay", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.verticalLineTo(2.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-3.8f, 3.79f);
        pathBuilder.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        pathBuilder.lineToRelative(3.79f, 3.79f);
        pathBuilder.curveToRelative(0.32f, 0.31f, 0.86f, 0.09f, 0.86f, -0.36f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveToRelative(3.73f, 0.0f, 6.68f, 3.42f, 5.86f, 7.29f);
        pathBuilder.curveToRelative(-0.47f, 2.27f, -2.31f, 4.1f, -4.57f, 4.57f);
        pathBuilder.curveToRelative(-3.57f, 0.75f, -6.75f, -1.7f, -7.23f, -5.01f);
        pathBuilder.curveToRelative(-0.07f, -0.48f, -0.49f, -0.85f, -0.98f, -0.85f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.08f, 0.53f, -1.0f, 1.13f);
        pathBuilder.curveToRelative(0.62f, 4.39f, 4.8f, 7.64f, 9.53f, 6.72f);
        pathBuilder.curveToRelative(3.12f, -0.61f, 5.63f, -3.12f, 6.24f, -6.24f);
        pathBuilder.curveTo(20.84f, 9.48f, 16.94f, 5.0f, 12.0f, 5.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replay = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
