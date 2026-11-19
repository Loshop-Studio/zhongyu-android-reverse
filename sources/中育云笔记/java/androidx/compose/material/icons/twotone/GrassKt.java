package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class GrassKt {
    private static ImageVector _grass;

    public static final ImageVector getGrass(Icons.TwoTone twoTone) {
        ImageVector imageVector = _grass;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Grass", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(5.75f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(7.02f, 15.19f, 4.81f, 12.99f, 2.0f, 12.26f);
        pathBuilder.curveTo(2.64f, 12.1f, 3.31f, 12.0f, 4.0f, 12.0f);
        pathBuilder.curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.26f);
        pathBuilder.curveTo(21.36f, 12.1f, 20.69f, 12.0f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(-2.93f, 0.0f, -5.48f, 1.58f, -6.88f, 3.93f);
        pathBuilder.curveToRelative(0.29f, 0.66f, 0.53f, 1.35f, 0.67f, 2.07f);
        pathBuilder.curveToRelative(0.13f, 0.65f, 0.2f, 1.32f, 0.2f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-5.75f);
        pathBuilder.curveTo(16.98f, 15.19f, 19.19f, 12.99f, 22.0f, 12.26f);
        pathBuilder.close();
        pathBuilder.moveTo(15.64f, 11.02f);
        pathBuilder.curveToRelative(0.78f, -2.09f, 2.23f, -3.84f, 4.09f, -5.0f);
        pathBuilder.curveTo(15.44f, 6.16f, 12.0f, 9.67f, 12.0f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 0.01f, 0.0f, 0.02f, 0.0f, 0.02f);
        pathBuilder.curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.42f, 8.85f);
        pathBuilder.curveTo(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4.0f);
        pathBuilder.curveTo(8.14f, 5.86f, 9.0f, 8.18f, 9.0f, 10.71f);
        pathBuilder.curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f);
        pathBuilder.curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f);
        pathBuilder.curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grass = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
