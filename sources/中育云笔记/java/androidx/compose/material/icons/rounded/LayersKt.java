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
public final class LayersKt {
    private static ImageVector _layers;

    public static final ImageVector getLayers(Icons.Rounded rounded) {
        ImageVector imageVector = _layers;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Layers", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.6f, 18.06f);
        pathBuilder.curveToRelative(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0.0f);
        pathBuilder.lineToRelative(-6.15f, -4.78f);
        pathBuilder.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        pathBuilder.curveToRelative(-0.51f, 0.4f, -0.51f, 1.17f, 0.0f, 1.57f);
        pathBuilder.lineToRelative(6.76f, 5.26f);
        pathBuilder.curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        pathBuilder.lineToRelative(6.76f, -5.26f);
        pathBuilder.curveToRelative(0.51f, -0.4f, 0.51f, -1.17f, 0.0f, -1.57f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        pathBuilder.lineToRelative(-6.15f, 4.79f);
        pathBuilder.close();
        pathBuilder.moveTo(13.23f, 15.04f);
        pathBuilder.lineToRelative(6.76f, -5.26f);
        pathBuilder.curveToRelative(0.51f, -0.4f, 0.51f, -1.18f, 0.0f, -1.58f);
        pathBuilder.lineToRelative(-6.76f, -5.26f);
        pathBuilder.curveToRelative(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0.0f);
        pathBuilder.lineTo(4.01f, 8.21f);
        pathBuilder.curveToRelative(-0.51f, 0.4f, -0.51f, 1.18f, 0.0f, 1.58f);
        pathBuilder.lineToRelative(6.76f, 5.26f);
        pathBuilder.curveToRelative(0.72f, 0.56f, 1.74f, 0.56f, 2.46f, -0.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layers = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
