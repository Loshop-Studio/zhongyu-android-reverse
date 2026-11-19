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
public final class HighlightKt {
    private static ImageVector _highlight;

    public static final ImageVector getHighlight(Icons.Outlined outlined) {
        ImageVector imageVector = _highlight;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Highlight", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.0f, 14.0f);
        pathBuilder.lineToRelative(3.0f, 3.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(3.0f, -3.0f);
        pathBuilder.lineTo(18.0f, 9.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(2.17f);
        pathBuilder.lineToRelative(-3.0f, 3.0f);
        pathBuilder.lineTo(13.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-3.83f);
        pathBuilder.lineToRelative(-3.0f, -3.0f);
        pathBuilder.lineTo(8.0f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(3.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(3.502f, 5.874f);
        pathBuilder.lineTo(4.916f, 4.46f);
        pathBuilder.lineToRelative(2.122f, 2.12f);
        pathBuilder.lineToRelative(-1.414f, 1.415f);
        pathBuilder.close();
        pathBuilder.moveTo(16.96f, 6.582f);
        pathBuilder.lineToRelative(2.123f, -2.12f);
        pathBuilder.lineToRelative(1.413f, 1.416f);
        pathBuilder.lineToRelative(-2.123f, 2.12f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _highlight = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
