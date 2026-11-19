package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.graphics.StrokeCap;
import androidx.compose.p011ui.graphics.StrokeJoin;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.graphics.vector.PathBuilder;
import androidx.compose.p011ui.graphics.vector.VectorKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p061g.AbstractC5535a;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"_list", "Landroidx/compose/ui/graphics/vector/ImageVector;", "List", "Landroidx/compose/material/icons/Icons$Rounded;", "getList$annotations", "(Landroidx/compose/material/icons/Icons$Rounded;)V", "getList", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/rounded/ListKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,127:1\n212#2,12:128\n233#2,18:141\n253#2:178\n174#3:140\n705#4,2:159\n717#4,2:161\n719#4,11:167\n72#5,4:163\n*S KotlinDebug\n*F\n+ 1 List.kt\nandroidx/compose/material/icons/rounded/ListKt\n*L\n35#1:128,12\n36#1:141,18\n36#1:178\n35#1:140\n36#1:159,2\n36#1:161,2\n36#1:167,11\n36#1:163,4\n*E\n"})
/* loaded from: classes.dex */
public final class ListKt {

    @Nullable
    private static ImageVector _list;

    @NotNull
    public static final ImageVector getList(@NotNull Icons.Rounded rounded) {
        ImageVector imageVector = _list;
        if (imageVector != null) {
            AbstractC5830k.m5327d(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.List", C2331Dp.m13305constructorimpl(24.0f), C2331Dp.m13305constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m10708getBlack0d7_KjU(), null);
        int iM11035getButtKaPHkGw = StrokeCap.INSTANCE.m11035getButtKaPHkGw();
        int iM11045getBevelLxFBmk8 = StrokeJoin.INSTANCE.m11045getBevelLxFBmk8();
        PathBuilder pathBuilderM4894a = AbstractC5535a.m4894a(4.0f, 13.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(4.0f, 17.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(4.0f, 9.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(8.0f, 13.0f);
        pathBuilderM4894a.horizontalLineToRelative(12.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.lineTo(8.0f, 11.0f);
        pathBuilderM4894a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(8.0f, 17.0f);
        pathBuilderM4894a.horizontalLineToRelative(12.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.lineTo(8.0f, 15.0f);
        pathBuilderM4894a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(7.0f, 8.0f);
        pathBuilderM4894a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.horizontalLineToRelative(12.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.lineTo(8.0f, 7.0f);
        pathBuilderM4894a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(4.0f, 13.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(4.0f, 17.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(4.0f, 9.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(8.0f, 13.0f);
        pathBuilderM4894a.horizontalLineToRelative(12.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.lineTo(8.0f, 11.0f);
        pathBuilderM4894a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(8.0f, 17.0f);
        pathBuilderM4894a.horizontalLineToRelative(12.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.lineTo(8.0f, 15.0f);
        pathBuilderM4894a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.close();
        pathBuilderM4894a.moveTo(7.0f, 8.0f);
        pathBuilderM4894a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        pathBuilderM4894a.horizontalLineToRelative(12.0f);
        pathBuilderM4894a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilderM4894a.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        pathBuilderM4894a.lineTo(8.0f, 7.0f);
        pathBuilderM4894a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        pathBuilderM4894a.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m11367addPathoIyEayM$default(builder, pathBuilderM4894a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM11035getButtKaPHkGw, iM11045getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _list = imageVectorBuild;
        AbstractC5830k.m5327d(imageVectorBuild);
        return imageVectorBuild;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.List", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Rounded.List", imports = {"androidx.compose.material.icons.automirrored.rounded.List"}))
    public static /* synthetic */ void getList$annotations(Icons.Rounded rounded) {
    }
}
