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
public final class DownloadDoneKt {
    private static ImageVector _downloadDone;

    public static final ImageVector getDownloadDone(Icons.Rounded rounded) {
        ImageVector imageVector = _downloadDone;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DownloadDone", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineTo(6.0f, 20.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.01f, 13.9f);
        pathBuilder.curveToRelative(-0.78f, 0.77f, -2.04f, 0.77f, -2.82f, -0.01f);
        pathBuilder.lineTo(6.0f, 11.7f);
        pathBuilder.curveToRelative(-0.55f, -0.55f, -0.54f, -1.44f, 0.03f, -1.97f);
        pathBuilder.curveToRelative(0.54f, -0.52f, 1.4f, -0.5f, 1.92f, 0.02f);
        pathBuilder.lineTo(9.6f, 11.4f);
        pathBuilder.lineToRelative(6.43f, -6.43f);
        pathBuilder.curveToRelative(0.54f, -0.54f, 1.41f, -0.54f, 1.95f, 0.0f);
        pathBuilder.lineToRelative(0.04f, 0.04f);
        pathBuilder.curveToRelative(0.54f, 0.54f, 0.54f, 1.42f, -0.01f, 1.96f);
        pathBuilder.lineToRelative(-7.0f, 6.93f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _downloadDone = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
