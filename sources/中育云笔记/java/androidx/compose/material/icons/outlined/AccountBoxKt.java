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
public final class AccountBoxKt {
    private static ImageVector _accountBox;

    public static final ImageVector getAccountBox(Icons.Outlined outlined) {
        ImageVector imageVector = _accountBox;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AccountBox", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 19.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-0.24f);
        pathBuilder.curveTo(8.42f, 17.62f, 10.16f, 17.0f, 12.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 0.62f, 5.0f, 1.76f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.86f);
        pathBuilder.curveTo(17.2f, 16.09f, 14.73f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(-5.2f, 1.09f, -7.0f, 2.86f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(17.86f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 13.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilder.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 8.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        pathBuilder.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountBox = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
