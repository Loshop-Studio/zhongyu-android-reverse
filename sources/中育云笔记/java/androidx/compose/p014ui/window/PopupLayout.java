package androidx.compose.p014ui.window;

import android.R;
import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p014ui.C2638R;
import androidx.compose.p014ui.UiComposable;
import androidx.compose.p014ui.layout.LayoutCoordinates;
import androidx.compose.p014ui.layout.LayoutCoordinatesKt;
import androidx.compose.p014ui.platform.AbstractComposeView;
import androidx.compose.p014ui.platform.ViewRootForInspector;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.p014ui.unit.IntRect;
import androidx.compose.p014ui.unit.IntRectKt;
import androidx.compose.p014ui.unit.IntSize;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Ref$LongRef;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    private Object backCallback;
    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private InterfaceC9529a onDismissRequest;
    private final WindowManager.LayoutParams params;
    private IntRect parentBounds;
    private final MutableState parentLayoutCoordinates$delegate;
    private LayoutDirection parentLayoutDirection;
    private final MutableState popupContentSize$delegate;
    private final PopupLayoutHelper popupLayoutHelper;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private final SnapshotStateObserver snapshotStateObserver;
    private String testTag;
    private final WindowManager windowManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC9540l onCommitAffectingPopupPosition = new InterfaceC9540l() { // from class: androidx.compose.ui.window.PopupLayout$Companion$onCommitAffectingPopupPosition$1
        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PopupLayout) obj);
            return C10786q.f26013a;
        }

        public final void invoke(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.updatePosition();
            }
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PopupLayout(InterfaceC9529a interfaceC9529a, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, PopupLayoutHelper popupLayoutHelper, int i10, AbstractC9972n abstractC9972n) {
        PopupLayoutHelper popupLayoutHelperImpl29;
        if ((i10 & 128) != 0) {
            popupLayoutHelperImpl29 = Build.VERSION.SDK_INT >= 29 ? new PopupLayoutHelperImpl29() : new PopupLayoutHelperImpl();
        } else {
            popupLayoutHelperImpl29 = popupLayoutHelper;
        }
        this(interfaceC9529a, popupProperties, str, view, density, popupPositionProvider, uuid, popupLayoutHelperImpl29);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = AndroidPopup_androidKt.flagsWithSecureFlagInherited(this.properties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        layoutParams.type = 1002;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(C2638R.string.default_popup_window_title));
        return layoutParams;
    }

    private final InterfaceC9544p getContent() {
        return (InterfaceC9544p) this.content$delegate.getValue();
    }

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final IntRect getVisibleDisplayBounds() {
        Rect rect = this.previousWindowVisibleFrame;
        this.popupLayoutHelper.getWindowVisibleDisplayFrame(this.composeView, rect);
        return AndroidPopup_androidKt.toIntBounds(rect);
    }

    private final void maybeRegisterBackCallback() {
        if (!this.properties.getDismissOnBackPress() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.backCallback == null) {
            this.backCallback = Api33Impl.createBackCallback(this.onDismissRequest);
        }
        Api33Impl.maybeRegisterBackCallback(this, this.backCallback);
    }

    private final void maybeUnregisterBackCallback() {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.maybeUnregisterBackCallback(this, this.backCallback);
        }
        this.backCallback = null;
    }

    private final void setContent(InterfaceC9544p interfaceC9544p) {
        this.content$delegate.setValue(interfaceC9544p);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.parentLayoutCoordinates$delegate.setValue(layoutCoordinates);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i11);
    }

    private final void updatePopupProperties(PopupProperties popupProperties) {
        if (AbstractC9979u.m20289b(this.properties, popupProperties)) {
            return;
        }
        if (popupProperties.getUsePlatformDefaultWidth() && !this.properties.getUsePlatformDefaultWidth()) {
            WindowManager.LayoutParams layoutParams = this.params;
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        this.properties = popupProperties;
        this.params.flags = AndroidPopup_androidKt.flagsWithSecureFlagInherited(popupProperties, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.p014ui.platform.AbstractComposeView
    @Composable
    @UiComposable
    public void Content(Composer composer, int i10) {
        composer.startReplaceGroup(-857613600);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-857613600, i10, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:572)");
        }
        getContent().invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.properties.getDismissOnBackPress()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC9529a interfaceC9529a = this.onDismissRequest;
                if (interfaceC9529a != null) {
                    interfaceC9529a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m33767getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.p014ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.p014ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.p014ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z10, int i10, int i11, int i12, int i13) {
        View childAt;
        super.internalOnLayout$ui_release(z10, i10, i11, i12, i13);
        if (this.properties.getUsePlatformDefaultWidth() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.params.width = childAt.getMeasuredWidth();
        this.params.height = childAt.getMeasuredHeight();
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    @Override // androidx.compose.p014ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i10, int i11) {
        if (this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(i10, i11);
        } else {
            IntRect visibleDisplayBounds = getVisibleDisplayBounds();
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.getHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.p014ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotStateObserver.start();
        maybeRegisterBackCallback();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotStateObserver.stop();
        this.snapshotStateObserver.clear();
        maybeUnregisterBackCallback();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC9529a interfaceC9529a = this.onDismissRequest;
            if (interfaceC9529a != null) {
                interfaceC9529a.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC9529a interfaceC9529a2 = this.onDismissRequest;
        if (interfaceC9529a2 != null) {
            interfaceC9529a2.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i10 == iArr2[0] && i11 == iArr2[1]) {
            return;
        }
        updateParentBounds$ui_release();
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m33768setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(InterfaceC9529a interfaceC9529a, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        this.onDismissRequest = interfaceC9529a;
        this.testTag = str;
        updatePopupProperties(popupProperties);
        superSetLayoutDirection(layoutDirection);
    }

    @VisibleForTesting
    public final void updateParentBounds$ui_release() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.isAttached()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo32237getSizeYbymL2g = parentLayoutCoordinates.mo32237getSizeYbymL2g();
            long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(parentLayoutCoordinates);
            IntRect intRectM33662IntRectVbeCjmY = IntRectKt.m33662IntRectVbeCjmY(IntOffset.m33623constructorimpl((Math.round(Float.intBitsToFloat((int) (jPositionInWindow >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jPositionInWindow & 4294967295L))))), jMo32237getSizeYbymL2g);
            if (AbstractC9979u.m20289b(intRectM33662IntRectVbeCjmY, this.parentBounds)) {
                return;
            }
            this.parentBounds = intRectM33662IntRectVbeCjmY;
            updatePosition();
        }
    }

    public final void updateParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        IntSize intSizeM33767getPopupContentSizebOM6tXw;
        final IntRect intRect = this.parentBounds;
        if (intRect == null || (intSizeM33767getPopupContentSizebOM6tXw = m33767getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long jM33676unboximpl = intSizeM33767getPopupContentSizebOM6tXw.m33676unboximpl();
        IntRect visibleDisplayBounds = getVisibleDisplayBounds();
        final long jM33667constructorimpl = IntSize.m33667constructorimpl((visibleDisplayBounds.getWidth() << 32) | (visibleDisplayBounds.getHeight() & 4294967295L));
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.f23401c = IntOffset.Companion.m33640getZeronOccac();
        this.snapshotStateObserver.observeReads(this, onCommitAffectingPopupPosition, new InterfaceC9529a() { // from class: androidx.compose.ui.window.PopupLayout.updatePosition.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33769invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33769invoke() {
                ref$LongRef.f23401c = this.getPositionProvider().mo27067calculatePositionllwVHH4(intRect, jM33667constructorimpl, this.getParentLayoutDirection(), jM33676unboximpl);
            }
        });
        this.params.x = IntOffset.m33629getXimpl(ref$LongRef.f23401c);
        this.params.y = IntOffset.m33630getYimpl(ref$LongRef.f23401c);
        if (this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, (int) (jM33667constructorimpl >> 32), (int) (jM33667constructorimpl & 4294967295L));
        }
        this.popupLayoutHelper.updateViewLayout(this.windowManager, this, this.params);
    }

    public final void setContent(CompositionContext compositionContext, InterfaceC9544p interfaceC9544p) {
        setParentCompositionContext(compositionContext);
        setContent(interfaceC9544p);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public PopupLayout(InterfaceC9529a interfaceC9529a, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid, PopupLayoutHelper popupLayoutHelper) {
        super(view.getContext(), null, 0, 6, null);
        this.onDismissRequest = interfaceC9529a;
        this.properties = popupProperties;
        this.testTag = str;
        this.composeView = view;
        this.popupLayoutHelper = popupLayoutHelper;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC9979u.m20292e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (WindowManager) systemService;
        this.params = createLayoutParams();
        this.positionProvider = popupPositionProvider;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.popupContentSize$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.parentLayoutCoordinates$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new InterfaceC9529a() { // from class: androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Boolean invoke() {
                LayoutCoordinates parentLayoutCoordinates = this.this$0.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.isAttached()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || this.this$0.m33767getPopupContentSizebOM6tXw() == null) ? false : true);
            }
        });
        float fM33501constructorimpl = C3186Dp.m33501constructorimpl(8);
        this.maxSupportedElevation = fM33501constructorimpl;
        this.previousWindowVisibleFrame = new Rect();
        this.snapshotStateObserver = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(R.id.content);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view));
        setTag(C2638R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.mo27099toPx0680j_4(fM33501constructorimpl));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                outline.setRect(0, 0, view2.getWidth(), view2.getHeight());
                outline.setAlpha(0.0f);
            }
        });
        this.content$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidPopup_androidKt.INSTANCE.m33766getLambda1$ui_release(), null, 2, null);
        this.locationOnScreen = new int[2];
    }
}
