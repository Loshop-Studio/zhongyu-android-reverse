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
public final class ZoomOutMapKt {
    private static ImageVector _zoomOutMap;

    public static final ImageVector getZoomOutMap(Icons.Rounded rounded) {
        ImageVector imageVector = _zoomOutMap;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ZoomOutMap", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.85f, 3.85f);
        pathBuilder.lineTo(17.3f, 5.3f);
        pathBuilder.lineToRelative(-2.18f, 2.16f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineTo(18.7f, 6.7f);
        pathBuilder.lineToRelative(1.45f, 1.45f);
        pathBuilder.curveTo(20.46f, 8.46f, 21.0f, 8.24f, 21.0f, 7.79f);
        pathBuilder.verticalLineTo(3.5f);
        pathBuilder.curveTo(21.0f, 3.22f, 20.78f, 3.0f, 20.5f, 3.0f);
        pathBuilder.horizontalLineToRelative(-4.29f);
        pathBuilder.curveTo(15.76f, 3.0f, 15.54f, 3.54f, 15.85f, 3.85f);
        pathBuilder.close();
        pathBuilder.moveTo(3.85f, 8.15f);
        pathBuilder.lineTo(5.3f, 6.7f);
        pathBuilder.lineToRelative(2.16f, 2.18f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.lineTo(6.7f, 5.3f);
        pathBuilder.lineToRelative(1.45f, -1.45f);
        pathBuilder.curveTo(8.46f, 3.54f, 8.24f, 3.0f, 7.79f, 3.0f);
        pathBuilder.horizontalLineTo(3.5f);
        pathBuilder.curveTo(3.22f, 3.0f, 3.0f, 3.22f, 3.0f, 3.5f);
        pathBuilder.verticalLineToRelative(4.29f);
        pathBuilder.curveTo(3.0f, 8.24f, 3.54f, 8.46f, 3.85f, 8.15f);
        pathBuilder.close();
        pathBuilder.moveTo(8.15f, 20.15f);
        pathBuilder.lineTo(6.7f, 18.7f);
        pathBuilder.lineToRelative(2.18f, -2.16f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.lineTo(5.3f, 17.3f);
        pathBuilder.lineToRelative(-1.45f, -1.45f);
        pathBuilder.curveTo(3.54f, 15.54f, 3.0f, 15.76f, 3.0f, 16.21f);
        pathBuilder.verticalLineToRelative(4.29f);
        pathBuilder.curveTo(3.0f, 20.78f, 3.22f, 21.0f, 3.5f, 21.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder.curveTo(8.24f, 21.0f, 8.46f, 20.46f, 8.15f, 20.15f);
        pathBuilder.close();
        pathBuilder.moveTo(20.15f, 15.85f);
        pathBuilder.lineTo(18.7f, 17.3f);
        pathBuilder.lineToRelative(-2.16f, -2.18f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.03f, -0.39f, -1.42f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f);
        pathBuilder.lineToRelative(2.18f, 2.16f);
        pathBuilder.lineToRelative(-1.45f, 1.45f);
        pathBuilder.curveTo(15.54f, 20.46f, 15.76f, 21.0f, 16.21f, 21.0f);
        pathBuilder.horizontalLineToRelative(4.29f);
        pathBuilder.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        pathBuilder.verticalLineToRelative(-4.29f);
        pathBuilder.curveTo(21.0f, 15.76f, 20.46f, 15.54f, 20.15f, 15.85f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _zoomOutMap = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
