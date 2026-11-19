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
public final class StrollerKt {
    private static ImageVector _stroller;

    public static final ImageVector getStroller(Icons.TwoTone twoTone) {
        ImageVector imageVector = _stroller;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Stroller", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 5.0f);
        pathBuilder.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilder.lineTo(9.49f, 6.66f);
        pathBuilder.lineToRelative(-1.4f, -1.4f);
        pathBuilder.curveTo(8.71f, 5.09f, 9.35f, 5.0f, 10.0f, 5.0f);
        pathBuilder.moveTo(15.0f, 8.66f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.horizontalLineTo(9.6f);
        pathBuilder.lineTo(15.0f, 8.66f);
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(10.0f, 5.0f);
        pathBuilder2.curveToRelative(0.29f, 0.0f, 0.58f, 0.02f, 0.86f, 0.05f);
        pathBuilder2.lineTo(9.49f, 6.66f);
        pathBuilder2.lineToRelative(-1.4f, -1.4f);
        pathBuilder2.curveTo(8.71f, 5.09f, 9.35f, 5.0f, 10.0f, 5.0f);
        pathBuilder2.moveTo(15.0f, 8.66f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineTo(9.6f);
        pathBuilder2.lineTo(15.0f, 8.66f);
        pathBuilder2.moveTo(18.65f, 3.0f);
        pathBuilder2.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        pathBuilder2.lineToRelative(-8.8f, 10.32f);
        pathBuilder2.curveTo(6.12f, 16.0f, 6.58f, 17.0f, 7.43f, 17.0f);
        pathBuilder2.horizontalLineTo(15.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineTo(6.27f);
        pathBuilder2.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        pathBuilder2.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        pathBuilder2.verticalLineTo(7.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(6.48f);
        pathBuilder2.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        pathBuilder2.lineTo(18.65f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(10.0f, 3.0f);
        pathBuilder2.curveTo(8.03f, 3.0f, 6.21f, 3.64f, 4.72f, 4.72f);
        pathBuilder2.lineToRelative(4.89f, 4.89f);
        pathBuilder2.lineToRelative(4.7f, -5.51f);
        pathBuilder2.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        pathBuilder2.lineTo(10.0f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 18.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveTo(17.1f, 18.0f, 16.0f, 18.0f);
        pathBuilder2.lineTo(16.0f, 18.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 18.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f);
        pathBuilder2.lineTo(6.0f, 18.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stroller = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
