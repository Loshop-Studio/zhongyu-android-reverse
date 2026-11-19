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

@Metadata(m13412d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13413d2 = {"_wbSunny", "Landroidx/compose/ui/graphics/vector/ImageVector;", "WbSunny", "Landroidx/compose/material/icons/Icons$Rounded;", "getWbSunny", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nWbSunny.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WbSunny.kt\nandroidx/compose/material/icons/rounded/WbSunnyKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,119:1\n212#2,12:120\n233#2,18:133\n253#2:170\n174#3:132\n705#4,2:151\n717#4,2:153\n719#4,11:159\n72#5,4:155\n*S KotlinDebug\n*F\n+ 1 WbSunny.kt\nandroidx/compose/material/icons/rounded/WbSunnyKt\n*L\n29#1:120,12\n30#1:133,18\n30#1:170\n29#1:132\n30#1:151,2\n30#1:153,2\n30#1:159,11\n30#1:155,4\n*E\n"})
/* loaded from: classes.dex */
public final class WbSunnyKt {
    private static ImageVector _wbSunny;

    public static final ImageVector getWbSunny(Icons.Rounded rounded) {
        ImageVector imageVector = _wbSunny;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WbSunny", C3115Dp.m23994constructorimpl(24.0f), C3115Dp.m23994constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21435getBlack0d7_KjU(), null);
        int iM21762getButtKaPHkGw = StrokeCap.INSTANCE.m21762getButtKaPHkGw();
        int iM21772getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21772getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(6.05f, 4.14f);
        pathBuilder.lineToRelative(-0.39f, -0.39f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.38f, -1.4f, 0.0f);
        pathBuilder.lineToRelative(-0.01f, 0.01f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.4f);
        pathBuilder.lineToRelative(0.39f, 0.39f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, 0.0f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.curveToRelative(0.39f, -0.38f, 0.39f, -1.02f, 0.0f, -1.4f);
        pathBuilder.close();
        pathBuilder.moveTo(3.01f, 10.5f);
        pathBuilder.lineTo(1.99f, 10.5f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.lineTo(3.0f, 12.49f);
        pathBuilder.curveToRelative(0.56f, 0.01f, 1.0f, -0.43f, 1.0f, -0.98f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -0.56f, -0.44f, -1.0f, -0.99f, -1.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.01f, 0.55f);
        pathBuilder.lineTo(12.0f, 0.55f);
        pathBuilder.curveToRelative(-0.56f, 0.0f, -1.0f, 0.44f, -1.0f, 0.99f);
        pathBuilder.verticalLineToRelative(0.96f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.lineTo(12.0f, 3.49f);
        pathBuilder.curveToRelative(0.56f, 0.01f, 1.0f, -0.43f, 1.0f, -0.98f);
        pathBuilder.verticalLineToRelative(-0.97f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(19.75f, 3.76f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, -0.01f);
        pathBuilder.lineToRelative(-0.39f, 0.39f);
        pathBuilder.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.4f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.4f, 0.0f);
        pathBuilder.lineToRelative(0.39f, -0.39f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.01f, 0.0f, -1.4f);
        pathBuilder.close();
        pathBuilder.moveTo(17.94f, 18.86f);
        pathBuilder.lineToRelative(0.39f, 0.39f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        pathBuilder.lineToRelative(-0.39f, -0.39f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.38f, -1.4f, 0.0f);
        pathBuilder.curveToRelative(-0.4f, 0.4f, -0.4f, 1.02f, -0.01f, 1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 11.49f);
        pathBuilder.verticalLineToRelative(0.01f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.lineTo(22.0f, 12.49f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f);
        pathBuilder.verticalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f);
        pathBuilder.horizontalLineToRelative(-1.01f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 5.5f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, 6.0f, 6.0f, 6.0f);
        pathBuilder.reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(-2.69f, -6.0f, -6.0f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.99f, 22.45f);
        pathBuilder.lineTo(12.0f, 22.45f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 0.99f, -0.44f, 0.99f, -0.99f);
        pathBuilder.verticalLineToRelative(-0.96f);
        pathBuilder.curveToRelative(0.0f, -0.55f, -0.44f, -0.99f, -0.99f, -0.99f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(-0.55f, 0.0f, -0.99f, 0.44f, -0.99f, 0.99f);
        pathBuilder.verticalLineToRelative(0.96f);
        pathBuilder.curveToRelative(0.0f, 0.55f, 0.44f, 0.99f, 0.99f, 0.99f);
        pathBuilder.close();
        pathBuilder.moveTo(4.25f, 19.24f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(0.39f, -0.39f);
        pathBuilder.curveToRelative(0.39f, -0.39f, 0.38f, -1.02f, 0.0f, -1.4f);
        pathBuilder.lineToRelative(-0.01f, -0.01f);
        pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        pathBuilder.lineToRelative(-0.39f, 0.39f);
        pathBuilder.curveToRelative(-0.38f, 0.4f, -0.38f, 1.02f, 0.01f, 1.41f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m22094addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21762getButtKaPHkGw, iM21772getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wbSunny = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
