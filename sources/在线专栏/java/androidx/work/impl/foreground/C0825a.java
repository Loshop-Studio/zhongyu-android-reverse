package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p012b1.C1029d;
import p012b1.InterfaceC1028c;
import p085f1.C2520r;
import p095h1.InterfaceC2654a;
import p169x0.AbstractC3445n;
import p169x0.C3440i;
import p173y0.C3494i;
import p173y0.InterfaceC3487b;

/* renamed from: androidx.work.impl.foreground.a */
/* loaded from: classes.dex */
public class C0825a implements InterfaceC1028c, InterfaceC3487b {

    /* renamed from: k */
    static final String f4842k = AbstractC3445n.m10503f("SystemFgDispatcher");

    /* renamed from: a */
    private Context f4843a;

    /* renamed from: b */
    private C3494i f4844b;

    /* renamed from: c */
    private final InterfaceC2654a f4845c;

    /* renamed from: d */
    final Object f4846d = new Object();

    /* renamed from: e */
    String f4847e;

    /* renamed from: f */
    final Map<String, C3440i> f4848f;

    /* renamed from: g */
    final Map<String, C2520r> f4849g;

    /* renamed from: h */
    final Set<C2520r> f4850h;

    /* renamed from: i */
    final C1029d f4851i;

    /* renamed from: j */
    private b f4852j;

    /* renamed from: androidx.work.impl.foreground.a$a */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ WorkDatabase f4853a;

        /* renamed from: b */
        final /* synthetic */ String f4854b;

        a(WorkDatabase workDatabase, String str) {
            this.f4853a = workDatabase;
            this.f4854b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2520r c2520rMo8463k = this.f4853a.mo4171M().mo8463k(this.f4854b);
            if (c2520rMo8463k == null || !c2520rMo8463k.m8448b()) {
                return;
            }
            synchronized (C0825a.this.f4846d) {
                C0825a.this.f4849g.put(this.f4854b, c2520rMo8463k);
                C0825a.this.f4850h.add(c2520rMo8463k);
                C0825a c0825a = C0825a.this;
                c0825a.f4851i.m4793d(c0825a.f4850h);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.a$b */
    interface b {
        /* renamed from: b */
        void mo4231b(int i4);

        /* renamed from: c */
        void mo4232c(int i4, int i5, Notification notification);

        /* renamed from: d */
        void mo4233d(int i4, Notification notification);

        void stop();
    }

    C0825a(Context context) {
        this.f4843a = context;
        C3494i c3494iM10599n = C3494i.m10599n(context);
        this.f4844b = c3494iM10599n;
        InterfaceC2654a interfaceC2654aM10615u = c3494iM10599n.m10615u();
        this.f4845c = interfaceC2654aM10615u;
        this.f4847e = null;
        this.f4848f = new LinkedHashMap();
        this.f4850h = new HashSet();
        this.f4849g = new HashMap();
        this.f4851i = new C1029d(this.f4843a, interfaceC2654aM10615u, this);
        this.f4844b.m10610p().m10565d(this);
    }

    /* renamed from: b */
    public static Intent m4234b(Context context, String str, C3440i c3440i) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", c3440i.m10495c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c3440i.m10493a());
        intent.putExtra("KEY_NOTIFICATION", c3440i.m10494b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: e */
    public static Intent m4235e(Context context, String str, C3440i c3440i) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", c3440i.m10495c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c3440i.m10493a());
        intent.putExtra("KEY_NOTIFICATION", c3440i.m10494b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: f */
    public static Intent m4236f(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: g */
    private void m4237g(Intent intent) {
        AbstractC3445n.m10501c().mo10506d(f4842k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f4844b.mo10528b(UUID.fromString(stringExtra));
    }

    /* renamed from: h */
    private void m4238h(Intent intent) {
        int iM10493a = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        AbstractC3445n.m10501c().mo10504a(f4842k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f4852j == null) {
            return;
        }
        this.f4848f.put(stringExtra, new C3440i(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f4847e)) {
            this.f4847e = stringExtra;
            this.f4852j.mo4232c(intExtra, intExtra2, notification);
            return;
        }
        this.f4852j.mo4233d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, C3440i>> it = this.f4848f.entrySet().iterator();
        while (it.hasNext()) {
            iM10493a |= it.next().getValue().m10493a();
        }
        C3440i c3440i = this.f4848f.get(this.f4847e);
        if (c3440i != null) {
            this.f4852j.mo4232c(c3440i.m10495c(), iM10493a, c3440i.m10494b());
        }
    }

    /* renamed from: i */
    private void m4239i(Intent intent) {
        AbstractC3445n.m10501c().mo10506d(f4842k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f4845c.mo8914b(new a(this.f4844b.m10613s(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // p173y0.InterfaceC3487b
    /* renamed from: a */
    public void mo4206a(String str, boolean z3) {
        Map.Entry<String, C3440i> entry;
        synchronized (this.f4846d) {
            C2520r c2520rRemove = this.f4849g.remove(str);
            if (c2520rRemove != null ? this.f4850h.remove(c2520rRemove) : false) {
                this.f4851i.m4793d(this.f4850h);
            }
        }
        C3440i c3440iRemove = this.f4848f.remove(str);
        if (str.equals(this.f4847e) && this.f4848f.size() > 0) {
            Iterator<Map.Entry<String, C3440i>> it = this.f4848f.entrySet().iterator();
            Map.Entry<String, C3440i> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f4847e = entry.getKey();
            if (this.f4852j != null) {
                C3440i value = entry.getValue();
                this.f4852j.mo4232c(value.m10495c(), value.m10493a(), value.m10494b());
                this.f4852j.mo4231b(value.m10495c());
            }
        }
        b bVar = this.f4852j;
        if (c3440iRemove == null || bVar == null) {
            return;
        }
        AbstractC3445n.m10501c().mo10504a(f4842k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(c3440iRemove.m10495c()), str, Integer.valueOf(c3440iRemove.m10493a())), new Throwable[0]);
        bVar.mo4231b(c3440iRemove.m10495c());
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: c */
    public void mo4213c(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            AbstractC3445n.m10501c().mo10504a(f4842k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f4844b.m10602B(str);
        }
    }

    @Override // p012b1.InterfaceC1028c
    /* renamed from: d */
    public void mo4214d(List<String> list) {
    }

    /* renamed from: j */
    void m4240j(Intent intent) {
        AbstractC3445n.m10501c().mo10506d(f4842k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f4852j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    /* renamed from: k */
    void m4241k() {
        this.f4852j = null;
        synchronized (this.f4846d) {
            this.f4851i.m4794e();
        }
        this.f4844b.m10610p().m10569i(this);
    }

    /* renamed from: l */
    void m4242l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m4239i(intent);
            m4238h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            m4238h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            m4237g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            m4240j(intent);
        }
    }

    /* renamed from: m */
    void m4243m(b bVar) {
        if (this.f4852j != null) {
            AbstractC3445n.m10501c().mo10505b(f4842k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f4852j = bVar;
        }
    }
}
