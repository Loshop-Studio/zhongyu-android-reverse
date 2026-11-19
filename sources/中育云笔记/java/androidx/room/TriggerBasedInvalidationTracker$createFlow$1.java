package androidx.room;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1", m26211f = "InvalidationTracker.kt", m26212l = {233, 233, 237}, m26213m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ boolean $emitInitialState;
    final /* synthetic */ String[] $resolvedTableNames;
    final /* synthetic */ int[] $tableIds;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    @InterfaceC11829d(m26210c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1", m26211f = "InvalidationTracker.kt", m26212l = {233}, m26213m = "invokeSuspend")
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1 */
    public static final class C44831 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44831(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, InterfaceC11588c<? super C44831> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = triggerBasedInvalidationTracker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C44831(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
                this.label = 1;
                if (triggerBasedInvalidationTracker.syncTriggers$room_runtime_release(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C44831) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2 */
    public static final class C44842<T> implements InterfaceC11595d {
        final /* synthetic */ InterfaceC11595d $$this$flow;
        final /* synthetic */ Ref$ObjectRef<int[]> $currentVersions;
        final /* synthetic */ boolean $emitInitialState;
        final /* synthetic */ String[] $resolvedTableNames;
        final /* synthetic */ int[] $tableIds;

        public C44842(Ref$ObjectRef<int[]> ref$ObjectRef, boolean z10, InterfaceC11595d interfaceC11595d, String[] strArr, int[] iArr) {
            this.$currentVersions = ref$ObjectRef;
            this.$emitInitialState = z10;
            this.$$this$flow = interfaceC11595d;
            this.$resolvedTableNames = strArr;
            this.$tableIds = iArr;
        }

        @Override // p379vd.InterfaceC11595d
        public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c) {
            return emit((int[]) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
        
            if (r14.emit(r2, r0) == r1) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(int[] r13, vc.InterfaceC11588c<? super p309qc.C10786q> r14) throws java.lang.Throwable {
            /*
                r12 = this;
                boolean r0 = r14 instanceof androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
                if (r0 == 0) goto L13
                r0 = r14
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2$emit$1
                r0.<init>(r12, r14)
            L18:
                java.lang.Object r14 = r0.result
                java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L3e
                if (r2 == r4) goto L31
                if (r2 != r3) goto L29
                goto L31
            L29:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L31:
                java.lang.Object r13 = r0.L$1
                int[] r13 = (int[]) r13
                java.lang.Object r0 = r0.L$0
                androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2 r0 = (androidx.room.TriggerBasedInvalidationTracker$createFlow$1.C44842) r0
                kotlin.AbstractC9924b.m20071b(r14)
                goto La9
            L3e:
                kotlin.AbstractC9924b.m20071b(r14)
                kotlin.jvm.internal.Ref$ObjectRef<int[]> r14 = r12.$currentVersions
                java.lang.Object r2 = r14.f23402c
                if (r2 != 0) goto L60
                boolean r14 = r12.$emitInitialState
                if (r14 == 0) goto La8
                vd.d r14 = r12.$$this$flow
                java.lang.String[] r2 = r12.$resolvedTableNames
                java.util.Set r2 = p325rc.AbstractC10968r.m24115y1(r2)
                r0.L$0 = r12
                r0.L$1 = r13
                r0.label = r4
                java.lang.Object r14 = r14.emit(r2, r0)
                if (r14 != r1) goto La8
                goto La7
            L60:
                java.lang.String[] r2 = r12.$resolvedTableNames
                int[] r4 = r12.$tableIds
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                int r6 = r2.length
                r7 = 0
                r8 = r7
            L6c:
                if (r7 >= r6) goto L8f
                r9 = r2[r7]
                int r10 = r8 + 1
                java.lang.Object r11 = r14.f23402c
                if (r11 == 0) goto L87
                int[] r11 = (int[]) r11
                r8 = r4[r8]
                r11 = r11[r8]
                r8 = r13[r8]
                if (r11 == r8) goto L83
                r5.add(r9)
            L83:
                int r7 = r7 + 1
                r8 = r10
                goto L6c
            L87:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "Required value was null."
                r13.<init>(r14)
                throw r13
            L8f:
                boolean r14 = r5.isEmpty()
                if (r14 != 0) goto La8
                vd.d r14 = r12.$$this$flow
                java.util.Set r2 = p325rc.AbstractC10947g0.m23929c1(r5)
                r0.L$0 = r12
                r0.L$1 = r13
                r0.label = r3
                java.lang.Object r14 = r14.emit(r2, r0)
                if (r14 != r1) goto La8
            La7:
                return r1
            La8:
                r0 = r12
            La9:
                kotlin.jvm.internal.Ref$ObjectRef<int[]> r14 = r0.$currentVersions
                r14.f23402c = r13
                qc.q r13 = p309qc.C10786q.f26013a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1.C44842.emit(int[], vc.c):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$createFlow$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, int[] iArr, boolean z10, String[] strArr, InterfaceC11588c<? super TriggerBasedInvalidationTracker$createFlow$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = triggerBasedInvalidationTracker;
        this.$tableIds = iArr;
        this.$emitInitialState = z10;
        this.$resolvedTableNames = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        TriggerBasedInvalidationTracker$createFlow$1 triggerBasedInvalidationTracker$createFlow$1 = new TriggerBasedInvalidationTracker$createFlow$1(this.this$0, this.$tableIds, this.$emitInitialState, this.$resolvedTableNames, interfaceC11588c);
        triggerBasedInvalidationTracker$createFlow$1.L$0 = obj;
        return triggerBasedInvalidationTracker$createFlow$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (sd.AbstractC11109f.m24709g((kotlin.coroutines.InterfaceC9945d) r12, r5, r11) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r12.collect(r4, r11) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
            int r1 = r11.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L33
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 == r3) goto L1a
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1a:
            kotlin.AbstractC9924b.m20071b(r12)     // Catch: java.lang.Throwable -> L1f
            goto L95
        L1f:
            r0 = move-exception
            r12 = r0
            goto L9b
        L23:
            java.lang.Object r1 = r11.L$0
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            kotlin.AbstractC9924b.m20071b(r12)
            goto L71
        L2b:
            java.lang.Object r1 = r11.L$0
            vd.d r1 = (p379vd.InterfaceC11595d) r1
            kotlin.AbstractC9924b.m20071b(r12)
            goto L5d
        L33:
            kotlin.AbstractC9924b.m20071b(r12)
            java.lang.Object r12 = r11.L$0
            vd.d r12 = (p379vd.InterfaceC11595d) r12
            androidx.room.TriggerBasedInvalidationTracker r1 = r11.this$0
            androidx.room.ObservedTableStates r1 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableStates$p(r1)
            int[] r6 = r11.$tableIds
            boolean r1 = r1.onObserverAdded$room_runtime_release(r6)
            if (r1 == 0) goto L73
            androidx.room.TriggerBasedInvalidationTracker r1 = r11.this$0
            androidx.room.RoomDatabase r1 = androidx.room.TriggerBasedInvalidationTracker.access$getDatabase$p(r1)
            r11.L$0 = r12
            r11.label = r5
            r5 = 0
            java.lang.Object r1 = androidx.room.util.DBUtil.getCoroutineContext(r1, r5, r11)
            if (r1 != r0) goto L5a
            goto L94
        L5a:
            r10 = r1
            r1 = r12
            r12 = r10
        L5d:
            kotlin.coroutines.d r12 = (kotlin.coroutines.InterfaceC9945d) r12
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1 r5 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$1
            androidx.room.TriggerBasedInvalidationTracker r6 = r11.this$0
            r5.<init>(r6, r2)
            r11.L$0 = r1
            r11.label = r4
            java.lang.Object r12 = sd.AbstractC11109f.m24709g(r12, r5, r11)
            if (r12 != r0) goto L71
            goto L94
        L71:
            r7 = r1
            goto L74
        L73:
            r7 = r12
        L74:
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> L1f
            r5.<init>()     // Catch: java.lang.Throwable -> L1f
            androidx.room.TriggerBasedInvalidationTracker r12 = r11.this$0     // Catch: java.lang.Throwable -> L1f
            androidx.room.ObservedTableVersions r12 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableVersions$p(r12)     // Catch: java.lang.Throwable -> L1f
            androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2 r4 = new androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2     // Catch: java.lang.Throwable -> L1f
            boolean r6 = r11.$emitInitialState     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r8 = r11.$resolvedTableNames     // Catch: java.lang.Throwable -> L1f
            int[] r9 = r11.$tableIds     // Catch: java.lang.Throwable -> L1f
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1f
            r11.L$0 = r2     // Catch: java.lang.Throwable -> L1f
            r11.label = r3     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r12 = r12.collect(r4, r11)     // Catch: java.lang.Throwable -> L1f
            if (r12 != r0) goto L95
        L94:
            return r0
        L95:
            kotlin.KotlinNothingValueException r12 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1f
            r12.<init>()     // Catch: java.lang.Throwable -> L1f
            throw r12     // Catch: java.lang.Throwable -> L1f
        L9b:
            androidx.room.TriggerBasedInvalidationTracker r0 = r11.this$0
            androidx.room.ObservedTableStates r0 = androidx.room.TriggerBasedInvalidationTracker.access$getObservedTableStates$p(r0)
            int[] r1 = r11.$tableIds
            r0.onObserverRemoved$room_runtime_release(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11595d interfaceC11595d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TriggerBasedInvalidationTracker$createFlow$1) create(interfaceC11595d, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
