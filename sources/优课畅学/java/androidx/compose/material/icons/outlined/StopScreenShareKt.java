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
import p123h7.InterfaceC8721a;

/* loaded from: classes.dex */
public final class StopScreenShareKt {
    private static ImageVector _stopScreenShare;

    public static final ImageVector getStopScreenShare(Icons.Outlined outlined) {
        ImageVector imageVector = _stopScreenShare;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.StopScreenShare", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.79f, 18.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(24.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.21f);
        pathBuilder.close();
        pathBuilder.moveTo(1.11f, 2.98f);
        pathBuilder.lineToRelative(1.55f, 1.56f);
        pathBuilder.curveToRelative(-0.41f, 0.37f, -0.66f, 0.89f, -0.66f, 1.48f);
        pathBuilder.lineTo(2.0f, 16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.01f, 2.0f);
        pathBuilder.lineTo(0.0f, 18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(18.13f);
        pathBuilder.lineToRelative(2.71f, 2.71f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.52f, 1.57f);
        pathBuilder.lineTo(1.11f, 2.98f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 6.02f);
        pathBuilder.horizontalLineToRelative(0.13f);
        pathBuilder.lineToRelative(4.95f, 4.93f);
        pathBuilder.curveTo(7.94f, 12.07f, 7.31f, 13.52f, 7.0f, 15.0f);
        pathBuilder.curveToRelative(0.96f, -1.29f, 2.13f, -2.08f, 3.67f, -2.46f);
        pathBuilder.lineToRelative(3.46f, 3.48f);
        pathBuilder.lineTo(4.0f, 16.02f);
        pathBuilder.verticalLineToRelative(-10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 6.02f);
        pathBuilder.verticalLineToRelative(10.19f);
        pathBuilder.lineToRelative(1.3f, 1.3f);
        pathBuilder.curveToRelative(0.42f, -0.37f, 0.7f, -0.89f, 0.7f, -1.49f);
        pathBuilder.verticalLineToRelative(-10.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(7.8f, 4.02f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(20.0f, 6.02f);
        pathBuilder.close();
        pathBuilder.moveTo(12.93f, 9.15f);
        pathBuilder.lineToRelative(2.79f, 2.78f);
        pathBuilder.lineToRelative(1.28f, -1.2f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.verticalLineToRelative(2.13f);
        pathBuilder.lineToRelative(-0.07f, 0.02f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stopScreenShare = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC8721a
    public static /* synthetic */ void getStopScreenShare$annotations(Icons.Outlined outlined) {
    }
}
