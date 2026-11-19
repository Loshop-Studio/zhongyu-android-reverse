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
public final class PublishedWithChangesKt {
    private static ImageVector _publishedWithChanges;

    public static final ImageVector getPublishedWithChanges(Icons.Outlined outlined) {
        ImageVector imageVector = _publishedWithChanges;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PublishedWithChanges", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.6f, 19.5f);
        pathBuilder.horizontalLineTo(21.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-6.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.73f);
        pathBuilder.curveToRelative(1.83f, -1.47f, 3.0f, -3.71f, 3.0f, -6.23f);
        pathBuilder.curveToRelative(0.0f, -4.07f, -3.06f, -7.44f, -7.0f, -7.93f);
        pathBuilder.verticalLineTo(2.05f);
        pathBuilder.curveToRelative(5.05f, 0.5f, 9.0f, 4.76f, 9.0f, 9.95f);
        pathBuilder.curveTo(22.0f, 14.99f, 20.68f, 17.67f, 18.6f, 19.5f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.52f, 1.17f, -4.77f, 3.0f, -6.23f);
        pathBuilder.verticalLineTo(8.5f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.4f);
        pathBuilder.curveTo(3.32f, 6.33f, 2.0f, 9.01f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveTo(7.06f, 19.44f, 4.0f, 16.07f, 4.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.24f, 8.11f);
        pathBuilder.lineToRelative(-5.66f, 5.66f);
        pathBuilder.lineToRelative(-2.83f, -2.83f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(4.24f, 4.24f);
        pathBuilder.lineToRelative(7.07f, -7.07f);
        pathBuilder.lineTo(16.24f, 8.11f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _publishedWithChanges = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
