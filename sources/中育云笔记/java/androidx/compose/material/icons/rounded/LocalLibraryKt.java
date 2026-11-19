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
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.Rounded rounded) {
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalLibrary", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 11.55f);
        pathBuilder.curveToRelative(-1.82f, -1.7f, -4.12f, -2.89f, -6.68f, -3.35f);
        pathBuilder.curveTo(4.11f, 7.99f, 3.0f, 8.95f, 3.0f, 10.18f);
        pathBuilder.verticalLineToRelative(6.24f);
        pathBuilder.curveToRelative(0.0f, 1.68f, 0.72f, 2.56f, 1.71f, 2.69f);
        pathBuilder.curveToRelative(2.5f, 0.32f, 4.77f, 1.35f, 6.63f, 2.87f);
        pathBuilder.curveToRelative(0.35f, 0.29f, 0.92f, 0.32f, 1.27f, 0.04f);
        pathBuilder.curveToRelative(1.87f, -1.53f, 4.16f, -2.58f, 6.68f, -2.9f);
        pathBuilder.curveToRelative(0.94f, -0.13f, 1.71f, -1.06f, 1.71f, -2.02f);
        pathBuilder.verticalLineToRelative(-6.92f);
        pathBuilder.curveToRelative(0.0f, -1.23f, -1.11f, -2.19f, -2.32f, -1.98f);
        pathBuilder.curveToRelative(-2.56f, 0.46f, -4.86f, 1.65f, -6.68f, 3.35f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLibrary = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
