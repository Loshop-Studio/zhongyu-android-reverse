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
public final class AddModeratorKt {
    private static ImageVector _addModerator;

    public static final ImageVector getAddModerator(Icons.Filled filled) {
        ImageVector imageVector = _addModerator;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddModerator", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(13.22f, 22.61f);
        pathBuilder.curveToRelative(-0.4f, 0.15f, -0.8f, 0.29f, -1.22f, 0.39f);
        pathBuilder.curveToRelative(-5.16f, -1.26f, -9.0f, -6.45f, -9.0f, -12.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.lineToRelative(9.0f, -4.0f);
        pathBuilder.lineToRelative(9.0f, 4.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.curveToRelative(0.0f, 0.9f, -0.11f, 1.78f, -0.3f, 2.65f);
        pathBuilder.curveToRelative(-0.81f, -0.41f, -1.73f, -0.65f, -2.7f, -0.65f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.curveToRelative(0.0f, 1.36f, 0.46f, 2.61f, 1.22f, 3.61f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 20.0f);
        pathBuilder.verticalLineToRelative(2.99f);
        pathBuilder.reflectiveCurveToRelative(-1.99f, 0.01f, -2.0f, 0.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(-3.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addModerator = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
