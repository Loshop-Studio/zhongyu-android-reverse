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
public final class NearMeKt {
    private static ImageVector _nearMe;

    public static final ImageVector getNearMe(Icons.TwoTone twoTone) {
        ImageVector imageVector = _nearMe;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NearMe", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.39f, 12.61f);
        pathBuilder.lineToRelative(0.32f, 0.83f);
        pathBuilder.lineToRelative(1.32f, 3.42f);
        pathBuilder.lineToRelative(4.24f, -10.13f);
        pathBuilder.lineToRelative(-10.13f, 4.24f);
        pathBuilder.lineToRelative(3.42f, 1.33f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(3.0f, 11.51f);
        pathBuilder2.lineToRelative(6.84f, 2.65f);
        pathBuilder2.lineTo(12.48f, 21.0f);
        pathBuilder2.horizontalLineToRelative(0.98f);
        pathBuilder2.lineTo(21.0f, 3.0f);
        pathBuilder2.lineTo(3.0f, 10.53f);
        pathBuilder2.verticalLineToRelative(0.98f);
        pathBuilder2.close();
        pathBuilder2.moveTo(17.27f, 6.73f);
        pathBuilder2.lineToRelative(-4.24f, 10.13f);
        pathBuilder2.lineToRelative(-1.32f, -3.42f);
        pathBuilder2.lineToRelative(-0.32f, -0.83f);
        pathBuilder2.lineToRelative(-0.82f, -0.32f);
        pathBuilder2.lineToRelative(-3.43f, -1.33f);
        pathBuilder2.lineToRelative(10.13f, -4.23f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMe = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
