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
public final class HearingDisabledKt {
    private static ImageVector _hearingDisabled;

    public static final ImageVector getHearingDisabled(Icons.Outlined outlined) {
        ImageVector imageVector = _hearingDisabled;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HearingDisabled", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.03f, 3.2f);
        pathBuilder.curveTo(7.15f, 2.44f, 8.51f, 2.0f, 10.0f, 2.0f);
        pathBuilder.curveToRelative(3.93f, 0.0f, 7.0f, 3.07f, 7.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, 1.26f, -0.38f, 2.65f, -1.07f, 3.9f);
        pathBuilder.curveToRelative(-0.02f, 0.04f, -0.05f, 0.08f, -0.08f, 0.13f);
        pathBuilder.lineToRelative(-1.48f, -1.48f);
        pathBuilder.curveTo(14.77f, 10.69f, 15.0f, 9.8f, 15.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f);
        pathBuilder.curveTo(9.08f, 4.0f, 8.24f, 4.26f, 7.5f, 4.67f);
        pathBuilder.lineTo(6.03f, 3.2f);
        pathBuilder.close();
        pathBuilder.moveTo(17.21f, 14.38f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveTo(20.11f, 13.93f, 21.0f, 11.57f, 21.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -3.04f, -1.23f, -5.79f, -3.22f, -7.78f);
        pathBuilder.lineToRelative(-1.42f, 1.42f);
        pathBuilder.curveTo(17.99f, 4.26f, 19.0f, 6.51f, 19.0f, 9.0f);
        pathBuilder.curveTo(19.0f, 11.02f, 18.33f, 12.88f, 17.21f, 14.38f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 6.5f);
        pathBuilder.curveToRelative(-0.21f, 0.0f, -0.4f, 0.03f, -0.59f, 0.08f);
        pathBuilder.lineToRelative(3.01f, 3.01f);
        pathBuilder.curveTo(12.47f, 9.4f, 12.5f, 9.21f, 12.5f, 9.0f);
        pathBuilder.curveTo(12.5f, 7.62f, 11.38f, 6.5f, 10.0f, 6.5f);
        pathBuilder.close();
        pathBuilder.moveTo(21.19f, 21.19f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(2.13f, 2.13f);
        pathBuilder.curveTo(3.19f, 7.16f, 3.0f, 8.05f, 3.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, -0.36f, 0.05f, -0.71f, 0.12f, -1.05f);
        pathBuilder.lineToRelative(6.61f, 6.61f);
        pathBuilder.curveToRelative(-0.88f, 0.68f, -1.78f, 1.41f, -2.27f, 2.9f);
        pathBuilder.curveToRelative(-0.5f, 1.5f, -1.0f, 2.01f, -1.71f, 2.38f);
        pathBuilder.curveTo(7.56f, 19.94f, 7.29f, 20.0f, 7.0f, 20.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.57f, 0.0f, 1.13f, -0.12f, 1.64f, -0.35f);
        pathBuilder.curveToRelative(1.36f, -0.71f, 2.13f, -1.73f, 2.73f, -3.55f);
        pathBuilder.curveToRelative(0.32f, -0.98f, 0.9f, -1.43f, 1.71f, -2.05f);
        pathBuilder.curveToRelative(0.03f, -0.02f, 0.05f, -0.04f, 0.08f, -0.06f);
        pathBuilder.lineToRelative(6.62f, 6.62f);
        pathBuilder.lineTo(21.19f, 21.19f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hearingDisabled = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
