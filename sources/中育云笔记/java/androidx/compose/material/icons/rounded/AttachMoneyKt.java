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
public final class AttachMoneyKt {
    private static ImageVector _attachMoney;

    public static final ImageVector getAttachMoney(Icons.Rounded rounded) {
        ImageVector imageVector = _attachMoney;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AttachMoney", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.8f, 10.9f);
        pathBuilder.curveToRelative(-2.27f, -0.59f, -3.0f, -1.2f, -3.0f, -2.15f);
        pathBuilder.curveToRelative(0.0f, -1.09f, 1.01f, -1.85f, 2.7f, -1.85f);
        pathBuilder.curveToRelative(1.42f, 0.0f, 2.13f, 0.54f, 2.39f, 1.4f);
        pathBuilder.curveToRelative(0.12f, 0.4f, 0.45f, 0.7f, 0.87f, 0.7f);
        pathBuilder.horizontalLineToRelative(0.3f);
        pathBuilder.curveToRelative(0.66f, 0.0f, 1.13f, -0.65f, 0.9f, -1.27f);
        pathBuilder.curveToRelative(-0.42f, -1.18f, -1.4f, -2.16f, -2.96f, -2.54f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(10.0f, 3.67f, 10.0f, 4.5f);
        pathBuilder.verticalLineToRelative(0.66f);
        pathBuilder.curveToRelative(-1.94f, 0.42f, -3.5f, 1.68f, -3.5f, 3.61f);
        pathBuilder.curveToRelative(0.0f, 2.31f, 1.91f, 3.46f, 4.7f, 4.13f);
        pathBuilder.curveToRelative(2.5f, 0.6f, 3.0f, 1.48f, 3.0f, 2.41f);
        pathBuilder.curveToRelative(0.0f, 0.69f, -0.49f, 1.79f, -2.7f, 1.79f);
        pathBuilder.curveToRelative(-1.65f, 0.0f, -2.5f, -0.59f, -2.83f, -1.43f);
        pathBuilder.curveToRelative(-0.15f, -0.39f, -0.49f, -0.67f, -0.9f, -0.67f);
        pathBuilder.horizontalLineToRelative(-0.28f);
        pathBuilder.curveToRelative(-0.67f, 0.0f, -1.14f, 0.68f, -0.89f, 1.3f);
        pathBuilder.curveToRelative(0.57f, 1.39f, 1.9f, 2.21f, 3.4f, 2.53f);
        pathBuilder.verticalLineToRelative(0.67f);
        pathBuilder.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(-0.65f);
        pathBuilder.curveToRelative(1.95f, -0.37f, 3.5f, -1.5f, 3.5f, -3.55f);
        pathBuilder.curveToRelative(0.0f, -2.84f, -2.43f, -3.81f, -4.7f, -4.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _attachMoney = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
