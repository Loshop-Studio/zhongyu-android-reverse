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
public final class MarkAsUnreadKt {
    private static ImageVector _markAsUnread;

    public static final ImageVector getMarkAsUnread(Icons.Sharp sharp) {
        ImageVector imageVector = _markAsUnread;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MarkAsUnread", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.23f, 7.0f);
        pathBuilder.lineToRelative(4.12f, 0.0f);
        pathBuilder.lineToRelative(-9.85f, -5.0f);
        pathBuilder.lineToRelative(-8.5f, 4.21f);
        pathBuilder.lineToRelative(0.0f, 10.79f);
        pathBuilder.lineToRelative(2.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, -9.6f);
        pathBuilder.lineToRelative(6.5f, -3.4f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(5.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(13.0f);
        pathBuilder2.horizontalLineToRelative(17.0f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.horizontalLineTo(5.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.0f, 12.0f);
        pathBuilder2.lineToRelative(-6.5f, 3.33f);
        pathBuilder2.lineTo(7.0f, 12.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.lineToRelative(6.5f, 3.33f);
        pathBuilder2.lineTo(20.0f, 10.0f);
        pathBuilder2.verticalLineTo(12.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markAsUnread = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
