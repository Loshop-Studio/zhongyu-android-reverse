package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p006ui.Alignment;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.DrawModifierKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.graphics.ClipOp;
import androidx.compose.p006ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawContext;
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

@Metadata(m5174d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u001a\u009e\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*\u001a\u009e\u0002\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020+2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00070\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010,\u001aÙ\u0001\u0010-\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u00152\u0019\u0010\u0016\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0002\b\u00152\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0006\u0010!\u001a\u00020\u000f2\u0006\u00101\u001a\u0002022\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u00070\u000b2\u0011\u00105\u001a\r\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u00152\u0013\u00106\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00152\u0006\u00107\u001a\u000208H\u0001ø\u0001\u0000¢\u0006\u0002\u00109\u001a]\u0010:\u001a\u00020#2\u0006\u0010;\u001a\u00020#2\u0006\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020#2\u0006\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u0002022\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a]\u0010F\u001a\u00020#2\u0006\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020#2\u0006\u0010I\u001a\u00020#2\u0006\u0010J\u001a\u00020#2\u0006\u0010K\u001a\u00020#2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u0002022\u0006\u00107\u001a\u000208H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a)\u0010O\u001a\u00020\r*\u00020\r2\u0006\u0010P\u001a\u0002042\u0006\u00107\u001a\u000208H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a\u0086\u0001\u0010S\u001a\u00020\u0007*\u00020T2\u0006\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u00020#2\b\u0010W\u001a\u0004\u0018\u00010X2\b\u0010Y\u001a\u0004\u0018\u00010X2\u0006\u0010Z\u001a\u00020X2\b\u0010[\u001a\u0004\u0018\u00010X2\b\u0010\\\u001a\u0004\u0018\u00010X2\u0006\u0010]\u001a\u00020X2\b\u0010^\u001a\u0004\u0018\u00010X2\u0006\u00101\u001a\u0002022\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010C\u001a\u0002022\u0006\u0010_\u001a\u00020`2\u0006\u00107\u001a\u000208H\u0002\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0019\u0010\u0003\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0002\u001a\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006a"}, m5175d2 = {"OutlinedTextFieldInnerPadding", "Landroidx/compose/ui/unit/Dp;", "F", "OutlinedTextFieldTopPadding", "getOutlinedTextFieldTopPadding", "()F", "OutlinedTextField", "", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "label", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "placeholder", "leadingIcon", "trailingIcon", "supportingText", "isError", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/TextFieldColors;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;III)V", "OutlinedTextFieldLayout", "textField", "leading", "trailing", "animationProgress", "", "onLabelMeasured", "Landroidx/compose/ui/geometry/Size;", "container", "supporting", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", "calculateHeight", "leadingPlaceableHeight", "trailingPlaceableHeight", "textFieldPlaceableHeight", "labelPlaceableHeight", "placeholderPlaceableHeight", "supportingPlaceableHeight", "constraints", "Landroidx/compose/ui/unit/Constraints;", "density", "calculateHeight-O3s9Psw", "(IIIIIIJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingPlaceableWidth", "trailingPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "isLabelInMiddleSection", "calculateWidth-O3s9Psw", "(IIIIIZJFLandroidx/compose/foundation/layout/PaddingValues;)I", "outlineCutout", "labelSize", "outlineCutout-12SF9DM", "(Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "place", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "leadingPlaceable", "Landroidx/compose/ui/layout/Placeable;", "trailingPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "material3_release"}, m5176k = 2, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = C1700Dp.m11525constructorimpl(4);
    private static final float OutlinedTextFieldTopPadding = C1700Dp.m11525constructorimpl(8);

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
    /* JADX WARN: Removed duplicated region for block: B:316:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05b5  */
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
    public static final void OutlinedTextField(final java.lang.String r86, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r87, androidx.compose.p006ui.Modifier r88, boolean r89, boolean r90, androidx.compose.p006ui.text.TextStyle r91, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r92, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r93, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r94, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r95, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r96, boolean r97, androidx.compose.p006ui.text.input.VisualTransformation r98, androidx.compose.foundation.text.KeyboardOptions r99, androidx.compose.foundation.text.KeyboardActions r100, boolean r101, int r102, androidx.compose.foundation.interaction.MutableInteractionSource r103, androidx.compose.p006ui.graphics.Shape r104, androidx.compose.material3.TextFieldColors r105, androidx.compose.runtime.Composer r106, final int r107, final int r108, final int r109) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> textField, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final Function2<? super Composer, ? super Integer, Unit> function23, final boolean z3, final float f4, final Function1<? super Size, Unit> onLabelMeasured, final Function2<? super Composer, ? super Integer, Unit> container, final Function2<? super Composer, ? super Integer, Unit> function24, final PaddingValues paddingValues, Composer composer, final int i4, final int i5) {
        int i6;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(textField, "textField");
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        Composer composerStartRestartGroup = composer.startRestartGroup(-222199799);
        int i7 = (i4 & 14) == 0 ? (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i4 : i4;
        if ((i4 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i7 |= composerStartRestartGroup.changed(textField) ? 32 : 16;
        }
        if ((i4 & 896) == 0) {
            i7 |= composerStartRestartGroup.changed(function3) ? 256 : 128;
        }
        if ((i4 & 7168) == 0) {
            i7 |= composerStartRestartGroup.changed(function2) ? 2048 : 1024;
        }
        if ((57344 & i4) == 0) {
            i7 |= composerStartRestartGroup.changed(function22) ? 16384 : 8192;
        }
        if ((458752 & i4) == 0) {
            i7 |= composerStartRestartGroup.changed(function23) ? 131072 : 65536;
        }
        if ((3670016 & i4) == 0) {
            i7 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        }
        if ((29360128 & i4) == 0) {
            i7 |= composerStartRestartGroup.changed(f4) ? 8388608 : 4194304;
        }
        if ((234881024 & i4) == 0) {
            i7 |= composerStartRestartGroup.changed(onLabelMeasured) ? 67108864 : 33554432;
        }
        if ((1879048192 & i4) == 0) {
            i7 |= composerStartRestartGroup.changed(container) ? 536870912 : 268435456;
        }
        int i8 = (i5 & 14) == 0 ? i5 | (composerStartRestartGroup.changed(function24) ? 4 : 2) : i5;
        if ((i5 & UMErrorCode.E_UM_BE_DEFLATE_FAILED) == 0) {
            i8 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i7 & 1533916891) == 306783378 && (i8 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-222199799, i7, i8, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:377)");
            }
            Object[] objArr = {onLabelMeasured, Boolean.valueOf(z3), Float.valueOf(f4), paddingValues};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i9 = i8;
            int i10 = 0;
            boolean zChanged = false;
            for (int i11 = 4; i10 < i11; i11 = 4) {
                zChanged |= composerStartRestartGroup.changed(objArr[i10]);
                i10++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(onLabelMeasured, z3, f4, paddingValues);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int i12 = (i7 << 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED;
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifier);
            int i13 = ((i12 << 9) & 7168) | 6;
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
            Updater.m8831setimpl(composerM8824constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m8831setimpl(composerM8824constructorimpl, density, companion.getSetDensity());
            Updater.m8831setimpl(composerM8824constructorimpl, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m8831setimpl(composerM8824constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            composerStartRestartGroup.enableReusing();
            function3MaterializerOf.invoke(SkippableUpdater.m8815boximpl(SkippableUpdater.m8816constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((i13 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(-147819150);
            if (((i13 >> 9) & 14 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
            } else {
                container.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 27) & 14));
                composerStartRestartGroup.startReplaceableGroup(1116449790);
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
                    composerStartRestartGroup.startReplaceableGroup(2127001777);
                    function22.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 12) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1116450075);
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
                    composerStartRestartGroup.startReplaceableGroup(-827051110);
                    function23.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 15) & 14));
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
                    i6 = 0;
                    fCalculateStartPadding = C1700Dp.m11525constructorimpl(RangesKt___RangesKt.coerceAtLeast(C1700Dp.m11525constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), C1700Dp.m11525constructorimpl(0)));
                } else {
                    i6 = 0;
                }
                float f5 = fCalculateStartPadding;
                if (function23 != null) {
                    fCalculateEndPadding = C1700Dp.m11525constructorimpl(RangesKt___RangesKt.coerceAtLeast(C1700Dp.m11525constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), C1700Dp.m11525constructorimpl(i6)));
                }
                Modifier modifierM7320paddingqDBjuR0$default = PaddingKt.m7320paddingqDBjuR0$default(companion2, f5, 0.0f, fCalculateEndPadding, 0.0f, 10, null);
                composerStartRestartGroup.startReplaceableGroup(1116451086);
                if (function3 != null) {
                    function3.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM7320paddingqDBjuR0$default), composerStartRestartGroup, Integer.valueOf((i7 >> 3) & UMErrorCode.E_UM_BE_DEFLATE_FAILED));
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM7320paddingqDBjuR0$default);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Alignment.Companion companion3 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), true, composerStartRestartGroup, 48);
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
                composerStartRestartGroup.startReplaceableGroup(-475693524);
                textField.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 3) & 14));
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(1116451412);
                if (function2 != null) {
                    Modifier modifierLayoutId = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LabelId);
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    LayoutDirection layoutDirection6 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                    ViewConfiguration viewConfiguration5 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                    Function0<ComposeUiNode> constructor5 = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf5 = LayoutKt.materializerOf(modifierLayoutId);
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
                    composerStartRestartGroup.startReplaceableGroup(-1527117480);
                    function2.invoke(composerStartRestartGroup, Integer.valueOf((i7 >> 9) & 14));
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.endReplaceableGroup();
                }
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
                    composerStartRestartGroup.startReplaceableGroup(270332983);
                    function24.invoke(composerStartRestartGroup, Integer.valueOf(i9 & 14));
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
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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

            public final void invoke(Composer composer2, int i14) {
                OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, textField, function3, function2, function22, function23, z3, f4, onLabelMeasured, container, function24, paddingValues, composer2, i4 | 1, i5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m8079calculateHeightO3s9Psw(int i4, int i5, int i6, int i7, int i8, int i9, long j4, float f4, PaddingValues paddingValues) {
        return Math.max(Constraints.m11494getMinHeightimpl(j4), Math.max(i4, Math.max(i5, MathKt__MathJVMKt.roundToInt(Math.max(i6, i8) + (paddingValues.getBottom() * f4) + Math.max(paddingValues.getTop() * f4, i7 / 2.0f)))) + i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m8080calculateWidthO3s9Psw(int i4, int i5, int i6, int i7, int i8, boolean z3, long j4, float f4, PaddingValues paddingValues) {
        int iRoundToInt = 0;
        int iMax = i4 + Math.max(i6, Math.max(z3 ? i7 : 0, i8)) + i5;
        if (!z3) {
            LayoutDirection layoutDirection = LayoutDirection.Ltr;
            iRoundToInt = i7 + MathKt__MathJVMKt.roundToInt(C1700Dp.m11525constructorimpl(paddingValues.mo7297calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo7298calculateRightPaddingu2uoSUM(layoutDirection)) * f4);
        }
        return Math.max(iMax, Math.max(iRoundToInt, Constraints.m11495getMinWidthimpl(j4)));
    }

    public static final float getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m8081outlineCutout12SF9DM(Modifier outlineCutout, final long j4, final PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(outlineCutout, "$this$outlineCutout");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        return DrawModifierKt.drawWithContent(outlineCutout, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1

            @Metadata(m5176k = 3, m5177mv = {1, 7, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                float fM9014getWidthimpl = Size.m9014getWidthimpl(j4);
                if (fM9014getWidthimpl <= 0.0f) {
                    drawWithContent.drawContent();
                    return;
                }
                float fMo7206toPx0680j_4 = drawWithContent.mo7206toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                float fMo7206toPx0680j_42 = drawWithContent.mo7206toPx0680j_4(paddingValues.mo7297calculateLeftPaddingu2uoSUM(drawWithContent.getLayoutDirection())) - fMo7206toPx0680j_4;
                float f4 = 2;
                float fM9014getWidthimpl2 = fM9014getWidthimpl + fMo7206toPx0680j_42 + (fMo7206toPx0680j_4 * f4);
                LayoutDirection layoutDirection = drawWithContent.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float fM9014getWidthimpl3 = iArr[layoutDirection.ordinal()] == 1 ? Size.m9014getWidthimpl(drawWithContent.mo9614getSizeNHjbRc()) - fM9014getWidthimpl2 : RangesKt___RangesKt.coerceAtLeast(fMo7206toPx0680j_42, 0.0f);
                if (iArr[drawWithContent.getLayoutDirection().ordinal()] == 1) {
                    fM9014getWidthimpl2 = Size.m9014getWidthimpl(drawWithContent.mo9614getSizeNHjbRc()) - RangesKt___RangesKt.coerceAtLeast(fMo7206toPx0680j_42, 0.0f);
                }
                float f5 = fM9014getWidthimpl2;
                float fM9011getHeightimpl = Size.m9011getHeightimpl(j4);
                float f6 = (-fM9011getHeightimpl) / f4;
                float f7 = fM9011getHeightimpl / f4;
                int iM9166getDifferencertfAjoo = ClipOp.INSTANCE.m9166getDifferencertfAjoo();
                DrawContext drawContext = drawWithContent.getDrawContext();
                long jMo9620getSizeNHjbRc = drawContext.mo9620getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo9623clipRectN_I0leg(fM9014getWidthimpl3, f6, f5, f7, iM9166getDifferencertfAjoo);
                drawWithContent.drawContent();
                drawContext.getCanvas().restore();
                drawContext.mo9621setSizeuvyYCjk(jMo9620getSizeNHjbRc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i4, int i5, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, float f4, boolean z3, float f5, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable.PlacementScope.m10620place70tqf50$default(placementScope, placeable6, IntOffset.INSTANCE.m11653getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i4 - TextFieldImplKt.heightOrZero(placeable7);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(paddingValues.getTop() * f5);
        int iRoundToInt2 = MathKt__MathJVMKt.roundToInt(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f5);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f5;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i5 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            float f6 = 1 - f4;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, MathKt__MathJVMKt.roundToInt(placeable == null ? 0.0f : f6 * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + iRoundToInt2, MathKt__MathJVMKt.roundToInt(((z3 ? Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero) : iRoundToInt) * f6) - ((placeable4.getHeight() / 2) * f4)), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z3 ? Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero) : iRoundToInt, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z3) {
                iRoundToInt = Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), iRoundToInt, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, 0, iHeightOrZero, 0.0f, 4, null);
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
    /* JADX WARN: Removed duplicated region for block: B:316:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05b5  */
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
    public static final void OutlinedTextField(final androidx.compose.p006ui.text.input.TextFieldValue r86, final kotlin.jvm.functions.Function1<? super androidx.compose.p006ui.text.input.TextFieldValue, kotlin.Unit> r87, androidx.compose.p006ui.Modifier r88, boolean r89, boolean r90, androidx.compose.p006ui.text.TextStyle r91, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r92, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r93, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r94, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r95, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r96, boolean r97, androidx.compose.p006ui.text.input.VisualTransformation r98, androidx.compose.foundation.text.KeyboardOptions r99, androidx.compose.foundation.text.KeyboardActions r100, boolean r101, int r102, androidx.compose.foundation.interaction.MutableInteractionSource r103, androidx.compose.p006ui.graphics.Shape r104, androidx.compose.material3.TextFieldColors r105, androidx.compose.runtime.Composer r106, final int r107, final int r108, final int r109) {
        /*
            Method dump skipped, instructions count: 1489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
