package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class AcUnitKt {
    private static ImageVector _acUnit;

    public static final ImageVector getAcUnit(Icons.TwoTone twoTone) {
        ImageVector imageVector = _acUnit;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AcUnit", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
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
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _acUnit = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
