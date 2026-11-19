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
public final class CurtainsKt {
    private static ImageVector _curtains;

    public static final ImageVector getCurtains(Icons.Outlined outlined) {
        ImageVector imageVector = _curtains;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Curtains", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(20.0f, 19.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineTo(20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 10.86f);
        pathBuilder.curveToRelative(-2.05f, -0.58f, -3.64f, -2.93f, -3.94f, -5.86f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(10.86f);
        pathBuilder.close();
        pathBuilder.moveTo(15.81f, 12.0f);
        pathBuilder.curveToRelative(-2.04f, 1.35f, -3.5f, 3.94f, -3.76f, 7.0f);
        pathBuilder.horizontalLineToRelative(-0.09f);
        pathBuilder.curveToRelative(-0.26f, -3.06f, -1.72f, -5.65f, -3.76f, -7.0f);
        pathBuilder.curveToRelative(2.04f, -1.35f, 3.5f, -3.94f, 3.76f, -7.0f);
        pathBuilder.horizontalLineToRelative(0.09f);
        pathBuilder.curveTo(12.31f, 8.06f, 13.77f, 10.65f, 15.81f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(9.94f, 5.0f);
        pathBuilder.curveTo(9.64f, 7.93f, 8.05f, 10.27f, 6.0f, 10.86f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineTo(9.94f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 13.14f);
        pathBuilder.curveToRelative(2.05f, 0.58f, 3.64f, 2.93f, 3.94f, 5.86f);
        pathBuilder.horizontalLineTo(6.0f);
        pathBuilder.verticalLineTo(13.14f);
        pathBuilder.close();
        pathBuilder.moveTo(14.06f, 19.0f);
        pathBuilder.curveToRelative(0.3f, -2.93f, 1.89f, -5.27f, 3.94f, -5.86f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(14.06f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _curtains = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
