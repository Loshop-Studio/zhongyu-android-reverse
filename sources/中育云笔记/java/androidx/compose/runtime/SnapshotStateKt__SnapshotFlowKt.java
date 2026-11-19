package androidx.compose.runtime;

import com.alibaba.fastjson.asm.Opcodes;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p379vd.InterfaceC11612u;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m26211f = "SnapshotFlow.kt", m26212l = {142, 146, Opcodes.RET}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 */
    public static final class C25811 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9529a $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25811(InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super C25811> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9529a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C25811 c25811 = new C25811(this.$block, interfaceC11588c);
            c25811.L$0 = obj;
            return c25811;
        }

        /* JADX WARN: Path cross not found for [B:34:0x00e2, B:38:0x00eb], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:42:0x00fa, B:58:0x0139], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:58:0x0139, B:42:0x00fa], limit reached: 75 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:32:0x00de, B:34:0x00e2, B:39:0x00ec, B:42:0x00fa, B:46:0x0110, B:48:0x0119, B:56:0x0135, B:57:0x0138, B:15:0x0050, B:43:0x0105, B:45:0x010d, B:54:0x0131, B:55:0x0134), top: B:74:0x0050, inners: #5 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.C25811.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C25811) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @Composable
    public static final <T> State<T> collectAsState(InterfaceC11612u interfaceC11612u, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        InterfaceC9945d interfaceC9945d2 = interfaceC9945d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)");
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(interfaceC11612u, interfaceC11612u.getValue(), interfaceC9945d2, composer, (i10 & 14) | ((i10 << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateCollectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(androidx.collection.MutableScatterSet<java.lang.Object> r13, java.util.Set<? extends java.lang.Object> r14) {
        /*
            java.lang.Object[] r0 = r13.elements
            long[] r13 = r13.metadata
            int r1 = r13.length
            int r1 = r1 + (-2)
            r2 = 0
            if (r1 < 0) goto L48
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L43
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L41
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L3d
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            boolean r9 = r14.contains(r9)
            if (r9 == 0) goto L3d
            r13 = 1
            return r13
        L3d:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L41:
            if (r6 != r7) goto L48
        L43:
            if (r3 == r1) goto L48
            int r3 = r3 + 1
            goto Lb
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.intersects$SnapshotStateKt__SnapshotFlowKt(androidx.collection.MutableScatterSet, java.util.Set):boolean");
    }

    public static final <T> InterfaceC11594c snapshotFlow(InterfaceC9529a interfaceC9529a) {
        return AbstractC11596e.m25531B(new C25811(interfaceC9529a, null));
    }

    @Composable
    public static final <T extends R, R> State<R> collectAsState(InterfaceC11594c interfaceC11594c, R r10, InterfaceC9945d interfaceC9945d, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC9945d = EmptyCoroutineContext.f23351c;
        }
        InterfaceC9945d interfaceC9945d2 = interfaceC9945d;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)");
        }
        boolean zChangedInstance = composer.changedInstance(interfaceC9945d2) | composer.changedInstance(interfaceC11594c);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(interfaceC9945d2, interfaceC11594c, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        State<R> stateProduceState = SnapshotStateKt.produceState(r10, interfaceC11594c, interfaceC9945d2, (InterfaceC9544p) objRememberedValue, composer, ((i10 >> 3) & 14) | ((i10 << 3) & 112) | (i10 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateProduceState;
    }
}
