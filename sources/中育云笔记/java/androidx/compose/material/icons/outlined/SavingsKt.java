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
public final class SavingsKt {
    private static ImageVector _savings;

    public static final ImageVector getSavings(Icons.Outlined outlined) {
        ImageVector imageVector = _savings;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Savings", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.reflectiveCurveTo(15.0f, 10.55f, 15.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 7.5f);
        pathBuilder.verticalLineToRelative(6.97f);
        pathBuilder.lineToRelative(-2.82f, 0.94f);
        pathBuilder.lineTo(17.5f, 21.0f);
        pathBuilder.lineTo(12.0f, 21.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-5.5f, 0.0f);
        pathBuilder.curveTo(4.5f, 21.0f, 2.0f, 12.54f, 2.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(4.46f, 4.0f, 7.5f, 4.0f);
        pathBuilder.lineToRelative(5.0f, 0.0f);
        pathBuilder.curveToRelative(0.91f, -1.21f, 2.36f, -2.0f, 4.0f, -2.0f);
        pathBuilder.curveTo(17.33f, 2.0f, 18.0f, 2.67f, 18.0f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 0.21f, -0.04f, 0.4f, -0.12f, 0.58f);
        pathBuilder.curveToRelative(-0.14f, 0.34f, -0.26f, 0.73f, -0.32f, 1.15f);
        pathBuilder.lineToRelative(2.27f, 2.27f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 9.5f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineTo(15.5f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -0.65f, 0.09f, -1.29f, 0.26f, -1.91f);
        pathBuilder.curveTo(14.79f, 4.34f, 14.0f, 5.06f, 13.67f, 6.0f);
        pathBuilder.lineTo(7.5f, 6.0f);
        pathBuilder.curveTo(5.57f, 6.0f, 4.0f, 7.57f, 4.0f, 9.5f);
        pathBuilder.curveToRelative(0.0f, 1.88f, 1.22f, 6.65f, 2.01f, 9.5f);
        pathBuilder.lineTo(8.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(2.01f, 0.0f);
        pathBuilder.lineToRelative(1.55f, -5.15f);
        pathBuilder.lineTo(20.0f, 13.03f);
        pathBuilder.verticalLineTo(9.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _savings = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
