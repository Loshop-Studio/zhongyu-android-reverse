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
public final class OfflineBoltKt {
    private static ImageVector _offlineBolt;

    public static final ImageVector getOfflineBolt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _offlineBolt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.OfflineBolt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.02f);
        pathBuilder.curveTo(7.6f, 4.02f, 4.02f, 7.6f, 4.02f, 12.0f);
        pathBuilder.reflectiveCurveTo(7.6f, 19.98f, 12.0f, 19.98f);
        pathBuilder.reflectiveCurveToRelative(7.98f, -3.58f, 7.98f, -7.98f);
        pathBuilder.reflectiveCurveTo(16.4f, 4.02f, 12.0f, 4.02f);
        pathBuilder.close();
        pathBuilder.moveTo(11.39f, 19.0f);
        pathBuilder.verticalLineToRelative(-5.5f);
        pathBuilder.horizontalLineTo(8.25f);
        pathBuilder.lineToRelative(4.5f, -8.5f);
        pathBuilder.verticalLineToRelative(5.5f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineTo(11.39f, 19.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 2.02f);
        pathBuilder2.curveToRelative(-5.51f, 0.0f, -9.98f, 4.47f, -9.98f, 9.98f);
        pathBuilder2.reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f);
        pathBuilder2.reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f);
        pathBuilder2.reflectiveCurveTo(17.51f, 2.02f, 12.0f, 2.02f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 19.98f);
        pathBuilder2.curveToRelative(-4.4f, 0.0f, -7.98f, -3.58f, -7.98f, -7.98f);
        pathBuilder2.reflectiveCurveTo(7.6f, 4.02f, 12.0f, 4.02f);
        pathBuilder2.reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12.0f);
        pathBuilder2.reflectiveCurveTo(16.4f, 19.98f, 12.0f, 19.98f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.75f, 5.0f);
        pathBuilder2.lineToRelative(-4.5f, 8.5f);
        pathBuilder2.horizontalLineToRelative(3.14f);
        pathBuilder2.lineTo(11.39f, 19.0f);
        pathBuilder2.lineToRelative(4.36f, -8.5f);
        pathBuilder2.horizontalLineToRelative(-3.0f);
        pathBuilder2.lineTo(12.75f, 5.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlineBolt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
