package androidx.compose.foundation.layout;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p045d6.InterfaceC5429e;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"", "errorMessage", "Lkotlin/Function0;", "", "initializer", "Ld6/e;", "lazyInt", "(Ljava/lang/String;Lr6/a;)Ld6/e;", "foundation-layout_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class FlowLayoutOverflowKt {
    @NotNull
    public static final InterfaceC5429e lazyInt(@NotNull String str, @NotNull InterfaceC6469a interfaceC6469a) {
        return new LazyImpl(interfaceC6469a, str);
    }

    public static /* synthetic */ InterfaceC5429e lazyInt$default(String str, InterfaceC6469a interfaceC6469a, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Lazy item is not yet initialized";
        }
        return lazyInt(str, interfaceC6469a);
    }
}
