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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_taxiAlert", "Landroidx/compose/ui/graphics/vector/ImageVector;", "TaxiAlert", "Landroidx/compose/material/icons/Icons$Filled;", "getTaxiAlert", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTaxiAlert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaxiAlert.kt\nandroidx/compose/material/icons/filled/TaxiAlertKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,100:1\n212#2,12:101\n233#2,18:114\n253#2:151\n174#3:113\n705#4,2:132\n717#4,2:134\n719#4,11:140\n72#5,4:136\n*S KotlinDebug\n*F\n+ 1 TaxiAlert.kt\nandroidx/compose/material/icons/filled/TaxiAlertKt\n*L\n29#1:101,12\n30#1:114,18\n30#1:151\n29#1:113\n30#1:132,2\n30#1:134,2\n30#1:140,11\n30#1:136,4\n*E\n"})
/* loaded from: classes.dex */
public final class TaxiAlertKt {
    private static ImageVector _taxiAlert;

    public static final ImageVector getTaxiAlert(Icons.Filled filled) {
        ImageVector imageVector = _taxiAlert;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TaxiAlert", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(23.0f, 8.0f);
        pathBuilder.arcTo(7.0f, 7.0f, 0.0f, false, false, 9.68f, 5.0f);
        pathBuilder.lineTo(7.0f, 5.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(4.5f, 7.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.42f, 1.01f);
        pathBuilder.lineTo(1.0f, 14.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-1.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.verticalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f);
        pathBuilder.verticalLineToRelative(-7.68f);
        pathBuilder.arcTo(7.01f, 7.01f, 0.0f, false, false, 23.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 8.5f);
        pathBuilder.horizontalLineToRelative(4.53f);
        pathBuilder.arcToRelative(6.93f, 6.93f, 0.0f, false, false, 2.08f, 4.5f);
        pathBuilder.lineTo(3.0f, 13.0f);
        pathBuilder.lineToRelative(1.5f, -4.5f);
        pathBuilder.close();
        pathBuilder.moveTo(4.5f, 18.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.5f, 18.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f);
        pathBuilder.arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(18.43f, 12.37f);
        pathBuilder.lineToRelative(-0.21f, 0.11f);
        pathBuilder.lineToRelative(-0.18f, 0.09f);
        pathBuilder.arcToRelative(4.97f, 4.97f, 0.0f, false, true, -0.42f, 0.16f);
        pathBuilder.lineToRelative(-0.22f, 0.07f);
        pathBuilder.lineToRelative(-0.23f, 0.06f);
        pathBuilder.lineToRelative(-0.2f, 0.05f);
        pathBuilder.arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.94f, -4.41f);
        pathBuilder.arcTo(4.07f, 4.07f, 0.0f, false, true, 11.0f, 8.0f);
        pathBuilder.lineToRelative(0.02f, -0.47f);
        pathBuilder.lineToRelative(0.02f, -0.17f);
        pathBuilder.lineToRelative(0.04f, -0.28f);
        pathBuilder.lineToRelative(0.04f, -0.21f);
        pathBuilder.lineToRelative(0.05f, -0.21f);
        pathBuilder.lineToRelative(0.07f, -0.24f);
        pathBuilder.lineToRelative(0.05f, -0.13f);
        pathBuilder.arcToRelative(4.99f, 4.99f, 0.0f, false, true, 9.69f, 1.7f);
        pathBuilder.arcToRelative(4.96f, 4.96f, 0.0f, false, true, -2.55f, 4.38f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(5.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(15.0f, 10.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _taxiAlert = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
