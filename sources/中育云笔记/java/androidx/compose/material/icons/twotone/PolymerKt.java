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

/* loaded from: classes2.dex */
public final class PolymerKt {
    private static ImageVector _polymer;

    public static final ImageVector getPolymer(Icons.TwoTone twoTone) {
        ImageVector imageVector = _polymer;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Polymer", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(7.11f, 16.63f);
        pathBuilder.lineTo(4.5f, 12.0f);
        pathBuilder.lineTo(9.0f, 4.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.lineTo(0.5f, 12.0f);
        pathBuilder.lineTo(5.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(7.89f, -12.63f);
        pathBuilder.lineTo(19.5f, 12.0f);
        pathBuilder.lineTo(15.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineToRelative(4.5f, -8.0f);
        pathBuilder.lineTo(19.0f, 4.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _polymer = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
