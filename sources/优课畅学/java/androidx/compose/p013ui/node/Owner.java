package androidx.compose.p013ui.node;

import android.view.KeyEvent;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.collection.IntObjectMap;
import androidx.compose.p013ui.InternalComposeUiApi;
import androidx.compose.p013ui.autofill.Autofill;
import androidx.compose.p013ui.autofill.AutofillManager;
import androidx.compose.p013ui.autofill.AutofillTree;
import androidx.compose.p013ui.draganddrop.DragAndDropManager;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.focus.FocusOwner;
import androidx.compose.p013ui.graphics.GraphicsContext;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.hapticfeedback.HapticFeedback;
import androidx.compose.p013ui.input.InputModeManager;
import androidx.compose.p013ui.input.pointer.PointerIconService;
import androidx.compose.p013ui.input.pointer.PositionCalculator;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.layout.PlaceableKt;
import androidx.compose.p013ui.modifier.ModifierLocalManager;
import androidx.compose.p013ui.platform.AccessibilityManager;
import androidx.compose.p013ui.platform.Clipboard;
import androidx.compose.p013ui.platform.ClipboardManager;
import androidx.compose.p013ui.platform.SoftwareKeyboardController;
import androidx.compose.p013ui.platform.TextToolbar;
import androidx.compose.p013ui.platform.ViewConfiguration;
import androidx.compose.p013ui.platform.WindowInfo;
import androidx.compose.p013ui.semantics.SemanticsOwner;
import androidx.compose.p013ui.spatial.RectManager;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.input.TextInputService;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import kotlin.coroutines.InterfaceC9100d;
import p123h7.InterfaceC8721a;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

/* loaded from: classes2.dex */
public interface Owner extends PositionCalculator {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static boolean enableExtraAssertions;

        private Companion() {
        }

        public final boolean getEnableExtraAssertions() {
            return enableExtraAssertions;
        }

        public final void setEnableExtraAssertions(boolean z10) {
            enableExtraAssertions = z10;
        }
    }

    public interface OnLayoutCompletedListener {
        void onLayoutComplete();
    }

    static /* synthetic */ OwnedLayer createLayer$default(Owner owner, InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a, GraphicsLayer graphicsLayer, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            graphicsLayer = null;
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return owner.createLayer(interfaceC10574p, interfaceC10559a, graphicsLayer, z10);
    }

    static /* synthetic */ void forceMeasureTheSubtree$default(Owner owner, LayoutNode layoutNode, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        owner.forceMeasureTheSubtree(layoutNode, z10);
    }

    @InterfaceC8721a
    static /* synthetic */ void getFontLoader$annotations() {
    }

    static /* synthetic */ void measureAndLayout$default(Owner owner, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        owner.measureAndLayout(z10);
    }

    static /* synthetic */ void onRequestMeasure$default(Owner owner, LayoutNode layoutNode, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        owner.onRequestMeasure(layoutNode, z10, z11, z12);
    }

    static /* synthetic */ void onRequestRelayout$default(Owner owner, LayoutNode layoutNode, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        owner.onRequestRelayout(layoutNode, z10, z11);
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U, reason: not valid java name */
    long mo25966calculateLocalPositionMKHz9U(long j10);

    /* renamed from: calculatePositionInWindow-MK-Hz9U, reason: not valid java name */
    long mo25967calculatePositionInWindowMKHz9U(long j10);

    OwnedLayer createLayer(InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a, GraphicsLayer graphicsLayer, boolean z10);

    default void decrementSensitiveComponentCount() {
    }

    void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z10);

    AccessibilityManager getAccessibilityManager();

    Autofill getAutofill();

    AutofillManager getAutofillManager();

    AutofillTree getAutofillTree();

    Clipboard getClipboard();

    ClipboardManager getClipboardManager();

    InterfaceC9100d getCoroutineContext();

    Density getDensity();

    DragAndDropManager getDragAndDropManager();

    /* renamed from: getFocusDirection-P8AzH3I, reason: not valid java name */
    FocusDirection mo25968getFocusDirectionP8AzH3I(KeyEvent keyEvent);

    FocusOwner getFocusOwner();

    FontFamily.Resolver getFontFamilyResolver();

    Font.ResourceLoader getFontLoader();

    GraphicsContext getGraphicsContext();

    HapticFeedback getHapticFeedBack();

    InputModeManager getInputModeManager();

    LayoutDirection getLayoutDirection();

    IntObjectMap<LayoutNode> getLayoutNodes();

    long getMeasureIteration();

    ModifierLocalManager getModifierLocalManager();

    default Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    PointerIconService getPointerIconService();

    RectManager getRectManager();

    LayoutNode getRoot();

    RootForTest getRootForTest();

    SemanticsOwner getSemanticsOwner();

    LayoutNodeDrawScope getSharedDrawScope();

    boolean getShowLayoutBounds();

    OwnerSnapshotObserver getSnapshotObserver();

    SoftwareKeyboardController getSoftwareKeyboardController();

    TextInputService getTextInputService();

    TextToolbar getTextToolbar();

    ViewConfiguration getViewConfiguration();

    WindowInfo getWindowInfo();

    default void incrementSensitiveComponentCount() {
    }

    void measureAndLayout(boolean z10);

    /* renamed from: measureAndLayout-0kLqBqw, reason: not valid java name */
    void mo25969measureAndLayout0kLqBqw(LayoutNode layoutNode, long j10);

    void onDetach(LayoutNode layoutNode);

    void onEndApplyChanges();

    @InternalComposeUiApi
    void onInteropViewLayoutChange(View view);

    void onLayoutChange(LayoutNode layoutNode);

    void onLayoutNodeDeactivated(LayoutNode layoutNode);

    void onPostAttach(LayoutNode layoutNode);

    default void onPostLayoutNodeReused(LayoutNode layoutNode, int i10) {
    }

    void onPreAttach(LayoutNode layoutNode);

    default void onPreLayoutNodeReused(LayoutNode layoutNode, int i10) {
    }

    void onRequestMeasure(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12);

    void onRequestRelayout(LayoutNode layoutNode, boolean z10, boolean z11);

    void onSemanticsChange();

    void registerOnEndApplyChangesListener(InterfaceC10559a interfaceC10559a);

    void registerOnLayoutCompletedListener(OnLayoutCompletedListener onLayoutCompletedListener);

    void requestAutofill(LayoutNode layoutNode);

    boolean requestFocus();

    void requestOnPositionedCallback(LayoutNode layoutNode);

    @InternalCoreApi
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    void setShowLayoutBounds(boolean z10);

    Object textInputSession(InterfaceC10574p interfaceC10574p, InterfaceC9324c<?> interfaceC9324c);
}
