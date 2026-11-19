package androidx.compose.material.icons.outlined;

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
public final class PinDropKt {
    private static ImageVector _pinDrop;

    public static final ImageVector getPinDrop(Icons.Outlined outlined) {
        ImageVector imageVector = _pinDrop;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PinDrop", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 4.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 5.0f, 1.4f, 5.0f, 5.15f);
        pathBuilder.curveToRelative(0.0f, 2.16f, -1.72f, 4.67f, -5.0f, 7.32f);
        pathBuilder.curveToRelative(-3.28f, -2.65f, -5.0f, -5.17f, -5.0f, -7.32f);
        pathBuilder.curveTo(7.0f, 5.4f, 10.07f, 4.0f, 12.0f, 4.0f);
        pathBuilder.moveToRelative(0.0f, -2.0f);
        pathBuilder.curveTo(8.73f, 2.0f, 5.0f, 4.46f, 5.0f, 9.15f);
        pathBuilder.curveToRelative(0.0f, 3.12f, 2.33f, 6.41f, 7.0f, 9.85f);
        pathBuilder.curveToRelative(4.67f, -3.44f, 7.0f, -6.73f, 7.0f, -9.85f);
        pathBuilder.curveTo(19.0f, 4.46f, 15.27f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 7.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(5.0f, 20.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinDrop = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
