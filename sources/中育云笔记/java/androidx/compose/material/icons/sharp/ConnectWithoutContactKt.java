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
public final class ConnectWithoutContactKt {
    private static ImageVector _connectWithoutContact;

    public static final ImageVector getConnectWithoutContact(Icons.Sharp sharp) {
        ImageVector imageVector = _connectWithoutContact;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ConnectWithoutContact", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 14.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveTo(14.13f, 7.0f, 11.0f, 10.13f, 11.0f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 11.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveTo(15.0f, 12.34f, 16.34f, 11.0f, 18.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveTo(3.0f, 2.89f, 3.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 5.11f, 7.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.45f, 4.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveTo(9.21f, 5.92f, 7.99f, 7.0f, 6.5f, 7.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineTo(8.74f);
        pathBuilder.curveTo(9.86f, 8.15f, 11.25f, 6.51f, 11.45f, 4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.0f);
        pathBuilder.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(17.89f, 17.0f, 19.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.5f, 18.0f);
        pathBuilder.curveToRelative(-1.49f, 0.0f, -2.71f, -1.08f, -2.95f, -2.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.2f, 2.01f, 1.59f, 3.65f, 3.45f, 4.24f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(17.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectWithoutContact = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
