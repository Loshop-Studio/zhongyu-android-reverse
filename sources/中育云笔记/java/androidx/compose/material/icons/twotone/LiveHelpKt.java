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
public final class LiveHelpKt {
    private static ImageVector _liveHelp;

    public static final ImageVector getLiveHelp(Icons.TwoTone twoTone) {
        ImageVector imageVector = _liveHelp;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LiveHelp", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(4.83f);
        pathBuilder.lineToRelative(0.59f, 0.59f);
        pathBuilder.lineTo(12.0f, 20.17f);
        pathBuilder.lineToRelative(1.59f, -1.59f);
        pathBuilder.lineToRelative(0.58f, -0.58f);
        pathBuilder.lineTo(19.0f, 18.0f);
        pathBuilder.lineTo(19.0f, 4.0f);
        pathBuilder.lineTo(5.0f, 4.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 2.5f, -3.0f, 2.75f, -3.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -3.25f, 3.0f, -3.0f, 3.0f, -5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.lineTo(8.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(21.0f, 4.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.lineTo(5.0f, 2.0f);
        pathBuilder2.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.lineToRelative(3.0f, 3.0f);
        pathBuilder2.lineToRelative(3.0f, -3.0f);
        pathBuilder2.horizontalLineToRelative(4.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(21.0f, 4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 18.0f);
        pathBuilder2.horizontalLineToRelative(-4.83f);
        pathBuilder2.lineToRelative(-0.59f, 0.59f);
        pathBuilder2.lineTo(12.0f, 20.17f);
        pathBuilder2.lineToRelative(-1.59f, -1.59f);
        pathBuilder2.lineToRelative(-0.58f, -0.58f);
        pathBuilder2.lineTo(5.0f, 18.0f);
        pathBuilder2.lineTo(5.0f, 4.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 15.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 7.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder2.curveToRelative(0.0f, 2.0f, -3.0f, 1.75f, -3.0f, 5.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, -2.25f, 3.0f, -2.5f, 3.0f, -5.0f);
        pathBuilder2.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder2.reflectiveCurveTo(8.0f, 6.79f, 8.0f, 9.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _liveHelp = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getLiveHelp$annotations(Icons.TwoTone twoTone) {
    }
}
