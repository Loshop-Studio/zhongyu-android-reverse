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
public final class EmojiEventsKt {
    private static ImageVector _emojiEvents;

    public static final ImageVector getEmojiEvents(Icons.Sharp sharp) {
        ImageVector imageVector = _emojiEvents;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EmojiEvents", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 5.0f, 3.0f, 5.9f, 3.0f, 7.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.curveToRelative(0.0f, 2.55f, 1.92f, 4.63f, 4.39f, 4.94f);
        pathBuilder.curveToRelative(0.63f, 1.5f, 1.98f, 2.63f, 3.61f, 2.96f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(-3.1f);
        pathBuilder.curveToRelative(1.63f, -0.33f, 2.98f, -1.46f, 3.61f, -2.96f);
        pathBuilder.curveTo(19.08f, 12.63f, 21.0f, 10.55f, 21.0f, 8.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.curveTo(21.0f, 5.9f, 20.1f, 5.0f, 19.0f, 5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.0f, 8.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.82f);
        pathBuilder.curveTo(5.84f, 10.4f, 5.0f, 9.3f, 5.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.3f, -0.84f, 2.4f, -2.0f, 2.82f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiEvents = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
