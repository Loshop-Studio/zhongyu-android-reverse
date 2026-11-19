package androidx.lifecycle;

import androidx.appcompat.app.AppCompatDelegate;
import kotlin.AbstractC9924b;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public abstract class LifecycleCoroutineScope implements InterfaceC11122i0 {

    @InterfaceC11829d(m26210c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m26211f = "Lifecycle.jvm.kt", m26212l = {68}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 */
    public static final class C39141 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39141(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C39141> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LifecycleCoroutineScope.this.new C39141(this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, interfaceC9544p, this) == objM25952f) {
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
            return ((C39141) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m26211f = "Lifecycle.jvm.kt", m26212l = {AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 */
    public static final class C39151 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39151(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C39151> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LifecycleCoroutineScope.this.new C39151(this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, interfaceC9544p, this) == objM25952f) {
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
            return ((C39151) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m26211f = "Lifecycle.jvm.kt", m26212l = {IjkMediaMeta.FF_PROFILE_H264_EXTENDED}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 */
    public static final class C39161 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39161(InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C39161> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return LifecycleCoroutineScope.this.new C39161(this.$block, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC9544p interfaceC9544p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, interfaceC9544p, this) == objM25952f) {
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
            return ((C39161) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @Override // sd.InterfaceC11122i0
    public abstract /* synthetic */ InterfaceC9945d getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    @InterfaceC10770a
    public final InterfaceC10045g launchWhenCreated(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        return AbstractC11117h.m24726d(this, null, null, new C39141(block, null), 3, null);
    }

    @InterfaceC10770a
    public final InterfaceC10045g launchWhenResumed(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        return AbstractC11117h.m24726d(this, null, null, new C39151(block, null), 3, null);
    }

    @InterfaceC10770a
    public final InterfaceC10045g launchWhenStarted(InterfaceC9544p block) {
        AbstractC9979u.m20294g(block, "block");
        return AbstractC11117h.m24726d(this, null, null, new C39161(block, null), 3, null);
    }
}
