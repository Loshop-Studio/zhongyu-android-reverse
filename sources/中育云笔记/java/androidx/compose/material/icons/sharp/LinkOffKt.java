package androidx.compose.material.icons.sharp;

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
public final class LinkOffKt {
    private static ImageVector _linkOff;

    public static final ImageVector getLinkOff(Icons.Sharp sharp) {
        ImageVector imageVector = _linkOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.LinkOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(14.39f, 11.0f);
        pathBuilder.lineTo(16.0f, 12.61f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(1.9f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.curveToRelative(1.71f, 0.0f, 3.1f, 1.39f, 3.1f, 3.1f);
        pathBuilder.curveToRelative(0.0f, 1.27f, -0.77f, 2.37f, -1.87f, 2.84f);
        pathBuilder.lineToRelative(1.4f, 1.4f);
        pathBuilder.curveTo(21.05f, 15.36f, 22.0f, 13.79f, 22.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(2.0f, 4.27f);
        pathBuilder.lineToRelative(3.11f, 3.11f);
        pathBuilder.curveTo(3.29f, 8.12f, 2.0f, 9.91f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(-1.9f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.curveToRelative(-1.71f, 0.0f, -3.1f, -1.39f, -3.1f, -3.1f);
        pathBuilder.curveToRelative(0.0f, -1.59f, 1.21f, -2.9f, 2.76f, -3.07f);
        pathBuilder.lineTo(8.73f, 11.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.73f);
        pathBuilder.lineTo(13.0f, 15.27f);
        pathBuilder.verticalLineTo(17.0f);
        pathBuilder.horizontalLineToRelative(1.73f);
        pathBuilder.lineToRelative(4.01f, 4.01f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(3.41f, 2.86f);
        pathBuilder.lineTo(2.0f, 4.27f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _linkOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
