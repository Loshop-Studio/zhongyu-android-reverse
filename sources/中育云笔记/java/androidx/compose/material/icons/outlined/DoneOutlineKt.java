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

/* loaded from: classes.dex */
public final class DoneOutlineKt {
    private static ImageVector _doneOutline;

    public static final ImageVector getDoneOutline(Icons.Outlined outlined) {
        ImageVector imageVector = _doneOutline;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DoneOutline", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.77f, 4.93f);
        pathBuilder.lineToRelative(1.4f, 1.4f);
        pathBuilder.lineTo(8.43f, 19.07f);
        pathBuilder.lineToRelative(-5.6f, -5.6f);
        pathBuilder.lineToRelative(1.4f, -1.4f);
        pathBuilder.lineToRelative(4.2f, 4.2f);
        pathBuilder.lineTo(19.77f, 4.93f);
        pathBuilder.moveToRelative(0.0f, -2.83f);
        pathBuilder.lineTo(8.43f, 13.44f);
        pathBuilder.lineToRelative(-4.2f, -4.2f);
        pathBuilder.lineTo(0.0f, 13.47f);
        pathBuilder.lineToRelative(8.43f, 8.43f);
        pathBuilder.lineTo(24.0f, 6.33f);
        pathBuilder.lineTo(19.77f, 2.1f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doneOutline = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
