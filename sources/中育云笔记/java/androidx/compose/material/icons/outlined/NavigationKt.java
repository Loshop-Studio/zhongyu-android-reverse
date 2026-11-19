package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getNavigation(Icons.Outlined outlined) {
        ImageVector imageVector = _navigation;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Navigation", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 7.27f);
        pathBuilder.lineToRelative(4.28f, 10.43f);
        pathBuilder.lineToRelative(-3.47f, -1.53f);
        pathBuilder.lineToRelative(-0.81f, -0.36f);
        pathBuilder.lineToRelative(-0.81f, 0.36f);
        pathBuilder.lineToRelative(-3.47f, 1.53f);
        pathBuilder.lineTo(12.0f, 7.27f);
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(4.5f, 20.29f);
        pathBuilder.lineToRelative(0.71f, 0.71f);
        pathBuilder.lineTo(12.0f, 18.0f);
        pathBuilder.lineToRelative(6.79f, 3.0f);
        pathBuilder.lineToRelative(0.71f, -0.71f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _navigation = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
