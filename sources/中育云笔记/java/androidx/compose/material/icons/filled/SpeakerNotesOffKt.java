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
public final class SpeakerNotesOffKt {
    private static ImageVector _speakerNotesOff;

    public static final ImageVector getSpeakerNotesOff(Icons.Filled filled) {
        ImageVector imageVector = _speakerNotesOff;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SpeakerNotesOff", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.54f, 11.0f);
        pathBuilder.lineToRelative(-0.54f, -0.54f);
        pathBuilder.lineTo(7.54f, 8.0f);
        pathBuilder.lineTo(6.0f, 6.46f);
        pathBuilder.lineTo(2.38f, 2.84f);
        pathBuilder.lineTo(1.27f, 1.73f);
        pathBuilder.lineTo(0.0f, 3.0f);
        pathBuilder.lineToRelative(2.01f, 2.01f);
        pathBuilder.lineTo(2.0f, 22.0f);
        pathBuilder.lineToRelative(4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.lineToRelative(5.73f, 5.73f);
        pathBuilder.lineTo(22.0f, 22.46f);
        pathBuilder.lineTo(17.54f, 18.0f);
        pathBuilder.lineToRelative(-7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 14.0f);
        pathBuilder.lineTo(6.0f, 14.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(6.0f, 11.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.lineToRelative(2.0f, 2.0f);
        pathBuilder.lineTo(6.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 2.0f);
        pathBuilder.lineTo(4.08f, 2.0f);
        pathBuilder.lineTo(10.0f, 7.92f);
        pathBuilder.lineTo(10.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-7.92f);
        pathBuilder.lineToRelative(1.0f, 1.0f);
        pathBuilder.lineTo(18.0f, 9.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-4.92f);
        pathBuilder.lineToRelative(6.99f, 6.99f);
        pathBuilder.curveTo(21.14f, 17.95f, 22.0f, 17.08f, 22.0f, 16.0f);
        pathBuilder.lineTo(22.0f, 4.0f);
        pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _speakerNotesOff = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
