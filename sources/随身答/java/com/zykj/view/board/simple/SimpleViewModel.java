package com.zykj.view.board.simple;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zykj.view.board.board.AbstractC7676s;
import com.zykj.view.board.board.AbstractC7677t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(m13412d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0003J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0018J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0003J\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u000bJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0003R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020!0%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020,0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102¨\u00064"}, m13413d2 = {"Lcom/zykj/view/board/simple/SimpleViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "k", "j", "i", "", "isTouchable", "r", "(Z)V", "Lcom/zykj/view/board/board/s;", "mainToolType", "n", "(Lcom/zykj/view/board/board/s;)V", "h", "Lcom/zykj/view/board/simple/d;", "penType", "q", "(Lcom/zykj/view/board/simple/d;)V", "", "level", "p", "(I)V", "o", "g", "l", "f", "isOpen", "m", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/view/board/simple/e;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "e", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/view/board/simple/b;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_event", "Lkotlinx/coroutines/flow/SharedFlow;", "d", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", NotificationCompat.CATEGORY_EVENT, "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,258:1\n226#2,5:259\n226#2,5:264\n226#2,5:269\n226#2,5:274\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n*L\n44#1:259,5\n48#1:264,5\n84#1:269,5\n175#1:274,5\n*E\n"})
/* loaded from: classes5.dex */
public final class SimpleViewModel extends ViewModel {

    /* renamed from: a, reason: from kotlin metadata */
    public final MutableStateFlow _uiState;

    /* renamed from: b, reason: from kotlin metadata */
    public final StateFlow uiState;

    /* renamed from: c, reason: from kotlin metadata */
    public final MutableSharedFlow _event;

    /* renamed from: d, reason: from kotlin metadata */
    public final SharedFlow event;

    public SimpleViewModel() {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C7716e(false, null, null, null, null, null, null, null, 255, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = mutableSharedFlowMutableSharedFlow$default;
        this.event = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* renamed from: i */
    private final void m11835i() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutEraser$1(this, null), 3, null);
    }

    /* renamed from: j */
    private final void m11836j() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutPen$1(this, null), 3, null);
    }

    /* renamed from: k */
    private final void m11837k() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutSelect$1(this, null), 3, null);
    }

    /* renamed from: s */
    public static /* synthetic */ void m11838s(SimpleViewModel simpleViewModel, boolean z9, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = !((C7716e) simpleViewModel._uiState.getValue()).m11874j();
        }
        simpleViewModel.m11851r(z9);
    }

    /* renamed from: c */
    public final void m11839c() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$cleanPage$1(this, null), 3, null);
    }

    /* renamed from: d, reason: from getter */
    public final SharedFlow getEvent() {
        return this.event;
    }

    /* renamed from: e, reason: from getter */
    public final StateFlow getUiState() {
        return this.uiState;
    }

    /* renamed from: f */
    public final void m11842f() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: g */
    public final void m11843g() {
        Object value;
        C7716e c7716e;
        AbstractC7677t abstractC7677t;
        MutableStateFlow mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            c7716e = (C7716e) value;
            AbstractC7677t abstractC7677tM11870f = c7716e.m11870f();
            abstractC7677t = AbstractC7677t.b.f12296f;
            if (Intrinsics.areEqual(abstractC7677tM11870f, abstractC7677t)) {
                abstractC7677t = AbstractC7677t.d.f12298f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7716e.m11865b(c7716e, false, null, abstractC7677t, null, null, null, null, null, 251, null)));
    }

    /* renamed from: h */
    public final void m11844h() {
        Object value;
        C7716e c7716e;
        AbstractC7677t abstractC7677t;
        MutableStateFlow mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            c7716e = (C7716e) value;
            AbstractC7677t abstractC7677tM11870f = c7716e.m11870f();
            abstractC7677t = AbstractC7677t.e.f12299f;
            if (Intrinsics.areEqual(abstractC7677tM11870f, abstractC7677t)) {
                abstractC7677t = AbstractC7677t.d.f12298f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7716e.m11865b(c7716e, false, null, abstractC7677t, null, null, null, null, null, 251, null)));
    }

    /* renamed from: l */
    public final void m11845l(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateEraserSizeLevel$1(level, this, null), 3, null);
    }

    /* renamed from: m */
    public final void m11846m(boolean isOpen) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateExpandState$1(this, isOpen, null), 3, null);
    }

    /* renamed from: n */
    public final void m11847n(AbstractC7676s mainToolType) {
        AbstractC7676s abstractC7676s;
        Object value;
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        MutableStateFlow mutableStateFlow = this._uiState;
        while (true) {
            Object value2 = mutableStateFlow.getValue();
            abstractC7676s = mainToolType;
            if (mutableStateFlow.compareAndSet(value2, C7716e.m11865b((C7716e) value2, false, abstractC7676s, null, null, null, null, null, null, 253, null))) {
                break;
            } else {
                mainToolType = abstractC7676s;
            }
        }
        if (abstractC7676s instanceof AbstractC7676s.d) {
            MutableStateFlow mutableStateFlow2 = this._uiState;
            do {
                value = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value, C7716e.m11865b((C7716e) value, false, null, AbstractC7677t.d.f12298f, null, null, null, null, null, 251, null)));
            m11837k();
            return;
        }
        if (abstractC7676s instanceof AbstractC7676s.c) {
            m11836j();
        } else if (abstractC7676s instanceof AbstractC7676s.a) {
            m11835i();
        }
    }

    /* renamed from: o */
    public final void m11848o(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenColorLevel$1(level, this, null), 3, null);
    }

    /* renamed from: p */
    public final void m11849p(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenSizeLevel$1(level, this, null), 3, null);
    }

    /* renamed from: q */
    public final void m11850q(AbstractC7715d penType) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: r */
    public final void m11851r(boolean isTouchable) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateTouchable$1(this, isTouchable, null), 3, null);
    }
}
