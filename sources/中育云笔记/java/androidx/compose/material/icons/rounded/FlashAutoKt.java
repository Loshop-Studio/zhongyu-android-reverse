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
public final class FlashAutoKt {
    private static ImageVector _flashAuto;

    public static final ImageVector getFlashAuto(Icons.Rounded rounded) {
        ImageVector imageVector = _flashAuto;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlashAuto", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(7.15f);
        pathBuilder.curveToRelative(0.0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f);
        pathBuilder.lineToRelative(5.19f, -8.9f);
        pathBuilder.curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f);
        pathBuilder.lineTo(9.0f, 11.0f);
        pathBuilder.lineToRelative(3.38f, -7.59f);
        pathBuilder.curveToRelative(0.29f, -0.67f, -0.2f, -1.41f, -0.92f, -1.41f);
        pathBuilder.lineTo(4.0f, 2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 2.0f);
        pathBuilder.curveToRelative(-0.6f, 0.0f, -1.13f, 0.38f, -1.34f, 0.94f);
        pathBuilder.lineTo(14.22f, 9.8f);
        pathBuilder.curveToRelative(-0.2f, 0.59f, 0.23f, 1.2f, 0.85f, 1.2f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.72f, -0.24f, 0.84f, -0.6f);
        pathBuilder.lineTo(16.4f, 9.0f);
        pathBuilder.horizontalLineToRelative(3.2f);
        pathBuilder.lineToRelative(0.49f, 1.4f);
        pathBuilder.curveToRelative(0.13f, 0.36f, 0.46f, 0.6f, 0.84f, 0.6f);
        pathBuilder.curveToRelative(0.62f, 0.0f, 1.05f, -0.61f, 0.84f, -1.19f);
        pathBuilder.lineToRelative(-2.44f, -6.86f);
        pathBuilder.curveTo(19.13f, 2.38f, 18.6f, 2.0f, 18.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.85f, 7.65f);
        pathBuilder.lineTo(18.0f, 4.0f);
        pathBuilder.lineToRelative(1.15f, 3.65f);
        pathBuilder.horizontalLineToRelative(-2.3f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flashAuto = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
