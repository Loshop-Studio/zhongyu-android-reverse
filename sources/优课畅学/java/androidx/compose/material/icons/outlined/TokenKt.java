package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class TokenKt {
    private static ImageVector _token;

    public static final ImageVector getToken(Icons.Outlined outlined) {
        ImageVector imageVector = _token;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Token", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 7.0f);
        pathBuilder.lineToRelative(-9.0f, -5.0f);
        pathBuilder.lineTo(3.0f, 7.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.lineToRelative(9.0f, 5.0f);
        pathBuilder.lineToRelative(9.0f, -5.0f);
        pathBuilder.lineTo(21.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 4.29f);
        pathBuilder.lineToRelative(5.91f, 3.28f);
        pathBuilder.lineTo(14.9f, 9.24f);
        pathBuilder.curveTo(14.17f, 8.48f, 13.14f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveTo(9.83f, 8.48f, 9.1f, 9.24f);
        pathBuilder.lineTo(6.09f, 7.57f);
        pathBuilder.lineTo(12.0f, 4.29f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 19.16f);
        pathBuilder.lineToRelative(-6.0f, -3.33f);
        pathBuilder.verticalLineTo(9.26f);
        pathBuilder.lineToRelative(3.13f, 1.74f);
        pathBuilder.curveTo(8.04f, 11.31f, 8.0f, 11.65f, 8.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.86f, 1.27f, 3.43f, 3.0f, 3.87f);
        pathBuilder.verticalLineTo(19.16f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        pathBuilder.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        pathBuilder.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        pathBuilder.reflectiveCurveTo(10.0f, 13.1f, 10.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 19.16f);
        pathBuilder.verticalLineToRelative(-3.28f);
        pathBuilder.curveToRelative(1.73f, -0.44f, 3.0f, -2.01f, 3.0f, -3.87f);
        pathBuilder.curveToRelative(0.0f, -0.35f, -0.04f, -0.69f, -0.13f, -1.01f);
        pathBuilder.lineTo(19.0f, 9.26f);
        pathBuilder.lineToRelative(0.0f, 6.57f);
        pathBuilder.lineTo(13.0f, 19.16f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _token = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
