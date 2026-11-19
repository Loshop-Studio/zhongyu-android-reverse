package androidx.compose.material.icons.rounded;

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
public final class HotelClassKt {
    private static ImageVector _hotelClass;

    public static final ImageVector getHotelClass(Icons.Rounded rounded) {
        ImageVector imageVector = _hotelClass;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HotelClass", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.58f, 10.0f);
        pathBuilder.horizontalLineTo(2.56f);
        pathBuilder.curveToRelative(-0.49f, 0.0f, -0.69f, 0.62f, -0.29f, 0.91f);
        pathBuilder.lineToRelative(4.91f, 3.51f);
        pathBuilder.lineToRelative(-1.89f, 6.1f);
        pathBuilder.curveToRelative(-0.14f, 0.46f, 0.39f, 0.84f, 0.78f, 0.55f);
        pathBuilder.lineTo(11.0f, 17.31f);
        pathBuilder.lineToRelative(4.93f, 3.75f);
        pathBuilder.curveToRelative(0.39f, 0.29f, 0.92f, -0.08f, 0.78f, -0.55f);
        pathBuilder.lineToRelative(-1.89f, -6.1f);
        pathBuilder.lineToRelative(4.91f, -3.51f);
        pathBuilder.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        pathBuilder.horizontalLineToRelative(-6.02f);
        pathBuilder.lineToRelative(-1.95f, -6.42f);
        pathBuilder.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        pathBuilder.lineTo(8.58f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.9f, 20.51f);
        pathBuilder.lineToRelative(-1.4f, -4.52f);
        pathBuilder.lineToRelative(2.91f, -2.08f);
        pathBuilder.curveToRelative(0.4f, -0.28f, 0.2f, -0.91f, -0.29f, -0.91f);
        pathBuilder.horizontalLineToRelative(-1.88f);
        pathBuilder.lineToRelative(-3.08f, 2.2f);
        pathBuilder.lineToRelative(1.46f, 4.72f);
        pathBuilder.lineToRelative(1.5f, 1.14f);
        pathBuilder.curveTo(20.51f, 21.35f, 21.04f, 20.97f, 20.9f, 20.51f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 8.0f);
        pathBuilder.lineToRelative(-1.34f, -4.42f);
        pathBuilder.curveToRelative(-0.14f, -0.47f, -0.81f, -0.47f, -0.96f, 0.0f);
        pathBuilder.lineToRelative(-0.57f, 1.87f);
        pathBuilder.lineTo(14.91f, 8.0f);
        pathBuilder.horizontalLineTo(17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hotelClass = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
