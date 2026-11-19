package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class PublishedWithChangesKt {
    private static ImageVector _publishedWithChanges;

    public static final ImageVector getPublishedWithChanges(Icons.TwoTone twoTone) {
        ImageVector imageVector = _publishedWithChanges;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PublishedWithChanges", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.66f, 9.53f);
        pathBuilder.lineToRelative(-7.07f, 7.07f);
        pathBuilder.lineToRelative(-4.24f, -4.24f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(2.83f, 2.83f);
        pathBuilder.lineToRelative(5.66f, -5.66f);
        pathBuilder.lineTo(17.66f, 9.53f);
        pathBuilder.close();
        pathBuilder.moveTo(4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.33f, 1.02f, -4.42f, 2.62f, -5.88f);
        pathBuilder.lineTo(9.0f, 8.5f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.lineToRelative(2.2f, 2.2f);
        pathBuilder.curveTo(3.24f, 6.52f, 2.0f, 9.11f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        pathBuilder.verticalLineToRelative(-2.02f);
        pathBuilder.curveTo(7.06f, 19.44f, 4.0f, 16.07f, 4.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -5.19f, -3.95f, -9.45f, -9.0f, -9.95f);
        pathBuilder.verticalLineToRelative(2.02f);
        pathBuilder.curveToRelative(3.94f, 0.49f, 7.0f, 3.86f, 7.0f, 7.93f);
        pathBuilder.curveToRelative(0.0f, 2.33f, -1.02f, 4.42f, -2.62f, 5.88f);
        pathBuilder.lineTo(15.0f, 15.5f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.lineToRelative(-2.2f, -2.2f);
        pathBuilder.curveTo(20.76f, 17.48f, 22.0f, 14.89f, 22.0f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _publishedWithChanges = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
