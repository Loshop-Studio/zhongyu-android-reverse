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
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.TwoTone twoTone) {
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LayersClear", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 13.47f);
        pathBuilder.lineToRelative(0.67f, -0.53f);
        pathBuilder.lineToRelative(-5.02f, -5.02f);
        pathBuilder.lineTo(6.26f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.53f);
        pathBuilder.lineToRelative(-1.17f, 0.91f);
        pathBuilder.lineToRelative(5.02f, 5.03f);
        pathBuilder.lineTo(17.74f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 4.53f);
        pathBuilder2.lineTo(17.74f, 9.0f);
        pathBuilder2.lineToRelative(-1.89f, 1.47f);
        pathBuilder2.lineToRelative(1.43f, 1.42f);
        pathBuilder2.lineTo(21.0f, 9.0f);
        pathBuilder2.lineToRelative(-9.0f, -7.0f);
        pathBuilder2.lineToRelative(-2.59f, 2.02f);
        pathBuilder2.lineToRelative(1.42f, 1.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.0f, 14.07f);
        pathBuilder2.lineToRelative(-1.63f, -1.27f);
        pathBuilder2.lineToRelative(-0.67f, 0.52f);
        pathBuilder2.lineToRelative(1.43f, 1.43f);
        pathBuilder2.close();
        pathBuilder2.moveTo(3.41f, 0.86f);
        pathBuilder2.lineTo(2.0f, 2.27f);
        pathBuilder2.lineToRelative(4.22f, 4.22f);
        pathBuilder2.lineTo(3.0f, 9.0f);
        pathBuilder2.lineToRelative(9.0f, 7.0f);
        pathBuilder2.lineToRelative(2.1f, -1.63f);
        pathBuilder2.lineToRelative(1.42f, 1.42f);
        pathBuilder2.lineToRelative(-3.53f, 2.75f);
        pathBuilder2.lineToRelative(-7.37f, -5.73f);
        pathBuilder2.lineTo(3.0f, 14.07f);
        pathBuilder2.lineToRelative(9.0f, 7.0f);
        pathBuilder2.lineToRelative(4.95f, -3.85f);
        pathBuilder2.lineTo(20.73f, 21.0f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineTo(3.41f, 0.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 13.47f);
        pathBuilder2.lineTo(6.26f, 9.0f);
        pathBuilder2.lineToRelative(1.39f, -1.08f);
        pathBuilder2.lineToRelative(5.02f, 5.02f);
        pathBuilder2.lineToRelative(-0.67f, 0.53f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
