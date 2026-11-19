package androidx.compose.material.icons.rounded;

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
public final class VoicemailKt {
    private static ImageVector _voicemail;

    public static final ImageVector getVoicemail(Icons.Rounded rounded) {
        ImageVector imageVector = _voicemail;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Voicemail", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(18.5f, 6.0f);
        pathBuilder.curveTo(15.46f, 6.0f, 13.0f, 8.46f, 13.0f, 11.5f);
        pathBuilder.curveToRelative(0.0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f);
        pathBuilder.lineTo(9.74f, 15.0f);
        pathBuilder.curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f);
        pathBuilder.curveTo(11.0f, 8.46f, 8.54f, 6.0f, 5.5f, 6.0f);
        pathBuilder.reflectiveCurveTo(0.0f, 8.46f, 0.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(2.46f, 17.0f, 5.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(3.04f, 0.0f, 5.5f, -2.46f, 5.5f, -5.5f);
        pathBuilder.reflectiveCurveTo(21.54f, 6.0f, 18.5f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(5.5f, 15.0f);
        pathBuilder.curveTo(3.57f, 15.0f, 2.0f, 13.43f, 2.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(3.57f, 8.0f, 5.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(9.0f, 9.57f, 9.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(7.43f, 15.0f, 5.5f, 15.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.5f, 15.0f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(16.57f, 8.0f, 18.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(22.0f, 9.57f, 22.0f, 11.5f);
        pathBuilder.reflectiveCurveTo(20.43f, 15.0f, 18.5f, 15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _voicemail = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
