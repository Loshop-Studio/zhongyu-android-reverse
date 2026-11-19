package androidx.compose.p011ui.node;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.autofill.HintConstants;
import androidx.collection.IntObjectMap;
import androidx.compose.p011ui.InternalComposeUiApi;
import androidx.compose.p011ui.autofill.Autofill;
import androidx.compose.p011ui.autofill.AutofillManager;
import androidx.compose.p011ui.autofill.AutofillTree;
import androidx.compose.p011ui.draganddrop.DragAndDropManager;
import androidx.compose.p011ui.focus.FocusDirection;
import androidx.compose.p011ui.focus.FocusOwner;
import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.input.InputModeManager;
import androidx.compose.p011ui.input.pointer.PointerIconService;
import androidx.compose.p011ui.input.pointer.PositionCalculator;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.PlaceableKt;
import androidx.compose.p011ui.modifier.ModifierLocalManager;
import androidx.compose.p011ui.platform.AccessibilityManager;
import androidx.compose.p011ui.platform.Clipboard;
import androidx.compose.p011ui.platform.ClipboardManager;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.platform.TextToolbar;
import androidx.compose.p011ui.platform.ViewConfiguration;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.semantics.SemanticsOwner;
import androidx.compose.p011ui.spatial.RectManager;
import androidx.compose.p011ui.text.font.Font;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.input.TextInputService;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0090\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 ß\u00012\u00020\u0001:\u0004ß\u0001à\u0001J5\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013H&ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u001d\u0010\u000eJ\u0019\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u0004H&¢\u0006\u0004\b\u001f\u0010 J\"\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H&ø\u0001\u0000¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b%\u0010&Jm\u00104\u001a\u00020328\u0010.\u001a4\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0015\u0012\u0013\u0018\u00010,¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\b0'2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\b0/2\n\b\u0002\u00101\u001a\u0004\u0018\u00010,2\b\b\u0002\u00102\u001a\u00020\u0004H&¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\bH&¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b8\u0010\u000eJ\u0017\u00109\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b9\u0010\u000eJ\u001f\u0010<\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J\u001b\u0010B\u001a\u00020\b2\n\u0010A\u001a\u00060?j\u0002`@H'¢\u0006\u0004\bB\u0010CJ\u001c\u0010I\u001a\u0004\u0018\u00010F2\u0006\u0010E\u001a\u00020DH&ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001d\u0010K\u001a\u00020\b2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0/H&¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\bH&¢\u0006\u0004\bM\u00107J\u0017\u0010O\u001a\u00020\b2\u0006\u0010J\u001a\u00020NH&¢\u0006\u0004\bO\u0010PJ9\u0010W\u001a\u00020S2'\u0010V\u001a#\b\u0001\u0012\u0004\u0012\u00020Q\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R\u0012\u0006\u0012\u0004\u0018\u00010T0'¢\u0006\u0002\bUH¦@¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\bH\u0016¢\u0006\u0004\bY\u00107J\u000f\u0010Z\u001a\u00020\bH\u0016¢\u0006\u0004\bZ\u00107R\u001a\u0010_\u001a\u00020[8&X§\u0004¢\u0006\f\u0012\u0004\b^\u00107\u001a\u0004\b\\\u0010]R\u0014\u0010b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00020c8&X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010j\u001a\u00020g8&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010n\u001a\u00020k8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010v\u001a\u00020s8&X¦\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010z\u001a\u00020w8&X¦\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8&X¦\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0017\u0010\u0082\u0001\u001a\u00020\u007f8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0087\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008e\u0001\u001a\u00030\u008b\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¦\u0001\u001a\u00030£\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0018\u0010ª\u0001\u001a\u00030§\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010®\u0001\u001a\u00030«\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010²\u0001\u001a\u00030¯\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010º\u0001\u001a\u00030·\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R(\u0010Â\u0001\u001a\u00020\u00042\u0007\u0010¿\u0001\u001a\u00020\u00048&@gX¦\u000e¢\u0006\u000e\u001a\u0005\bÀ\u0001\u0010\u001c\"\u0005\bÁ\u0001\u0010 R\u0018\u0010Æ\u0001\u001a\u00030Ã\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0018\u0010Ê\u0001\u001a\u00030Ç\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ò\u0001\u001a\u00030Ï\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ó\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u0018\u0010Ú\u0001\u001a\u00030×\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bØ\u0001\u0010Ù\u0001R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018&X¦\u0004¢\u0006\b\u001a\u0006\bÜ\u0001\u0010Ý\u0001ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006á\u0001À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "", "affectsLookahead", "forceRequest", "scheduleMeasureAndLayout", "Ld6/s;", "onRequestMeasure", "(Landroidx/compose/ui/node/LayoutNode;ZZZ)V", "onRequestRelayout", "(Landroidx/compose/ui/node/LayoutNode;ZZ)V", "requestOnPositionedCallback", "(Landroidx/compose/ui/node/LayoutNode;)V", "node", "onPreAttach", "onPostAttach", "onDetach", "Landroidx/compose/ui/geometry/Offset;", "localPosition", "calculatePositionInWindow-MK-Hz9U", "(J)J", "calculatePositionInWindow", "positionInWindow", "calculateLocalPosition-MK-Hz9U", "calculateLocalPosition", "requestFocus", "()Z", "requestAutofill", "sendPointerUpdate", "measureAndLayout", "(Z)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "measureAndLayout-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)V", "forceMeasureTheSubtree", "(Landroidx/compose/ui/node/LayoutNode;Z)V", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "explicitLayer", "forceUseOldLayers", "Landroidx/compose/ui/node/OwnedLayer;", "createLayer", "(Lr6/e;Lr6/a;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Z)Landroidx/compose/ui/node/OwnedLayer;", "onSemanticsChange", "()V", "onLayoutChange", "onLayoutNodeDeactivated", "", "oldSemanticsId", "onPreLayoutNodeReused", "(Landroidx/compose/ui/node/LayoutNode;I)V", "onPostLayoutNodeReused", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "view", "onInteropViewLayoutChange", "(Landroid/view/View;)V", "Landroidx/compose/ui/input/key/KeyEvent;", "keyEvent", "Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection-P8AzH3I", "(Landroid/view/KeyEvent;)Landroidx/compose/ui/focus/FocusDirection;", "getFocusDirection", "listener", "registerOnEndApplyChangesListener", "(Lr6/a;)V", "onEndApplyChanges", "Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "registerOnLayoutCompletedListener", "(Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;)V", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lh6/c;", "", "", "Lkotlin/ExtensionFunctionType;", "session", "textInputSession", "(Lr6/e;Lh6/c;)Ljava/lang/Object;", "incrementSensitiveComponentCount", "decrementSensitiveComponentCount", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getFontLoader$annotations", "fontLoader", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/collection/IntObjectMap;", "getLayoutNodes", "()Landroidx/collection/IntObjectMap;", "layoutNodes", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "getSharedDrawScope", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "sharedDrawScope", "Landroidx/compose/ui/node/RootForTest;", "getRootForTest", "()Landroidx/compose/ui/node/RootForTest;", "rootForTest", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "hapticFeedBack", "Landroidx/compose/ui/input/InputModeManager;", "getInputModeManager", "()Landroidx/compose/ui/input/InputModeManager;", "inputModeManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager", "()Landroidx/compose/ui/platform/ClipboardManager;", "clipboardManager", "Landroidx/compose/ui/platform/Clipboard;", "getClipboard", "()Landroidx/compose/ui/platform/Clipboard;", "clipboard", "Landroidx/compose/ui/platform/AccessibilityManager;", "getAccessibilityManager", "()Landroidx/compose/ui/platform/AccessibilityManager;", "accessibilityManager", "Landroidx/compose/ui/graphics/GraphicsContext;", "getGraphicsContext", "()Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "textToolbar", "Landroidx/compose/ui/autofill/AutofillTree;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "autofillTree", "Landroidx/compose/ui/autofill/Autofill;", "getAutofill", "()Landroidx/compose/ui/autofill/Autofill;", "autofill", "Landroidx/compose/ui/autofill/AutofillManager;", "getAutofillManager", "()Landroidx/compose/ui/autofill/AutofillManager;", "autofillManager", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputService", "()Landroidx/compose/ui/text/input/TextInputService;", "textInputService", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/SoftwareKeyboardController;", "softwareKeyboardController", "Landroidx/compose/ui/input/pointer/PointerIconService;", "getPointerIconService", "()Landroidx/compose/ui/input/pointer/PointerIconService;", "pointerIconService", "Landroidx/compose/ui/semantics/SemanticsOwner;", "getSemanticsOwner", "()Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroidx/compose/ui/focus/FocusOwner;", "getFocusOwner", "()Landroidx/compose/ui/focus/FocusOwner;", "focusOwner", "Landroidx/compose/ui/platform/WindowInfo;", "getWindowInfo", "()Landroidx/compose/ui/platform/WindowInfo;", "windowInfo", "Landroidx/compose/ui/spatial/RectManager;", "getRectManager", "()Landroidx/compose/ui/spatial/RectManager;", "rectManager", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getFontFamilyResolver", "()Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "<set-?>", "getShowLayoutBounds", "setShowLayoutBounds", "showLayoutBounds", "", "getMeasureIteration", "()J", "measureIteration", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Landroidx/compose/ui/modifier/ModifierLocalManager;", "getModifierLocalManager", "()Landroidx/compose/ui/modifier/ModifierLocalManager;", "modifierLocalManager", "Lh6/h;", "getCoroutineContext", "()Lh6/h;", "coroutineContext", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getPlacementScope", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/compose/ui/draganddrop/DragAndDropManager;", "getDragAndDropManager", "()Landroidx/compose/ui/draganddrop/DragAndDropManager;", "dragAndDropManager", "Companion", "OnLayoutCompletedListener", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface Owner extends PositionCalculator {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Landroidx/compose/ui/node/Owner$Companion;", "", "()V", "enableExtraAssertions", "", "getEnableExtraAssertions", "()Z", "setEnableExtraAssertions", "(Z)V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z8) {
            enableExtraAssertions = z8;
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/node/Owner$OnLayoutCompletedListener;", "", "Ld6/s;", "onLayoutComplete", "()V", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static /* synthetic */ OwnedLayer createLayer$default(Owner owner, InterfaceC6473e interfaceC6473e, InterfaceC6469a interfaceC6469a, GraphicsLayer graphicsLayer, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i & 4) != 0) {
            graphicsLayer = null;
        }
        if ((i & 8) != 0) {
            z8 = false;
        }
        return owner.createLayer(interfaceC6473e, interfaceC6469a, graphicsLayer, z8);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z8);
    }

    @Deprecated(message = "fontLoader is deprecated, use fontFamilyResolver", replaceWith = @ReplaceWith(expression = "fontFamilyResolver", imports = {}))
    static /* synthetic */ void getFontLoader$annotations() {
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i & 1) != 0) {
            z8 = true;
        }
        owner.measureAndLayout(z8);
    }

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z8, boolean z9, boolean z10, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        if ((i & 8) != 0) {
            z10 = true;
        }
        owner.onRequestMeasure(layoutNode, z8, z9, z10);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z8, boolean z9, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i & 2) != 0) {
            z8 = false;
        }
        if ((i & 4) != 0) {
            z9 = false;
        }
        owner.onRequestRelayout(layoutNode, z8, z9);
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo12372calculateLocalPositionMKHz9U(long positionInWindow);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo12373calculatePositionInWindowMKHz9U(long localPosition);

    @NotNull
    OwnedLayer createLayer(@NotNull InterfaceC6473e drawBlock, @NotNull InterfaceC6469a invalidateParentLayer, @Nullable GraphicsLayer explicitLayer, boolean forceUseOldLayers);

    default void decrementSensitiveComponentCount() {
    }

    void forceMeasureTheSubtree(@NotNull LayoutNode layoutNode, boolean affectsLookahead);

    @NotNull
    AccessibilityManager getAccessibilityManager();

    @Nullable
    Autofill getAutofill();

    @Nullable
    AutofillManager getAutofillManager();

    @NotNull
    AutofillTree getAutofillTree();

    @NotNull
    Clipboard getClipboard();

    @NotNull
    ClipboardManager getClipboardManager();

    @NotNull
    InterfaceC5636h getCoroutineContext();

    @NotNull
    Density getDensity();

    @NotNull
    DragAndDropManager getDragAndDropManager();

    @Nullable
    /* renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    FocusDirection mo12374getFocusDirectionP8AzH3I(@NotNull KeyEvent keyEvent);

    @NotNull
    FocusOwner getFocusOwner();

    @NotNull
    FontFamily.Resolver getFontFamilyResolver();

    @NotNull
    Font.ResourceLoader getFontLoader();

    @NotNull
    GraphicsContext getGraphicsContext();

    @NotNull
    HapticFeedback getHapticFeedBack();

    @NotNull
    InputModeManager getInputModeManager();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    IntObjectMap<LayoutNode> getLayoutNodes();

    long getMeasureIteration();

    @NotNull
    ModifierLocalManager getModifierLocalManager();

    @NotNull
    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @NotNull
    PointerIconService getPointerIconService();

    @NotNull
    RectManager getRectManager();

    @NotNull
    LayoutNode getRoot();

    @NotNull
    RootForTest getRootForTest();

    @NotNull
    SemanticsOwner getSemanticsOwner();

    @NotNull
    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    @NotNull
    OwnerSnapshotObserver getSnapshotObserver();

    @NotNull
    SoftwareKeyboardController getSoftwareKeyboardController();

    @NotNull
    TextInputService getTextInputService();

    @NotNull
    TextToolbar getTextToolbar();

    @NotNull
    ViewConfiguration getViewConfiguration();

    @NotNull
    WindowInfo getWindowInfo();

    default void incrementSensitiveComponentCount() {
    }

    void measureAndLayout(boolean sendPointerUpdate);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo12375measureAndLayout0kLqBqw(@NotNull LayoutNode layoutNode, long constraints);

    void onDetach(@NotNull LayoutNode node);

    void onEndApplyChanges();

    @InternalComposeUiApi
    void onInteropViewLayoutChange(@NotNull View view);

    void onLayoutChange(@NotNull LayoutNode layoutNode);

    void onLayoutNodeDeactivated(@NotNull LayoutNode layoutNode);

    void onPostAttach(@NotNull LayoutNode node);

    default void onPostLayoutNodeReused(@NotNull LayoutNode layoutNode, int oldSemanticsId) {
    }

    void onPreAttach(@NotNull LayoutNode node);

    default void onPreLayoutNodeReused(@NotNull LayoutNode layoutNode, int oldSemanticsId) {
    }

    void onRequestMeasure(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest, boolean scheduleMeasureAndLayout);

    void onRequestRelayout(@NotNull LayoutNode layoutNode, boolean affectsLookahead, boolean forceRequest);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(@NotNull InterfaceC6469a listener);

    void registerOnLayoutCompletedListener(@NotNull OnLayoutCompletedListener listener);

    void requestAutofill(@NotNull LayoutNode node);

    boolean requestFocus();

    void requestOnPositionedCallback(@NotNull LayoutNode layoutNode);

    @InternalCoreApi
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void setShowLayoutBounds(boolean z8);

    @Nullable
    Object textInputSession(@NotNull InterfaceC6473e interfaceC6473e, @NotNull InterfaceC5631c<?> interfaceC5631c);
}
