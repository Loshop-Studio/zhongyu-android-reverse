package androidx.paging;

import androidx.annotation.CheckResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(m13412d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a>\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b0\u0007H\u0007\u001aN\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\n0\f0\u0007H\u0007\u001a^\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\n*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u0002H\n*\b\u0012\u0004\u0012\u0002H\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\n0\u0011H\u0007\u001aH\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\n0\u0007H\u0007¨\u0006\u0013"}, m13413d2 = {"filter", "Landroidx/paging/PagingData;", ExifInterface.GPS_DIRECTION_TRUE, "", "executor", "Ljava/util/concurrent/Executor;", "predicate", "Lkotlin/Function1;", "", "flatMap", "R", "transform", "", "insertSeparators", "terminalSeparatorType", "Landroidx/paging/TerminalSeparatorType;", "generator", "Lkotlin/Function2;", "map", "paging-common_release"}, m13414k = 5, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m13418xs = "androidx/paging/PagingDataTransforms")
@SourceDebugExtension({"SMAP\nPagingDataTransforms.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n+ 2 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 3 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 4 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 5 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,191:1\n32#2,2:192\n34#2,3:199\n32#2,2:202\n34#2,3:209\n32#2,2:212\n34#2,3:219\n53#3:194\n55#3:198\n53#3:204\n55#3:208\n53#3:214\n55#3:218\n50#4:195\n55#4:197\n50#4:205\n55#4:207\n50#4:215\n55#4:217\n107#5:196\n107#5:206\n107#5:216\n*S KotlinDebug\n*F\n+ 1 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n37#1:192,2\n37#1:199,3\n53#1:202,2\n53#1:209,3\n69#1:212,2\n69#1:219,3\n37#1:194\n37#1:198\n53#1:204\n53#1:208\n69#1:214\n69#1:218\n37#1:195\n37#1:197\n53#1:205\n53#1:207\n69#1:215\n69#1:217\n37#1:196\n53#1:206\n69#1:216\n*E\n"})
/* loaded from: classes3.dex */
final /* synthetic */ class PagingDataTransforms__PagingDataTransforms_jvmKt {

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(m13412d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00012\b\u0010\u0004\u001a\u0004\u0018\u0001H\u00032\b\u0010\u0005\u001a\u0004\u0018\u0001H\u0003H\u008a@"}, m13413d2 = {"<anonymous>", "R", "", ExifInterface.GPS_DIRECTION_TRUE, "before", "after"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1", m13451f = "PagingDataTransforms.jvm.kt", m13452i = {}, m13453l = {186}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1 */
    public static final class C44331<R, T> extends SuspendLambda implements Function3<T, T, Continuation<? super R>, Object> {
        final /* synthetic */ Executor $executor;
        final /* synthetic */ Function2<T, T, R> $generator;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u0001*\u00020\u0004H\u008a@"}, m13413d2 = {"<anonymous>", "R", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1", m13451f = "PagingDataTransforms.jvm.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$insertSeparators$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super R>, Object> {
            final /* synthetic */ T $after;
            final /* synthetic */ T $before;
            final /* synthetic */ Function2<T, T, R> $generator;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Function2<? super T, ? super T, ? extends R> function2, T t9, T t10, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$generator = function2;
                this.$before = t9;
                this.$after = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$generator, this.$before, this.$after, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.$generator.invoke(this.$before, this.$after);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super R> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C44331(Executor executor, Function2<? super T, ? super T, ? extends R> function2, Continuation<? super C44331> continuation) {
            super(3, continuation);
            this.$executor = executor;
            this.$generator = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.label;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            CoroutineDispatcher coroutineDispatcherFrom = ExecutorsKt.from(this.$executor);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$generator, obj2, obj3, null);
            this.L$0 = null;
            this.label = 1;
            Object objWithContext = BuildersKt.withContext(coroutineDispatcherFrom, anonymousClass1, this);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(T t9, T t10, Continuation<? super R> continuation) {
            C44331 c44331 = new C44331(this.$executor, this.$generator, continuation);
            c44331.L$0 = t9;
            c44331.L$1 = t10;
            return c44331.invokeSuspend(Unit.INSTANCE);
        }
    }

    @CheckResult
    @JvmName(name = "filter")
    public static final <T> PagingData<T> filter(PagingData<T> pagingData, final Executor executor, final Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(pagingData, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        final Flow<PageEvent<T>> flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData<>(new Flow<PageEvent<T>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "androidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 4 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n70#4:225\n*E\n"})
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ Function1 $predicate$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m13450c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2", m13451f = "PagingDataTransforms.jvm.kt", m13452i = {}, m13453l = {225, 223}, m13454m = "emit", m13455n = {}, m13456s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Executor executor, Function1 function1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$executor$inlined = executor;
                    this.$predicate$inlined = function1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4428x840b8469.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$$inlined$transform$1$2$1 r0 = (androidx.paging.C4428x840b8469.AnonymousClass2.AnonymousClass1) r0
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
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L5f
                    L3d:
                        kotlin.ResultKt.throwOnFailure(r11)
                        kotlinx.coroutines.flow.FlowCollector r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.ExecutorsKt.from(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$filter$1$1
                        kotlin.jvm.functions.Function1 r7 = r9.$predicate$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r2, r6, r0)
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
                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4428x840b8469.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(flowCollector, executor, predicate), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    @CheckResult
    public static final <T, R> PagingData<R> flatMap(PagingData<T> pagingData, final Executor executor, final Function1<? super T, ? extends Iterable<? extends R>> transform) {
        Intrinsics.checkNotNullParameter(pagingData, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final Flow<PageEvent<T>> flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData<>(new Flow<PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "androidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 4 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n54#4:225\n*E\n"})
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ Function1 $transform$inlined;

                @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m13450c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2", m13451f = "PagingDataTransforms.jvm.kt", m13452i = {}, m13453l = {225, 223}, m13454m = "emit", m13455n = {}, m13456s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Executor executor, Function1 function1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$executor$inlined = executor;
                    this.$transform$inlined = function1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4429x4f65287c.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$$inlined$transform$1$2$1 r0 = (androidx.paging.C4429x4f65287c.AnonymousClass2.AnonymousClass1) r0
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
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L5f
                    L3d:
                        kotlin.ResultKt.throwOnFailure(r11)
                        kotlinx.coroutines.flow.FlowCollector r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.ExecutorsKt.from(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$flatMap$1$1
                        kotlin.jvm.functions.Function1 r7 = r9.$transform$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r2, r6, r0)
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
                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4429x4f65287c.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(flowCollector, executor, transform), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    @CheckResult
    @JvmOverloads
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, Executor executor, Function2<? super T, ? super T, ? extends R> generator) {
        Intrinsics.checkNotNullParameter(pagingData, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(generator, "generator");
        return insertSeparators$default(pagingData, null, executor, generator, 1, null);
    }

    public static /* synthetic */ PagingData insertSeparators$default(PagingData pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, Function2 function2, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            terminalSeparatorType = TerminalSeparatorType.FULLY_COMPLETE;
        }
        return PagingDataTransforms.insertSeparators(pagingData, terminalSeparatorType, executor, function2);
    }

    @CheckResult
    public static final <T, R> PagingData<R> map(PagingData<T> pagingData, final Executor executor, final Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(pagingData, "<this>");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(transform, "transform");
        final Flow<PageEvent<T>> flow$paging_common_release = pagingData.getFlow$paging_common_release();
        return new PagingData<>(new Flow<PageEvent<R>>() { // from class: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1

            @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m13413d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "androidx/paging/PagingDataTransforms__PagingDataTransformsKt$transform$$inlined$map$1$2"}, m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 PagingDataTransforms.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransformsKt\n+ 4 PagingDataTransforms.jvm.kt\nandroidx/paging/PagingDataTransforms__PagingDataTransforms_jvmKt\n*L\n1#1,222:1\n54#2:223\n33#3:224\n38#4:225\n*E\n"})
            /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Executor $executor$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ Function1 $transform$inlined;

                @Metadata(m13414k = 3, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
                @DebugMetadata(m13450c = "androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2", m13451f = "PagingDataTransforms.jvm.kt", m13452i = {}, m13453l = {225, 223}, m13454m = "emit", m13455n = {}, m13456s = {})
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                /* renamed from: androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Executor executor, Function1 function1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$executor$inlined = executor;
                    this.$transform$inlined = function1;
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                
                    if (r10.emit(r11, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                    /*
                        r9 = this;
                        boolean r0 = r11 instanceof androidx.paging.C4430xebbe3763.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r11
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$$inlined$transform$1$2$1 r0 = (androidx.paging.C4430xebbe3763.AnonymousClass2.AnonymousClass1) r0
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
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 0
                        r4 = 2
                        r5 = 1
                        if (r2 == 0) goto L3d
                        if (r2 == r5) goto L35
                        if (r2 != r4) goto L2d
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L6a
                    L2d:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L35:
                        java.lang.Object r10 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L5f
                    L3d:
                        kotlin.ResultKt.throwOnFailure(r11)
                        kotlinx.coroutines.flow.FlowCollector r11 = r9.$this_unsafeFlow
                        androidx.paging.PageEvent r10 = (androidx.paging.PageEvent) r10
                        java.util.concurrent.Executor r2 = r9.$executor$inlined
                        kotlinx.coroutines.CoroutineDispatcher r2 = kotlinx.coroutines.ExecutorsKt.from(r2)
                        androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1 r6 = new androidx.paging.PagingDataTransforms__PagingDataTransforms_jvmKt$map$1$1
                        kotlin.jvm.functions.Function1 r7 = r9.$transform$inlined
                        r6.<init>(r10, r7, r3)
                        r0.L$0 = r11
                        r0.label = r5
                        java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r2, r6, r0)
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
                        kotlin.Unit r10 = kotlin.Unit.INSTANCE
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.paging.C4430xebbe3763.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = flow$paging_common_release.collect(new AnonymousClass2(flowCollector, executor, transform), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, pagingData.getUiReceiver(), pagingData.getHintReceiver(), null, 8, null);
    }

    @CheckResult
    @JvmOverloads
    public static final <R, T extends R> PagingData<R> insertSeparators(PagingData<T> pagingData, TerminalSeparatorType terminalSeparatorType, Executor executor, Function2<? super T, ? super T, ? extends R> generator) {
        Intrinsics.checkNotNullParameter(pagingData, "<this>");
        Intrinsics.checkNotNullParameter(terminalSeparatorType, "terminalSeparatorType");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(generator, "generator");
        return PagingDataTransforms__PagingDataTransformsKt.insertSeparators(pagingData, terminalSeparatorType, new C44331(executor, generator, null));
    }
}
