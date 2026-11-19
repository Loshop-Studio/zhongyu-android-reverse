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
public final class LocalDrinkKt {
    private static ImageVector _localDrink;

    public static final ImageVector getLocalDrink(Icons.Rounded rounded) {
        ImageVector imageVector = _localDrink;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalDrink", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.23f, 2.0f);
        pathBuilder.curveTo(4.04f, 2.0f, 3.11f, 3.04f, 3.24f, 4.22f);
        pathBuilder.lineToRelative(1.77f, 16.01f);
        pathBuilder.curveTo(5.13f, 21.23f, 5.97f, 22.0f, 7.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(1.03f, 0.0f, 1.87f, -0.77f, 1.99f, -1.77f);
        pathBuilder.lineToRelative(1.77f, -16.01f);
        pathBuilder.curveToRelative(0.13f, -1.18f, -0.8f, -2.22f, -1.99f, -2.22f);
        pathBuilder.lineTo(5.23f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.55f, 1.81f, -3.95f, 2.62f, -4.94f);
        pathBuilder.curveToRelative(0.2f, -0.25f, 0.57f, -0.25f, 0.77f, 0.0f);
        pathBuilder.curveToRelative(0.81f, 1.0f, 2.62f, 3.39f, 2.62f, 4.94f);
        pathBuilder.curveToRelative(-0.01f, 1.66f, -1.35f, 3.0f, -3.01f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.33f, 8.0f);
        pathBuilder.lineTo(5.67f, 8.0f);
        pathBuilder.lineToRelative(-0.32f, -2.89f);
        pathBuilder.curveToRelative(-0.06f, -0.59f, 0.4f, -1.11f, 1.0f, -1.11f);
        pathBuilder.horizontalLineToRelative(11.3f);
        pathBuilder.curveToRelative(0.59f, 0.0f, 1.06f, 0.52f, 0.99f, 1.11f);
        pathBuilder.lineTo(18.33f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localDrink = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
