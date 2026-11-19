package androidx.compose.material.icons.rounded;

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
public final class TableRestaurantKt {
    private static ImageVector _tableRestaurant;

    public static final ImageVector getTableRestaurant(Icons.Rounded rounded) {
        ImageVector imageVector = _tableRestaurant;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TableRestaurant", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.96f, 9.73f);
        pathBuilder.lineToRelative(-1.43f, -5.0f);
        pathBuilder.curveTo(20.41f, 4.3f, 20.02f, 4.0f, 19.57f, 4.0f);
        pathBuilder.horizontalLineTo(4.43f);
        pathBuilder.curveTo(3.98f, 4.0f, 3.59f, 4.3f, 3.47f, 4.73f);
        pathBuilder.lineToRelative(-1.43f, 5.0f);
        pathBuilder.curveTo(1.86f, 10.36f, 2.34f, 11.0f, 3.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(2.2f);
        pathBuilder.lineToRelative(-1.05f, 7.88f);
        pathBuilder.curveTo(4.07f, 19.47f, 4.53f, 20.0f, 5.13f, 20.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.5f, 0.0f, 0.92f, -0.37f, 0.98f, -0.86f);
        pathBuilder.lineTo(6.67f, 15.0f);
        pathBuilder.horizontalLineToRelative(10.67f);
        pathBuilder.lineToRelative(0.55f, 4.14f);
        pathBuilder.curveToRelative(0.07f, 0.49f, 0.49f, 0.86f, 0.98f, 0.86f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.6f, 0.0f, 1.06f, -0.53f, 0.98f, -1.12f);
        pathBuilder.lineTo(18.8f, 11.0f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.curveTo(21.66f, 11.0f, 22.14f, 10.36f, 21.96f, 9.73f);
        pathBuilder.close();
        pathBuilder.moveTo(6.93f, 13.0f);
        pathBuilder.lineToRelative(0.27f, -2.0f);
        pathBuilder.horizontalLineToRelative(9.6f);
        pathBuilder.lineToRelative(0.27f, 2.0f);
        pathBuilder.horizontalLineTo(6.93f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableRestaurant = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
