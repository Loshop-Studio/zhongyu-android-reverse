package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p169x0.AbstractC3445n;
import p169x0.AbstractC3454w;
import p169x0.C3447p;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f4826a = AbstractC3445n.m10503f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC3445n.m10501c().mo10504a(f4826a, "Requesting diagnostics", new Throwable[0]);
        try {
            AbstractC3454w.m10525e(context).m10530d(C3447p.m10509e(DiagnosticsWorker.class));
        } catch (IllegalStateException e4) {
            AbstractC3445n.m10501c().mo10505b(f4826a, "WorkManager is not initialized", e4);
        }
    }
}
