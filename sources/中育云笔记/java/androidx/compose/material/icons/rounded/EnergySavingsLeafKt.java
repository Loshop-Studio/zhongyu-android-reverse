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
public final class EnergySavingsLeafKt {
    private static ImageVector _energySavingsLeaf;

    public static final ImageVector getEnergySavingsLeaf(Icons.Rounded rounded) {
        ImageVector imageVector = _energySavingsLeaf;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EnergySavingsLeaf", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f);
        pathBuilder.lineToRelative(-1.68f, 1.68f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(1.68f, -1.68f);
        pathBuilder.curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        pathBuilder.curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.83f, 12.26f);
        pathBuilder.lineToRelative(-5.16f, 4.63f);
        pathBuilder.curveToRelative(-0.16f, 0.15f, -0.41f, 0.14f, -0.56f, -0.01f);
        pathBuilder.curveToRelative(-0.14f, -0.14f, -0.16f, -0.36f, -0.04f, -0.52f);
        pathBuilder.lineToRelative(2.44f, -3.33f);
        pathBuilder.lineToRelative(-4.05f, -0.4f);
        pathBuilder.curveToRelative(-0.44f, -0.04f, -0.63f, -0.59f, -0.3f, -0.89f);
        pathBuilder.lineToRelative(5.16f, -4.63f);
        pathBuilder.curveToRelative(0.16f, -0.15f, 0.41f, -0.14f, 0.56f, 0.01f);
        pathBuilder.curveToRelative(0.14f, 0.14f, 0.16f, 0.36f, 0.04f, 0.52f);
        pathBuilder.lineToRelative(-2.44f, 3.33f);
        pathBuilder.lineToRelative(4.05f, 0.4f);
        pathBuilder.curveTo(15.98f, 11.41f, 16.16f, 11.96f, 15.83f, 12.26f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _energySavingsLeaf = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
