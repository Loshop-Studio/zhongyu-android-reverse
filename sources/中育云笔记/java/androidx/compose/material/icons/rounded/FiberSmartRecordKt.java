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
public final class FiberSmartRecordKt {
    private static ImageVector _fiberSmartRecord;

    public static final ImageVector getFiberSmartRecord(Icons.Rounded rounded) {
        ImageVector imageVector = _fiberSmartRecord;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FiberSmartRecord", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 12.0f);
        pathBuilder.moveToRelative(-8.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(17.0f, 5.55f);
        pathBuilder2.verticalLineToRelative(0.18f);
        pathBuilder2.curveToRelative(0.0f, 0.37f, 0.23f, 0.69f, 0.57f, 0.85f);
        pathBuilder2.curveTo(19.6f, 7.54f, 21.0f, 9.61f, 21.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.4f, 4.46f, -3.43f, 5.42f);
        pathBuilder2.curveToRelative(-0.34f, 0.16f, -0.57f, 0.47f, -0.57f, 0.84f);
        pathBuilder2.verticalLineToRelative(0.18f);
        pathBuilder2.curveToRelative(0.0f, 0.68f, 0.71f, 1.11f, 1.32f, 0.82f);
        pathBuilder2.curveTo(21.08f, 18.01f, 23.0f, 15.23f, 23.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-1.92f, -6.01f, -4.68f, -7.27f);
        pathBuilder2.curveToRelative(-0.61f, -0.28f, -1.32f, 0.14f, -1.32f, 0.82f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fiberSmartRecord = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
