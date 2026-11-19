package androidx.compose.material.icons.rounded;

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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13413d2 = {"_alignHorizontalLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AlignHorizontalLeft", "Landroidx/compose/material/icons/Icons$Rounded;", "getAlignHorizontalLeft$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getAlignHorizontalLeft", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAlignHorizontalLeft.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignHorizontalLeft.kt\nandroidx/compose/material/icons/rounded/AlignHorizontalLeftKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,73:1\n212#2,12:74\n233#2,18:87\n253#2:124\n174#3:86\n705#4,2:105\n717#4,2:107\n719#4,11:113\n72#5,4:109\n*S KotlinDebug\n*F\n+ 1 AlignHorizontalLeft.kt\nandroidx/compose/material/icons/rounded/AlignHorizontalLeftKt\n*L\n35#1:74,12\n36#1:87,18\n36#1:124\n35#1:86\n36#1:105,2\n36#1:107,2\n36#1:113,11\n36#1:109,4\n*E\n"})
/* loaded from: classes.dex */
public final class AlignHorizontalLeftKt {
    private static ImageVector _alignHorizontalLeft;

    public static final ImageVector getAlignHorizontalLeft(Icons.Rounded rounded) {
        ImageVector imageVector = _alignHorizontalLeft;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlignHorizontalLeft", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.0f, 22.0f);
        pathBuilder.lineTo(3.0f, 22.0f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.curveTo(4.0f, 21.55f, 3.55f, 22.0f, 3.0f, 22.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.5f, 7.0f);
        pathBuilder.horizontalLineToRelative(-13.0f);
        pathBuilder.curveTo(6.67f, 7.0f, 6.0f, 7.67f, 6.0f, 8.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(6.0f, 9.33f, 6.67f, 10.0f, 7.5f, 10.0f);
        pathBuilder.horizontalLineToRelative(13.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(22.0f, 7.67f, 21.33f, 7.0f, 20.5f, 7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.5f, 14.0f);
        pathBuilder.horizontalLineToRelative(-7.0f);
        pathBuilder.curveTo(6.67f, 14.0f, 6.0f, 14.67f, 6.0f, 15.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.curveTo(16.0f, 14.67f, 15.33f, 14.0f, 14.5f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignHorizontalLeft = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.AlignHorizontalLeft", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.AlignHorizontalLeft", imports = {"androidx.compose.material.icons.automirrored.rounded.AlignHorizontalLeft"}))
    public static /* synthetic */ void getAlignHorizontalLeft$annotations(Icons.Rounded rounded) {
    }
}
