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
public final class OpenWithKt {
    private static ImageVector _openWith;

    public static final ImageVector getOpenWith(Icons.Filled filled) {
        ImageVector imageVector = _openWith;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.OpenWith", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(14.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineToRelative(-5.0f, -5.0f);
        pathBuilder.lineToRelative(-5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 10.0f);
        pathBuilder.lineTo(6.0f, 10.0f);
        pathBuilder.lineTo(6.0f, 7.0f);
        pathBuilder.lineToRelative(-5.0f, 5.0f);
        pathBuilder.lineToRelative(5.0f, 5.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 12.0f);
        pathBuilder.lineToRelative(-5.0f, -5.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.lineTo(7.0f, 18.0f);
        pathBuilder.lineToRelative(5.0f, 5.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openWith = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
