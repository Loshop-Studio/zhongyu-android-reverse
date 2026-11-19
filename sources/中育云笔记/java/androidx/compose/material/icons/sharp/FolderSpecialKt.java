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
public final class FolderSpecialKt {
    private static ImageVector _folderSpecial;

    public static final ImageVector getFolderSpecial(Icons.Sharp sharp) {
        ImageVector imageVector = _folderSpecial;
        if (imageVector != null) {
            AbstractC9979u.m20291d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FolderSpecial", C3186Dp.m33501constructorimpl(24.0f), C3186Dp.m33501constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m30904getBlack0d7_KjU(), null);
        int iM31231getButtKaPHkGw = StrokeCap.Companion.m31231getButtKaPHkGw();
        int iM31241getBevelLxFBmk8 = StrokeJoin.Companion.m31241getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 6.0f);
        pathBuilder.lineTo(12.0f, 6.0f);
        pathBuilder.lineToRelative(-2.0f, -2.0f);
        pathBuilder.lineTo(2.0f, 4.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(22.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.94f, 17.0f);
        pathBuilder.lineTo(15.0f, 15.28f);
        pathBuilder.lineTo(12.06f, 17.0f);
        pathBuilder.lineToRelative(0.78f, -3.33f);
        pathBuilder.lineToRelative(-2.59f, -2.24f);
        pathBuilder.lineToRelative(3.41f, -0.29f);
        pathBuilder.lineTo(15.0f, 8.0f);
        pathBuilder.lineToRelative(1.34f, 3.14f);
        pathBuilder.lineToRelative(3.41f, 0.29f);
        pathBuilder.lineToRelative(-2.59f, 2.24f);
        pathBuilder.lineToRelative(0.78f, 3.33f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m31563addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM31231getButtKaPHkGw, iM31241getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _folderSpecial = imageVectorBuild;
        AbstractC9979u.m20291d(imageVectorBuild);
        return imageVectorBuild;
    }
}
