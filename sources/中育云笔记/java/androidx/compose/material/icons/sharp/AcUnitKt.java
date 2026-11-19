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
public final class AcUnitKt {
    private static ImageVector _acUnit;

    public static final ImageVector getAcUnit(Icons.Sharp sharp) {
        ImageVector imageVector = _acUnit;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AcUnit", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-4.17f);
        pathBuilder.lineToRelative(3.24f, -3.24f);
        pathBuilder.lineToRelative(-1.41f, -1.42f);
        pathBuilder.lineTo(15.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.lineToRelative(4.66f, -4.66f);
        pathBuilder.lineToRelative(-1.42f, -1.41f);
        pathBuilder.lineTo(13.0f, 6.17f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(4.17f);
        pathBuilder.lineTo(7.76f, 2.93f);
        pathBuilder.lineTo(6.34f, 4.34f);
        pathBuilder.lineTo(11.0f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.lineTo(4.34f, 6.34f);
        pathBuilder.lineTo(2.93f, 7.76f);
        pathBuilder.lineTo(6.17f, 11.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(4.17f);
        pathBuilder.lineToRelative(-3.24f, 3.24f);
        pathBuilder.lineToRelative(1.41f, 1.42f);
        pathBuilder.lineTo(9.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-4.66f, 4.66f);
        pathBuilder.lineToRelative(1.42f, 1.41f);
        pathBuilder.lineTo(11.0f, 17.83f);
        pathBuilder.verticalLineTo(22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-4.17f);
        pathBuilder.lineToRelative(3.24f, 3.24f);
        pathBuilder.lineToRelative(1.42f, -1.41f);
        pathBuilder.lineTo(13.0f, 15.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(4.66f, 4.66f);
        pathBuilder.lineToRelative(1.41f, -1.42f);
        pathBuilder.lineTo(17.83f, 13.0f);
        pathBuilder.horizontalLineTo(22.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _acUnit = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
