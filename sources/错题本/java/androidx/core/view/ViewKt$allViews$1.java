package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p214z6.AbstractC6832j;
import p214z6.C6831i;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lz6/j;", "Landroid/view/View;", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {1, 8, 0})
@DebugMetadata(m5302c = "androidx.core.view.ViewKt$allViews$1", m5303f = "View.kt", m5304i = {0}, m5305l = {410, 412}, m5306m = "invokeSuspend", m5307n = {"$this$sequence"}, m5308s = {"L$0"})
/* loaded from: classes2.dex */
public final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements InterfaceC6473e {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC5631c<? super ViewKt$allViews$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$this_allViews = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, interfaceC5631c);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC6832j abstractC6832j;
        Object obj2;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Object obj4 = C5443s.f8405a;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            abstractC6832j = (AbstractC6832j) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC6832j;
            this.label = 1;
            if (abstractC6832j.mo6491a(this, view) != obj3) {
            }
            return obj3;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
            return obj4;
        }
        abstractC6832j = (AbstractC6832j) this.L$0;
        AbstractC5774b.m5119b(obj);
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            InterfaceC6830h descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
            this.L$0 = null;
            this.label = 2;
            abstractC6832j.getClass();
            Iterator it = descendants.iterator();
            C6831i c6831i = (C6831i) abstractC6832j;
            if (it.hasNext()) {
                c6831i.f11580c = it;
                c6831i.f11578a = 2;
                c6831i.f11581d = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((ViewKt$allViews$1) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
