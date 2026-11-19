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
public final class FireplaceKt {
    private static ImageVector _fireplace;

    public static final ImageVector getFireplace(Icons.Sharp sharp) {
        ImageVector imageVector = _fireplace;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Fireplace", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineTo(2.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.2f, 13.74f);
        pathBuilder.curveToRelative(-0.08f, -0.46f, -0.07f, -0.85f, 0.08f, -1.28f);
        pathBuilder.curveToRelative(0.54f, 1.21f, 2.15f, 1.64f, 1.98f, 3.18f);
        pathBuilder.curveToRelative(-0.19f, 1.69f, -2.11f, 2.37f, -3.39f, 1.32f);
        pathBuilder.curveToRelative(0.76f, -0.24f, 1.4f, -1.04f, 1.53f, -1.63f);
        pathBuilder.curveTo(13.52f, 14.78f, 13.29f, 14.29f, 13.2f, 13.74f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-2.02f);
        pathBuilder.curveToRelative(0.63f, -0.84f, 1.02f, -1.87f, 1.02f, -3.0f);
        pathBuilder.curveToRelative(0.0f, -1.89f, -1.09f, -2.85f, -1.85f, -3.37f);
        pathBuilder.curveTo(12.2f, 9.61f, 13.0f, 7.0f, 13.0f, 7.0f);
        pathBuilder.curveToRelative(-6.73f, 3.57f, -6.02f, 7.47f, -6.0f, 8.0f);
        pathBuilder.curveToRelative(0.03f, 0.96f, 0.49f, 2.07f, 1.23f, 3.0f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fireplace = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
