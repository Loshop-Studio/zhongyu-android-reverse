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
public final class ReportKt {
    private static ImageVector _report;

    public static final ImageVector getReport(Icons.TwoTone twoTone) {
        ImageVector imageVector = _report;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Report", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.1f, 5.0f);
        pathBuilder.lineTo(5.0f, 9.1f);
        pathBuilder.verticalLineToRelative(5.8f);
        pathBuilder.lineTo(9.1f, 19.0f);
        pathBuilder.horizontalLineToRelative(5.8f);
        pathBuilder.lineToRelative(4.1f, -4.1f);
        pathBuilder.lineTo(19.0f, 9.1f);
        pathBuilder.lineTo(14.9f, 5.0f);
        pathBuilder.lineTo(9.1f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.73f, 3.0f);
        pathBuilder2.horizontalLineTo(8.27f);
        pathBuilder2.lineTo(3.0f, 8.27f);
        pathBuilder2.verticalLineToRelative(7.46f);
        pathBuilder2.lineTo(8.27f, 21.0f);
        pathBuilder2.horizontalLineToRelative(7.46f);
        pathBuilder2.lineTo(21.0f, 15.73f);
        pathBuilder2.verticalLineTo(8.27f);
        pathBuilder2.lineTo(15.73f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.0f, 14.9f);
        pathBuilder2.lineTo(14.9f, 19.0f);
        pathBuilder2.horizontalLineTo(9.1f);
        pathBuilder2.lineTo(5.0f, 14.9f);
        pathBuilder2.verticalLineTo(9.1f);
        pathBuilder2.lineTo(9.1f, 5.0f);
        pathBuilder2.horizontalLineToRelative(5.8f);
        pathBuilder2.lineTo(19.0f, 9.1f);
        pathBuilder2.verticalLineToRelative(5.8f);
        pathBuilder2.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw3 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk83 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder3 = new PathBuilder();
        pathBuilder3.moveTo(12.0f, 16.0f);
        pathBuilder3.moveToRelative(-1.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder3.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder3.getNodes(), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw3, iM31241getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw4 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk84 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder4 = new PathBuilder();
        pathBuilder4.moveTo(11.0f, 7.0f);
        pathBuilder4.horizontalLineToRelative(2.0f);
        pathBuilder4.verticalLineToRelative(7.0f);
        pathBuilder4.horizontalLineToRelative(-2.0f);
        pathBuilder4.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder4.getNodes(), defaultFillType4, "", solidColor4, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw4, iM31241getBevelLxFBmk84, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _report = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
