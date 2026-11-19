package com.zykj.view.board.simple;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zykj.view.board.board.AbstractC7227n;
import com.zykj.view.board.board.AbstractC7228o;
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

@Metadata(m13557d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0003J\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0003J\u0015\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u0017J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0003J\u0015\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020 0$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020+0.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101¨\u00063"}, m13558d2 = {"Lcom/zykj/view/board/simple/SimpleViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "", "j", "i", "", "isTouchable", "q", "(Z)V", "Lcom/zykj/view/board/board/n;", "mainToolType", "m", "(Lcom/zykj/view/board/board/n;)V", "h", "Lcom/zykj/view/board/simple/d;", "penType", "p", "(Lcom/zykj/view/board/simple/d;)V", "", "level", "o", "(I)V", "n", "g", "k", "f", "isOpen", "l", "c", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zykj/view/board/simple/e;", "a", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_uiState", "Lkotlinx/coroutines/flow/StateFlow;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "e", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/zykj/view/board/simple/b;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_event", "Lkotlinx/coroutines/flow/SharedFlow;", "d", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", NotificationCompat.CATEGORY_EVENT, "view_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSimpleViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,242:1\n226#2,5:243\n226#2,5:248\n226#2,5:253\n*S KotlinDebug\n*F\n+ 1 SimpleViewModel.kt\ncom/zykj/view/board/simple/SimpleViewModel\n*L\n43#1:243,5\n67#1:248,5\n158#1:253,5\n*E\n"})
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
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new C7264e(false, null, null, null, null, null, null, null, 255, null));
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._event = mutableSharedFlowMutableSharedFlow$default;
        this.event = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* renamed from: i */
    private final void m11347i() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutEraser$1(this, null), 3, null);
    }

    /* renamed from: j */
    private final void m11348j() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateConfigAboutPen$1(this, null), 3, null);
    }

    /* renamed from: r */
    public static /* synthetic */ void m11349r(SimpleViewModel simpleViewModel, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = !((C7264e) simpleViewModel._uiState.getValue()).m11385j();
        }
        simpleViewModel.m11362q(z9);
    }

    /* renamed from: c */
    public final void m11350c() {
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
    public final void m11353f() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$handleExpandClick$1(this, null), 3, null);
    }

    /* renamed from: g */
    public final void m11354g() {
        Object value;
        C7264e c7264e;
        AbstractC7228o abstractC7228o;
        MutableStateFlow mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            c7264e = (C7264e) value;
            AbstractC7228o abstractC7228oM11381f = c7264e.m11381f();
            abstractC7228o = AbstractC7228o.b.f11077f;
            if (Intrinsics.areEqual(abstractC7228oM11381f, abstractC7228o)) {
                abstractC7228o = AbstractC7228o.d.f11079f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7264e.m11376b(c7264e, false, null, abstractC7228o, null, null, null, null, null, 251, null)));
    }

    /* renamed from: h */
    public final void m11355h() {
        Object value;
        C7264e c7264e;
        AbstractC7228o abstractC7228o;
        MutableStateFlow mutableStateFlow = this._uiState;
        do {
            value = mutableStateFlow.getValue();
            c7264e = (C7264e) value;
            AbstractC7228o abstractC7228oM11381f = c7264e.m11381f();
            abstractC7228o = AbstractC7228o.e.f11080f;
            if (Intrinsics.areEqual(abstractC7228oM11381f, abstractC7228o)) {
                abstractC7228o = AbstractC7228o.d.f11079f;
            }
        } while (!mutableStateFlow.compareAndSet(value, C7264e.m11376b(c7264e, false, null, abstractC7228o, null, null, null, null, null, 251, null)));
    }

    /* renamed from: k */
    public final void m11356k(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateEraserSizeLevel$1(level, this, null), 3, null);
    }

    /* renamed from: l */
    public final void m11357l(boolean isOpen) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateExpandState$1(this, isOpen, null), 3, null);
    }

    /* renamed from: m */
    public final void m11358m(AbstractC7227n mainToolType) {
        AbstractC7227n abstractC7227n;
        Intrinsics.checkNotNullParameter(mainToolType, "mainToolType");
        MutableStateFlow mutableStateFlow = this._uiState;
        while (true) {
            Object value = mutableStateFlow.getValue();
            abstractC7227n = mainToolType;
            if (mutableStateFlow.compareAndSet(value, C7264e.m11376b((C7264e) value, false, abstractC7227n, null, null, null, null, null, null, 253, null))) {
                break;
            } else {
                mainToolType = abstractC7227n;
            }
        }
        if (abstractC7227n instanceof AbstractC7227n.c) {
            m11348j();
        } else if (abstractC7227n instanceof AbstractC7227n.a) {
            m11347i();
        }
    }

    /* renamed from: n */
    public final void m11359n(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenColorLevel$1(level, this, null), 3, null);
    }

    /* renamed from: o */
    public final void m11360o(int level) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenSizeLevel$1(level, this, null), 3, null);
    }

    /* renamed from: p */
    public final void m11361p(AbstractC7263d penType) {
        Intrinsics.checkNotNullParameter(penType, "penType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updatePenType$1(this, penType, null), 3, null);
    }

    /* renamed from: q */
    public final void m11362q(boolean isTouchable) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new SimpleViewModel$updateTouchable$1(this, isTouchable, null), 3, null);
    }
}
