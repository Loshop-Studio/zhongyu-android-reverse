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
public final class ThumbDownAltKt {
    private static ImageVector _thumbDownAlt;

    public static final ImageVector getThumbDownAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _thumbDownAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ThumbDownAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 3.0f);
        pathBuilder.lineTo(6.0f, 3.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.54f, 0.5f, -1.84f, 1.22f);
        pathBuilder.lineToRelative(-3.02f, 7.05f);
        pathBuilder.curveToRelative(-0.09f, 0.23f, -0.14f, 0.47f, -0.14f, 0.73f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(6.31f);
        pathBuilder.lineToRelative(-0.95f, 4.57f);
        pathBuilder.lineToRelative(-0.03f, 0.32f);
        pathBuilder.curveToRelative(0.0f, 0.41f, 0.17f, 0.79f, 0.44f, 1.06f);
        pathBuilder.lineTo(9.83f, 23.0f);
        pathBuilder.lineToRelative(6.58f, -6.59f);
        pathBuilder.curveToRelative(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        pathBuilder.lineTo(17.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 15.0f);
        pathBuilder.lineToRelative(-4.34f, 4.34f);
        pathBuilder.lineTo(11.77f, 14.0f);
        pathBuilder.lineTo(3.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineToRelative(3.0f, -7.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
