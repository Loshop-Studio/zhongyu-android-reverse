package androidx.compose.material.icons.outlined;

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
public final class WbIncandescentKt {
    private static ImageVector _wbIncandescent;

    public static final ImageVector getWbIncandescent(Icons.Outlined outlined) {
        ImageVector imageVector = _wbIncandescent;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WbIncandescent", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.55f, 19.09f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineToRelative(1.79f, -1.8f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(1.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 4.05f);
        pathBuilder.verticalLineToRelative(3.96f);
        pathBuilder.lineToRelative(1.0f, 0.58f);
        pathBuilder.curveToRelative(1.24f, 0.72f, 2.0f, 2.04f, 2.0f, 3.46f);
        pathBuilder.curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -1.42f, 0.77f, -2.74f, 2.0f, -3.46f);
        pathBuilder.lineToRelative(1.0f, -0.58f);
        pathBuilder.lineTo(11.0f, 4.05f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.moveToRelative(2.0f, -2.0f);
        pathBuilder.lineTo(9.0f, 2.05f);
        pathBuilder.verticalLineToRelative(4.81f);
        pathBuilder.curveTo(7.21f, 7.9f, 6.0f, 9.83f, 6.0f, 12.05f);
        pathBuilder.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f);
        pathBuilder.lineTo(15.0f, 2.05f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.24f, 18.71f);
        pathBuilder.lineToRelative(1.79f, 1.8f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-1.8f, -1.79f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbIncandescent = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
