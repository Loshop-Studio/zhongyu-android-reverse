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
public final class ImportantDevicesKt {
    private static ImageVector _importantDevices;

    public static final ImageVector getImportantDevices(Icons.Sharp sharp) {
        ImageVector imageVector = _importantDevices;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ImportantDevices", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 11.01f);
        pathBuilder.lineTo(17.0f, 11.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineTo(11.01f);
        pathBuilder.close();
        pathBuilder.moveTo(23.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-5.0f);
        pathBuilder.verticalLineToRelative(-7.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 2.0f);
        pathBuilder.horizontalLineTo(0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.97f, 9.0f);
        pathBuilder.lineTo(11.0f, 6.0f);
        pathBuilder.lineToRelative(-0.97f, 3.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.lineToRelative(2.47f, 1.76f);
        pathBuilder.lineToRelative(-0.94f, 2.91f);
        pathBuilder.lineToRelative(2.47f, -1.8f);
        pathBuilder.lineToRelative(2.47f, 1.8f);
        pathBuilder.lineToRelative(-0.94f, -2.91f);
        pathBuilder.lineTo(15.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(-3.03f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importantDevices = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
