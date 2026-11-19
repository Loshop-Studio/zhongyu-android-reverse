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
public final class UpdateKt {
    private static ImageVector _update;

    public static final ImageVector getUpdate(Icons.Rounded rounded) {
        ImageVector imageVector = _update;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Update", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 8.75f);
        pathBuilder.verticalLineToRelative(3.68f);
        pathBuilder.curveToRelative(0.0f, 0.35f, 0.19f, 0.68f, 0.49f, 0.86f);
        pathBuilder.lineToRelative(3.12f, 1.85f);
        pathBuilder.curveToRelative(0.36f, 0.21f, 0.82f, 0.09f, 1.03f, -0.26f);
        pathBuilder.curveToRelative(0.21f, -0.36f, 0.1f, -0.82f, -0.26f, -1.03f);
        pathBuilder.lineToRelative(-2.87f, -1.71f);
        pathBuilder.verticalLineToRelative(-3.4f);
        pathBuilder.curveTo(12.5f, 8.34f, 12.16f, 8.0f, 11.75f, 8.0f);
        pathBuilder.reflectiveCurveTo(11.0f, 8.34f, 11.0f, 8.75f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 9.5f);
        pathBuilder.verticalLineTo(4.21f);
        pathBuilder.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        pathBuilder.lineToRelative(-1.78f, 1.78f);
        pathBuilder.curveToRelative(-1.81f, -1.81f, -4.39f, -2.85f, -7.21f, -2.6f);
        pathBuilder.curveToRelative(-4.19f, 0.38f, -7.64f, 3.75f, -8.1f, 7.94f);
        pathBuilder.curveTo(2.46f, 16.4f, 6.69f, 21.0f, 12.0f, 21.0f);
        pathBuilder.curveToRelative(4.59f, 0.0f, 8.38f, -3.44f, 8.93f, -7.88f);
        pathBuilder.curveToRelative(0.07f, -0.6f, -0.4f, -1.12f, -1.0f, -1.12f);
        pathBuilder.curveToRelative(-0.5f, 0.0f, -0.92f, 0.37f, -0.98f, 0.86f);
        pathBuilder.curveToRelative(-0.43f, 3.49f, -3.44f, 6.19f, -7.05f, 6.14f);
        pathBuilder.curveToRelative(-3.71f, -0.05f, -6.84f, -3.18f, -6.9f, -6.9f);
        pathBuilder.curveTo(4.94f, 8.2f, 8.11f, 5.0f, 12.0f, 5.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.68f, 0.79f, 4.95f, 2.05f);
        pathBuilder.lineToRelative(-2.09f, 2.09f);
        pathBuilder.curveTo(14.54f, 9.46f, 14.76f, 10.0f, 15.21f, 10.0f);
        pathBuilder.horizontalLineToRelative(5.29f);
        pathBuilder.curveTo(20.78f, 10.0f, 21.0f, 9.78f, 21.0f, 9.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _update = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
