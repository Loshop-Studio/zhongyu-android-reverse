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
public final class DarkModeKt {
    private static ImageVector _darkMode;

    public static final ImageVector getDarkMode(Icons.Rounded rounded) {
        ImageVector imageVector = _darkMode;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DarkMode", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.01f, 3.05f);
        pathBuilder.curveTo(6.51f, 3.54f, 3.0f, 7.36f, 3.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f);
        pathBuilder.curveToRelative(4.63f, 0.0f, 8.45f, -3.5f, 8.95f, -8.0f);
        pathBuilder.curveToRelative(0.09f, -0.79f, -0.78f, -1.42f, -1.54f, -0.95f);
        pathBuilder.curveToRelative(-0.84f, 0.54f, -1.84f, 0.85f, -2.91f, 0.85f);
        pathBuilder.curveToRelative(-2.98f, 0.0f, -5.4f, -2.42f, -5.4f, -5.4f);
        pathBuilder.curveToRelative(0.0f, -1.06f, 0.31f, -2.06f, 0.84f, -2.89f);
        pathBuilder.curveTo(12.39f, 3.94f, 11.9f, 2.98f, 11.01f, 3.05f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _darkMode = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
