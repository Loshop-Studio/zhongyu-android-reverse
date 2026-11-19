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
public final class SpeakerPhoneKt {
    private static ImageVector _speakerPhone;

    public static final ImageVector getSpeakerPhone(Icons.TwoTone twoTone) {
        ImageVector imageVector = _speakerPhone;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SpeakerPhone", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 1.0f);
        pathBuilder2.curveTo(8.98f, 1.0f, 6.24f, 2.23f, 4.25f, 4.21f);
        pathBuilder2.lineToRelative(1.41f, 1.41f);
        pathBuilder2.curveTo(7.28f, 4.0f, 9.53f, 3.0f, 12.0f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(4.72f, 1.0f, 6.34f, 2.62f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.curveTo(17.76f, 2.23f, 15.02f, 1.0f, 12.0f, 1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.0f, 7.07f);
        pathBuilder2.lineTo(8.43f, 8.5f);
        pathBuilder2.curveToRelative(0.91f, -0.91f, 2.18f, -1.48f, 3.57f, -1.48f);
        pathBuilder2.reflectiveCurveToRelative(2.66f, 0.57f, 3.57f, 1.48f);
        pathBuilder2.lineTo(17.0f, 7.07f);
        pathBuilder2.curveTo(15.72f, 5.79f, 13.95f, 5.0f, 12.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.72f, 0.79f, -5.0f, 2.07f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.86f, 10.01f);
        pathBuilder2.lineTo(9.14f, 10.0f);
        pathBuilder2.curveTo(8.51f, 10.0f, 8.0f, 10.51f, 8.0f, 11.14f);
        pathBuilder2.verticalLineToRelative(9.71f);
        pathBuilder2.curveToRelative(0.0f, 0.63f, 0.51f, 1.14f, 1.14f, 1.14f);
        pathBuilder2.horizontalLineToRelative(5.71f);
        pathBuilder2.curveToRelative(0.63f, 0.0f, 1.14f, -0.51f, 1.14f, -1.14f);
        pathBuilder2.verticalLineToRelative(-9.71f);
        pathBuilder2.curveToRelative(0.01f, -0.63f, -0.5f, -1.13f, -1.13f, -1.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 20.0f);
        pathBuilder2.lineTo(9.0f, 20.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerPhone = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
