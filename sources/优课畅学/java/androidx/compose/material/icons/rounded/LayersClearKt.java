package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class LayersClearKt {
    private static ImageVector _layersClear;

    public static final ImageVector getLayersClear(Icons.Rounded rounded) {
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LayersClear", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.99f, 9.79f);
        pathBuilder.curveToRelative(0.51f, -0.4f, 0.51f, -1.18f, 0.0f, -1.58f);
        pathBuilder.lineToRelative(-6.76f, -5.26f);
        pathBuilder.curveToRelative(-0.72f, -0.56f, -1.73f, -0.56f, -2.46f, 0.0f);
        pathBuilder.lineTo(9.41f, 4.02f);
        pathBuilder.lineToRelative(7.88f, 7.88f);
        pathBuilder.lineToRelative(2.7f, -2.11f);
        pathBuilder.close();
        pathBuilder.moveTo(19.99f, 13.28f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        pathBuilder.lineToRelative(-0.05f, 0.04f);
        pathBuilder.lineToRelative(1.4f, 1.4f);
        pathBuilder.curveToRelative(0.37f, -0.41f, 0.34f, -1.07f, -0.12f, -1.43f);
        pathBuilder.close();
        pathBuilder.moveTo(21.44f, 18.88f);
        pathBuilder.lineTo(4.12f, 1.56f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(3.52f, 3.52f);
        pathBuilder.lineToRelative(-2.22f, 1.72f);
        pathBuilder.curveToRelative(-0.51f, 0.4f, -0.51f, 1.18f, 0.0f, 1.58f);
        pathBuilder.lineToRelative(6.76f, 5.26f);
        pathBuilder.curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        pathBuilder.lineToRelative(0.87f, -0.68f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(-2.92f, 2.27f);
        pathBuilder.curveToRelative(-0.36f, 0.28f, -0.87f, 0.28f, -1.23f, 0.0f);
        pathBuilder.lineToRelative(-6.15f, -4.78f);
        pathBuilder.curveToRelative(-0.36f, -0.28f, -0.86f, -0.28f, -1.22f, 0.0f);
        pathBuilder.curveToRelative(-0.51f, 0.4f, -0.51f, 1.17f, 0.0f, 1.57f);
        pathBuilder.lineToRelative(6.76f, 5.26f);
        pathBuilder.curveToRelative(0.72f, 0.56f, 1.73f, 0.56f, 2.46f, 0.0f);
        pathBuilder.lineToRelative(3.72f, -2.89f);
        pathBuilder.lineToRelative(3.07f, 3.07f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.41f, -0.39f, 0.41f, -1.02f, 0.02f, -1.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
