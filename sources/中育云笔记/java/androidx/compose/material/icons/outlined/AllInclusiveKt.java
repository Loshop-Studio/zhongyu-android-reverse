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
public final class AllInclusiveKt {
    private static ImageVector _allInclusive;

    public static final ImageVector getAllInclusive(Icons.Outlined outlined) {
        ImageVector imageVector = _allInclusive;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AllInclusive", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.6f, 6.62f);
        pathBuilder.curveToRelative(-1.44f, 0.0f, -2.8f, 0.56f, -3.77f, 1.53f);
        pathBuilder.lineTo(7.8f, 14.39f);
        pathBuilder.curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f);
        pathBuilder.curveToRelative(-1.87f, 0.0f, -3.39f, -1.51f, -3.39f, -3.38f);
        pathBuilder.reflectiveCurveTo(3.53f, 8.62f, 5.4f, 8.62f);
        pathBuilder.curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f);
        pathBuilder.lineToRelative(1.13f, 1.0f);
        pathBuilder.lineToRelative(1.51f, -1.34f);
        pathBuilder.lineTo(9.22f, 8.2f);
        pathBuilder.curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f);
        pathBuilder.curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f);
        pathBuilder.curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f);
        pathBuilder.lineToRelative(7.03f, -6.24f);
        pathBuilder.curveToRelative(0.64f, -0.64f, 1.49f, -0.99f, 2.4f, -0.99f);
        pathBuilder.curveToRelative(1.87f, 0.0f, 3.39f, 1.51f, 3.39f, 3.38f);
        pathBuilder.reflectiveCurveToRelative(-1.52f, 3.38f, -3.39f, 3.38f);
        pathBuilder.curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f);
        pathBuilder.lineToRelative(-1.14f, -1.01f);
        pathBuilder.lineToRelative(-1.51f, 1.34f);
        pathBuilder.lineToRelative(1.27f, 1.12f);
        pathBuilder.curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f);
        pathBuilder.curveToRelative(2.98f, 0.0f, 5.4f, -2.41f, 5.4f, -5.38f);
        pathBuilder.reflectiveCurveToRelative(-2.42f, -5.37f, -5.4f, -5.37f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _allInclusive = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
