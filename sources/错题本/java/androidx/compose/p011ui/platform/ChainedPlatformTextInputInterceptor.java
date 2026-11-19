package androidx.compose.p011ui.platform;

import androidx.compose.p011ui.SessionMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.AbstractC5774b;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Stable
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJA\u0010\u0013\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2'\u0010\u0012\u001a#\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0002\b\u0011H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R+\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\n¨\u0006\u001c"}, m5110d2 = {"Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "", "Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "initialInterceptor", "parent", "<init>", "(Landroidx/compose/ui/platform/PlatformTextInputInterceptor;Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;)V", "interceptor", "Ld6/s;", "updateInterceptor", "(Landroidx/compose/ui/platform/PlatformTextInputInterceptor;)V", "Landroidx/compose/ui/node/Owner;", "owner", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;", "Lh6/c;", "", "Lkotlin/ExtensionFunctionType;", "session", "textInputSession", "(Landroidx/compose/ui/node/Owner;Lr6/e;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor;", "<set-?>", "interceptor$delegate", "Landroidx/compose/runtime/MutableState;", "getInterceptor", "()Landroidx/compose/ui/platform/PlatformTextInputInterceptor;", "setInterceptor", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,252:1\n85#2:253\n113#2,2:254\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/ChainedPlatformTextInputInterceptor\n*L\n200#1:253\n200#1:254,2\n*E\n"})
/* loaded from: classes2.dex */
final class ChainedPlatformTextInputInterceptor {

    /* renamed from: interceptor$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState interceptor;

    @Nullable
    private final ChainedPlatformTextInputInterceptor parent;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", m5303f = "PlatformTextInputModifierNode.kt", m5304i = {}, m5305l = {219}, m5306m = "textInputSession", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 */
    public static final class C22311 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C22311(InterfaceC5631c<? super C22311> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChainedPlatformTextInputInterceptor.this.textInputSession(null, null, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m5110d2 = {"<anonymous>", "", "Landroidx/compose/ui/platform/PlatformTextInputSessionScope;"}, m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", m5303f = "PlatformTextInputModifierNode.kt", m5304i = {}, m5305l = {248}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 */
    public static final class C22322 extends SuspendLambda implements InterfaceC6473e {
        final /* synthetic */ InterfaceC6473e $session;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChainedPlatformTextInputInterceptor this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22322(InterfaceC6473e interfaceC6473e, ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor, InterfaceC5631c<? super C22322> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$session = interfaceC6473e;
            this.this$0 = chainedPlatformTextInputInterceptor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C22322 c22322 = new C22322(this.$session, this.this$0, interfaceC5631c);
            c22322.L$0 = obj;
            return c22322;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, InterfaceC5631c<?> interfaceC5631c) {
            return ((C22322) create(platformTextInputSessionScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1 chainedPlatformTextInputInterceptor$textInputSession$2$scope$1 = new ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1((PlatformTextInputSessionScope) this.L$0, SessionMutex.m10253constructorimpl(), this.this$0);
                InterfaceC6473e interfaceC6473e = this.$session;
                this.label = 1;
                if (interfaceC6473e.invoke(chainedPlatformTextInputInterceptor$textInputSession$2$scope$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public ChainedPlatformTextInputInterceptor(@NotNull PlatformTextInputInterceptor platformTextInputInterceptor, @Nullable ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor) {
        this.parent = chainedPlatformTextInputInterceptor;
        this.interceptor = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(platformTextInputInterceptor, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlatformTextInputInterceptor getInterceptor() {
        return (PlatformTextInputInterceptor) this.interceptor.getValue();
    }

    private final void setInterceptor(PlatformTextInputInterceptor platformTextInputInterceptor) {
        this.interceptor.setValue(platformTextInputInterceptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object textInputSession(@org.jetbrains.annotations.NotNull androidx.compose.p011ui.node.Owner r6, @org.jetbrains.annotations.NotNull p152r6.InterfaceC6473e r7, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<?> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.p011ui.platform.ChainedPlatformTextInputInterceptor.C22311
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = (androidx.compose.p011ui.platform.ChainedPlatformTextInputInterceptor.C22311) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1 r0 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            kotlin.AbstractC5774b.m5119b(r8)
            goto L43
        L2f:
            kotlin.AbstractC5774b.m5119b(r8)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r8 = r5.parent
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2 r2 = new androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2
            r4 = 0
            r2.<init>(r7, r5, r4)
            r0.label = r3
            java.lang.Object r6 = androidx.compose.p011ui.platform.PlatformTextInputModifierNodeKt.access$interceptedTextInputSession(r6, r8, r2, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p011ui.platform.ChainedPlatformTextInputInterceptor.textInputSession(androidx.compose.ui.node.Owner, r6.e, h6.c):java.lang.Object");
    }

    public final void updateInterceptor(@NotNull PlatformTextInputInterceptor interceptor) {
        setInterceptor(interceptor);
    }
}
