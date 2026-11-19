package androidx.compose.material.icons.filled;

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
public final class BusAlertKt {
    private static ImageVector _busAlert;

    public static final ImageVector getBusAlert(Icons.Filled filled) {
        ImageVector imageVector = _busAlert;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.BusAlert", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 1.0f);
        pathBuilder.arcToRelative(7.0f, 7.0f, 0.0f, false, false, -5.78f, 3.05f);
        pathBuilder.lineToRelative(0.02f, -0.03f);
        pathBuilder.curveTo(9.84f, 4.0f, 9.42f, 4.0f, 9.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        pathBuilder.lineTo(2.0f, 22.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.78f);
        pathBuilder.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        pathBuilder.verticalLineToRelative(-3.08f);
        pathBuilder.arcTo(7.0f, 7.0f, 0.0f, false, false, 16.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 19.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.0f, 13.0f);
        pathBuilder.lineTo(3.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 1.96f, 0.81f, 3.73f, 2.11f, 5.0f);
        pathBuilder.lineTo(3.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.5f, 19.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 13.0f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f);
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
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _busAlert = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
