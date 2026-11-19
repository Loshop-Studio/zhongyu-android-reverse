package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.SolidColor;
import androidx.compose.p012ui.graphics.StrokeCap;
import androidx.compose.p012ui.graphics.StrokeJoin;
import androidx.compose.p012ui.graphics.vector.ImageVector;
import androidx.compose.p012ui.graphics.vector.PathBuilder;
import androidx.compose.p012ui.graphics.vector.VectorKt;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_emojiEmotions", "Landroidx/compose/ui/graphics/vector/ImageVector;", "EmojiEmotions", "Landroidx/compose/material/icons/Icons$Filled;", "getEmojiEmotions", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nEmojiEmotions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmojiEmotions.kt\nandroidx/compose/material/icons/filled/EmojiEmotionsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,60:1\n212#2,12:61\n233#2,18:74\n253#2:111\n174#3:73\n705#4,2:92\n717#4,2:94\n719#4,11:100\n72#5,4:96\n*S KotlinDebug\n*F\n+ 1 EmojiEmotions.kt\nandroidx/compose/material/icons/filled/EmojiEmotionsKt\n*L\n29#1:61,12\n30#1:74,18\n30#1:111\n29#1:73\n30#1:92,2\n30#1:94,2\n30#1:100,11\n30#1:96,4\n*E\n"})
/* loaded from: classes.dex */
public final class EmojiEmotionsKt {
    private static ImageVector _emojiEmotions;

    public static final ImageVector getEmojiEmotions(Icons.Filled filled) {
        ImageVector imageVector = _emojiEmotions;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.EmojiEmotions", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(11.99f, 2.0f);
        pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        pathBuilder.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 11.99f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(8.5f, 8.0f);
        pathBuilder.curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f);
        pathBuilder.reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 18.0f);
        pathBuilder.curveToRelative(-2.28f, 0.0f, -4.22f, -1.66f, -5.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveTo(16.22f, 16.34f, 14.28f, 18.0f, 12.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 11.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f);
        pathBuilder.reflectiveCurveTo(17.0f, 8.67f, 17.0f, 9.5f);
        pathBuilder.reflectiveCurveTo(16.33f, 11.0f, 15.5f, 11.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _emojiEmotions = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
