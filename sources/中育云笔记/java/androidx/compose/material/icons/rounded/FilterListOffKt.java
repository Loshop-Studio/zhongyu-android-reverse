package androidx.compose.material.icons.rounded;

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

/* loaded from: classes.dex */
public final class FilterListOffKt {
    private static ImageVector _filterListOff;

    public static final ImageVector getFilterListOff(Icons.Rounded rounded) {
        ImageVector imageVector = _filterListOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FilterListOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineTo(8.83f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.curveTo(20.55f, 8.0f, 21.0f, 7.55f, 21.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.curveTo(17.55f, 13.0f, 18.0f, 12.55f, 18.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.98f, 16.81f);
        pathBuilder.curveTo(13.99f, 16.87f, 14.0f, 16.94f, 14.0f, 17.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.06f, 0.0f, 0.13f, 0.01f, 0.19f, 0.02f);
        pathBuilder.lineTo(10.17f, 13.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(1.17f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(3.45f, 8.0f, 3.0f, 7.55f, 3.0f, 7.0f);
        pathBuilder.curveToRelative(0.0f, -0.32f, 0.15f, -0.6f, 0.38f, -0.79f);
        pathBuilder.lineTo(2.1f, 4.93f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(16.97f, 16.97f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0.0f);
        pathBuilder.lineTo(13.98f, 16.81f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _filterListOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
