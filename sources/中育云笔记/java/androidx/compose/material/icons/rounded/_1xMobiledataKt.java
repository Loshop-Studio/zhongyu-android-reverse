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
public final class _1xMobiledataKt {
    private static ImageVector __1xMobiledata;

    public static final ImageVector get_1xMobiledata(Icons.Rounded rounded) {
        ImageVector imageVector = __1xMobiledata;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded._1xMobiledata", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(9.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(4.45f, 9.0f, 4.0f, 8.55f, 4.0f, 8.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(4.0f, 7.45f, 4.45f, 7.0f, 5.0f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.83f, 11.72f);
        pathBuilder.lineToRelative(1.92f, -3.21f);
        pathBuilder.curveTo(18.15f, 7.85f, 17.67f, 7.0f, 16.9f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.35f, 0.0f, -0.68f, 0.18f, -0.86f, 0.49f);
        pathBuilder.lineToRelative(-1.37f, 2.28f);
        pathBuilder.lineToRelative(-1.38f, -2.29f);
        pathBuilder.curveTo(13.11f, 7.18f, 12.79f, 7.0f, 12.44f, 7.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.78f, 0.0f, -1.26f, 0.85f, -0.86f, 1.51f);
        pathBuilder.lineToRelative(1.92f, 3.21f);
        pathBuilder.lineToRelative(-2.26f, 3.77f);
        pathBuilder.curveToRelative(-0.4f, 0.67f, 0.08f, 1.51f, 0.86f, 1.51f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.35f, 0.0f, 0.68f, -0.18f, 0.86f, -0.49f);
        pathBuilder.lineToRelative(1.71f, -2.85f);
        pathBuilder.lineToRelative(1.71f, 2.85f);
        pathBuilder.curveToRelative(0.18f, 0.3f, 0.51f, 0.49f, 0.86f, 0.49f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.78f, 0.0f, 1.26f, -0.85f, 0.86f, -1.51f);
        pathBuilder.lineTo(15.83f, 11.72f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        __1xMobiledata = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
