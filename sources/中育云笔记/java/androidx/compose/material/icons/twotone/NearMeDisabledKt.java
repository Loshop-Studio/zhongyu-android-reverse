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
public final class NearMeDisabledKt {
    private static ImageVector _nearMeDisabled;

    public static final ImageVector getNearMeDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _nearMeDisabled;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NearMeDisabled", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.1f, 10.44f);
        pathBuilder.lineToRelative(1.5f, -4.05f);
        pathBuilder.lineToRelative(-4.05f, 1.5f);
        pathBuilder.lineTo(16.1f, 10.44f);
        pathBuilder.close();
        pathBuilder.moveTo(14.57f, 14.57f);
        pathBuilder.lineTo(9.43f, 9.43f);
        pathBuilder.lineToRelative(-2.71f, 1.01f);
        pathBuilder.lineToRelative(4.89f, 1.95f);
        pathBuilder.lineToRelative(1.95f, 4.89f);
        pathBuilder.lineTo(14.57f, 14.57f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 6.34f);
        pathBuilder2.lineTo(21.0f, 3.0f);
        pathBuilder2.lineToRelative(-3.34f, 9.0f);
        pathBuilder2.lineToRelative(-1.56f, -1.56f);
        pathBuilder2.lineToRelative(1.5f, -4.05f);
        pathBuilder2.lineToRelative(-4.05f, 1.5f);
        pathBuilder2.lineTo(12.0f, 6.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(21.19f, 21.19f);
        pathBuilder2.lineToRelative(-5.07f, -5.07f);
        pathBuilder2.lineTo(14.31f, 21.0f);
        pathBuilder2.horizontalLineTo(12.9f);
        pathBuilder2.lineToRelative(-2.83f, -7.07f);
        pathBuilder2.lineTo(3.0f, 11.1f);
        pathBuilder2.verticalLineTo(9.69f);
        pathBuilder2.lineToRelative(4.88f, -1.81f);
        pathBuilder2.lineTo(2.81f, 2.81f);
        pathBuilder2.lineToRelative(1.41f, -1.41f);
        pathBuilder2.lineToRelative(18.38f, 18.38f);
        pathBuilder2.lineTo(21.19f, 21.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.57f, 14.57f);
        pathBuilder2.lineTo(9.43f, 9.43f);
        pathBuilder2.lineToRelative(-2.71f, 1.01f);
        pathBuilder2.lineToRelative(4.89f, 1.95f);
        pathBuilder2.lineToRelative(1.95f, 4.89f);
        pathBuilder2.lineTo(14.57f, 14.57f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearMeDisabled = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
