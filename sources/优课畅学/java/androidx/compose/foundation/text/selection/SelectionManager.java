package androidx.compose.foundation.text.selection;

import androidx.annotation.VisibleForTesting;
import androidx.collection.LongIntMapKt;
import androidx.collection.LongObjectMap;
import androidx.collection.LongObjectMapKt;
import androidx.collection.MutableLongIntMap;
import androidx.collection.MutableLongObjectMap;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.focus.FocusChangedModifierKt;
import androidx.compose.p013ui.focus.FocusRequester;
import androidx.compose.p013ui.focus.FocusRequesterModifierKt;
import androidx.compose.p013ui.focus.FocusState;
import androidx.compose.p013ui.geometry.InlineClassHelperKt;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.hapticfeedback.HapticFeedback;
import androidx.compose.p013ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.p013ui.input.key.KeyEvent;
import androidx.compose.p013ui.input.key.KeyInputModifierKt;
import androidx.compose.p013ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p013ui.input.pointer.PointerInputScope;
import androidx.compose.p013ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p013ui.layout.LayoutCoordinates;
import androidx.compose.p013ui.layout.LayoutCoordinatesKt;
import androidx.compose.p013ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p013ui.platform.TextToolbar;
import androidx.compose.p013ui.platform.TextToolbarStatus;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p168l7.AbstractC9260b;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10576r;
import p300x7.InterfaceC10578t;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SelectionManager {
    public static final int $stable = 8;
    private LayoutCoordinates containerLayoutCoordinates;
    private final MutableState currentDragPosition$delegate;
    private final MutableState dragBeginPosition$delegate;
    private final MutableState dragTotalDistance$delegate;
    private final MutableState draggingHandle$delegate;
    private final MutableState endHandlePosition$delegate;
    private HapticFeedback hapticFeedBack;
    private InterfaceC10570l onCopyHandler;
    private Offset previousPosition;
    private SelectionLayout previousSelectionLayout;
    private final SelectionRegistrarImpl selectionRegistrar;
    private boolean showToolbar;
    private final MutableState startHandlePosition$delegate;
    private TextToolbar textToolbar;
    private final MutableState<Selection> _selection = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final MutableState<Boolean> _isInTouchMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    private InterfaceC10570l onSelectionChange = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$1
        {
            super(1);
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Selection) obj);
            return C8736p.f16368a;
        }

        public final void invoke(Selection selection) {
            this.this$0.setSelection(selection);
        }
    };
    private FocusRequester focusRequester = new FocusRequester();
    private final MutableState hasFocus$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$1 */
    public /* synthetic */ class C19601 extends FunctionReferenceImpl implements InterfaceC10559a {
        public C19601(Object obj) {
            super(0, obj, SelectionManager.class, "toolbarCopy", "toolbarCopy()V", 0);
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21662invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m21662invoke() {
            ((SelectionManager) this.receiver).toolbarCopy();
        }
    }

    /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$updateSelectionToolbar$2 */
    public /* synthetic */ class C19612 extends FunctionReferenceImpl implements InterfaceC10559a {
        public C19612(Object obj) {
            super(0, obj, SelectionManager.class, "selectAll", "selectAll$foundation_release()V", 0);
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m21663invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m21663invoke() {
            ((SelectionManager) this.receiver).selectAll$foundation_release();
        }
    }

    public SelectionManager(SelectionRegistrarImpl selectionRegistrarImpl) {
        this.selectionRegistrar = selectionRegistrarImpl;
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m24024boximpl(companion.m24051getZeroF1C5BW0()), null, 2, null);
        this.dragTotalDistance$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m24024boximpl(companion.m24051getZeroF1C5BW0()), null, 2, null);
        this.startHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.endHandlePosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        selectionRegistrarImpl.setOnPositionChangeCallback$foundation_release(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C8736p.f16368a;
            }

            public final void invoke(long j10) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j10)) {
                    SelectionManager.this.updateHandleOffsets();
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateStartCallback$foundation_release(new InterfaceC10576r() { // from class: androidx.compose.foundation.text.selection.SelectionManager.2
            {
                super(4);
            }

            @Override // p300x7.InterfaceC10576r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                m21657invokeRg1IO4c(((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, ((Offset) obj3).m24045unboximpl(), (SelectionAdjustment) obj4);
                return C8736p.f16368a;
            }

            /* renamed from: invoke-Rg1IO4c, reason: not valid java name */
            public final void m21657invokeRg1IO4c(boolean z10, LayoutCoordinates layoutCoordinates, long j10, SelectionAdjustment selectionAdjustment) {
                long jMo25635getSizeYbymL2g = layoutCoordinates.mo25635getSizeYbymL2g();
                Rect rect = new Rect(0.0f, 0.0f, (int) (jMo25635getSizeYbymL2g >> 32), (int) (jMo25635getSizeYbymL2g & 4294967295L));
                if (!SelectionManagerKt.m21665containsInclusiveUv8p0NA(rect, j10)) {
                    j10 = TextLayoutStateKt.m21470coerceIn3MmeM6k(j10, rect);
                }
                long jM21641convertToContainerCoordinatesR5De75A = SelectionManager.this.m21641convertToContainerCoordinatesR5De75A(layoutCoordinates, j10);
                if ((9223372034707292159L & jM21641convertToContainerCoordinatesR5De75A) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    SelectionManager.this.setInTouchMode(z10);
                    SelectionManager.this.m21648startSelection9KIMszo(jM21641convertToContainerCoordinatesR5De75A, false, selectionAdjustment);
                    FocusRequester.m23943requestFocus3ESFkO8$default(SelectionManager.this.getFocusRequester(), 0, 1, null);
                    SelectionManager.this.setShowToolbar$foundation_release(false);
                }
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateSelectAll$foundation_release(new InterfaceC10574p() { // from class: androidx.compose.foundation.text.selection.SelectionManager.3
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke(((Boolean) obj).booleanValue(), ((Number) obj2).longValue());
                return C8736p.f16368a;
            }

            public final void invoke(boolean z10, long j10) {
                SelectionManager selectionManager = SelectionManager.this;
                Pair<Selection, LongObjectMap<Selection>> pairSelectAllInSelectable$foundation_release = selectionManager.selectAllInSelectable$foundation_release(j10, selectionManager.getSelection());
                Selection selection = (Selection) pairSelectAllInSelectable$foundation_release.m15903a();
                LongObjectMap<Selection> longObjectMap = (LongObjectMap) pairSelectAllInSelectable$foundation_release.m15904b();
                if (!AbstractC9133u.m16128b(selection, SelectionManager.this.getSelection())) {
                    SelectionManager.this.selectionRegistrar.setSubselections(longObjectMap);
                    SelectionManager.this.getOnSelectionChange().invoke(selection);
                }
                SelectionManager.this.setInTouchMode(z10);
                FocusRequester.m23943requestFocus3ESFkO8$default(SelectionManager.this.getFocusRequester(), 0, 1, null);
                SelectionManager.this.setShowToolbar$foundation_release(false);
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateCallback$foundation_release(new InterfaceC10578t() { // from class: androidx.compose.foundation.text.selection.SelectionManager.4
            {
                super(6);
            }

            @Override // p300x7.InterfaceC10578t
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return m21658invokepGV3PM0(((Boolean) obj).booleanValue(), (LayoutCoordinates) obj2, ((Offset) obj3).m24045unboximpl(), ((Offset) obj4).m24045unboximpl(), ((Boolean) obj5).booleanValue(), (SelectionAdjustment) obj6);
            }

            /* renamed from: invoke-pGV3PM0, reason: not valid java name */
            public final Boolean m21658invokepGV3PM0(boolean z10, LayoutCoordinates layoutCoordinates, long j10, long j11, boolean z11, SelectionAdjustment selectionAdjustment) {
                long jM21641convertToContainerCoordinatesR5De75A = SelectionManager.this.m21641convertToContainerCoordinatesR5De75A(layoutCoordinates, j10);
                long jM21641convertToContainerCoordinatesR5De75A2 = SelectionManager.this.m21641convertToContainerCoordinatesR5De75A(layoutCoordinates, j11);
                SelectionManager.this.setInTouchMode(z10);
                return Boolean.valueOf(SelectionManager.this.m21656updateSelectionqNKwrvQ$foundation_release(Offset.m24024boximpl(jM21641convertToContainerCoordinatesR5De75A), jM21641convertToContainerCoordinatesR5De75A2, z11, selectionAdjustment));
            }
        });
        selectionRegistrarImpl.setOnSelectionUpdateEndCallback$foundation_release(new InterfaceC10559a() { // from class: androidx.compose.foundation.text.selection.SelectionManager.5
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21659invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21659invoke() {
                SelectionManager.this.setShowToolbar$foundation_release(true);
                SelectionManager.this.setDraggingHandle(null);
                SelectionManager.this.m21643setCurrentDragPosition_kEHs6E(null);
            }
        });
        selectionRegistrarImpl.setOnSelectableChangeCallback$foundation_release(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager.6
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C8736p.f16368a;
            }

            public final void invoke(long j10) {
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j10)) {
                    SelectionManager.this.onRelease();
                    SelectionManager.this.setSelection(null);
                }
            }
        });
        selectionRegistrarImpl.setAfterSelectableUnsubscribe$foundation_release(new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager.7
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C8736p.f16368a;
            }

            public final void invoke(long j10) {
                Selection.AnchorInfo end;
                Selection.AnchorInfo start;
                Selection selection = SelectionManager.this.getSelection();
                if (selection != null && (start = selection.getStart()) != null && j10 == start.getSelectableId()) {
                    SelectionManager.this.m21647setStartHandlePosition_kEHs6E(null);
                }
                Selection selection2 = SelectionManager.this.getSelection();
                if (selection2 != null && (end = selection2.getEnd()) != null && j10 == end.getSelectableId()) {
                    SelectionManager.this.m21646setEndHandlePosition_kEHs6E(null);
                }
                if (SelectionManager.this.selectionRegistrar.getSubselections().containsKey(j10)) {
                    SelectionManager.this.updateSelectionToolbar();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: convertToContainerCoordinates-R5De75A, reason: not valid java name */
    public final long m21641convertToContainerCoordinatesR5De75A(LayoutCoordinates layoutCoordinates, long j10) {
        LayoutCoordinates layoutCoordinates2 = this.containerLayoutCoordinates;
        return (layoutCoordinates2 == null || !layoutCoordinates2.isAttached()) ? Offset.Companion.m24050getUnspecifiedF1C5BW0() : requireContainerCoordinates$foundation_release().mo25636localPositionOfR5De75A(layoutCoordinates, j10);
    }

    private final Rect getContentRect() {
        LayoutCoordinates layoutCoordinates;
        if (getSelection() == null || (layoutCoordinates = this.containerLayoutCoordinates) == null || !layoutCoordinates.isAttached()) {
            return null;
        }
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        ArrayList arrayList = new ArrayList(listSort.size());
        int size = listSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            Pair pairM14230a = selection != null ? AbstractC8726f.m14230a(selectable, selection) : null;
            if (pairM14230a != null) {
                arrayList.add(pairM14230a);
            }
        }
        List listFirstAndLast = SelectionManagerKt.firstAndLast(arrayList);
        if (listFirstAndLast.isEmpty()) {
            return null;
        }
        Rect selectedRegionRect = SelectionManagerKt.getSelectedRegionRect(listFirstAndLast, layoutCoordinates);
        if (AbstractC9133u.m16128b(selectedRegionRect, SelectionManagerKt.invertedInfiniteRect)) {
            return null;
        }
        Rect rectIntersect = SelectionManagerKt.visibleBounds(layoutCoordinates).intersect(selectedRegionRect);
        if (rectIntersect.getRight() - rectIntersect.getLeft() < 0.0f || rectIntersect.getBottom() - rectIntersect.getTop() < 0.0f) {
            return null;
        }
        Rect rectM24072translatek4lQ0M = rectIntersect.m24072translatek4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        return Rect.copy$default(rectM24072translatek4lQ0M, 0.0f, 0.0f, 0.0f, rectM24072translatek4lQ0M.getBottom() + (SelectionHandlesKt.getHandleHeight() * 4), 7, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getPreviousSelectionLayout$foundation_release$annotations() {
    }

    /* renamed from: getSelectionLayout-Wko1d7g, reason: not valid java name */
    private final SelectionLayout m21642getSelectionLayoutWko1d7g(long j10, long j11, boolean z10) {
        LayoutCoordinates layoutCoordinatesRequireContainerCoordinates$foundation_release = requireContainerCoordinates$foundation_release();
        List<Selectable> listSort = this.selectionRegistrar.sort(layoutCoordinatesRequireContainerCoordinates$foundation_release);
        final MutableLongIntMap mutableLongIntMapMutableLongIntMapOf = LongIntMapKt.mutableLongIntMapOf();
        int size = listSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            mutableLongIntMapMutableLongIntMapOf.set(listSort.get(i10).getSelectableId(), i10);
        }
        SelectionLayoutBuilder selectionLayoutBuilder = new SelectionLayoutBuilder(j10, j11, layoutCoordinatesRequireContainerCoordinates$foundation_release, z10, (9223372034707292159L & j11) == InlineClassHelperKt.UnspecifiedPackedFloats ? null : getSelection(), new Comparator() { // from class: androidx.compose.foundation.text.selection.SelectionManager$getSelectionLayout-Wko1d7g$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC9260b.m16977d(Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t10).longValue())), Integer.valueOf(mutableLongIntMapMutableLongIntMapOf.get(((Number) t11).longValue())));
            }
        }, null);
        int size2 = listSort.size();
        for (int i11 = 0; i11 < size2; i11++) {
            listSort.get(i11).appendSelectableInfoToBuilder(selectionLayoutBuilder);
        }
        return selectionLayoutBuilder.build();
    }

    private final boolean getShouldShowMagnifier() {
        return isDraggingInProgress() && isInTouchMode() && !isTriviallyCollapsedSelection$foundation_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDraggingInProgress() {
        return getDraggingHandle() != null;
    }

    private final Modifier onClearSelectionRequested(Modifier modifier, final InterfaceC10559a interfaceC10559a) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, C8736p.f16368a, new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionManager.onClearSelectionRequested.1

            @InterfaceC9539d(m17800c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1", m17801f = "SelectionManager.kt", m17802l = {754, 760}, m17803m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC10574p {
                final /* synthetic */ InterfaceC10559a $block;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SelectionManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SelectionManager selectionManager, InterfaceC10559a interfaceC10559a, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.this$0 = selectionManager;
                    this.$block = interfaceC10559a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, interfaceC9324c);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // p300x7.InterfaceC10574p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
                
                    if (r11 == r0) goto L16;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
                    /*
                        r10 = this;
                        java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L24
                        if (r1 == r3) goto L1b
                        if (r1 != r2) goto L13
                        kotlin.AbstractC9079b.m15926b(r11)
                        r7 = r10
                        goto L4d
                    L13:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1b:
                        java.lang.Object r1 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.AbstractC9079b.m15926b(r11)
                        r7 = r10
                        goto L3d
                    L24:
                        kotlin.AbstractC9079b.m15926b(r11)
                        java.lang.Object r11 = r10.L$0
                        r4 = r11
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.p013ui.input.pointer.AwaitPointerEventScope) r4
                        r10.L$0 = r4
                        r10.label = r3
                        r5 = 0
                        r6 = 0
                        r8 = 2
                        r9 = 0
                        r7 = r10
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitPrimaryFirstDown$default(r4, r5, r6, r7, r8, r9)
                        if (r11 != r0) goto L3c
                        goto L4c
                    L3c:
                        r1 = r4
                    L3d:
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.p013ui.input.pointer.PointerInputChange) r11
                        androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p013ui.input.pointer.PointerEventPass.Initial
                        r4 = 0
                        r7.L$0 = r4
                        r7.label = r2
                        java.lang.Object r11 = androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(r1, r11, r3, r10)
                        if (r11 != r0) goto L4d
                    L4c:
                        return r0
                    L4d:
                        java.lang.Boolean r11 = (java.lang.Boolean) r11
                        boolean r11 = r11.booleanValue()
                        if (r11 != 0) goto L62
                        androidx.compose.foundation.text.selection.SelectionManager r11 = r7.this$0
                        boolean r11 = androidx.compose.foundation.text.selection.SelectionManager.access$isDraggingInProgress(r11)
                        if (r11 != 0) goto L62
                        x7.a r11 = r7.$block
                        r11.invoke()
                    L62:
                        h7.p r11 = p123h7.C8736p.f16368a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.C19591.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.p013ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(SelectionManager.this, interfaceC10559a, null), interfaceC9324c);
                return objAwaitEachGesture == AbstractC9434a.m17291f() ? objAwaitEachGesture : C8736p.f16368a;
            }
        });
    }

    private final void selectionChanged(SelectionLayout selectionLayout, Selection selection) {
        HapticFeedback hapticFeedback;
        if (shouldPerformHaptics$foundation_release() && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo25000performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m25016getTextHandleMove5zf0vsI());
        }
        this.selectionRegistrar.setSubselections(selectionLayout.createSubSelections(selection));
        this.onSelectionChange.invoke(selection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m21643setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragBeginPosition-k-4lQ0M, reason: not valid java name */
    public final void m21644setDragBeginPositionk4lQ0M(long j10) {
        this.dragBeginPosition$delegate.setValue(Offset.m24024boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDragTotalDistance-k-4lQ0M, reason: not valid java name */
    public final void m21645setDragTotalDistancek4lQ0M(long j10) {
        this.dragTotalDistance$delegate.setValue(Offset.m24024boximpl(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setEndHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m21646setEndHandlePosition_kEHs6E(Offset offset) {
        this.endHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setStartHandlePosition-_kEHs6E, reason: not valid java name */
    public final void m21647setStartHandlePosition_kEHs6E(Offset offset) {
        this.startHandlePosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startSelection-9KIMszo, reason: not valid java name */
    public final void m21648startSelection9KIMszo(long j10, boolean z10, SelectionAdjustment selectionAdjustment) {
        this.previousSelectionLayout = null;
        m21655updateSelectionjyLRC_s$foundation_release(j10, Offset.Companion.m24050getUnspecifiedF1C5BW0(), z10, selectionAdjustment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toolbarCopy() {
        copy$foundation_release();
        onRelease();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateHandleOffsets() {
        /*
            r17 = this;
            r0 = r17
            androidx.compose.foundation.text.selection.Selection r1 = r0.getSelection()
            androidx.compose.ui.layout.LayoutCoordinates r2 = r0.containerLayoutCoordinates
            r3 = 0
            if (r1 == 0) goto L16
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r4 = r1.getStart()
            if (r4 == 0) goto L16
            androidx.compose.foundation.text.selection.Selectable r4 = r0.getAnchorSelectable$foundation_release(r4)
            goto L17
        L16:
            r4 = r3
        L17:
            if (r1 == 0) goto L24
            androidx.compose.foundation.text.selection.Selection$AnchorInfo r5 = r1.getEnd()
            if (r5 == 0) goto L24
            androidx.compose.foundation.text.selection.Selectable r5 = r0.getAnchorSelectable$foundation_release(r5)
            goto L25
        L24:
            r5 = r3
        L25:
            if (r4 == 0) goto L2c
            androidx.compose.ui.layout.LayoutCoordinates r6 = r4.getLayoutCoordinates()
            goto L2d
        L2c:
            r6 = r3
        L2d:
            if (r5 == 0) goto L34
            androidx.compose.ui.layout.LayoutCoordinates r7 = r5.getLayoutCoordinates()
            goto L35
        L34:
            r7 = r3
        L35:
            if (r1 == 0) goto Lab
            if (r2 == 0) goto Lab
            boolean r8 = r2.isAttached()
            if (r8 == 0) goto Lab
            if (r6 != 0) goto L44
            if (r7 != 0) goto L44
            goto Lab
        L44:
            androidx.compose.ui.geometry.Rect r8 = androidx.compose.foundation.text.selection.SelectionManagerKt.visibleBounds(r2)
            r9 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r11 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            if (r6 == 0) goto L7b
            r13 = 1
            long r13 = r4.mo21611getHandlePositiondBAh8RU(r1, r13)
            long r15 = r13 & r11
            int r4 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r4 != 0) goto L60
            goto L7b
        L60:
            long r13 = r2.mo25636localPositionOfR5De75A(r6, r13)
            androidx.compose.ui.geometry.Offset r4 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r13)
            long r13 = r4.m24045unboximpl()
            androidx.compose.foundation.text.Handle r6 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r15 = androidx.compose.foundation.text.Handle.SelectionStart
            if (r6 == r15) goto L7c
            boolean r6 = androidx.compose.foundation.text.selection.SelectionManagerKt.m21665containsInclusiveUv8p0NA(r8, r13)
            if (r6 == 0) goto L7b
            goto L7c
        L7b:
            r4 = r3
        L7c:
            r0.m21647setStartHandlePosition_kEHs6E(r4)
            if (r7 == 0) goto La7
            r4 = 0
            long r4 = r5.mo21611getHandlePositiondBAh8RU(r1, r4)
            long r11 = r11 & r4
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 != 0) goto L8c
            goto La7
        L8c:
            long r1 = r2.mo25636localPositionOfR5De75A(r7, r4)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.p013ui.geometry.Offset.m24024boximpl(r1)
            long r4 = r1.m24045unboximpl()
            androidx.compose.foundation.text.Handle r2 = r0.getDraggingHandle()
            androidx.compose.foundation.text.Handle r6 = androidx.compose.foundation.text.Handle.SelectionEnd
            if (r2 == r6) goto La6
            boolean r2 = androidx.compose.foundation.text.selection.SelectionManagerKt.m21665containsInclusiveUv8p0NA(r8, r4)
            if (r2 == 0) goto La7
        La6:
            r3 = r1
        La7:
            r0.m21646setEndHandlePosition_kEHs6E(r3)
            return
        Lab:
            r0.m21647setStartHandlePosition_kEHs6E(r3)
            r0.m21646setEndHandlePosition_kEHs6E(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.updateHandleOffsets():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSelectionToolbar() {
        TextToolbar textToolbar;
        if (getHasFocus() && (textToolbar = this.textToolbar) != null) {
            if (!this.showToolbar || !isInTouchMode()) {
                if (textToolbar.getStatus() == TextToolbarStatus.Shown) {
                    textToolbar.hide();
                }
            } else {
                Rect contentRect = getContentRect();
                if (contentRect == null) {
                    return;
                }
                TextToolbar.showMenu$default(textToolbar, contentRect, isNonEmptySelection$foundation_release() ? new C19601(this) : null, null, null, isEntireContainerSelected$foundation_release() ? null : new C19612(this), null, 12, null);
            }
        }
    }

    public final void copy$foundation_release() {
        InterfaceC10570l interfaceC10570l;
        AnnotatedString selectedText$foundation_release = getSelectedText$foundation_release();
        if (selectedText$foundation_release != null) {
            if (selectedText$foundation_release.length() <= 0) {
                selectedText$foundation_release = null;
            }
            if (selectedText$foundation_release == null || (interfaceC10570l = this.onCopyHandler) == null) {
                return;
            }
            interfaceC10570l.invoke(selectedText$foundation_release);
        }
    }

    public final Selectable getAnchorSelectable$foundation_release(Selection.AnchorInfo anchorInfo) {
        return this.selectionRegistrar.getSelectableMap$foundation_release().get(anchorInfo.getSelectableId());
    }

    public final LayoutCoordinates getContainerLayoutCoordinates() {
        return this.containerLayoutCoordinates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m21649getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragBeginPosition-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m21650getDragBeginPositionF1C5BW0$foundation_release() {
        return ((Offset) this.dragBeginPosition$delegate.getValue()).m24045unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getDragTotalDistance-F1C5BW0$foundation_release, reason: not valid java name */
    public final long m21651getDragTotalDistanceF1C5BW0$foundation_release() {
        return ((Offset) this.dragTotalDistance$delegate.getValue()).m24045unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    public final float getEndHandleLineHeight() {
        Selectable anchorSelectable$foundation_release;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getEnd())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation_release.getLineHeight(selection.getEnd().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getEndHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m21652getEndHandlePosition_m7T9E() {
        return (Offset) this.endHandlePosition$delegate.getValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus$delegate.getValue()).booleanValue();
    }

    public final Modifier getModifier() {
        Modifier modifierSelectionMagnifier = Modifier.Companion;
        Modifier modifierOnKeyEvent = KeyInputModifierKt.onKeyEvent(SelectionGesturesKt.updateSelectionTouchMode(FocusableKt.focusable$default(FocusChangedModifierKt.onFocusChanged(FocusRequesterModifierKt.focusRequester(OnGloballyPositionedModifierKt.onGloballyPositioned(onClearSelectionRequested(modifierSelectionMagnifier, new InterfaceC10559a() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m21660invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m21660invoke() {
                this.this$0.onRelease();
            }
        }), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$2
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((LayoutCoordinates) obj);
                return C8736p.f16368a;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates) {
                this.this$0.setContainerLayoutCoordinates(layoutCoordinates);
            }
        }), this.focusRequester), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$3
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((FocusState) obj);
                return C8736p.f16368a;
            }

            public final void invoke(FocusState focusState) {
                if (!focusState.getHasFocus() && this.this$0.getHasFocus()) {
                    this.this$0.onRelease();
                }
                this.this$0.setHasFocus(focusState.getHasFocus());
            }
        }), false, null, 3, null), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$4
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return C8736p.f16368a;
            }

            public final void invoke(boolean z10) {
                this.this$0.setInTouchMode(z10);
            }
        }), new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$modifier$5
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return m21661invokeZmokQxo(((KeyEvent) obj).m25346unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m21661invokeZmokQxo(android.view.KeyEvent keyEvent) {
                boolean z10;
                if (SelectionManager_androidKt.m21667isCopyKeyEventZmokQxo(keyEvent)) {
                    this.this$0.copy$foundation_release();
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        });
        if (getShouldShowMagnifier()) {
            modifierSelectionMagnifier = SelectionManager_androidKt.selectionMagnifier(modifierSelectionMagnifier, this);
        }
        return modifierOnKeyEvent.then(modifierSelectionMagnifier);
    }

    public final InterfaceC10570l getOnCopyHandler() {
        return this.onCopyHandler;
    }

    public final InterfaceC10570l getOnSelectionChange() {
        return this.onSelectionChange;
    }

    public final SelectionLayout getPreviousSelectionLayout$foundation_release() {
        return this.previousSelectionLayout;
    }

    public final AnnotatedString getSelectedText$foundation_release() {
        if (getSelection() == null || this.selectionRegistrar.getSubselections().isEmpty()) {
            return null;
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            Selection selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId());
            if (selection != null) {
                AnnotatedString text = selectable.getText();
                builder.append(selection.getHandlesCrossed() ? text.subSequence(selection.getEnd().getOffset(), selection.getStart().getOffset()) : text.subSequence(selection.getStart().getOffset(), selection.getEnd().getOffset()));
            }
        }
        return builder.toAnnotatedString();
    }

    public final Selection getSelection() {
        return this._selection.getValue();
    }

    public final boolean getShowToolbar$foundation_release() {
        return this.showToolbar;
    }

    public final float getStartHandleLineHeight() {
        Selectable anchorSelectable$foundation_release;
        Selection selection = getSelection();
        if (selection == null || (anchorSelectable$foundation_release = getAnchorSelectable$foundation_release(selection.getStart())) == null) {
            return 0.0f;
        }
        return anchorSelectable$foundation_release.getLineHeight(selection.getStart().getOffset());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getStartHandlePosition-_m7T9-E, reason: not valid java name */
    public final Offset m21653getStartHandlePosition_m7T9E() {
        return (Offset) this.startHandlePosition$delegate.getValue();
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    public final TextDragObserver handleDragObserver(final boolean z10) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.SelectionManager.handleDragObserver.1
            private final void done() {
                this.setShowToolbar$foundation_release(true);
                this.setDraggingHandle(null);
                this.m21643setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo21286onDownk4lQ0M(long j10) {
                LayoutCoordinates layoutCoordinates;
                Offset offsetM21653getStartHandlePosition_m7T9E = z10 ? this.m21653getStartHandlePosition_m7T9E() : this.m21652getEndHandlePosition_m7T9E();
                if (offsetM21653getStartHandlePosition_m7T9E != null) {
                    offsetM21653getStartHandlePosition_m7T9E.m24045unboximpl();
                    Selection selection = this.getSelection();
                    if (selection == null) {
                        return;
                    }
                    Selectable anchorSelectable$foundation_release = this.getAnchorSelectable$foundation_release(z10 ? selection.getStart() : selection.getEnd());
                    if (anchorSelectable$foundation_release == null || (layoutCoordinates = anchorSelectable$foundation_release.getLayoutCoordinates()) == null) {
                        return;
                    }
                    long jMo21611getHandlePositiondBAh8RU = anchorSelectable$foundation_release.mo21611getHandlePositiondBAh8RU(selection, z10);
                    if ((9223372034707292159L & jMo21611getHandlePositiondBAh8RU) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                        return;
                    }
                    long jM21625getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m21625getAdjustedCoordinatesk4lQ0M(jMo21611getHandlePositiondBAh8RU);
                    SelectionManager selectionManager = this;
                    selectionManager.m21643setCurrentDragPosition_kEHs6E(Offset.m24024boximpl(selectionManager.requireContainerCoordinates$foundation_release().mo25636localPositionOfR5De75A(layoutCoordinates, jM21625getAdjustedCoordinatesk4lQ0M)));
                    this.setDraggingHandle(z10 ? Handle.SelectionStart : Handle.SelectionEnd);
                    this.setShowToolbar$foundation_release(false);
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo21287onDragk4lQ0M(long j10) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                SelectionManager selectionManager = this;
                selectionManager.m21645setDragTotalDistancek4lQ0M(Offset.m24040plusMKHz9U(selectionManager.m21651getDragTotalDistanceF1C5BW0$foundation_release(), j10));
                long jM24040plusMKHz9U = Offset.m24040plusMKHz9U(this.m21650getDragBeginPositionF1C5BW0$foundation_release(), this.m21651getDragTotalDistanceF1C5BW0$foundation_release());
                if (this.m21656updateSelectionqNKwrvQ$foundation_release(Offset.m24024boximpl(jM24040plusMKHz9U), this.m21650getDragBeginPositionF1C5BW0$foundation_release(), z10, SelectionAdjustment.Companion.getCharacterWithWordAccelerate())) {
                    this.m21644setDragBeginPositionk4lQ0M(jM24040plusMKHz9U);
                    this.m21645setDragTotalDistancek4lQ0M(Offset.Companion.m24051getZeroF1C5BW0());
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo21288onStartk4lQ0M(long j10) {
                if (this.getDraggingHandle() == null) {
                    return;
                }
                Selection selection = this.getSelection();
                AbstractC9133u.m16130d(selection);
                Selectable selectable = this.selectionRegistrar.getSelectableMap$foundation_release().get((z10 ? selection.getStart() : selection.getEnd()).getSelectableId());
                if (selectable == null) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("SelectionRegistrar should contain the current selection's selectableIds");
                    throw new KotlinNothingValueException();
                }
                Selectable selectable2 = selectable;
                LayoutCoordinates layoutCoordinates = selectable2.getLayoutCoordinates();
                if (layoutCoordinates == null) {
                    androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Current selectable should have layout coordinates.");
                    throw new KotlinNothingValueException();
                }
                long jMo21611getHandlePositiondBAh8RU = selectable2.mo21611getHandlePositiondBAh8RU(selection, z10);
                if ((9223372034707292159L & jMo21611getHandlePositiondBAh8RU) == InlineClassHelperKt.UnspecifiedPackedFloats) {
                    return;
                }
                long jM21625getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m21625getAdjustedCoordinatesk4lQ0M(jMo21611getHandlePositiondBAh8RU);
                SelectionManager selectionManager = this;
                selectionManager.m21644setDragBeginPositionk4lQ0M(selectionManager.requireContainerCoordinates$foundation_release().mo25636localPositionOfR5De75A(layoutCoordinates, jM21625getAdjustedCoordinatesk4lQ0M));
                this.m21645setDragTotalDistancek4lQ0M(Offset.Companion.m24051getZeroF1C5BW0());
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                done();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                done();
            }
        };
    }

    public final boolean isEntireContainerSelected$foundation_release() {
        Selection selection;
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return true;
        }
        int size = listSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            AnnotatedString text = selectable.getText();
            if (text.length() != 0 && ((selection = this.selectionRegistrar.getSubselections().get(selectable.getSelectableId())) == null || Math.abs(selection.getStart().getOffset() - selection.getEnd().getOffset()) != text.length())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInTouchMode() {
        return this._isInTouchMode.getValue().booleanValue();
    }

    public final boolean isNonEmptySelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null || AbstractC9133u.m16128b(selection.getStart(), selection.getEnd())) {
            return false;
        }
        if (selection.getStart().getSelectableId() == selection.getEnd().getSelectableId()) {
            return true;
        }
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        for (int i10 = 0; i10 < size; i10++) {
            Selection selection2 = this.selectionRegistrar.getSubselections().get(listSort.get(i10).getSelectableId());
            if (selection2 != null && selection2.getStart().getOffset() != selection2.getEnd().getOffset()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isTriviallyCollapsedSelection$foundation_release() {
        Selection selection = getSelection();
        if (selection == null) {
            return true;
        }
        return AbstractC9133u.m16128b(selection.getStart(), selection.getEnd());
    }

    public final void onRelease() {
        HapticFeedback hapticFeedback;
        this.selectionRegistrar.setSubselections(LongObjectMapKt.emptyLongObjectMap());
        setShowToolbar$foundation_release(false);
        if (getSelection() != null) {
            this.onSelectionChange.invoke(null);
            if (!isInTouchMode() || (hapticFeedback = this.hapticFeedBack) == null) {
                return;
            }
            hapticFeedback.mo25000performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m25016getTextHandleMove5zf0vsI());
        }
    }

    public final LayoutCoordinates requireContainerCoordinates$foundation_release() {
        LayoutCoordinates layoutCoordinates = this.containerLayoutCoordinates;
        if (layoutCoordinates == null) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!layoutCoordinates.isAttached()) {
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException("unattached coordinates");
        }
        return layoutCoordinates;
    }

    public final void selectAll$foundation_release() {
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        if (listSort.isEmpty()) {
            return;
        }
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        int size = listSort.size();
        Selection selection = null;
        Selection selection2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            Selection selectAllSelection = selectable.getSelectAllSelection();
            if (selectAllSelection != null) {
                if (selection == null) {
                    selection = selectAllSelection;
                }
                mutableLongObjectMapMutableLongObjectMapOf.put(selectable.getSelectableId(), selectAllSelection);
                selection2 = selectAllSelection;
            }
        }
        if (mutableLongObjectMapMutableLongObjectMapOf.isEmpty()) {
            return;
        }
        if (selection != selection2) {
            AbstractC9133u.m16130d(selection);
            Selection.AnchorInfo start = selection.getStart();
            AbstractC9133u.m16130d(selection2);
            selection = new Selection(start, selection2.getEnd(), false);
        }
        this.selectionRegistrar.setSubselections(mutableLongObjectMapMutableLongObjectMapOf);
        this.onSelectionChange.invoke(selection);
        this.previousSelectionLayout = null;
    }

    public final Pair<Selection, LongObjectMap<Selection>> selectAllInSelectable$foundation_release(long j10, Selection selection) {
        HapticFeedback hapticFeedback;
        MutableLongObjectMap mutableLongObjectMapMutableLongObjectMapOf = LongObjectMapKt.mutableLongObjectMapOf();
        List<Selectable> listSort = this.selectionRegistrar.sort(requireContainerCoordinates$foundation_release());
        int size = listSort.size();
        Selection selectionMerge = null;
        for (int i10 = 0; i10 < size; i10++) {
            Selectable selectable = listSort.get(i10);
            Selection selectAllSelection = selectable.getSelectableId() == j10 ? selectable.getSelectAllSelection() : null;
            if (selectAllSelection != null) {
                mutableLongObjectMapMutableLongObjectMapOf.set(selectable.getSelectableId(), selectAllSelection);
            }
            selectionMerge = SelectionManagerKt.merge(selectionMerge, selectAllSelection);
        }
        if (isInTouchMode() && !AbstractC9133u.m16128b(selectionMerge, selection) && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo25000performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m25016getTextHandleMove5zf0vsI());
        }
        return new Pair<>(selectionMerge, mutableLongObjectMapMutableLongObjectMapOf);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21654selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long r13) {
        /*
            r12 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r12.containerLayoutCoordinates
            if (r0 != 0) goto L5
            goto L65
        L5:
            boolean r1 = r0.isAttached()
            if (r1 != 0) goto Lc
            goto L65
        Lc:
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r1 = r12.selectionRegistrar
            java.util.List r1 = r1.getSelectables$foundation_release()
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L18:
            r5 = 1
            if (r4 >= r2) goto L5a
            java.lang.Object r6 = r1.get(r4)
            androidx.compose.foundation.text.selection.Selectable r6 = (androidx.compose.foundation.text.selection.Selectable) r6
            androidx.compose.foundation.text.selection.SelectionRegistrarImpl r7 = r12.selectionRegistrar
            androidx.collection.LongObjectMap r7 = r7.getSubselections()
            long r8 = r6.getSelectableId()
            java.lang.Object r7 = r7.get(r8)
            androidx.compose.foundation.text.selection.Selection r7 = (androidx.compose.foundation.text.selection.Selection) r7
            if (r7 != 0) goto L35
        L33:
            r6 = r3
            goto L53
        L35:
            androidx.compose.ui.layout.LayoutCoordinates r8 = r6.getLayoutCoordinates()
            if (r8 != 0) goto L3c
            goto L33
        L3c:
            long r8 = r8.mo25636localPositionOfR5De75A(r0, r13)
            androidx.compose.ui.text.TextLayoutResult r6 = r6.textLayoutResult()
            if (r6 != 0) goto L47
            goto L33
        L47:
            long r10 = r7.m21617toTextRanged9O1mEE()
            androidx.compose.ui.text.TextRange r7 = androidx.compose.p013ui.text.TextRange.m26352boximpl(r10)
            boolean r6 = androidx.compose.foundation.text.TextLayoutHelperKt.m21317isPositionInsideSelectionuaM50fQ(r6, r8, r7)
        L53:
            if (r6 == 0) goto L57
            r3 = r5
            goto L5a
        L57:
            int r4 = r4 + 1
            goto L18
        L5a:
            if (r3 != 0) goto L65
            androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion
            androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getWord()
            r12.m21648startSelection9KIMszo(r13, r5, r0)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager.m21654selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long):void");
    }

    public final void setContainerLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.containerLayoutCoordinates = layoutCoordinates;
        if (!getHasFocus() || getSelection() == null) {
            return;
        }
        Offset offsetM24024boximpl = layoutCoordinates != null ? Offset.m24024boximpl(LayoutCoordinatesKt.positionInWindow(layoutCoordinates)) : null;
        if (AbstractC9133u.m16128b(this.previousPosition, offsetM24024boximpl)) {
            return;
        }
        this.previousPosition = offsetM24024boximpl;
        updateHandleOffsets();
        updateSelectionToolbar();
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setHasFocus(boolean z10) {
        this.hasFocus$delegate.setValue(Boolean.valueOf(z10));
    }

    public final void setInTouchMode(boolean z10) {
        if (this._isInTouchMode.getValue().booleanValue() != z10) {
            this._isInTouchMode.setValue(Boolean.valueOf(z10));
            updateSelectionToolbar();
        }
    }

    public final void setOnCopyHandler(InterfaceC10570l interfaceC10570l) {
        this.onCopyHandler = interfaceC10570l;
    }

    public final void setOnSelectionChange(final InterfaceC10570l interfaceC10570l) {
        this.onSelectionChange = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.selection.SelectionManager$onSelectionChange$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Selection) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Selection selection) {
                this.this$0.setSelection(selection);
                interfaceC10570l.invoke(selection);
            }
        };
    }

    public final void setPreviousSelectionLayout$foundation_release(SelectionLayout selectionLayout) {
        this.previousSelectionLayout = selectionLayout;
    }

    public final void setSelection(Selection selection) {
        this._selection.setValue(selection);
        if (selection != null) {
            updateHandleOffsets();
        }
    }

    public final void setShowToolbar$foundation_release(boolean z10) {
        this.showToolbar = z10;
        updateSelectionToolbar();
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    @VisibleForTesting
    public final boolean shouldPerformHaptics$foundation_release() {
        if (isInTouchMode()) {
            List<Selectable> selectables$foundation_release = this.selectionRegistrar.getSelectables$foundation_release();
            int size = selectables$foundation_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (selectables$foundation_release.get(i10).getText().length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: updateSelection-jyLRC_s$foundation_release, reason: not valid java name */
    public final boolean m21655updateSelectionjyLRC_s$foundation_release(long j10, long j11, boolean z10, SelectionAdjustment selectionAdjustment) {
        setDraggingHandle(z10 ? Handle.SelectionStart : Handle.SelectionEnd);
        m21643setCurrentDragPosition_kEHs6E(Offset.m24024boximpl(j10));
        SelectionLayout selectionLayoutM21642getSelectionLayoutWko1d7g = m21642getSelectionLayoutWko1d7g(j10, j11, z10);
        if (selectionLayoutM21642getSelectionLayoutWko1d7g == null || !selectionLayoutM21642getSelectionLayoutWko1d7g.shouldRecomputeSelection(this.previousSelectionLayout)) {
            return false;
        }
        Selection selectionAdjust = selectionAdjustment.adjust(selectionLayoutM21642getSelectionLayoutWko1d7g);
        if (!AbstractC9133u.m16128b(selectionAdjust, getSelection())) {
            selectionChanged(selectionLayoutM21642getSelectionLayoutWko1d7g, selectionAdjust);
        }
        this.previousSelectionLayout = selectionLayoutM21642getSelectionLayoutWko1d7g;
        return true;
    }

    /* renamed from: updateSelection-qNKwrvQ$foundation_release, reason: not valid java name */
    public final boolean m21656updateSelectionqNKwrvQ$foundation_release(Offset offset, long j10, boolean z10, SelectionAdjustment selectionAdjustment) {
        if (offset == null) {
            return false;
        }
        return m21655updateSelectionjyLRC_s$foundation_release(offset.m24045unboximpl(), j10, z10, selectionAdjustment);
    }
}
