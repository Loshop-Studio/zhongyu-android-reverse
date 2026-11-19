package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC9165e;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.AbstractC8841h1;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class RepeatOnLifecycleKt {

    @InterfaceC9539d(m17800c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m17801f = "RepeatOnLifecycle.kt", m17802l = {83}, m17803m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3 */
    public static final class C40483 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ InterfaceC10574p $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        @InterfaceC9539d(m17800c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m17801f = "RepeatOnLifecycle.kt", m17802l = {161}, m17803m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ InterfaceC8822b0 $$this$coroutineScope;
            final /* synthetic */ InterfaceC10574p $block;
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
            public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC8822b0 interfaceC8822b0, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$this_repeatOnLifecycle = lifecycle;
                this.$state = state;
                this.$$this$coroutineScope = interfaceC8822b0;
                this.$block = interfaceC10574p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                    java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                    int r1 = r13.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 != r3) goto L2f
                    java.lang.Object r0 = r13.L$5
                    x7.p r0 = (p300x7.InterfaceC10574p) r0
                    java.lang.Object r0 = r13.L$4
                    i8.b0 r0 = (p135i8.InterfaceC8822b0) r0
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
                    kotlin.AbstractC9079b.m15926b(r14)     // Catch: java.lang.Throwable -> L2b
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
                    kotlin.AbstractC9079b.m15926b(r14)
                    androidx.lifecycle.Lifecycle r14 = r13.$this_repeatOnLifecycle
                    androidx.lifecycle.Lifecycle$State r14 = r14.getCurrentState()
                    androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.DESTROYED
                    if (r14 != r1) goto L47
                    h7.p r14 = p123h7.C8736p.f16368a
                    return r14
                L47:
                    kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                    r6.<init>()
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    androidx.lifecycle.Lifecycle$State r14 = r13.$state     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle r12 = r13.$this_repeatOnLifecycle     // Catch: java.lang.Throwable -> La1
                    i8.b0 r7 = r13.$$this$coroutineScope     // Catch: java.lang.Throwable -> La1
                    x7.p r11 = r13.$block     // Catch: java.lang.Throwable -> La1
                    r13.L$0 = r6     // Catch: java.lang.Throwable -> La1
                    r13.L$1 = r1     // Catch: java.lang.Throwable -> La1
                    r13.L$2 = r14     // Catch: java.lang.Throwable -> La1
                    r13.L$3 = r12     // Catch: java.lang.Throwable -> La1
                    r13.L$4 = r7     // Catch: java.lang.Throwable -> La1
                    r13.L$5 = r11     // Catch: java.lang.Throwable -> La1
                    r13.label = r3     // Catch: java.lang.Throwable -> La1
                    kotlinx.coroutines.c r9 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> La1
                    m7.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r13)     // Catch: java.lang.Throwable -> La1
                    r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> La1
                    r9.m16343D()     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle$Event$Companion r4 = androidx.lifecycle.Lifecycle.Event.Companion     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle$Event r5 = r4.upTo(r14)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.Lifecycle$Event r8 = r4.downFrom(r14)     // Catch: java.lang.Throwable -> La1
                    r14 = 0
                    r8.a r10 = p235r8.AbstractC9943b.m18571b(r14, r3, r2)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r4 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> La1
                    r4.<init>()     // Catch: java.lang.Throwable -> La1
                    r1.f17473a = r4     // Catch: java.lang.Throwable -> La1
                    java.lang.String r14 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                    kotlin.jvm.internal.AbstractC9133u.m16131e(r4, r14)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4     // Catch: java.lang.Throwable -> La1
                    r12.addObserver(r4)     // Catch: java.lang.Throwable -> La1
                    java.lang.Object r14 = r9.m16372x()     // Catch: java.lang.Throwable -> La1
                    java.lang.Object r4 = p190n7.AbstractC9434a.m17291f()     // Catch: java.lang.Throwable -> La1
                    if (r14 != r4) goto La5
                    p201o7.AbstractC9541f.m17811c(r13)     // Catch: java.lang.Throwable -> La1
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
                    java.lang.Object r14 = r4.f17473a
                    kotlinx.coroutines.n r14 = (kotlinx.coroutines.InterfaceC9212n) r14
                    if (r14 == 0) goto Lb2
                    kotlinx.coroutines.InterfaceC9212n.a.m16777a(r14, r2, r3, r2)
                Lb2:
                    java.lang.Object r14 = r1.f17473a
                    androidx.lifecycle.LifecycleEventObserver r14 = (androidx.lifecycle.LifecycleEventObserver) r14
                    if (r14 == 0) goto Lbd
                    androidx.lifecycle.Lifecycle r0 = r13.$this_repeatOnLifecycle
                    r0.removeObserver(r14)
                Lbd:
                    h7.p r14 = p123h7.C8736p.f16368a
                    return r14
                Lc0:
                    java.lang.Object r0 = r4.f17473a
                    kotlinx.coroutines.n r0 = (kotlinx.coroutines.InterfaceC9212n) r0
                    if (r0 == 0) goto Lc9
                    kotlinx.coroutines.InterfaceC9212n.a.m16777a(r0, r2, r3, r2)
                Lc9:
                    java.lang.Object r0 = r1.f17473a
                    androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                    if (r0 == 0) goto Ld4
                    androidx.lifecycle.Lifecycle r1 = r13.$this_repeatOnLifecycle
                    r1.removeObserver(r0)
                Ld4:
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt.C40483.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40483(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C40483> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$block = interfaceC10574p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C40483 c40483 = new C40483(this.$this_repeatOnLifecycle, this.$state, this.$block, interfaceC9324c);
            c40483.L$0 = obj;
            return c40483;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C40483) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                AbstractC8841h1 abstractC8841h1Mo15693o = C8843i0.m14868c().mo15693o();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, interfaceC8822b0, this.$block, null);
                this.label = 1;
                if (AbstractC8833f.m14848g(abstractC8841h1Mo15693o, anonymousClass1, this) == objM17291f) {
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

    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (state == Lifecycle.State.INITIALIZED) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return C8736p.f16368a;
        }
        Object objM16556e = AbstractC9165e.m16556e(new C40483(lifecycle, state, interfaceC10574p, null), interfaceC9324c);
        return objM16556e == AbstractC9434a.m17291f() ? objM16556e : C8736p.f16368a;
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC10574p interfaceC10574p, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objRepeatOnLifecycle = repeatOnLifecycle(lifecycleOwner.getLifecycle(), state, interfaceC10574p, interfaceC9324c);
        return objRepeatOnLifecycle == AbstractC9434a.m17291f() ? objRepeatOnLifecycle : C8736p.f16368a;
    }
}
