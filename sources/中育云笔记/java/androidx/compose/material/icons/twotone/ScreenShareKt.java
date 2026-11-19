package androidx.compose.material.icons.twotone;

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
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
public final class ScreenShareKt {
    private static ImageVector _screenShare;

    public static final ImageVector getScreenShare(Icons.TwoTone twoTone) {
        ImageVector imageVector = _screenShare;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ScreenShare", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 16.0f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.verticalLineToRelative(10.01f);
        pathBuilder.lineTo(20.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.47f);
        pathBuilder.verticalLineToRelative(-2.19f);
        pathBuilder.curveToRelative(-2.78f, 0.0f, -4.61f, 0.85f, -6.0f, 2.72f);
        pathBuilder.curveToRelative(0.56f, -2.67f, 2.11f, -5.33f, 6.0f, -5.87f);
        pathBuilder.lineTo(13.0f, 7.0f);
        pathBuilder.lineToRelative(4.0f, 3.73f);
        pathBuilder.lineToRelative(-4.0f, 3.74f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 18.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder2.lineTo(22.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.lineTo(4.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(10.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.lineTo(0.0f, 18.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(-4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 16.0f);
        pathBuilder2.lineTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(10.01f);
        pathBuilder2.lineTo(4.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.0f, 9.13f);
        pathBuilder2.curveToRelative(-3.89f, 0.54f, -5.44f, 3.2f, -6.0f, 5.87f);
        pathBuilder2.curveToRelative(1.39f, -1.87f, 3.22f, -2.72f, 6.0f, -2.72f);
        pathBuilder2.verticalLineToRelative(2.19f);
        pathBuilder2.lineToRelative(4.0f, -3.74f);
        pathBuilder2.lineTo(13.0f, 7.0f);
        pathBuilder2.verticalLineToRelative(2.13f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenShare = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getScreenShare$annotations(Icons.TwoTone twoTone) {
    }
}
