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
public final class HandymanKt {
    private static ImageVector _handyman;

    public static final ImageVector getHandyman(Icons.Filled filled) {
        ImageVector imageVector = _handyman;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Handyman", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.67f, 18.17f);
        pathBuilder.lineToRelative(-5.3f, -5.3f);
        pathBuilder.horizontalLineToRelative(-0.99f);
        pathBuilder.lineToRelative(-2.54f, 2.54f);
        pathBuilder.verticalLineToRelative(0.99f);
        pathBuilder.lineToRelative(5.3f, 5.3f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.12f, -2.12f);
        pathBuilder.curveTo(22.06f, 19.2f, 22.06f, 18.56f, 21.67f, 18.17f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.34f, 10.19f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(2.12f, 2.12f);
        pathBuilder2.curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0.0f, -4.24f);
        pathBuilder2.lineToRelative(-3.54f, -3.54f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.verticalLineTo(1.71f);
        pathBuilder2.lineTo(15.22f, 1.0f);
        pathBuilder2.lineToRelative(-3.54f, 3.54f);
        pathBuilder2.lineToRelative(0.71f, 0.71f);
        pathBuilder2.horizontalLineToRelative(2.83f);
        pathBuilder2.lineToRelative(-1.41f, 1.41f);
        pathBuilder2.lineToRelative(1.06f, 1.06f);
        pathBuilder2.lineToRelative(-2.89f, 2.89f);
        pathBuilder2.lineTo(7.85f, 6.48f);
        pathBuilder2.verticalLineTo(5.06f);
        pathBuilder2.lineTo(4.83f, 2.04f);
        pathBuilder2.lineTo(2.0f, 4.87f);
        pathBuilder2.lineToRelative(3.03f, 3.03f);
        pathBuilder2.horizontalLineToRelative(1.41f);
        pathBuilder2.lineToRelative(4.13f, 4.13f);
        pathBuilder2.lineToRelative(-0.85f, 0.85f);
        pathBuilder2.horizontalLineTo(7.6f);
        pathBuilder2.lineToRelative(-5.3f, 5.3f);
        pathBuilder2.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder2.lineToRelative(2.12f, 2.12f);
        pathBuilder2.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder2.lineToRelative(5.3f, -5.3f);
        pathBuilder2.verticalLineToRelative(-2.12f);
        pathBuilder2.lineToRelative(5.15f, -5.15f);
        pathBuilder2.lineTo(17.34f, 10.19f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _handyman = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
