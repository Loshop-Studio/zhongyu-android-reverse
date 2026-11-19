package androidx.compose.material.icons.rounded;

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
public final class CurrencyRupeeKt {
    private static ImageVector _currencyRupee;

    public static final ImageVector getCurrencyRupee(Icons.Rounded rounded) {
        ImageVector imageVector = _currencyRupee;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyRupee", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.5f, 14.0f);
        pathBuilder.horizontalLineTo(9.77f);
        pathBuilder.lineToRelative(5.1f, 5.31f);
        pathBuilder.curveToRelative(0.61f, 0.64f, 0.16f, 1.69f, -0.72f, 1.69f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.53f, -0.11f, -0.72f, -0.31f);
        pathBuilder.lineTo(7.4f, 14.41f);
        pathBuilder.curveTo(7.14f, 14.15f, 7.0f, 13.79f, 7.0f, 13.43f);
        pathBuilder.curveTo(7.0f, 12.64f, 7.64f, 12.0f, 8.43f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.07f);
        pathBuilder.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        pathBuilder.lineTo(7.0f, 9.0f);
        pathBuilder.curveTo(6.45f, 9.0f, 6.0f, 8.55f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.lineToRelative(6.66f, 0.0f);
        pathBuilder.curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.curveTo(6.45f, 5.0f, 6.0f, 4.55f, 6.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineToRelative(-2.26f, 0.0f);
        pathBuilder.curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f);
        pathBuilder.lineTo(17.0f, 7.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineToRelative(-1.02f, 0.0f);
        pathBuilder.curveTo(15.72f, 11.8f, 13.36f, 14.0f, 10.5f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyRupee = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
