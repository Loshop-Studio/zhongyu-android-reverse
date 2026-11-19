package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"_skipNext", "Landroidx/compose/ui/graphics/vector/ImageVector;", "SkipNext", "Landroidx/compose/material/icons/Icons$TwoTone;", "getSkipNext", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSkipNext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipNext.kt\nandroidx/compose/material/icons/twotone/SkipNextKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,58:1\n212#2,12:59\n233#2,18:72\n253#2:109\n233#2,18:110\n253#2:147\n174#3:71\n705#4,2:90\n717#4,2:92\n719#4,11:98\n705#4,2:128\n717#4,2:130\n719#4,11:136\n72#5,4:94\n72#5,4:132\n*S KotlinDebug\n*F\n+ 1 SkipNext.kt\nandroidx/compose/material/icons/twotone/SkipNextKt\n*L\n29#1:59,12\n30#1:72,18\n30#1:109\n36#1:110,18\n36#1:147\n29#1:71\n30#1:90,2\n30#1:92,2\n30#1:98,11\n36#1:128,2\n36#1:130,2\n36#1:136,11\n30#1:94,4\n36#1:132,4\n*E\n"})
/* loaded from: classes2.dex */
public final class SkipNextKt {
    private static ImageVector _skipNext;

    public static final ImageVector getSkipNext(Icons.TwoTone twoTone) {
        ImageVector imageVector = _skipNext;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SkipNext", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM21329getButtKaPHkGw = companion2.m21329getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM21339getBevelLxFBmk8 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 9.86f);
        pathBuilder.verticalLineToRelative(4.28f);
        pathBuilder.lineTo(11.03f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw2 = companion2.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk82 = companion3.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(14.5f, 12.0f);
        pathBuilder2.lineTo(6.0f, 6.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.lineToRelative(8.5f, -6.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(8.0f, 9.86f);
        pathBuilder2.lineTo(11.03f, 12.0f);
        pathBuilder2.lineTo(8.0f, 14.14f);
        pathBuilder2.verticalLineTo(9.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(16.0f, 6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.horizontalLineToRelative(-2.0f);
        pathBuilder2.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw2, iM21339getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _skipNext = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
