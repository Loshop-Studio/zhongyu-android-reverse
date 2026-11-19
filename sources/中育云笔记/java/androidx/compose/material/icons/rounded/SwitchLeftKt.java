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
public final class SwitchLeftKt {
    private static ImageVector _switchLeft;

    public static final ImageVector getSwitchLeft(Icons.Rounded rounded) {
        ImageVector imageVector = _switchLeft;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SwitchLeft", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.5f, 8.62f);
        pathBuilder.verticalLineToRelative(6.76f);
        pathBuilder.lineTo(5.12f, 12.0f);
        pathBuilder.lineTo(8.5f, 8.62f);
        pathBuilder.moveTo(3.71f, 11.29f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.59f, 4.59f);
        pathBuilder.curveTo(8.92f, 17.92f, 10.0f, 17.48f, 10.0f, 16.59f);
        pathBuilder.verticalLineTo(7.41f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(3.71f, 11.29f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 7.41f);
        pathBuilder.verticalLineToRelative(9.17f);
        pathBuilder.curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f);
        pathBuilder.lineToRelative(4.59f, -4.59f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-4.59f, -4.59f);
        pathBuilder.curveTo(15.08f, 6.08f, 14.0f, 6.52f, 14.0f, 7.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _switchLeft = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
