package androidx.compose.p014ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.SessionMutex;
import androidx.compose.p014ui.autofill.AbstractC2646c;
import androidx.compose.p014ui.autofill.AbstractC2648d;
import androidx.compose.p014ui.autofill.AndroidAutofill;
import androidx.compose.p014ui.autofill.AndroidAutofillManager;
import androidx.compose.p014ui.autofill.AndroidAutofill_androidKt;
import androidx.compose.p014ui.autofill.Autofill;
import androidx.compose.p014ui.autofill.AutofillCallback;
import androidx.compose.p014ui.autofill.AutofillTree;
import androidx.compose.p014ui.autofill.PlatformAutofillManagerImpl;
import androidx.compose.p014ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.p014ui.draganddrop.AndroidDragAndDropManager;
import androidx.compose.p014ui.draganddrop.ComposeDragShadowBuilder;
import androidx.compose.p014ui.draganddrop.DragAndDropTransferData;
import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.p014ui.focus.FocusOwner;
import androidx.compose.p014ui.focus.FocusOwnerImpl;
import androidx.compose.p014ui.focus.FocusOwnerImplKt;
import androidx.compose.p014ui.focus.FocusTargetNode;
import androidx.compose.p014ui.focus.FocusTraversalKt;
import androidx.compose.p014ui.focus.TwoDimensionalFocusSearchKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.p014ui.graphics.CanvasHolder;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.Matrix;
import androidx.compose.p014ui.graphics.RectHelper_androidKt;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.hapticfeedback.HapticFeedback;
import androidx.compose.p014ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.p014ui.input.InputMode;
import androidx.compose.p014ui.input.InputModeManager;
import androidx.compose.p014ui.input.InputModeManagerImpl;
import androidx.compose.p014ui.input.key.Key;
import androidx.compose.p014ui.input.key.KeyEvent;
import androidx.compose.p014ui.input.key.KeyEventType;
import androidx.compose.p014ui.input.key.KeyEvent_androidKt;
import androidx.compose.p014ui.input.key.KeyInputModifierKt;
import androidx.compose.p014ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.p014ui.input.pointer.MotionEventAdapter;
import androidx.compose.p014ui.input.pointer.PointerIcon;
import androidx.compose.p014ui.input.pointer.PointerIconService;
import androidx.compose.p014ui.input.pointer.PointerInputEvent;
import androidx.compose.p014ui.input.pointer.PointerInputEventData;
import androidx.compose.p014ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.p014ui.input.pointer.PointerInputEventProcessorKt;
import androidx.compose.p014ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.p014ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.p014ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p014ui.input.rotary.RotaryScrollEvent;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.layout.PlaceableKt;
import androidx.compose.p014ui.layout.RootMeasurePolicy;
import androidx.compose.p014ui.modifier.ModifierLocalManager;
import androidx.compose.p014ui.node.DelegatableNode;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DelegatingNode;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.node.LayoutNodeDrawScope;
import androidx.compose.p014ui.node.MeasureAndLayoutDelegate;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.node.OwnedLayer;
import androidx.compose.p014ui.node.Owner;
import androidx.compose.p014ui.node.OwnerSnapshotObserver;
import androidx.compose.p014ui.node.PointerInputModifierNode;
import androidx.compose.p014ui.node.RootForTest;
import androidx.compose.p014ui.platform.AndroidComposeView;
import androidx.compose.p014ui.platform.ViewLayer;
import androidx.compose.p014ui.scrollcapture.ScrollCapture;
import androidx.compose.p014ui.semantics.EmptySemanticsElement;
import androidx.compose.p014ui.semantics.EmptySemanticsModifier;
import androidx.compose.p014ui.semantics.SemanticsOwner;
import androidx.compose.p014ui.spatial.RectManager;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.p014ui.text.input.PlatformTextInputService;
import androidx.compose.p014ui.text.input.TextInputService;
import androidx.compose.p014ui.text.input.TextInputServiceAndroid;
import androidx.compose.p014ui.unit.AndroidDensity_androidKt;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntOffsetKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.p014ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10781l;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, MatrixPositionCalculator, DefaultLifecycleObserver {
    private static Method getBooleanMethod;
    private static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final AndroidAutofill _autofill;
    private final AndroidAutofillManager _autofillManager;
    private final InputModeManagerImpl _inputModeManager;
    private final MutableState _viewTreeOwners$delegate;
    private final LazyWindowInfo _windowInfo;
    private final AndroidAccessibilityManager accessibilityManager;
    private final AutofillTree autofillTree;
    private final AndroidComposeView$bringIntoViewNode$1 bringIntoViewNode;
    private final CanvasHolder canvasHolder;
    private final AndroidClipboard clipboard;
    private final AndroidClipboardManager clipboardManager;
    private final AndroidComposeViewAccessibilityDelegateCompat composeAccessibilityDelegate;
    private InterfaceC9540l configurationChangeObserver;
    private AndroidContentCaptureManager contentCaptureManager;
    private InterfaceC9945d coroutineContext;
    private int currentFontWeightAdjustment;
    private final MutableState density$delegate;
    private final List<OwnedLayer> dirtyLayers;
    private final AndroidDragAndDropManager dragAndDropManager;
    private final MutableObjectList<InterfaceC9529a> endApplyChangesListeners;
    private final FocusOwner focusOwner;
    private final MutableState fontFamilyResolver$delegate;
    private final Font.ResourceLoader fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final GraphicsContext graphicsContext;
    private final HapticFeedback hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isPendingInteropViewLayoutChangeDispatch;
    private boolean isRenderNodeCompatible;
    private final Modifier keyInputModifier;
    private boolean keyboardModifiersRequireUpdate;
    private long lastDownPointerPosition;
    private long lastMatrixRecalculationAnimationTime;
    private final WeakCache<OwnedLayer> layerCache;
    private final MutableState layoutDirection$delegate;
    private final MutableIntObjectMap<LayoutNode> layoutNodes;
    private final TextInputServiceAndroid legacyTextInputServiceAndroid;
    private final CalculateMatrixToWindow matrixToWindow;
    private final MeasureAndLayoutDelegate measureAndLayoutDelegate;
    private final ModifierLocalManager modifierLocalManager;
    private final MotionEventAdapter motionEventAdapter;
    private boolean observationClearRequested;
    private Constraints onMeasureConstraints;
    private InterfaceC9540l onViewTreeOwnersAvailable;
    private final PointerIconService pointerIconService;
    private final PointerInputEventProcessor pointerInputEventProcessor;
    private List<OwnedLayer> postponedDirtyLayers;
    private MotionEvent previousMotionEvent;
    private boolean processingRequestFocusForNextNonChildView;
    private final RectManager rectManager;
    private long relayoutTime;
    private final InterfaceC9529a resendMotionEventOnLayout;
    private final AndroidComposeView$resendMotionEventRunnable$1 resendMotionEventRunnable;
    private final LayoutNode root;
    private final RootForTest rootForTest;
    private final EmptySemanticsModifier rootSemanticsNode;
    private final Modifier rotaryInputModifier;
    private final ScrollCapture scrollCapture;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final EmptySemanticsElement semanticsModifier;
    private final SemanticsOwner semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private int sensitiveComponentCount;
    private final LayoutNodeDrawScope sharedDrawScope;
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private final SoftwareKeyboardController softwareKeyboardController;
    private boolean superclassInitComplete;
    private final TextInputService textInputService;
    private final AtomicReference textInputSessionMutex;
    private final TextToolbar textToolbar;
    private final float[] tmpMatrix;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final ViewConfiguration viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final State viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean getIsShowingLayoutBounds() {
            try {
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class cls = AndroidComposeView.systemPropertiesClass;
                    AndroidComposeView.getBooleanMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.getBooleanMethod;
                Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        private Companion() {
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class ViewTreeOwners {
        public static final int $stable = 8;
        private final LifecycleOwner lifecycleOwner;
        private final SavedStateRegistryOwner savedStateRegistryOwner;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.lifecycleOwner = lifecycleOwner;
            this.savedStateRegistryOwner = savedStateRegistryOwner;
        }

        public final LifecycleOwner getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
            return this.savedStateRegistryOwner;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.ui.platform.AndroidComposeView", m26211f = "AndroidComposeView.android.kt", m26212l = {739}, m26213m = "textInputSession")
    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 */
    public static final class C29551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C29551(InterfaceC11588c<? super C29551> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidComposeView.this.textInputSession(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.compose.ui.Modifier, androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1] */
    public AndroidComposeView(Context context, InterfaceC9945d interfaceC9945d) {
        AndroidComposeView androidComposeView;
        AndroidAutofillManager androidAutofillManager;
        super(context);
        Offset.Companion companion = Offset.Companion;
        this.lastDownPointerPosition = companion.m30652getUnspecifiedF1C5BW0();
        int i10 = 1;
        this.superclassInitComplete = true;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        this.sharedDrawScope = new LayoutNodeDrawScope(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        this.density$delegate = SnapshotStateKt.mutableStateOf(AndroidDensity_androidKt.Density(context), SnapshotStateKt.referentialEqualityPolicy());
        EmptySemanticsModifier emptySemanticsModifier = new EmptySemanticsModifier();
        this.rootSemanticsNode = emptySemanticsModifier;
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(emptySemanticsModifier);
        this.semanticsModifier = emptySemanticsElement;
        ?? r52 = new ModifierNodeElement<BringIntoViewOnScreenResponderNode>() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            @Override // androidx.compose.p014ui.node.ModifierNodeElement
            public boolean equals(Object obj) {
                return obj == this;
            }

            @Override // androidx.compose.p014ui.node.ModifierNodeElement
            public int hashCode() {
                return this.this$0.hashCode();
            }

            @Override // androidx.compose.p014ui.node.ModifierNodeElement
            public void inspectableProperties(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("BringIntoViewOnScreen");
            }

            @Override // androidx.compose.p014ui.node.ModifierNodeElement
            public BringIntoViewOnScreenResponderNode create() {
                return new BringIntoViewOnScreenResponderNode(this.this$0);
            }

            @Override // androidx.compose.p014ui.node.ModifierNodeElement
            public void update(BringIntoViewOnScreenResponderNode bringIntoViewOnScreenResponderNode) {
                bringIntoViewOnScreenResponderNode.setView(this.this$0);
            }
        };
        this.bringIntoViewNode = r52;
        this.focusOwner = new FocusOwnerImpl(new AndroidComposeView$focusOwner$1(this), new AndroidComposeView$focusOwner$2(this), new AndroidComposeView$focusOwner$3(this), new AndroidComposeView$focusOwner$4(this), new AndroidComposeView$focusOwner$5(this), new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.platform.AndroidComposeView$focusOwner$6
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, p280od.InterfaceC10479m
            public Object get() {
                return ((AndroidComposeView) this.receiver).getLayoutDirection();
            }

            public void set(Object obj) {
                ((AndroidComposeView) this.receiver).setLayoutDirection((LayoutDirection) obj);
            }
        });
        this.coroutineContext = interfaceC9945d;
        this.dragAndDropManager = new AndroidDragAndDropManager(new AndroidComposeView$dragAndDropManager$1(this));
        this._windowInfo = new LazyWindowInfo();
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(companion2, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m32625invokeZmokQxo(((KeyEvent) obj).m31948unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m32625invokeZmokQxo(android.view.KeyEvent keyEvent) {
                final FocusDirection focusDirectionMo32570getFocusDirectionP8AzH3I = this.this$0.mo32570getFocusDirectionP8AzH3I(keyEvent);
                if (focusDirectionMo32570getFocusDirectionP8AzH3I == null || !KeyEventType.m31952equalsimpl0(KeyEvent_androidKt.m31960getTypeZmokQxo(keyEvent), KeyEventType.Companion.m31956getKeyDownCS__XNY())) {
                    return Boolean.FALSE;
                }
                Integer numM30526toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m30526toAndroidFocusDirection3ESFkO8(focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl());
                if (ComposeUiFlags.isViewFocusFixEnabled && this.this$0.hasFocus() && numM30526toAndroidFocusDirection3ESFkO8 != null && this.this$0.m32615onMoveFocusInChildren3ESFkO8(focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl())) {
                    return Boolean.TRUE;
                }
                Rect rectOnFetchFocusRect = this.this$0.onFetchFocusRect();
                Boolean boolMo30534focusSearchULY8qGw = this.this$0.getFocusOwner().mo30534focusSearchULY8qGw(focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl(), rectOnFetchFocusRect, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1$focusWasMovedOrCancelled$1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl()));
                    }
                });
                if (boolMo30534focusSearchULY8qGw != null ? boolMo30534focusSearchULY8qGw.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!FocusOwnerImplKt.m30542is1dFocusSearch3ESFkO8(focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl())) {
                    return Boolean.FALSE;
                }
                if (numM30526toAndroidFocusDirection3ESFkO8 != null) {
                    View viewFindNextNonChildView = this.this$0.findNextNonChildView(numM30526toAndroidFocusDirection3ESFkO8.intValue());
                    if (AbstractC9979u.m20289b(viewFindNextNonChildView, this.this$0)) {
                        viewFindNextNonChildView = null;
                    }
                    if (viewFindNextNonChildView != null) {
                        android.graphics.Rect androidRect = rectOnFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect) : null;
                        if (androidRect == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        viewFindNextNonChildView.getLocationInWindow(this.this$0.tmpPositionArray);
                        int i11 = this.this$0.tmpPositionArray[0];
                        int i12 = this.this$0.tmpPositionArray[1];
                        AndroidComposeView androidComposeView2 = this.this$0;
                        androidComposeView2.getLocationInWindow(androidComposeView2.tmpPositionArray);
                        androidRect.offset(this.this$0.tmpPositionArray[0] - i11, this.this$0.tmpPositionArray[1] - i12);
                        if (FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextNonChildView, numM30526toAndroidFocusDirection3ESFkO8, androidRect)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!this.this$0.getFocusOwner().mo30531clearFocusI7lrPNg(false, true, false, focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl())) {
                    return Boolean.TRUE;
                }
                Boolean boolMo30534focusSearchULY8qGw2 = this.this$0.getFocusOwner().mo30534focusSearchULY8qGw(focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl(), null, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$keyInputModifier$1.1
                    {
                        super(1);
                    }

                    @Override // p181hd.InterfaceC9540l
                    public final Boolean invoke(FocusTargetNode focusTargetNode) {
                        return Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(focusDirectionMo32570getFocusDirectionP8AzH3I.m30517unboximpl()));
                    }
                });
                return Boolean.valueOf(boolMo30534focusSearchULY8qGw2 != null ? boolMo30534focusSearchULY8qGw2.booleanValue() : true);
            }
        });
        this.keyInputModifier = modifierOnKeyEvent;
        Modifier modifierOnRotaryScrollEvent = RotaryInputModifierKt.onRotaryScrollEvent(companion2, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$rotaryInputModifier$1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(RotaryScrollEvent rotaryScrollEvent) {
                return Boolean.FALSE;
            }
        });
        this.rotaryInputModifier = modifierOnRotaryScrollEvent;
        this.canvasHolder = new CanvasHolder();
        this.viewConfiguration = new AndroidViewConfiguration(ViewConfiguration.get(context));
        Object[] objArr4 = 0;
        LayoutNode layoutNode = new LayoutNode(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        layoutNode.setMeasurePolicy(RootMeasurePolicy.INSTANCE);
        layoutNode.setDensity(getDensity());
        layoutNode.setViewConfiguration(getViewConfiguration());
        layoutNode.setModifier(companion2.then(emptySemanticsElement).then(modifierOnRotaryScrollEvent).then(modifierOnKeyEvent).then(getFocusOwner().getModifier()).then(getDragAndDropManager().getModifier()).then(r52));
        this.root = layoutNode;
        this.layoutNodes = IntObjectMapKt.mutableIntObjectMapOf();
        this.rectManager = new RectManager(getLayoutNodes());
        this.rootForTest = this;
        this.semanticsOwner = new SemanticsOwner(getRoot(), emptySemanticsModifier, getLayoutNodes());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.composeAccessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.contentCaptureManager = new AndroidContentCaptureManager(this, new AndroidComposeView$contentCaptureManager$1(this));
        this.accessibilityManager = new AndroidAccessibilityManager(context);
        this.graphicsContext = AndroidGraphicsContext_androidKt.GraphicsContext(this);
        this.autofillTree = new AutofillTree();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new MotionEventAdapter();
        this.pointerInputEventProcessor = new PointerInputEventProcessor(getRoot());
        this.configurationChangeObserver = new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1
            public final void invoke(Configuration configuration) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Configuration) obj);
                return C10786q.f26013a;
            }
        };
        this._autofill = autofillSupported() ? new AndroidAutofill(this, getAutofillTree()) : null;
        if (autofillSupported()) {
            AutofillManager autofillManagerM1065a = AbstractC2648d.m1065a(context.getSystemService(AbstractC2646c.m1063a()));
            if (autofillManagerM1065a == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Autofill service could not be located.");
                throw new KotlinNothingValueException();
            }
            androidComposeView = this;
            androidAutofillManager = new AndroidAutofillManager(new PlatformAutofillManagerImpl(autofillManagerM1065a), getSemanticsOwner(), androidComposeView, getRectManager(), context.getPackageName());
        } else {
            androidComposeView = this;
            androidAutofillManager = null;
        }
        androidComposeView._autofillManager = androidAutofillManager;
        androidComposeView.clipboardManager = new AndroidClipboardManager(context);
        androidComposeView.clipboard = new AndroidClipboard(getClipboardManager());
        androidComposeView.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        androidComposeView.measureAndLayoutDelegate = new MeasureAndLayoutDelegate(getRoot());
        long j10 = Integer.MAX_VALUE;
        androidComposeView.globalPosition = IntOffset.m33623constructorimpl((j10 & 4294967295L) | (j10 << 32));
        androidComposeView.tmpPositionArray = new int[]{0, 0};
        float[] fArrM31108constructorimpl$default = Matrix.m31108constructorimpl$default(null, 1, null);
        androidComposeView.tmpMatrix = fArrM31108constructorimpl$default;
        androidComposeView.viewToWindowMatrix = Matrix.m31108constructorimpl$default(null, 1, null);
        androidComposeView.windowToViewMatrix = Matrix.m31108constructorimpl$default(null, 1, null);
        androidComposeView.lastMatrixRecalculationAnimationTime = -1L;
        androidComposeView.windowPosition = companion.m30651getInfiniteF1C5BW0();
        androidComposeView.isRenderNodeCompatible = true;
        androidComposeView._viewTreeOwners$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        androidComposeView.viewTreeOwners$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidComposeView$viewTreeOwners$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final AndroidComposeView.ViewTreeOwners invoke() {
                return this.this$0.get_viewTreeOwners();
            }
        });
        androidComposeView.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f1264c.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.scrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f1265a.updatePositionCacheAndDispatch();
            }
        };
        androidComposeView.touchModeChangeListener = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.d
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z10) {
                AndroidComposeView.touchModeChangeListener$lambda$8(this.f1267c, z10);
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        androidComposeView.legacyTextInputServiceAndroid = textInputServiceAndroid;
        androidComposeView.textInputService = new TextInputService((PlatformTextInputService) AndroidComposeView_androidKt.getPlatformTextInputServiceInterceptor().invoke(textInputServiceAndroid));
        androidComposeView.textInputSessionMutex = SessionMutex.m30449constructorimpl();
        androidComposeView.softwareKeyboardController = new DelegatingSoftwareKeyboardController(getTextInputService());
        androidComposeView.fontLoader = new AndroidFontResourceLoader(context);
        androidComposeView.fontFamilyResolver$delegate = SnapshotStateKt.mutableStateOf(FontFamilyResolver_androidKt.createFontFamilyResolver(context), SnapshotStateKt.referentialEqualityPolicy());
        androidComposeView.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(context.getResources().getConfiguration());
        LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
        androidComposeView.layoutDirection$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection, null, 2, null);
        androidComposeView.hapticFeedBack = new PlatformHapticFeedback(this);
        androidComposeView._inputModeManager = new InputModeManagerImpl(isInTouchMode() ? InputMode.Companion.m31642getTouchaOaMEAU() : InputMode.Companion.m31641getKeyboardaOaMEAU(), new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$_inputModeManager$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m32620invokeiuPiT84(((InputMode) obj).m31640unboximpl());
            }

            /* renamed from: invoke-iuPiT84, reason: not valid java name */
            public final Boolean m32620invokeiuPiT84(int i11) {
                InputMode.Companion companion3 = InputMode.Companion;
                return Boolean.valueOf(InputMode.m31637equalsimpl0(i11, companion3.m31642getTouchaOaMEAU()) ? this.this$0.isInTouchMode() : InputMode.m31637equalsimpl0(i11, companion3.m31641getKeyboardaOaMEAU()) ? this.this$0.isInTouchMode() ? this.this$0.requestFocusFromTouch() : true : false);
            }
        }, objArr3 == true ? 1 : 0);
        androidComposeView.modifierLocalManager = new ModifierLocalManager(this);
        androidComposeView.textToolbar = new AndroidTextToolbar(this);
        androidComposeView.layerCache = new WeakCache<>();
        androidComposeView.endApplyChangesListeners = new MutableObjectList<>(objArr4 == true ? 1 : 0, i10, objArr2 == true ? 1 : 0);
        androidComposeView.resendMotionEventRunnable = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                this.this$0.removeCallbacks(this);
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    boolean z10 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z10) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i11 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i11 = 2;
                    }
                    AndroidComposeView androidComposeView2 = this.this$0;
                    androidComposeView2.sendSimulatedEvent(motionEvent, i11, androidComposeView2.relayoutTime, false);
                }
            }
        };
        androidComposeView.sendHoverExitEvent = new Runnable() { // from class: androidx.compose.ui.platform.e
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.sendHoverExitEvent$lambda$10(this.f1269c);
            }
        };
        androidComposeView.resendMotionEventOnLayout = new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32628invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32628invoke() {
                MotionEvent motionEvent = this.this$0.previousMotionEvent;
                if (motionEvent != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 7 || actionMasked == 9) {
                        this.this$0.relayoutTime = SystemClock.uptimeMillis();
                        AndroidComposeView androidComposeView2 = this.this$0;
                        androidComposeView2.post(androidComposeView2.resendMotionEventRunnable);
                    }
                }
            }
        };
        int i11 = Build.VERSION.SDK_INT;
        androidComposeView.matrixToWindow = i11 < 29 ? new CalculateMatrixToWindowApi21(fArrM31108constructorimpl$default, objArr == true ? 1 : 0) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(androidComposeView.contentCaptureManager);
        setWillNotDraw(false);
        setFocusable(true);
        if (i11 >= 26) {
            AndroidComposeViewVerificationHelperMethodsO.INSTANCE.focusable(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.setAccessibilityDelegate(this, androidComposeViewAccessibilityDelegateCompat);
        InterfaceC9540l onViewCreatedCallback = ViewRootForTest.Companion.getOnViewCreatedCallback();
        if (onViewCreatedCallback != null) {
            onViewCreatedCallback.invoke(this);
        }
        setOnDragListener(getDragAndDropManager());
        getRoot().attach$ui_release(this);
        if (i11 >= 29) {
            AndroidComposeViewForceDarkModeQ.INSTANCE.disallowForceDark(this);
        }
        androidComposeView.scrollCapture = i11 >= 31 ? new ScrollCapture() : null;
        androidComposeView.pointerIconService = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1
            private PointerIcon currentMouseCursorIcon = PointerIcon.Companion.getDefault();
            private PointerIcon currentStylusHoverIcon;

            @Override // androidx.compose.p014ui.input.pointer.PointerIconService
            public PointerIcon getIcon() {
                return this.currentMouseCursorIcon;
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerIconService
            public PointerIcon getStylusHoverIcon() {
                return this.currentStylusHoverIcon;
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerIconService
            public void setIcon(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    pointerIcon = PointerIcon.Companion.getDefault();
                }
                this.currentMouseCursorIcon = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.INSTANCE.setPointerIcon(this.this$0, pointerIcon);
            }

            @Override // androidx.compose.p014ui.input.pointer.PointerIconService
            public void setStylusHoverIcon(PointerIcon pointerIcon) {
                this.currentStylusHoverIcon = pointerIcon;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int orDefault;
        if (AbstractC9979u.m20289b(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalBeforeVal$ui_release())) {
            int orDefault2 = this.composeAccessibilityDelegate.getIdToBeforeMap$ui_release().getOrDefault(i10, -1);
            if (orDefault2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, orDefault2);
                return;
            }
            return;
        }
        if (!AbstractC9979u.m20289b(str, this.composeAccessibilityDelegate.getExtraDataTestTraversalAfterVal$ui_release()) || (orDefault = this.composeAccessibilityDelegate.getIdToAfterMap$ui_release().getOrDefault(i10, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, orDefault);
    }

    private final boolean autofillSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    private final boolean childSizeCanAffectParentSize(LayoutNode layoutNode) {
        if (this.wasMeasuredWithMultipleConstraints) {
            return true;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        return (parent$ui_release == null || parent$ui_release.getHasFixedInnerContentConstraints$ui_release()) ? false : true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: component1-VKZWuLQ, reason: not valid java name */
    private final int m32611component1VKZWuLQ(long j10) {
        return (int) C10781l.m23023b(j10 >>> 32);
    }

    /* renamed from: component2-VKZWuLQ, reason: not valid java name */
    private final int m32612component2VKZWuLQ(long j10) {
        return (int) C10781l.m23023b(j10 & 4294967295L);
    }

    /* renamed from: convertMeasureSpec-I7RO_PI, reason: not valid java name */
    private final long m32613convertMeasureSpecI7RO_PI(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            return m32617packZIaKswc(0, size);
        }
        if (mode == 0) {
            return m32617packZIaKswc(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return m32617packZIaKswc(size, size);
        }
        throw new IllegalStateException();
    }

    private final void dispatchPendingInteropLayoutCallbacks() {
        if (this.isPendingInteropViewLayoutChangeDispatch) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.isPendingInteropViewLayoutChangeDispatch = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View findNextNonChildView(int i10) {
        FocusFinder focusFinder = FocusFinder.getInstance();
        View viewFindNextFocus = this;
        while (viewFindNextFocus != null) {
            View rootView = getRootView();
            AbstractC9979u.m20292e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
            viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindNextFocus, i10);
            if (viewFindNextFocus != null && !AndroidComposeView_androidKt.containsDescendant(this, viewFindNextFocus)) {
                return viewFindNextFocus;
            }
        }
        return null;
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i10, View view) throws NoSuchMethodException, SecurityException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC9979u.m20289b(declaredMethod.invoke(view, null), Integer.valueOf(i10))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View viewFindViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i10, viewGroup.getChildAt(i11));
                    if (viewFindViewByAccessibilityIdRootedAtCurrentView != null) {
                        return viewFindViewByAccessibilityIdRootedAtCurrentView;
                    }
                }
            }
        }
        return null;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC10770a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this._viewTreeOwners$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* renamed from: handleMotionEvent-8iAsVTc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int m32614handleMotionEvent8iAsVTc(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.AndroidComposeView.m32614handleMotionEvent8iAsVTc(android.view.MotionEvent):int");
    }

    private final boolean handleRotaryEvent(final MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f10 = -motionEvent.getAxisValue(26);
        return getFocusOwner().dispatchRotaryEvent(new RotaryScrollEvent(ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, getContext()) * f10, f10 * ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()), new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidComposeView.handleRotaryEvent.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                return Boolean.valueOf(AndroidComposeView.super.dispatchGenericMotionEvent(motionEvent));
            }
        });
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.invalidateLayers$ui_release();
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            invalidateLayers(layoutNodeArr[i10]);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.requestRemeasure$default(this.measureAndLayoutDelegate, layoutNode, false, 2, null);
        MutableVector<LayoutNode> mutableVector = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            invalidateLayoutNodeMeasurement(layoutNodeArr[i10]);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        boolean z10 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z10) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i10 = 1; i10 < pointerCount; i10++) {
                z10 = (Float.floatToRawIntBits(motionEvent.getX(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i10)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !MotionEventVerifierApi29.INSTANCE.isValidMotionEvent(motionEvent, i10));
                if (z10) {
                    break;
                }
            }
        }
        return z10;
    }

    private final boolean isDevicePressEvent(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        return 0.0f <= x10 && x10 <= ((float) getWidth()) && 0.0f <= y10 && y10 <= ((float) getHeight());
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.previousMotionEvent) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearFocusForOwner() {
        if (isFocused() || (!ComposeUiFlags.isViewFocusFixEnabled && hasFocus())) {
            super.clearFocus();
        } else if (hasFocus()) {
            View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect onFetchFocusRect() {
        if (isFocused()) {
            return getFocusOwner().getFocusRect();
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(viewFindFocus, this);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onMoveFocusInChildren-3ESFkO8, reason: not valid java name */
    public final boolean m32615onMoveFocusInChildren3ESFkO8(int i10) {
        AndroidViewsHandler androidViewsHandler;
        View viewFindNextFocusFromRect;
        if (!ComposeUiFlags.isViewFocusFixEnabled) {
            FocusDirection.Companion companion = FocusDirection.Companion;
            if (FocusDirection.m30514equalsimpl0(i10, companion.m30519getEnterdhqQ8s()) || FocusDirection.m30514equalsimpl0(i10, companion.m30520getExitdhqQ8s())) {
                return false;
            }
            Integer numM30526toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m30526toAndroidFocusDirection3ESFkO8(i10);
            if (numM30526toAndroidFocusDirection3ESFkO8 == null) {
                throw new IllegalStateException("Invalid focus direction");
            }
            int iIntValue = numM30526toAndroidFocusDirection3ESFkO8.intValue();
            Rect rectOnFetchFocusRect = onFetchFocusRect();
            androidRect = rectOnFetchFocusRect != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect) : null;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View viewFindNextFocus = androidRect == null ? focusFinder.findNextFocus(this, findFocus(), iIntValue) : focusFinder.findNextFocusFromRect(this, androidRect, iIntValue);
            if (viewFindNextFocus != null) {
                return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocus, Integer.valueOf(iIntValue), androidRect);
            }
            return false;
        }
        FocusDirection.Companion companion2 = FocusDirection.Companion;
        if (FocusDirection.m30514equalsimpl0(i10, companion2.m30519getEnterdhqQ8s()) || FocusDirection.m30514equalsimpl0(i10, companion2.m30520getExitdhqQ8s()) || !hasFocus() || (androidViewsHandler = this._androidViewsHandler) == null) {
            return false;
        }
        Integer numM30526toAndroidFocusDirection3ESFkO82 = FocusInteropUtils_androidKt.m30526toAndroidFocusDirection3ESFkO8(i10);
        if (numM30526toAndroidFocusDirection3ESFkO82 == null) {
            throw new IllegalStateException("Invalid focus direction");
        }
        int iIntValue2 = numM30526toAndroidFocusDirection3ESFkO82.intValue();
        View rootView = getRootView();
        AbstractC9979u.m20292e(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) rootView;
        View viewFindFocus = viewGroup.findFocus();
        if (viewFindFocus == null) {
            throw new IllegalStateException("view hasFocus but root can't find it");
        }
        FocusFinder focusFinder2 = FocusFinder.getInstance();
        if (FocusOwnerImplKt.m30542is1dFocusSearch3ESFkO8(i10) && androidViewsHandler.hasFocus()) {
            viewFindNextFocusFromRect = Build.VERSION.SDK_INT >= 26 ? focusFinder2.findNextFocus(viewGroup, viewFindFocus, iIntValue2) : FocusFinderCompat.Companion.getInstance().findNextFocus1d(viewGroup, viewFindFocus, iIntValue2);
        } else {
            Rect rectOnFetchFocusRect2 = onFetchFocusRect();
            androidRect = rectOnFetchFocusRect2 != null ? RectHelper_androidKt.toAndroidRect(rectOnFetchFocusRect2) : null;
            viewFindNextFocusFromRect = focusFinder2.findNextFocusFromRect(viewGroup, androidRect, iIntValue2);
            if (viewFindNextFocusFromRect != null) {
                viewFindNextFocusFromRect.getLocationInWindow(this.tmpPositionArray);
            }
            int[] iArr = this.tmpPositionArray;
            int i11 = iArr[0];
            int i12 = iArr[1];
            getLocationInWindow(iArr);
            if (androidRect != null) {
                int[] iArr2 = this.tmpPositionArray;
                androidRect.offset(iArr2[0] - i11, iArr2[1] - i12);
            }
        }
        if (viewFindNextFocusFromRect == null || viewFindNextFocusFromRect == viewFindFocus) {
            return false;
        }
        View focusedChild = androidViewsHandler.getFocusedChild();
        ViewParent parent = viewFindNextFocusFromRect.getParent();
        while (parent != null && parent != focusedChild) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return false;
        }
        return FocusInteropUtils_androidKt.requestInteropFocus(viewFindNextFocusFromRect, Integer.valueOf(iIntValue2), androidRect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onRequestFocusForOwner-7o62pno, reason: not valid java name */
    public final boolean m32616onRequestFocusForOwner7o62pno(FocusDirection focusDirection, Rect rect) {
        Integer numM30526toAndroidFocusDirection3ESFkO8;
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (numM30526toAndroidFocusDirection3ESFkO8 = FocusInteropUtils_androidKt.m30526toAndroidFocusDirection3ESFkO8(focusDirection.m30517unboximpl())) == null) ? 130 : numM30526toAndroidFocusDirection3ESFkO8.intValue(), rect != null ? RectHelper_androidKt.toAndroidRect(rect) : null);
    }

    /* renamed from: pack-ZIaKswc, reason: not valid java name */
    private final long m32617packZIaKswc(int i10, int i11) {
        return C10781l.m23023b(C10781l.m23023b(i11) | C10781l.m23023b(C10781l.m23023b(i10) << 32));
    }

    private final void recalculateWindowPosition() {
        if (this.forceUseMatrixCache) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
            this.lastMatrixRecalculationAnimationTime = jCurrentAnimationTimeMillis;
            recalculateWindowViewTransforms();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.tmpPositionArray);
            int[] iArr = this.tmpPositionArray;
            float f10 = iArr[0];
            float f11 = iArr[1];
            view.getLocationInWindow(iArr);
            float f12 = this.tmpPositionArray[0];
            float f13 = f11 - r0[1];
            this.windowPosition = Offset.m30629constructorimpl((Float.floatToRawIntBits(f10 - f12) << 32) | (Float.floatToRawIntBits(f13) & 4294967295L));
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo32639calculateMatrixToWindowEL8BTi8(this, this.viewToWindowMatrix);
        InvertMatrixKt.m32667invertToJiSxe2E(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.getMeasuredByParent$ui_release() == LayoutNode.UsageByParent.InMeasureBlock && childSizeCanAffectParentSize(layoutNode)) {
                layoutNode = layoutNode.getParent$ui_release();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendHoverExitEvent$lambda$10(AndroidComposeView androidComposeView) {
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        AbstractC9979u.m20291d(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.m32618sendMotionEvent8iAsVTc(motionEvent);
    }

    /* renamed from: sendMotionEvent-8iAsVTc, reason: not valid java name */
    private final int m32618sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        PointerInputEventData pointerInputEventData;
        if (this.keyboardModifiersRequireUpdate) {
            this.keyboardModifiersRequireUpdate = false;
            this._windowInfo.m32675setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m32166constructorimpl(motionEvent.getMetaState()));
        }
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEvent, this);
        if (pointerInputEventConvertToPointerInputEvent$ui_release == null) {
            this.pointerInputEventProcessor.processCancel();
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        List<PointerInputEventData> pointers = pointerInputEventConvertToPointerInputEvent$ui_release.getPointers();
        int size = pointers.size() - 1;
        if (size >= 0) {
            while (true) {
                int i10 = size - 1;
                pointerInputEventData = pointers.get(size);
                if (pointerInputEventData.getDown()) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                size = i10;
            }
            pointerInputEventData = null;
        } else {
            pointerInputEventData = null;
        }
        PointerInputEventData pointerInputEventData2 = pointerInputEventData;
        if (pointerInputEventData2 != null) {
            this.lastDownPointerPosition = pointerInputEventData2.m32120getPositionF1C5BW0();
        }
        int iM32125processBIzXfog = this.pointerInputEventProcessor.m32125processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, isInBounds(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iM32125processBIzXfog & 1) != 0) {
            return iM32125processBIzXfog;
        }
        this.motionEventAdapter.endStream(motionEvent.getPointerId(motionEvent.getActionIndex()));
        return iM32125processBIzXfog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i10, long j10, boolean z10) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i10 != 9 && i10 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i11 = 0; i11 < pointerCount; i11++) {
            pointerPropertiesArr[i11] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i12 = 0; i12 < pointerCount; i12++) {
            pointerCoordsArr[i12] = new MotionEvent.PointerCoords();
        }
        int i13 = 0;
        while (i13 < pointerCount) {
            int i14 = ((actionIndex < 0 || i13 < actionIndex) ? 0 : 1) + i13;
            motionEvent.getPointerProperties(i14, pointerPropertiesArr[i13]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i13];
            motionEvent.getPointerCoords(i14, pointerCoords);
            float f10 = pointerCoords.x;
            long jMo32184localToScreenMKHz9U = mo32184localToScreenMKHz9U(Offset.m30629constructorimpl((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
            pointerCoords.x = Float.intBitsToFloat((int) (jMo32184localToScreenMKHz9U >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jMo32184localToScreenMKHz9U & 4294967295L));
            i13++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j10 : motionEvent.getDownTime(), j10, i10, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z10 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent pointerInputEventConvertToPointerInputEvent$ui_release = this.motionEventAdapter.convertToPointerInputEvent$ui_release(motionEventObtain, this);
        AbstractC9979u.m20291d(pointerInputEventConvertToPointerInputEvent$ui_release);
        this.pointerInputEventProcessor.m32125processBIzXfog(pointerInputEventConvertToPointerInputEvent$ui_release, this, true);
        motionEventObtain.recycle();
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i10, long j10, boolean z10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i10, j10, z10);
    }

    private void setDensity(Density density) {
        this.density$delegate.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.fontFamilyResolver$delegate.setValue(resolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this._viewTreeOwners$delegate.setValue(viewTreeOwners);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startDrag-12SF9DM, reason: not valid java name */
    public final boolean m32619startDrag12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j10, InterfaceC9540l interfaceC9540l) {
        Resources resources = getContext().getResources();
        return AndroidComposeViewStartDragAndDropN.INSTANCE.startDragAndDrop(this, dragAndDropTransferData, new ComposeDragShadowBuilder(DensityKt.Density(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j10, interfaceC9540l, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchModeChangeListener$lambda$8(AndroidComposeView androidComposeView, boolean z10) {
        androidComposeView._inputModeManager.m31645setInputModeiuPiT84(z10 ? InputMode.Companion.m31642getTouchaOaMEAU() : InputMode.Companion.m31641getKeyboardaOaMEAU());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j10 = this.globalPosition;
        int iM33629getXimpl = IntOffset.m33629getXimpl(j10);
        int iM33630getYimpl = IntOffset.m33630getYimpl(j10);
        int[] iArr = this.tmpPositionArray;
        boolean z10 = false;
        int i10 = iArr[0];
        if (iM33629getXimpl != i10 || iM33630getYimpl != iArr[1] || this.lastMatrixRecalculationAnimationTime < 0) {
            this.globalPosition = IntOffset.m33623constructorimpl((i10 << 32) | (iArr[1] & 4294967295L));
            if (iM33629getXimpl != Integer.MAX_VALUE && iM33630getYimpl != Integer.MAX_VALUE) {
                getRoot().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                z10 = true;
            }
        }
        recalculateWindowPosition();
        getRectManager().m32754updateOffsetsucfNpQE(this.globalPosition, IntOffsetKt.m33646roundk4lQ0M(this.windowPosition), this.viewToWindowMatrix);
        this.measureAndLayoutDelegate.dispatchOnPositionedCallbacks(z10);
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().dispatchCallbacks();
        }
    }

    private final void updateWindowMetrics() {
        MutableState mutableState = this._windowInfo._containerSize;
        if (mutableState != null) {
            mutableState.setValue(IntSize.m33664boximpl(AndroidWindowInfo_androidKt.calculateWindowSize(this)));
        }
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, final LayoutNode layoutNode) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        androidViewHolder.setImportantForAccessibility(1);
        ViewCompat.setAccessibilityDelegate(androidViewHolder, new AccessibilityDelegateCompat() { // from class: androidx.compose.ui.platform.AndroidComposeView.addAndroidView.1
            /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
            @Override // androidx.core.view.AccessibilityDelegateCompat
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void onInitializeAccessibilityNodeInfo(android.view.View r5, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r6) {
                /*
                    r4 = this;
                    super.onInitializeAccessibilityNodeInfo(r5, r6)
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r5 = androidx.compose.p014ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r5)
                    boolean r5 = r5.isEnabled$ui_release()
                    if (r5 == 0) goto L13
                    r5 = 0
                    r6.setVisibleToUser(r5)
                L13:
                    androidx.compose.ui.node.LayoutNode r5 = r2
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
                L19:
                    r0 = 0
                    if (r5 == 0) goto L32
                    androidx.compose.ui.node.NodeChain r1 = r5.getNodes$ui_release()
                    r2 = 8
                    int r2 = androidx.compose.p014ui.node.NodeKind.m32510constructorimpl(r2)
                    boolean r1 = r1.m32466hasH91voCI$ui_release(r2)
                    if (r1 == 0) goto L2d
                    goto L33
                L2d:
                    androidx.compose.ui.node.LayoutNode r5 = r5.getParent$ui_release()
                    goto L19
                L32:
                    r5 = r0
                L33:
                    if (r5 == 0) goto L3d
                    int r5 = r5.getSemanticsId()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L3d:
                    r5 = -1
                    if (r0 == 0) goto L54
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.semantics.SemanticsOwner r1 = r1.getSemanticsOwner()
                    androidx.compose.ui.semantics.SemanticsNode r1 = r1.getUnmergedRootSemanticsNode()
                    int r1 = r1.getId()
                    int r2 = r0.intValue()
                    if (r2 != r1) goto L58
                L54:
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                L58:
                    androidx.compose.ui.platform.AndroidComposeView r1 = r3
                    int r0 = r0.intValue()
                    r6.setParent(r1, r0)
                    androidx.compose.ui.node.LayoutNode r0 = r2
                    int r0 = r0.getSemanticsId()
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.p014ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToBeforeMap$ui_release()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto L9f
                    androidx.compose.ui.platform.AndroidComposeView r2 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r2 = r2.getAndroidViewsHandler$ui_release()
                    android.view.View r2 = androidx.compose.p014ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r2, r1)
                    if (r2 == 0) goto L87
                    r6.setTraversalBefore(r2)
                    goto L8c
                L87:
                    androidx.compose.ui.platform.AndroidComposeView r2 = r3
                    r6.setTraversalBefore(r2, r1)
                L8c:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r2 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r3 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = androidx.compose.p014ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r3)
                    java.lang.String r3 = r3.getExtraDataTestTraversalBeforeVal$ui_release()
                    androidx.compose.p014ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r1, r0, r2, r3)
                L9f:
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.p014ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    androidx.collection.MutableIntIntMap r1 = r1.getIdToAfterMap$ui_release()
                    int r1 = r1.getOrDefault(r0, r5)
                    if (r1 == r5) goto Ld7
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidViewsHandler r5 = r5.getAndroidViewsHandler$ui_release()
                    android.view.View r5 = androidx.compose.p014ui.platform.SemanticsUtils_androidKt.semanticsIdToView(r5, r1)
                    if (r5 == 0) goto Lbf
                    r6.setTraversalAfter(r5)
                    goto Lc4
                Lbf:
                    androidx.compose.ui.platform.AndroidComposeView r5 = r3
                    r6.setTraversalAfter(r5, r1)
                Lc4:
                    androidx.compose.ui.platform.AndroidComposeView r5 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    android.view.accessibility.AccessibilityNodeInfo r6 = r6.unwrap()
                    androidx.compose.ui.platform.AndroidComposeView r1 = androidx.compose.p014ui.platform.AndroidComposeView.this
                    androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r1 = androidx.compose.p014ui.platform.AndroidComposeView.access$getComposeAccessibilityDelegate$p(r1)
                    java.lang.String r1 = r1.getExtraDataTestTraversalAfterVal$ui_release()
                    androidx.compose.p014ui.platform.AndroidComposeView.access$addExtraDataToAccessibilityNodeInfoHelper(r5, r0, r6, r1)
                Ld7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.AndroidComposeView.C29471.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
            }
        });
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public void autofill(SparseArray<AutofillValue> sparseArray) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported()) {
            if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
                androidAutofillManager.performAutofill(sparseArray);
            }
            AndroidAutofill androidAutofill = this._autofill;
            if (androidAutofill != null) {
                AndroidAutofill_androidKt.performAutofill(androidAutofill, sparseArray);
            }
        }
    }

    public final Object boundsUpdatesAccessibilityEventLoop(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objBoundsUpdatesEventLoop$ui_release = this.composeAccessibilityDelegate.boundsUpdatesEventLoop$ui_release(interfaceC11588c);
        return objBoundsUpdatesEventLoop$ui_release == AbstractC11725a.m25952f() ? objBoundsUpdatesEventLoop$ui_release : C10786q.f26013a;
    }

    public final Object boundsUpdatesContentCaptureEventLoop(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objBoundsUpdatesEventLoop$ui_release = this.contentCaptureManager.boundsUpdatesEventLoop$ui_release(interfaceC11588c);
        return objBoundsUpdatesEventLoop$ui_release == AbstractC11725a.m25952f() ? objBoundsUpdatesEventLoop$ui_release : C10786q.f26013a;
    }

    @Override // androidx.compose.p014ui.node.Owner
    /* renamed from: calculateLocalPosition-MK-Hz9U */
    public long mo32568calculateLocalPositionMKHz9U(long j10) {
        recalculateWindowPosition();
        return Matrix.m31114mapMKHz9U(this.windowToViewMatrix, j10);
    }

    @Override // androidx.compose.p014ui.node.Owner
    /* renamed from: calculatePositionInWindow-MK-Hz9U */
    public long mo32569calculatePositionInWindowMKHz9U(long j10) {
        recalculateWindowPosition();
        return Matrix.m31114mapMKHz9U(this.viewToWindowMatrix, j10);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.composeAccessibilityDelegate.m32630canScroll0AR0LA0$ui_release(false, i10, this.lastDownPointerPosition);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.composeAccessibilityDelegate.m32630canScroll0AR0LA0$ui_release(true, i10, this.lastDownPointerPosition);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public OwnedLayer createLayer(InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a, GraphicsLayer graphicsLayer, boolean z10) {
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, interfaceC9544p, interfaceC9529a);
        }
        if (!z10) {
            OwnedLayer ownedLayerPop = this.layerCache.pop();
            if (ownedLayerPop == null) {
                return new GraphicsLayerOwnerLayer(getGraphicsContext().createGraphicsLayer(), getGraphicsContext(), this, interfaceC9544p, interfaceC9529a);
            }
            ownedLayerPop.reuseLayer(interfaceC9544p, interfaceC9529a);
            return ownedLayerPop;
        }
        if (isHardwareAccelerated() && this.isRenderNodeCompatible) {
            try {
                return new RenderNodeLayer(this, interfaceC9544p, interfaceC9529a);
            } catch (Throwable unused) {
                this.isRenderNodeCompatible = false;
            }
        }
        if (this.viewLayersContainer == null) {
            ViewLayer.Companion companion = ViewLayer.Companion;
            if (!companion.getHasRetrievedMethod()) {
                companion.updateDisplayList(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = companion.getShouldUseDispatchDraw() ? new DrawChildContainer(getContext()) : new ViewLayerContainer(getContext());
            this.viewLayersContainer = drawChildContainer;
            addView(drawChildContainer);
        }
        DrawChildContainer drawChildContainer2 = this.viewLayersContainer;
        AbstractC9979u.m20291d(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, interfaceC9544p, interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void decrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 1) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), false);
            }
            this.sensitiveComponentCount--;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        Owner.measureAndLayout$default(this, false, 1, null);
        Snapshot.Companion.notifyObjectsInitialized();
        this.isDrawingContent = true;
        CanvasHolder canvasHolder = this.canvasHolder;
        Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().setInternalCanvas(canvas);
        getRoot().draw$ui_release(canvasHolder.getAndroidCanvas(), null);
        canvasHolder.getAndroidCanvas().setInternalCanvas(internalCanvas);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.dirtyLayers.get(i10).updateDisplayList();
            }
        }
        if (ViewLayer.Companion.getShouldUseDispatchDraw()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<OwnedLayer> list = this.postponedDirtyLayers;
        if (list != null) {
            AbstractC9979u.m20291d(list);
            this.dirtyLayers.addAll(list);
            list.clear();
        }
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().dispatchCallbacks();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            if (motionEvent.getActionMasked() == 8) {
                this.hoverExitReceived = false;
            } else {
                this.sendHoverExitEvent.run();
            }
        }
        return motionEvent.getActionMasked() == 8 ? (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (m32614handleMotionEvent8iAsVTc(motionEvent) & 1) != 0 : super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            this.sendHoverExitEvent.run();
        }
        if (!isBadMotionEvent(motionEvent) && isAttachedToWindow()) {
            this.composeAccessibilityDelegate.dispatchHoverEvent$ui_release(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && isInBounds(motionEvent)) {
                    if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                        return false;
                    }
                    MotionEvent motionEvent2 = this.previousMotionEvent;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
                    this.hoverExitReceived = true;
                    postDelayed(this.sendHoverExitEvent, 8L);
                    return false;
                }
            } else if (!isPositionChanged(motionEvent)) {
                return false;
            }
            if ((m32614handleMotionEvent8iAsVTc(motionEvent) & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(final android.view.KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().mo30533dispatchKeyEventYhN2O0w(KeyEvent.m31943constructorimpl(keyEvent), new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.valueOf(AndroidComposeView.super.dispatchKeyEvent(keyEvent));
                }
            });
        }
        this._windowInfo.m32675setKeyboardModifiers5xRPYO0(PointerKeyboardModifiers.m32166constructorimpl(keyEvent.getMetaState()));
        return FocusOwner.m30530dispatchKeyEventYhN2O0w$default(getFocusOwner(), KeyEvent.m31943constructorimpl(keyEvent), null, 2, null) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().mo30532dispatchInterceptedSoftKeyboardEventZmokQxo(KeyEvent.m31943constructorimpl(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            AndroidComposeViewAssistHelperMethodsO.INSTANCE.setClassName(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            AbstractC9979u.m20291d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent))) {
            return false;
        }
        int iM32614handleMotionEvent8iAsVTc = m32614handleMotionEvent8iAsVTc(motionEvent);
        if ((iM32614handleMotionEvent8iAsVTc & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iM32614handleMotionEvent8iAsVTc & 1) != 0;
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    public final View findViewByAccessibilityIdTraversal(int i10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(i10, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i10));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        Rect rectCalculateBoundingRectRelativeTo;
        if (view == null || this.measureAndLayoutDelegate.getDuringMeasureLayout$ui_release()) {
            return super.focusSearch(view, i10);
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i10);
        if (view != this || (rectCalculateBoundingRectRelativeTo = getFocusOwner().getFocusRect()) == null) {
            rectCalculateBoundingRectRelativeTo = FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(view, this);
        }
        FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i10);
        int iM30517unboximpl = focusDirection != null ? focusDirection.m30517unboximpl() : FocusDirection.Companion.m30518getDowndhqQ8s();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (getFocusOwner().mo30534focusSearchULY8qGw(iM30517unboximpl, rectCalculateBoundingRectRelativeTo, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                ref$ObjectRef.f23402c = focusTargetNode;
                return Boolean.TRUE;
            }
        }) != null) {
            if (ref$ObjectRef.f23402c != null) {
                if (viewFindNextFocus != null) {
                    if (FocusOwnerImplKt.m30542is1dFocusSearch3ESFkO8(iM30517unboximpl)) {
                        return super.focusSearch(view, i10);
                    }
                    Object obj = ref$ObjectRef.f23402c;
                    AbstractC9979u.m20291d(obj);
                    if (TwoDimensionalFocusSearchKt.m30585isBetterCandidateI7lrPNg(FocusTraversalKt.focusRect((FocusTargetNode) obj), FocusInteropUtils_androidKt.calculateBoundingRectRelativeTo(viewFindNextFocus, this), rectCalculateBoundingRectRelativeTo, iM30517unboximpl)) {
                    }
                }
                return this;
            }
            if (viewFindNextFocus == null) {
            }
            return viewFindNextFocus;
        }
        return view;
    }

    @Override // androidx.compose.p014ui.node.RootForTest
    public void forceAccessibilityForTesting(boolean z10) {
        this.composeAccessibilityDelegate.setAccessibilityForceEnabledForTesting$ui_release(z10);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void forceMeasureTheSubtree(LayoutNode layoutNode, boolean z10) {
        this.measureAndLayoutDelegate.forceMeasureTheSubtree(layoutNode, z10);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        AbstractC9979u.m20291d(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public Autofill getAutofill() {
        return this._autofill;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public androidx.compose.p014ui.autofill.AutofillManager getAutofillManager() {
        return this._autofillManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final InterfaceC9540l getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.contentCaptureManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public InterfaceC9945d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.p014ui.node.Owner, androidx.compose.p014ui.node.RootForTest
    public Density getDensity() {
        return (Density) this.density$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.node.Owner
    /* renamed from: getFocusDirection-P8AzH3I */
    public FocusDirection mo32570getFocusDirectionP8AzH3I(android.view.KeyEvent keyEvent) {
        long jM31959getKeyZmokQxo = KeyEvent_androidKt.m31959getKeyZmokQxo(keyEvent);
        Key.Companion companion = Key.Companion;
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31887getTabEK5gGoQ())) {
            return FocusDirection.m30511boximpl(KeyEvent_androidKt.m31965isShiftPressedZmokQxo(keyEvent) ? FocusDirection.Companion.m30523getPreviousdhqQ8s() : FocusDirection.Companion.m30522getNextdhqQ8s());
        }
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31728getDirectionRightEK5gGoQ())) {
            return FocusDirection.m30511boximpl(FocusDirection.Companion.m30524getRightdhqQ8s());
        }
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31727getDirectionLeftEK5gGoQ())) {
            return FocusDirection.m30511boximpl(FocusDirection.Companion.m30521getLeftdhqQ8s());
        }
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31729getDirectionUpEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31840getPageUpEK5gGoQ())) {
            return FocusDirection.m30511boximpl(FocusDirection.Companion.m30525getUpdhqQ8s());
        }
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31724getDirectionDownEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31839getPageDownEK5gGoQ())) {
            return FocusDirection.m30511boximpl(FocusDirection.Companion.m30518getDowndhqQ8s());
        }
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31723getDirectionCenterEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31737getEnterEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31829getNumPadEnterEK5gGoQ())) {
            return FocusDirection.m30511boximpl(FocusDirection.Companion.m30519getEnterdhqQ8s());
        }
        if (Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31666getBackEK5gGoQ()) ? true : Key.m31651equalsimpl0(jM31959getKeyZmokQxo, companion.m31740getEscapeEK5gGoQ())) {
            return FocusDirection.m30511boximpl(FocusDirection.Companion.m30520getExitdhqQ8s());
        }
        return null;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public FocusOwner getFocusOwner() {
        return this.focusOwner;
    }

    @Override // android.view.View
    public void getFocusedRect(android.graphics.Rect rect) {
        Rect rectOnFetchFocusRect = onFetchFocusRect();
        if (rectOnFetchFocusRect != null) {
            rect.left = Math.round(rectOnFetchFocusRect.getLeft());
            rect.top = Math.round(rectOnFetchFocusRect.getTop());
            rect.right = Math.round(rectOnFetchFocusRect.getRight());
            rect.bottom = Math.round(rectOnFetchFocusRect.getBottom());
            return;
        }
        if (AbstractC9979u.m20289b(getFocusOwner().mo30534focusSearchULY8qGw(FocusDirection.Companion.m30518getDowndhqQ8s(), null, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView.getFocusedRect.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.TRUE;
            }
        }), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    @Override // androidx.compose.p014ui.node.Owner
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.fontFamilyResolver$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.node.Owner
    public Font.ResourceLoader getFontLoader() {
        return this.fontLoader;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public GraphicsContext getGraphicsContext() {
        return this.graphicsContext;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @Override // androidx.compose.p014ui.platform.ViewRootForTest
    public boolean getHasPendingMeasureOrLayout() {
        return this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public InputModeManager getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, androidx.compose.p014ui.node.Owner
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.node.Owner
    public long getMeasureIteration() {
        return this.measureAndLayoutDelegate.getMeasureIteration();
    }

    @Override // androidx.compose.p014ui.node.Owner
    public ModifierLocalManager getModifierLocalManager() {
        return this.modifierLocalManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.PlacementScope(this);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public PointerIconService getPointerIconService() {
        return this.pointerIconService;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public RectManager getRectManager() {
        return this.rectManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public LayoutNode getRoot() {
        return this.root;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public RootForTest getRootForTest() {
        return this.rootForTest;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return false;
        }
        return scrollCapture.getScrollCaptureInProgress();
    }

    @Override // androidx.compose.p014ui.node.Owner, androidx.compose.p014ui.node.RootForTest
    public SemanticsOwner getSemanticsOwner() {
        return this.semanticsOwner;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.softwareKeyboardController;
    }

    @Override // androidx.compose.p014ui.node.Owner, androidx.compose.p014ui.node.RootForTest
    public TextInputService getTextInputService() {
        return this.textInputService;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @Override // androidx.compose.p014ui.platform.ViewRootForTest
    public View getView() {
        return this;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public ViewConfiguration getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.viewTreeOwners$delegate.getValue();
    }

    @Override // androidx.compose.p014ui.node.Owner
    public WindowInfo getWindowInfo() {
        return this._windowInfo;
    }

    public final AndroidAutofillManager get_autofillManager$ui_release() {
        return this._autofillManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void incrementSensitiveComponentCount() {
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.sensitiveComponentCount == 0) {
                AndroidComposeViewSensitiveContent35.INSTANCE.setContentSensitivity(getView(), true);
            }
            this.sensitiveComponentCount++;
        }
    }

    @Override // androidx.compose.p014ui.platform.ViewRootForTest
    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    @Override // androidx.compose.p014ui.platform.ViewRootForTest
    public boolean isLifecycleInResumedState() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        return ((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : lifecycle.getCurrentState()) == Lifecycle.State.RESUMED;
    }

    @Override // androidx.compose.p014ui.input.pointer.MatrixPositionCalculator
    /* renamed from: localToScreen-58bKbWc */
    public void mo32033localToScreen58bKbWc(float[] fArr) {
        recalculateWindowPosition();
        Matrix.m31127timesAssign58bKbWc(fArr, this.viewToWindowMatrix);
        AndroidComposeView_androidKt.m32636preTranslatecG2Xzmc(fArr, Float.intBitsToFloat((int) (this.windowPosition >> 32)), Float.intBitsToFloat((int) (this.windowPosition & 4294967295L)), this.tmpMatrix);
    }

    @Override // androidx.compose.p014ui.input.pointer.PositionCalculator
    /* renamed from: localToScreen-MK-Hz9U */
    public long mo32184localToScreenMKHz9U(long j10) {
        recalculateWindowPosition();
        long jM31114mapMKHz9U = Matrix.m31114mapMKHz9U(this.viewToWindowMatrix, j10);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jM31114mapMKHz9U >> 32)) + Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM31114mapMKHz9U & 4294967295L)) + Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void measureAndLayout(boolean z10) {
        InterfaceC9529a interfaceC9529a;
        if (this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout() || this.measureAndLayoutDelegate.getHasPendingOnPositionedCallbacks()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z10) {
                try {
                    interfaceC9529a = this.resendMotionEventOnLayout;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                interfaceC9529a = null;
            }
            if (this.measureAndLayoutDelegate.measureAndLayout(interfaceC9529a)) {
                requestLayout();
            }
            MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
            dispatchPendingInteropLayoutCallbacks();
            C10786q c10786q = C10786q.f26013a;
            Trace.endSection();
        }
    }

    @Override // androidx.compose.p014ui.node.Owner
    /* renamed from: measureAndLayout-0kLqBqw */
    public void mo32571measureAndLayout0kLqBqw(LayoutNode layoutNode, long j10) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.m32450measureAndLayout0kLqBqw(layoutNode, j10);
            if (!this.measureAndLayoutDelegate.getHasPendingMeasureOrLayout()) {
                MeasureAndLayoutDelegate.dispatchOnPositionedCallbacks$default(this.measureAndLayoutDelegate, false, 1, null);
                dispatchPendingInteropLayoutCallbacks();
            }
            if (ComposeUiFlags.isRectTrackingEnabled) {
                getRectManager().dispatchCallbacks();
            }
            C10786q c10786q = C10786q.f26013a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.p014ui.node.RootForTest
    public void measureAndLayoutForTest() {
        Owner.measureAndLayout$default(this, false, 1, null);
    }

    public final void notifyLayerIsDirty$ui_release(OwnedLayer ownedLayer, boolean z10) {
        if (!z10) {
            if (this.isDrawingContent) {
                return;
            }
            this.dirtyLayers.remove(ownedLayer);
            List<OwnedLayer> list = this.postponedDirtyLayers;
            if (list != null) {
                list.remove(ownedLayer);
                return;
            }
            return;
        }
        if (!this.isDrawingContent) {
            this.dirtyLayers.add(ownedLayer);
            return;
        }
        List arrayList = this.postponedDirtyLayers;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.postponedDirtyLayers = arrayList;
        }
        arrayList.add(ownedLayer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        AndroidAutofill androidAutofill;
        super.onAttachedToWindow();
        this._windowInfo.setWindowFocused(hasWindowFocus());
        this._windowInfo.setOnInitializeContainerSize(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                return IntSize.m33664boximpl(m32626invokeYbymL2g());
            }

            /* renamed from: invoke-YbymL2g, reason: not valid java name */
            public final long m32626invokeYbymL2g() {
                return AndroidWindowInfo_androidKt.calculateWindowSize(AndroidComposeView.this);
            }
        });
        updateWindowMetrics();
        invalidateLayoutNodeMeasurement(getRoot());
        invalidateLayers(getRoot());
        getSnapshotObserver().startObserving$ui_release();
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.register(androidAutofill);
        }
        LifecycleOwner lifecycleOwner3 = ViewTreeLifecycleOwner.get(this);
        SavedStateRegistryOwner savedStateRegistryOwner = ViewTreeSavedStateRegistryOwner.get(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle2 = null;
        if (viewTreeOwners == null || (lifecycleOwner3 != null && savedStateRegistryOwner != null && (lifecycleOwner3 != viewTreeOwners.getLifecycleOwner() || savedStateRegistryOwner != viewTreeOwners.getLifecycleOwner()))) {
            if (lifecycleOwner3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (savedStateRegistryOwner == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.removeObserver(this);
            }
            lifecycleOwner3.getLifecycle().addObserver(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(lifecycleOwner3, savedStateRegistryOwner);
            set_viewTreeOwners(viewTreeOwners2);
            InterfaceC9540l interfaceC9540l = this.onViewTreeOwnersAvailable;
            if (interfaceC9540l != null) {
                interfaceC9540l.invoke(viewTreeOwners2);
            }
            this.onViewTreeOwnersAvailable = null;
        }
        this._inputModeManager.m31645setInputModeiuPiT84(isInTouchMode() ? InputMode.Companion.m31642getTouchaOaMEAU() : InputMode.Companion.m31641getKeyboardaOaMEAU());
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        if (viewTreeOwners3 != null && (lifecycleOwner2 = viewTreeOwners3.getLifecycleOwner()) != null) {
            lifecycle2 = lifecycleOwner2.getLifecycle();
        }
        if (lifecycle2 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle2.addObserver(this);
        lifecycle2.addObserver(this.contentCaptureManager);
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().addOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.setViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getFocusOwner().getListeners().add(androidAutofillManager);
            getSemanticsOwner().getListeners$ui_release().add(androidAutofillManager);
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m30453getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.isEditorFocused() : androidPlatformTextInputSession.isReadyForConnection();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AndroidDensity_androidKt.Density(getContext()));
        updateWindowMetrics();
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            setFontFamilyResolver(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext()));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.m30453getCurrentSessionimpl(this.textInputSessionMutex);
        return androidPlatformTextInputSession == null ? this.legacyTextInputServiceAndroid.createInputConnection(editorInfo) : androidPlatformTextInputSession.createInputConnection(editorInfo);
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer<ViewTranslationRequest> consumer) {
        this.contentCaptureManager.onCreateVirtualViewTranslationRequests$ui_release(jArr, iArr, consumer);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onDetach(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        getLayoutNodes().remove(layoutNode.getSemanticsId());
        this.measureAndLayoutDelegate.onNodeDetached(layoutNode);
        requestClearInvalidObservations();
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().remove(layoutNode);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onDetach$ui_release(layoutNode);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AndroidAutofill androidAutofill;
        LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        getSnapshotObserver().stopObserving$ui_release();
        Lifecycle lifecycle = null;
        this._windowInfo.setOnInitializeContainerSize(null);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) != null) {
            lifecycle = lifecycleOwner.getLifecycle();
        }
        if (lifecycle == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("No lifecycle owner exists");
            throw new KotlinNothingValueException();
        }
        lifecycle.removeObserver(this.contentCaptureManager);
        lifecycle.removeObserver(this);
        if (autofillSupported() && (androidAutofill = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.INSTANCE.clearViewTranslationCallback(this);
        }
        AndroidAutofillManager androidAutofillManager = this._autofillManager;
        if (androidAutofillManager != null) {
            getSemanticsOwner().getListeners$ui_release().remove(androidAutofillManager);
            getFocusOwner().getListeners().remove(androidAutofillManager);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onEndApplyChanges() {
        AndroidAutofillManager androidAutofillManager;
        if (this.observationClearRequested) {
            getSnapshotObserver().clearInvalidObservations$ui_release();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onEndApplyChanges$ui_release();
        }
        while (this.endApplyChangesListeners.isNotEmpty() && this.endApplyChangesListeners.get(0) != null) {
            int size = this.endApplyChangesListeners.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                InterfaceC9529a interfaceC9529a = this.endApplyChangesListeners.get(i10);
                this.endApplyChangesListeners.set(i10, null);
                if (interfaceC9529a != null) {
                    interfaceC9529a.invoke();
                }
            }
            this.endApplyChangesListeners.removeRange(0, size);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, android.graphics.Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (z10 || hasFocus()) {
            return;
        }
        getFocusOwner().releaseFocus();
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onInteropViewLayoutChange(View view) {
        this.isPendingInteropViewLayoutChangeDispatch = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) throws Throwable {
        this.lastMatrixRecalculationAnimationTime = 0L;
        this.measureAndLayoutDelegate.measureAndLayout(this.resendMotionEventOnLayout);
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onLayoutChange(LayoutNode layoutNode) {
        this.composeAccessibilityDelegate.onLayoutChange$ui_release(layoutNode);
        this.contentCaptureManager.onLayoutChange$ui_release();
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onLayoutNodeDeactivated(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (ComposeUiFlags.isRectTrackingEnabled) {
            getRectManager().remove(layoutNode);
        }
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onLayoutNodeDeactivated$ui_release(layoutNode);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            long jM32613convertMeasureSpecI7RO_PI = m32613convertMeasureSpecI7RO_PI(i10);
            int iM23023b = (int) C10781l.m23023b(jM32613convertMeasureSpecI7RO_PI >>> 32);
            int iM23023b2 = (int) C10781l.m23023b(jM32613convertMeasureSpecI7RO_PI & 4294967295L);
            long jM32613convertMeasureSpecI7RO_PI2 = m32613convertMeasureSpecI7RO_PI(i11);
            long jM33462fitPrioritizingHeightZbe2FdA = Constraints.Companion.m33462fitPrioritizingHeightZbe2FdA(iM23023b, iM23023b2, (int) C10781l.m23023b(jM32613convertMeasureSpecI7RO_PI2 >>> 32), (int) C10781l.m23023b(4294967295L & jM32613convertMeasureSpecI7RO_PI2));
            Constraints constraints = this.onMeasureConstraints;
            boolean zM33447equalsimpl0 = false;
            if (constraints == null) {
                this.onMeasureConstraints = Constraints.m33441boximpl(jM33462fitPrioritizingHeightZbe2FdA);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (constraints != null) {
                    zM33447equalsimpl0 = Constraints.m33447equalsimpl0(constraints.m33460unboximpl(), jM33462fitPrioritizingHeightZbe2FdA);
                }
                if (!zM33447equalsimpl0) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.m32451updateRootConstraintsBRTryo0(jM33462fitPrioritizingHeightZbe2FdA);
            this.measureAndLayoutDelegate.measureOnly();
            setMeasuredDimension(getRoot().getWidth(), getRoot().getHeight());
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().getHeight(), 1073741824));
            }
            C10786q c10786q = C10786q.f26013a;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onPostAttach(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostAttach$ui_release(layoutNode);
        }
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onPostLayoutNodeReused(LayoutNode layoutNode, int i10) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.onPostLayoutNodeReused$ui_release(layoutNode, i10);
        }
        getRectManager().m32753onLayoutPositionChanged70tqf50(layoutNode, layoutNode.getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().m32456getLastPositionnOccac$ui_release(), true);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onPreAttach(LayoutNode layoutNode) {
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onPreLayoutNodeReused(LayoutNode layoutNode, int i10) {
        getLayoutNodes().remove(i10);
        getLayoutNodes().set(layoutNode.getSemanticsId(), layoutNode);
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i10) {
        AndroidAutofillManager androidAutofillManager;
        if (!autofillSupported() || viewStructure == null) {
            return;
        }
        if (ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.populateViewStructure(viewStructure);
        }
        AndroidAutofill androidAutofill = this._autofill;
        if (androidAutofill != null) {
            AndroidAutofill_androidKt.populateViewStructure(androidAutofill, viewStructure);
        }
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onRequestMeasure(LayoutNode layoutNode, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            if (this.measureAndLayoutDelegate.requestLookaheadRemeasure(layoutNode, z11) && z12) {
                scheduleMeasureAndLayout(layoutNode);
                return;
            }
            return;
        }
        if (this.measureAndLayoutDelegate.requestRemeasure(layoutNode, z11) && z12) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onRequestRelayout(LayoutNode layoutNode, boolean z10, boolean z11) {
        if (z10) {
            if (this.measureAndLayoutDelegate.requestLookaheadRelayout(layoutNode, z11)) {
                scheduleMeasureAndLayout$default(this, null, 1, null);
            }
        } else if (this.measureAndLayoutDelegate.requestRelayout(layoutNode, z11)) {
            scheduleMeasureAndLayout$default(this, null, 1, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi(24)
    public android.view.PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        PointerIcon stylusHoverIcon;
        int toolType = motionEvent.getToolType(i10);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(InputDeviceCompat.SOURCE_STYLUS) || !(toolType == 2 || toolType == 4) || (stylusHoverIcon = getPointerIconService().getStylusHoverIcon()) == null) ? super.onResolvePointerIcon(motionEvent, i10) : AndroidComposeViewVerificationHelperMethodsN.INSTANCE.toAndroidPointerIcon(getContext(), stylusHoverIcon);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.getIsShowingLayoutBounds());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        if (this.superclassInitComplete) {
            LayoutDirection layoutDirection = FocusInteropUtils_androidKt.toLayoutDirection(i10);
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer<ScrollCaptureTarget> consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.scrollCapture) == null) {
            return;
        }
        scrollCapture.onScrollCaptureSearch(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void onSemanticsChange() {
        this.composeAccessibilityDelegate.onSemanticsChange$ui_release();
        this.contentCaptureManager.onSemanticsChange$ui_release();
    }

    @Override // android.view.View
    @RequiresApi(31)
    public void onVirtualViewTranslationResponses(LongSparseArray<ViewTranslationResponse> longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.contentCaptureManager;
        androidContentCaptureManager.onVirtualViewTranslationResponses$ui_release(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        boolean isShowingLayoutBounds;
        this._windowInfo.setWindowFocused(z10);
        this.keyboardModifiersRequireUpdate = true;
        super.onWindowFocusChanged(z10);
        if (!z10 || getShowLayoutBounds() == (isShowingLayoutBounds = Companion.getIsShowingLayoutBounds())) {
            return;
        }
        setShowLayoutBounds(isShowingLayoutBounds);
        invalidateDescendants();
    }

    public final boolean recycle$ui_release(OwnedLayer ownedLayer) {
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getShouldUseDispatchDraw();
        }
        this.layerCache.push(ownedLayer);
        this.dirtyLayers.remove(ownedLayer);
        return true;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void registerOnEndApplyChangesListener(InterfaceC9529a interfaceC9529a) {
        if (this.endApplyChangesListeners.contains(interfaceC9529a)) {
            return;
        }
        this.endApplyChangesListeners.add(interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void registerOnLayoutCompletedListener(Owner.OnLayoutCompletedListener onLayoutCompletedListener) {
        this.measureAndLayoutDelegate.registerOnLayoutCompletedListener(onLayoutCompletedListener);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    public final void removeAndroidView(final AndroidViewHolder androidViewHolder) {
        registerOnEndApplyChangesListener(new InterfaceC9529a() { // from class: androidx.compose.ui.platform.AndroidComposeView.removeAndroidView.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m32627invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m32627invoke() {
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(androidViewHolder);
                AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder));
                androidViewHolder.setImportantForAccessibility(0);
            }
        });
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void requestAutofill(LayoutNode layoutNode) {
        AndroidAutofillManager androidAutofillManager;
        if (autofillSupported() && ComposeUiFlags.isSemanticAutofillEnabled && (androidAutofillManager = this._autofillManager) != null) {
            androidAutofillManager.requestAutofill$ui_release(layoutNode);
        }
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, android.graphics.Rect rect) {
        View viewFindNextNonChildView;
        if (!ComposeUiFlags.isViewFocusFixEnabled) {
            if (isFocused()) {
                return true;
            }
            if (getFocusOwner().getRootState().getHasFocus()) {
                return super.requestFocus(i10, rect);
            }
            FocusDirection focusDirection = FocusInteropUtils_androidKt.toFocusDirection(i10);
            final int iM30517unboximpl = focusDirection != null ? focusDirection.m30517unboximpl() : FocusDirection.Companion.m30519getEnterdhqQ8s();
            return AbstractC9979u.m20289b(getFocusOwner().mo30534focusSearchULY8qGw(iM30517unboximpl, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView.requestFocus.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(FocusTargetNode focusTargetNode) {
                    return Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(iM30517unboximpl));
                }
            }), Boolean.TRUE);
        }
        if (isFocused()) {
            return true;
        }
        if (this.processingRequestFocusForNextNonChildView || getFocusOwner().getFocusTransactionManager().getOngoingTransaction()) {
            return false;
        }
        FocusDirection focusDirection2 = FocusInteropUtils_androidKt.toFocusDirection(i10);
        final int iM30517unboximpl2 = focusDirection2 != null ? focusDirection2.m30517unboximpl() : FocusDirection.Companion.m30519getEnterdhqQ8s();
        if (hasFocus() && m32615onMoveFocusInChildren3ESFkO8(iM30517unboximpl2)) {
            return true;
        }
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Boolean boolMo30534focusSearchULY8qGw = getFocusOwner().mo30534focusSearchULY8qGw(iM30517unboximpl2, rect != null ? RectHelper_androidKt.toComposeRect(rect) : null, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocus$focusSearchResult$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                ref$BooleanRef.f23398c = true;
                return Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(iM30517unboximpl2));
            }
        });
        if (boolMo30534focusSearchULY8qGw == null) {
            return false;
        }
        if (boolMo30534focusSearchULY8qGw.booleanValue()) {
            return true;
        }
        if (ref$BooleanRef.f23398c) {
            return false;
        }
        if ((rect != null && !hasFocus() && AbstractC9979u.m20289b(getFocusOwner().mo30534focusSearchULY8qGw(iM30517unboximpl2, null, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocus$altFocus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(FocusTargetNode focusTargetNode) {
                return Boolean.valueOf(focusTargetNode.mo30549requestFocus3ESFkO8(iM30517unboximpl2));
            }
        }), Boolean.TRUE)) || (viewFindNextNonChildView = findNextNonChildView(i10)) == null || viewFindNextNonChildView == this) {
            return true;
        }
        this.processingRequestFocusForNextNonChildView = true;
        boolean zRequestFocus = viewFindNextNonChildView.requestFocus(i10);
        this.processingRequestFocusForNextNonChildView = false;
        return zRequestFocus;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void requestOnPositionedCallback(LayoutNode layoutNode) {
        this.measureAndLayoutDelegate.requestOnPositionedCallback(layoutNode);
        scheduleMeasureAndLayout$default(this, null, 1, null);
    }

    @Override // androidx.compose.p014ui.input.pointer.PositionCalculator
    /* renamed from: screenToLocal-MK-Hz9U */
    public long mo32185screenToLocalMKHz9U(long j10) {
        recalculateWindowPosition();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - Float.intBitsToFloat((int) (this.windowPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - Float.intBitsToFloat((int) (this.windowPosition & 4294967295L));
        return Matrix.m31114mapMKHz9U(this.windowToViewMatrix, Offset.m30629constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat2))));
    }

    @Override // androidx.compose.p014ui.node.RootForTest
    /* renamed from: sendKeyEvent-ZmokQxo */
    public boolean mo32572sendKeyEventZmokQxo(android.view.KeyEvent keyEvent) {
        return getFocusOwner().mo30532dispatchInterceptedSoftKeyboardEventZmokQxo(keyEvent) || FocusOwner.m30530dispatchKeyEventYhN2O0w$default(getFocusOwner(), keyEvent, null, 2, null);
    }

    @Override // androidx.compose.p014ui.node.RootForTest
    public void setAccessibilityEventBatchIntervalMillis(long j10) {
        this.composeAccessibilityDelegate.setSendRecurringAccessibilityEventsIntervalMillis$ui_release(j10);
    }

    public final void setConfigurationChangeObserver(InterfaceC9540l interfaceC9540l) {
        this.configurationChangeObserver = interfaceC9540l;
    }

    public final void setContentCaptureManager$ui_release(AndroidContentCaptureManager androidContentCaptureManager) {
        this.contentCaptureManager = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public void setCoroutineContext(InterfaceC9945d interfaceC9945d) {
        this.coroutineContext = interfaceC9945d;
        DelegatableNode head$ui_release = getRoot().getNodes$ui_release().getHead$ui_release();
        if (head$ui_release instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) head$ui_release).resetPointerInputHandler();
        }
        int iM32510constructorimpl = NodeKind.m32510constructorimpl(16);
        if (!head$ui_release.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = head$ui_release.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, head$ui_release.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & iM32510constructorimpl) != 0) {
                for (Modifier.Node child$ui_release2 = node; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                        DelegatingNode delegatingNodePop = child$ui_release2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNodePop != 0) {
                            if (delegatingNodePop instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) delegatingNodePop;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).resetPointerInputHandler();
                                }
                            } else if ((delegatingNodePop.getKindSet$ui_release() & iM32510constructorimpl) != 0 && (delegatingNodePop instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNodePop.getDelegate$ui_release();
                                int i10 = 0;
                                delegatingNodePop = delegatingNodePop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM32510constructorimpl) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            delegatingNodePop = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNodePop != 0) {
                                                mutableVector2.add(delegatingNodePop);
                                                delegatingNodePop = 0;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNodePop = delegatingNodePop;
                                }
                                if (i10 == 1) {
                                }
                            }
                            delegatingNodePop = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j10) {
        this.lastMatrixRecalculationAnimationTime = j10;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC9540l interfaceC9540l) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC9540l.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.onViewTreeOwnersAvailable = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public void setShowLayoutBounds(boolean z10) {
        this.showLayoutBounds = z10;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.p014ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object textInputSession(p181hd.InterfaceC9544p r5, vc.InterfaceC11588c<?> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.p014ui.platform.AndroidComposeView.C29551
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.p014ui.platform.AndroidComposeView.C29551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            kotlin.AbstractC9924b.m20071b(r6)
            goto L44
        L31:
            kotlin.AbstractC9924b.m20071b(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.textInputSessionMutex
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>()
            r0.label = r3
            java.lang.Object r5 = androidx.compose.p014ui.SessionMutex.m30456withSessionCancellingPreviousimpl(r6, r2, r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.AndroidComposeView.textInputSession(hd.p, vc.c):java.lang.Object");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        AbstractC9979u.m20291d(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addView(view, i10, layoutParams);
    }

    @Override // androidx.compose.p014ui.node.Owner
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.accessibilityManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public AndroidClipboard getClipboard() {
        return this.clipboard;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public AndroidClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public AndroidDragAndDropManager getDragAndDropManager() {
        return this.dragAndDropManager;
    }

    @Override // androidx.compose.p014ui.node.Owner
    public MutableIntObjectMap<LayoutNode> getLayoutNodes() {
        return this.layoutNodes;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i10;
        layoutParamsGenerateDefaultLayoutParams.height = i11;
        C10786q c10786q = C10786q.f26013a;
        addView(view, -1, layoutParamsGenerateDefaultLayoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i10, layoutParams, true);
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        float[] fArr = this.viewToWindowMatrix;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long jM31114mapMKHz9U = Matrix.m31114mapMKHz9U(fArr, Offset.m30629constructorimpl((Float.floatToRawIntBits(y10) & 4294967295L) | (Float.floatToRawIntBits(x10) << 32)));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM31114mapMKHz9U >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM31114mapMKHz9U & 4294967295L));
        this.windowPosition = Offset.m30629constructorimpl((Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L));
    }
}
