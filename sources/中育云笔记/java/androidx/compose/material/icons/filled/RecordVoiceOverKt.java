package androidx.compose.material.icons.filled;

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
public final class RecordVoiceOverKt {
    private static ImageVector _recordVoiceOver;

    public static final ImageVector getRecordVoiceOver(Icons.Filled filled) {
        ImageVector imageVector = _recordVoiceOver;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.RecordVoiceOver", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 9.0f);
        pathBuilder.moveToRelative(-4.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 15.0f);
        pathBuilder2.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(2.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.verticalLineToRelative(-2.0f);
        pathBuilder2.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.76f, 5.36f);
        pathBuilder2.lineToRelative(-1.68f, 1.69f);
        pathBuilder2.curveToRelative(0.84f, 1.18f, 0.84f, 2.71f, 0.0f, 3.89f);
        pathBuilder2.lineToRelative(1.68f, 1.69f);
        pathBuilder2.curveToRelative(2.02f, -2.02f, 2.02f, -5.07f, 0.0f, -7.27f);
        pathBuilder2.close();
        pathBuilder2.moveTo(20.07f, 2.0f);
        pathBuilder2.lineToRelative(-1.63f, 1.63f);
        pathBuilder2.curveToRelative(2.77f, 3.02f, 2.77f, 7.56f, 0.0f, 10.74f);
        pathBuilder2.lineTo(20.07f, 16.0f);
        pathBuilder2.curveToRelative(3.9f, -3.89f, 3.91f, -9.95f, 0.0f, -14.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recordVoiceOver = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
