package androidx.compose.material.icons.rounded;

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
public final class BadgeKt {
    private static ImageVector _badge;

    public static final ImageVector getBadge(Icons.Rounded rounded) {
        ImageVector imageVector = _badge;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Badge", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(9.9f, 2.0f, 9.0f, 2.9f, 9.0f, 4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.curveTo(7.5f, 12.67f, 8.17f, 12.0f, 9.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(-0.43f);
        pathBuilder.curveToRelative(0.0f, -0.6f, 0.36f, -1.15f, 0.92f, -1.39f);
        pathBuilder.curveTo(7.56f, 15.9f, 8.26f, 15.75f, 9.0f, 15.75f);
        pathBuilder.reflectiveCurveToRelative(1.44f, 0.15f, 2.08f, 0.43f);
        pathBuilder.curveToRelative(0.55f, 0.24f, 0.92f, 0.78f, 0.92f, 1.39f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 16.5f);
        pathBuilder.horizontalLineToRelative(-2.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(18.0f, 16.16f, 17.66f, 16.5f, 17.25f, 16.5f);
        pathBuilder.close();
        pathBuilder.moveTo(17.25f, 13.5f);
        pathBuilder.horizontalLineToRelative(-2.5f);
        pathBuilder.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(18.0f, 13.16f, 17.66f, 13.5f, 17.25f, 13.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _badge = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
