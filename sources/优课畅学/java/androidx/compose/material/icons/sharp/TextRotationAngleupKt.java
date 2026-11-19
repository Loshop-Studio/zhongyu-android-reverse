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
public final class TextRotationAngleupKt {
    private static ImageVector _textRotationAngleup;

    public static final ImageVector getTextRotationAngleup(Icons.Sharp sharp) {
        ImageVector imageVector = _textRotationAngleup;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.TextRotationAngleup", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.76f, 9.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(-9.19f, 9.19f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(9.19f, -9.19f);
        pathBuilder.lineTo(21.0f, 13.24f);
        pathBuilder.lineTo(21.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-4.24f);
        pathBuilder.close();
        pathBuilder.moveTo(8.48f, 12.75f);
        pathBuilder.lineToRelative(3.54f, -3.54f);
        pathBuilder.lineToRelative(2.19f, 0.92f);
        pathBuilder.lineToRelative(1.48f, -1.48f);
        pathBuilder.lineTo(4.56f, 4.23f);
        pathBuilder.lineTo(3.5f, 5.29f);
        pathBuilder.lineToRelative(4.42f, 11.14f);
        pathBuilder.lineToRelative(1.48f, -1.48f);
        pathBuilder.lineToRelative(-0.92f, -2.2f);
        pathBuilder.close();
        pathBuilder.moveTo(7.66f, 11.03f);
        pathBuilder.lineTo(5.43f, 6.16f);
        pathBuilder.lineToRelative(4.87f, 2.23f);
        pathBuilder.lineToRelative(-2.64f, 2.64f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textRotationAngleup = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
