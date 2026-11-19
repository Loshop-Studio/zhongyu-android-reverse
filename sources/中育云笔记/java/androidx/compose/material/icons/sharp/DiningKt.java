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
public final class DiningKt {
    private static ImageVector _dining;

    public static final ImageVector getDining(Icons.Sharp sharp) {
        ImageVector imageVector = _dining;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Dining", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 10.3f);
        pathBuilder.curveToRelative(0.0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(8.0f);
        pathBuilder.verticalLineToRelative(-6.77f);
        pathBuilder.curveToRelative(-0.86f, -0.22f, -1.5f, -1.0f, -1.5f, -1.93f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(0.75f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineTo(10.0f);
        pathBuilder.verticalLineTo(6.0f);
        pathBuilder.horizontalLineToRelative(0.5f);
        pathBuilder.horizontalLineTo(11.0f);
        pathBuilder.verticalLineTo(10.3f);
        pathBuilder.close();
        pathBuilder.moveTo(15.58f, 12.59f);
        pathBuilder.lineToRelative(-0.08f, 0.03f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(14.0f);
        pathBuilder.verticalLineToRelative(-6.38f);
        pathBuilder.lineToRelative(-0.08f, -0.04f);
        pathBuilder.curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f);
        pathBuilder.curveToRelative(0.0f, -1.88f, 1.13f, -3.4f, 2.5f, -3.4f);
        pathBuilder.curveToRelative(1.38f, 0.0f, 2.5f, 1.53f, 2.5f, 3.41f);
        pathBuilder.curveTo(17.25f, 10.89f, 16.55f, 12.12f, 15.58f, 12.59f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dining = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
