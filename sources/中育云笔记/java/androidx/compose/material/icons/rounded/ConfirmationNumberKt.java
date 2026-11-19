package androidx.compose.material.icons.rounded;

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
public final class ConfirmationNumberKt {
    private static ImageVector _confirmationNumber;

    public static final ImageVector getConfirmationNumber(Icons.Rounded rounded) {
        ImageVector imageVector = _confirmationNumber;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ConfirmationNumber", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 8.54f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.lineTo(4.0f, 4.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
        pathBuilder.verticalLineToRelative(2.54f);
        pathBuilder.curveToRelative(0.0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f);
        pathBuilder.curveTo(3.58f, 10.58f, 4.0f, 11.24f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f);
        pathBuilder.curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f);
        pathBuilder.lineTo(2.0f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-2.54f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f);
        pathBuilder.curveToRelative(-0.63f, -0.34f, -1.06f, -1.0f, -1.06f, -1.76f);
        pathBuilder.reflectiveCurveToRelative(0.43f, -1.42f, 1.06f, -1.76f);
        pathBuilder.curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 17.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 8.5f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _confirmationNumber = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
