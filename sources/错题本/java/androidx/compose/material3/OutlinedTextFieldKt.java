package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.DrawModifierKt;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ClipOp;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
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
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
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

@Metadata(m5109d1 = {"\u0000®\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aÚ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'\u001aÚ\u0002\u0010&\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020(2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010)\u001a\u0082\u0002\u00105\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0002\b\r2\u0013\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0012\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0013\u0010\u0013\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00030\u00022\u0011\u00101\u001a\r\u0012\u0004\u0012\u00020\u00030\f¢\u0006\u0002\b\r2\u0013\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f¢\u0006\u0002\b\r2\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b5\u00106\u001a\u001b\u00108\u001a\u00020\u001d*\u00020\u001d2\u0006\u00107\u001a\u00020\u001dH\u0002¢\u0006\u0004\b8\u00109\u001aj\u0010F\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u001d2\u0006\u0010?\u001a\u00020\u001d2\u0006\u0010@\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020-2\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001ar\u0010Q\u001a\u00020\u001d2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010H\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\u0006\u0010K\u001a\u00020\u001d2\u0006\u0010L\u001a\u00020\u001d2\u0006\u0010M\u001a\u00020\u001d2\u0006\u0010N\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020-2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020-2\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010P\u001a¡\u0001\u0010a\u001a\u00020\u0003*\u00020R2\u0006\u0010S\u001a\u00020\u001d2\u0006\u0010T\u001a\u00020\u001d2\b\u0010V\u001a\u0004\u0018\u00010U2\b\u0010W\u001a\u0004\u0018\u00010U2\b\u0010X\u001a\u0004\u0018\u00010U2\b\u0010Y\u001a\u0004\u0018\u00010U2\u0006\u0010Z\u001a\u00020U2\b\u0010[\u001a\u0004\u0018\u00010U2\b\u0010\\\u001a\u0004\u0018\u00010U2\u0006\u0010]\u001a\u00020U2\b\u0010^\u001a\u0004\u0018\u00010U2\u0006\u0010.\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010C\u001a\u00020-2\u0006\u0010`\u001a\u00020_2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\ba\u0010b\u001a)\u0010d\u001a\u00020\u0005*\u00020\u00052\f\u0010c\u001a\b\u0012\u0004\u0012\u00020/0\f2\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\bd\u0010e\"\u0014\u0010g\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010h\"\u001a\u0010j\u001a\u00020i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006n"}, m5110d2 = {"", "value", "Lkotlin/Function1;", "Ld6/s;", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "readOnly", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "label", "placeholder", "leadingIcon", "trailingIcon", RequestParameters.PREFIX, "suffix", "supportingText", "isError", "Landroidx/compose/ui/text/input/VisualTransformation;", "visualTransformation", "Landroidx/compose/foundation/text/KeyboardOptions;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "singleLine", "", "maxLines", "minLines", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/material3/TextFieldColors;", "colors", "OutlinedTextField", "(Ljava/lang/String;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "(Landroidx/compose/ui/text/input/TextFieldValue;Lr6/c;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V", "textField", "leading", "trailing", "", "animationProgress", "Landroidx/compose/ui/geometry/Size;", "onLabelMeasured", "container", "supporting", "Landroidx/compose/foundation/layout/PaddingValues;", "paddingValues", "OutlinedTextFieldLayout", "(Landroidx/compose/ui/Modifier;Lr6/e;Lr6/f;Lr6/e;Lr6/e;Lr6/e;Lr6/e;Lr6/e;ZFLr6/c;Lr6/e;Lr6/e;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;II)V", TypedValues.TransitionType.S_FROM, "substractConstraintSafely", "(II)I", "leadingPlaceableWidth", "trailingPlaceableWidth", "prefixPlaceableWidth", "suffixPlaceableWidth", "textFieldPlaceableWidth", "labelPlaceableWidth", "placeholderPlaceableWidth", "Landroidx/compose/ui/unit/Constraints;", "constraints", "density", "calculateWidth-DHJA7U0", "(IIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateWidth", "leadingHeight", "trailingHeight", "prefixHeight", "suffixHeight", "textFieldHeight", "labelHeight", "placeholderHeight", "supportingHeight", "calculateHeight-mKXJcVc", "(IIIIIIIIFJFLandroidx/compose/foundation/layout/PaddingValues;)I", "calculateHeight", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "totalHeight", "width", "Landroidx/compose/ui/layout/Placeable;", "leadingPlaceable", "trailingPlaceable", "prefixPlaceable", "suffixPlaceable", "textFieldPlaceable", "labelPlaceable", "placeholderPlaceable", "containerPlaceable", "supportingPlaceable", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "place", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;IILandroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;FZFLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/layout/PaddingValues;)V", "labelSize", "outlineCutout", "(Landroidx/compose/ui/Modifier;Lr6/a;Landroidx/compose/foundation/layout/PaddingValues;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "OutlinedTextFieldInnerPadding", "F", "Landroidx/compose/ui/unit/TextUnit;", "OutlinedTextFieldTopPadding", "J", "getOutlinedTextFieldTopPadding", "()J", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 TextUnit.kt\nandroidx/compose/ui/unit/TextUnit\n*L\n1#1,1155:1\n77#2:1156\n77#2:1165\n77#2:1166\n77#2:1175\n77#2:1182\n1223#3,6:1157\n1223#3,6:1167\n1223#3,6:1176\n708#4:1163\n696#4:1164\n708#4:1173\n696#4:1174\n78#5,6:1183\n85#5,4:1198\n89#5,2:1208\n78#5,6:1217\n85#5,4:1232\n89#5,2:1242\n93#5:1248\n78#5,6:1256\n85#5,4:1271\n89#5,2:1281\n93#5:1287\n78#5,6:1302\n85#5,4:1317\n89#5,2:1327\n93#5:1333\n78#5,6:1342\n85#5,4:1357\n89#5,2:1367\n93#5:1373\n78#5,6:1384\n85#5,4:1399\n89#5,2:1409\n93#5:1415\n78#5,6:1424\n85#5,4:1439\n89#5,2:1449\n93#5:1455\n78#5,6:1464\n85#5,4:1479\n89#5,2:1489\n93#5:1495\n93#5:1499\n368#6,9:1189\n377#6:1210\n368#6,9:1223\n377#6:1244\n378#6,2:1246\n368#6,9:1262\n377#6:1283\n378#6,2:1285\n368#6,9:1308\n377#6:1329\n378#6,2:1331\n368#6,9:1348\n377#6:1369\n378#6,2:1371\n368#6,9:1390\n377#6:1411\n378#6,2:1413\n368#6,9:1430\n377#6:1451\n378#6,2:1453\n368#6,9:1470\n377#6:1491\n378#6,2:1493\n378#6,2:1497\n4032#7,6:1202\n4032#7,6:1236\n4032#7,6:1275\n4032#7,6:1321\n4032#7,6:1361\n4032#7,6:1403\n4032#7,6:1443\n4032#7,6:1483\n71#8:1211\n69#8,5:1212\n74#8:1245\n78#8:1249\n71#8:1250\n69#8,5:1251\n74#8:1284\n78#8:1288\n71#8:1295\n68#8,6:1296\n74#8:1330\n78#8:1334\n71#8:1335\n68#8,6:1336\n74#8:1370\n78#8:1374\n71#8:1377\n68#8,6:1378\n74#8:1412\n78#8:1416\n71#8:1417\n68#8,6:1418\n74#8:1452\n78#8:1456\n71#8:1457\n68#8,6:1458\n74#8:1492\n78#8:1496\n56#9:1289\n56#9:1292\n50#9:1500\n148#10:1290\n205#10:1291\n148#10:1293\n205#10:1294\n148#10:1375\n148#10:1376\n148#10:1501\n134#11,2:1502\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldKt\n*L\n176#1:1156\n205#1:1165\n351#1:1166\n380#1:1175\n479#1:1182\n196#1:1157,6\n371#1:1167,6\n471#1:1176,6\n199#1:1163\n199#1:1164\n374#1:1173\n374#1:1174\n480#1:1183,6\n480#1:1198,4\n480#1:1208,2\n486#1:1217,6\n486#1:1232,4\n486#1:1242,2\n486#1:1248\n494#1:1256,6\n494#1:1271,4\n494#1:1281,2\n494#1:1287\n519#1:1302,6\n519#1:1317,4\n519#1:1327,2\n519#1:1333\n529#1:1342,6\n529#1:1357,4\n529#1:1367,2\n529#1:1373\n551#1:1384,6\n551#1:1399,4\n551#1:1409,2\n551#1:1415\n559#1:1424,6\n559#1:1439,4\n559#1:1449,2\n559#1:1455\n576#1:1464,6\n576#1:1479,4\n576#1:1489,2\n576#1:1495\n480#1:1499\n480#1:1189,9\n480#1:1210\n486#1:1223,9\n486#1:1244\n486#1:1246,2\n494#1:1262,9\n494#1:1283\n494#1:1285,2\n519#1:1308,9\n519#1:1329\n519#1:1331,2\n529#1:1348,9\n529#1:1369\n529#1:1371,2\n551#1:1390,9\n551#1:1411\n551#1:1413,2\n559#1:1430,9\n559#1:1451\n559#1:1453,2\n576#1:1470,9\n576#1:1491\n576#1:1493,2\n480#1:1497,2\n480#1:1202,6\n486#1:1236,6\n494#1:1275,6\n519#1:1321,6\n529#1:1361,6\n551#1:1403,6\n559#1:1443,6\n576#1:1483,6\n486#1:1211\n486#1:1212,5\n486#1:1245\n486#1:1249\n494#1:1250\n494#1:1251,5\n494#1:1284\n494#1:1288\n519#1:1295\n519#1:1296,6\n519#1:1330\n519#1:1334\n529#1:1335\n529#1:1336,6\n529#1:1370\n529#1:1374\n551#1:1377\n551#1:1378,6\n551#1:1412\n551#1:1416\n559#1:1417\n559#1:1418,6\n559#1:1452\n559#1:1456\n576#1:1457\n576#1:1458,6\n576#1:1492\n576#1:1496\n507#1:1289\n513#1:1292\n966#1:1500\n507#1:1290\n507#1:1291\n513#1:1293\n513#1:1294\n543#1:1375\n544#1:1376\n1146#1:1501\n1154#1:1502,2\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {
    private static final float OutlinedTextFieldInnerPadding = C2331Dp.m13305constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding;

    static {
        long jM9995getBodySmallLineHeightXSAIIZE = TypeScaleTokens.INSTANCE.m9995getBodySmallLineHeightXSAIIZE();
        TextUnitKt.m13512checkArithmeticR2X_6o(jM9995getBodySmallLineHeightXSAIIZE);
        OutlinedTextFieldTopPadding = TextUnitKt.pack(TextUnit.m13497getRawTypeimpl(jM9995getBodySmallLineHeightXSAIIZE), TextUnit.m13499getValueimpl(jM9995getBodySmallLineHeightXSAIIZE) / 2);
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
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
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
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final java.lang.String r68, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r69, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r70, boolean r71, boolean r72, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.TextStyle r73, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r74, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r75, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r76, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r77, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r78, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r79, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r80, boolean r81, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.input.VisualTransformation r82, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r83, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r88, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r89, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r90, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, r6.c, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@NotNull final Modifier modifier, @NotNull final InterfaceC6473e interfaceC6473e, @Nullable final InterfaceC6474f interfaceC6474f, @Nullable InterfaceC6473e interfaceC6473e2, @Nullable final InterfaceC6473e interfaceC6473e3, @Nullable final InterfaceC6473e interfaceC6473e4, @Nullable final InterfaceC6473e interfaceC6473e5, @Nullable final InterfaceC6473e interfaceC6473e6, final boolean z8, float f, @NotNull final InterfaceC6471c interfaceC6471c, @NotNull final InterfaceC6473e interfaceC6473e7, @Nullable InterfaceC6473e interfaceC6473e8, @NotNull PaddingValues paddingValues, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        int i10;
        PaddingValues paddingValues2;
        float f7;
        Alignment.Companion companion;
        final InterfaceC6473e interfaceC6473e9;
        InterfaceC6473e interfaceC6473e10;
        final float f8 = f;
        Composer composerStartRestartGroup = composer.startRestartGroup(1408290209);
        if ((i & 6) == 0) {
            i9 = i | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i9 = i;
        }
        if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6474f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 2048 : 1024;
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
            i9 |= composerStartRestartGroup.changed(f8) ? 536870912 : 268435456;
        }
        int i11 = i9;
        if ((i8 & 6) == 0) {
            i10 = i8 | (composerStartRestartGroup.changedInstance(interfaceC6471c) ? 4 : 2);
        } else {
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e7) ? 32 : 16;
        }
        if ((i8 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(interfaceC6473e8) ? 256 : 128;
        }
        if ((i8 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i10 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i12 = i10;
        if ((i11 & 306783379) == 306783378 && (i12 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            interfaceC6473e9 = interfaceC6473e2;
            interfaceC6473e10 = interfaceC6473e8;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408290209, i11, i12, "androidx.compose.material3.OutlinedTextFieldLayout (OutlinedTextField.kt:468)");
            }
            boolean z9 = ((i12 & 7168) == 2048) | ((i12 & 14) == 4) | ((234881024 & i11) == 67108864) | ((1879048192 & i11) == 536870912);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OutlinedTextFieldMeasurePolicy(interfaceC6471c, z8, f8, paddingValues2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objRememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            InterfaceC6469a constructor = companion2.getConstructor();
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
            Updater.m10116setimpl(composerM10109constructorimpl, outlinedTextFieldMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m10116setimpl(composerM10109constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            InterfaceC6473e setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            interfaceC6473e7.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 3) & 14));
            composerStartRestartGroup.startReplaceGroup(250370369);
            if (interfaceC6473e3 != null) {
                Modifier modifierThen = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.LeadingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen);
                InterfaceC6469a constructor2 = companion2.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
                if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r);
                }
                Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 12) & 14, interfaceC6473e3);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250379492);
            if (interfaceC6473e4 != null) {
                Modifier modifierThen2 = LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.TrailingId).then(TextFieldImplKt.getIconDefaultSizeModifier());
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen2);
                InterfaceC6469a constructor3 = companion2.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, composerM10109constructorimpl3, currentCompositionLocalMap3);
                if (composerM10109constructorimpl3.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash3, composerM10109constructorimpl3, currentCompositeKeyHash3, interfaceC6473eM917r2);
                }
                Updater.m10116setimpl(composerM10109constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
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
            composerStartRestartGroup.startReplaceGroup(250410106);
            if (interfaceC6473e5 != null) {
                Modifier modifierM7266paddingqDBjuR0$default = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.PrefixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), fM13305constructorimpl3, 0.0f, TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default);
                InterfaceC6469a constructor4 = companion2.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r3 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy3, composerM10109constructorimpl4, currentCompositionLocalMap4);
                if (composerM10109constructorimpl4.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash4, composerM10109constructorimpl4, currentCompositeKeyHash4, interfaceC6473eM917r3);
                }
                Updater.m10116setimpl(composerM10109constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 18) & 14, interfaceC6473e5);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250422072);
            if (interfaceC6473e6 != null) {
                f7 = fCalculateEndPadding;
                Modifier modifierM7266paddingqDBjuR0$default2 = PaddingKt.m7266paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, TextFieldImplKt.SuffixId), TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.getPrefixSuffixTextPadding(), 0.0f, f7, 0.0f, 10, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM7266paddingqDBjuR0$default2);
                InterfaceC6469a constructor5 = companion2.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r4 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy4, composerM10109constructorimpl5, currentCompositionLocalMap5);
                if (composerM10109constructorimpl5.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash5, composerM10109constructorimpl5, currentCompositeKeyHash5, interfaceC6473eM917r4);
                }
                Updater.m10116setimpl(composerM10109constructorimpl5, modifierMaterializeModifier5, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 21) & 14, interfaceC6473e6);
            } else {
                f7 = fCalculateEndPadding;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(companion3, TextFieldImplKt.getMinTextLineHeight(), 0.0f, 2, null), null, false, 3, null);
            if (interfaceC6473e5 != null) {
                fM13305constructorimpl3 = C2331Dp.m13305constructorimpl(0);
            }
            Modifier modifierM7266paddingqDBjuR0$default3 = PaddingKt.m7266paddingqDBjuR0$default(modifierWrapContentHeight$default, fM13305constructorimpl3, 0.0f, interfaceC6473e6 == null ? f7 : C2331Dp.m13305constructorimpl(0), 0.0f, 10, null);
            composerStartRestartGroup.startReplaceGroup(250444361);
            if (interfaceC6474f != null) {
                interfaceC6474f.invoke(LayoutIdKt.layoutId(companion3, TextFieldImplKt.PlaceholderId).then(modifierM7266paddingqDBjuR0$default3), composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 112));
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen3 = LayoutIdKt.layoutId(companion3, TextFieldImplKt.TextFieldId).then(modifierM7266paddingqDBjuR0$default3);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), true);
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierThen3);
            InterfaceC6469a constructor6 = companion2.getConstructor();
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
            InterfaceC6473e interfaceC6473eM917r5 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy5, composerM10109constructorimpl6, currentCompositionLocalMap6);
            if (composerM10109constructorimpl6.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                AbstractC0584a.m918s(currentCompositeKeyHash6, composerM10109constructorimpl6, currentCompositeKeyHash6, interfaceC6473eM917r5);
            }
            Updater.m10116setimpl(composerM10109constructorimpl6, modifierMaterializeModifier6, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
            interfaceC6473e.invoke(composerStartRestartGroup, Integer.valueOf((i11 >> 3) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.startReplaceGroup(250455481);
            if (interfaceC6473e2 != null) {
                f8 = f;
                Modifier modifierLayoutId = LayoutIdKt.layoutId(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(companion3, DpKt.m13348lerpMdfbLM(TextFieldImplKt.getMinTextLineHeight(), TextFieldImplKt.getMinFocusedLabelLineHeight(), f8), 0.0f, 2, null), null, false, 3, null), TextFieldImplKt.LabelId);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId);
                InterfaceC6469a constructor7 = companion2.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r6 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl7, measurePolicyMaybeCachedBoxMeasurePolicy6, composerM10109constructorimpl7, currentCompositionLocalMap7);
                if (composerM10109constructorimpl7.getInserting()) {
                    companion = companion4;
                } else {
                    companion = companion4;
                    if (!AbstractC5830k.m5325b(composerM10109constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    }
                    Updater.m10116setimpl(composerM10109constructorimpl7, modifierMaterializeModifier7, companion2.getSetModifier());
                    interfaceC6473e9 = interfaceC6473e2;
                    AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 9) & 14, interfaceC6473e9);
                }
                AbstractC0584a.m918s(currentCompositeKeyHash7, composerM10109constructorimpl7, currentCompositeKeyHash7, interfaceC6473eM917r6);
                Updater.m10116setimpl(composerM10109constructorimpl7, modifierMaterializeModifier7, companion2.getSetModifier());
                interfaceC6473e9 = interfaceC6473e2;
                AbstractC0584a.m920u(composerStartRestartGroup, (i11 >> 9) & 14, interfaceC6473e9);
            } else {
                f8 = f;
                companion = companion4;
                interfaceC6473e9 = interfaceC6473e2;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(250473414);
            if (interfaceC6473e8 != null) {
                Modifier modifierPadding = PaddingKt.padding(SizeKt.wrapContentHeight$default(SizeKt.m7297heightInVpY3zN4$default(LayoutIdKt.layoutId(companion3, TextFieldImplKt.SupportingId), TextFieldImplKt.getMinSupportingTextLineHeight(), 0.0f, 2, null), null, false, 3, null), TextFieldDefaults.m9082supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierPadding);
                InterfaceC6469a constructor8 = companion2.getConstructor();
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
                InterfaceC6473e interfaceC6473eM917r7 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy7, composerM10109constructorimpl8, currentCompositionLocalMap8);
                if (composerM10109constructorimpl8.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    AbstractC0584a.m918s(currentCompositeKeyHash8, composerM10109constructorimpl8, currentCompositeKeyHash8, interfaceC6473eM917r7);
                }
                Updater.m10116setimpl(composerM10109constructorimpl8, modifierMaterializeModifier8, companion2.getSetModifier());
                interfaceC6473e10 = interfaceC6473e8;
                AbstractC0584a.m920u(composerStartRestartGroup, (i12 >> 6) & 14, interfaceC6473e10);
            } else {
                interfaceC6473e10 = interfaceC6473e8;
            }
            if (AbstractC0584a.m923x(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final InterfaceC6473e interfaceC6473e11 = interfaceC6473e10;
            final PaddingValues paddingValues3 = paddingValues2;
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextFieldLayout.2
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
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(modifier, interfaceC6473e, interfaceC6474f, interfaceC6473e9, interfaceC6473e3, interfaceC6473e4, interfaceC6473e5, interfaceC6473e6, z8, f8, interfaceC6471c, interfaceC6473e7, interfaceC6473e11, paddingValues3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i8));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-mKXJcVc, reason: not valid java name */
    public static final int m8757calculateHeightmKXJcVc(int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14, float f, long j7, float f7, PaddingValues paddingValues) {
        int[] iArr = {i13, i9, i10, MathHelpersKt.lerp(i12, 0, f)};
        for (int i15 = 0; i15 < 4; i15++) {
            i11 = Math.max(i11, iArr[i15]);
        }
        float top2 = paddingValues.getTop() * f7;
        return Math.max(Constraints.m13259getMinHeightimpl(j7), Math.max(i, Math.max(i8, AbstractC6600a.m6241q(MathHelpersKt.lerp(top2, Math.max(top2, i12 / 2.0f), f) + i11 + (paddingValues.getBottom() * f7)))) + i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-DHJA7U0, reason: not valid java name */
    public static final int m8758calculateWidthDHJA7U0(int i, int i8, int i9, int i10, int i11, int i12, int i13, float f, long j7, float f7, PaddingValues paddingValues) {
        int i14 = i9 + i10;
        int iMax = Math.max(i11 + i14, Math.max(i13 + i14, MathHelpersKt.lerp(i12, 0, f))) + i + i8;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return Math.max(iMax, Math.max(AbstractC6600a.m6241q((i12 + (C2331Dp.m13305constructorimpl(paddingValues.mo7213calculateRightPaddingu2uoSUM(layoutDirection) + paddingValues.mo7212calculateLeftPaddingu2uoSUM(layoutDirection)) * f7)) * f), Constraints.m13260getMinWidthimpl(j7)));
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    @NotNull
    public static final Modifier outlineCutout(@NotNull Modifier modifier, @NotNull final InterfaceC6469a interfaceC6469a, @NotNull final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new InterfaceC6471c() { // from class: androidx.compose.material3.OutlinedTextFieldKt.outlineCutout.1

            @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
                long jM10515unboximpl = ((Size) interfaceC6469a.invoke()).m10515unboximpl();
                float fM10510getWidthimpl = Size.m10510getWidthimpl(jM10515unboximpl);
                if (fM10510getWidthimpl <= 0.0f) {
                    contentDrawScope.drawContent();
                    return;
                }
                float fMo6903toPx0680j_4 = contentDrawScope.mo6903toPx0680j_4(OutlinedTextFieldKt.OutlinedTextFieldInnerPadding);
                float fMo6903toPx0680j_42 = contentDrawScope.mo6903toPx0680j_4(paddingValues.mo7212calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - fMo6903toPx0680j_4;
                float f = 2;
                float fM10510getWidthimpl2 = (fMo6903toPx0680j_4 * f) + fM10510getWidthimpl + fMo6903toPx0680j_42;
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float fM10510getWidthimpl3 = iArr[layoutDirection.ordinal()] == 1 ? Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()) - fM10510getWidthimpl2 : fMo6903toPx0680j_42 < 0.0f ? 0.0f : fMo6903toPx0680j_42;
                if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    fM10510getWidthimpl2 = Size.m10510getWidthimpl(contentDrawScope.mo11233getSizeNHjbRc()) - (fMo6903toPx0680j_42 >= 0.0f ? fMo6903toPx0680j_42 : 0.0f);
                }
                float f7 = fM10510getWidthimpl2;
                float fM10507getHeightimpl = Size.m10507getHeightimpl(jM10515unboximpl);
                float f8 = (-fM10507getHeightimpl) / f;
                float f9 = fM10507getHeightimpl / f;
                int iM10670getDifferencertfAjoo = ClipOp.INSTANCE.m10670getDifferencertfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo11157clipRectN_I0leg(fM10510getWidthimpl3, f8, f7, f9, iM10670getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i, int i8, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, Placeable placeable7, Placeable placeable8, Placeable placeable9, float f, boolean z8, float f7, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        Placeable placeable10;
        boolean z9;
        int i9;
        int i10;
        Placeable.PlacementScope.m12097place70tqf50$default(placementScope, placeable8, IntOffset.INSTANCE.m13444getZeronOccac(), 0.0f, 2, null);
        int iHeightOrZero = i - TextFieldImplKt.heightOrZero(placeable9);
        int iM6241q = AbstractC6600a.m6241q(paddingValues.getTop() * f7);
        int iM6241q2 = AbstractC6600a.m6241q(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f7);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f7;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.INSTANCE.getCenterVertically().align(placeable.getHeight(), iHeightOrZero), 0.0f, 4, null);
        }
        if (placeable6 != null) {
            placeable10 = placeable6;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable10, AbstractC6600a.m6241q(placeable == null ? 0.0f : (1 - f) * (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding)) + iM6241q2, MathHelpersKt.lerp(z8 ? Alignment.INSTANCE.getCenterVertically().align(placeable6.getHeight(), iHeightOrZero) : iM6241q, -(placeable6.getHeight() / 2), f), 0.0f, 4, null);
        } else {
            placeable10 = placeable6;
        }
        if (placeable3 != null) {
            i10 = iM6241q;
            i9 = iHeightOrZero;
            z9 = z8;
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), place$calculateVerticalPosition(z8, iHeightOrZero, iM6241q, placeable10, placeable3), 0.0f, 4, null);
        } else {
            z9 = z8;
            i9 = iHeightOrZero;
            i10 = iM6241q;
        }
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeable3) + TextFieldImplKt.widthOrZero(placeable);
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, iWidthOrZero, place$calculateVerticalPosition(z9, i9, i10, placeable10, placeable5), 0.0f, 4, null);
        if (placeable7 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable7, iWidthOrZero, place$calculateVerticalPosition(z9, i9, i10, placeable10, placeable7), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, (i8 - TextFieldImplKt.widthOrZero(placeable2)) - placeable4.getWidth(), place$calculateVerticalPosition(z9, i9, i10, placeable10, placeable4), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i8 - placeable2.getWidth(), Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i9), 0.0f, 4, null);
        }
        if (placeable9 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable9, 0, i9, 0.0f, 4, null);
        }
    }

    private static final int place$calculateVerticalPosition(boolean z8, int i, int i8, Placeable placeable, Placeable placeable2) {
        if (z8) {
            i8 = Alignment.INSTANCE.getCenterVertically().align(placeable2.getHeight(), i);
        }
        return Math.max(i8, TextFieldImplKt.heightOrZero(placeable) / 2);
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
    /* JADX WARN: Removed duplicated region for block: B:269:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
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
    public static final void OutlinedTextField(@org.jetbrains.annotations.NotNull final androidx.compose.p011ui.text.input.TextFieldValue r68, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6471c r69, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r70, boolean r71, boolean r72, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.TextStyle r73, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r74, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r75, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r76, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r77, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r78, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r79, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r80, boolean r81, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.text.input.VisualTransformation r82, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardOptions r83, @org.jetbrains.annotations.Nullable androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, int r87, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r88, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r89, @org.jetbrains.annotations.Nullable androidx.compose.material3.TextFieldColors r90, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, r6.c, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, r6.e, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.runtime.Composer, int, int, int, int):void");
    }
}
