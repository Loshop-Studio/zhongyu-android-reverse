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
public final class SpellcheckKt {
    private static ImageVector _spellcheck;

    public static final ImageVector getSpellcheck(Icons.Rounded rounded) {
        ImageVector imageVector = _spellcheck;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Spellcheck", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.12f, 16.0f);
        pathBuilder.curveToRelative(0.69f, 0.0f, 1.15f, -0.69f, 0.9f, -1.32f);
        pathBuilder.lineTo(9.77f, 3.87f);
        pathBuilder.curveTo(9.56f, 3.34f, 9.06f, 3.0f, 8.5f, 3.0f);
        pathBuilder.reflectiveCurveToRelative(-1.06f, 0.34f, -1.27f, 0.87f);
        pathBuilder.lineTo(2.98f, 14.68f);
        pathBuilder.curveToRelative(-0.25f, 0.63f, 0.22f, 1.32f, 0.9f, 1.32f);
        pathBuilder.curveToRelative(0.4f, 0.0f, 0.76f, -0.25f, 0.91f, -0.63f);
        pathBuilder.lineTo(5.67f, 13.0f);
        pathBuilder.horizontalLineToRelative(5.64f);
        pathBuilder.lineToRelative(0.9f, 2.38f);
        pathBuilder.curveToRelative(0.15f, 0.37f, 0.51f, 0.62f, 0.91f, 0.62f);
        pathBuilder.close();
        pathBuilder.moveTo(6.43f, 11.0f);
        pathBuilder.lineTo(8.5f, 5.48f);
        pathBuilder.lineTo(10.57f, 11.0f);
        pathBuilder.lineTo(6.43f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.89f, 12.29f);
        pathBuilder.lineToRelative(-7.39f, 7.39f);
        pathBuilder.lineToRelative(-2.97f, -2.97f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        pathBuilder.lineToRelative(3.68f, 3.68f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(8.08f, -8.09f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.curveToRelative(-0.38f, -0.39f, -1.02f, -0.39f, -1.4f, -0.01f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spellcheck = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
