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
public final class GroupOffKt {
    private static ImageVector _groupOff;

    public static final ImageVector getGroupOff(Icons.Outlined outlined) {
        ImageVector imageVector = _groupOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GroupOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, -1.42f, -0.5f, -2.73f, -1.33f, -3.76f);
        pathBuilder.curveTo(14.09f, 4.1f, 14.53f, 4.0f, 15.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f);
        pathBuilder.curveToRelative(-0.06f, 0.0f, -0.12f, 0.0f, -0.18f, 0.0f);
        pathBuilder.lineToRelative(-0.77f, -0.77f);
        pathBuilder.curveTo(14.65f, 10.29f, 15.0f, 9.18f, 15.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.83f, 20.0f);
        pathBuilder.horizontalLineTo(23.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -2.18f, -3.58f, -3.47f, -6.34f, -3.87f);
        pathBuilder.curveToRelative(1.1f, 0.75f, 1.95f, 1.71f, 2.23f, 2.94f);
        pathBuilder.lineTo(22.83f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 6.0f);
        pathBuilder.curveTo(8.94f, 6.0f, 8.89f, 6.0f, 8.84f, 6.01f);
        pathBuilder.lineToRelative(-1.6f, -1.6f);
        pathBuilder.curveTo(7.77f, 4.15f, 8.37f, 4.0f, 9.0f, 4.0f);
        pathBuilder.curveToRelative(2.21f, 0.0f, 4.0f, 1.79f, 4.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, 0.63f, -0.15f, 1.23f, -0.41f, 1.76f);
        pathBuilder.lineToRelative(-1.6f, -1.6f);
        pathBuilder.curveTo(11.0f, 8.11f, 11.0f, 8.06f, 11.0f, 8.0f);
        pathBuilder.curveTo(11.0f, 6.9f, 10.1f, 6.0f, 9.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.17f, 12.0f);
        pathBuilder.curveTo(9.11f, 12.0f, 9.06f, 12.0f, 9.0f, 12.0f);
        pathBuilder.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        pathBuilder.curveToRelative(0.0f, -0.06f, 0.0f, -0.11f, 0.0f, -0.17f);
        pathBuilder.lineTo(0.69f, 3.51f);
        pathBuilder.lineTo(2.1f, 2.1f);
        pathBuilder.lineToRelative(19.8f, 19.8f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineTo(17.0f, 19.83f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(0.0f, -2.66f, 5.33f, -4.0f, 8.0f, -4.0f);
        pathBuilder.curveToRelative(0.37f, 0.0f, 0.8f, 0.03f, 1.25f, 0.08f);
        pathBuilder.lineTo(9.17f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.0f, 15.0f);
        pathBuilder.curveToRelative(-2.7f, 0.0f, -5.8f, 1.29f, -6.0f, 2.01f);
        pathBuilder.verticalLineTo(18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(-0.17f);
        pathBuilder.lineToRelative(-2.11f, -2.11f);
        pathBuilder.curveTo(11.76f, 15.31f, 10.33f, 15.0f, 9.0f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _groupOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
