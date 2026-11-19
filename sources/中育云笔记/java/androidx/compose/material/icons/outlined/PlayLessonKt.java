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
public final class PlayLessonKt {
    private static ImageVector _playLesson;

    public static final ImageVector getPlayLesson(Icons.Outlined outlined) {
        ImageVector imageVector = _playLesson;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PlayLesson", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(5.0f, 20.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(7.0f);
        pathBuilder.lineToRelative(2.5f, -1.5f);
        pathBuilder.lineTo(12.0f, 11.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.horizontalLineToRelative(5.0f);
        pathBuilder.verticalLineToRelative(7.08f);
        pathBuilder.curveToRelative(0.33f, -0.05f, 0.66f, -0.08f, 1.0f, -0.08f);
        pathBuilder.reflectiveCurveToRelative(0.67f, 0.03f, 1.0f, 0.08f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 2.0f, 3.0f, 2.9f, 3.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(7.26f);
        pathBuilder.curveToRelative(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.0f, 13.0f);
        pathBuilder.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveTo(20.76f, 13.0f, 18.0f, 13.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.75f, 20.5f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(4.0f, 2.5f);
        pathBuilder.lineTo(16.75f, 20.5f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playLesson = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
