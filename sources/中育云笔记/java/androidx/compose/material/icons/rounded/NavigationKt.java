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
public final class NavigationKt {
    private static ImageVector _navigation;

    public static final ImageVector getNavigation(Icons.Rounded rounded) {
        ImageVector imageVector = _navigation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Navigation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.93f, 4.26f);
        pathBuilder.lineToRelative(6.15f, 14.99f);
        pathBuilder.curveToRelative(0.34f, 0.83f, -0.51f, 1.66f, -1.33f, 1.29f);
        pathBuilder.lineToRelative(-5.34f, -2.36f);
        pathBuilder.curveToRelative(-0.26f, -0.11f, -0.55f, -0.11f, -0.81f, 0.0f);
        pathBuilder.lineToRelative(-5.34f, 2.36f);
        pathBuilder.curveToRelative(-0.82f, 0.36f, -1.67f, -0.46f, -1.33f, -1.29f);
        pathBuilder.lineToRelative(6.15f, -14.99f);
        pathBuilder.curveToRelative(0.33f, -0.83f, 1.51f, -0.83f, 1.85f, 0.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _navigation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
