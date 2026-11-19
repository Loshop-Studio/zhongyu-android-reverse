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
public final class ScreenRotationKt {
    private static ImageVector _screenRotation;

    public static final ImageVector getScreenRotation(Icons.Sharp sharp) {
        ImageVector imageVector = _screenRotation;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScreenRotation", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.48f, 2.52f);
        pathBuilder.curveToRelative(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveTo(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f);
        pathBuilder.lineToRelative(-0.66f, 0.03f);
        pathBuilder.lineToRelative(3.81f, 3.81f);
        pathBuilder.lineToRelative(1.33f, -1.32f);
        pathBuilder.close();
        pathBuilder.moveTo(7.52f, 21.48f);
        pathBuilder.curveTo(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
        pathBuilder.lineTo(0.05f, 13.0f);
        pathBuilder.curveTo(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
        pathBuilder.lineToRelative(0.66f, -0.03f);
        pathBuilder.lineToRelative(-3.81f, -3.81f);
        pathBuilder.lineToRelative(-1.33f, 1.32f);
        pathBuilder.close();
        pathBuilder.moveTo(9.17f, 0.69f);
        pathBuilder.lineTo(0.69f, 9.17f);
        pathBuilder.lineToRelative(14.14f, 14.14f);
        pathBuilder.lineToRelative(8.48f, -8.48f);
        pathBuilder.lineTo(9.17f, 0.69f);
        pathBuilder.close();
        pathBuilder.moveTo(14.83f, 21.19f);
        pathBuilder.lineTo(2.81f, 9.17f);
        pathBuilder.lineToRelative(6.36f, -6.36f);
        pathBuilder.lineToRelative(12.02f, 12.02f);
        pathBuilder.lineToRelative(-6.36f, 6.36f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenRotation = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
