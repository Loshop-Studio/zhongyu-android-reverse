package kotlinx.coroutines.flow;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m5303f = "Share.kt", m5304i = {}, m5305l = {210, 214, 215, 221}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes4.dex */
final class FlowKt__ShareKt$launchSharing$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ InterfaceC5958x $shared;
    final /* synthetic */ InterfaceC5917i0 $started;
    final /* synthetic */ InterfaceC5910f $upstream;
    int label;

    @Metadata(m5109d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m5110d2 = {"<anonymous>", "", "it", ""}, m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m5303f = "Share.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    public static final class C58981 extends SuspendLambda implements InterfaceC6473e {
        /* synthetic */ int I$0;
        int label;

        public C58981(InterfaceC5631c<? super C58981> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C58981 c58981 = new C58981(interfaceC5631c);
            c58981.I$0 = ((Number) obj).intValue();
            return c58981;
        }

        public final Object invoke(int i, InterfaceC5631c<? super Boolean> interfaceC5631c) {
            return ((C58981) create(Integer.valueOf(i), interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return Boolean.valueOf(this.I$0 > 0);
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (InterfaceC5631c<? super Boolean>) obj2);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lkotlinx/coroutines/flow/SharingCommand;", "it", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/flow/SharingCommand;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
    @DebugMetadata(m5302c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m5303f = "Share.kt", m5304i = {}, m5305l = {223}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    public static final class C58992 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Object $initialValue;
        final /* synthetic */ InterfaceC5958x $shared;
        final /* synthetic */ InterfaceC5910f $upstream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C58992(InterfaceC5910f interfaceC5910f, InterfaceC5958x interfaceC5958x, Object obj, InterfaceC5631c<? super C58992> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$upstream = interfaceC5910f;
            this.$shared = interfaceC5958x;
            this.$initialValue = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C58992 c58992 = new C58992(this.$upstream, this.$shared, this.$initialValue, interfaceC5631c);
            c58992.L$0 = obj;
            return c58992;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                int i8 = AbstractC5954t.f9440a[((SharingCommand) this.L$0).ordinal()];
                if (i8 == 1) {
                    InterfaceC5910f interfaceC5910f = this.$upstream;
                    InterfaceC5958x interfaceC5958x = this.$shared;
                    this.label = 1;
                    if (interfaceC5910f.collect(interfaceC5958x, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object obj2 = this.$initialValue;
                    if (obj2 == AbstractC5914h.f9375b) {
                        this.$shared.mo5528c();
                    } else {
                        this.$shared.mo5527a(obj2);
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(SharingCommand sharingCommand, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C58992) create(sharingCommand, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(InterfaceC5917i0 interfaceC5917i0, InterfaceC5910f interfaceC5910f, InterfaceC5958x interfaceC5958x, Object obj, InterfaceC5631c<? super FlowKt__ShareKt$launchSharing$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$started = interfaceC5917i0;
        this.$upstream = interfaceC5910f;
        this.$shared = interfaceC5958x;
        this.$initialValue = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new FlowKt__ShareKt$launchSharing$1(this.$started, this.$upstream, this.$shared, this.$initialValue, interfaceC5631c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r8.collect(r1, r7) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8.collect(r1, r7) != r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC5914h.m5552h(r8, r1, r7) == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1f
            if (r1 == r4) goto L1b
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L13
            goto L1f
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            kotlin.AbstractC5774b.m5119b(r8)
            goto L55
        L1f:
            kotlin.AbstractC5774b.m5119b(r8)
            goto La0
        L24:
            kotlin.AbstractC5774b.m5119b(r8)
            kotlinx.coroutines.flow.i0 r8 = r7.$started
            kotlinx.coroutines.flow.k0 r1 = kotlinx.coroutines.flow.C5915h0.f9378a
            if (r8 != r1) goto L3a
            kotlinx.coroutines.flow.f r8 = r7.$upstream
            kotlinx.coroutines.flow.x r1 = r7.$shared
            r7.label = r5
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto La0
            goto L9f
        L3a:
            kotlinx.coroutines.flow.k0 r1 = kotlinx.coroutines.flow.C5915h0.f9379b
            r5 = 0
            if (r8 != r1) goto L62
            kotlinx.coroutines.flow.x r8 = r7.$shared
            kotlinx.coroutines.flow.internal.a r8 = (kotlinx.coroutines.flow.internal.AbstractC5919a) r8
            kotlinx.coroutines.flow.internal.q r8 = r8.m5562h()
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.AbstractC5914h.m5554j(r8, r1, r7)
            if (r8 != r0) goto L55
            goto L9f
        L55:
            kotlinx.coroutines.flow.f r8 = r7.$upstream
            kotlinx.coroutines.flow.x r1 = r7.$shared
            r7.label = r3
            java.lang.Object r8 = r8.collect(r1, r7)
            if (r8 != r0) goto La0
            goto L9f
        L62:
            kotlinx.coroutines.flow.x r1 = r7.$shared
            kotlinx.coroutines.flow.internal.a r1 = (kotlinx.coroutines.flow.internal.AbstractC5919a) r1
            kotlinx.coroutines.flow.internal.q r1 = r1.m5562h()
            kotlinx.coroutines.flow.f r8 = r8.mo5558a(r1)
            boolean r1 = r8 instanceof kotlinx.coroutines.flow.InterfaceC5944m0
            if (r1 == 0) goto L73
            goto L8c
        L73:
            e7.t r1 = kotlinx.coroutines.flow.AbstractC5914h.f9374a
            boolean r3 = r8 instanceof kotlinx.coroutines.flow.C5908e
            if (r3 == 0) goto L86
            r3 = r8
            kotlinx.coroutines.flow.e r3 = (kotlinx.coroutines.flow.C5908e) r3
            r3.getClass()
            r6.e r3 = r3.f9362b
            if (r3 != r1) goto L86
            kotlinx.coroutines.flow.e r8 = (kotlinx.coroutines.flow.C5908e) r8
            goto L8c
        L86:
            kotlinx.coroutines.flow.e r3 = new kotlinx.coroutines.flow.e
            r3.<init>(r8, r1)
            r8 = r3
        L8c:
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.f r3 = r7.$upstream
            kotlinx.coroutines.flow.x r4 = r7.$shared
            java.lang.Object r6 = r7.$initialValue
            r1.<init>(r3, r4, r6, r5)
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.AbstractC5914h.m5552h(r8, r1, r7)
            if (r8 != r0) goto La0
        L9f:
            return r0
        La0:
            d6.s r8 = p045d6.C5443s.f8405a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((FlowKt__ShareKt$launchSharing$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
