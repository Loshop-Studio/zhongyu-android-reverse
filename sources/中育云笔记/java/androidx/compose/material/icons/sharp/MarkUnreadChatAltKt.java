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
public final class MarkUnreadChatAltKt {
    private static ImageVector _markUnreadChatAlt;

    public static final ImageVector getMarkUnreadChatAlt(Icons.Sharp sharp) {
        ImageVector imageVector = _markUnreadChatAlt;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MarkUnreadChatAlt", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.moveToRelative(-3.0f, 0.0f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(6.0f, 8.0f);
        pathBuilder2.verticalLineTo(6.0f);
        pathBuilder2.horizontalLineToRelative(9.03f);
        pathBuilder2.curveToRelative(-1.21f, -1.6f, -1.08f, -3.21f, -0.92f, -4.0f);
        pathBuilder2.horizontalLineTo(2.01f);
        pathBuilder2.lineTo(2.0f, 22.0f);
        pathBuilder2.lineToRelative(4.0f, -4.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineTo(6.97f);
        pathBuilder2.curveTo(21.16f, 7.61f, 20.13f, 8.0f, 19.0f, 8.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(14.0f, 14.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineTo(14.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(18.0f, 11.0f);
        pathBuilder2.horizontalLineTo(6.0f);
        pathBuilder2.verticalLineTo(9.0f);
        pathBuilder2.horizontalLineToRelative(12.0f);
        pathBuilder2.verticalLineTo(11.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _markUnreadChatAlt = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
