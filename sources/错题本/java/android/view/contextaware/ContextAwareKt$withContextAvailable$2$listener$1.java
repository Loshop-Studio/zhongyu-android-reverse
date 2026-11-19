package android.view.contextaware;

import android.content.Context;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.InterfaceC5895f;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "Landroid/content/Context;", "context", "Ld6/s;", "onContextAvailable", "(Landroid/content/Context;)V", "activity_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = 176)
@SourceDebugExtension({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ InterfaceC5895f $co;
    final /* synthetic */ InterfaceC6471c $onContextAvailable;

    public ContextAwareKt$withContextAvailable$2$listener$1(InterfaceC5895f interfaceC5895f, InterfaceC6471c interfaceC6471c) {
        this.$co = interfaceC5895f;
        this.$onContextAvailable = interfaceC6471c;
    }

    @Override // android.view.contextaware.OnContextAvailableListener
    public void onContextAvailable(Context context) {
        Object objM13956constructorimpl;
        AbstractC5830k.m5330g(context, "context");
        InterfaceC5895f interfaceC5895f = this.$co;
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(this.$onContextAvailable.invoke(context));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        interfaceC5895f.resumeWith(objM13956constructorimpl);
    }
}
