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
public final class VapingRoomsKt {
    private static ImageVector _vapingRooms;

    public static final ImageVector getVapingRooms(Icons.TwoTone twoTone) {
        ImageVector imageVector = _vapingRooms;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.VapingRooms", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.5f, 17.5f);
        pathBuilder.moveToRelative(-0.5f, 0.0f);
        pathBuilder.arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f);
        pathBuilder.arcToRelative(0.5f, 0.5f, 0.0f, true, true, -1.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.0f, 16.5f);
        pathBuilder2.horizontalLineToRelative(1.0f);
        pathBuilder2.curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.verticalLineTo(16.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.verticalLineToRelative(-3.0f);
        pathBuilder2.horizontalLineTo(22.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(11.0f, 17.5f);
        pathBuilder2.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder2.reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f);
        pathBuilder2.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder2.reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(22.0f, 12.76f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineToRelative(-1.5f);
        pathBuilder2.verticalLineToRelative(-2.23f);
        pathBuilder2.curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f);
        pathBuilder2.verticalLineTo(7.2f);
        pathBuilder2.curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f);
        pathBuilder2.reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f);
        pathBuilder2.verticalLineTo(2.0f);
        pathBuilder2.curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f);
        pathBuilder2.curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f);
        pathBuilder2.curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.5f, 13.36f);
        pathBuilder2.verticalLineTo(15.0f);
        pathBuilder2.horizontalLineTo(18.0f);
        pathBuilder2.verticalLineToRelative(-1.3f);
        pathBuilder2.curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f);
        pathBuilder2.horizontalLineTo(14.5f);
        pathBuilder2.curveToRelative(-1.85f, 0.0f, -3.35f, -1.5f, -3.35f, -3.35f);
        pathBuilder2.reflectiveCurveToRelative(1.5f, -3.35f, 3.35f, -3.35f);
        pathBuilder2.verticalLineToRelative(1.5f);
        pathBuilder2.curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f);
        pathBuilder2.reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f);
        pathBuilder2.horizontalLineToRelative(1.53f);
        pathBuilder2.curveTo(17.9f, 10.2f, 19.5f, 11.55f, 19.5f, 13.36f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapingRooms = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
