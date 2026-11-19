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
public final class WebhookKt {
    private static ImageVector _webhook;

    public static final ImageVector getWebhook(Icons.TwoTone twoTone) {
        ImageVector imageVector = _webhook;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Webhook", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 15.0f);
        pathBuilder.lineToRelative(5.88f, 0.0f);
        pathBuilder.curveToRelative(0.27f, -0.31f, 0.67f, -0.5f, 1.12f, -0.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.curveToRelative(-0.44f, 0.0f, -0.84f, -0.19f, -1.12f, -0.5f);
        pathBuilder.lineToRelative(-3.98f, 0.0f);
        pathBuilder.curveToRelative(-0.46f, 2.28f, -2.48f, 4.0f, -4.9f, 4.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -2.42f, 1.72f, -4.44f, 4.0f, -4.9f);
        pathBuilder.lineToRelative(0.0f, 2.07f);
        pathBuilder.curveTo(4.84f, 13.58f, 4.0f, 14.7f, 4.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 1.65f, 1.35f, 3.0f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 4.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, 1.35f, 3.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 1.43f, 0.6f, 2.71f, 1.55f, 3.62f);
        pathBuilder.lineToRelative(-2.35f, 3.9f);
        pathBuilder.curveTo(6.02f, 14.66f, 5.5f, 15.27f, 5.5f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.curveToRelative(0.0f, -0.16f, -0.02f, -0.31f, -0.07f, -0.45f);
        pathBuilder.lineToRelative(3.38f, -5.63f);
        pathBuilder.curveTo(10.49f, 9.61f, 9.5f, 8.42f, 9.5f, 7.0f);
        pathBuilder.curveTo(9.5f, 5.35f, 10.85f, 4.0f, 12.5f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 13.0f);
        pathBuilder.curveToRelative(-0.64f, 0.0f, -1.23f, 0.2f, -1.72f, 0.54f);
        pathBuilder.lineToRelative(-3.05f, -5.07f);
        pathBuilder.curveTo(11.53f, 8.35f, 11.0f, 7.74f, 11.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(14.0f, 6.17f, 14.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 0.15f, -0.02f, 0.29f, -0.06f, 0.43f);
        pathBuilder.lineToRelative(2.19f, 3.65f);
        pathBuilder.curveTo(16.41f, 11.03f, 16.7f, 11.0f, 17.0f, 11.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder.curveToRelative(-1.85f, 0.0f, -3.47f, -1.01f, -4.33f, -2.5f);
        pathBuilder.lineToRelative(2.67f, 0.0f);
        pathBuilder.curveTo(15.82f, 18.82f, 16.39f, 19.0f, 17.0f, 19.0f);
        pathBuilder.curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveTo(18.65f, 13.0f, 17.0f, 13.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _webhook = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
