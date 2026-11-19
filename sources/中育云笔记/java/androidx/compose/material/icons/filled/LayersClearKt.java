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
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.Filled filled) {
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LayersClear", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.81f, 14.99f);
        pathBuilder.lineToRelative(1.19f, -0.92f);
        pathBuilder.lineToRelative(-1.43f, -1.43f);
        pathBuilder.lineToRelative(-1.19f, 0.92f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.close();
        pathBuilder.moveTo(19.36f, 10.27f);
        pathBuilder.lineTo(21.0f, 9.0f);
        pathBuilder.lineToRelative(-9.0f, -7.0f);
        pathBuilder.lineToRelative(-2.91f, 2.27f);
        pathBuilder.lineToRelative(7.87f, 7.88f);
        pathBuilder.lineToRelative(2.4f, -1.88f);
        pathBuilder.close();
        pathBuilder.moveTo(3.27f, 1.0f);
        pathBuilder.lineTo(2.0f, 2.27f);
        pathBuilder.lineToRelative(4.22f, 4.22f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.lineToRelative(1.63f, 1.27f);
        pathBuilder.lineTo(12.0f, 16.0f);
        pathBuilder.lineToRelative(2.1f, -1.63f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.lineTo(12.0f, 18.54f);
        pathBuilder.lineToRelative(-7.37f, -5.73f);
        pathBuilder.lineTo(3.0f, 14.07f);
        pathBuilder.lineToRelative(9.0f, 7.0f);
        pathBuilder.lineToRelative(4.95f, -3.85f);
        pathBuilder.lineTo(20.73f, 21.0f);
        pathBuilder.lineTo(22.0f, 19.73f);
        pathBuilder.lineTo(3.27f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
