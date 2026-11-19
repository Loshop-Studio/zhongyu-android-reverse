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
public final class FlatwareKt {
    private static ImageVector _flatware;

    public static final ImageVector getFlatware(Icons.Sharp sharp) {
        ImageVector imageVector = _flatware;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Flatware", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.0f, 7.08f);
        pathBuilder.curveToRelative(0.0f, 1.77f, -0.84f, 3.25f, -2.0f, 3.82f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(10.9f);
        pathBuilder.curveToRelative(-1.16f, -0.57f, -2.0f, -2.05f, -2.0f, -3.82f);
        pathBuilder.curveTo(10.01f, 4.83f, 11.35f, 3.0f, 13.0f, 3.0f);
        pathBuilder.curveTo(14.66f, 3.0f, 16.0f, 4.83f, 16.0f, 7.08f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveTo(21.0f, 5.24f, 19.76f, 3.0f, 17.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.28f, 3.0f);
        pathBuilder.horizontalLineTo(7.56f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(6.72f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.lineTo(6.0f, 3.0f);
        pathBuilder.lineTo(5.28f, 3.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineTo(4.44f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.lineTo(3.72f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 0.0f, 0.9f, 0.0f, 2.0f, 0.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(11.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, 0.0f, 2.0f, 0.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.lineTo(8.28f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flatware = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
