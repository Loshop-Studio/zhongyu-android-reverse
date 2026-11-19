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
public final class FlashAutoKt {
    private static ImageVector _flashAuto;

    public static final ImageVector getFlashAuto(Icons.Sharp sharp) {
        ImageVector imageVector = _flashAuto;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FlashAuto", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(9.0f);
        pathBuilder.lineToRelative(7.0f, -12.0f);
        pathBuilder.lineTo(9.0f, 11.0f);
        pathBuilder.lineToRelative(4.0f, -9.0f);
        pathBuilder.lineTo(3.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(-3.2f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.9f);
        pathBuilder.lineToRelative(0.7f, -2.0f);
        pathBuilder.horizontalLineToRelative(3.2f);
        pathBuilder.lineToRelative(0.7f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.9f);
        pathBuilder.lineTo(19.0f, 2.0f);
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
