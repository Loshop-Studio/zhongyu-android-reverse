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
public final class EggAltKt {
    private static ImageVector _eggAlt;

    public static final ImageVector getEggAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _eggAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EggAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 9.0f);
        pathBuilder.curveTo(17.0f, 7.0f, 15.99f, 2.0f, 9.97f, 2.0f);
        pathBuilder.curveTo(4.95f, 2.0f, 1.94f, 6.0f, 2.0f, 11.52f);
        pathBuilder.curveTo(2.06f, 17.04f, 6.96f, 19.0f, 9.97f, 19.0f);
        pathBuilder.curveToRelative(2.01f, 0.0f, 2.01f, 3.0f, 6.02f, 3.0f);
        pathBuilder.curveTo(19.0f, 22.0f, 22.0f, 19.0f, 22.0f, 15.02f);
        pathBuilder.curveTo(22.0f, 12.0f, 21.01f, 11.0f, 19.0f, 9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.99f, 20.0f);
        pathBuilder.curveToRelative(-1.49f, 0.0f, -1.96f, -0.5f, -2.68f, -1.26f);
        pathBuilder.curveTo(12.66f, 18.05f, 11.66f, 17.0f, 9.97f, 17.0f);
        pathBuilder.curveTo(8.33f, 17.0f, 4.05f, 16.01f, 4.0f, 11.5f);
        pathBuilder.curveTo(3.97f, 8.99f, 4.68f, 6.88f, 5.99f, 5.55f);
        pathBuilder.curveTo(7.01f, 4.52f, 8.35f, 4.0f, 9.97f, 4.0f);
        pathBuilder.curveToRelative(3.34f, 0.0f, 4.51f, 1.86f, 5.86f, 4.02f);
        pathBuilder.curveToRelative(0.55f, 0.88f, 1.07f, 1.71f, 1.76f, 2.39f);
        pathBuilder.curveToRelative(1.9f, 1.89f, 2.41f, 2.4f, 2.41f, 4.61f);
        pathBuilder.curveTo(20.0f, 17.87f, 17.88f, 20.0f, 15.99f, 20.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 12.0f);
        pathBuilder2.moveToRelative(-3.5f, 0.0f);
        pathBuilder2.arcToRelative(3.5f, 3.5f, 0.0f, true, true, 7.0f, 0.0f);
        pathBuilder2.arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f);
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eggAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
