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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_currencyRupee", "Landroidx/compose/ui/graphics/vector/ImageVector;", "CurrencyRupee", "Landroidx/compose/material/icons/Icons$Rounded;", "getCurrencyRupee", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCurrencyRupee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyRupee.kt\nandroidx/compose/material/icons/rounded/CurrencyRupeeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,66:1\n212#2,12:67\n233#2,18:80\n253#2:117\n174#3:79\n705#4,2:98\n717#4,2:100\n719#4,11:106\n72#5,4:102\n*S KotlinDebug\n*F\n+ 1 CurrencyRupee.kt\nandroidx/compose/material/icons/rounded/CurrencyRupeeKt\n*L\n29#1:67,12\n30#1:80,18\n30#1:117\n29#1:79\n30#1:98,2\n30#1:100,2\n30#1:106,11\n30#1:102,4\n*E\n"})
/* loaded from: classes.dex */
public final class CurrencyRupeeKt {
    private static ImageVector _currencyRupee;

    public static final ImageVector getCurrencyRupee(Icons.Rounded rounded) {
        ImageVector imageVector = _currencyRupee;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CurrencyRupee", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(10.5f, 14.0f);
        pathBuilder.horizontalLineTo(9.77f);
        pathBuilder.lineToRelative(5.1f, 5.31f);
        pathBuilder.curveToRelative(0.61f, 0.64f, 0.16f, 1.69f, -0.72f, 1.69f);
        pathBuilder.curveToRelative(-0.27f, 0.0f, -0.53f, -0.11f, -0.72f, -0.31f);
        pathBuilder.lineTo(7.4f, 14.41f);
        pathBuilder.curveTo(7.14f, 14.15f, 7.0f, 13.79f, 7.0f, 13.43f);
        pathBuilder.curveTo(7.0f, 12.64f, 7.64f, 12.0f, 8.43f, 12.0f);
        pathBuilder.horizontalLineToRelative(2.07f);
        pathBuilder.curveToRelative(1.76f, 0.0f, 3.22f, -1.3f, 3.46f, -3.0f);
        pathBuilder.lineTo(7.0f, 9.0f);
        pathBuilder.curveTo(6.45f, 9.0f, 6.0f, 8.55f, 6.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.lineToRelative(6.66f, 0.0f);
        pathBuilder.curveTo(13.1f, 5.82f, 11.9f, 5.0f, 10.5f, 5.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.curveTo(6.45f, 5.0f, 6.0f, 4.55f, 6.0f, 4.0f);
        pathBuilder.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineToRelative(-2.26f, 0.0f);
        pathBuilder.curveToRelative(0.48f, 0.58f, 0.84f, 1.26f, 1.05f, 2.0f);
        pathBuilder.lineTo(17.0f, 7.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.lineToRelative(-1.02f, 0.0f);
        pathBuilder.curveTo(15.72f, 11.8f, 13.36f, 14.0f, 10.5f, 14.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _currencyRupee = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
