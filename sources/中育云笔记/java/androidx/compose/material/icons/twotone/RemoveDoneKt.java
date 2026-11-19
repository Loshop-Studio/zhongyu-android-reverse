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
public final class RemoveDoneKt {
    private static ImageVector _removeDone;

    public static final ImageVector getRemoveDone(Icons.TwoTone twoTone) {
        ImageVector imageVector = _removeDone;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.RemoveDone", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.84f, 1.98f);
        pathBuilder.lineTo(3.43f, 3.39f);
        pathBuilder.lineToRelative(10.38f, 10.38f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(-4.24f, -4.24f);
        pathBuilder.lineToRelative(-1.41f, 1.41f);
        pathBuilder.lineToRelative(5.66f, 5.66f);
        pathBuilder.lineToRelative(2.83f, -2.83f);
        pathBuilder.lineToRelative(6.6f, 6.6f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(4.84f, 1.98f);
        pathBuilder.close();
        pathBuilder.moveTo(18.05f, 12.36f);
        pathBuilder.lineTo(23.0f, 7.4f);
        pathBuilder.lineTo(21.57f, 6.0f);
        pathBuilder.lineToRelative(-4.94f, 4.94f);
        pathBuilder.lineTo(18.05f, 12.36f);
        pathBuilder.close();
        pathBuilder.moveTo(17.34f, 7.4f);
        pathBuilder.lineToRelative(-1.41f, -1.41f);
        pathBuilder.lineToRelative(-2.12f, 2.12f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(17.34f, 7.4f);
        pathBuilder.close();
        pathBuilder.moveTo(1.08f, 12.35f);
        pathBuilder.lineToRelative(5.66f, 5.66f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(-5.66f, -5.66f);
        pathBuilder.lineTo(1.08f, 12.35f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _removeDone = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
