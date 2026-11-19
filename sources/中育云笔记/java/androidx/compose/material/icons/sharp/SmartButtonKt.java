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
public final class SmartButtonKt {
    private static ImageVector _smartButton;

    public static final ImageVector getSmartButton(Icons.Sharp sharp) {
        ImageVector imageVector = _smartButton;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SmartButton", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineToRelative(0.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 19.0f);
        pathBuilder.lineToRelative(1.09f, -2.41f);
        pathBuilder.lineTo(18.0f, 15.5f);
        pathBuilder.lineToRelative(-2.41f, -1.09f);
        pathBuilder.lineTo(14.5f, 12.0f);
        pathBuilder.lineToRelative(-1.09f, 2.41f);
        pathBuilder.lineTo(11.0f, 15.5f);
        pathBuilder.lineToRelative(2.41f, 1.09f);
        pathBuilder.lineTo(14.5f, 19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 14.0f);
        pathBuilder.lineToRelative(0.62f, -1.38f);
        pathBuilder.lineTo(19.0f, 12.0f);
        pathBuilder.lineToRelative(-1.38f, -0.62f);
        pathBuilder.lineTo(17.0f, 10.0f);
        pathBuilder.lineToRelative(-0.62f, 1.38f);
        pathBuilder.lineTo(15.0f, 12.0f);
        pathBuilder.lineToRelative(1.38f, 0.62f);
        pathBuilder.lineTo(17.0f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _smartButton = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
