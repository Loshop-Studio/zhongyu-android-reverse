package androidx.compose.material.icons.sharp;

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
public final class RecyclingKt {
    private static ImageVector _recycling;

    public static final ImageVector getRecycling(Icons.Sharp sharp) {
        ImageVector imageVector = _recycling;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Recycling", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.77f, 7.15f);
        pathBuilder.lineTo(7.2f, 4.78f);
        pathBuilder.lineToRelative(1.03f, -1.71f);
        pathBuilder.curveToRelative(0.39f, -0.65f, 1.33f, -0.65f, 1.72f, 0.0f);
        pathBuilder.lineToRelative(1.48f, 2.46f);
        pathBuilder.lineToRelative(-1.23f, 2.06f);
        pathBuilder.lineTo(9.2f, 9.21f);
        pathBuilder.lineTo(5.77f, 7.15f);
        pathBuilder.close();
        pathBuilder.moveTo(21.72f, 12.97f);
        pathBuilder.lineToRelative(-1.6f, -2.66f);
        pathBuilder.lineToRelative(-3.46f, 2.0f);
        pathBuilder.lineTo(18.87f, 16.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        pathBuilder.curveTo(21.93f, 14.61f, 22.0f, 14.31f, 22.0f, 14.0f);
        pathBuilder.curveTo(22.0f, 13.64f, 21.9f, 13.29f, 21.72f, 12.97f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.curveToRelative(0.76f, 0.0f, 1.45f, -0.43f, 1.79f, -1.11f);
        pathBuilder.lineTo(20.74f, 17.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-4.0f, 4.0f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 17.0f);
        pathBuilder.horizontalLineTo(5.7f);
        pathBuilder.lineToRelative(-0.84f, 1.41f);
        pathBuilder.curveToRelative(-0.3f, 0.5f, -0.32f, 1.12f, -0.06f, 1.65f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(5.08f, 20.63f, 5.67f, 21.0f, 6.32f, 21.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.12f, 14.35f);
        pathBuilder.lineToRelative(1.73f, 1.04f);
        pathBuilder.lineTo(6.48f, 9.9f);
        pathBuilder.lineTo(1.0f, 11.27f);
        pathBuilder.lineToRelative(1.7f, 1.02f);
        pathBuilder.lineToRelative(-0.41f, 0.69f);
        pathBuilder.curveToRelative(-0.35f, 0.59f, -0.38f, 1.31f, -0.07f, 1.92f);
        pathBuilder.lineToRelative(1.63f, 3.26f);
        pathBuilder.lineTo(6.12f, 14.35f);
        pathBuilder.close();
        pathBuilder.moveTo(17.02f, 5.14f);
        pathBuilder.lineToRelative(-1.3f, -2.17f);
        pathBuilder.curveTo(15.35f, 2.37f, 14.7f, 2.0f, 14.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-3.53f);
        pathBuilder.lineToRelative(3.12f, 5.2f);
        pathBuilder.lineToRelative(-1.72f, 1.03f);
        pathBuilder.lineToRelative(5.49f, 1.37f);
        pathBuilder.lineToRelative(1.37f, -5.49f);
        pathBuilder.lineTo(17.02f, 5.14f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recycling = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
