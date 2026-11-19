package androidx.compose.material.icons.automirrored.filled;

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
public final class DvrKt {
    private static ImageVector _dvr;

    public static final ImageVector getDvr(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _dvr;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.Dvr", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.lineTo(3.0f, 3.0f);
        pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
        pathBuilder.lineTo(23.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 17.0f);
        pathBuilder.lineTo(3.0f, 17.0f);
        pathBuilder.lineTo(3.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 8.0f);
        pathBuilder.lineTo(8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.lineTo(19.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 12.0f);
        pathBuilder.lineTo(8.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(11.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 8.0f);
        pathBuilder.lineTo(5.0f, 8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.lineTo(7.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 12.0f);
        pathBuilder.lineTo(5.0f, 12.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dvr = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
