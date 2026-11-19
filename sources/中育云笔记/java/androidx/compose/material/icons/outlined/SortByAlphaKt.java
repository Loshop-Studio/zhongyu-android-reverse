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
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.Outlined outlined) {
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SortByAlpha", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.94f, 4.66f);
        pathBuilder.horizontalLineToRelative(-4.72f);
        pathBuilder.lineToRelative(2.36f, -2.36f);
        pathBuilder.lineToRelative(2.36f, 2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(10.25f, 19.37f);
        pathBuilder.horizontalLineToRelative(4.66f);
        pathBuilder.lineToRelative(-2.33f, 2.33f);
        pathBuilder.lineToRelative(-2.33f, -2.33f);
        pathBuilder.close();
        pathBuilder.moveTo(6.1f, 6.27f);
        pathBuilder.lineTo(1.6f, 17.73f);
        pathBuilder.horizontalLineToRelative(1.84f);
        pathBuilder.lineToRelative(0.92f, -2.45f);
        pathBuilder.horizontalLineToRelative(5.11f);
        pathBuilder.lineToRelative(0.92f, 2.45f);
        pathBuilder.horizontalLineToRelative(1.84f);
        pathBuilder.lineTo(7.74f, 6.27f);
        pathBuilder.lineTo(6.1f, 6.27f);
        pathBuilder.close();
        pathBuilder.moveTo(4.97f, 13.64f);
        pathBuilder.lineToRelative(1.94f, -5.18f);
        pathBuilder.lineToRelative(1.94f, 5.18f);
        pathBuilder.lineTo(4.97f, 13.64f);
        pathBuilder.close();
        pathBuilder.moveTo(15.73f, 16.14f);
        pathBuilder.horizontalLineToRelative(6.12f);
        pathBuilder.verticalLineToRelative(1.59f);
        pathBuilder.horizontalLineToRelative(-8.53f);
        pathBuilder.verticalLineToRelative(-1.29f);
        pathBuilder.lineToRelative(5.92f, -8.56f);
        pathBuilder.horizontalLineToRelative(-5.88f);
        pathBuilder.verticalLineToRelative(-1.6f);
        pathBuilder.horizontalLineToRelative(8.3f);
        pathBuilder.verticalLineToRelative(1.26f);
        pathBuilder.lineToRelative(-5.93f, 8.6f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
