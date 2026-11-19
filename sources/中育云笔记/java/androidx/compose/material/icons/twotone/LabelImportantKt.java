package androidx.compose.material.icons.twotone;

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

/* loaded from: classes2.dex */
public final class LabelImportantKt {
    private static ImageVector _labelImportant;

    public static final ImageVector getLabelImportant(Icons.TwoTone twoTone) {
        ImageVector imageVector = _labelImportant;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LabelImportant", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM31231getButtKaPHkGw = companion2.m31231getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM31241getBevelLxFBmk8 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.0f, 7.0f);
        pathBuilder.horizontalLineTo(7.89f);
        pathBuilder.lineToRelative(3.57f, 5.0f);
        pathBuilder.lineToRelative(-3.57f, 5.0f);
        pathBuilder.horizontalLineTo(15.0f);
        pathBuilder.lineToRelative(3.55f, -5.0f);
        pathBuilder.close();
        ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw2 = companion2.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk82 = companion3.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.63f, 5.84f);
        pathBuilder2.curveTo(16.27f, 5.33f, 15.67f, 5.0f, 15.0f, 5.0f);
        pathBuilder2.horizontalLineTo(4.0f);
        pathBuilder2.lineToRelative(5.0f, 7.0f);
        pathBuilder2.lineToRelative(-5.0f, 6.99f);
        pathBuilder2.horizontalLineToRelative(11.0f);
        pathBuilder2.curveToRelative(0.67f, 0.0f, 1.27f, -0.32f, 1.63f, -0.83f);
        pathBuilder2.lineTo(21.0f, 12.0f);
        pathBuilder2.lineToRelative(-4.37f, -6.16f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.0f, 17.0f);
        pathBuilder2.horizontalLineTo(7.89f);
        pathBuilder2.lineToRelative(3.57f, -5.0f);
        pathBuilder2.lineToRelative(-3.57f, -5.0f);
        pathBuilder2.horizontalLineTo(15.0f);
        pathBuilder2.lineToRelative(3.55f, 5.0f);
        pathBuilder2.lineTo(15.0f, 17.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw2, iM31241getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelImportant = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getLabelImportant$annotations(Icons.TwoTone twoTone) {
    }
}
