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
public final class StarOutlineKt {
    private static ImageVector _starOutline;

    public static final ImageVector getStarOutline(Icons.Rounded rounded) {
        ImageVector imageVector = _starOutline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.StarOutline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.65f, 9.04f);
        pathBuilder.lineToRelative(-4.84f, -0.42f);
        pathBuilder.lineToRelative(-1.89f, -4.45f);
        pathBuilder.curveToRelative(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        pathBuilder.lineTo(9.19f, 8.63f);
        pathBuilder.lineToRelative(-4.83f, 0.41f);
        pathBuilder.curveToRelative(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        pathBuilder.lineToRelative(3.67f, 3.18f);
        pathBuilder.lineToRelative(-1.1f, 4.72f);
        pathBuilder.curveToRelative(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        pathBuilder.lineToRelative(4.15f, -2.5f);
        pathBuilder.lineToRelative(4.15f, 2.51f);
        pathBuilder.curveToRelative(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        pathBuilder.lineToRelative(-1.1f, -4.73f);
        pathBuilder.lineToRelative(3.67f, -3.18f);
        pathBuilder.curveToRelative(0.67f, -0.58f, 0.32f, -1.68f, -0.56f, -1.75f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.4f);
        pathBuilder.lineToRelative(-3.76f, 2.27f);
        pathBuilder.lineToRelative(1.0f, -4.28f);
        pathBuilder.lineToRelative(-3.32f, -2.88f);
        pathBuilder.lineToRelative(4.38f, -0.38f);
        pathBuilder.lineTo(12.0f, 6.1f);
        pathBuilder.lineToRelative(1.71f, 4.04f);
        pathBuilder.lineToRelative(4.38f, 0.38f);
        pathBuilder.lineToRelative(-3.32f, 2.88f);
        pathBuilder.lineToRelative(1.0f, 4.28f);
        pathBuilder.lineTo(12.0f, 15.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starOutline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
