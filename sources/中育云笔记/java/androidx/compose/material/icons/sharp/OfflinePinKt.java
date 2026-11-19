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
public final class OfflinePinKt {
    private static ImageVector _offlinePin;

    public static final ImageVector getOfflinePin(Icons.Sharp sharp) {
        ImageVector imageVector = _offlinePin;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.OfflinePin", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.lineTo(7.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.3f, 14.0f);
        pathBuilder.lineTo(7.0f, 10.7f);
        pathBuilder.lineToRelative(1.4f, -1.4f);
        pathBuilder.lineToRelative(1.9f, 1.9f);
        pathBuilder.lineToRelative(5.3f, -5.3f);
        pathBuilder.lineTo(17.0f, 7.3f);
        pathBuilder.lineTo(10.3f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _offlinePin = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
