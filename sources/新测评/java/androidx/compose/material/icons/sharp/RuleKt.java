package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.StrokeCap;
import androidx.compose.p013ui.graphics.StrokeJoin;
import androidx.compose.p013ui.graphics.vector.ImageVector;
import androidx.compose.p013ui.graphics.vector.PathBuilder;
import androidx.compose.p013ui.graphics.vector.VectorKt;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u001e\u0010\u0002\u001a\u00020\u0001*\u00020\u00038FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"_rule", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Rule", "Landroidx/compose/material/icons/Icons$Sharp;", "getRule$annotations", "(Landroidx/compose/material/icons/Icons$Sharp;)V", "getRule", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-extended_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Rule.kt\nandroidx/compose/material/icons/sharp/RuleKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,77:1\n212#2,12:78\n233#2,18:91\n253#2:128\n174#3:90\n705#4,2:109\n717#4,2:111\n719#4,11:117\n72#5,4:113\n*S KotlinDebug\n*F\n+ 1 Rule.kt\nandroidx/compose/material/icons/sharp/RuleKt\n*L\n35#1:78,12\n36#1:91,18\n36#1:128\n35#1:90\n36#1:109,2\n36#1:111,2\n36#1:117,11\n36#1:113,4\n*E\n"})
/* loaded from: classes.dex */
public final class RuleKt {
    private static ImageVector _rule;

    public static final ImageVector getRule(Icons.Sharp sharp) {
        ImageVector imageVector = _rule;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Rule", C3127Dp.m23561constructorimpl(24.0f), C3127Dp.m23561constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m21002getBlack0d7_KjU(), null);
        int iM21329getButtKaPHkGw = StrokeCap.INSTANCE.m21329getButtKaPHkGw();
        int iM21339getBevelLxFBmk8 = StrokeJoin.INSTANCE.m21339getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.54f, 11.0f);
        pathBuilder.lineTo(13.0f, 7.46f);
        pathBuilder.lineToRelative(1.41f, -1.41f);
        pathBuilder.lineToRelative(2.12f, 2.12f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.lineToRelative(1.41f, 1.41f);
        pathBuilder.lineTo(16.54f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 7.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 13.41f);
        pathBuilder.lineTo(19.59f, 12.0f);
        pathBuilder.lineTo(17.0f, 14.59f);
        pathBuilder.lineTo(14.41f, 12.0f);
        pathBuilder.lineTo(13.0f, 13.41f);
        pathBuilder.lineTo(15.59f, 16.0f);
        pathBuilder.lineTo(13.0f, 18.59f);
        pathBuilder.lineTo(14.41f, 20.0f);
        pathBuilder.lineTo(17.0f, 17.41f);
        pathBuilder.lineTo(19.59f, 20.0f);
        pathBuilder.lineTo(21.0f, 18.59f);
        pathBuilder.lineTo(18.41f, 16.0f);
        pathBuilder.lineTo(21.0f, 13.41f);
        pathBuilder.close();
        pathBuilder.moveTo(11.0f, 15.0f);
        pathBuilder.horizontalLineTo(2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(9.0f);
        pathBuilder.verticalLineTo(15.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = ImageVector.Builder.m21661addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM21329getButtKaPHkGw, iM21339getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rule = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }

    @Deprecated(message = "Use the AutoMirrored version at Icons.AutoMirrored.Sharp.Rule", replaceWith = @ReplaceWith(expression = "Icons.AutoMirrored.Sharp.Rule", imports = {"androidx.compose.material.icons.automirrored.sharp.Rule"}))
    public static /* synthetic */ void getRule$annotations(Icons.Sharp sharp) {
    }
}
