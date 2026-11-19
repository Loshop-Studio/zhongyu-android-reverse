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
public final class SentimentVerySatisfiedKt {
    private static ImageVector _sentimentVerySatisfied;

    public static final ImageVector getSentimentVerySatisfied(Icons.Outlined outlined) {
        ImageVector imageVector = _sentimentVerySatisfied;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SentimentVerySatisfied", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.reflectiveCurveTo(22.0f, 17.53f, 22.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 20.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 9.94f);
        pathBuilder.lineTo(14.06f, 11.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineTo(16.18f, 11.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.lineToRelative(-2.12f, -2.12f);
        pathBuilder.lineTo(13.0f, 9.94f);
        pathBuilder.close();
        pathBuilder.moveTo(8.88f, 9.94f);
        pathBuilder.lineTo(9.94f, 11.0f);
        pathBuilder.lineTo(11.0f, 9.94f);
        pathBuilder.lineTo(8.88f, 7.82f);
        pathBuilder.lineTo(6.76f, 9.94f);
        pathBuilder.lineTo(7.82f, 11.0f);
        pathBuilder.lineToRelative(1.06f, -1.06f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 17.5f);
        pathBuilder.curveToRelative(2.33f, 0.0f, 4.31f, -1.46f, 5.11f, -3.5f);
        pathBuilder.lineTo(6.89f, 14.0f);
        pathBuilder.curveToRelative(0.8f, 2.04f, 2.78f, 3.5f, 5.11f, 3.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sentimentVerySatisfied = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
