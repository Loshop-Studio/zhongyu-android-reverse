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
public final class BackHandKt {
    private static ImageVector _backHand;

    public static final ImageVector getBackHand(Icons.Sharp sharp) {
        ImageVector imageVector = _backHand;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BackHand", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.21f, 10.47f);
        pathBuilder.lineTo(5.0f, 9.36f);
        pathBuilder.lineTo(7.25f, 15.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(0.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(1.5f);
        pathBuilder.horizontalLineToRelative(2.5f);
        pathBuilder.verticalLineTo(12.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineTo(4.5f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder.curveToRelative(-3.26f, 0.0f, -6.19f, -1.99f, -7.4f, -5.02f);
        pathBuilder.lineTo(2.21f, 10.47f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _backHand = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
