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
public final class NearbyOffKt {
    private static ImageVector _nearbyOff;

    public static final ImageVector getNearbyOff(Icons.Sharp sharp) {
        ImageVector imageVector = _nearbyOff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NearbyOff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.82f, 12.01f);
        pathBuilder.lineTo(18.83f, 16.0f);
        pathBuilder.lineToRelative(-1.81f, -1.81f);
        pathBuilder.lineTo(19.2f, 12.0f);
        pathBuilder.lineTo(12.0f, 4.8f);
        pathBuilder.lineTo(9.81f, 6.99f);
        pathBuilder.lineTo(8.0f, 5.17f);
        pathBuilder.lineToRelative(3.99f, -3.99f);
        pathBuilder.lineTo(22.82f, 12.01f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(16.0f, 18.83f);
        pathBuilder.lineToRelative(-3.99f, 3.99f);
        pathBuilder.lineTo(1.18f, 11.99f);
        pathBuilder.lineTo(5.17f, 8.0f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(2.8f, 2.81f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        pathBuilder.moveTo(14.19f, 17.02f);
        pathBuilder.lineToRelative(-1.39f, -1.39f);
        pathBuilder.lineToRelative(-0.8f, 0.8f);
        pathBuilder.lineTo(7.58f, 12.0f);
        pathBuilder.lineToRelative(0.8f, -0.8f);
        pathBuilder.lineToRelative(-1.4f, -1.39f);
        pathBuilder.lineTo(4.8f, 12.0f);
        pathBuilder.lineToRelative(7.2f, 7.2f);
        pathBuilder.lineTo(14.19f, 17.02f);
        pathBuilder.close();
        pathBuilder.moveTo(16.42f, 12.0f);
        pathBuilder.lineTo(12.0f, 7.58f);
        pathBuilder.lineToRelative(-0.8f, 0.8f);
        pathBuilder.lineToRelative(4.42f, 4.42f);
        pathBuilder.lineTo(16.42f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyOff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
