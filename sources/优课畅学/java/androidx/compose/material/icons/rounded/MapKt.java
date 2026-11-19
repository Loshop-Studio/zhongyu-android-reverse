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
public final class MapKt {
    private static ImageVector _map;

    public static final ImageVector getMap(Icons.Rounded rounded) {
        ImageVector imageVector = _map;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Map", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.65f, 4.98f);
        pathBuilder.lineToRelative(-5.0f, -1.75f);
        pathBuilder.curveToRelative(-0.42f, -0.15f, -0.88f, -0.15f, -1.3f, -0.01f);
        pathBuilder.lineTo(4.36f, 4.56f);
        pathBuilder.curveTo(3.55f, 4.84f, 3.0f, 5.6f, 3.0f, 6.46f);
        pathBuilder.verticalLineToRelative(11.85f);
        pathBuilder.curveToRelative(0.0f, 1.41f, 1.41f, 2.37f, 2.72f, 1.86f);
        pathBuilder.lineToRelative(2.93f, -1.14f);
        pathBuilder.curveToRelative(0.22f, -0.09f, 0.47f, -0.09f, 0.69f, -0.01f);
        pathBuilder.lineToRelative(5.0f, 1.75f);
        pathBuilder.curveToRelative(0.42f, 0.15f, 0.88f, 0.15f, 1.3f, 0.01f);
        pathBuilder.lineToRelative(3.99f, -1.34f);
        pathBuilder.curveToRelative(0.81f, -0.27f, 1.36f, -1.04f, 1.36f, -1.9f);
        pathBuilder.verticalLineTo(5.69f);
        pathBuilder.curveToRelative(0.0f, -1.41f, -1.41f, -2.37f, -2.72f, -1.86f);
        pathBuilder.lineToRelative(-2.93f, 1.14f);
        pathBuilder.curveToRelative(-0.22f, 0.08f, -0.46f, 0.09f, -0.69f, 0.01f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 18.89f);
        pathBuilder.lineToRelative(-6.0f, -2.11f);
        pathBuilder.verticalLineTo(5.11f);
        pathBuilder.lineToRelative(6.0f, 2.11f);
        pathBuilder.verticalLineToRelative(11.67f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _map = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
