package androidx.compose.material.icons.filled;

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
public final class TsunamiKt {
    private static ImageVector _tsunami;

    public static final ImageVector getTsunami(Icons.Filled filled) {
        ImageVector imageVector = _tsunami;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Tsunami", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.67f, 17.63f);
        pathBuilder.curveToRelative(-3.8f, 2.8f, -6.12f, 0.4f, -6.67f, 0.0f);
        pathBuilder.curveToRelative(-0.66f, 0.49f, -2.92f, 2.76f, -6.67f, 0.0f);
        pathBuilder.curveTo(3.43f, 19.03f, 2.65f, 19.0f, 2.0f, 19.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(1.16f, 0.0f, 2.3f, -0.32f, 3.33f, -0.93f);
        pathBuilder.curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f);
        pathBuilder.curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f);
        pathBuilder.curveTo(19.7f, 20.68f, 20.84f, 21.0f, 22.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveTo(21.34f, 19.0f, 20.5f, 18.98f, 18.67f, 17.63f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.33f, 12.0f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(-2.67f);
        pathBuilder2.curveTo(17.5f, 10.0f, 16.0f, 8.5f, 16.0f, 6.67f);
        pathBuilder2.curveToRelative(0.0f, -1.02f, 0.38f, -1.74f, 1.09f, -3.34f);
        pathBuilder2.curveTo(15.72f, 3.12f, 15.09f, 3.0f, 14.0f, 3.0f);
        pathBuilder2.curveTo(7.36f, 3.0f, 2.15f, 8.03f, 2.01f, 14.5f);
        pathBuilder2.curveToRelative(0.0f, 0.0f, -0.01f, 2.0f, -0.01f, 2.0f);
        pathBuilder2.curveToRelative(1.16f, 0.0f, 2.3f, -0.32f, 3.33f, -0.93f);
        pathBuilder2.curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f);
        pathBuilder2.curveToRelative(2.06f, 1.22f, 4.61f, 1.22f, 6.67f, 0.0f);
        pathBuilder2.curveToRelative(1.03f, 0.61f, 2.17f, 0.93f, 3.33f, 0.93f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(-0.66f, 0.0f, -1.5f, -0.02f, -3.33f, -1.37f);
        pathBuilder2.curveToRelative(-3.8f, 2.8f, -6.12f, 0.4f, -6.67f, 0.0f);
        pathBuilder2.curveToRelative(-0.9f, 0.67f, -0.54f, 0.41f, -0.91f, 0.63f);
        pathBuilder2.curveTo(10.39f, 12.82f, 10.0f, 11.7f, 10.0f, 10.5f);
        pathBuilder2.curveToRelative(0.0f, -2.58f, 1.77f, -4.74f, 4.21f, -5.33f);
        pathBuilder2.curveTo(14.08f, 5.68f, 14.0f, 6.19f, 14.0f, 6.67f);
        pathBuilder2.curveTo(14.0f, 9.61f, 16.39f, 12.0f, 19.33f, 12.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tsunami = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
