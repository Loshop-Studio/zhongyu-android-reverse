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
public final class BalanceKt {
    private static ImageVector _balance;

    public static final ImageVector getBalance(Icons.TwoTone twoTone) {
        ImageVector imageVector = _balance;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Balance", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.moveToRelative(-1.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(13.0f, 7.83f);
        pathBuilder2.curveToRelative(0.85f, -0.3f, 1.53f, -0.98f, 1.83f, -1.83f);
        pathBuilder2.horizontalLineTo(18.0f);
        pathBuilder2.lineToRelative(-3.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f);
        pathBuilder2.reflectiveCurveToRelative(3.5f, -1.34f, 3.5f, -3.0f);
        pathBuilder2.lineToRelative(-3.0f, -7.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineTo(4.0f);
        pathBuilder2.horizontalLineToRelative(-6.17f);
        pathBuilder2.curveTo(14.42f, 2.83f, 13.31f, 2.0f, 12.0f, 2.0f);
        pathBuilder2.reflectiveCurveTo(9.58f, 2.83f, 9.17f, 4.0f);
        pathBuilder2.lineTo(3.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.lineToRelative(-3.0f, 7.0f);
        pathBuilder2.curveToRelative(0.0f, 1.66f, 1.57f, 3.0f, 3.5f, 3.0f);
        pathBuilder2.reflectiveCurveTo(9.0f, 14.66f, 9.0f, 13.0f);
        pathBuilder2.lineTo(6.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(3.17f);
        pathBuilder2.curveToRelative(0.3f, 0.85f, 0.98f, 1.53f, 1.83f, 1.83f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.horizontalLineTo(2.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(20.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(-9.0f);
        pathBuilder2.verticalLineTo(7.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.37f, 13.0f);
        pathBuilder2.horizontalLineToRelative(-3.74f);
        pathBuilder2.lineToRelative(1.87f, -4.36f);
        pathBuilder2.lineTo(20.37f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(7.37f, 13.0f);
        pathBuilder2.horizontalLineTo(3.63f);
        pathBuilder2.lineTo(5.5f, 8.64f);
        pathBuilder2.lineTo(7.37f, 13.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.0f, 6.0f);
        pathBuilder2.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder2.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder2.curveTo(13.0f, 5.55f, 12.55f, 6.0f, 12.0f, 6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _balance = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
