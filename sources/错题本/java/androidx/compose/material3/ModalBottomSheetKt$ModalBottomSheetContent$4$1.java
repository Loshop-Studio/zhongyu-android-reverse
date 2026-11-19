package androidx.compose.material3;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m5110d2 = {"Lkotlinx/coroutines/v;", "", "it", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;F)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", m5303f = "ModalBottomSheet.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class ModalBottomSheetKt$ModalBottomSheetContent$4$1 extends SuspendLambda implements InterfaceC6474f {
    final /* synthetic */ InterfaceC6471c $settleToDismiss;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetContent$4$1(InterfaceC6471c interfaceC6471c, InterfaceC5631c<? super ModalBottomSheetKt$ModalBottomSheetContent$4$1> interfaceC5631c) {
        super(3, interfaceC5631c);
        this.$settleToDismiss = interfaceC6471c;
    }

    @Override // p152r6.InterfaceC6474f
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6009v) obj, ((Number) obj2).floatValue(), (InterfaceC5631c<? super C5443s>) obj3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC5774b.m5119b(obj);
        this.$settleToDismiss.invoke(new Float(this.F$0));
        return C5443s.f8405a;
    }

    @Nullable
    public final Object invoke(@NotNull InterfaceC6009v interfaceC6009v, float f, @Nullable InterfaceC5631c<? super C5443s> interfaceC5631c) {
        ModalBottomSheetKt$ModalBottomSheetContent$4$1 modalBottomSheetKt$ModalBottomSheetContent$4$1 = new ModalBottomSheetKt$ModalBottomSheetContent$4$1(this.$settleToDismiss, interfaceC5631c);
        modalBottomSheetKt$ModalBottomSheetContent$4$1.F$0 = f;
        return modalBottomSheetKt$ModalBottomSheetContent$4$1.invokeSuspend(C5443s.f8405a);
    }
}
