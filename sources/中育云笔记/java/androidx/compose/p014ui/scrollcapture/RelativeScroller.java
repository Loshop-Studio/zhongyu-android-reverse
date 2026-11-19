package androidx.compose.p014ui.scrollcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p181hd.InterfaceC9544p;
import p211jd.AbstractC9719c;
import p265nd.AbstractC10410o;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final class RelativeScroller {
    private float scrollAmount;
    private final InterfaceC9544p scrollBy;
    private final int viewportSize;

    @InterfaceC11829d(m26210c = "androidx.compose.ui.scrollcapture.RelativeScroller", m26211f = "ComposeScrollCaptureCallback.android.kt", m26212l = {296}, m26213m = "scrollBy")
    /* renamed from: androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 */
    public static final class C30851 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C30851(InterfaceC11588c<? super C30851> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeScroller.this.scrollBy(0.0f, this);
        }
    }

    public RelativeScroller(int i10, InterfaceC9544p interfaceC9544p) {
        this.viewportSize = i10;
        this.scrollBy = interfaceC9544p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollBy(float r5, vc.InterfaceC11588c<? super p309qc.C10786q> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.p014ui.scrollcapture.RelativeScroller.C30851
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.p014ui.scrollcapture.RelativeScroller.C30851) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = new androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = (androidx.compose.p014ui.scrollcapture.RelativeScroller) r5
            kotlin.AbstractC9924b.m20071b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r6)
            hd.p r6 = r4.scrollBy
            java.lang.Float r5 = p409xc.AbstractC11826a.m26207b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r5 = r4
        L4a:
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            float r0 = r5.scrollAmount
            float r0 = r0 + r6
            r5.scrollAmount = r0
            qc.q r5 = p309qc.C10786q.f26013a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.scrollcapture.RelativeScroller.scrollBy(float, vc.c):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int i10) {
        return AbstractC10410o.m21761n(i10 - AbstractC9719c.m19282d(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    public final Object scrollRangeIntoView(int i10, int i11, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        if (i10 > i11) {
            throw new IllegalArgumentException(("Expected min=" + i10 + " ≤ max=" + i11).toString());
        }
        int i12 = i11 - i10;
        int i13 = this.viewportSize;
        if (i12 > i13) {
            throw new IllegalArgumentException(("Expected range (" + i12 + ") to be ≤ viewportSize=" + this.viewportSize).toString());
        }
        float f10 = i10;
        float f11 = this.scrollAmount;
        if (f10 >= f11 && i11 <= i13 + f11) {
            return C10786q.f26013a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objScrollTo = scrollTo(i10, interfaceC11588c);
        return objScrollTo == AbstractC11725a.m25952f() ? objScrollTo : C10786q.f26013a;
    }

    public final Object scrollTo(float f10, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        Object objScrollBy = scrollBy(f10 - this.scrollAmount, interfaceC11588c);
        return objScrollBy == AbstractC11725a.m25952f() ? objScrollBy : C10786q.f26013a;
    }
}
