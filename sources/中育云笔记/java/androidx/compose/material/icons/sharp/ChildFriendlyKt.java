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
public final class ChildFriendlyKt {
    private static ImageVector _childFriendly;

    public static final ImageVector getChildFriendly(Icons.Sharp sharp) {
        ImageVector imageVector = _childFriendly;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ChildFriendly", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.0f, 2.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.32f, 15.89f);
        pathBuilder.curveTo(20.37f, 14.54f, 21.0f, 12.84f, 21.0f, 11.0f);
        pathBuilder.lineTo(6.44f, 11.0f);
        pathBuilder.lineToRelative(-0.95f, -2.0f);
        pathBuilder.lineTo(2.0f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.22f);
        pathBuilder.reflectiveCurveToRelative(1.89f, 4.07f, 2.12f, 4.42f);
        pathBuilder.curveToRelative(-1.1f, 0.59f, -1.84f, 1.75f, -1.84f, 3.08f);
        pathBuilder.curveTo(4.5f, 20.43f, 6.07f, 22.0f, 8.0f, 22.0f);
        pathBuilder.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        pathBuilder.horizontalLineToRelative(2.08f);
        pathBuilder.curveToRelative(0.24f, 1.7f, 1.7f, 3.0f, 3.46f, 3.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilder.curveToRelative(0.0f, -1.04f, -0.46f, -1.97f, -1.18f, -2.61f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 20.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(7.17f, 17.0f, 8.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(8.83f, 20.0f, 8.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 20.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(16.17f, 17.0f, 17.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(17.83f, 20.0f, 17.0f, 20.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _childFriendly = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
