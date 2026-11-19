package androidx.camera.core.impl.utils.futures;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import java.util.List;
import java.util.concurrent.Callable;
import p049e1.InterfaceFutureC5453a;

/* renamed from: androidx.camera.core.impl.utils.futures.f */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0400f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f483a = 0;

    /* renamed from: b */
    public final /* synthetic */ long f484b;

    /* renamed from: c */
    public final /* synthetic */ Object f485c;

    /* renamed from: d */
    public final /* synthetic */ Object f486d;

    public /* synthetic */ CallableC0400f(CallbackToFutureAdapter.Completer completer, InterfaceFutureC5453a interfaceFutureC5453a, long j7) {
        this.f485c = completer;
        this.f486d = interfaceFutureC5453a;
        this.f484b = j7;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f483a) {
            case 0:
                return Futures.lambda$makeTimeoutFuture$1((CallbackToFutureAdapter.Completer) this.f485c, (InterfaceFutureC5453a) this.f486d, this.f484b);
            default:
                return CommandRecord.m13809removeGraphList$lambda21((CommandRecord) this.f485c, this.f484b, (List) this.f486d);
        }
    }

    public /* synthetic */ CallableC0400f(CommandRecord commandRecord, long j7, List list) {
        this.f485c = commandRecord;
        this.f484b = j7;
        this.f486d = list;
    }
}
