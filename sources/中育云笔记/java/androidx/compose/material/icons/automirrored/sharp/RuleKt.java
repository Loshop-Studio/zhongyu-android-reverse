package androidx.compose.material.icons.automirrored.sharp;

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
public final class RuleKt {
    private static ImageVector _rule;

    public static final ImageVector getRule(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _rule;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.Rule", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.54f, 11.0f);
        pathBuilder.lineTo(13.0f, 7.46f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(16.54f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 13.41f);
        pathBuilder.lineTo(19.59f, 12.0f);
        pathBuilder.lineTo(17.0f, 14.59f);
        pathBuilder.lineTo(14.41f, 12.0f);
        pathBuilder.lineTo(13.0f, 13.41f);
        pathBuilder.lineTo(15.59f, 16.0f);
        pathBuilder.lineTo(13.0f, 18.59f);
        pathBuilder.lineTo(14.41f, 20.0f);
        pathBuilder.lineTo(17.0f, 17.41f);
        pathBuilder.lineTo(19.59f, 20.0f);
        pathBuilder.lineTo(21.0f, 18.59f);
        pathBuilder.lineTo(18.41f, 16.0f);
        pathBuilder.lineTo(21.0f, 13.41f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 15.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rule = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
