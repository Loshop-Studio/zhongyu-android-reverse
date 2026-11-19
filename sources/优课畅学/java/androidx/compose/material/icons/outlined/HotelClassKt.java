package androidx.compose.material.icons.outlined;

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
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.Outlined outlined) {
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HotelClass", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.0f, 8.89f);
        pathBuilder.lineTo(11.94f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.lineToRelative(-2.27f, 1.62f);
        pathBuilder.lineToRelative(0.93f, 3.01f);
        pathBuilder.lineTo(11.0f, 14.79f);
        pathBuilder.lineToRelative(-2.42f, 1.84f);
        pathBuilder.lineToRelative(0.93f, -3.01f);
        pathBuilder.lineTo(7.24f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.82f);
        pathBuilder.lineTo(11.0f, 8.89f);
        pathBuilder.close();
        pathBuilder.moveTo(8.58f, 10.0f);
        pathBuilder.horizontalLineTo(1.0f);
        pathBuilder.lineToRelative(6.17f, 4.41f);
        pathBuilder.lineTo(4.83f, 22.0f);
        pathBuilder.lineTo(11.0f, 17.31f);
        pathBuilder.lineTo(17.18f, 22.0f);
        pathBuilder.lineToRelative(-2.35f, -7.59f);
        pathBuilder.lineTo(21.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(-7.58f);
        pathBuilder.lineTo(11.0f, 2.0f);
        pathBuilder.lineTo(8.58f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.36f, 22.0f);
        pathBuilder.lineToRelative(-1.86f, -6.01f);
        pathBuilder.lineTo(23.68f, 13.0f);
        pathBuilder.horizontalLineToRelative(-3.44f);
        pathBuilder.lineToRelative(-3.08f, 2.2f);
        pathBuilder.lineToRelative(1.46f, 4.72f);
        pathBuilder.lineTo(21.36f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 8.0f);
        pathBuilder.lineToRelative(-1.82f, -6.0f);
        pathBuilder.lineToRelative(-1.04f, 3.45f);
        pathBuilder.lineTo(14.91f, 8.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
