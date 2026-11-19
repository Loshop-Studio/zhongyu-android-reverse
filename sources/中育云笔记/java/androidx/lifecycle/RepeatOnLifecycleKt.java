package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC10006d;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.AbstractC11164t1;
import sd.C11157r0;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class RepeatOnLifecycleKt {

    @InterfaceC11829d(m26210c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m26211f = "RepeatOnLifecycle.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CONSTRUCTOR}, m26213m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 */
    public static final class C39223 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9544p $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC11829d(m26210c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m26211f = "RepeatOnLifecycle.kt", m26212l = {Opcodes.IF_ICMPLT}, m26213m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC11122i0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC9544p $block;
            final /* synthetic */ Lifecycle.State $state;
            final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
            Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC11122i0 interfaceC11122i0, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = interfaceC11122i0;
                this.$block = interfaceC9544p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC11588c);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    r13 = this;
                    java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                    int r1 = r13.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 != r3) goto L2f
                    java.lang.Object r0 = r13.L$5
                    hd.p r0 = (p181hd.InterfaceC9544p) r0
                    java.lang.Object r0 = r13.L$4
                    sd.i0 r0 = (sd.InterfaceC11122i0) r0
                    java.lang.Object r0 = r13.L$3
                    androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
                    java.lang.Object r0 = r13.L$2
                    androidx.lifecycle.Lifecycle$State r0 = (androidx.lifecycle.Lifecycle.State) r0
                    java.lang.Object r0 = r13.L$1
                    r1 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
                    java.lang.Object r0 = r13.L$0
                    r4 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
                    kotlin.AbstractC9924b.m20071b(r14)     // Catch: java.lang.Throwable -> L2b
                    goto La9
                L2b:
                    r0 = move-exception
                    r14 = r0
                    goto Lc0
                L2f:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L37:
                    kotlin.AbstractC9924b.m20071b(r14)
                    androidx.lifecycle.Lifecycle r14 = r13.$this_repeatOnLifecycle
                    androidx.lifecycle.Lifecycle$State r14 = r14.getCurrentState()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                    if (r14 != r1) goto L47
                    qc.q r14 = p309qc.C10786q.f26013a
                    return r14
                L47:
                    kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                    r6.<init>()
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    androidx.lifecycle.Lifecycle$State r14 = r13.$state     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle r12 = r13.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La1
                    sd.i0 r7 = r13.$$this$coroutineScope     // Catch: java.lang.Throwable -> La1
                    hd.p r11 = r13.$block     // Catch: java.lang.Throwable -> La1
                    r13.L$0 = r6     // Catch: java.lang.Throwable -> La1
                    r13.L$1 = r1     // Catch: java.lang.Throwable -> La1
                    r13.L$2 = r14     // Catch: java.lang.Throwable -> La1
                    r13.L$3 = r12     // Catch: java.lang.Throwable -> La1
                    r13.L$4 = r7     // Catch: java.lang.Throwable -> La1
                    r13.L$5 = r11     // Catch: java.lang.Throwable -> La1
                    r13.label = r3     // Catch: java.lang.Throwable -> La1
                    kotlinx.coroutines.c r9 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> La1
                    vc.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m20224d(r13)     // Catch: java.lang.Throwable -> La1
                    r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> La1
                    r9.m20503F()     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle$Event r5 = r4.upTo(r14)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle$Event r8 = r4.downFrom(r14)     // Catch: java.lang.Throwable -> La1
                    r14 = 0
                    be.a r10 = be.AbstractC5194f.m2745b(r14, r3, r2)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r4 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La1
                    r4.<init>()     // Catch: java.lang.Throwable -> La1
                    r1.f23402c = r4     // Catch: java.lang.Throwable -> La1
                    java.lang.String r14 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                    kotlin.jvm.internal.AbstractC9979u.m20292e(r4, r14)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4     // Catch: java.lang.Throwable -> La1
                    r12.addObserver(r4)     // Catch: java.lang.Throwable -> La1
                    java.lang.Object r14 = r9.m20538x()     // Catch: java.lang.Throwable -> La1
                    java.lang.Object r4 = p393wc.AbstractC11725a.m25952f()     // Catch: java.lang.Throwable -> La1
                    if (r14 != r4) goto La5
                    p409xc.AbstractC11831f.m26221c(r13)     // Catch: java.lang.Throwable -> La1
                    goto La5
                La1:
                    r0 = move-exception
                    r14 = r0
                    r4 = r6
                    goto Lc0
                La5:
                    if (r14 != r0) goto La8
                    return r0
                La8:
                    r4 = r6
                La9:
                    java.lang.Object r14 = r4.f23402c
                    kotlinx.coroutines.g r14 = (kotlinx.coroutines.InterfaceC10045g) r14
                    if (r14 == 0) goto Lb2
                    kotlinx.coroutines.InterfaceC10045g.a.m20900a(r14, r2, r3, r2)
                Lb2:
                    java.lang.Object r14 = r1.f23402c
                    androidx.lifecycle.LifecycleEventObserver r14 = (androidx.lifecycle.LifecycleEventObserver) r14
                    if (r14 == 0) goto Lbd
                    androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                    r0.removeObserver(r14)
                Lbd:
                    qc.q r14 = p309qc.C10786q.f26013a
                    return r14
                Lc0:
                    java.lang.Object r0 = r4.f23402c
                    kotlinx.coroutines.g r0 = (kotlinx.coroutines.InterfaceC10045g) r0
                    if (r0 == 0) goto Lc9
                    kotlinx.coroutines.InterfaceC10045g.a.m20900a(r0, r2, r3, r2)
                Lc9:
                    java.lang.Object r0 = r1.f23402c
                    androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                    if (r0 == 0) goto Ld4
                    androidx.lifecycle.Lifecycle r1 = r13.$this_repeatOnLifecycle
                    r1.removeObserver(r0)
                Ld4:
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt.C39223.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39223(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C39223> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = interfaceC9544p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C39223 c39223 = new C39223(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC11588c);
            c39223.L$0 = obj;
            return c39223;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                AbstractC11164t1 abstractC11164t1Mo25209k = C11157r0.m24800c().mo25209k();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC11122i0, this.$block, null);
                this.label = 1;
                if (AbstractC11109f.m24709g(abstractC11164t1Mo25209k, anonymousClass1, this) == objM25952f) {
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
            return ((C39223) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return C10786q.f26013a;
        }
        Object objM20748e = AbstractC10006d.m20748e(new C39223(lifecycle, state, interfaceC9544p, null), interfaceC11588c);
        return objM20748e == AbstractC11725a.m25952f() ? objM20748e : C10786q.f26013a;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC9544p interfaceC9544p, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, interfaceC9544p, interfaceC11588c);
        return objRepeatOnLifecycle == AbstractC11725a.m25952f() ? objRepeatOnLifecycle : C10786q.f26013a;
    }
}
