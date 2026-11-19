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
public final class FastfoodKt {
    private static ImageVector _fastfood;

    public static final ImageVector getFastfood(Icons.Sharp sharp) {
        ImageVector imageVector = _fastfood;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Fastfood", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.0f, 5.0f);
        pathBuilder.verticalLineTo(1.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(0.23f, 2.31f);
        pathBuilder.curveTo(14.9f, 8.16f, 18.0f, 10.77f, 18.0f, 15.0f);
        pathBuilder.lineToRelative(0.02f, 8.0f);
        pathBuilder.horizontalLineToRelative(3.18f);
        pathBuilder.lineTo(23.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 21.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 8.99f);
        pathBuilder.curveTo(4.75f, 8.99f, 1.0f, 11.0f, 1.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.curveToRelative(0.0f, -4.0f, -3.75f, -6.01f, -7.5f, -6.01f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(15.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fastfood = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
