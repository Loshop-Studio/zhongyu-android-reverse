package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.layout.LayoutIdKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.DpKt;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000¤\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÚ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aÚ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010)\u001aî\u0001\u00103\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0011\u0010/\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b3\u00104\u001a\u001b\u00106\u001a\u00020\u001d*\u00020\u001d2\u0006\u00105\u001a\u00020\u001dH\u0002¢\u0006\u0004\b6\u00107\u001aR\u0010C\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020?H\u0002ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001ar\u0010O\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001d2\u0006\u0010F\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-2\u0006\u0010@\u001a\u00020?2\u0006\u0010L\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\bM\u0010N\u001a¡\u0001\u0010_\u001a\u00020\u0003*\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020S2\b\u0010U\u001a\u0004\u0018\u00010S2\b\u0010V\u001a\u0004\u0018\u00010S2\b\u0010W\u001a\u0004\u0018\u00010S2\b\u0010X\u001a\u0004\u0018\u00010S2\b\u0010Y\u001a\u0004\u0018\u00010S2\b\u0010Z\u001a\u0004\u0018\u00010S2\u0006\u0010[\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010S2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\u001d2\u0006\u0010^\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-2\u0006\u0010L\u001a\u00020-H\u0002¢\u0006\u0004\b_\u0010`\u001a\u0087\u0001\u0010b\u001a\u00020\u0003*\u00020P2\u0006\u0010Q\u001a\u00020\u001d2\u0006\u0010R\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020S2\b\u0010V\u001a\u0004\u0018\u00010S2\b\u0010W\u001a\u0004\u0018\u00010S2\b\u0010X\u001a\u0004\u0018\u00010S2\b\u0010Y\u001a\u0004\u0018\u00010S2\b\u0010Z\u001a\u0004\u0018\u00010S2\u0006\u0010[\u001a\u00020S2\b\u0010\\\u001a\u0004\u0018\u00010S2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010L\u001a\u00020-2\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\bb\u0010c\u001a!\u0010g\u001a\u00020\u0005*\u00020\u00052\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0dH\u0000¢\u0006\u0004\bg\u0010h\"\u001a\u0010j\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006n"}, m5110d2 = {"", "value", "Lkotlin/Function1;", "Ld6/s;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", RequestParameters.PREFIX, "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", TextFieldImplKt.TextFieldId, "(Ljava/lang/String;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "TextFieldLayout", "(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Lr6/f;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZFLr6/e;Lr6/e;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", TypedValues.TransitionType.S_FROM, "substractConstraintSafely", "(II)I", "leadingWidth", "trailingWidth", "prefixWidth", "suffixWidth", "textFieldWidth", "labelWidth", "placeholderWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "calculateWidth-yeHjK3Y", "(IIIIIIIJ)I", "calculateWidth", "textFieldHeight", "labelHeight", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "placeholderHeight", "supportingHeight", "density", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "width", "totalHeight", "Landroidx/compose/ui/layout/Placeable;", "textfieldPlaceable", "labelPlaceable", "placeholderPlaceable", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "containerPlaceable", "supportingPlaceable", "labelEndPosition", "textPosition", "placeWithLabel", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZIIFF)V", "textPlaceable", "placeWithoutLabel", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/BorderStroke;", "indicatorBorder", "drawIndicatorLine", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/State;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "TextFieldWithLabelVerticalPadding", "F", "getTextFieldWithLabelVerticalPadding", "()F", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1140:1\n77#2:1141\n77#2:1150\n77#2:1165\n1223#3,6:1142\n1223#3,6:1151\n1223#3,6:1159\n708#4:1148\n696#4:1149\n708#4:1157\n696#4:1158\n78#5,6:1166\n85#5,4:1181\n89#5,2:1191\n78#5,6:1200\n85#5,4:1215\n89#5,2:1225\n93#5:1231\n78#5,6:1239\n85#5,4:1254\n89#5,2:1264\n93#5:1270\n78#5,6:1285\n85#5,4:1300\n89#5,2:1310\n93#5:1316\n78#5,6:1325\n85#5,4:1340\n89#5,2:1350\n93#5:1356\n78#5,6:1365\n85#5,4:1380\n89#5,2:1390\n93#5:1396\n78#5,6:1407\n85#5,4:1422\n89#5,2:1432\n93#5:1438\n78#5,6:1447\n85#5,4:1462\n89#5,2:1472\n93#5:1478\n93#5:1482\n368#6,9:1172\n377#6:1193\n368#6,9:1206\n377#6:1227\n378#6,2:1229\n368#6,9:1245\n377#6:1266\n378#6,2:1268\n368#6,9:1291\n377#6:1312\n378#6,2:1314\n368#6,9:1331\n377#6:1352\n378#6,2:1354\n368#6,9:1371\n377#6:1392\n378#6,2:1394\n368#6,9:1413\n377#6:1434\n378#6,2:1436\n368#6,9:1453\n377#6:1474\n378#6,2:1476\n378#6,2:1480\n4032#7,6:1185\n4032#7,6:1219\n4032#7,6:1258\n4032#7,6:1304\n4032#7,6:1344\n4032#7,6:1384\n4032#7,6:1426\n4032#7,6:1466\n71#8:1194\n69#8,5:1195\n74#8:1228\n78#8:1232\n71#8:1233\n69#8,5:1234\n74#8:1267\n78#8:1271\n71#8:1278\n68#8,6:1279\n74#8:1313\n78#8:1317\n71#8:1318\n68#8,6:1319\n74#8:1353\n78#8:1357\n71#8:1358\n68#8,6:1359\n74#8:1393\n78#8:1397\n71#8:1400\n68#8,6:1401\n74#8:1435\n78#8:1439\n71#8:1440\n68#8,6:1441\n74#8:1475\n78#8:1479\n56#9:1272\n56#9:1275\n50#9:1483\n86#9:1484\n148#10:1273\n205#10:1274\n148#10:1276\n205#10:1277\n148#10:1398\n148#10:1399\n148#10:1485\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldKt\n*L\n202#1:1141\n358#1:1150\n459#1:1165\n222#1:1142,6\n378#1:1151,6\n456#1:1159,6\n225#1:1148\n225#1:1149\n381#1:1157\n381#1:1158\n460#1:1166,6\n460#1:1181,4\n460#1:1191,2\n469#1:1200,6\n469#1:1215,4\n469#1:1225,2\n469#1:1231\n477#1:1239,6\n477#1:1254,4\n477#1:1264,2\n477#1:1270\n502#1:1285,6\n502#1:1300,4\n502#1:1310,2\n502#1:1316\n512#1:1325,6\n512#1:1340,4\n512#1:1350,2\n512#1:1356\n523#1:1365,6\n523#1:1380,4\n523#1:1390,2\n523#1:1396\n551#1:1407,6\n551#1:1422,4\n551#1:1432,2\n551#1:1438\n560#1:1447,6\n560#1:1462,4\n560#1:1472,2\n560#1:1478\n460#1:1482\n460#1:1172,9\n460#1:1193\n469#1:1206,9\n469#1:1227\n469#1:1229,2\n477#1:1245,9\n477#1:1266\n477#1:1268,2\n502#1:1291,9\n502#1:1312\n502#1:1314,2\n512#1:1331,9\n512#1:1352\n512#1:1354,2\n523#1:1371,9\n523#1:1392\n523#1:1394,2\n551#1:1413,9\n551#1:1434\n551#1:1436,2\n560#1:1453,9\n560#1:1474\n560#1:1476,2\n460#1:1480,2\n460#1:1185,6\n469#1:1219,6\n477#1:1258,6\n502#1:1304,6\n512#1:1344,6\n523#1:1384,6\n551#1:1426,6\n560#1:1466,6\n469#1:1194\n469#1:1195,5\n469#1:1228\n469#1:1232\n477#1:1233\n477#1:1234,5\n477#1:1267\n477#1:1271\n502#1:1278\n502#1:1279,6\n502#1:1313\n502#1:1317\n512#1:1318\n512#1:1319,6\n512#1:1353\n512#1:1357\n523#1:1358\n523#1:1359,6\n523#1:1393\n523#1:1397\n551#1:1400\n551#1:1401,6\n551#1:1435\n551#1:1439\n560#1:1440\n560#1:1441,6\n560#1:1475\n560#1:1479\n490#1:1272\n496#1:1275\n960#1:1483\n965#1:1484\n490#1:1273\n490#1:1274\n496#1:1276\n496#1:1277\n544#1:1398\n545#1:1399\n1139#1:1485\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float TextFieldWithLabelVerticalPadding = C2331Dp.m13305constructorimpl(8);

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(@org.jetbrains.annotations.NotNull final java.lang.String r65, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r66, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r67, boolean r68, boolean r69, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.TextStyle r70, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r71, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r72, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r73, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r74, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r75, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r76, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r77, boolean r78, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.input.VisualTransformation r79, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r80, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r81, boolean r82, int r83, int r84, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r85, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r86, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r87, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r88, final int r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(java.lang.String, r6.c, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@NotNull final Modifier modifier, @NotNull InterfaceC6473e interfaceC6473e, @Nullable final InterfaceC6473e interfaceC6473e2, @Nullable InterfaceC6474f interfaceC6474f, @Nullable final InterfaceC6473e interfaceC6473e3, @Nullable final InterfaceC6473e interfaceC6473e4, @Nullable final InterfaceC6473e interfaceC6473e5, @Nullable final InterfaceC6473e interfaceC6473e6, final boolean z8, final float f, @NotNull final InterfaceC6473e interfaceC6473e7, @Nullable InterfaceC6473e interfaceC6473e8, @NotNull PaddingValues paddingValues, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        int i10;
        PaddingValues paddingValues2;
        float f7;
        InterfaceC6474f interfaceC6474f2;
        InterfaceC6473e interfaceC6473e9;
        InterfaceC6473e interfaceC6473e10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1830307184);
        if ((i & 6) == 0) {
            i9 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i9 |= composerStartRestartGroup.changed(z8) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i & 805306368) == 0) {
            i9 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
        }
        int i11 = i9;
        if ((i8 & 6) == 0) {
            i10 = i8 | (composerStartRestartGroup.changedInstance(interfaceC6473e7) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e8) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            paddingValues2 = paddingValues;
            i10 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
        } else {
            paddingValues2 = paddingValues;
        }
        int i12 = i10;
        if ((i11 & 306783379) == 306783378 && (i12 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            interfaceC6473e9 = interfaceC6473e;
            interfaceC6473e10 = interfaceC6473e8;
            interfaceC6474f2 = interfaceC6474f;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1830307184, i11, i12, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z9 = ((1879048192 & i11) == 536870912) | ((234881024 & i11) == 67108864) | ((i12 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextFieldMeasurePolicy(z8, f, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl = Updater.m10109constructorimpl(composerStartRestartGroup);
            Updater.m10116setimpl(composerM10109constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m10116setimpl(composerM10109constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            InterfaceC6473e setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            interfaceC6473e7.invoke(composerStartRestartGroup, Integer.valueOf(i12 & 14));
            composerStartRestartGroup.startReplaceGroup(1341517187);
            if (interfaceC6473e3 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                InterfaceC6469a constructor2 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl2 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 12) & 14, interfaceC6473e3);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341526310);
            if (interfaceC6473e4 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
                InterfaceC6469a constructor3 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl3 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
                if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r2);
                }
                Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 15) & 14, interfaceC6473e4);
            }
            composerStartRestartGroup.endReplaceGroup();
            float fCalculateStartPadding = PaddingKt.calculateStartPadding(paddingValues2, layoutDirection);
            float fCalculateEndPadding = PaddingKt.calculateEndPadding(paddingValues2, layoutDirection);
            if (interfaceC6473e3 != null) {
                float fM13305constructorimpl = C2331Dp.m13305constructorimpl(fCalculateStartPadding - TextFieldImplKt.getHorizontalIconPadding());
                float fM13305constructorimpl2 = C2331Dp.m13305constructorimpl(0);
                if (fM13305constructorimpl < fM13305constructorimpl2) {
                    fM13305constructorimpl = fM13305constructorimpl2;
                }
                fCalculateStartPadding = C2331Dp.m13305constructorimpl(fM13305constructorimpl);
            }
            float fM13305constructorimpl3 = fCalculateStartPadding;
            if (interfaceC6473e4 != null) {
                float fM13305constructorimpl4 = C2331Dp.m13305constructorimpl(fCalculateEndPadding - TextFieldImplKt.getHorizontalIconPadding());
                float fM13305constructorimpl5 = C2331Dp.m13305constructorimpl(0);
                if (fM13305constructorimpl4 < fM13305constructorimpl5) {
                    fM13305constructorimpl4 = fM13305constructorimpl5;
                }
                fCalculateEndPadding = C2331Dp.m13305constructorimpl(fM13305constructorimpl4);
            }
            composerStartRestartGroup.startReplaceGroup(1341556924);
            if (interfaceC6473e5 != null) {
                Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fM13305constructorimpl3, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
                InterfaceC6469a constructor4 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl4 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion, composerM10109constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM10109constructorimpl4, currentCompositionLocalMap4);
                if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r3);
                }
                Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 18) & 14, interfaceC6473e5);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341568890);
            if (interfaceC6473e6 != null) {
                float f8 = fCalculateEndPadding;
                Modifier modifierM7266paddingqDBjuR0$default2 = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f8, 0.0f, 10, null);
                f7 = f8;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default2);
                InterfaceC6469a constructor5 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl5 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion, composerM10109constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM10109constructorimpl5, currentCompositionLocalMap5);
                if (composerM10109constructorimpl5.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash5, composerM10109constructorimpl5, currentCompositeKeyHash5, interfaceC6473eM917r4);
                }
                Updater.m10116setimpl(composerM10109constructorimpl5, modifierMaterializeModifier5, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 21) & 14, interfaceC6473e6);
            } else {
                f7 = fCalculateEndPadding;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1341581092);
            if (interfaceC6473e2 != null) {
                Modifier modifierM7266paddingqDBjuR0$default3 = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LabelId), DpKt.m13348lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f), 0.0f, 2, null), null, false, 3, null), fM13305constructorimpl3, 0.0f, f7, 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default3);
                InterfaceC6469a constructor6 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl6 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r5 = AbstractC0584a.m917r(companion, composerM10109constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM10109constructorimpl6, currentCompositionLocalMap6);
                if (composerM10109constructorimpl6.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash6, composerM10109constructorimpl6, currentCompositeKeyHash6, interfaceC6473eM917r5);
                }
                Updater.m10116setimpl(composerM10109constructorimpl6, modifierMaterializeModifier6, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 6) & 14, interfaceC6473e2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(companion2, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (interfaceC6473e5 != null) {
                fM13305constructorimpl3 = C2331Dp.m13305constructorimpl(0);
            }
            Modifier modifierM7266paddingqDBjuR0$default4 = PaddingKt.m7266paddingqDBjuR0$default(modifierWrapContentHeight$default, fM13305constructorimpl3, 0.0f, interfaceC6473e6 == null ? f7 : C2331Dp.m13305constructorimpl(0), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(1341611627);
            if (interfaceC6474f != null) {
                interfaceC6474f2 = interfaceC6474f;
                interfaceC6474f2.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(modifierM7266paddingqDBjuR0$default4), composerStartRestartGroup, Integer.valueOf((i11 >> 6) & 112));
            } else {
                interfaceC6474f2 = interfaceC6474f;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(modifierM7266paddingqDBjuR0$default4);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), true);
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            InterfaceC6469a constructor7 = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor7);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10109constructorimpl7 = Updater.m10109constructorimpl(composerStartRestartGroup);
            InterfaceC6473e interfaceC6473eM917r6 = AbstractC0584a.m917r(companion, composerM10109constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM10109constructorimpl7, currentCompositionLocalMap7);
            if (composerM10109constructorimpl7.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                AbstractC0584a.m918s(currentCompositeKeyHash7, composerM10109constructorimpl7, currentCompositeKeyHash7, interfaceC6473eM917r6);
            }
            Updater.m10116setimpl(composerM10109constructorimpl7, modifierMaterializeModifier7, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            interfaceC6473e9 = interfaceC6473e;
            interfaceC6473e9.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(1341622624);
            if (interfaceC6473e8 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(LayoutIdKt.layoutId(companion2, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m9082supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
                InterfaceC6469a constructor8 = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor8);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10109constructorimpl8 = Updater.m10109constructorimpl(composerStartRestartGroup);
                InterfaceC6473e interfaceC6473eM917r7 = AbstractC0584a.m917r(companion, composerM10109constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM10109constructorimpl8, currentCompositionLocalMap8);
                if (composerM10109constructorimpl8.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash8, composerM10109constructorimpl8, currentCompositeKeyHash8, interfaceC6473eM917r7);
                }
                Updater.m10116setimpl(composerM10109constructorimpl8, modifierMaterializeModifier8, companion.getSetModifier());
                interfaceC6473e10 = interfaceC6473e8;
                AbstractC0584a.m920u(composerStartRestartGroup, (i12 >> 3) & 14, interfaceC6473e10);
            } else {
                interfaceC6473e10 = interfaceC6473e8;
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC6473e interfaceC6473e11 = interfaceC6473e9;
            final InterfaceC6474f interfaceC6474f3 = interfaceC6474f2;
            final PaddingValues paddingValues3 = paddingValues2;
            final InterfaceC6473e interfaceC6473e12 = interfaceC6473e10;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.TextFieldKt.TextFieldLayout.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    TextFieldKt.TextFieldLayout(modifier, interfaceC6473e11, interfaceC6473e2, interfaceC6474f3, interfaceC6473e3, interfaceC6473e4, interfaceC6473e5, interfaceC6473e6, z8, f, interfaceC6473e7, interfaceC6473e12, paddingValues3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m9102calculateHeightmKXJcVc(int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f, long j7, float f7, PaddingValues paddingValues) {
        boolean z8 = i8 > 0;
        float fM13305constructorimpl = C2331Dp.m13305constructorimpl(paddingValues.getBottom() + paddingValues.getTop()) * f7;
        if (z8) {
            fM13305constructorimpl = MathHelpersKt.lerp(C2331Dp.m13305constructorimpl(TextFieldImplKt.getTextFieldPadding() * 2) * f7, fM13305constructorimpl, f);
        }
        int[] iArr = {i13, i11, i12, MathHelpersKt.lerp(i8, 0, f)};
        for (int i15 = 0; i15 < 4; i15++) {
            i = Math.max(i, iArr[i15]);
        }
        return Math.max(Constraints.m13259getMinHeightimpl(j7), Math.max(i9, Math.max(i10, AbstractC6600a.m6241q(fM13305constructorimpl + MathHelpersKt.lerp(0, i8, f) + i))) + i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-yeHjK3Y, reason: not valid java name */
    public static final int m9103calculateWidthyeHjK3Y(int i, int i8, int i9, int i10, int i11, int i12, int i13, long j7) {
        int i14 = i9 + i10;
        return Math.max(Math.max(i11 + i14, Math.max(i13 + i14, i12)) + i + i8, Constraints.m13260getMinWidthimpl(j7));
    }

    @NotNull
    public static final Modifier drawIndicatorLine(@NotNull Modifier modifier, @NotNull final State<BorderStroke> state) {
        return DrawModifierKt.drawWithContent(modifier, new InterfaceC6471c() { // from class: androidx.compose.material3.TextFieldKt.drawIndicatorLine.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                float fMo6903toPx0680j_4 = contentDrawScope.mo6903toPx0680j_4(state.getValue().getWidth());
                float fM10507getHeightimpl = Size.m10507getHeightimpl(contentDrawScope.mo11233getSizeNHjbRc()) - (fMo6903toPx0680j_4 / 2);
                DrawScope.m11218drawLine1RTmtNc$default(contentDrawScope, state.getValue().getBrush(), OffsetKt.Offset(0.0f, fM10507getHeightimpl), OffsetKt.Offset(Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()), fM10507getHeightimpl), fMo6903toPx0680j_4, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getTextFieldWithLabelVerticalPadding() {
        return TextFieldWithLabelVerticalPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i, int i8, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, boolean z8, int i9, int i10, float f, float f7) {
        Placeable.PlacementScope.m12097place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m13444getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i8 - TextFieldImplKt.heightOrZero(placeable9);
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), (z8 ? Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), iHeightOrZero) : AbstractC6600a.m6241q(TextFieldImplKt.getTextFieldPadding() * f7)) - AbstractC6600a.m6241q((r1 - i9) * f), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, TextFieldImplKt.widthOrZero(placeable4), i10, 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable6) + TextFieldImplKt.widthOrZero(placeable4);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, i10, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, iWidthOrZero, i10, 0.0f, 4, null);
        }
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, (i - TextFieldImplKt.widthOrZero(placeable5)) - placeable7.getWidth(), i10, 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i - placeable5.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable5.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i, int i8, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, boolean z8, float f, PaddingValues paddingValues) {
        Placeable.PlacementScope.m12097place70tqf50$default(placementScope, placeable7, IntOffset.INSTANCE.m13444getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i8 - TextFieldImplKt.heightOrZero(placeable8);
        int iM6241q = AbstractC6600a.m6241q(paddingValues.getTop() * f);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.INSTANCE.getCenterVertically().align(placeable3.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable3), placeWithoutLabel$calculateVerticalPosition(z8, iHeightOrZero, iM6241q, placeable5), 0.0f, 4, null);
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable5) + TextFieldImplKt.widthOrZero(placeable3);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z8, iHeightOrZero, iM6241q, placeable), 0.0f, 4, null);
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, iWidthOrZero, placeWithoutLabel$calculateVerticalPosition(z8, iHeightOrZero, iM6241q, placeable2), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable6, (i - TextFieldImplKt.widthOrZero(placeable4)) - placeable6.getWidth(), placeWithoutLabel$calculateVerticalPosition(z8, iHeightOrZero, iM6241q, placeable6), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i - placeable4.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable4.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable8 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable8, 0, iHeightOrZero, 0.0f, 4, null);
        }
    }

    private static final int placeWithoutLabel$calculateVerticalPosition(boolean z8, int i, int i8, Placeable placeable) {
        return z8 ? Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), i) : i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i, int i8) {
        return i == Integer.MAX_VALUE ? i : i - i8;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:359:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.text.input.TextFieldValue r65, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r66, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r67, boolean r68, boolean r69, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.TextStyle r70, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r71, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r72, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r73, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r74, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r75, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r76, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r77, boolean r78, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.input.VisualTransformation r79, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r80, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r81, boolean r82, int r83, int r84, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r85, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r86, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r87, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r88, final int r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, r6.c, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
