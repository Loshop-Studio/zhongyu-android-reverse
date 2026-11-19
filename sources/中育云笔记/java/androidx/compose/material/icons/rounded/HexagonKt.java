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
public final class HexagonKt {
    private static ImageVector _hexagon;

    public static final ImageVector getHexagon(Icons.Rounded rounded) {
        ImageVector imageVector = _hexagon;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Hexagon", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.05f, 3.0f);
        pathBuilder.horizontalLineTo(7.95f);
        pathBuilder.curveTo(7.24f, 3.0f, 6.58f, 3.38f, 6.22f, 4.0f);
        pathBuilder.lineToRelative(-4.04f, 7.0f);
        pathBuilder.curveToRelative(-0.36f, 0.62f, -0.36f, 1.38f, 0.0f, 2.0f);
        pathBuilder.lineToRelative(4.04f, 7.0f);
        pathBuilder.curveToRelative(0.36f, 0.62f, 1.02f, 1.0f, 1.73f, 1.0f);
        pathBuilder.horizontalLineToRelative(8.09f);
        pathBuilder.curveToRelative(0.71f, 0.0f, 1.37f, -0.38f, 1.73f, -1.0f);
        pathBuilder.lineToRelative(4.04f, -7.0f);
        pathBuilder.curveToRelative(0.36f, -0.62f, 0.36f, -1.38f, 0.0f, -2.0f);
        pathBuilder.lineToRelative(-4.04f, -7.0f);
        pathBuilder.curveTo(17.42f, 3.38f, 16.76f, 3.0f, 16.05f, 3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hexagon = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
