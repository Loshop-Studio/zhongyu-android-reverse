package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.DrawModifierKt;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.drawscope.AbstractC1312b;
import androidx.compose.p006ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p006ui.layout.LayoutIdKt;
import androidx.compose.p006ui.layout.LayoutKt;
import androidx.compose.p006ui.layout.MeasurePolicy;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.node.ComposeUiNode;
import androidx.compose.p006ui.platform.CompositionLocalsKt;
import androidx.compose.p006ui.platform.ViewConfiguration;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.Density;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.compose.p006ui.unit.LayoutDirection;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.commonsdk.statistics.UMErrorCode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u009e\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010-\u001a\u009e\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020.2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\n0\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001b\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0015\b\u0002\u0010\u001c\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,H\u0007¢\u0006\u0002\u0010/\u001aÂ\u0001\u00100\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0019\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e¢\u0006\u0002\b\u00182\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0013\u00103\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010$\u001a\u00020\u00122\u0006\u00104\u001a\u0002052\u0011\u00106\u001a\r\u0012\u0004\u0012\u00020\n0\u0017¢\u0006\u0002\b\u00182\u0013\u00107\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\u0010:\u001ae\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020\u00122\u0006\u0010>\u001a\u00020&2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020&2\u0006\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u0002052\u0006\u00108\u001a\u000209H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001aE\u0010H\u001a\u00020&2\u0006\u0010I\u001a\u00020&2\u0006\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020&2\u0006\u0010L\u001a\u00020&2\u0006\u0010M\u001a\u00020&2\u0006\u0010C\u001a\u00020DH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a\u0014\u0010P\u001a\u00020\u0010*\u00020\u00102\u0006\u0010Q\u001a\u00020RH\u0000\u001a\u0086\u0001\u0010S\u001a\u00020\n*\u00020T2\u0006\u0010U\u001a\u00020&2\u0006\u0010V\u001a\u00020&2\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010]\u001a\u00020X2\b\u0010^\u001a\u0004\u0018\u00010X2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010_\u001a\u00020&2\u0006\u0010`\u001a\u00020&2\u0006\u00104\u001a\u0002052\u0006\u0010E\u001a\u000205H\u0002\u001al\u0010a\u001a\u00020\n*\u00020T2\u0006\u0010U\u001a\u00020&2\u0006\u0010V\u001a\u00020&2\u0006\u0010b\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010]\u001a\u00020X2\b\u0010^\u001a\u0004\u0018\u00010X2\u0006\u0010$\u001a\u00020\u00122\u0006\u0010E\u001a\u0002052\u0006\u00108\u001a\u000209H\u0002\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\"\u0019\u0010\u0005\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0006\u0010\u0003\"\u0019\u0010\u0007\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\b\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006c"}, m5175d2 = {"FirstBaselineOffset", "Landroidx/compose/ui/unit/Dp;", "getFirstBaselineOffset", "()F", "F", "TextFieldBottomPadding", "getTextFieldBottomPadding", "TextFieldTopPadding", "getTextFieldTopPadding", TextFieldImplKt.TextFieldId, "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "TextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "textFieldHeight", "hasLabel", "labelBaseline", "leadingHeight", "trailingHeight", "placeholderHeight", "supportingHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-jCXOeKk", "(IZIIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingWidth", "trailingWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "calculateWidth-VsPV1Ek", "(IIIIIJ)I", "drawIndicatorLine", "indicatorBorder", "Landroidx/compose/foundation/BorderStroke;", "placeWithLabel", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "textfieldPlaceable", "Landroidx/compose/ui/layout/Placeable;", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithoutLabel", "textPlaceable", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = C1700Dp.m11525constructorimpl(20);
    private static final float TextFieldBottomPadding = C1700Dp.m11525constructorimpl(10);
    private static final float TextFieldTopPadding = C1700Dp.m11525constructorimpl(4);

    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(final java.lang.String r86, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r87, androidx.compose.p006ui.Modifier r88, boolean r89, boolean r90, androidx.compose.p006ui.text.TextStyle r91, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r92, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r93, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r94, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r95, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r96, boolean r97, androidx.compose.p006ui.text.input.VisualTransformation r98, androidx.compose.foundation.text.KeyboardOptions r99, androidx.compose.foundation.text.KeyboardActions r100, boolean r101, int r102, androidx.compose.foundation.interaction.MutableInteractionSource r103, androidx.compose.p006ui.graphics.Shape r104, androidx.compose.material3.TextFieldColors r105, androidx.compose.runtime.Composer r106, final int r107, final int r108, final int r109) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> textField, final Function2<? super Composer, ? super Integer, Unit> function2, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z3, final float f4, final Function2<? super Composer, ? super Integer, Unit> container, final Function2<? super Composer, ? super Integer, Unit> function24, final PaddingValues paddingValues, Composer composer, final int i4, final int i5) {
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(1259241976);
        if ((i4 & 14) == 0) {
            i6 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i6 |= composerStartRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i6 |= composerStartRestartGroup.changed(function2) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i6 |= composerStartRestartGroup.changed(function3) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((29360128 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((234881024 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(container) ? 67108864 : 33554432;
        }
        if ((1879048192 & i4) == 0) {
            i6 |= composerStartRestartGroup.changed(function24) ? 536870912 : 268435456;
        }
        if ((i5 & 14) == 0) {
            i7 = i5 | (composerStartRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i6 & 1533916891) == 306783378 && (i7 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1259241976, i6, i7, "androidx.compose.material3.TextFieldLayout (TextField.kt:371)");
            }
            Boolean boolValueOf = Boolean.valueOf(z3);
            Float fValueOf = Float.valueOf(f4);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zChanged = composerStartRestartGroup.changed(boolValueOf) | composerStartRestartGroup.changed(fValueOf) | composerStartRestartGroup.changed(paddingValues);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z3, f4, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int i8 = (i6 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            int i9 = ((i8 << 9) & 7168) | 6;
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM8824constructorimpl = Updater.m8824constructorimpl(composerStartRestartGroup);
            Updater.m8831setimpl(composerM8824constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i9 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(1036839073);
            if (((i9 >> 9) & 14 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                container.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 24) & 14));
                composerStartRestartGroup.startReplaceableGroup(-95277174);
                if (function22 != null) {
                    Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                    Alignment center = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor2 = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierThen);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM8824constructorimpl2 = Updater.m8824constructorimpl(composerStartRestartGroup);
                    Updater.m8831setimpl(composerM8824constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m8831setimpl(composerM8824constructorimpl2, density2, companion.getSetDensity());
                    Updater.m8831setimpl(composerM8824constructorimpl2, layoutDirection3, companion.getSetLayoutDirection());
                    Updater.m8831setimpl(composerM8824constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf2.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(1990589600);
                    function22.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 12) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-95276839);
                if (function23 != null) {
                    Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor3 = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierThen2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor3);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM8824constructorimpl3 = Updater.m8824constructorimpl(composerStartRestartGroup);
                    Updater.m8831setimpl(composerM8824constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                    Updater.m8831setimpl(composerM8824constructorimpl3, density3, companion.getSetDensity());
                    Updater.m8831setimpl(composerM8824constructorimpl3, layoutDirection4, companion.getSetLayoutDirection());
                    Updater.m8831setimpl(composerM8824constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf3.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-305264439);
                    function23.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 15) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
                float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                if (function22 != null) {
                    fCalculateStartPadding = C1700Dp.m11525constructorimpl(RangesKt___RangesKt.coerceAtLeast(C1700Dp.m11525constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C1700Dp.m11525constructorimpl(0)));
                }
                float f5 = fCalculateStartPadding;
                if (function23 != null) {
                    fCalculateEndPadding = C1700Dp.m11525constructorimpl(RangesKt___RangesKt.coerceAtLeast(C1700Dp.m11525constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C1700Dp.m11525constructorimpl(0)));
                }
                Modifier modifierM7320paddingqDBjuR0$default = PaddingKt.m7320paddingqDBjuR0$default(companion2, f5, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(-95275778);
                if (function3 != null) {
                    function3.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM7320paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i6 >> 6) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-95275578);
                if (function2 != null) {
                    Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LabelId).then(modifierM7320paddingqDBjuR0$default);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection5 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor4 = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierThen3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM8824constructorimpl4 = Updater.m8824constructorimpl(composerStartRestartGroup);
                    Updater.m8831setimpl(composerM8824constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
                    Updater.m8831setimpl(composerM8824constructorimpl4, density4, companion.getSetDensity());
                    Updater.m8831setimpl(composerM8824constructorimpl4, layoutDirection5, companion.getSetLayoutDirection());
                    Updater.m8831setimpl(composerM8824constructorimpl4, viewConfiguration4, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf4.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-2137368960);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(-2011394041);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 6) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen4 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM7320paddingqDBjuR0$default);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierThen4);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM8824constructorimpl5 = Updater.m8824constructorimpl(composerStartRestartGroup);
                Updater.m8831setimpl(composerM8824constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m8831setimpl(composerM8824constructorimpl5, density5, companion.getSetDensity());
                Updater.m8831setimpl(composerM8824constructorimpl5, layoutDirection6, companion.getSetLayoutDirection());
                Updater.m8831setimpl(composerM8824constructorimpl5, viewConfiguration5, companion.getSetViewConfiguration());
                composerStartRestartGroup.enableReusing();
                function3MaterializerOf5.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                composerStartRestartGroup.startReplaceableGroup(-2137368960);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(-369728037);
                textField.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 3) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                if (function24 != null) {
                    Modifier modifierPadding = PaddingKt.padding(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldDefaults.m8185supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection7 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration6 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor6 = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf6 = LayoutKt.materializerOf(modifierPadding);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor6);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerStartRestartGroup.disableReusing();
                    Composer composerM8824constructorimpl6 = Updater.m8824constructorimpl(composerStartRestartGroup);
                    Updater.m8831setimpl(composerM8824constructorimpl6, measurePolicyRememberBoxMeasurePolicy5, companion.getSetMeasurePolicy());
                    Updater.m8831setimpl(composerM8824constructorimpl6, density6, companion.getSetDensity());
                    Updater.m8831setimpl(composerM8824constructorimpl6, layoutDirection7, companion.getSetLayoutDirection());
                    Updater.m8831setimpl(composerM8824constructorimpl6, viewConfiguration6, companion.getSetViewConfiguration());
                    composerStartRestartGroup.enableReusing();
                    function3MaterializerOf6.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(2058660585);
                    composerStartRestartGroup.startReplaceableGroup(-2137368960);
                    composerStartRestartGroup.startReplaceableGroup(-716975194);
                    function24.invoke(composerStartRestartGroup, Integer.valueOf((i6 >> 27) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldKt.TextFieldLayout.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i10) {
                TextFieldKt.TextFieldLayout(modifier, textField, function2, function3, function22, function23, z3, f4, container, function24, paddingValues, composer2, i4 | 1, i5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-jCXOeKk, reason: not valid java name */
    public static final int m8209calculateHeightjCXOeKk(int i4, boolean z3, int i5, int i6, int i7, int i8, int i9, long j4, float f4, PaddingValues paddingValues) {
        float f5 = TextFieldTopPadding * f4;
        float top = paddingValues.getTop() * f4;
        float bottom = paddingValues.getBottom() * f4;
        int iMax = Math.max(i4, i8);
        return Math.max(Constraints.m11494getMinHeightimpl(j4), Math.max(i6, Math.max(i7, MathKt__MathJVMKt.roundToInt(z3 ? i5 + f5 + iMax + bottom : top + iMax + bottom))) + i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m8210calculateWidthVsPV1Ek(int i4, int i5, int i6, int i7, int i8, long j4) {
        return Math.max(i4 + Math.max(i6, Math.max(i7, i8)) + i5, Constraints.m11495getMinWidthimpl(j4));
    }

    public static final Modifier drawIndicatorLine(Modifier modifier, final BorderStroke indicatorBorder) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(indicatorBorder, "indicatorBorder");
        final float width = indicatorBorder.getWidth();
        return DrawModifierKt.drawWithContent(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.TextFieldKt.drawIndicatorLine.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope drawWithContent) {
                Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
                drawWithContent.drawContent();
                if (C1700Dp.m11530equalsimpl0(width, C1700Dp.INSTANCE.m11543getHairlineD9Ej5fM())) {
                    return;
                }
                float density = width * drawWithContent.getDensity();
                float fM9011getHeightimpl = Size.m9011getHeightimpl(drawWithContent.mo9614getSizeNHjbRc()) - (density / 2);
                AbstractC1312b.m427B(drawWithContent, indicatorBorder.getBrush(), OffsetKt.Offset(0.0f, fM9011getHeightimpl), OffsetKt.Offset(Size.m9014getWidthimpl(drawWithContent.mo9614getSizeNHjbRc()), fM9011getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i4, int i5, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, boolean z3, int i6, int i7, float f4, float f5) {
        Placeable.PlacementScope.m10620place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m11653getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i5 - TextFieldImplKt.heightOrZero(placeable7);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i4 - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), (z3 ? Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero) : MathKt__MathJVMKt.roundToInt(TextFieldImplKt.getTextFieldPadding() * f5)) - MathKt__MathJVMKt.roundToInt((r1 - i6) * f4), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i7, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i7, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i4, int i5, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, boolean z3, float f4, PaddingValues paddingValues) {
        Placeable.PlacementScope.m10620place70tqf50$default(placementScope, placeable5, IntOffset.INSTANCE.m11653getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i5 - TextFieldImplKt.heightOrZero(placeable6);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(paddingValues.getTop() * f4);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i4 - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z3 ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero) : iRoundToInt, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z3) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), iRoundToInt, 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][_][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(final androidx.compose.p006ui.text.input.TextFieldValue r86, final kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.text.input.TextFieldValue, kotlin.Unit> r87, androidx.compose.p006ui.Modifier r88, boolean r89, boolean r90, androidx.compose.p006ui.text.TextStyle r91, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r92, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r93, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r94, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r95, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r96, boolean r97, androidx.compose.p006ui.text.input.VisualTransformation r98, androidx.compose.foundation.text.KeyboardOptions r99, androidx.compose.foundation.text.KeyboardActions r100, boolean r101, int r102, androidx.compose.foundation.interaction.MutableInteractionSource r103, androidx.compose.p006ui.graphics.Shape r104, androidx.compose.material3.TextFieldColors r105, androidx.compose.runtime.Composer r106, final int r107, final int r108, final int r109) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
