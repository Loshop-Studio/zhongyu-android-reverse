package androidx.compose.material.icons.rounded;

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
public final class CookieKt {
    private static ImageVector _cookie;

    public static final ImageVector getCookie(Icons.Rounded rounded) {
        ImageVector imageVector = _cookie;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Cookie", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.27f, 10.9f);
        pathBuilder.curveToRelative(-1.21f, -0.33f, -2.31f, -1.46f, -2.29f, -2.89f);
        pathBuilder.curveToRelative(0.01f, -0.56f, -0.4f, -1.02f, -0.96f, -1.01f);
        pathBuilder.curveTo(15.83f, 7.03f, 14.0f, 5.22f, 14.0f, 3.02f);
        pathBuilder.curveToRelative(0.0f, -0.49f, -0.35f, -0.9f, -0.84f, -0.96f);
        pathBuilder.curveTo(6.53f, 1.22f, 2.0f, 6.81f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.curveToRelative(5.61f, 0.0f, 10.11f, -4.62f, 10.0f, -10.18f);
        pathBuilder.curveTo(21.99f, 11.38f, 21.69f, 11.01f, 21.27f, 10.9f);
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
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cookie = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
