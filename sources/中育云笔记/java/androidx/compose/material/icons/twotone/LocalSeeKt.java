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
public final class LocalSeeKt {
    private static ImageVector _localSee;

    public static final ImageVector getLocalSee(Icons.TwoTone twoTone) {
        ImageVector imageVector = _localSee;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalSee", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-4.05f);
        pathBuilder.lineToRelative(-0.59f, -0.65f);
        pathBuilder.lineTo(14.12f, 4.0f);
        pathBuilder.lineTo(9.88f, 4.0f);
        pathBuilder.lineTo(8.65f, 5.35f);
        pathBuilder.lineToRelative(-0.6f, 0.65f);
        pathBuilder.lineTo(4.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(20.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(4.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.lineTo(22.0f, 6.0f);
        pathBuilder2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder2.horizontalLineToRelative(-3.17f);
        pathBuilder2.lineTo(15.0f, 2.0f);
        pathBuilder2.lineTo(9.0f, 2.0f);
        pathBuilder2.lineTo(7.17f, 4.0f);
        pathBuilder2.lineTo(4.0f, 4.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(4.05f);
        pathBuilder2.lineToRelative(0.59f, -0.65f);
        pathBuilder2.lineTo(9.88f, 4.0f);
        pathBuilder2.horizontalLineToRelative(4.24f);
        pathBuilder2.lineToRelative(1.24f, 1.35f);
        pathBuilder2.lineToRelative(0.59f, 0.65f);
        pathBuilder2.lineTo(20.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.lineTo(4.0f, 18.0f);
        pathBuilder2.lineTo(4.0f, 6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 7.0f);
        pathBuilder2.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder2.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 15.2f);
        pathBuilder2.curveToRelative(-1.77f, 0.0f, -3.2f, -1.43f, -3.2f, -3.2f);
        pathBuilder2.curveToRelative(0.0f, -1.77f, 1.43f, -3.2f, 3.2f, -3.2f);
        pathBuilder2.reflectiveCurveToRelative(3.2f, 1.43f, 3.2f, 3.2f);
        pathBuilder2.curveToRelative(0.0f, 1.77f, -1.43f, 3.2f, -3.2f, 3.2f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localSee = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
