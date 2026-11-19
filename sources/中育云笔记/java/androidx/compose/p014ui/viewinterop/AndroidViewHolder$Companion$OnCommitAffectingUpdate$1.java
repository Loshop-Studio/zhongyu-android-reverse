package androidx.compose.p014ui.viewinterop;

import android.os.Handler;
import kotlin.jvm.internal.Lambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
public final class AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 extends Lambda implements InterfaceC9540l {
    public static final AndroidViewHolder$Companion$OnCommitAffectingUpdate$1 INSTANCE = new AndroidViewHolder$Companion$OnCommitAffectingUpdate$1();

    public AndroidViewHolder$Companion$OnCommitAffectingUpdate$1() {
        super(1);
    }

    @Override // p181hd.InterfaceC9540l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidViewHolder) obj);
        return C10786q.f26013a;
    }

    public final void invoke(AndroidViewHolder androidViewHolder) {
        Handler handler = androidViewHolder.getHandler();
        final InterfaceC9529a interfaceC9529a = androidViewHolder.runUpdate;
        handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.b
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC9529a.invoke();
            }
        });
    }
}
