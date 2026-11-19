package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getLayersClear(Icons.Sharp sharp) {
        ImageVector imageVector = _layersClear;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LayersClear", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 9.0f);
        pathBuilder.lineToRelative(-9.0f, -7.0f);
        pathBuilder.lineToRelative(-2.59f, 2.02f);
        pathBuilder.lineToRelative(7.87f, 7.87f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 14.07f);
        pathBuilder.lineToRelative(-1.63f, -1.27f);
        pathBuilder.lineToRelative(-0.67f, 0.52f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.close();
        pathBuilder.moveTo(3.41f, 0.86f);
        pathBuilder.lineTo(2.0f, 2.27f);
        pathBuilder.lineToRelative(4.22f, 4.22f);
        pathBuilder.lineTo(3.0f, 9.0f);
        pathBuilder.lineToRelative(9.0f, 7.0f);
        pathBuilder.lineToRelative(2.1f, -1.63f);
        pathBuilder.lineToRelative(1.42f, 1.42f);
        pathBuilder.lineToRelative(-3.53f, 2.75f);
        pathBuilder.lineToRelative(-7.37f, -5.73f);
        pathBuilder.lineTo(3.0f, 14.07f);
        pathBuilder.lineToRelative(9.0f, 7.0f);
        pathBuilder.lineToRelative(4.95f, -3.85f);
        pathBuilder.lineTo(20.73f, 21.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _layersClear = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
