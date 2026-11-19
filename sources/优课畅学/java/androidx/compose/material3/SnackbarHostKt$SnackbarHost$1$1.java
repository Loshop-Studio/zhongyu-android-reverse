package androidx.compose.material3;

import androidx.compose.p013ui.platform.AccessibilityManager;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", m17801f = "SnackbarHost.kt", m17802l = {232}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SnackbarHostKt$SnackbarHost$1$1 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ SnackbarData $currentSnackbarData;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1$1(SnackbarData snackbarData, AccessibilityManager accessibilityManager, InterfaceC9324c<? super SnackbarHostKt$SnackbarHost$1$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$currentSnackbarData = snackbarData;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new SnackbarHostKt$SnackbarHost$1$1(this.$currentSnackbarData, this.$accessibilityManager, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((SnackbarHostKt$SnackbarHost$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            SnackbarData snackbarData = this.$currentSnackbarData;
            if (snackbarData != null) {
                long millis = SnackbarHostKt.toMillis(snackbarData.getVisuals().getDuration(), this.$currentSnackbarData.getVisuals().getActionLabel() != null, this.$accessibilityManager);
                this.label = 1;
                if (DelayKt.m16227b(millis, this) == objM17291f) {
                    return objM17291f;
                }
            }
            return C8736p.f16368a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        this.$currentSnackbarData.dismiss();
        return C8736p.f16368a;
    }
}
