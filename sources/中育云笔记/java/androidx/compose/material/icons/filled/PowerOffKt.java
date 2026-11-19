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
public final class PowerOffKt {
    private static ImageVector _powerOff;

    public static final ImageVector getPowerOff(Icons.Filled filled) {
        ImageVector imageVector = _powerOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PowerOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 14.49f);
        pathBuilder.lineTo(18.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -1.0f, -1.01f, -2.01f, -2.0f, -2.0f);
        pathBuilder.lineTo(16.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(10.0f, 3.0f);
        pathBuilder.lineTo(8.0f, 3.0f);
        pathBuilder.verticalLineToRelative(2.48f);
        pathBuilder.lineToRelative(9.51f, 9.5f);
        pathBuilder.lineToRelative(0.49f, -0.49f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 16.26f);
        pathBuilder.lineTo(7.2f, 7.2f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.lineTo(3.98f, 4.0f);
        pathBuilder.lineTo(2.71f, 5.25f);
        pathBuilder.lineToRelative(3.36f, 3.36f);
        pathBuilder.curveTo(6.04f, 8.74f, 6.0f, 8.87f, 6.0f, 9.0f);
        pathBuilder.verticalLineToRelative(5.48f);
        pathBuilder.lineTo(9.5f, 18.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.lineToRelative(0.48f, -0.48f);
        pathBuilder.lineTo(19.45f, 22.0f);
        pathBuilder.lineToRelative(1.26f, -1.28f);
        pathBuilder.lineToRelative(-4.47f, -4.46f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _powerOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
