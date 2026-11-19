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
public final class EcoKt {
    private static ImageVector _eco;

    public static final ImageVector getEco(Icons.Rounded rounded) {
        ImageVector imageVector = _eco;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Eco", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.95f, 5.97f);
        pathBuilder.curveToRelative(-0.05f, -1.04f, -0.89f, -1.88f, -1.92f, -1.92f);
        pathBuilder.curveTo(17.33f, 4.02f, 16.66f, 4.0f, 16.01f, 4.0f);
        pathBuilder.curveTo(10.98f, 4.0f, 7.49f, 4.97f, 5.55f, 6.91f);
        pathBuilder.curveToRelative(-3.68f, 3.68f, -3.15f, 8.9f, 0.09f, 11.9f);
        pathBuilder.curveToRelative(0.01f, 0.0f, 0.01f, 0.0f, 0.01f, 0.0f);
        pathBuilder.curveToRelative(1.51f, -4.22f, 4.52f, -7.16f, 7.67f, -8.8f);
        pathBuilder.curveToRelative(-0.21f, 0.18f, -4.7f, 3.58f, -5.51f, 10.25f);
        pathBuilder.curveToRelative(1.05f, 0.48f, 2.2f, 0.75f, 3.36f, 0.75f);
        pathBuilder.curveToRelative(2.05f, 0.0f, 4.16f, -0.8f, 5.92f, -2.55f);
        pathBuilder.curveTo(19.28f, 16.26f, 20.23f, 12.1f, 19.95f, 5.97f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eco = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
