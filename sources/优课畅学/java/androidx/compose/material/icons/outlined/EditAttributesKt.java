package androidx.compose.material.icons.outlined;

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
public final class EditAttributesKt {
    private static ImageVector _editAttributes;

    public static final ImageVector getEditAttributes(Icons.Outlined outlined) {
        ImageVector imageVector = _editAttributes;
        if (imageVector != null) {
            AbstractC9133u.m16130d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EditAttributes", C3156Dp.m26899constructorimpl(24.0f), C3156Dp.m26899constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m24302getBlack0d7_KjU(), null);
        int iM24629getButtKaPHkGw = StrokeCap.Companion.m24629getButtKaPHkGw();
        int iM24639getBevelLxFBmk8 = StrokeJoin.Companion.m24639getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.63f, 7.0f);
        pathBuilder.lineTo(6.37f, 7.0f);
        pathBuilder.curveTo(3.96f, 7.0f, 2.0f, 9.24f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.96f, 5.0f, 4.37f, 5.0f);
        pathBuilder.horizontalLineToRelative(11.26f);
        pathBuilder.curveToRelative(2.41f, 0.0f, 4.37f, -2.24f, 4.37f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(-1.96f, -5.0f, -4.37f, -5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.63f, 15.0f);
        pathBuilder.lineTo(6.37f, 15.0f);
        pathBuilder.curveTo(5.09f, 15.0f, 4.0f, 13.63f, 4.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(1.09f, -3.0f, 2.37f, -3.0f);
        pathBuilder.horizontalLineToRelative(11.26f);
        pathBuilder.curveTo(18.91f, 9.0f, 20.0f, 10.37f, 20.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-1.09f, 3.0f, -2.37f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.24f, 13.06f);
        pathBuilder.lineToRelative(-1.87f, -1.87f);
        pathBuilder.lineToRelative(-0.7f, 0.7f);
        pathBuilder.lineToRelative(2.57f, 2.57f);
        pathBuilder.lineToRelative(4.22f, -4.22f);
        pathBuilder.lineToRelative(-0.7f, -0.7f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m24961addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM24629getButtKaPHkGw, iM24639getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editAttributes = imageVectorBuild;
        AbstractC9133u.m16130d(imageVectorBuild);
        return imageVectorBuild;
    }
}
