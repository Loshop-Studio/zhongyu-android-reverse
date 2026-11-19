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
public final class DataSaverOnKt {
    private static ImageVector _dataSaverOn;

    public static final ImageVector getDataSaverOn(Icons.Filled filled) {
        ImageVector imageVector = _dataSaverOn;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DataSaverOn", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 8.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 2.05f);
        pathBuilder.verticalLineToRelative(3.03f);
        pathBuilder.curveToRelative(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        pathBuilder.curveToRelative(0.0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f);
        pathBuilder.lineToRelative(2.6f, 1.53f);
        pathBuilder.curveTo(21.68f, 14.83f, 22.0f, 13.45f, 22.0f, 12.0f);
        pathBuilder.curveTo(22.0f, 6.82f, 18.05f, 2.55f, 13.0f, 2.05f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 19.0f);
        pathBuilder.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        pathBuilder.curveToRelative(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f);
        pathBuilder.verticalLineTo(2.05f);
        pathBuilder.curveTo(5.94f, 2.55f, 2.0f, 6.81f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.24f, -1.61f, 8.06f, -4.09f);
        pathBuilder.lineToRelative(-2.6f, -1.53f);
        pathBuilder.curveTo(16.17f, 17.98f, 14.21f, 19.0f, 12.0f, 19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataSaverOn = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
