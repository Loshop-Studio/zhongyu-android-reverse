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
public final class NatKt {
    private static ImageVector _nat;

    public static final ImageVector getNat(Icons.Rounded rounded) {
        ImageVector imageVector = _nat;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Nat", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.82f, 13.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(6.82f);
        pathBuilder.curveTo(6.4f, 9.84f, 5.3f, 9.0f, 4.0f, 9.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.curveTo(5.3f, 15.0f, 6.4f, 14.16f, 6.82f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 13.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveTo(5.0f, 12.55f, 4.55f, 13.0f, 4.0f, 13.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(22.47f, 12.4f);
        pathBuilder2.curveToRelative(0.27f, -0.2f, 0.27f, -0.6f, 0.0f, -0.8f);
        pathBuilder2.lineTo(19.0f, 9.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(-4.05f);
        pathBuilder2.curveToRelative(-0.47f, -4.69f, -4.16f, -8.42f, -8.83f, -8.94f);
        pathBuilder2.curveTo(5.52f, 2.0f, 5.0f, 2.46f, 5.0f, 3.06f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f);
        pathBuilder2.curveTo(9.88f, 4.48f, 13.0f, 7.87f, 13.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-3.12f, 7.52f, -7.13f, 7.95f);
        pathBuilder2.curveTo(5.37f, 20.01f, 5.0f, 20.44f, 5.0f, 20.94f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.curveToRelative(0.0f, 0.6f, 0.52f, 1.07f, 1.11f, 1.0f);
        pathBuilder2.curveToRelative(4.67f, -0.52f, 8.37f, -4.25f, 8.83f, -8.94f);
        pathBuilder2.horizontalLineTo(19.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.lineTo(22.47f, 12.4f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nat = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
