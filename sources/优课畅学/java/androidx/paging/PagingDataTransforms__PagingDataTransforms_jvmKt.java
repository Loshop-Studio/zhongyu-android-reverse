package androidx.paging;

import androidx.annotation.CheckResult;
import com.tencent.smtt.sdk.TbsListener;
import java.util.concurrent.Executor;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8873s0;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
final /* synthetic */ class PagingDataTransforms__PagingDataTransforms_jvmKt {

    @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1", m17801f = "PagingDataTransforms.jvm.kt", m17802l = {186}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1 */
    public static final class C43721 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ Executor $executor;
        final /* synthetic */ InterfaceC10574p $generator;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1", m17801f = "PagingDataTransforms.jvm.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ T $after;
            final /* synthetic */ T $before;
            final /* synthetic */ InterfaceC10574p $generator;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC10574p interfaceC10574p, T t10, T t11, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$generator = interfaceC10574p;
                this.$before = t10;
                this.$after = t11;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$generator, this.$before, this.$after, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super R> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return this.$generator.invoke(this.$before, this.$after);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43721(Executor executor, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C43721> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$executor = executor;
            this.$generator = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                return obj;
            }
            AbstractC9079b.m15926b(obj);
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            CoroutineDispatcher coroutineDispatcherM14908b = AbstractC8873s0.m14908b(this.$executor);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$generator, obj2, obj3, null);
            this.L$0 = null;
            this.label = 1;
            Object objM14848g = AbstractC8833f.m14848g(coroutineDispatcherM14908b, anonymousClass1, this);
            return objM14848g == objM17291f ? objM17291f : objM14848g;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(T t10, T t11, InterfaceC9324c<? super R> interfaceC9324c) {
            C43721 c43721 = new C43721(this.$executor, this.$generator, interfaceC9324c);
            c43721.L$0 = t10;
            c43721.L$1 = t11;
            return c43721.invokeSuspend(C8736p.f16368a);
        }
    }

    @CheckResult
    public static final <T> PagingData<T> filter(PagingData<T> pagingData, final Executor executor, final InterfaceC10570l predicate) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(predicate, "predicate");
        final InterfaceC9266c flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData<>(new InterfaceC9266c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC9267d {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ InterfaceC10570l $predicate$inlined;
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;

                @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2", m17801f = "PagingDataTransforms.jvm.kt", m17802l = {TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC9267d interfaceC9267d, Executor executor, InterfaceC10570l interfaceC10570l) {
                    this.$this_unsafeFlow = interfaceC9267d;
                    this.$executor$inlined = executor;
                    this.$predicate$inlined = interfaceC10570l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4367x840b8469.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1 r0 = (androidx.paging.C4367x840b8469.AnonymousClass2.AnonymousClass1) r0
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
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.AbstractC9079b.m15926b(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        l8.d r10 = (p169l8.InterfaceC9267d) r10
                        kotlin.AbstractC9079b.m15926b(r11)
                        goto L5f
                    L3d:
                        kotlin.AbstractC9079b.m15926b(r11)
                        l8.d r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        kotlinx.coroutines.CoroutineDispatcher r2 = p135i8.AbstractC8873s0.m14908b(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1
                        x7.l r7 = r9.$predicate$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = p135i8.AbstractC8833f.m14848g(r2, r6, r0)
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
                        h7.p r10 = p123h7.C8736p.f16368a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4367x840b8469.AnonymousClass2.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(interfaceC9267d, executor, predicate), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final <T, R> PagingData<R> flatMap(PagingData<T> pagingData, final Executor executor, final InterfaceC10570l transform) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(transform, "transform");
        final InterfaceC9266c flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData<>(new InterfaceC9266c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC9267d {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;
                final /* synthetic */ InterfaceC10570l $transform$inlined;

                @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2", m17801f = "PagingDataTransforms.jvm.kt", m17802l = {TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC9267d interfaceC9267d, Executor executor, InterfaceC10570l interfaceC10570l) {
                    this.$this_unsafeFlow = interfaceC9267d;
                    this.$executor$inlined = executor;
                    this.$transform$inlined = interfaceC10570l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4368x4f65287c.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1 r0 = (androidx.paging.C4368x4f65287c.AnonymousClass2.AnonymousClass1) r0
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
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.AbstractC9079b.m15926b(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        l8.d r10 = (p169l8.InterfaceC9267d) r10
                        kotlin.AbstractC9079b.m15926b(r11)
                        goto L5f
                    L3d:
                        kotlin.AbstractC9079b.m15926b(r11)
                        l8.d r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        kotlinx.coroutines.CoroutineDispatcher r2 = p135i8.AbstractC8873s0.m14908b(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1
                        x7.l r7 = r9.$transform$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = p135i8.AbstractC8833f.m14848g(r2, r6, r0)
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
                        h7.p r10 = p123h7.C8736p.f16368a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4368x4f65287c.AnonymousClass2.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(interfaceC9267d, executor, transform), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, Executor executor, InterfaceC10574p generator) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(generator, "generator");
        return insertSeparators$default(pagingData, null, executor, generator, 1, null);
    }

    public static /* synthetic */ PagingData insertSeparators$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, InterfaceC10574p interfaceC10574p, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertSeparators(pagingData, terminalSeparatorType, executor, interfaceC10574p);
    }

    @CheckResult
    public static final <T, R> PagingData<R> map(PagingData<T> pagingData, final Executor executor, final InterfaceC10570l transform) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(transform, "transform");
        final InterfaceC9266c flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData<>(new InterfaceC9266c() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1

            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC9267d {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ InterfaceC9267d $this_unsafeFlow;
                final /* synthetic */ InterfaceC10570l $transform$inlined;

                @InterfaceC9539d(m17800c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2", m17801f = "PagingDataTransforms.jvm.kt", m17802l = {TbsListener.ErrorCode.CREATE_TEMP_CONF_ERROR, TbsListener.ErrorCode.EXCEED_LZMA_RETRY_NUM}, m17803m = "emit")
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC9324c interfaceC9324c) {
                        super(interfaceC9324c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC9267d interfaceC9267d, Executor executor, InterfaceC10570l interfaceC10570l) {
                    this.$this_unsafeFlow = interfaceC9267d;
                    this.$executor$inlined = executor;
                    this.$transform$inlined = interfaceC10570l;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // p169l8.InterfaceC9267d
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, p179m7.InterfaceC9324c r11) throws java.lang.Throwable {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4369xebbe3763.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1 r0 = (androidx.paging.C4369xebbe3763.AnonymousClass2.AnonymousClass1) r0
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
                        java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.AbstractC9079b.m15926b(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        l8.d r10 = (p169l8.InterfaceC9267d) r10
                        kotlin.AbstractC9079b.m15926b(r11)
                        goto L5f
                    L3d:
                        kotlin.AbstractC9079b.m15926b(r11)
                        l8.d r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        kotlinx.coroutines.CoroutineDispatcher r2 = p135i8.AbstractC8873s0.m14908b(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1
                        x7.l r7 = r9.$transform$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = p135i8.AbstractC8833f.m14848g(r2, r6, r0)
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
                        h7.p r10 = p123h7.C8736p.f16368a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4369xebbe3763.AnonymousClass2.emit(java.lang.Object, m7.c):java.lang.Object");
                }
            }

            @Override // p169l8.InterfaceC9266c
            public Object collect(InterfaceC9267d interfaceC9267d, InterfaceC9324c interfaceC9324c) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(interfaceC9267d, executor, transform), interfaceC9324c);
                return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
            }
        }, pagingData.getUiReceiver$paging_common_release(), pagingData.getHintReceiver$paging_common_release(), null, 8, null);
    }

    @CheckResult
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, InterfaceC10574p generator) {
        AbstractC9133u.m16133g(pagingData, "<this>");
        AbstractC9133u.m16133g(terminalSeparatorType, "terminalSeparatorType");
        AbstractC9133u.m16133g(executor, "executor");
        AbstractC9133u.m16133g(generator, "generator");
        return PagingDataTransforms__PagingDataTransformsKt.insertSeparators(pagingData, terminalSeparatorType, new C43721(executor, generator, null));
    }
}
