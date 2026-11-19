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
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.Outlined outlined) {
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalLibrary", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 9.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 11.55f);
        pathBuilder.curveTo(9.64f, 9.35f, 6.48f, 8.0f, 3.0f, 8.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.curveToRelative(3.48f, 0.0f, 6.64f, 1.35f, 9.0f, 3.55f);
        pathBuilder.curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9.0f, -3.55f);
        pathBuilder.lineTo(21.0f, 8.0f);
        pathBuilder.curveToRelative(-3.48f, 0.0f, -6.64f, 1.35f, -9.0f, 3.55f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.13f);
        pathBuilder.curveToRelative(-2.53f, 0.34f, -4.93f, 1.3f, -7.0f, 2.82f);
        pathBuilder.curveToRelative(-2.06f, -1.52f, -4.47f, -2.49f, -7.0f, -2.83f);
        pathBuilder.verticalLineToRelative(-6.95f);
        pathBuilder.curveToRelative(2.1f, 0.38f, 4.05f, 1.35f, 5.64f, 2.83f);
        pathBuilder.lineTo(12.0f, 14.28f);
        pathBuilder.lineToRelative(1.36f, -1.27f);
        pathBuilder.curveToRelative(1.59f, -1.48f, 3.54f, -2.45f, 5.64f, -2.83f);
        pathBuilder.verticalLineToRelative(6.95f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLibrary = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
