package androidx.compose.material.icons.sharp;

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
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(Icons.Sharp sharp) {
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Camera", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.4f, 10.5f);
        pathBuilder.lineToRelative(4.77f, -8.26f);
        pathBuilder.curveTo(13.47f, 2.09f, 12.75f, 2.0f, 12.0f, 2.0f);
        pathBuilder.curveToRelative(-2.4f, 0.0f, -4.6f, 0.85f, -6.32f, 2.25f);
        pathBuilder.lineToRelative(3.66f, 6.35f);
        pathBuilder.lineToRelative(0.06f, -0.1f);
        pathBuilder.close();
        pathBuilder.moveTo(21.54f, 9.0f);
        pathBuilder.curveToRelative(-0.92f, -2.92f, -3.15f, -5.26f, -6.0f, -6.34f);
        pathBuilder.lineTo(11.88f, 9.0f);
        pathBuilder.horizontalLineToRelative(9.66f);
        pathBuilder.close();
        pathBuilder.moveTo(21.8f, 10.0f);
        pathBuilder.horizontalLineToRelative(-7.49f);
        pathBuilder.lineToRelative(0.29f, 0.5f);
        pathBuilder.lineToRelative(4.76f, 8.25f);
        pathBuilder.curveTo(21.0f, 16.97f, 22.0f, 14.61f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -0.69f, -0.07f, -1.35f, -0.2f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.54f, 12.0f);
        pathBuilder.lineToRelative(-3.9f, -6.75f);
        pathBuilder.curveTo(3.01f, 7.03f, 2.0f, 9.39f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 0.69f, 0.07f, 1.35f, 0.2f, 2.0f);
        pathBuilder.horizontalLineToRelative(7.49f);
        pathBuilder.lineToRelative(-1.15f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.46f, 15.0f);
        pathBuilder.curveToRelative(0.92f, 2.92f, 3.15f, 5.26f, 6.0f, 6.34f);
        pathBuilder.lineTo(12.12f, 15.0f);
        pathBuilder.lineTo(2.46f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.73f, 15.0f);
        pathBuilder.lineToRelative(-3.9f, 6.76f);
        pathBuilder.curveToRelative(0.7f, 0.15f, 1.42f, 0.24f, 2.17f, 0.24f);
        pathBuilder.curveToRelative(2.4f, 0.0f, 4.6f, -0.85f, 6.32f, -2.25f);
        pathBuilder.lineToRelative(-3.66f, -6.35f);
        pathBuilder.lineToRelative(-0.93f, 1.6f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _camera = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
