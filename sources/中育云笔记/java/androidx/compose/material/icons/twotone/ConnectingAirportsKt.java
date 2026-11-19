package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class ConnectingAirportsKt {
    private static ImageVector _connectingAirports;

    public static final ImageVector getConnectingAirports(Icons.TwoTone twoTone) {
        ImageVector imageVector = _connectingAirports;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ConnectingAirports", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.4f, 17.0f);
        pathBuilder.lineToRelative(1.3f, 4.4f);
        pathBuilder.horizontalLineToRelative(-1.1f);
        pathBuilder.lineTo(13.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineToRelative(2.6f, -4.4f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineTo(15.4f, 15.0f);
        pathBuilder.horizontalLineToRelative(2.85f);
        pathBuilder.lineTo(19.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(-0.6f, 2.0f);
        pathBuilder.lineToRelative(0.6f, 2.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.lineToRelative(-0.75f, -1.0f);
        pathBuilder.horizontalLineTo(15.4f);
        pathBuilder.close();
        pathBuilder.moveTo(5.75f, 7.0f);
        pathBuilder.lineTo(5.0f, 6.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.lineToRelative(0.6f, 2.0f);
        pathBuilder.lineTo(4.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.lineToRelative(0.75f, -1.0f);
        pathBuilder.horizontalLineTo(8.6f);
        pathBuilder.lineToRelative(-1.3f, 4.4f);
        pathBuilder.horizontalLineToRelative(1.1f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(8.4f, 2.6f);
        pathBuilder.horizontalLineTo(7.3f);
        pathBuilder.lineTo(8.6f, 7.0f);
        pathBuilder.horizontalLineTo(5.75f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _connectingAirports = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
