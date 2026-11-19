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
import p309qc.InterfaceC10770a;

/* loaded from: classes.dex */
public final class AssistantDirectionKt {
    private static ImageVector _assistantDirection;

    public static final ImageVector getAssistantDirection(Icons.Outlined outlined) {
        ImageVector imageVector = _assistantDirection;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AssistantDirection", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 1.0f);
        pathBuilder.curveTo(5.9f, 1.0f, 1.0f, 5.9f, 1.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.9f, 11.0f, 11.0f, 11.0f);
        pathBuilder.reflectiveCurveToRelative(11.0f, -4.9f, 11.0f, -11.0f);
        pathBuilder.reflectiveCurveTo(18.1f, 1.0f, 12.0f, 1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 21.0f);
        pathBuilder.curveToRelative(-4.99f, 0.0f, -9.0f, -4.01f, -9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(4.01f, -9.0f, 9.0f, -9.0f);
        pathBuilder.reflectiveCurveToRelative(9.0f, 4.01f, 9.0f, 9.0f);
        pathBuilder.reflectiveCurveTo(16.99f, 21.0f, 12.0f, 21.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(19.73f, 11.42f);
        pathBuilder2.lineTo(12.54f, 4.2f);
        pathBuilder2.curveToRelative(-0.36f, -0.27f, -0.8f, -0.27f, -1.15f, 0.0f);
        pathBuilder2.lineTo(4.2f, 11.42f);
        pathBuilder2.curveToRelative(-0.27f, 0.36f, -0.27f, 0.8f, 0.0f, 1.16f);
        pathBuilder2.lineToRelative(7.19f, 7.22f);
        pathBuilder2.curveToRelative(0.36f, 0.27f, 0.8f, 0.27f, 1.15f, 0.0f);
        pathBuilder2.lineToRelative(7.19f, -7.22f);
        pathBuilder2.curveTo(20.09f, 12.22f, 20.09f, 11.69f, 19.73f, 11.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(13.5f, 14.5f);
        pathBuilder2.lineToRelative(-1.41f, -1.41f);
        pathBuilder2.lineTo(13.17f, 12.0f);
        pathBuilder2.horizontalLineTo(10.0f);
        pathBuilder2.verticalLineToRelative(3.0f);
        pathBuilder2.horizontalLineTo(8.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.curveToRelative(0.0f, -0.6f, 0.4f, -1.0f, 1.0f, -1.0f);
        pathBuilder2.horizontalLineToRelative(4.17f);
        pathBuilder2.lineToRelative(-1.09f, -1.09f);
        pathBuilder2.lineTo(13.5f, 7.5f);
        pathBuilder2.lineTo(17.0f, 11.0f);
        pathBuilder2.lineTo(13.5f, 14.5f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _assistantDirection = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getAssistantDirection$annotations(Icons.Outlined outlined) {
    }
}
