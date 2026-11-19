package androidx.compose.material.icons.filled;

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
public final class TaxiAlertKt {
    private static ImageVector _taxiAlert;

    public static final ImageVector getTaxiAlert(Icons.Filled filled) {
        ImageVector imageVector = _taxiAlert;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TaxiAlert", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 8.0f);
        pathBuilder.arcTo(7.0f, 7.0f, 0.0f, false, false, 9.68f, 5.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(4.5f, 7.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.42f, 1.01f);
        pathBuilder.lineTo(1.0f, 14.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-7.68f);
        pathBuilder.arcTo(7.01f, 7.01f, 0.0f, false, false, 23.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 8.5f);
        pathBuilder.horizontalLineToRelative(4.53f);
        pathBuilder.arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.08f, 4.5f);
        pathBuilder.lineTo(3.0f, 13.0f);
        pathBuilder.lineToRelative(1.5f, -4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 18.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 18.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.43f, 12.37f);
        pathBuilder.lineToRelative(-0.21f, 0.11f);
        pathBuilder.lineToRelative(-0.18f, 0.09f);
        pathBuilder.arcToRelative(4.97f, 4.97f, 0.0f, false, true, -0.42f, 0.16f);
        pathBuilder.lineToRelative(-0.22f, 0.07f);
        pathBuilder.lineToRelative(-0.23f, 0.06f);
        pathBuilder.lineToRelative(-0.2f, 0.05f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.94f, -4.41f);
        pathBuilder.arcTo(4.07f, 4.07f, 0.0f, false, true, 11.0f, 8.0f);
        pathBuilder.lineToRelative(0.02f, -0.47f);
        pathBuilder.lineToRelative(0.02f, -0.17f);
        pathBuilder.lineToRelative(0.04f, -0.28f);
        pathBuilder.lineToRelative(0.04f, -0.21f);
        pathBuilder.lineToRelative(0.05f, -0.21f);
        pathBuilder.lineToRelative(0.07f, -0.24f);
        pathBuilder.lineToRelative(0.05f, -0.13f);
        pathBuilder.arcToRelative(4.99f, 4.99f, 0.0f, false, true, 9.69f, 1.7f);
        pathBuilder.arcToRelative(4.96f, 4.96f, 0.0f, false, true, -2.55f, 4.38f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _taxiAlert = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
