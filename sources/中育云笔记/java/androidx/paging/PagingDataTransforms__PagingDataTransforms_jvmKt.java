package androidx.paging;

import androidx.annotation.CheckResult;
import com.alibaba.fastjson.asm.Opcodes;
import java.util.concurrent.Executor;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11109f;
import sd.AbstractC11115g1;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
final /* synthetic */ class PagingDataTransforms__PagingDataTransforms_jvmKt {

    @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1", m26211f = "PagingDataTransforms.jvm.kt", m26212l = {Opcodes.ARETURN}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1 */
    public static final class C42791 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ Executor $executor;
        final /* synthetic */ InterfaceC9544p $generator;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1", m26211f = "PagingDataTransforms.jvm.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ T $after;
            final /* synthetic */ T $before;
            final /* synthetic */ InterfaceC9544p $generator;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC9544p interfaceC9544p, T t10, T t11, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$generator = interfaceC9544p;
                this.$before = t10;
                this.$after = t11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$generator, this.$before, this.$after, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return this.$generator.invoke(this.$before, this.$after);
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super R> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42791(Executor executor, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C42791> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$executor = executor;
            this.$generator = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                return obj;
            }
            AbstractC9924b.m20071b(obj);
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            AbstractC11106e0 abstractC11106e0M24721b = AbstractC11115g1.m24721b(this.$executor);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$generator, obj2, obj3, null);
            this.L$0 = null;
            this.label = 1;
            Object objM24709g = AbstractC11109f.m24709g(abstractC11106e0M24721b, anonymousClass1, this);
            return objM24709g == objM25952f ? objM25952f : objM24709g;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(T t10, T t11, InterfaceC11588c<? super R> interfaceC11588c) {
            C42791 c42791 = new C42791(this.$executor, this.$generator, interfaceC11588c);
            c42791.L$0 = t10;
            c42791.L$1 = t11;
            return c42791.invokeSuspend(C10786q.f26013a);
        }
    }

    @CheckResult
    public static final <T> PagingData<T> filter(PagingData<T> pagingData, final Executor executor, final InterfaceC9540l predicate) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(predicate, "predicate");
        final InterfaceC11594c flow$paging_common = pagingData.getFlow$paging_common();
        return new PagingData<>(new InterfaceC11594c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC11595d {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ InterfaceC9540l $predicate$inlined;
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;

                @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2", m26211f = "PagingDataTransforms.jvm.kt", m26212l = {52, 50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC11595d interfaceC11595d, Executor executor, InterfaceC9540l interfaceC9540l) {
                    this.$this_unsafeFlow = interfaceC11595d;
                    this.$executor$inlined = executor;
                    this.$predicate$inlined = interfaceC9540l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4274x840b8469.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1 r0 = (androidx.paging.C4274x840b8469.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.AbstractC9924b.m20071b(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        vd.d r10 = (p379vd.InterfaceC11595d) r10
                        kotlin.AbstractC9924b.m20071b(r11)
                        goto L5f
                    L3d:
                        kotlin.AbstractC9924b.m20071b(r11)
                        vd.d r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        sd.e0 r2 = sd.AbstractC11115g1.m24721b(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1
                        hd.l r7 = r9.$predicate$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = sd.AbstractC11109f.m24709g(r2, r6, r0)
                        if (r10 != r1) goto L5c
                        goto L69
                    L5c:
                        r8 = r11
                        r11 = r10
                        r10 = r8
                    L5f:
                        r0.L$0 = r3
                        r0.label = r4
                        java.lang.Object r10 = r10.emit(r11, r0)
                        if (r10 != r1) goto L6a
                    L69:
                        return r1
                    L6a:
                        qc.q r10 = p309qc.C10786q.f26013a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4274x840b8469.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = flow$paging_common.collect(new AnonymousClass2(interfaceC11595d, executor, predicate), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    @CheckResult
    public static final <T, R> PagingData<R> flatMap(PagingData<T> pagingData, final Executor executor, final InterfaceC9540l transform) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(transform, "transform");
        final InterfaceC11594c flow$paging_common = pagingData.getFlow$paging_common();
        return new PagingData<>(new InterfaceC11594c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC11595d {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;
                final /* synthetic */ InterfaceC9540l $transform$inlined;

                @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2", m26211f = "PagingDataTransforms.jvm.kt", m26212l = {52, 50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC11595d interfaceC11595d, Executor executor, InterfaceC9540l interfaceC9540l) {
                    this.$this_unsafeFlow = interfaceC11595d;
                    this.$executor$inlined = executor;
                    this.$transform$inlined = interfaceC9540l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4275x4f65287c.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1 r0 = (androidx.paging.C4275x4f65287c.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.AbstractC9924b.m20071b(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        vd.d r10 = (p379vd.InterfaceC11595d) r10
                        kotlin.AbstractC9924b.m20071b(r11)
                        goto L5f
                    L3d:
                        kotlin.AbstractC9924b.m20071b(r11)
                        vd.d r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        sd.e0 r2 = sd.AbstractC11115g1.m24721b(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1
                        hd.l r7 = r9.$transform$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = sd.AbstractC11109f.m24709g(r2, r6, r0)
                        if (r10 != r1) goto L5c
                        goto L69
                    L5c:
                        r8 = r11
                        r11 = r10
                        r10 = r8
                    L5f:
                        r0.L$0 = r3
                        r0.label = r4
                        java.lang.Object r10 = r10.emit(r11, r0)
                        if (r10 != r1) goto L6a
                    L69:
                        return r1
                    L6a:
                        qc.q r10 = p309qc.C10786q.f26013a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4275x4f65287c.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = flow$paging_common.collect(new AnonymousClass2(interfaceC11595d, executor, transform), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, Executor executor, InterfaceC9544p generator) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(generator, "generator");
        return insertSeparators$default(pagingData, null, executor, generator, 1, null);
    }

    public static /* synthetic */ PagingData insertSeparators$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertSeparators(pagingData, terminalSeparatorType, executor, interfaceC9544p);
    }

    @CheckResult
    public static final <T, R> PagingData<R> map(PagingData<T> pagingData, final Executor executor, final InterfaceC9540l transform) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(transform, "transform");
        final InterfaceC11594c flow$paging_common = pagingData.getFlow$paging_common();
        return new PagingData<>(new InterfaceC11594c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC11595d {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ InterfaceC11595d $this_unsafeFlow;
                final /* synthetic */ InterfaceC9540l $transform$inlined;

                @InterfaceC11829d(m26210c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2", m26211f = "PagingDataTransforms.jvm.kt", m26212l = {52, 50}, m26213m = "emit", m26214v = 1)
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC11588c interfaceC11588c) {
                        super(interfaceC11588c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC11595d interfaceC11595d, Executor executor, InterfaceC9540l interfaceC9540l) {
                    this.$this_unsafeFlow = interfaceC11595d;
                    this.$executor$inlined = executor;
                    this.$transform$inlined = interfaceC9540l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p379vd.InterfaceC11595d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, vc.InterfaceC11588c r11) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4276xebbe3763.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1 r0 = (androidx.paging.C4276xebbe3763.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1 r0 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1
                        r0.<init>(r11)
                    L18:
                        java.lang.Object r11 = r0.result
                        java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.AbstractC9924b.m20071b(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        vd.d r10 = (p379vd.InterfaceC11595d) r10
                        kotlin.AbstractC9924b.m20071b(r11)
                        goto L5f
                    L3d:
                        kotlin.AbstractC9924b.m20071b(r11)
                        vd.d r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        sd.e0 r2 = sd.AbstractC11115g1.m24721b(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1
                        hd.l r7 = r9.$transform$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = sd.AbstractC11109f.m24709g(r2, r6, r0)
                        if (r10 != r1) goto L5c
                        goto L69
                    L5c:
                        r8 = r11
                        r11 = r10
                        r10 = r8
                    L5f:
                        r0.L$0 = r3
                        r0.label = r4
                        java.lang.Object r10 = r10.emit(r11, r0)
                        if (r10 != r1) goto L6a
                    L69:
                        return r1
                    L6a:
                        qc.q r10 = p309qc.C10786q.f26013a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4276xebbe3763.AnonymousClass2.emit(java.lang.Object, vc.c):java.lang.Object");
                }
            }

            @Override // p379vd.InterfaceC11594c
            public Object collect(InterfaceC11595d interfaceC11595d, InterfaceC11588c interfaceC11588c) {
                Object objCollect = flow$paging_common.collect(new AnonymousClass2(interfaceC11595d, executor, transform), interfaceC11588c);
                return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
            }
        }, pagingData.getUiReceiver$paging_common(), pagingData.getHintReceiver$paging_common(), null, 8, null);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, InterfaceC9544p generator) {
        AbstractC9979u.m20294g(pagingData, "<this>");
        AbstractC9979u.m20294g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9979u.m20294g(executor, "executor");
        AbstractC9979u.m20294g(generator, "generator");
        return PagingDataTransforms__PagingDataTransformsKt.insertSeparators(pagingData, terminalSeparatorType, new C42791(executor, generator, null));
    }
}
