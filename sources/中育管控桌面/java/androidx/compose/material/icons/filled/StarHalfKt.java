package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.SolidColor;
import androidx.compose.p009ui.graphics.StrokeCap;
import androidx.compose.p009ui.graphics.StrokeJoin;
import androidx.compose.p009ui.graphics.vector.ImageVector;
import androidx.compose.p009ui.graphics.vector.PathBuilder;
import androidx.compose.p009ui.graphics.vector.VectorKt;
import androidx.compose.p009ui.unit.C2452Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7880d2 = {"_starHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "StarHalf", "Landroidx/compose/material/icons/Icons$Filled;", "getStarHalf$annotations", "(Landroidx/compose/material/icons/Icons$Filled;)V", "getStarHalf", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m7881k = 2, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nStarHalf.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StarHalf.kt\nandroidx/compose/material/icons/filled/StarHalfKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,63:1\n212#2,12:64\n233#2,18:77\n253#2:114\n174#3:76\n705#4,2:95\n717#4,2:97\n719#4,11:103\n72#5,4:99\n*S KotlinDebug\n*F\n+ 1 StarHalf.kt\nandroidx/compose/material/icons/filled/StarHalfKt\n*L\n35#1:64,12\n36#1:77,18\n36#1:114\n35#1:76\n36#1:95,2\n36#1:97,2\n36#1:103,11\n36#1:99,4\n*E\n"})
/* loaded from: classes.dex */
public final class StarHalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(Icons.Filled filled) {
        ImageVector imageVector = _starHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.StarHalf", C2452Dp.m16484constructorimpl(24.0f), C2452Dp.m16484constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m13925getBlack0d7_KjU(), null);
        int iM14252getButtKaPHkGw = StrokeCap.INSTANCE.m14252getButtKaPHkGw();
        int iM14262getBevelLxFBmk8 = StrokeJoin.INSTANCE.m14262getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.0f, 9.24f);
        pathBuilder.lineToRelative(-7.19f, -0.62f);
        pathBuilder.lineTo(12.0f, 2.0f);
        pathBuilder.lineTo(9.19f, 8.63f);
        pathBuilder.lineTo(2.0f, 9.24f);
        pathBuilder.lineToRelative(5.46f, 4.73f);
        pathBuilder.lineTo(5.82f, 21.0f);
        pathBuilder.lineTo(12.0f, 17.27f);
        pathBuilder.lineTo(18.18f, 21.0f);
        pathBuilder.lineToRelative(-1.63f, -7.03f);
        pathBuilder.lineTo(22.0f, 9.24f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.4f);
        pathBuilder.verticalLineTo(6.1f);
        pathBuilder.lineToRelative(1.71f, 4.04f);
        pathBuilder.lineToRelative(4.38f, 0.38f);
        pathBuilder.lineToRelative(-3.32f, 2.88f);
        pathBuilder.lineToRelative(1.0f, 4.28f);
        pathBuilder.lineTo(12.0f, 15.4f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m14584addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM14252getButtKaPHkGw, iM14262getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _starHalf = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Filled.StarHalf", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Filled.StarHalf", imports = {"androidx.compose.material.icons.automirrored.filled.StarHalf"}))
    public static /* synthetic */ void getStarHalf$annotations(Icons.Filled filled) {
    }
}
