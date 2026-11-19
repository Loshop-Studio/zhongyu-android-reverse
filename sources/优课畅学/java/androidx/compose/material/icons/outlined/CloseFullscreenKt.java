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
public final class CloseFullscreenKt {
    private static ImageVector _closeFullscreen;

    public static final ImageVector getCloseFullscreen(Icons.Outlined outlined) {
        ImageVector imageVector = _closeFullscreen;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.CloseFullscreen", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 3.41f);
        pathBuilder.lineToRelative(-5.29f, 5.29f);
        pathBuilder.lineTo(20.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.lineTo(20.59f, 2.0f);
        pathBuilder.lineTo(22.0f, 3.41f);
        pathBuilder.close();
        pathBuilder.moveTo(3.41f, 22.0f);
        pathBuilder.lineToRelative(5.29f, -5.29f);
        pathBuilder.lineTo(12.0f, 20.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.lineToRelative(3.29f, 3.29f);
        pathBuilder.lineTo(2.0f, 20.59f);
        pathBuilder.lineTo(3.41f, 22.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closeFullscreen = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
