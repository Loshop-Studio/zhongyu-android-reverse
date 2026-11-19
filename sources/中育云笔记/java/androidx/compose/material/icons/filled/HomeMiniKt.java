package androidx.compose.material.icons.filled;

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
public final class HomeMiniKt {
    private static ImageVector _homeMini;

    public static final ImageVector getHomeMini(Icons.Filled filled) {
        ImageVector imageVector = _homeMini;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.HomeMini", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 5.0f);
        pathBuilder.curveTo(4.19f, 5.0f, 2.0f, 9.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.86f, 3.13f, 7.0f, 6.99f, 7.0f);
        pathBuilder.horizontalLineToRelative(6.02f);
        pathBuilder.curveToRelative(2.69f, 0.0f, 6.99f, -2.08f, 6.99f, -7.0f);
        pathBuilder.curveTo(22.0f, 12.0f, 22.0f, 5.0f, 12.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 7.0f);
        pathBuilder.curveToRelative(7.64f, 0.0f, 7.99f, 4.51f, 8.0f, 5.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.curveTo(4.0f, 11.8f, 4.09f, 7.0f, 12.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.86f, 17.0f);
        pathBuilder.horizontalLineTo(9.14f);
        pathBuilder.curveToRelative(-2.1f, 0.0f, -3.92f, -1.24f, -4.71f, -3.0f);
        pathBuilder.horizontalLineToRelative(15.15f);
        pathBuilder.curveTo(18.78f, 15.76f, 16.96f, 17.0f, 14.86f, 17.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _homeMini = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
