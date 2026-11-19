package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p085f1.C2511i;
import p085f1.C2520r;
import p085f1.InterfaceC2512j;
import p085f1.InterfaceC2515m;
import p085f1.InterfaceC2521s;
import p085f1.InterfaceC2524v;
import p169x0.AbstractC3445n;
import p173y0.C3494i;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* renamed from: b */
    private static final String f4900b = AbstractC3445n.m10503f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: b */
    private static String m4284b(C2520r c2520r, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", c2520r.f10165a, c2520r.f10167c, num, c2520r.f10166b.name(), str, str2);
    }

    /* renamed from: e */
    private static String m4285e(InterfaceC2515m interfaceC2515m, InterfaceC2524v interfaceC2524v, InterfaceC2512j interfaceC2512j, List<C2520r> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (C2520r c2520r : list) {
            Integer numValueOf = null;
            C2511i c2511iMo8437c = interfaceC2512j.mo8437c(c2520r.f10165a);
            if (c2511iMo8437c != null) {
                numValueOf = Integer.valueOf(c2511iMo8437c.f10143b);
            }
            sb.append(m4284b(c2520r, TextUtils.join(",", interfaceC2515m.mo8441b(c2520r.f10165a)), numValueOf, TextUtils.join(",", interfaceC2524v.mo8483b(c2520r.f10165a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    /* renamed from: a */
    public ListenableWorker.AbstractC0807a mo4129a() {
        WorkDatabase workDatabaseM10613s = C3494i.m10599n(getApplicationContext()).m10613s();
        InterfaceC2521s interfaceC2521sMo4171M = workDatabaseM10613s.mo4171M();
        InterfaceC2515m interfaceC2515mMo4169K = workDatabaseM10613s.mo4169K();
        InterfaceC2524v interfaceC2524vMo4172N = workDatabaseM10613s.mo4172N();
        InterfaceC2512j interfaceC2512jMo4168J = workDatabaseM10613s.mo4168J();
        List<C2520r> listMo8460h = interfaceC2521sMo4171M.mo8460h(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<C2520r> listMo8454b = interfaceC2521sMo4171M.mo8454b();
        List<C2520r> listMo8472t = interfaceC2521sMo4171M.mo8472t(200);
        if (listMo8460h != null && !listMo8460h.isEmpty()) {
            AbstractC3445n abstractC3445nM10501c = AbstractC3445n.m10501c();
            String str = f4900b;
            abstractC3445nM10501c.mo10506d(str, "Recently completed work:\n\n", new Throwable[0]);
            AbstractC3445n.m10501c().mo10506d(str, m4285e(interfaceC2515mMo4169K, interfaceC2524vMo4172N, interfaceC2512jMo4168J, listMo8460h), new Throwable[0]);
        }
        if (listMo8454b != null && !listMo8454b.isEmpty()) {
            AbstractC3445n abstractC3445nM10501c2 = AbstractC3445n.m10501c();
            String str2 = f4900b;
            abstractC3445nM10501c2.mo10506d(str2, "Running work:\n\n", new Throwable[0]);
            AbstractC3445n.m10501c().mo10506d(str2, m4285e(interfaceC2515mMo4169K, interfaceC2524vMo4172N, interfaceC2512jMo4168J, listMo8454b), new Throwable[0]);
        }
        if (listMo8472t != null && !listMo8472t.isEmpty()) {
            AbstractC3445n abstractC3445nM10501c3 = AbstractC3445n.m10501c();
            String str3 = f4900b;
            abstractC3445nM10501c3.mo10506d(str3, "Enqueued work:\n\n", new Throwable[0]);
            AbstractC3445n.m10501c().mo10506d(str3, m4285e(interfaceC2515mMo4169K, interfaceC2524vMo4172N, interfaceC2512jMo4168J, listMo8472t), new Throwable[0]);
        }
        return ListenableWorker.AbstractC0807a.m4125d();
    }
}
