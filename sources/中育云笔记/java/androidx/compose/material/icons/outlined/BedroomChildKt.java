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
public final class BedroomChildKt {
    private static ImageVector _bedroomChild;

    public static final ImageVector getBedroomChild(Icons.Outlined outlined) {
        ImageVector imageVector = _bedroomChild;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BedroomChild", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.5f, 10.67f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(1.67f);
        pathBuilder.curveToRelative(-0.88f, 0.35f, -1.5f, 1.2f, -1.5f, 2.2f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(1.5f);
        pathBuilder.verticalLineToRelative(-1.5f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineToRelative(-4.13f);
        pathBuilder.curveTo(18.0f, 11.87f, 17.38f, 11.02f, 16.5f, 10.67f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 8.5f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.5f, 12.87f);
        pathBuilder.curveTo(7.5f, 12.39f, 7.89f, 12.0f, 8.37f, 12.0f);
        pathBuilder.horizontalLineToRelative(7.27f);
        pathBuilder.curveToRelative(0.48f, 0.0f, 0.87f, 0.39f, 0.87f, 0.87f);
        pathBuilder.verticalLineTo(14.0f);
        pathBuilder.horizontalLineToRelative(-9.0f);
        pathBuilder.verticalLineToRelative(-1.13f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomChild = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
