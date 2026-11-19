package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.SolidColor;
import androidx.compose.p014ui.graphics.StrokeCap;
import androidx.compose.p014ui.graphics.StrokeJoin;
import androidx.compose.p014ui.graphics.vector.ImageVector;
import androidx.compose.p014ui.graphics.vector.PathBuilder;
import androidx.compose.p014ui.graphics.vector.VectorKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
public final class GroupsKt {
    private static ImageVector _groups;

    public static final ImageVector getGroups(Icons.Outlined outlined) {
        ImageVector imageVector = _groups;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Groups", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 13.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveTo(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.13f, 14.1f);
        pathBuilder.curveTo(4.76f, 14.04f, 4.39f, 14.0f, 4.0f, 14.0f);
        pathBuilder.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        pathBuilder.curveTo(0.48f, 14.9f, 0.0f, 15.62f, 0.0f, 16.43f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.lineToRelative(4.5f, 0.0f);
        pathBuilder.verticalLineToRelative(-1.61f);
        pathBuilder.curveTo(4.5f, 15.56f, 4.73f, 14.78f, 5.13f, 14.1f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 13.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.curveTo(18.0f, 12.1f, 18.9f, 13.0f, 20.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 16.43f);
        pathBuilder.curveToRelative(0.0f, -0.81f, -0.48f, -1.53f, -1.22f, -1.85f);
        pathBuilder.curveTo(21.93f, 14.21f, 20.99f, 14.0f, 20.0f, 14.0f);
        pathBuilder.curveToRelative(-0.39f, 0.0f, -0.76f, 0.04f, -1.13f, 0.1f);
        pathBuilder.curveToRelative(0.4f, 0.68f, 0.63f, 1.46f, 0.63f, 2.29f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.lineToRelative(4.5f, 0.0f);
        pathBuilder.verticalLineTo(16.43f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 13.65f);
        pathBuilder.curveToRelative(-1.17f, -0.52f, -2.61f, -0.9f, -4.24f, -0.9f);
        pathBuilder.curveToRelative(-1.63f, 0.0f, -3.07f, 0.39f, -4.24f, 0.9f);
        pathBuilder.curveTo(6.68f, 14.13f, 6.0f, 15.21f, 6.0f, 16.39f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-1.61f);
        pathBuilder.curveTo(18.0f, 15.21f, 17.32f, 14.13f, 16.24f, 13.65f);
        pathBuilder.close();
        pathBuilder.moveTo(8.07f, 16.0f);
        pathBuilder.curveToRelative(0.09f, -0.23f, 0.13f, -0.39f, 0.91f, -0.69f);
        pathBuilder.curveToRelative(0.97f, -0.38f, 1.99f, -0.56f, 3.02f, -0.56f);
        pathBuilder.reflectiveCurveToRelative(2.05f, 0.18f, 3.02f, 0.56f);
        pathBuilder.curveToRelative(0.77f, 0.3f, 0.81f, 0.46f, 0.91f, 0.69f);
        pathBuilder.horizontalLineTo(8.07f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(11.45f, 8.0f, 12.0f, 8.0f);
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.curveTo(15.0f, 7.34f, 13.66f, 6.0f, 12.0f, 6.0f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groups = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
