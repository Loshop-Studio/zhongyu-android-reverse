package androidx.compose.material.icons.outlined;

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
public final class PhoneLockedKt {
    private static ImageVector _phoneLocked;

    public static final ImageVector getPhoneLocked(Icons.Outlined outlined) {
        ImageVector imageVector = _phoneLocked;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhoneLocked", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 5.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.2f, 14.87f);
        pathBuilder2.lineToRelative(-3.67f, -0.73f);
        pathBuilder2.curveToRelative(-0.5f, -0.1f, -0.83f, 0.2f, -0.9f, 0.27f);
        pathBuilder2.lineToRelative(-2.52f, 2.5f);
        pathBuilder2.curveToRelative(-2.5f, -1.43f, -4.57f, -3.5f, -6.0f, -6.0f);
        pathBuilder2.lineToRelative(2.5f, -2.52f);
        pathBuilder2.curveToRelative(0.23f, -0.24f, 0.33f, -0.57f, 0.27f, -0.9f);
        pathBuilder2.lineTo(9.13f, 3.8f);
        pathBuilder2.curveTo(9.04f, 3.34f, 8.63f, 3.0f, 8.15f, 3.0f);
        pathBuilder2.lineTo(4.0f, 3.0f);
        pathBuilder2.curveTo(3.44f, 3.0f, 2.97f, 3.47f, 3.0f, 4.03f);
        pathBuilder2.curveTo(3.17f, 6.92f, 4.05f, 9.63f, 5.43f, 12.0f);
        pathBuilder2.curveToRelative(1.58f, 2.73f, 3.85f, 4.99f, 6.57f, 6.57f);
        pathBuilder2.curveToRelative(2.37f, 1.37f, 5.08f, 2.26f, 7.97f, 2.43f);
        pathBuilder2.curveToRelative(0.55f, 0.03f, 1.03f, -0.43f, 1.03f, -1.0f);
        pathBuilder2.verticalLineToRelative(-4.15f);
        pathBuilder2.curveTo(21.0f, 15.37f, 20.66f, 14.96f, 20.2f, 14.87f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.1f, 5.0f);
        pathBuilder2.horizontalLineToRelative(2.23f);
        pathBuilder2.lineTo(7.8f, 7.35f);
        pathBuilder2.lineTo(6.17f, 9.0f);
        pathBuilder2.curveTo(5.63f, 7.7f, 5.27f, 6.37f, 5.1f, 5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 18.9f);
        pathBuilder2.curveToRelative(-1.37f, -0.18f, -2.7f, -0.53f, -4.0f, -1.07f);
        pathBuilder2.lineToRelative(1.65f, -1.63f);
        pathBuilder2.lineTo(19.0f, 16.67f);
        pathBuilder2.verticalLineTo(18.9f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneLocked = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
