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
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.Outlined outlined) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Map", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.5f, 3.0f);
        pathBuilder.lineToRelative(-0.16f, 0.03f);
        pathBuilder.lineTo(15.0f, 5.1f);
        pathBuilder.lineTo(9.0f, 3.0f);
        pathBuilder.lineTo(3.36f, 4.9f);
        pathBuilder.curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        pathBuilder.lineTo(3.0f, 20.5f);
        pathBuilder.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        pathBuilder.lineToRelative(0.16f, -0.03f);
        pathBuilder.lineTo(9.0f, 18.9f);
        pathBuilder.lineToRelative(6.0f, 2.1f);
        pathBuilder.lineToRelative(5.64f, -1.9f);
        pathBuilder.curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        pathBuilder.lineTo(21.0f, 3.5f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        pathBuilder.close();
        pathBuilder.moveTo(10.0f, 5.47f);
        pathBuilder.lineToRelative(4.0f, 1.4f);
        pathBuilder.verticalLineToRelative(11.66f);
        pathBuilder.lineToRelative(-4.0f, -1.4f);
        pathBuilder.lineTo(10.0f, 5.47f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 6.46f);
        pathBuilder.lineToRelative(3.0f, -1.01f);
        pathBuilder.verticalLineToRelative(11.7f);
        pathBuilder.lineToRelative(-3.0f, 1.16f);
        pathBuilder.lineTo(5.0f, 6.46f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.54f);
        pathBuilder.lineToRelative(-3.0f, 1.01f);
        pathBuilder.lineTo(16.0f, 6.86f);
        pathBuilder.lineToRelative(3.0f, -1.16f);
        pathBuilder.verticalLineToRelative(11.84f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
