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
public final class LeakRemoveKt {
    private static ImageVector _leakRemove;

    public static final ImageVector getLeakRemove(Icons.Sharp sharp) {
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LeakRemove", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, 1.35f, -0.31f, 2.63f, -0.84f, 3.77f);
        pathBuilder.lineToRelative(1.49f, 1.49f);
        pathBuilder.curveTo(13.51f, 6.7f, 14.0f, 4.91f, 14.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-1.91f, 0.0f, -3.7f, 0.49f, -5.27f, 1.35f);
        pathBuilder.lineToRelative(1.49f, 1.49f);
        pathBuilder.curveToRelative(1.15f, -0.53f, 2.43f, -0.84f, 3.78f, -0.84f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.79f, 0.0f, -1.54f, 0.13f, -2.24f, 0.37f);
        pathBuilder.lineToRelative(1.68f, 1.68f);
        pathBuilder.curveToRelative(0.19f, -0.01f, 0.37f, -0.05f, 0.56f, -0.05f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 3.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 0.19f, -0.04f, 0.37f, -0.06f, 0.56f);
        pathBuilder.lineToRelative(1.68f, 1.68f);
        pathBuilder.curveToRelative(0.25f, -0.7f, 0.38f, -1.46f, 0.38f, -2.24f);
        pathBuilder.close();
        pathBuilder.moveTo(4.41f, 2.86f);
        pathBuilder.lineTo(3.0f, 4.27f);
        pathBuilder.lineToRelative(2.84f, 2.84f);
        pathBuilder.curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f);
        pathBuilder.lineTo(8.7f, 9.97f);
        pathBuilder.curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(2.72f, 0.0f, 5.2f, -0.99f, 7.11f, -2.62f);
        pathBuilder.lineToRelative(2.51f, 2.51f);
        pathBuilder.curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.7f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f);
        pathBuilder.lineTo(19.73f, 21.0f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(4.41f, 2.86f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakRemove = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
