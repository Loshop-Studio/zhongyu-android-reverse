package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class DonutSmallKt {
    private static ImageVector _donutSmall;

    public static final ImageVector getDonutSmall(Icons.TwoTone twoTone) {
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DonutSmall", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.99f, 9.0f);
        pathBuilder.horizontalLineToRelative(3.43f);
        pathBuilder.curveTo(18.6f, 7.0f, 17.0f, 5.4f, 15.0f, 4.58f);
        pathBuilder.verticalLineToRelative(3.43f);
        pathBuilder.curveToRelative(0.37f, 0.28f, 0.71f, 0.62f, 0.99f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.35f, 2.04f, 6.24f, 5.0f, 7.42f);
        pathBuilder.verticalLineToRelative(-3.44f);
        pathBuilder.curveToRelative(-1.23f, -0.93f, -2.0f, -2.4f, -2.0f, -3.99f);
        pathBuilder.curveTo(7.0f, 10.4f, 7.77f, 8.93f, 9.0f, 8.0f);
        pathBuilder.lineTo(9.0f, 4.58f);
        pathBuilder.curveTo(6.04f, 5.76f, 4.0f, 8.65f, 4.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 15.99f);
        pathBuilder.verticalLineToRelative(3.43f);
        pathBuilder.curveToRelative(2.0f, -0.82f, 3.6f, -2.42f, 4.42f, -4.42f);
        pathBuilder.horizontalLineToRelative(-3.43f);
        pathBuilder.curveToRelative(-0.28f, 0.37f, -0.62f, 0.71f, -0.99f, 0.99f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.82f, 11.0f);
        pathBuilder2.horizontalLineToRelative(7.13f);
        pathBuilder2.curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f);
        pathBuilder2.verticalLineToRelative(7.13f);
        pathBuilder2.curveToRelative(0.85f, 0.31f, 1.51f, 0.97f, 1.82f, 1.82f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 4.58f);
        pathBuilder2.curveTo(17.0f, 5.4f, 18.6f, 7.0f, 19.42f, 9.0f);
        pathBuilder2.horizontalLineToRelative(-3.43f);
        pathBuilder2.curveToRelative(-0.28f, -0.37f, -0.62f, -0.71f, -0.99f, -0.99f);
        pathBuilder2.lineTo(15.0f, 4.58f);
        pathBuilder2.close();
        pathBuilder2.moveTo(2.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        pathBuilder2.verticalLineToRelative(-7.13f);
        pathBuilder2.curveTo(9.84f, 14.4f, 9.0f, 13.3f, 9.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f);
        pathBuilder2.lineTo(11.0f, 2.05f);
        pathBuilder2.curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        pathBuilder2.close();
        pathBuilder2.moveTo(9.0f, 4.58f);
        pathBuilder2.verticalLineToRelative(3.44f);
        pathBuilder2.curveToRelative(-1.23f, 0.92f, -2.0f, 2.39f, -2.0f, 3.98f);
        pathBuilder2.curveToRelative(0.0f, 1.59f, 0.77f, 3.06f, 2.0f, 3.99f);
        pathBuilder2.verticalLineToRelative(3.44f);
        pathBuilder2.curveTo(6.04f, 18.24f, 4.0f, 15.35f, 4.0f, 12.0f);
        pathBuilder2.curveToRelative(0.0f, -3.35f, 2.04f, -6.24f, 5.0f, -7.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 14.82f);
        pathBuilder2.verticalLineToRelative(7.13f);
        pathBuilder2.curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f);
        pathBuilder2.horizontalLineToRelative(-7.13f);
        pathBuilder2.curveToRelative(-0.31f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 15.99f);
        pathBuilder2.curveToRelative(0.37f, -0.28f, 0.71f, -0.61f, 0.99f, -0.99f);
        pathBuilder2.horizontalLineToRelative(3.43f);
        pathBuilder2.curveTo(18.6f, 17.0f, 17.0f, 18.6f, 15.0f, 19.42f);
        pathBuilder2.verticalLineToRelative(-3.43f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
