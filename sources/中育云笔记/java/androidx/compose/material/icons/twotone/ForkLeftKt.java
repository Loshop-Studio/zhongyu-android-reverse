package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class ForkLeftKt {
    private static ImageVector _forkLeft;

    public static final ImageVector getForkLeft(Icons.TwoTone twoTone) {
        ImageVector imageVector = _forkLeft;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ForkLeft", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.41f, 15.59f);
        pathBuilder.lineTo(8.0f, 17.0f);
        pathBuilder.lineToRelative(-4.0f, -4.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(7.83f, 12.0f);
        pathBuilder.curveToRelative(1.51f, -0.33f, 3.73f, 0.08f, 5.17f, 1.36f);
        pathBuilder.lineToRelative(0.0f, -6.53f);
        pathBuilder.lineToRelative(-1.59f, 1.59f);
        pathBuilder.lineTo(10.0f, 7.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.lineToRelative(4.0f, 4.0f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(15.0f, 6.83f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.lineToRelative(-2.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(-0.73f, -2.58f, -3.07f, -3.47f, -5.17f, -3.0f);
        pathBuilder.lineTo(9.41f, 15.59f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forkLeft = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
