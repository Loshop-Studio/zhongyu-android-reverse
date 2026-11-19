package androidx.paging;

import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.selects.SelectClause2;

@Metadata(m13557d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0007J\u001c\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018H\u0096@¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0001J.\u0010\u001d\u001a\u00020\u00162#\u0010\u001e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00160\u001fH\u0096\u0001J\u0016\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00028\u0000H\u0097\u0001¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020\u00162\u0006\u0010#\u001a\u00028\u0000H\u0096A¢\u0006\u0002\u0010&J$\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00160(2\u0006\u0010#\u001a\u00028\u0000H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0010R$\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, m13558d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/paging/SimpleProducerScope;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "scope", "channel", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;)V", "getChannel", "()Lkotlinx/coroutines/channels/SendChannel;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "isClosedForSend", "", "()Z", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "awaitClose", "", "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "cause", "", "invokeOnClose", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "offer", "element", "(Ljava/lang/Object;)Z", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSimpleChannelFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,100:1\n314#2,11:101\n*S KotlinDebug\n*F\n+ 1 SimpleChannelFlow.kt\nandroidx/paging/SimpleProducerScopeImpl\n*L\n90#1:101,11\n*E\n"})
/* loaded from: classes3.dex */
public final class SimpleProducerScopeImpl<T> implements SimpleProducerScope<T>, CoroutineScope, SendChannel<T> {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    private final SendChannel<T> channel;

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.SimpleProducerScopeImpl", m13596f = "SimpleChannelFlow.kt", m13597i = {0, 0}, m13598l = {101}, m13599m = "awaitClose", m13600n = {"block", "job"}, m13601s = {"L$0", "L$1"})
    /* renamed from: androidx.paging.SimpleProducerScopeImpl$awaitClose$1 */
    public static final class C43021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SimpleProducerScopeImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43021(SimpleProducerScopeImpl<T> simpleProducerScopeImpl, Continuation<? super C43021> continuation) {
            super(continuation);
            this.this$0 = simpleProducerScopeImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.awaitClose(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleProducerScopeImpl(CoroutineScope scope, SendChannel<? super T> channel) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.$$delegate_0 = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.SimpleProducerScope
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object awaitClose(kotlin.jvm.functions.Function0<kotlin.Unit> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.SimpleProducerScopeImpl.C43021
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = (androidx.paging.SimpleProducerScopeImpl.C43021) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.SimpleProducerScopeImpl$awaitClose$1 r0 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.Job r6 = (kotlinx.coroutines.Job) r6
            java.lang.Object r6 = r0.L$0
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L31
            goto L76
        L31:
            r7 = move-exception
            goto L84
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlin.coroutines.CoroutineContext r7 = r5.getCoroutineContext()     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.INSTANCE     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.CoroutineContext$Element r7 = r7.get(r2)     // Catch: java.lang.Throwable -> L31
            if (r7 == 0) goto L7c
            kotlinx.coroutines.Job r7 = (kotlinx.coroutines.Job) r7     // Catch: java.lang.Throwable -> L31
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L31
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L31
            r0.label = r3     // Catch: java.lang.Throwable -> L31
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L31
            kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)     // Catch: java.lang.Throwable -> L31
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L31
            r2.initCancellability()     // Catch: java.lang.Throwable -> L31
            androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1 r3 = new androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1     // Catch: java.lang.Throwable -> L31
            r3.<init>()     // Catch: java.lang.Throwable -> L31
            r7.invokeOnCompletion(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r7 = r2.getResult()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L31
            if (r7 != r2) goto L73
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r0)     // Catch: java.lang.Throwable -> L31
        L73:
            if (r7 != r1) goto L76
            return r1
        L76:
            r6.invoke()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L7c:
            java.lang.String r7 = "Internal error, context should have a job."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L31
            throw r0     // Catch: java.lang.Throwable -> L31
        L84:
            r6.invoke()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleProducerScopeImpl.awaitClose(kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable cause) {
        return this.channel.close(cause);
    }

    @Override // androidx.paging.SimpleProducerScope
    public SendChannel<T> getChannel() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<T, SendChannel<T>> getOnSend() {
        return this.channel.getOnSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(Function1<? super Throwable, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.channel.invokeOnClose(handler);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return this.channel.isClosedForSend();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @Deprecated(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(T element) {
        return this.channel.offer(element);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(T t10, Continuation<? super Unit> continuation) {
        return this.channel.send(t10, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    public Object mo24070trySendJP2dKIU(T element) {
        return this.channel.mo24070trySendJP2dKIU(element);
    }
}
