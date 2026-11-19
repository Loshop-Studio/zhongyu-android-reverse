package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class FlagKt {
    private static ImageVector _flag;

    public static final ImageVector getFlag(Icons.TwoTone twoTone) {
        ImageVector imageVector = _flag;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Flag", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.36f, 6.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(7.24f);
        pathBuilder.lineToRelative(0.4f, 2.0f);
        pathBuilder.horizontalLineTo(18.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.horizontalLineToRelative(-5.24f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.4f, 6.0f);
        pathBuilder2.lineTo(14.0f, 4.0f);
        pathBuilder2.lineTo(5.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(17.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-7.0f);
        pathBuilder2.horizontalLineToRelative(5.6f);
        pathBuilder2.lineToRelative(0.4f, 2.0f);
        pathBuilder2.horizontalLineToRelative(7.0f);
        pathBuilder2.lineTo(20.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(-5.6f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 14.0f);
        pathBuilder2.horizontalLineToRelative(-3.36f);
        pathBuilder2.lineToRelative(-0.4f, -2.0f);
        pathBuilder2.lineTo(7.0f, 12.0f);
        pathBuilder2.lineTo(7.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(5.36f);
        pathBuilder2.lineToRelative(0.4f, 2.0f);
        pathBuilder2.lineTo(18.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flag = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
