package androidx.compose.foundation.relocation;

import androidx.compose.runtime.collection.MutableVector;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
final class BringIntoViewRequesterImpl implements BringIntoViewRequester {
    private final MutableVector<BringIntoViewRequesterNode> nodes = new MutableVector<>(new BringIntoViewRequesterNode[16], 0);

    @InterfaceC11829d(m26210c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m26211f = "BringIntoViewRequester.kt", m26212l = {100}, m26213m = "bringIntoView")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 */
    public static final class C16561 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16561(InterfaceC11588c<? super C16561> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BringIntoViewRequesterImpl.this.bringIntoView(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:19:0x006c). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object bringIntoView(androidx.compose.p014ui.geometry.Rect r9, vc.InterfaceC11588c<? super p309qc.C10786q> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.C16561
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.C16561) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 r0 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r9 = r0.I$1
            int r2 = r0.I$0
            java.lang.Object r4 = r0.L$1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.geometry.Rect r5 = (androidx.compose.p014ui.geometry.Rect) r5
            kotlin.AbstractC9924b.m20071b(r10)
            r10 = r5
            goto L6c
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlin.AbstractC9924b.m20071b(r10)
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.relocation.BringIntoViewRequesterNode> r10 = r8.nodes
            T[] r2 = r10.content
            int r10 = r10.getSize()
            r4 = 0
            r7 = r10
            r10 = r9
            r9 = r7
            r7 = r4
            r4 = r2
            r2 = r7
        L50:
            if (r2 >= r9) goto L6e
            r5 = r4[r2]
            androidx.compose.foundation.relocation.BringIntoViewRequesterNode r5 = (androidx.compose.foundation.relocation.BringIntoViewRequesterNode) r5
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1 r6 = new androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1
            r6.<init>()
            r0.L$0 = r10
            r0.L$1 = r4
            r0.I$0 = r2
            r0.I$1 = r9
            r0.label = r3
            java.lang.Object r5 = androidx.compose.p014ui.relocation.BringIntoViewModifierNodeKt.bringIntoView(r5, r6, r0)
            if (r5 != r1) goto L6c
            return r1
        L6c:
            int r2 = r2 + r3
            goto L50
        L6e:
            qc.q r9 = p309qc.C10786q.f26013a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl.bringIntoView(androidx.compose.ui.geometry.Rect, vc.c):java.lang.Object");
    }

    public final MutableVector<BringIntoViewRequesterNode> getNodes() {
        return this.nodes;
    }
}
