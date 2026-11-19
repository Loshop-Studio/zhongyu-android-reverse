package androidx.compose.p013ui.scrollcapture;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;
import p322z7.AbstractC10729c;

/* loaded from: classes2.dex */
final class RelativeScroller {
    private float scrollAmount;
    private final InterfaceC10574p scrollBy;
    private final int viewportSize;

    @InterfaceC9539d(m17800c = "androidx.compose.ui.scrollcapture.RelativeScroller", m17801f = "ComposeScrollCaptureCallback.android.kt", m17802l = {296}, m17803m = "scrollBy")
    /* renamed from: androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 */
    public static final class C30551 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C30551(InterfaceC9324c<? super C30551> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RelativeScroller.this.scrollBy(0.0f, this);
        }
    }

    public RelativeScroller(int i10, InterfaceC10574p interfaceC10574p) {
        this.viewportSize = i10;
        this.scrollBy = interfaceC10574p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scrollBy(float r5, p179m7.InterfaceC9324c<? super p123h7.C8736p> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.p013ui.scrollcapture.RelativeScroller.C30551
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.scrollcapture.RelativeScroller$scrollBy$1 r0 = (androidx.compose.p013ui.scrollcapture.RelativeScroller.C30551) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.scrollcapture.RelativeScroller r5 = (androidx.compose.p013ui.scrollcapture.RelativeScroller) r5
            kotlin.AbstractC9079b.m15926b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9079b.m15926b(r6)
            x7.p r6 = r4.scrollBy
            java.lang.Float r5 = p201o7.AbstractC9536a.m17797b(r5)
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
            h7.p r5 = p123h7.C8736p.f16368a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.scrollcapture.RelativeScroller.scrollBy(float, m7.c):java.lang.Object");
    }

    public final float getScrollAmount() {
        return this.scrollAmount;
    }

    public final int mapOffsetToViewport(int i10) {
        return AbstractC8323h.m13518m(i10 - AbstractC10729c.m20035d(this.scrollAmount), 0, this.viewportSize);
    }

    public final void reset() {
        this.scrollAmount = 0.0f;
    }

    public final Object scrollRangeIntoView(int i10, int i11, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
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
            return C8736p.f16368a;
        }
        if (f10 >= f11) {
            i10 = i11 - i13;
        }
        Object objScrollTo = scrollTo(i10, interfaceC9324c);
        return objScrollTo == AbstractC9434a.m17291f() ? objScrollTo : C8736p.f16368a;
    }

    public final Object scrollTo(float f10, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        Object objScrollBy = scrollBy(f10 - this.scrollAmount, interfaceC9324c);
        return objScrollBy == AbstractC9434a.m17291f() ? objScrollBy : C8736p.f16368a;
    }
}
