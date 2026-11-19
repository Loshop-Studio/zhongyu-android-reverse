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
public final class PanoramaVerticalSelectKt {
    private static ImageVector _panoramaVerticalSelect;

    public static final ImageVector getPanoramaVerticalSelect(Icons.Outlined outlined) {
        ImageVector imageVector = _panoramaVerticalSelect;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PanoramaVerticalSelect", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -3.89f, 0.84f, -6.95f, 1.43f, -8.69f);
        pathBuilder.curveTo(20.15f, 2.67f, 19.67f, 2.0f, 18.98f, 2.0f);
        pathBuilder.lineTo(5.0f, 2.0f);
        pathBuilder.curveTo(4.32f, 2.0f, 3.84f, 2.66f, 4.05f, 3.31f);
        pathBuilder.curveTo(4.74f, 5.36f, 5.5f, 8.1f, 5.5f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 3.87f, -0.76f, 6.66f, -1.45f, 8.69f);
        pathBuilder.curveTo(3.84f, 21.34f, 4.32f, 22.0f, 5.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.68f, 0.0f, 1.17f, -0.66f, 0.95f, -1.31f);
        pathBuilder.curveTo(19.27f, 18.66f, 18.5f, 15.86f, 18.5f, 12.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panoramaVerticalSelect = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
