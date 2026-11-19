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
public final class DataThresholdingKt {
    private static ImageVector _dataThresholding;

    public static final ImageVector getDataThresholding(Icons.Sharp sharp) {
        ImageVector imageVector = _dataThresholding;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DataThresholding", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(10.67f, 8.17f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineToRelative(3.67f, -3.67f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(12.67f, 13.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineTo(10.67f, 8.17f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(1.72f);
        pathBuilder.lineTo(5.0f, 17.72f);
        pathBuilder.verticalLineTo(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.84f, 19.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.83f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.84f);
        pathBuilder.close();
        pathBuilder.moveTo(9.8f, 19.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.62f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.horizontalLineTo(9.8f);
        pathBuilder.close();
        pathBuilder.moveTo(13.53f, 19.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.horizontalLineToRelative(1.62f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.horizontalLineTo(13.53f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineToRelative(-1.73f);
        pathBuilder.lineTo(19.0f, 17.27f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataThresholding = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
