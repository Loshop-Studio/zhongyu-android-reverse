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
public final class AlignHorizontalCenterKt {
    private static ImageVector _alignHorizontalCenter;

    public static final ImageVector getAlignHorizontalCenter(Icons.Rounded rounded) {
        ImageVector imageVector = _alignHorizontalCenter;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlignHorizontalCenter", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineToRelative(6.5f, 0.0f);
        pathBuilder.curveTo(20.33f, 7.0f, 21.0f, 7.67f, 21.0f, 8.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        pathBuilder.horizontalLineTo(13.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(7.5f);
        pathBuilder.curveTo(6.67f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(6.0f, 14.67f, 6.67f, 14.0f, 7.5f, 14.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineTo(4.5f);
        pathBuilder.curveTo(3.67f, 10.0f, 3.0f, 9.33f, 3.0f, 8.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(3.0f, 7.67f, 3.67f, 7.0f, 4.5f, 7.0f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.lineToRelative(0.0f, -4.0f);
        pathBuilder.curveTo(11.0f, 2.45f, 11.45f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignHorizontalCenter = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
