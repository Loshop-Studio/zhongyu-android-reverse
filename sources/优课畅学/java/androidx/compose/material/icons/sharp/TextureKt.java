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
public final class TextureKt {
    private static ImageVector _texture;

    public static final ImageVector getTexture(Icons.Sharp sharp) {
        ImageVector imageVector = _texture;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Texture", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.66f, 3.0f);
        pathBuilder.lineTo(3.07f, 19.59f);
        pathBuilder.lineTo(3.07f, 21.0f);
        pathBuilder.horizontalLineToRelative(1.41f);
        pathBuilder.lineTo(21.07f, 4.42f);
        pathBuilder.lineTo(21.07f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.95f, 3.0f);
        pathBuilder.lineToRelative(-8.88f, 8.88f);
        pathBuilder.verticalLineToRelative(2.83f);
        pathBuilder.lineTo(14.78f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.07f, 3.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.07f, 21.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.19f, 21.0f);
        pathBuilder.lineToRelative(8.88f, -8.88f);
        pathBuilder.lineTo(21.07f, 9.29f);
        pathBuilder.lineTo(9.36f, 21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _texture = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
