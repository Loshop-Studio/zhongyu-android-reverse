package androidx.compose.material.icons.filled;

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
public final class CloseFullscreenKt {
    private static ImageVector _closeFullscreen;

    public static final ImageVector getCloseFullscreen(Icons.Filled filled) {
        ImageVector imageVector = _closeFullscreen;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.CloseFullscreen", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
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
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closeFullscreen = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
