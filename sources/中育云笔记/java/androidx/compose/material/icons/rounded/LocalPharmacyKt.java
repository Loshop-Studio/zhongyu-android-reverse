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
public final class LocalPharmacyKt {
    private static ImageVector _localPharmacy;

    public static final ImageVector getLocalPharmacy(Icons.Rounded rounded) {
        ImageVector imageVector = _localPharmacy;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalPharmacy", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.89f, 5.0f);
        pathBuilder.horizontalLineToRelative(-0.53f);
        pathBuilder.lineToRelative(0.71f, -1.97f);
        pathBuilder.curveToRelative(0.24f, -0.65f, -0.1f, -1.37f, -0.75f, -1.6f);
        pathBuilder.curveToRelative(-0.65f, -0.24f, -1.37f, 0.1f, -1.61f, 0.75f);
        pathBuilder.lineTo(15.69f, 5.0f);
        pathBuilder.horizontalLineTo(5.1f);
        pathBuilder.curveTo(3.73f, 5.0f, 2.77f, 6.34f, 3.2f, 7.63f);
        pathBuilder.lineTo(5.0f, 13.0f);
        pathBuilder.lineToRelative(-1.79f, 5.37f);
        pathBuilder.curveTo(2.77f, 19.66f, 3.74f, 21.0f, 5.1f, 21.0f);
        pathBuilder.horizontalLineToRelative(13.78f);
        pathBuilder.curveToRelative(1.36f, 0.0f, 2.33f, -1.34f, 1.9f, -2.63f);
        pathBuilder.lineTo(19.0f, 13.0f);
        pathBuilder.lineToRelative(1.78f, -5.37f);
        pathBuilder.curveTo(21.21f, 6.34f, 20.25f, 5.0f, 18.89f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPharmacy = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
