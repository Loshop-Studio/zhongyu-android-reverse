package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC9133u;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p201o7.InterfaceC9539d;
import p235r8.AbstractC9943b;
import p235r8.InterfaceC9942a;

@Stable
/* loaded from: classes2.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final InterfaceC9942a mutex = AbstractC9943b.m18571b(false, 1, null);
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public static final class SnackbarDataImpl implements SnackbarData {
        private final InterfaceC8845j continuation;
        private final SnackbarVisuals visuals;

        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, InterfaceC8845j interfaceC8845j) {
            this.visuals = snackbarVisuals;
            this.continuation = interfaceC8845j;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.isActive()) {
                InterfaceC8845j interfaceC8845j = this.continuation;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarDataImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return AbstractC9133u.m16128b(getVisuals(), snackbarDataImpl.getVisuals()) && AbstractC9133u.m16128b(this.continuation, snackbarDataImpl.continuation);
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.isActive()) {
                InterfaceC8845j interfaceC8845j = this.continuation;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(SnackbarResult.ActionPerformed));
            }
        }
    }

    public static final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String str, String str2, boolean z10, SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z10;
            this.duration = snackbarDuration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SnackbarVisualsImpl.class != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return AbstractC9133u.m16128b(getMessage(), snackbarVisualsImpl.getMessage()) && AbstractC9133u.m16128b(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
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
            return ((((iHashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31) + Boolean.hashCode(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    @InterfaceC9539d(m17800c = "androidx.compose.material3.SnackbarHostState", m17801f = "SnackbarHost.kt", m17802l = {446, 449}, m17803m = "showSnackbar")
    /* renamed from: androidx.compose.material3.SnackbarHostState$showSnackbar$2 */
    public static final class C23392 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C23392(InterfaceC9324c<? super C23392> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z10, SnackbarDuration snackbarDuration, InterfaceC9324c interfaceC9324c, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, z11, snackbarDuration, interfaceC9324c);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    public final Object showSnackbar(String str, String str2, boolean z10, SnackbarDuration snackbarDuration, InterfaceC9324c<? super SnackbarResult> interfaceC9324c) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z10, snackbarDuration), interfaceC9324c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals r8, p179m7.InterfaceC9324c<? super androidx.compose.material3.SnackbarResult> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.SnackbarHostState.C23392
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState.C23392) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r8 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r8 = (androidx.compose.material3.SnackbarHostState.C23392) r8
            java.lang.Object r8 = r0.L$2
            r8.a r8 = (p235r8.InterfaceC9942a) r8
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r1 = (androidx.compose.material3.SnackbarVisuals) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            kotlin.AbstractC9079b.m15926b(r9)     // Catch: java.lang.Throwable -> L3e
            goto La9
        L3e:
            r9 = move-exception
            goto Lb2
        L41:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L49:
            java.lang.Object r8 = r0.L$2
            r8.a r8 = (p235r8.InterfaceC9942a) r8
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            kotlin.AbstractC9079b.m15926b(r9)
            r9 = r8
            r8 = r2
            goto L70
        L5b:
            kotlin.AbstractC9079b.m15926b(r9)
            r8.a r9 = r7.mutex
            r0.L$0 = r7
            r0.L$1 = r8
            r0.L$2 = r9
            r0.label = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L6f
            goto La4
        L6f:
            r6 = r7
        L70:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L9c
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L9c
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L9c
            r0.L$3 = r0     // Catch: java.lang.Throwable -> L9c
            r0.label = r3     // Catch: java.lang.Throwable -> L9c
            kotlinx.coroutines.c r2 = new kotlinx.coroutines.c     // Catch: java.lang.Throwable -> L9c
            m7.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m16079d(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9c
            r2.m16343D()     // Catch: java.lang.Throwable -> L9c
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r3 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r8, r2)     // Catch: java.lang.Throwable -> L9c
            access$setCurrentSnackbarData(r6, r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r8 = r2.m16372x()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = p190n7.AbstractC9434a.m17291f()     // Catch: java.lang.Throwable -> L9c
            if (r8 != r2) goto La2
            p201o7.AbstractC9541f.m17811c(r0)     // Catch: java.lang.Throwable -> L9c
            goto La2
        L9c:
            r8 = move-exception
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
            goto Lb2
        La2:
            if (r8 != r1) goto La5
        La4:
            return r1
        La5:
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r6
        La9:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb0
            r8.unlock(r5)
            return r9
        Lb0:
            r9 = move-exception
            goto Lb6
        Lb2:
            r0.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb0
            throw r9     // Catch: java.lang.Throwable -> Lb0
        Lb6:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, m7.c):java.lang.Object");
    }
}
