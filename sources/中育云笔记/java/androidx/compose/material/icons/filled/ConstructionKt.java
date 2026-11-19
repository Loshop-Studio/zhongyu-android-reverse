package androidx.compose.material.icons.filled;

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
public final class ConstructionKt {
    private static ImageVector _construction;

    public static final ImageVector getConstruction(Icons.Filled filled) {
        ImageVector imageVector = _construction;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Construction", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.783f, 15.172f);
        pathBuilder.lineToRelative(2.121f, -2.121f);
        pathBuilder.lineToRelative(5.996f, 5.996f);
        pathBuilder.lineToRelative(-2.121f, 2.121f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.5f, 10.0f);
        pathBuilder2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder2.curveToRelative(0.0f, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f);
        pathBuilder2.lineToRelative(-2.7f, 2.7f);
        pathBuilder2.lineTo(16.4f, 6.11f);
        pathBuilder2.lineToRelative(2.7f, -2.7f);
        pathBuilder2.curveTo(18.62f, 3.16f, 18.08f, 3.0f, 17.5f, 3.0f);
        pathBuilder2.curveTo(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        pathBuilder2.curveToRelative(0.0f, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f);
        pathBuilder2.lineToRelative(-1.85f, 1.85f);
        pathBuilder2.lineToRelative(-1.78f, -1.78f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineTo(9.88f, 5.61f);
        pathBuilder2.lineTo(12.0f, 3.49f);
        pathBuilder2.curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f);
        pathBuilder2.lineTo(4.22f, 7.03f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.horizontalLineTo(2.81f);
        pathBuilder2.lineTo(2.1f, 9.15f);
        pathBuilder2.lineToRelative(3.54f, 3.54f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.verticalLineTo(9.15f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.lineToRelative(0.71f, -0.71f);
        pathBuilder2.lineToRelative(1.78f, 1.78f);
        pathBuilder2.lineToRelative(-7.41f, 7.41f);
        pathBuilder2.lineToRelative(2.12f, 2.12f);
        pathBuilder2.lineTo(16.34f, 9.79f);
        pathBuilder2.curveTo(16.7f, 9.92f, 17.09f, 10.0f, 17.5f, 10.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _construction = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
