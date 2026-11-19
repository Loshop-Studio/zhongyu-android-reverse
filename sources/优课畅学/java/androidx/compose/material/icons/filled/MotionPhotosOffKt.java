package androidx.compose.material.icons.filled;

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
public final class MotionPhotosOffKt {
    private static ImageVector _motionPhotosOff;

    public static final ImageVector getMotionPhotosOff(Icons.Filled filled) {
        ImageVector imageVector = _motionPhotosOff;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MotionPhotosOff", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.84f, 20.84f);
        pathBuilder.lineTo(3.16f, 3.16f);
        pathBuilder.lineTo(1.89f, 4.43f);
        pathBuilder.lineToRelative(1.89f, 1.89f);
        pathBuilder.curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.77f);
        pathBuilder.lineToRelative(1.89f, 1.89f);
        pathBuilder.lineToRelative(1.27f, -1.28f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(0.0f, -1.55f, 0.45f, -3.0f, 1.22f, -4.23f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder.curveTo(6.25f, 10.06f, 6.0f, 11.0f, 6.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 1.94f, -0.25f, 2.77f, -0.68f);
        pathBuilder.lineToRelative(1.46f, 1.46f);
        pathBuilder.curveTo(15.0f, 19.55f, 13.55f, 20.0f, 12.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.32f, 3.77f);
        pathBuilder.curveTo(7.93f, 2.66f, 9.89f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        pathBuilder.curveToRelative(0.0f, 2.11f, -0.66f, 4.07f, -1.77f, 5.68f);
        pathBuilder.lineToRelative(-1.45f, -1.45f);
        pathBuilder.curveTo(19.55f, 15.0f, 20.0f, 13.55f, 20.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        pathBuilder.curveToRelative(-1.55f, 0.0f, -3.0f, 0.45f, -4.23f, 1.22f);
        pathBuilder.lineTo(6.32f, 3.77f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 1.0f, -0.25f, 1.94f, -0.68f, 2.77f);
        pathBuilder.lineTo(9.23f, 6.68f);
        pathBuilder.curveTo(10.06f, 6.25f, 11.0f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosOff = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
