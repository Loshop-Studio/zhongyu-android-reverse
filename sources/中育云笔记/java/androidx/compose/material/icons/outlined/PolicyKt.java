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
public final class PolicyKt {
    private static ImageVector _policy;

    public static final ImageVector getPolicy(Icons.Outlined outlined) {
        ImageVector imageVector = _policy;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Policy", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.lineTo(3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineTo(12.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 11.0f);
        pathBuilder.curveToRelative(0.0f, 1.85f, -0.51f, 3.65f, -1.38f, 5.21f);
        pathBuilder.lineToRelative(-1.45f, -1.45f);
        pathBuilder.curveToRelative(1.29f, -1.94f, 1.07f, -4.58f, -0.64f, -6.29f);
        pathBuilder.curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0.0f);
        pathBuilder.curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.0f, 7.07f);
        pathBuilder.curveToRelative(1.71f, 1.71f, 4.35f, 1.92f, 6.29f, 0.64f);
        pathBuilder.lineToRelative(1.72f, 1.72f);
        pathBuilder.curveToRelative(-1.19f, 1.42f, -2.73f, 2.51f, -4.47f, 3.04f);
        pathBuilder.curveTo(7.98f, 19.69f, 5.0f, 15.52f, 5.0f, 11.0f);
        pathBuilder.verticalLineTo(6.3f);
        pathBuilder.lineToRelative(7.0f, -3.11f);
        pathBuilder.lineToRelative(7.0f, 3.11f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.0f);
        pathBuilder.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        pathBuilder.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        pathBuilder.reflectiveCurveTo(13.66f, 15.0f, 12.0f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _policy = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
