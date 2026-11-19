package androidx.compose.material.icons.sharp;

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
public final class SlowMotionVideoKt {
    private static ImageVector _slowMotionVideo;

    public static final ImageVector getSlowMotionVideo(Icons.Sharp sharp) {
        ImageVector imageVector = _slowMotionVideo;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SlowMotionVideo", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.05f, 9.79f);
        pathBuilder.lineTo(10.0f, 7.5f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(3.05f, -2.29f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-2.95f, -2.21f);
        pathBuilder.close();
        pathBuilder.moveTo(13.05f, 9.79f);
        pathBuilder.lineTo(10.0f, 7.5f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(3.05f, -2.29f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-2.95f, -2.21f);
        pathBuilder.close();
        pathBuilder.moveTo(13.05f, 9.79f);
        pathBuilder.lineTo(10.0f, 7.5f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(3.05f, -2.29f);
        pathBuilder.lineTo(16.0f, 12.0f);
        pathBuilder.lineToRelative(-2.95f, -2.21f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 4.07f);
        pathBuilder.lineTo(11.0f, 2.05f);
        pathBuilder.curveToRelative(-2.01f, 0.2f, -3.84f, 1.0f, -5.32f, 2.21f);
        pathBuilder.lineTo(7.1f, 5.69f);
        pathBuilder.curveToRelative(1.11f, -0.86f, 2.44f, -1.44f, 3.9f, -1.62f);
        pathBuilder.close();
        pathBuilder.moveTo(5.69f, 7.1f);
        pathBuilder.lineTo(4.26f, 5.68f);
        pathBuilder.curveTo(3.05f, 7.16f, 2.25f, 8.99f, 2.05f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.02f);
        pathBuilder.curveToRelative(0.18f, -1.46f, 0.76f, -2.79f, 1.62f, -3.9f);
        pathBuilder.close();
        pathBuilder.moveTo(4.07f, 13.0f);
        pathBuilder.lineTo(2.05f, 13.0f);
        pathBuilder.curveToRelative(0.2f, 2.01f, 1.0f, 3.84f, 2.21f, 5.32f);
        pathBuilder.lineToRelative(1.43f, -1.43f);
        pathBuilder.curveToRelative(-0.86f, -1.1f, -1.44f, -2.43f, -1.62f, -3.89f);
        pathBuilder.close();
        pathBuilder.moveTo(5.68f, 19.74f);
        pathBuilder.curveTo(7.16f, 20.95f, 9.0f, 21.75f, 11.0f, 21.95f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveToRelative(-1.46f, -0.18f, -2.79f, -0.76f, -3.9f, -1.62f);
        pathBuilder.lineToRelative(-1.42f, 1.43f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.16f, -3.92f, 9.42f, -8.95f, 9.95f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveTo(16.97f, 19.41f, 20.0f, 16.05f, 20.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-3.03f, -7.41f, -6.95f, -7.93f);
        pathBuilder.lineTo(13.05f, 2.05f);
        pathBuilder.curveTo(18.08f, 2.58f, 22.0f, 6.84f, 22.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _slowMotionVideo = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
