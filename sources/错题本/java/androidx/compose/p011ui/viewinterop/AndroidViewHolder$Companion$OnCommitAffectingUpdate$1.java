package androidx.compose.p011ui.viewinterop;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "it", "Ld6/s;", "invoke", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "<anonymous>"}, m5111k = 3, m5112mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements InterfaceC6471c {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    public AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    @Override // p152r6.InterfaceC6471c
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidViewHolder) obj);
        return C5443s.f8405a;
    }

    public final void invoke(AndroidViewHolder androidViewHolder) {
        androidViewHolder.getHandler().post(new RunnableC2340a(androidViewHolder.runUpdate, 0));
    }
}
