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
public final class NotAccessibleKt {
    private static ImageVector _notAccessible;

    public static final ImageVector getNotAccessible(Icons.Outlined outlined) {
        ImageVector imageVector = _notAccessible;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.NotAccessible", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 5.1f, 10.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-1.54f, 0.02f, -3.09f, -0.75f, -4.07f, -1.83f);
        pathBuilder.lineToRelative(-1.29f, -1.43f);
        pathBuilder.curveTo(13.4f, 7.5f, 13.2f, 7.38f, 13.01f, 7.28f);
        pathBuilder.curveToRelative(-0.36f, -0.19f, -0.72f, -0.3f, -1.2f, -0.26f);
        pathBuilder.curveToRelative(-0.49f, 0.04f, -0.91f, 0.27f, -1.23f, 0.61f);
        pathBuilder.lineTo(14.0f, 11.05f);
        pathBuilder.curveTo(15.29f, 12.12f, 17.25f, 12.99f, 19.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 20.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.31f, 0.84f, -2.41f, 2.0f, -2.83f);
        pathBuilder.verticalLineTo(12.1f);
        pathBuilder.curveToRelative(-2.28f, 0.46f, -4.0f, 2.48f, -4.0f, 4.9f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(2.42f, 0.0f, 4.44f, -1.72f, 4.9f, -4.0f);
        pathBuilder.horizontalLineToRelative(-2.07f);
        pathBuilder.curveTo(12.42f, 19.16f, 11.31f, 20.0f, 10.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineTo(10.0f, 12.83f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.17f);
        pathBuilder.lineToRelative(5.61f, 5.61f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notAccessible = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
