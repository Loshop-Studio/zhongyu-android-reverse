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
public final class TranslateKt {
    private static ImageVector _translate;

    public static final ImageVector getTranslate(Icons.Sharp sharp) {
        ImageVector imageVector = _translate;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Translate", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.87f, 15.07f);
        pathBuilder.lineToRelative(-2.54f, -2.51f);
        pathBuilder.lineToRelative(0.03f, -0.03f);
        pathBuilder.curveToRelative(1.74f, -1.94f, 2.98f, -4.17f, 3.71f, -6.53f);
        pathBuilder.lineTo(17.0f, 6.0f);
        pathBuilder.lineTo(17.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.lineTo(10.0f, 2.0f);
        pathBuilder.lineTo(8.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(1.0f, 4.0f);
        pathBuilder.verticalLineToRelative(1.99f);
        pathBuilder.horizontalLineToRelative(11.17f);
        pathBuilder.curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f);
        pathBuilder.curveTo(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.curveToRelative(0.73f, 1.63f, 1.73f, 3.17f, 2.98f, 4.56f);
        pathBuilder.lineToRelative(-5.09f, 5.02f);
        pathBuilder.lineTo(4.0f, 19.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.lineToRelative(3.11f, 3.11f);
        pathBuilder.lineToRelative(0.76f, -2.04f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.lineTo(12.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(1.12f, -3.0f);
        pathBuilder.horizontalLineToRelative(4.75f);
        pathBuilder.lineTo(21.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineToRelative(-4.5f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.88f, 17.0f);
        pathBuilder.lineToRelative(1.62f, -4.33f);
        pathBuilder.lineTo(19.12f, 17.0f);
        pathBuilder.horizontalLineToRelative(-3.24f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _translate = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
