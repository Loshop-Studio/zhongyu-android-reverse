package androidx.lifecycle;

import com.tencent.ijk.media.player.IjkMediaMeta;
import kotlin.AbstractC9079b;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public abstract class LifecycleCoroutineScope implements InterfaceC8822b0 {

    @InterfaceC9539d(m17800c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m17801f = "Lifecycle.jvm.kt", m17802l = {68}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 */
    public static final class C40401 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40401(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C40401> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return LifecycleCoroutineScope.this.new C40401(this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40401) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, interfaceC10574p, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m17801f = "Lifecycle.jvm.kt", m17802l = {108}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 */
    public static final class C40411 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40411(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C40411> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return LifecycleCoroutineScope.this.new C40411(this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40411) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, interfaceC10574p, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m17801f = "Lifecycle.jvm.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 */
    public static final class C40421 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40421(InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C40421> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return LifecycleCoroutineScope.this.new C40421(this.$block, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40421) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC10574p interfaceC10574p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, interfaceC10574p, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    @Override // p135i8.InterfaceC8822b0
    public abstract /* synthetic */ InterfaceC9100d getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    @InterfaceC8721a
    public final InterfaceC9212n launchWhenCreated(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return AbstractC8839h.m14861d(this, null, null, new C40401(block, null), 3, null);
    }

    @InterfaceC8721a
    public final InterfaceC9212n launchWhenResumed(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return AbstractC8839h.m14861d(this, null, null, new C40411(block, null), 3, null);
    }

    @InterfaceC8721a
    public final InterfaceC9212n launchWhenStarted(InterfaceC10574p block) {
        AbstractC9133u.m16133g(block, "block");
        return AbstractC8839h.m14861d(this, null, null, new C40421(block, null), 3, null);
    }
}
