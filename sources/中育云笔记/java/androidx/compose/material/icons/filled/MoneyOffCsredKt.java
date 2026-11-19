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
public final class MoneyOffCsredKt {
    private static ImageVector _moneyOffCsred;

    public static final ImageVector getMoneyOffCsred(Icons.Filled filled) {
        ImageVector imageVector = _moneyOffCsred;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MoneyOffCsred", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.53f, 7.43f);
        pathBuilder.curveToRelative(0.42f, -0.31f, 0.93f, -0.47f, 1.54f, -0.47f);
        pathBuilder.reflectiveCurveToRelative(1.11f, 0.16f, 1.5f, 0.49f);
        pathBuilder.curveToRelative(0.39f, 0.32f, 0.65f, 0.7f, 0.79f, 1.12f);
        pathBuilder.lineToRelative(1.89f, -0.8f);
        pathBuilder.curveToRelative(-0.24f, -0.71f, -0.71f, -1.35f, -1.4f, -1.92f);
        pathBuilder.curveToRelative(-0.5f, -0.4f, -1.12f, -0.65f, -1.85f, -0.77f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.11f);
        pathBuilder.curveToRelative(-0.41f, 0.08f, -0.79f, 0.21f, -1.14f, 0.39f);
        pathBuilder.curveToRelative(-0.35f, 0.18f, -0.64f, 0.39f, -0.9f, 0.63f);
        pathBuilder.lineToRelative(1.43f, 1.43f);
        pathBuilder.curveTo(10.43f, 7.52f, 10.48f, 7.47f, 10.53f, 7.43f);
        pathBuilder.close();
        pathBuilder.moveTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(12.35f, 12.35f);
        pathBuilder.curveTo(13.31f, 16.85f, 12.79f, 17.0f, 12.19f, 17.0f);
        pathBuilder.curveToRelative(-0.71f, 0.0f, -1.32f, -0.23f, -1.83f, -0.7f);
        pathBuilder.curveToRelative(-0.5f, -0.47f, -0.86f, -1.07f, -1.06f, -1.81f);
        pathBuilder.lineToRelative(-1.98f, 0.8f);
        pathBuilder.curveToRelative(0.34f, 1.17f, 0.95f, 2.08f, 1.83f, 2.73f);
        pathBuilder.curveToRelative(0.57f, 0.42f, 1.19f, 0.68f, 1.85f, 0.83f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.08f);
        pathBuilder.curveToRelative(0.44f, -0.07f, 0.87f, -0.17f, 1.29f, -0.35f);
        pathBuilder.curveToRelative(0.34f, -0.14f, 0.64f, -0.32f, 0.92f, -0.53f);
        pathBuilder.lineToRelative(4.57f, 4.57f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _moneyOffCsred = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
