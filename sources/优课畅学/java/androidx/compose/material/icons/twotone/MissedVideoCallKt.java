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
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class MissedVideoCallKt {
    private static ImageVector _missedVideoCall;

    public static final ImageVector getMissedVideoCall(Icons.TwoTone twoTone) {
        ImageVector imageVector = _missedVideoCall;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MissedVideoCall", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 13.5f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-2.5f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 15.0f);
        pathBuilder.lineToRelative(-3.89f, -3.89f);
        pathBuilder.verticalLineToRelative(2.55f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(9.22f);
        pathBuilder.horizontalLineToRelative(4.44f);
        pathBuilder.verticalLineToRelative(1.11f);
        pathBuilder.horizontalLineTo(7.89f);
        pathBuilder.lineToRelative(3.11f, 3.1f);
        pathBuilder.lineToRelative(2.99f, -3.01f);
        pathBuilder.lineToRelative(0.78f, 0.79f);
        pathBuilder.lineTo(11.0f, 15.0f);
        pathBuilder.close();
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 17.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-3.5f);
        pathBuilder2.lineToRelative(4.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(-11.0f);
        pathBuilder2.lineToRelative(-4.0f, 4.0f);
        pathBuilder2.lineTo(17.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder2.lineTo(4.0f, 6.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.lineTo(5.0f, 16.0f);
        pathBuilder2.lineTo(5.0f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 13.43f);
        pathBuilder2.lineToRelative(-3.11f, -3.1f);
        pathBuilder2.horizontalLineToRelative(2.55f);
        pathBuilder2.lineTo(10.44f, 9.22f);
        pathBuilder2.lineTo(6.0f, 9.22f);
        pathBuilder2.verticalLineToRelative(4.44f);
        pathBuilder2.horizontalLineToRelative(1.11f);
        pathBuilder2.verticalLineToRelative(-2.55f);
        pathBuilder2.lineTo(11.0f, 15.0f);
        pathBuilder2.lineToRelative(3.77f, -3.79f);
        pathBuilder2.lineToRelative(-0.78f, -0.79f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _missedVideoCall = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC8721a
    public static /* synthetic */ void getMissedVideoCall$annotations(Icons.TwoTone twoTone) {
    }
}
