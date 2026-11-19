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
public final class AssistantDirectionKt {
    private static ImageVector _assistantDirection;

    public static final ImageVector getAssistantDirection(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _assistantDirection;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.AssistantDirection", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.5f, 10.0f);
        pathBuilder.horizontalLineTo(9.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.verticalLineToRelative(1.29f);
        pathBuilder.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        pathBuilder.lineToRelative(2.29f, -2.29f);
        pathBuilder.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        pathBuilder.lineToRelative(-2.29f, -2.29f);
        pathBuilder.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f);
        pathBuilder.verticalLineTo(10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f);
        pathBuilder.reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f);
        pathBuilder.reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.73f, 12.58f);
        pathBuilder.lineToRelative(-7.19f, 7.22f);
        pathBuilder.curveToRelative(-0.35f, 0.27f, -0.79f, 0.27f, -1.15f, 0.0f);
        pathBuilder.lineTo(4.2f, 12.58f);
        pathBuilder.curveToRelative(-0.27f, -0.36f, -0.27f, -0.8f, 0.0f, -1.16f);
        pathBuilder.lineToRelative(7.19f, -7.22f);
        pathBuilder.curveToRelative(0.35f, -0.27f, 0.79f, -0.27f, 1.15f, 0.0f);
        pathBuilder.lineToRelative(7.19f, 7.22f);
        pathBuilder.curveTo(20.09f, 11.69f, 20.09f, 12.22f, 19.73f, 12.58f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistantDirection = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
