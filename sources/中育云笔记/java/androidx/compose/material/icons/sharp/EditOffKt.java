package androidx.compose.material.icons.sharp;

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
public final class EditOffKt {
    private static ImageVector _editOff;

    public static final ImageVector getEditOff(Icons.Sharp sharp) {
        ImageVector imageVector = _editOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.EditOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.41f, 6.33f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineToRelative(-2.53f, 2.54f);
        pathBuilder.lineToRelative(3.75f, 3.75f);
        pathBuilder.lineTo(21.41f, 6.33f);
        pathBuilder.close();
        pathBuilder.moveTo(1.39f, 4.22f);
        pathBuilder.lineToRelative(7.32f, 7.32f);
        pathBuilder.lineTo(3.0f, 17.25f);
        pathBuilder.verticalLineTo(21.0f);
        pathBuilder.horizontalLineToRelative(3.75f);
        pathBuilder.lineToRelative(5.71f, -5.71f);
        pathBuilder.lineToRelative(7.32f, 7.32f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineTo(2.81f, 2.81f);
        pathBuilder.lineTo(1.39f, 4.22f);
        pathBuilder.close();
        pathBuilder.moveTo(17.81f, 9.94f);
        pathBuilder.lineToRelative(-3.75f, -3.75f);
        pathBuilder.lineToRelative(-2.52f, 2.52f);
        pathBuilder.lineToRelative(3.75f, 3.75f);
        pathBuilder.lineTo(17.81f, 9.94f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
