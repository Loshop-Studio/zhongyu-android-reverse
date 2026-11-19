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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class StarHalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(Icons.Sharp sharp) {
        ImageVector imageVector = _starHalf;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.StarHalf", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 9.24f);
        pathBuilder.lineToRelative(-7.19f, -0.62f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.lineTo(9.19f, 8.63f);
        pathBuilder.lineTo(2.0f, 9.24f);
        pathBuilder.lineToRelative(5.46f, 4.73f);
        pathBuilder.lineTo(5.82f, 21.0f);
        pathBuilder.lineTo(12.0f, 17.27f);
        pathBuilder.lineTo(18.18f, 21.0f);
        pathBuilder.lineToRelative(-1.63f, -7.03f);
        pathBuilder.lineTo(22.0f, 9.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.4f);
        pathBuilder.verticalLineTo(6.1f);
        pathBuilder.lineToRelative(1.71f, 4.04f);
        pathBuilder.lineToRelative(4.38f, 0.38f);
        pathBuilder.lineToRelative(-3.32f, 2.88f);
        pathBuilder.lineToRelative(1.0f, 4.28f);
        pathBuilder.lineTo(12.0f, 15.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starHalf = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getStarHalf$annotations(Icons.Sharp sharp) {
    }
}
