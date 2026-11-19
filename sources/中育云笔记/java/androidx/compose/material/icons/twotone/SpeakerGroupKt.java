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

/* loaded from: classes2.dex */
public final class SpeakerGroupKt {
    private static ImageVector _speakerGroup;

    public static final ImageVector getSpeakerGroup(Icons.TwoTone twoTone) {
        ImageVector imageVector = _speakerGroup;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SpeakerGroup", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 16.99f);
        pathBuilder.lineToRelative(8.0f, 0.01f);
        pathBuilder.lineTo(18.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(13.99f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 4.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.89f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 9.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveTo(15.93f, 16.0f, 14.0f, 16.0f);
        pathBuilder.reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(12.07f, 9.0f, 14.0f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(18.2f, 1.0f);
        pathBuilder2.lineTo(9.8f, 1.0f);
        pathBuilder2.curveTo(8.81f, 1.0f, 8.0f, 1.81f, 8.0f, 2.8f);
        pathBuilder2.verticalLineToRelative(14.4f);
        pathBuilder2.curveToRelative(0.0f, 0.99f, 0.81f, 1.79f, 1.8f, 1.79f);
        pathBuilder2.lineToRelative(8.4f, 0.01f);
        pathBuilder2.curveToRelative(0.99f, 0.0f, 1.8f, -0.81f, 1.8f, -1.8f);
        pathBuilder2.lineTo(20.0f, 2.8f);
        pathBuilder2.curveToRelative(0.0f, -0.99f, -0.81f, -1.8f, -1.8f, -1.8f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 17.0f);
        pathBuilder2.lineToRelative(-8.0f, -0.01f);
        pathBuilder2.lineTo(10.0f, 3.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 8.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 16.0f);
        pathBuilder2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder2.reflectiveCurveTo(15.93f, 9.0f, 14.0f, 9.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder2.reflectiveCurveTo(12.07f, 16.0f, 14.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 11.0f);
        pathBuilder2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder2.reflectiveCurveTo(14.83f, 14.0f, 14.0f, 14.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder2.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(6.0f, 5.0f);
        pathBuilder2.lineTo(4.0f, 5.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(10.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.lineTo(6.0f, 21.0f);
        pathBuilder2.lineTo(6.0f, 5.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerGroup = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
