package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes.dex */
public final class RecordVoiceOverKt {
    private static ImageVector _recordVoiceOver;

    public static final ImageVector getRecordVoiceOver(Icons.Rounded rounded) {
        ImageVector imageVector = _recordVoiceOver;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.RecordVoiceOver", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int iM24629getButtKaPHkGw = companion2.m24629getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int iM24639getBevelLxFBmk8 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 9.0f);
        pathBuilder.moveToRelative(-4.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f);
        ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw2 = companion2.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk82 = companion3.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(9.0f, 15.0f);
        pathBuilder2.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        pathBuilder2.verticalLineToRelative(1.0f);
        pathBuilder2.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilder2.horizontalLineToRelative(14.0f);
        pathBuilder2.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder2.verticalLineToRelative(-1.0f);
        pathBuilder2.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(15.47f, 7.77f);
        pathBuilder2.curveToRelative(0.32f, 0.79f, 0.32f, 1.67f, 0.0f, 2.46f);
        pathBuilder2.curveToRelative(-0.19f, 0.47f, -0.11f, 1.0f, 0.25f, 1.36f);
        pathBuilder2.lineToRelative(0.03f, 0.03f);
        pathBuilder2.curveToRelative(0.58f, 0.58f, 1.57f, 0.46f, 1.95f, -0.27f);
        pathBuilder2.curveToRelative(0.76f, -1.45f, 0.76f, -3.15f, -0.02f, -4.66f);
        pathBuilder2.curveToRelative(-0.38f, -0.74f, -1.38f, -0.88f, -1.97f, -0.29f);
        pathBuilder2.lineToRelative(-0.01f, 0.01f);
        pathBuilder2.curveToRelative(-0.34f, 0.35f, -0.42f, 0.89f, -0.23f, 1.36f);
        pathBuilder2.close();
        pathBuilder2.moveTo(19.18f, 2.89f);
        pathBuilder2.curveToRelative(-0.4f, 0.4f, -0.46f, 1.02f, -0.13f, 1.48f);
        pathBuilder2.curveToRelative(1.97f, 2.74f, 1.96f, 6.41f, -0.03f, 9.25f);
        pathBuilder2.curveToRelative(-0.32f, 0.45f, -0.25f, 1.07f, 0.14f, 1.46f);
        pathBuilder2.lineToRelative(0.03f, 0.03f);
        pathBuilder2.curveToRelative(0.49f, 0.49f, 1.32f, 0.45f, 1.74f, -0.1f);
        pathBuilder2.curveToRelative(2.75f, -3.54f, 2.76f, -8.37f, 0.0f, -12.02f);
        pathBuilder2.curveToRelative(-0.42f, -0.55f, -1.26f, -0.59f, -1.75f, -0.1f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw2, iM24639getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _recordVoiceOver = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
