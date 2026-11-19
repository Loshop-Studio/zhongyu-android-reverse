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
public final class HandshakeKt {
    private static ImageVector _handshake;

    public static final ImageVector getHandshake(Icons.Sharp sharp) {
        ImageVector imageVector = _handshake;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Handshake", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.59f, 5.95f);
        pathBuilder.lineToRelative(-7.05f, 7.04f);
        pathBuilder.lineTo(0.7f, 10.3f);
        pathBuilder.lineToRelative(8.55f, -8.55f);
        pathBuilder.lineToRelative(7.95f, 7.95f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.lineTo(10.59f, 5.95f);
        pathBuilder.close();
        pathBuilder.moveTo(23.24f, 10.24f);
        pathBuilder.lineToRelative(-8.49f, -8.49f);
        pathBuilder.lineToRelative(-2.06f, 2.06f);
        pathBuilder.lineToRelative(5.9f, 5.88f);
        pathBuilder.lineToRelative(-2.83f, 2.83f);
        pathBuilder.lineToRelative(-5.17f, -5.17f);
        pathBuilder.lineToRelative(-6.27f, 6.27f);
        pathBuilder.lineToRelative(1.42f, 1.41f);
        pathBuilder.lineToRelative(5.32f, -5.32f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(-5.32f, 5.32f);
        pathBuilder.lineToRelative(1.42f, 1.41f);
        pathBuilder.lineToRelative(5.32f, -5.32f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineToRelative(-5.32f, 5.32f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(5.32f, -5.32f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineTo(10.68f, 20.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(23.24f, 10.24f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handshake = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
