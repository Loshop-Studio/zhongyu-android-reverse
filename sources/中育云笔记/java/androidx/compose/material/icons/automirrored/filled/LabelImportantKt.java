package androidx.compose.material.icons.automirrored.filled;

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
public final class LabelImportantKt {
    private static ImageVector _labelImportant;

    public static final ImageVector getLabelImportant(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _labelImportant;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.LabelImportant", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.5f, 18.99f);
        pathBuilder.lineToRelative(11.0f, 0.01f);
        pathBuilder.curveToRelative(0.67f, 0.0f, 1.27f, -0.33f, 1.63f, -0.84f);
        pathBuilder.lineTo(20.5f, 12.0f);
        pathBuilder.lineToRelative(-4.37f, -6.16f);
        pathBuilder.curveToRelative(-0.36f, -0.51f, -0.96f, -0.84f, -1.63f, -0.84f);
        pathBuilder.lineToRelative(-11.0f, 0.01f);
        pathBuilder.lineTo(8.34f, 12.0f);
        pathBuilder.lineTo(3.5f, 18.99f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _labelImportant = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
