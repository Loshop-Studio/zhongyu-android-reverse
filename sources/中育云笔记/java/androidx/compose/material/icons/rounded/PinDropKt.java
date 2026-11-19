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
public final class PinDropKt {
    private static ImageVector _pinDrop;

    public static final ImageVector getPinDrop(Icons.Rounded rounded) {
        ImageVector imageVector = _pinDrop;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PinDrop", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveTo(5.45f, 20.0f, 6.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(13.1f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveToRelative(3.27f, 0.0f, 7.0f, 2.46f, 7.0f, 7.15f);
        pathBuilder.curveToRelative(0.0f, 2.98f, -2.13f, 6.12f, -6.39f, 9.39f);
        pathBuilder.curveToRelative(-0.36f, 0.28f, -0.86f, 0.28f, -1.22f, 0.0f);
        pathBuilder.curveTo(7.13f, 15.26f, 5.0f, 12.13f, 5.0f, 9.15f);
        pathBuilder.curveTo(5.0f, 4.46f, 8.73f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinDrop = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
