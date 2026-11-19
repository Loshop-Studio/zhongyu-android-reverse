package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getEnergySavingsLeaf(Icons.Sharp sharp) {
        ImageVector imageVector = _energySavingsLeaf;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EnergySavingsLeaf", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(-4.8f, 0.0f, -9.0f, 3.86f, -9.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 2.12f, 0.74f, 4.07f, 1.97f, 5.61f);
        pathBuilder.lineTo(3.0f, 19.59f);
        pathBuilder.lineTo(4.41f, 21.0f);
        pathBuilder.lineToRelative(1.97f, -1.97f);
        pathBuilder.curveTo(7.93f, 20.26f, 9.88f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(2.3f, 0.0f, 4.61f, -0.88f, 6.36f, -2.64f);
        pathBuilder.curveTo(20.12f, 16.61f, 21.0f, 14.3f, 21.0f, 12.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 17.0f);
        pathBuilder.lineTo(10.0f, 16.5f);
        pathBuilder.lineToRelative(2.5f, -3.5f);
        pathBuilder.lineToRelative(-5.0f, -0.5f);
        pathBuilder.lineToRelative(6.0f, -5.5f);
        pathBuilder.lineTo(14.0f, 7.5f);
        pathBuilder.lineTo(11.5f, 11.0f);
        pathBuilder.lineToRelative(5.0f, 0.5f);
        pathBuilder.lineTo(10.5f, 17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _energySavingsLeaf = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
