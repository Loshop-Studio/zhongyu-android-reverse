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
public final class ThumbUpAltKt {
    private static ImageVector _thumbUpAlt;

    public static final ImageVector getThumbUpAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _thumbUpAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbUpAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(-6.31f);
        pathBuilder.lineToRelative(0.95f, -4.57f);
        pathBuilder.lineToRelative(0.03f, -0.32f);
        pathBuilder.curveToRelative(0.0f, -0.41f, -0.17f, -0.79f, -0.44f, -1.06f);
        pathBuilder.lineTo(14.17f, 1.0f);
        pathBuilder.lineTo(7.59f, 7.59f);
        pathBuilder.curveTo(7.22f, 7.95f, 7.0f, 8.45f, 7.0f, 9.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.54f, -0.5f, 1.84f, -1.22f);
        pathBuilder.lineToRelative(3.02f, -7.05f);
        pathBuilder.curveToRelative(0.09f, -0.23f, 0.14f, -0.47f, 0.14f, -0.73f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 12.0f);
        pathBuilder.lineToRelative(-3.0f, 7.0f);
        pathBuilder.lineTo(9.0f, 19.0f);
        pathBuilder.lineTo(9.0f, 9.0f);
        pathBuilder.lineToRelative(4.34f, -4.34f);
        pathBuilder.lineTo(12.23f, 10.0f);
        pathBuilder.lineTo(21.0f, 10.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(1.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.lineTo(1.0f, 21.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbUpAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
