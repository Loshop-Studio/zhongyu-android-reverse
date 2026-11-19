package androidx.compose.material3;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC5895f;
import kotlinx.coroutines.sync.C6001a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5631c;
import p076h7.InterfaceC5638a;

@Stable
@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R/\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/material3/SnackbarHostState;", "", "<init>", "()V", "", "message", "actionLabel", "", "withDismissAction", "Landroidx/compose/material3/SnackbarDuration;", TypedValues.TransitionType.S_DURATION, "Landroidx/compose/material3/SnackbarResult;", "showSnackbar", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lh6/c;)Ljava/lang/Object;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "(Landroidx/compose/material3/SnackbarVisuals;Lh6/c;)Ljava/lang/Object;", "Lh7/a;", "mutex", "Lh7/a;", "Landroidx/compose/material3/SnackbarData;", "<set-?>", "currentSnackbarData$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentSnackbarData", "()Landroidx/compose/material3/SnackbarData;", "setCurrentSnackbarData", "(Landroidx/compose/material3/SnackbarData;)V", "currentSnackbarData", "SnackbarDataImpl", "SnackbarVisualsImpl", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,440:1\n81#2:441\n107#2,2:442\n120#3,8:444\n129#3:463\n314#4,11:452\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n71#1:441\n71#1:442,2\n126#1:444,8\n126#1:463\n128#1:452,11\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;

    @NotNull
    private final InterfaceC5638a mutex = new C6001a();

    /* renamed from: currentSnackbarData$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState currentSnackbarData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, m5110d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarDataImpl;", "Landroidx/compose/material3/SnackbarData;", "Landroidx/compose/material3/SnackbarVisuals;", "visuals", "Lkotlinx/coroutines/f;", "Landroidx/compose/material3/SnackbarResult;", "continuation", "<init>", "(Landroidx/compose/material3/SnackbarVisuals;Lkotlinx/coroutines/f;)V", "Ld6/s;", "performAction", "()V", "dismiss", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/material3/SnackbarVisuals;", "getVisuals", "()Landroidx/compose/material3/SnackbarVisuals;", "Lkotlinx/coroutines/f;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SnackbarDataImpl implements SnackbarData {

        @NotNull
        private final InterfaceC5895f continuation;

        @NotNull
        private final SnackbarVisuals visuals;

        public SnackbarDataImpl(@NotNull SnackbarVisuals snackbarVisuals, @NotNull InterfaceC5895f interfaceC5895f) {
            this.visuals = snackbarVisuals;
            this.continuation = interfaceC5895f;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                this.continuation.resumeWith(Result.m13956constructorimpl(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || SnackbarDataImpl.class != other.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) other;
            return AbstractC5830k.m5325b(getVisuals(), snackbarDataImpl.getVisuals()) && AbstractC5830k.m5325b(this.continuation, snackbarDataImpl.continuation);
        }

        @Override // androidx.compose.material3.SnackbarData
        @NotNull
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return this.continuation.hashCode() + (getVisuals().hashCode() * 31);
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                this.continuation.resumeWith(Result.m13956constructorimpl(SnackbarResult.ActionPerformed));
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m5110d2 = {"Landroidx/compose/material3/SnackbarHostState$SnackbarVisualsImpl;", "Landroidx/compose/material3/SnackbarVisuals;", "message", "", "actionLabel", "withDismissAction", "", TypedValues.TransitionType.S_DURATION, "Landroidx/compose/material3/SnackbarDuration;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;)V", "getActionLabel", "()Ljava/lang/String;", "getDuration", "()Landroidx/compose/material3/SnackbarDuration;", "getMessage", "getWithDismissAction", "()Z", "equals", "other", "", "hashCode", "", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class SnackbarVisualsImpl implements SnackbarVisuals {

        @Nullable
        private final String actionLabel;

        @NotNull
        private final SnackbarDuration duration;

        @NotNull
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(@NotNull String str, @Nullable String str2, boolean z8, @NotNull SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z8;
            this.duration = snackbarDuration;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || SnackbarVisualsImpl.class != other.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) other;
            return AbstractC5830k.m5325b(getMessage(), snackbarVisualsImpl.getMessage()) && AbstractC5830k.m5325b(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @Nullable
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @NotNull
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        @NotNull
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int iHashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return getDuration().hashCode() + AbstractC0584a.m908i(getWithDismissAction(), (iHashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31, 31);
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "androidx.compose.material3.SnackbarHostState", m5303f = "SnackbarHost.kt", m5304i = {0, 0, 0, 1, 1, 1, 1}, m5305l = {446, 449}, m5306m = "showSnackbar", m5307n = {"this", "visuals", "$this$withLock_u24default$iv", "this", "visuals", "$this$withLock_u24default$iv", "$completion$iv"}, m5308s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: androidx.compose.material3.SnackbarHostState$showSnackbar$2 */
    public static final class C18492 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C18492(InterfaceC5631c<? super C18492> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z8, SnackbarDuration snackbarDuration, InterfaceC5631c interfaceC5631c, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z8 = false;
        }
        boolean z9 = z8;
        if ((i & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z9, snackbarDuration, interfaceC5631c);
    }

    @Nullable
    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.material3.SnackbarVisuals, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10, types: [h7.a] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(@org.jetbrains.annotations.NotNull androidx.compose.material3.SnackbarVisuals r8, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super androidx.compose.material3.SnackbarResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.SnackbarHostState.C18492
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState.C18492) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r8 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r8 = (androidx.compose.material3.SnackbarHostState.C18492) r8
            java.lang.Object r8 = r0.L$2
            h7.a r8 = (p076h7.InterfaceC5638a) r8
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            kotlin.AbstractC5774b.m5119b(r9)     // Catch: java.lang.Throwable -> L3b
            goto L98
        L3b:
            r9 = move-exception
            goto La8
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            java.lang.Object r8 = r0.L$2
            h7.a r8 = (p076h7.InterfaceC5638a) r8
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            kotlin.AbstractC5774b.m5119b(r9)
            r9 = r8
            r8 = r2
            goto L6f
        L58:
            kotlin.AbstractC5774b.m5119b(r9)
            h7.a r9 = r7.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.C6001a) r9
            java.lang.Object r2 = r9.m5615e(r0)
            if (r2 != r1) goto L6e
            goto L93
        L6e:
            r6 = r7
        L6f:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> La3
            r0.L$1 = r8     // Catch: java.lang.Throwable -> La3
            r0.L$2 = r9     // Catch: java.lang.Throwable -> La3
            r0.L$3 = r0     // Catch: java.lang.Throwable -> La3
            r0.label = r3     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.g r2 = new kotlinx.coroutines.g     // Catch: java.lang.Throwable -> La3
            h6.c r0 = p185v7.AbstractC6683l.m6374n(r0)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> La3
            r2.m5584u()     // Catch: java.lang.Throwable -> La3
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r0 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> La3
            r0.<init>(r8, r2)     // Catch: java.lang.Throwable -> La3
            access$setCurrentSnackbarData(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r8 = r2.m5583t()     // Catch: java.lang.Throwable -> La3
            if (r8 != r1) goto L94
        L93:
            return r1
        L94:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        L98:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> La1
            kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.C6001a) r8
            r8.m5617g(r5)
            return r9
        La1:
            r9 = move-exception
            goto Lac
        La3:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        La8:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> La1
            throw r9     // Catch: java.lang.Throwable -> La1
        Lac:
            kotlinx.coroutines.sync.a r8 = (kotlinx.coroutines.sync.C6001a) r8
            r8.m5617g(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, h6.c):java.lang.Object");
    }

    @Nullable
    public final Object showSnackbar(@NotNull String str, @Nullable String str2, boolean z8, @NotNull SnackbarDuration snackbarDuration, @NotNull InterfaceC5631c<? super SnackbarResult> interfaceC5631c) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z8, snackbarDuration), interfaceC5631c);
    }
}
