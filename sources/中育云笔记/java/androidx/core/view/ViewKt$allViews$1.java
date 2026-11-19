package androidx.core.view;

import android.view.View;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p309qc.C10786q;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.core.view.ViewKt$allViews$1", m26211f = "View.kt", m26212l = {410, 412}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements InterfaceC9544p {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC11588c<? super ViewKt$allViews$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, interfaceC11588c);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r1.m22556d(r5, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.AbstractC9924b.m20071b(r5)
            goto L4f
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.L$0
            pd.i r1 = (p296pd.AbstractC10661i) r1
            kotlin.AbstractC9924b.m20071b(r5)
            goto L37
        L22:
            kotlin.AbstractC9924b.m20071b(r5)
            java.lang.Object r5 = r4.L$0
            r1 = r5
            pd.i r1 = (p296pd.AbstractC10661i) r1
            android.view.View r5 = r4.$this_allViews
            r4.L$0 = r1
            r4.label = r3
            java.lang.Object r5 = r1.mo22551a(r5, r4)
            if (r5 != r0) goto L37
            goto L4e
        L37:
            android.view.View r5 = r4.$this_allViews
            boolean r3 = r5 instanceof android.view.ViewGroup
            if (r3 == 0) goto L4f
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            pd.g r5 = androidx.core.view.ViewGroupKt.getDescendants(r5)
            r3 = 0
            r4.L$0 = r3
            r4.label = r2
            java.lang.Object r5 = r1.m22556d(r5, r4)
            if (r5 != r0) goto L4f
        L4e:
            return r0
        L4f:
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((ViewKt$allViews$1) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
