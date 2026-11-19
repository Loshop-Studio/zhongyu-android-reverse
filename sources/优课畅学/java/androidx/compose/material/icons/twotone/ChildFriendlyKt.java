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
public final class ChildFriendlyKt {
    private static ImageVector _childFriendly;

    public static final ImageVector getChildFriendly(Icons.TwoTone twoTone) {
        ImageVector imageVector = _childFriendly;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ChildFriendly", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 4.34f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(3.66f);
        pathBuilder.curveTo(18.05f, 6.3f, 16.7f, 4.95f, 15.0f, 4.34f);
        pathBuilder.close();
        pathBuilder.moveTo(8.04f, 14.36f);
        pathBuilder.lineToRelative(0.44f, 0.67f);
        pathBuilder.curveToRelative(1.19f, 0.16f, 2.19f, 0.92f, 2.68f, 1.97f);
        pathBuilder.horizontalLineToRelative(2.68f);
        pathBuilder.curveToRelative(0.56f, -1.18f, 1.77f, -2.0f, 3.16f, -2.0f);
        pathBuilder.curveToRelative(0.15f, 0.0f, 0.31f, 0.01f, 0.46f, 0.03f);
        pathBuilder.lineToRelative(0.29f, -0.37f);
        pathBuilder.curveToRelative(0.4f, -0.51f, 0.7f, -1.07f, 0.92f, -1.66f);
        pathBuilder.horizontalLineTo(7.37f);
        pathBuilder.curveToRelative(0.32f, 0.67f, 0.57f, 1.19f, 0.67f, 1.36f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 8.0f);
        pathBuilder2.lineTo(15.0f, 4.34f);
        pathBuilder2.curveToRelative(1.7f, 0.6f, 3.05f, 1.95f, 3.66f, 3.66f);
        pathBuilder2.lineTo(15.0f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.44f, 11.0f);
        pathBuilder2.lineToRelative(-0.95f, -2.0f);
        pathBuilder2.lineTo(2.0f, 9.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.22f);
        pathBuilder2.reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f);
        pathBuilder2.curveToRelative(-1.1f, 0.59f, -1.84f, 1.75f, -1.84f, 3.08f);
        pathBuilder2.curveTo(4.5f, 20.43f, 6.07f, 22.0f, 8.0f, 22.0f);
        pathBuilder2.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        pathBuilder2.horizontalLineToRelative(2.08f);
        pathBuilder2.curveToRelative(0.24f, 1.7f, 1.7f, 3.0f, 3.46f, 3.0f);
        pathBuilder2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder2.curveToRelative(0.0f, -1.04f, -0.46f, -1.97f, -1.18f, -2.61f);
        pathBuilder2.curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f);
        pathBuilder2.lineTo(6.44f, 11.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.0f, 20.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(7.17f, 17.0f, 8.0f, 17.0f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(8.83f, 20.0f, 8.0f, 20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.0f, 20.0f);
        pathBuilder2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveTo(16.17f, 17.0f, 17.0f, 17.0f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(17.83f, 20.0f, 17.0f, 20.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.74f, 14.66f);
        pathBuilder2.lineToRelative(-0.29f, 0.37f);
        pathBuilder2.curveToRelative(-0.14f, -0.02f, -0.3f, -0.03f, -0.45f, -0.03f);
        pathBuilder2.curveToRelative(-1.39f, 0.0f, -2.6f, 0.82f, -3.16f, 2.0f);
        pathBuilder2.horizontalLineToRelative(-2.68f);
        pathBuilder2.curveToRelative(-0.5f, -1.04f, -1.5f, -1.8f, -2.68f, -1.97f);
        pathBuilder2.lineToRelative(-0.44f, -0.67f);
        pathBuilder2.curveToRelative(-0.1f, -0.17f, -0.34f, -0.69f, -0.67f, -1.36f);
        pathBuilder2.horizontalLineToRelative(11.29f);
        pathBuilder2.curveToRelative(-0.21f, 0.59f, -0.52f, 1.15f, -0.92f, 1.66f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _childFriendly = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
