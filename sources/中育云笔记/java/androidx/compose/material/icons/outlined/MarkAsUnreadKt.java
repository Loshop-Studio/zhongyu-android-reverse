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
public final class MarkAsUnreadKt {
    private static ImageVector _markAsUnread;

    public static final ImageVector getMarkAsUnread(Icons.Outlined outlined) {
        ImageVector imageVector = _markAsUnread;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MarkAsUnread", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.23f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.6f);
        pathBuilder.curveToRelative(-0.06f, -0.47f, -0.36f, -0.94f, -0.79f, -1.17f);
        pathBuilder.lineTo(10.5f, 2.0f);
        pathBuilder.lineTo(2.8f, 5.83f);
        pathBuilder.curveTo(2.32f, 6.09f, 2.0f, 6.64f, 2.0f, 7.17f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.verticalLineTo(7.4f);
        pathBuilder.lineTo(10.5f, 4.0f);
        pathBuilder.lineTo(16.23f, 7.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(20.0f, 8.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilder2.verticalLineToRelative(9.0f);
        pathBuilder2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder2.horizontalLineToRelative(13.0f);
        pathBuilder2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder2.verticalLineToRelative(-9.0f);
        pathBuilder2.curveTo(22.0f, 8.9f, 21.1f, 8.0f, 20.0f, 8.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 19.0f);
        pathBuilder2.horizontalLineTo(7.0f);
        pathBuilder2.verticalLineToRelative(-7.0f);
        pathBuilder2.lineToRelative(6.5f, 3.33f);
        pathBuilder2.lineTo(20.0f, 12.0f);
        pathBuilder2.verticalLineTo(19.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.5f, 13.33f);
        pathBuilder2.lineTo(7.0f, 10.0f);
        pathBuilder2.horizontalLineToRelative(13.0f);
        pathBuilder2.lineTo(13.5f, 13.33f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markAsUnread = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
