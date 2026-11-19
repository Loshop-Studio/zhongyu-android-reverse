package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;

@InterfaceC9539d(m17800c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", m17801f = "Transform.kt", m17802l = {ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL}, m17803m = "emit")
/* loaded from: classes5.dex */
public final class FlowKt__TransformKt$withIndex$1$1$emit$1 extends ContinuationImpl {

    /* renamed from: a */
    public /* synthetic */ Object f17904a;

    /* renamed from: b */
    public final /* synthetic */ FlowKt__TransformKt$withIndex$1$1 f17905b;

    /* renamed from: c */
    public int f17906c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$withIndex$1$1$emit$1(FlowKt__TransformKt$withIndex$1$1 flowKt__TransformKt$withIndex$1$1, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.f17905b = flowKt__TransformKt$withIndex$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f17904a = obj;
        this.f17906c |= Integer.MIN_VALUE;
        return this.f17905b.emit(null, this);
    }
}
