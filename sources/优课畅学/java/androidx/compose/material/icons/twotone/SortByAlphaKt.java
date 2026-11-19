package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class SortByAlphaKt {
    private static ImageVector _sortByAlpha;

    public static final ImageVector getSortByAlpha(Icons.TwoTone twoTone) {
        ImageVector imageVector = _sortByAlpha;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SortByAlpha", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.94f, 4.66f);
        pathBuilder.lineTo(12.58f, 2.3f);
        pathBuilder.lineToRelative(-2.36f, 2.36f);
        pathBuilder.close();
        pathBuilder.moveTo(10.39f, 17.73f);
        pathBuilder.horizontalLineToRelative(1.84f);
        pathBuilder.lineTo(7.74f, 6.27f);
        pathBuilder.lineTo(6.1f, 6.27f);
        pathBuilder.lineTo(1.6f, 17.73f);
        pathBuilder.horizontalLineToRelative(1.84f);
        pathBuilder.lineToRelative(0.92f, -2.45f);
        pathBuilder.horizontalLineToRelative(5.11f);
        pathBuilder.lineToRelative(0.92f, 2.45f);
        pathBuilder.close();
        pathBuilder.moveTo(4.97f, 13.64f);
        pathBuilder.lineToRelative(1.94f, -5.18f);
        pathBuilder.lineToRelative(1.94f, 5.18f);
        pathBuilder.lineTo(4.97f, 13.64f);
        pathBuilder.close();
        pathBuilder.moveTo(12.58f, 21.7f);
        pathBuilder.lineToRelative(2.33f, -2.33f);
        pathBuilder.horizontalLineToRelative(-4.66f);
        pathBuilder.close();
        pathBuilder.moveTo(21.66f, 7.54f);
        pathBuilder.lineTo(21.66f, 6.28f);
        pathBuilder.horizontalLineToRelative(-8.3f);
        pathBuilder.verticalLineToRelative(1.6f);
        pathBuilder.horizontalLineToRelative(5.88f);
        pathBuilder.lineToRelative(-5.92f, 8.56f);
        pathBuilder.verticalLineToRelative(1.29f);
        pathBuilder.horizontalLineToRelative(8.53f);
        pathBuilder.verticalLineToRelative(-1.59f);
        pathBuilder.horizontalLineToRelative(-6.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sortByAlpha = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
