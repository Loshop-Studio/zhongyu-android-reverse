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
public final class DesignServicesKt {
    private static ImageVector _designServices;

    public static final ImageVector getDesignServices(Icons.Sharp sharp) {
        ImageVector imageVector = _designServices;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DesignServices", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.79f, 17.06f);
        pathBuilder.lineToRelative(-5.55f, -5.55f);
        pathBuilder.lineToRelative(1.57f, -1.57f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineToRelative(-1.57f, 1.57f);
        pathBuilder.lineTo(6.94f, 2.21f);
        pathBuilder.lineTo(2.21f, 6.94f);
        pathBuilder.lineToRelative(5.55f, 5.55f);
        pathBuilder.lineTo(3.0f, 17.25f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(3.75f);
        pathBuilder.lineToRelative(4.76f, -4.76f);
        pathBuilder.lineToRelative(5.55f, 5.55f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineTo(21.79f, 17.06f);
        pathBuilder.close();
        pathBuilder.moveTo(9.18f, 11.07f);
        pathBuilder.lineTo(5.04f, 6.94f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.lineTo(7.02f, 7.5f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.19f, -1.19f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.lineTo(9.18f, 11.07f);
        pathBuilder.close();
        pathBuilder.moveTo(12.93f, 14.82f);
        pathBuilder.lineToRelative(1.9f, -1.9f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.lineToRelative(-1.19f, 1.19f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.19f, -1.19f);
        pathBuilder.lineToRelative(1.27f, 1.27f);
        pathBuilder.lineToRelative(-1.9f, 1.9f);
        pathBuilder.lineTo(12.93f, 14.82f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.133f, 5.123f);
        pathBuilder2.lineToRelative(2.538f, -2.538f);
        pathBuilder2.lineToRelative(3.748f, 3.748f);
        pathBuilder2.lineToRelative(-2.538f, 2.538f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _designServices = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
