package androidx.compose.material.icons.automirrored.rounded;

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
public final class ReplyAllKt {
    private static ImageVector _replyAll;

    public static final ImageVector getReplyAll(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _replyAll;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.ReplyAll", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(7.0f, 7.56f);
        pathBuilder.curveToRelative(0.0f, -0.94f, -1.14f, -1.42f, -1.81f, -0.75f);
        pathBuilder.lineTo(0.71f, 11.29f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.48f, 4.48f);
        pathBuilder.curveToRelative(0.67f, 0.68f, 1.81f, 0.2f, 1.81f, -0.74f);
        pathBuilder.curveToRelative(0.0f, -0.28f, -0.11f, -0.55f, -0.31f, -0.75f);
        pathBuilder.lineTo(3.0f, 12.0f);
        pathBuilder.lineToRelative(3.69f, -3.69f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.31f, -0.47f, 0.31f, -0.75f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.0f);
        pathBuilder.verticalLineTo(7.41f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineTo(6.7f, 11.29f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(4.59f, 4.59f);
        pathBuilder.curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f);
        pathBuilder.verticalLineTo(14.9f);
        pathBuilder.curveToRelative(5.0f, 0.0f, 8.5f, 1.6f, 11.0f, 5.1f);
        pathBuilder.curveToRelative(-1.0f, -5.0f, -4.0f, -10.0f, -11.0f, -11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _replyAll = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
