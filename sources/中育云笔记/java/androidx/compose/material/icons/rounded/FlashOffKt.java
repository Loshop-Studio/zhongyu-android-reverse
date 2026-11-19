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
public final class FlashOffKt {
    private static ImageVector _flashOff;

    public static final ImageVector getFlashOff(Icons.Rounded rounded) {
        ImageVector imageVector = _flashOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FlashOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.12f, 11.5f);
        pathBuilder.curveToRelative(0.39f, -0.67f, -0.09f, -1.5f, -0.86f, -1.5f);
        pathBuilder.horizontalLineToRelative(-1.87f);
        pathBuilder.lineToRelative(2.28f, 2.28f);
        pathBuilder.lineToRelative(0.45f, -0.78f);
        pathBuilder.close();
        pathBuilder.moveTo(16.28f, 3.45f);
        pathBuilder.curveToRelative(0.33f, -0.67f, -0.15f, -1.45f, -0.9f, -1.45f);
        pathBuilder.lineTo(8.0f, 2.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(0.61f);
        pathBuilder.lineToRelative(6.13f, 6.13f);
        pathBuilder.lineToRelative(3.15f, -6.29f);
        pathBuilder.close();
        pathBuilder.moveTo(18.44f, 17.88f);
        pathBuilder.lineTo(4.12f, 3.56f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineTo(7.0f, 9.27f);
        pathBuilder.lineTo(7.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(7.15f);
        pathBuilder.curveToRelative(0.0f, 0.51f, 0.67f, 0.69f, 0.93f, 0.25f);
        pathBuilder.lineToRelative(2.65f, -4.55f);
        pathBuilder.lineToRelative(3.44f, 3.44f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.01f, -1.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flashOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
