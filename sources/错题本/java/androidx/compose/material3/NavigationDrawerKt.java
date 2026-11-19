package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.C2075R;
import androidx.compose.p011ui.ComposedModifierKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.graphics.TransformOriginKt;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.input.pointer.C2142xe3d9cdbd;
import androidx.compose.p011ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.semantics.SemanticsModifierKt;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.unit.C2331Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a`\u0010\u0015\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001aS\u0010\u0016\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\t2\u0011\u0010\u000b\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001al\u0010&\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001at\u0010&\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001al\u0010*\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010%\u001at\u0010*\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010(\u001al\u0010-\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020 2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010%\u001at\u00102\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0002\b\n¢\u0006\u0002\b#H\u0001ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a#\u00104\u001a\u00020\f*\u00020\f2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105\u001a#\u00106\u001a\u00020\f*\u00020\f2\u0006\u0010/\u001a\u00020.2\u0006\u00103\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00105\u001a\u001b\u00109\u001a\u000208*\u0002072\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b9\u0010:\u001a\u001b\u0010;\u001a\u000208*\u0002072\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b;\u0010:\u001a\u0090\u0001\u0010F\u001a\u00020\t2\u0011\u0010<\u001a\r\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\b\n2\u0006\u0010=\u001a\u00020\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u0015\b\u0002\u0010?\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\u0015\b\u0002\u0010@\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\b\n2\b\b\u0002\u0010A\u001a\u00020\u001a2\b\b\u0002\u0010C\u001a\u00020B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010DH\u0007¢\u0006\u0004\bF\u0010G\u001a'\u0010K\u001a\u0002082\u0006\u0010H\u001a\u0002082\u0006\u0010I\u001a\u0002082\u0006\u0010J\u001a\u000208H\u0002¢\u0006\u0004\bK\u0010L\u001a>\u0010S\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u00032\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010O\u001a\b\u0012\u0004\u0012\u0002080\b2\u0006\u0010P\u001a\u00020\u0010H\u0003ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\"\u0014\u0010T\u001a\u0002088\u0002X\u0082D¢\u0006\u0006\n\u0004\bT\u0010U\"\u0014\u0010V\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010U\"\u0014\u0010W\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010U\"\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u0002080X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010Z\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006]²\u0006\u000e\u0010[\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\\\u001a\u0002088\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010[\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, m5110d2 = {"Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "Landroidx/compose/material3/DrawerState;", "rememberDrawerState", "(Landroidx/compose/material3/DrawerValue;Lr6/c;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "drawerContent", "Landroidx/compose/ui/Modifier;", "modifier", "drawerState", "gesturesEnabled", "Landroidx/compose/ui/graphics/Color;", "scrimColor", "content", "ModalNavigationDrawer-FHprtrg", "(Lr6/e;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLr6/e;Landroidx/compose/runtime/Composer;II)V", "ModalNavigationDrawer", "DismissibleNavigationDrawer", "(Lr6/e;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLr6/e;Landroidx/compose/runtime/Composer;II)V", "PermanentNavigationDrawer", "(Lr6/e;Landroidx/compose/ui/Modifier;Lr6/e;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "drawerShape", "drawerContainerColor", "drawerContentColor", "Landroidx/compose/ui/unit/Dp;", "drawerTonalElevation", "Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-Snr_uVM", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lr6/f;Landroidx/compose/runtime/Composer;II)V", "DismissibleDrawerSheet-afqeVBk", "DismissibleDrawerSheet", "DismissibleDrawerSheet-Snr_uVM", "PermanentDrawerSheet-afqeVBk", "PermanentDrawerSheet", "Landroidx/compose/material3/DrawerPredictiveBackState;", "drawerPredictiveBackState", "DrawerSheet-7zSek6w", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLr6/f;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "isRtl", "predictiveBackDrawerContainer", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerPredictiveBackState;Z)Landroidx/compose/ui/Modifier;", "predictiveBackDrawerChild", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "calculatePredictiveBackScaleX", "(Landroidx/compose/ui/graphics/GraphicsLayerScope;Landroidx/compose/material3/DrawerPredictiveBackState;)F", "calculatePredictiveBackScaleY", "label", "selected", "onClick", "icon", "badge", "shape", "Landroidx/compose/material3/NavigationDrawerItemColors;", "colors", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "NavigationDrawerItem", "(Lr6/e;ZLr6/a;Landroidx/compose/ui/Modifier;Lr6/e;Lr6/e;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "a", "b", "pos", "calculateFraction", "(FFF)F", "open", "onClose", "fraction", TypedValues.Custom.S_COLOR, "Scrim-Bx497Mc", "(ZLr6/a;Lr6/a;JLandroidx/compose/runtime/Composer;I)V", "Scrim", "DrawerPositionalThreshold", "F", "DrawerVelocityThreshold", "MinimumDrawerWidth", "Landroidx/compose/animation/core/TweenSpec;", "AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "anchorsInitialized", "minValue", "material3_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nNavigationDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 5 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1167:1\n1223#2,6:1168\n1223#2,3:1179\n1226#2,3:1185\n1223#2,6:1191\n1223#2,6:1197\n1223#2,6:1203\n1223#2,6:1287\n1223#2,6:1293\n1223#2,6:1299\n1223#2,6:1305\n1223#2,6:1311\n1223#2,6:1352\n1223#2,6:1359\n1223#2,3:1370\n1226#2,3:1376\n1223#2,6:1418\n1223#2,6:1455\n1223#2,6:1631\n1223#2,6:1639\n1223#2,6:1645\n1223#2,6:1651\n488#3:1174\n487#3,4:1175\n491#3,2:1182\n495#3:1188\n488#3:1365\n487#3,4:1366\n491#3,2:1373\n495#3:1379\n487#4:1184\n487#4:1375\n234#5:1189\n234#5:1380\n234#5:1630\n237#5:1638\n77#6:1190\n77#6:1209\n77#6:1358\n77#6:1381\n77#6:1637\n71#7:1210\n68#7,6:1211\n74#7:1245\n71#7:1246\n67#7,7:1247\n74#7:1282\n78#7:1286\n78#7:1351\n71#7:1382\n68#7,6:1383\n74#7:1417\n71#7:1461\n68#7,6:1462\n74#7:1496\n78#7:1500\n71#7:1501\n67#7,7:1502\n74#7:1537\n78#7:1541\n78#7:1548\n71#7:1585\n67#7,7:1586\n74#7:1621\n78#7:1625\n78#8,6:1217\n85#8,4:1232\n89#8,2:1242\n78#8,6:1254\n85#8,4:1269\n89#8,2:1279\n93#8:1285\n78#8,6:1317\n85#8,4:1332\n89#8,2:1342\n93#8:1347\n93#8:1350\n78#8,6:1389\n85#8,4:1404\n89#8,2:1414\n78#8:1424\n76#8,8:1425\n85#8,4:1442\n89#8,2:1452\n78#8,6:1468\n85#8,4:1483\n89#8,2:1493\n93#8:1499\n78#8,6:1509\n85#8,4:1524\n89#8,2:1534\n93#8:1540\n93#8:1544\n93#8:1547\n78#8,6:1556\n85#8,4:1571\n89#8,2:1581\n78#8,6:1593\n85#8,4:1608\n89#8,2:1618\n93#8:1624\n93#8:1628\n368#9,9:1223\n377#9:1244\n368#9,9:1260\n377#9:1281\n378#9,2:1283\n368#9,9:1323\n377#9,3:1344\n378#9,2:1348\n368#9,9:1395\n377#9:1416\n368#9,9:1433\n377#9:1454\n368#9,9:1474\n377#9:1495\n378#9,2:1497\n368#9,9:1515\n377#9:1536\n378#9,2:1538\n378#9,2:1542\n378#9,2:1545\n368#9,9:1562\n377#9:1583\n368#9,9:1599\n377#9:1620\n378#9,2:1622\n378#9,2:1626\n4032#10,6:1236\n4032#10,6:1273\n4032#10,6:1336\n4032#10,6:1408\n4032#10,6:1446\n4032#10,6:1487\n4032#10,6:1528\n4032#10,6:1575\n4032#10,6:1612\n98#11:1549\n95#11,6:1550\n101#11:1584\n105#11:1629\n81#12:1657\n107#12,2:1658\n81#12:1663\n107#12,2:1664\n76#13:1660\n109#13,2:1661\n148#14:1666\n148#14:1667\n*S KotlinDebug\n*F\n+ 1 NavigationDrawer.kt\nandroidx/compose/material3/NavigationDrawerKt\n*L\n287#1:1168,6\n322#1:1179,3\n322#1:1185,3\n325#1:1191,6\n326#1:1197,6\n329#1:1203,6\n345#1:1287,6\n353#1:1293,6\n359#1:1299,6\n371#1:1305,6\n386#1:1311,6\n445#1:1352,6\n447#1:1359,6\n449#1:1370,3\n449#1:1376,3\n484#1:1418,6\n464#1:1455,6\n751#1:1631,6\n1146#1:1639,6\n1147#1:1645,6\n1158#1:1651,6\n322#1:1174\n322#1:1175,4\n322#1:1182,2\n322#1:1188\n449#1:1365\n449#1:1366,4\n449#1:1373,2\n449#1:1379\n322#1:1184\n449#1:1375\n323#1:1189\n450#1:1380\n747#1:1630\n1143#1:1638\n324#1:1190\n331#1:1209\n446#1:1358\n452#1:1381\n771#1:1637\n332#1:1210\n332#1:1211,6\n332#1:1245\n342#1:1246\n342#1:1247,7\n342#1:1282\n342#1:1286\n332#1:1351\n453#1:1382\n453#1:1383,6\n453#1:1417\n463#1:1461\n463#1:1462,6\n463#1:1496\n463#1:1500\n482#1:1501\n482#1:1502,7\n482#1:1537\n482#1:1541\n453#1:1548\n541#1:1585\n541#1:1586,7\n541#1:1621\n541#1:1625\n332#1:1217,6\n332#1:1232,4\n332#1:1242,2\n342#1:1254,6\n342#1:1269,4\n342#1:1279,2\n342#1:1285\n356#1:1317,6\n356#1:1332,4\n356#1:1342,2\n356#1:1347\n332#1:1350\n453#1:1389,6\n453#1:1404,4\n453#1:1414,2\n461#1:1424\n461#1:1425,8\n461#1:1442,4\n461#1:1452,2\n463#1:1468,6\n463#1:1483,4\n463#1:1493,2\n463#1:1499\n482#1:1509,6\n482#1:1524,4\n482#1:1534,2\n482#1:1540\n461#1:1544\n453#1:1547\n539#1:1556,6\n539#1:1571,4\n539#1:1581,2\n541#1:1593,6\n541#1:1608,4\n541#1:1618,2\n541#1:1624\n539#1:1628\n332#1:1223,9\n332#1:1244\n342#1:1260,9\n342#1:1281\n342#1:1283,2\n356#1:1323,9\n356#1:1344,3\n332#1:1348,2\n453#1:1395,9\n453#1:1416\n461#1:1433,9\n461#1:1454\n463#1:1474,9\n463#1:1495\n463#1:1497,2\n482#1:1515,9\n482#1:1536\n482#1:1538,2\n461#1:1542,2\n453#1:1545,2\n539#1:1562,9\n539#1:1583\n541#1:1599,9\n541#1:1620\n541#1:1622,2\n539#1:1626,2\n332#1:1236,6\n342#1:1273,6\n356#1:1336,6\n453#1:1408,6\n461#1:1446,6\n463#1:1487,6\n482#1:1528,6\n539#1:1575,6\n541#1:1612,6\n539#1:1549\n539#1:1550,6\n539#1:1584\n539#1:1629\n325#1:1657\n325#1:1658,2\n445#1:1663\n445#1:1664,2\n326#1:1660\n326#1:1661,2\n1162#1:1666\n1163#1:1667\n*E\n"})
/* loaded from: classes.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = C2331Dp.m13305constructorimpl(400);
    private static final float MinimumDrawerWidth = C2331Dp.m13305constructorimpl(240);

    @NotNull
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);

    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8683DismissibleDrawerSheetSnr_uVM(@org.jetbrains.annotations.NotNull final androidx.compose.material3.DrawerState r27, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r29, long r30, long r32, float r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m8683DismissibleDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8684DismissibleDrawerSheetafqeVBk(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r25, long r26, long r28, float r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m8684DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012f  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DismissibleNavigationDrawer(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r25, @org.jetbrains.annotations.Nullable androidx.compose.material3.DrawerState r26, boolean r27, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r28, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 911
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(r6.e, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissibleNavigationDrawer$lambda$17(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: DrawerSheet-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8685DrawerSheet7zSek6w(@org.jetbrains.annotations.Nullable final androidx.compose.material3.DrawerPredictiveBackState r27, @org.jetbrains.annotations.NotNull final androidx.compose.foundation.layout.WindowInsets r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r29, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r30, long r31, long r33, float r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m8685DrawerSheet7zSek6w(androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8686ModalDrawerSheetSnr_uVM(@org.jetbrains.annotations.NotNull final androidx.compose.material3.DrawerState r27, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r28, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r29, long r30, long r32, float r34, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r35, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r36, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m8686ModalDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8687ModalDrawerSheetafqeVBk(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r25, long r26, long r28, float r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m8687ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8688ModalNavigationDrawerFHprtrg(@org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r27, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r28, @org.jetbrains.annotations.Nullable androidx.compose.material3.DrawerState r29, boolean r30, long r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r33, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m8688ModalNavigationDrawerFHprtrg(r6.e, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, r6.e, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalNavigationDrawer_FHprtrg$lambda$3(MutableState<Boolean> mutableState, boolean z8) {
        mutableState.setValue(Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationDrawerItem(@org.jetbrains.annotations.NotNull final p152r6.InterfaceC6473e r32, final boolean r33, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6469a r34, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r35, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r36, @org.jetbrains.annotations.Nullable p152r6.InterfaceC6473e r37, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r38, @org.jetbrains.annotations.Nullable androidx.compose.material3.NavigationDrawerItemColors r39, @org.jetbrains.annotations.Nullable androidx.compose.foundation.interaction.MutableInteractionSource r40, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(r6.e, boolean, r6.a, androidx.compose.ui.Modifier, r6.e, r6.e, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m8689PermanentDrawerSheetafqeVBk(@org.jetbrains.annotations.Nullable androidx.compose.p011ui.Modifier r24, @org.jetbrains.annotations.Nullable androidx.compose.p011ui.graphics.Shape r25, long r26, long r28, float r30, @org.jetbrains.annotations.Nullable androidx.compose.foundation.layout.WindowInsets r31, @org.jetbrains.annotations.NotNull final p152r6.InterfaceC6474f r32, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m8689PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, r6.f, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void PermanentNavigationDrawer(@NotNull final InterfaceC6473e interfaceC6473e, @Nullable Modifier modifier, @NotNull final InterfaceC6473e interfaceC6473e2, @Nullable Composer composer, final int i, final int i8) {
        int i9;
        Composer composerStartRestartGroup = composer.startRestartGroup(-276843608);
        if ((i8 & 1) != 0) {
            i9 = i | 6;
        } else if ((i & 6) == 0) {
            i9 = (composerStartRestartGroup.changedInstance(interfaceC6473e) ? 4 : 2) | i;
        } else {
            i9 = i;
        }
        int i10 = i8 & 2;
        if (i10 != 0) {
            i9 |= 48;
        } else if ((i & 48) == 0) {
            i9 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i8 & 4) != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(interfaceC6473e2) ? 256 : 128;
        }
        if ((i9 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i10 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-276843608, i9, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:537)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            InterfaceC6473e interfaceC6473eM917r = AbstractC0584a.m917r(companion2, composerM10109constructorimpl, measurePolicyRowMeasurePolicy, composerM10109constructorimpl, currentCompositionLocalMap);
            if (composerM10109constructorimpl.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                AbstractC0584a.m918s(currentCompositeKeyHash, composerM10109constructorimpl, currentCompositeKeyHash, interfaceC6473eM917r);
            }
            Updater.m10116setimpl(composerM10109constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            interfaceC6473e.invoke(composerStartRestartGroup, Integer.valueOf(i9 & 14));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            InterfaceC6473e interfaceC6473eM917r2 = AbstractC0584a.m917r(companion2, composerM10109constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM10109constructorimpl2, currentCompositionLocalMap2);
            if (composerM10109constructorimpl2.getInserting() || !AbstractC5830k.m5325b(composerM10109constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                AbstractC0584a.m918s(currentCompositeKeyHash2, composerM10109constructorimpl2, currentCompositeKeyHash2, interfaceC6473eM917r2);
            }
            Updater.m10116setimpl(composerM10109constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            interfaceC6473e2.invoke(composerStartRestartGroup, Integer.valueOf((i9 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i11) {
                    NavigationDrawerKt.PermanentNavigationDrawer(interfaceC6473e, modifier2, interfaceC6473e2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i8);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m8690ScrimBx497Mc(final boolean z8, final InterfaceC6469a interfaceC6469a, final InterfaceC6469a interfaceC6469a2, final long j7, Composer composer, final int i) {
        int i8;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(2106487387);
        if ((i & 6) == 0) {
            i8 = (composerStartRestartGroup.changed(z8) ? 4 : 2) | i;
        } else {
            i8 = i;
        }
        if ((i & 48) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i8 |= composerStartRestartGroup.changedInstance(interfaceC6469a2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i8 |= composerStartRestartGroup.changed(j7) ? 2048 : 1024;
        }
        if ((i8 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i8, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1141)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            final String strM9393getString2EP1pXo = Strings_androidKt.m9393getString2EP1pXo(Strings.m9323constructorimpl(C2075R.string.close_drawer), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1784743395);
            if (z8) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                int i9 = i8 & 112;
                boolean z9 = i9 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(interfaceC6469a, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierThen = companion2.then(new SuspendPointerInputElement(interfaceC6469a, null, null, new C2142xe3d9cdbd((InterfaceC6473e) objRememberedValue), 6, null));
                boolean zChanged = (i9 == 32) | composerStartRestartGroup.changed(strM9393getString2EP1pXo);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // p152r6.InterfaceC6471c
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((SemanticsPropertyReceiver) obj);
                            return C5443s.f8405a;
                        }

                        public final void invoke(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM9393getString2EP1pXo);
                            final InterfaceC6469a interfaceC6469a3 = interfaceC6469a;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new InterfaceC6469a() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                {
                                    super(0);
                                }

                                @Override // p152r6.InterfaceC6469a
                                @NotNull
                                public final Boolean invoke() {
                                    interfaceC6469a3.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifierSemantics = SemanticsModifierKt.semantics(modifierThen, true, (InterfaceC6471c) objRememberedValue2);
            } else {
                modifierSemantics = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            boolean z10 = ((i8 & 7168) == 2048) | ((i8 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((DrawScope) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull DrawScope drawScope) {
                        DrawScope.m11227drawRectnJ9OG0$default(drawScope, j7, 0L, 0L, ((Number) interfaceC6469a2.invoke()).floatValue(), null, null, 0, 118, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CanvasKt.Canvas(modifierThen2, (InterfaceC6471c) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new InterfaceC6473e() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p152r6.InterfaceC6473e
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return C5443s.f8405a;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    NavigationDrawerKt.m8690ScrimBx497Mc(z8, interfaceC6469a, interfaceC6469a2, j7, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f, float f7, float f8) {
        return AbstractC5806u.m5273l((f8 - f) / (f7 - f), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM10510getWidthimpl = Size.m10510getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM10510getWidthimpl) || fM10510getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return ((drawerPredictiveBackState.getScaleXDistance() * (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? 1 : -1)) / fM10510getWidthimpl) + 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM10507getHeightimpl = Size.m10507getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM10507getHeightimpl) || fM10507getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / fM10507getHeightimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier predictiveBackDrawerChild(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z8) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationDrawerKt.predictiveBackDrawerChild.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
                float fCalculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState);
                graphicsLayerScope.setScaleX(fCalculatePredictiveBackScaleX == 0.0f ? 1.0f : NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState) / fCalculatePredictiveBackScaleX);
                graphicsLayerScope.mo10874setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z8 ? 0.0f : 1.0f, 0.0f));
            }
        });
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z8) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationDrawerKt.predictiveBackDrawerContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((GraphicsLayerScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setScaleX(NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.setScaleY(NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.mo10874setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z8 ? 1.0f : 0.0f, 0.5f));
            }
        });
    }

    @Composable
    @NotNull
    public static final DrawerState rememberDrawerState(@NotNull final DrawerValue drawerValue, @Nullable final InterfaceC6471c interfaceC6471c, @Nullable Composer composer, int i, int i8) {
        if ((i8 & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.material3.NavigationDrawerKt.rememberDrawerState.1
                @Override // p152r6.InterfaceC6471c
                @NotNull
                public final Boolean invoke(@NotNull DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(interfaceC6471c);
        boolean z8 = ((((i & 14) ^ 6) > 4 && composer.changed(drawerValue)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && composer.changed(interfaceC6471c)) || (i & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z8 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InterfaceC6469a() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                @NotNull
                public final DrawerState invoke() {
                    return new DrawerState(drawerValue, interfaceC6471c);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m10224rememberSaveable(objArr, (Saver) Saver, (String) null, (InterfaceC6469a) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState;
    }
}
