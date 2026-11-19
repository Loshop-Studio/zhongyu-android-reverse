package androidx.compose.material.icons.filled;

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
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Filled filled) {
        ImageVector imageVector = _update;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Update", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 10.12f);
        pathBuilder.horizontalLineToRelative(-6.78f);
        pathBuilder.lineToRelative(2.74f, -2.82f);
        pathBuilder.curveToRelative(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f);
        pathBuilder.curveToRelative(-2.73f, 2.71f, -2.73f, 7.08f, 0.0f, 9.79f);
        pathBuilder.reflectiveCurveToRelative(7.15f, 2.71f, 9.88f, 0.0f);
        pathBuilder.curveTo(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f);
        pathBuilder.curveToRelative(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, 0.0f);
        pathBuilder.curveToRelative(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f);
        pathBuilder.reflectiveCurveToRelative(9.14f, -3.47f, 12.65f, 0.0f);
        pathBuilder.lineTo(21.0f, 3.0f);
        pathBuilder.verticalLineTo(10.12f);
        pathBuilder.close();
        pathBuilder.moveTo(12.5f, 8.0f);
        pathBuilder.verticalLineToRelative(4.25f);
        pathBuilder.lineToRelative(3.5f, 2.08f);
        pathBuilder.lineToRelative(-0.72f, 1.21f);
        pathBuilder.lineTo(11.0f, 13.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(12.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _update = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
