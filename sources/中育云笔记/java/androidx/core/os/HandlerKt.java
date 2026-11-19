package androidx.core.os;

import android.os.Handler;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public final class HandlerKt {
    public static final Runnable postAtTime(Handler handler, long j10, Object obj, InterfaceC9529a interfaceC9529a) {
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(interfaceC9529a);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j10);
        return handlerKt$postAtTime$runnable$1;
    }

    public static /* synthetic */ Runnable postAtTime$default(Handler handler, long j10, Object obj, InterfaceC9529a interfaceC9529a, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        HandlerKt$postAtTime$runnable$1 handlerKt$postAtTime$runnable$1 = new HandlerKt$postAtTime$runnable$1(interfaceC9529a);
        handler.postAtTime(handlerKt$postAtTime$runnable$1, obj, j10);
        return handlerKt$postAtTime$runnable$1;
    }

    public static final Runnable postDelayed(Handler handler, long j10, Object obj, InterfaceC9529a interfaceC9529a) {
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(interfaceC9529a);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j10);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j10);
        return handlerKt$postDelayed$runnable$1;
    }

    public static /* synthetic */ Runnable postDelayed$default(Handler handler, long j10, Object obj, InterfaceC9529a interfaceC9529a, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        HandlerKt$postDelayed$runnable$1 handlerKt$postDelayed$runnable$1 = new HandlerKt$postDelayed$runnable$1(interfaceC9529a);
        if (obj == null) {
            handler.postDelayed(handlerKt$postDelayed$runnable$1, j10);
            return handlerKt$postDelayed$runnable$1;
        }
        HandlerCompat.postDelayed(handler, handlerKt$postDelayed$runnable$1, obj, j10);
        return handlerKt$postDelayed$runnable$1;
    }
}
