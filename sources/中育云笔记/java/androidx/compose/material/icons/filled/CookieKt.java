package androidx.compose.material.icons.filled;

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
public final class CookieKt {
    private static ImageVector _cookie;

    public static final ImageVector getCookie(Icons.Filled filled) {
        ImageVector imageVector = _cookie;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Cookie", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.95f, 10.99f);
        pathBuilder.curveToRelative(-1.79f, -0.03f, -3.7f, -1.95f, -2.68f, -4.22f);
        pathBuilder.curveToRelative(-2.98f, 1.0f, -5.77f, -1.59f, -5.19f, -4.56f);
        pathBuilder.curveTo(6.95f, 0.71f, 2.0f, 6.58f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.curveTo(17.89f, 22.0f, 22.54f, 16.92f, 21.95f, 10.99f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 15.0f);
        pathBuilder.curveTo(7.67f, 15.0f, 7.0f, 14.33f, 7.0f, 13.5f);
        pathBuilder.reflectiveCurveTo(7.67f, 12.0f, 8.5f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(9.33f, 15.0f, 8.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.5f, 10.0f);
        pathBuilder.curveTo(9.67f, 10.0f, 9.0f, 9.33f, 9.0f, 8.5f);
        pathBuilder.reflectiveCurveTo(9.67f, 7.0f, 10.5f, 7.0f);
        pathBuilder.reflectiveCurveTo(12.0f, 7.67f, 12.0f, 8.5f);
        pathBuilder.reflectiveCurveTo(11.33f, 10.0f, 10.5f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 16.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(16.0f, 15.55f, 15.55f, 16.0f, 15.0f, 16.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cookie = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
