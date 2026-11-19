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
public final class KeyOffKt {
    private static ImageVector _keyOff;

    public static final ImageVector getKeyOff(Icons.Sharp sharp) {
        ImageVector imageVector = _keyOff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.KeyOff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.91f, 14.09f);
        pathBuilder.lineTo(17.0f, 14.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineToRelative(4.0f, -4.04f);
        pathBuilder.lineTo(21.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-8.17f);
        pathBuilder.lineTo(16.91f, 14.09f);
        pathBuilder.close();
        pathBuilder.moveTo(3.98f, 6.81f);
        pathBuilder.curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.15f, -1.2f, 5.18f, -2.99f);
        pathBuilder.lineToRelative(7.59f, 7.59f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(3.98f, 6.81f);
        pathBuilder.close();
        pathBuilder.moveTo(9.91f, 12.74f);
        pathBuilder.curveTo(9.58f, 14.03f, 8.4f, 15.0f, 7.0f, 15.0f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.4f, 0.97f, -2.58f, 2.26f, -2.91f);
        pathBuilder.lineTo(9.91f, 12.74f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _keyOff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
