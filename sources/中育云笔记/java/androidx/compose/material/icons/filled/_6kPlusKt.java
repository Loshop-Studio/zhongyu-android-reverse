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
public final class _6kPlusKt {
    private static ImageVector __6kPlus;

    public static final ImageVector get_6kPlus(Icons.Filled filled) {
        ImageVector imageVector = __6kPlus;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled._6kPlus", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.5f, 12.5f);
        pathBuilder.lineTo(8.0f, 12.5f);
        pathBuilder.lineTo(8.0f, 14.0f);
        pathBuilder.lineTo(6.5f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.lineTo(5.0f, 3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.lineTo(21.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.5f, 10.5f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.lineTo(9.5f, 14.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineTo(6.0f, 15.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 15.0f);
        pathBuilder.horizontalLineToRelative(-1.75f);
        pathBuilder.lineToRelative(-1.75f, -2.25f);
        pathBuilder.lineTo(12.5f, 15.0f);
        pathBuilder.lineTo(11.0f, 15.0f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(2.25f);
        pathBuilder.lineTo(14.25f, 9.0f);
        pathBuilder.lineTo(16.0f, 9.0f);
        pathBuilder.lineToRelative(-2.25f, 3.0f);
        pathBuilder.lineTo(16.0f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 12.5f);
        pathBuilder.horizontalLineToRelative(-1.5f);
        pathBuilder.lineTo(18.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.lineTo(16.0f, 12.5f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.lineTo(17.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.verticalLineToRelative(1.5f);
        pathBuilder.lineTo(20.0f, 11.5f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __6kPlus = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
