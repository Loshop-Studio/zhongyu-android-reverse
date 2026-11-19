package p085f1;

import android.database.Cursor;
import androidx.collection.C0247a;
import androidx.lifecycle.LiveData;
import androidx.room.AbstractC0621h0;
import androidx.work.C0810a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import p085f1.C2520r;
import p136p0.AbstractC2990g;
import p136p0.AbstractC2995l;
import p136p0.C2994k;
import p144r0.C3020b;
import p144r0.C3021c;
import p144r0.C3024f;
import p149s0.InterfaceC3375f;
import p169x0.C3434c;
import p169x0.C3453v;

/* renamed from: f1.t */
/* loaded from: classes.dex */
public final class C2522t implements InterfaceC2521s {

    /* renamed from: a */
    private final AbstractC0621h0 f10190a;

    /* renamed from: b */
    private final AbstractC2990g<C2520r> f10191b;

    /* renamed from: c */
    private final AbstractC2995l f10192c;

    /* renamed from: d */
    private final AbstractC2995l f10193d;

    /* renamed from: e */
    private final AbstractC2995l f10194e;

    /* renamed from: f */
    private final AbstractC2995l f10195f;

    /* renamed from: g */
    private final AbstractC2995l f10196g;

    /* renamed from: h */
    private final AbstractC2995l f10197h;

    /* renamed from: i */
    private final AbstractC2995l f10198i;

    /* renamed from: j */
    private final AbstractC2995l f10199j;

    /* renamed from: f1.t$a */
    class a implements Callable<List<C2520r.c>> {

        /* renamed from: a */
        final /* synthetic */ C2994k f10200a;

        a(C2994k c2994k) {
            this.f10200a = c2994k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<C2520r.c> call() throws Exception {
            C2522t.this.f10190a.m3542e();
            try {
                Cursor cursorM10145b = C3021c.m10145b(C2522t.this.f10190a, this.f10200a, true, null);
                try {
                    int iM10143e = C3020b.m10143e(cursorM10145b, "id");
                    int iM10143e2 = C3020b.m10143e(cursorM10145b, "state");
                    int iM10143e3 = C3020b.m10143e(cursorM10145b, "output");
                    int iM10143e4 = C3020b.m10143e(cursorM10145b, "run_attempt_count");
                    C0247a c0247a = new C0247a();
                    C0247a c0247a2 = new C0247a();
                    while (cursorM10145b.moveToNext()) {
                        if (!cursorM10145b.isNull(iM10143e)) {
                            String string = cursorM10145b.getString(iM10143e);
                            if (((ArrayList) c0247a.get(string)) == null) {
                                c0247a.put(string, new ArrayList());
                            }
                        }
                        if (!cursorM10145b.isNull(iM10143e)) {
                            String string2 = cursorM10145b.getString(iM10143e);
                            if (((ArrayList) c0247a2.get(string2)) == null) {
                                c0247a2.put(string2, new ArrayList());
                            }
                        }
                    }
                    cursorM10145b.moveToPosition(-1);
                    C2522t.this.m8477x(c0247a);
                    C2522t.this.m8476w(c0247a2);
                    ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
                    while (cursorM10145b.moveToNext()) {
                        ArrayList arrayList2 = !cursorM10145b.isNull(iM10143e) ? (ArrayList) c0247a.get(cursorM10145b.getString(iM10143e)) : null;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = !cursorM10145b.isNull(iM10143e) ? (ArrayList) c0247a2.get(cursorM10145b.getString(iM10143e)) : null;
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        C2520r.c cVar = new C2520r.c();
                        cVar.f10184a = cursorM10145b.getString(iM10143e);
                        cVar.f10185b = C2526x.m8490f(cursorM10145b.getInt(iM10143e2));
                        cVar.f10186c = C0810a.m4148g(cursorM10145b.getBlob(iM10143e3));
                        cVar.f10187d = cursorM10145b.getInt(iM10143e4);
                        cVar.f10188e = arrayList2;
                        cVar.f10189f = arrayList3;
                        arrayList.add(cVar);
                    }
                    C2522t.this.f10190a.m3539A();
                    return arrayList;
                } finally {
                    cursorM10145b.close();
                }
            } finally {
                C2522t.this.f10190a.m3546i();
            }
        }

        protected void finalize() {
            this.f10200a.m10091o();
        }
    }

    /* renamed from: f1.t$b */
    class b extends AbstractC2990g<C2520r> {
        b(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p136p0.AbstractC2990g
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo8257g(InterfaceC3375f interfaceC3375f, C2520r c2520r) throws Throwable {
            String str = c2520r.f10165a;
            if (str == null) {
                interfaceC3375f.mo3489k(1);
            } else {
                interfaceC3375f.mo3488c(1, str);
            }
            interfaceC3375f.mo3491w(2, C2526x.m8492h(c2520r.f10166b));
            String str2 = c2520r.f10167c;
            if (str2 == null) {
                interfaceC3375f.mo3489k(3);
            } else {
                interfaceC3375f.mo3488c(3, str2);
            }
            String str3 = c2520r.f10168d;
            if (str3 == null) {
                interfaceC3375f.mo3489k(4);
            } else {
                interfaceC3375f.mo3488c(4, str3);
            }
            byte[] bArrM4149m = C0810a.m4149m(c2520r.f10169e);
            if (bArrM4149m == null) {
                interfaceC3375f.mo3489k(5);
            } else {
                interfaceC3375f.mo3486C(5, bArrM4149m);
            }
            byte[] bArrM4149m2 = C0810a.m4149m(c2520r.f10170f);
            if (bArrM4149m2 == null) {
                interfaceC3375f.mo3489k(6);
            } else {
                interfaceC3375f.mo3486C(6, bArrM4149m2);
            }
            interfaceC3375f.mo3491w(7, c2520r.f10171g);
            interfaceC3375f.mo3491w(8, c2520r.f10172h);
            interfaceC3375f.mo3491w(9, c2520r.f10173i);
            interfaceC3375f.mo3491w(10, c2520r.f10175k);
            interfaceC3375f.mo3491w(11, C2526x.m8485a(c2520r.f10176l));
            interfaceC3375f.mo3491w(12, c2520r.f10177m);
            interfaceC3375f.mo3491w(13, c2520r.f10178n);
            interfaceC3375f.mo3491w(14, c2520r.f10179o);
            interfaceC3375f.mo3491w(15, c2520r.f10180p);
            interfaceC3375f.mo3491w(16, c2520r.f10181q ? 1L : 0L);
            C3434c c3434c = c2520r.f10174j;
            if (c3434c == null) {
                interfaceC3375f.mo3489k(17);
                interfaceC3375f.mo3489k(18);
                interfaceC3375f.mo3489k(19);
                interfaceC3375f.mo3489k(20);
                interfaceC3375f.mo3489k(21);
                interfaceC3375f.mo3489k(22);
                interfaceC3375f.mo3489k(23);
                interfaceC3375f.mo3489k(24);
                return;
            }
            interfaceC3375f.mo3491w(17, C2526x.m8491g(c3434c.m10463b()));
            interfaceC3375f.mo3491w(18, c3434c.m10468g() ? 1L : 0L);
            interfaceC3375f.mo3491w(19, c3434c.m10469h() ? 1L : 0L);
            interfaceC3375f.mo3491w(20, c3434c.m10467f() ? 1L : 0L);
            interfaceC3375f.mo3491w(21, c3434c.m10470i() ? 1L : 0L);
            interfaceC3375f.mo3491w(22, c3434c.m10464c());
            interfaceC3375f.mo3491w(23, c3434c.m10465d());
            byte[] bArrM8487c = C2526x.m8487c(c3434c.m10462a());
            if (bArrM8487c == null) {
                interfaceC3375f.mo3489k(24);
            } else {
                interfaceC3375f.mo3486C(24, bArrM8487c);
            }
        }
    }

    /* renamed from: f1.t$c */
    class c extends AbstractC2995l {
        c(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: f1.t$d */
    class d extends AbstractC2995l {
        d(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: f1.t$e */
    class e extends AbstractC2995l {
        e(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: f1.t$f */
    class f extends AbstractC2995l {
        f(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: f1.t$g */
    class g extends AbstractC2995l {
        g(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: f1.t$h */
    class h extends AbstractC2995l {
        h(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: f1.t$i */
    class i extends AbstractC2995l {
        i(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* renamed from: f1.t$j */
    class j extends AbstractC2995l {
        j(AbstractC0621h0 abstractC0621h0) {
            super(abstractC0621h0);
        }

        @Override // p136p0.AbstractC2995l
        /* renamed from: d */
        public String mo8256d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public C2522t(AbstractC0621h0 abstractC0621h0) {
        this.f10190a = abstractC0621h0;
        this.f10191b = new b(abstractC0621h0);
        this.f10192c = new c(abstractC0621h0);
        this.f10193d = new d(abstractC0621h0);
        this.f10194e = new e(abstractC0621h0);
        this.f10195f = new f(abstractC0621h0);
        this.f10196g = new g(abstractC0621h0);
        this.f10197h = new h(abstractC0621h0);
        this.f10198i = new i(abstractC0621h0);
        this.f10199j = new j(abstractC0621h0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m8476w(C0247a<String, ArrayList<C0810a>> c0247a) {
        ArrayList<C0810a> arrayList;
        int i4;
        Set<String> setKeySet = c0247a.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (c0247a.size() > 999) {
            C0247a<String, ArrayList<C0810a>> c0247a2 = new C0247a<>(999);
            int size = c0247a.size();
            int i5 = 0;
            loop0: while (true) {
                i4 = 0;
                while (i5 < size) {
                    c0247a2.put(c0247a.keyAt(i5), c0247a.valueAt(i5));
                    i5++;
                    i4++;
                    if (i4 == 999) {
                        break;
                    }
                }
                m8476w(c0247a2);
                c0247a2 = new C0247a<>(999);
            }
            if (i4 > 0) {
                m8476w(c0247a2);
                return;
            }
            return;
        }
        StringBuilder sbM10151b = C3024f.m10151b();
        sbM10151b.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        C3024f.m10150a(sbM10151b, size2);
        sbM10151b.append(")");
        C2994k c2994kM10086d = C2994k.m10086d(sbM10151b.toString(), size2 + 0);
        int i6 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                c2994kM10086d.mo3489k(i6);
            } else {
                c2994kM10086d.mo3488c(i6, str);
            }
            i6++;
        }
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            int iM10142d = C3020b.m10142d(cursorM10145b, "work_spec_id");
            if (iM10142d == -1) {
                return;
            }
            while (cursorM10145b.moveToNext()) {
                if (!cursorM10145b.isNull(iM10142d) && (arrayList = c0247a.get(cursorM10145b.getString(iM10142d))) != null) {
                    arrayList.add(C0810a.m4148g(cursorM10145b.getBlob(0)));
                }
            }
        } finally {
            cursorM10145b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m8477x(C0247a<String, ArrayList<String>> c0247a) {
        ArrayList<String> arrayList;
        int i4;
        Set<String> setKeySet = c0247a.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (c0247a.size() > 999) {
            C0247a<String, ArrayList<String>> c0247a2 = new C0247a<>(999);
            int size = c0247a.size();
            int i5 = 0;
            loop0: while (true) {
                i4 = 0;
                while (i5 < size) {
                    c0247a2.put(c0247a.keyAt(i5), c0247a.valueAt(i5));
                    i5++;
                    i4++;
                    if (i4 == 999) {
                        break;
                    }
                }
                m8477x(c0247a2);
                c0247a2 = new C0247a<>(999);
            }
            if (i4 > 0) {
                m8477x(c0247a2);
                return;
            }
            return;
        }
        StringBuilder sbM10151b = C3024f.m10151b();
        sbM10151b.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = setKeySet.size();
        C3024f.m10150a(sbM10151b, size2);
        sbM10151b.append(")");
        C2994k c2994kM10086d = C2994k.m10086d(sbM10151b.toString(), size2 + 0);
        int i6 = 1;
        for (String str : setKeySet) {
            if (str == null) {
                c2994kM10086d.mo3489k(i6);
            } else {
                c2994kM10086d.mo3488c(i6, str);
            }
            i6++;
        }
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            int iM10142d = C3020b.m10142d(cursorM10145b, "work_spec_id");
            if (iM10142d == -1) {
                return;
            }
            while (cursorM10145b.moveToNext()) {
                if (!cursorM10145b.isNull(iM10142d) && (arrayList = c0247a.get(cursorM10145b.getString(iM10142d))) != null) {
                    arrayList.add(cursorM10145b.getString(0));
                }
            }
        } finally {
            cursorM10145b.close();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: a */
    public void mo8453a(String str) {
        this.f10190a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10192c.m10094a();
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(1);
        } else {
            interfaceC3375fM10094a.mo3488c(1, str);
        }
        this.f10190a.m3542e();
        try {
            interfaceC3375fM10094a.mo3521i();
            this.f10190a.m3539A();
        } finally {
            this.f10190a.m3546i();
            this.f10192c.m10096f(interfaceC3375fM10094a);
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: b */
    public List<C2520r> mo8454b() throws Throwable {
        C2994k c2994k;
        int iM10143e;
        int iM10143e2;
        int iM10143e3;
        int iM10143e4;
        int iM10143e5;
        int iM10143e6;
        int iM10143e7;
        int iM10143e8;
        int iM10143e9;
        int iM10143e10;
        int iM10143e11;
        int iM10143e12;
        int iM10143e13;
        int iM10143e14;
        C2994k c2994kM10086d = C2994k.m10086d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            iM10143e = C3020b.m10143e(cursorM10145b, "required_network_type");
            iM10143e2 = C3020b.m10143e(cursorM10145b, "requires_charging");
            iM10143e3 = C3020b.m10143e(cursorM10145b, "requires_device_idle");
            iM10143e4 = C3020b.m10143e(cursorM10145b, "requires_battery_not_low");
            iM10143e5 = C3020b.m10143e(cursorM10145b, "requires_storage_not_low");
            iM10143e6 = C3020b.m10143e(cursorM10145b, "trigger_content_update_delay");
            iM10143e7 = C3020b.m10143e(cursorM10145b, "trigger_max_content_delay");
            iM10143e8 = C3020b.m10143e(cursorM10145b, "content_uri_triggers");
            iM10143e9 = C3020b.m10143e(cursorM10145b, "id");
            iM10143e10 = C3020b.m10143e(cursorM10145b, "state");
            iM10143e11 = C3020b.m10143e(cursorM10145b, "worker_class_name");
            iM10143e12 = C3020b.m10143e(cursorM10145b, "input_merger_class_name");
            iM10143e13 = C3020b.m10143e(cursorM10145b, "input");
            iM10143e14 = C3020b.m10143e(cursorM10145b, "output");
            c2994k = c2994kM10086d;
        } catch (Throwable th) {
            th = th;
            c2994k = c2994kM10086d;
        }
        try {
            int iM10143e15 = C3020b.m10143e(cursorM10145b, "initial_delay");
            int iM10143e16 = C3020b.m10143e(cursorM10145b, "interval_duration");
            int iM10143e17 = C3020b.m10143e(cursorM10145b, "flex_duration");
            int iM10143e18 = C3020b.m10143e(cursorM10145b, "run_attempt_count");
            int iM10143e19 = C3020b.m10143e(cursorM10145b, "backoff_policy");
            int iM10143e20 = C3020b.m10143e(cursorM10145b, "backoff_delay_duration");
            int iM10143e21 = C3020b.m10143e(cursorM10145b, "period_start_time");
            int iM10143e22 = C3020b.m10143e(cursorM10145b, "minimum_retention_duration");
            int iM10143e23 = C3020b.m10143e(cursorM10145b, "schedule_requested_at");
            int iM10143e24 = C3020b.m10143e(cursorM10145b, "run_in_foreground");
            int i4 = iM10143e14;
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                String string = cursorM10145b.getString(iM10143e9);
                int i5 = iM10143e9;
                String string2 = cursorM10145b.getString(iM10143e11);
                int i6 = iM10143e11;
                C3434c c3434c = new C3434c();
                int i7 = iM10143e;
                c3434c.m10472k(C2526x.m8489e(cursorM10145b.getInt(iM10143e)));
                c3434c.m10474m(cursorM10145b.getInt(iM10143e2) != 0);
                c3434c.m10475n(cursorM10145b.getInt(iM10143e3) != 0);
                c3434c.m10473l(cursorM10145b.getInt(iM10143e4) != 0);
                c3434c.m10476o(cursorM10145b.getInt(iM10143e5) != 0);
                int i8 = iM10143e2;
                int i9 = iM10143e3;
                c3434c.m10477p(cursorM10145b.getLong(iM10143e6));
                c3434c.m10478q(cursorM10145b.getLong(iM10143e7));
                c3434c.m10471j(C2526x.m8486b(cursorM10145b.getBlob(iM10143e8)));
                C2520r c2520r = new C2520r(string, string2);
                c2520r.f10166b = C2526x.m8490f(cursorM10145b.getInt(iM10143e10));
                c2520r.f10168d = cursorM10145b.getString(iM10143e12);
                c2520r.f10169e = C0810a.m4148g(cursorM10145b.getBlob(iM10143e13));
                int i10 = i4;
                c2520r.f10170f = C0810a.m4148g(cursorM10145b.getBlob(i10));
                i4 = i10;
                int i11 = iM10143e15;
                c2520r.f10171g = cursorM10145b.getLong(i11);
                int i12 = iM10143e13;
                int i13 = iM10143e16;
                c2520r.f10172h = cursorM10145b.getLong(i13);
                int i14 = iM10143e4;
                int i15 = iM10143e17;
                c2520r.f10173i = cursorM10145b.getLong(i15);
                int i16 = iM10143e18;
                c2520r.f10175k = cursorM10145b.getInt(i16);
                int i17 = iM10143e19;
                c2520r.f10176l = C2526x.m8488d(cursorM10145b.getInt(i17));
                iM10143e17 = i15;
                int i18 = iM10143e20;
                c2520r.f10177m = cursorM10145b.getLong(i18);
                int i19 = iM10143e21;
                c2520r.f10178n = cursorM10145b.getLong(i19);
                iM10143e21 = i19;
                int i20 = iM10143e22;
                c2520r.f10179o = cursorM10145b.getLong(i20);
                int i21 = iM10143e23;
                c2520r.f10180p = cursorM10145b.getLong(i21);
                int i22 = iM10143e24;
                c2520r.f10181q = cursorM10145b.getInt(i22) != 0;
                c2520r.f10174j = c3434c;
                arrayList.add(c2520r);
                iM10143e23 = i21;
                iM10143e24 = i22;
                iM10143e2 = i8;
                iM10143e13 = i12;
                iM10143e15 = i11;
                iM10143e16 = i13;
                iM10143e18 = i16;
                iM10143e9 = i5;
                iM10143e11 = i6;
                iM10143e = i7;
                iM10143e22 = i20;
                iM10143e3 = i9;
                iM10143e20 = i18;
                iM10143e4 = i14;
                iM10143e19 = i17;
            }
            cursorM10145b.close();
            c2994k.m10091o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM10145b.close();
            c2994k.m10091o();
            throw th;
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: c */
    public List<String> mo8455c() {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                arrayList.add(cursorM10145b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: d */
    public int mo8456d(String str, long j4) {
        this.f10190a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10197h.m10094a();
        interfaceC3375fM10094a.mo3491w(1, j4);
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(2);
        } else {
            interfaceC3375fM10094a.mo3488c(2, str);
        }
        this.f10190a.m3542e();
        try {
            int iMo3521i = interfaceC3375fM10094a.mo3521i();
            this.f10190a.m3539A();
            return iMo3521i;
        } finally {
            this.f10190a.m3546i();
            this.f10197h.m10096f(interfaceC3375fM10094a);
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: e */
    public List<String> mo8457e(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                arrayList.add(cursorM10145b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: f */
    public List<C2520r.b> mo8458f(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            int iM10143e = C3020b.m10143e(cursorM10145b, "id");
            int iM10143e2 = C3020b.m10143e(cursorM10145b, "state");
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                C2520r.b bVar = new C2520r.b();
                bVar.f10182a = cursorM10145b.getString(iM10143e);
                bVar.f10183b = C2526x.m8490f(cursorM10145b.getInt(iM10143e2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: g */
    public int mo8459g(C3453v.a aVar, String... strArr) {
        this.f10190a.m3541d();
        StringBuilder sbM10151b = C3024f.m10151b();
        sbM10151b.append("UPDATE workspec SET state=");
        sbM10151b.append("?");
        sbM10151b.append(" WHERE id IN (");
        C3024f.m10150a(sbM10151b, strArr.length);
        sbM10151b.append(")");
        InterfaceC3375f interfaceC3375fM3543f = this.f10190a.m3543f(sbM10151b.toString());
        interfaceC3375fM3543f.mo3491w(1, C2526x.m8492h(aVar));
        int i4 = 2;
        for (String str : strArr) {
            if (str == null) {
                interfaceC3375fM3543f.mo3489k(i4);
            } else {
                interfaceC3375fM3543f.mo3488c(i4, str);
            }
            i4++;
        }
        this.f10190a.m3542e();
        try {
            int iMo3521i = interfaceC3375fM3543f.mo3521i();
            this.f10190a.m3539A();
            return iMo3521i;
        } finally {
            this.f10190a.m3546i();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: h */
    public List<C2520r> mo8460h(long j4) throws Throwable {
        C2994k c2994k;
        C2994k c2994kM10086d = C2994k.m10086d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        c2994kM10086d.mo3491w(1, j4);
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            int iM10143e = C3020b.m10143e(cursorM10145b, "required_network_type");
            int iM10143e2 = C3020b.m10143e(cursorM10145b, "requires_charging");
            int iM10143e3 = C3020b.m10143e(cursorM10145b, "requires_device_idle");
            int iM10143e4 = C3020b.m10143e(cursorM10145b, "requires_battery_not_low");
            int iM10143e5 = C3020b.m10143e(cursorM10145b, "requires_storage_not_low");
            int iM10143e6 = C3020b.m10143e(cursorM10145b, "trigger_content_update_delay");
            int iM10143e7 = C3020b.m10143e(cursorM10145b, "trigger_max_content_delay");
            int iM10143e8 = C3020b.m10143e(cursorM10145b, "content_uri_triggers");
            int iM10143e9 = C3020b.m10143e(cursorM10145b, "id");
            int iM10143e10 = C3020b.m10143e(cursorM10145b, "state");
            int iM10143e11 = C3020b.m10143e(cursorM10145b, "worker_class_name");
            int iM10143e12 = C3020b.m10143e(cursorM10145b, "input_merger_class_name");
            int iM10143e13 = C3020b.m10143e(cursorM10145b, "input");
            int iM10143e14 = C3020b.m10143e(cursorM10145b, "output");
            c2994k = c2994kM10086d;
            try {
                int iM10143e15 = C3020b.m10143e(cursorM10145b, "initial_delay");
                int iM10143e16 = C3020b.m10143e(cursorM10145b, "interval_duration");
                int iM10143e17 = C3020b.m10143e(cursorM10145b, "flex_duration");
                int iM10143e18 = C3020b.m10143e(cursorM10145b, "run_attempt_count");
                int iM10143e19 = C3020b.m10143e(cursorM10145b, "backoff_policy");
                int iM10143e20 = C3020b.m10143e(cursorM10145b, "backoff_delay_duration");
                int iM10143e21 = C3020b.m10143e(cursorM10145b, "period_start_time");
                int iM10143e22 = C3020b.m10143e(cursorM10145b, "minimum_retention_duration");
                int iM10143e23 = C3020b.m10143e(cursorM10145b, "schedule_requested_at");
                int iM10143e24 = C3020b.m10143e(cursorM10145b, "run_in_foreground");
                int i4 = iM10143e14;
                ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
                while (cursorM10145b.moveToNext()) {
                    String string = cursorM10145b.getString(iM10143e9);
                    int i5 = iM10143e9;
                    String string2 = cursorM10145b.getString(iM10143e11);
                    int i6 = iM10143e11;
                    C3434c c3434c = new C3434c();
                    int i7 = iM10143e;
                    c3434c.m10472k(C2526x.m8489e(cursorM10145b.getInt(iM10143e)));
                    c3434c.m10474m(cursorM10145b.getInt(iM10143e2) != 0);
                    c3434c.m10475n(cursorM10145b.getInt(iM10143e3) != 0);
                    c3434c.m10473l(cursorM10145b.getInt(iM10143e4) != 0);
                    c3434c.m10476o(cursorM10145b.getInt(iM10143e5) != 0);
                    int i8 = iM10143e2;
                    int i9 = iM10143e3;
                    c3434c.m10477p(cursorM10145b.getLong(iM10143e6));
                    c3434c.m10478q(cursorM10145b.getLong(iM10143e7));
                    c3434c.m10471j(C2526x.m8486b(cursorM10145b.getBlob(iM10143e8)));
                    C2520r c2520r = new C2520r(string, string2);
                    c2520r.f10166b = C2526x.m8490f(cursorM10145b.getInt(iM10143e10));
                    c2520r.f10168d = cursorM10145b.getString(iM10143e12);
                    c2520r.f10169e = C0810a.m4148g(cursorM10145b.getBlob(iM10143e13));
                    int i10 = i4;
                    c2520r.f10170f = C0810a.m4148g(cursorM10145b.getBlob(i10));
                    int i11 = iM10143e15;
                    i4 = i10;
                    c2520r.f10171g = cursorM10145b.getLong(i11);
                    int i12 = iM10143e12;
                    int i13 = iM10143e16;
                    c2520r.f10172h = cursorM10145b.getLong(i13);
                    int i14 = iM10143e4;
                    int i15 = iM10143e17;
                    c2520r.f10173i = cursorM10145b.getLong(i15);
                    int i16 = iM10143e18;
                    c2520r.f10175k = cursorM10145b.getInt(i16);
                    int i17 = iM10143e19;
                    c2520r.f10176l = C2526x.m8488d(cursorM10145b.getInt(i17));
                    iM10143e17 = i15;
                    int i18 = iM10143e20;
                    c2520r.f10177m = cursorM10145b.getLong(i18);
                    int i19 = iM10143e21;
                    c2520r.f10178n = cursorM10145b.getLong(i19);
                    iM10143e21 = i19;
                    int i20 = iM10143e22;
                    c2520r.f10179o = cursorM10145b.getLong(i20);
                    int i21 = iM10143e23;
                    c2520r.f10180p = cursorM10145b.getLong(i21);
                    int i22 = iM10143e24;
                    c2520r.f10181q = cursorM10145b.getInt(i22) != 0;
                    c2520r.f10174j = c3434c;
                    arrayList.add(c2520r);
                    iM10143e2 = i8;
                    iM10143e23 = i21;
                    iM10143e24 = i22;
                    iM10143e12 = i12;
                    iM10143e15 = i11;
                    iM10143e16 = i13;
                    iM10143e18 = i16;
                    iM10143e9 = i5;
                    iM10143e11 = i6;
                    iM10143e = i7;
                    iM10143e22 = i20;
                    iM10143e3 = i9;
                    iM10143e20 = i18;
                    iM10143e4 = i14;
                    iM10143e19 = i17;
                }
                cursorM10145b.close();
                c2994k.m10091o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM10145b.close();
                c2994k.m10091o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2994k = c2994kM10086d;
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: i */
    public C3453v.a mo8461i(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            return cursorM10145b.moveToFirst() ? C2526x.m8490f(cursorM10145b.getInt(0)) : null;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: j */
    public List<C2520r> mo8462j(int i4) throws Throwable {
        C2994k c2994k;
        C2994k c2994kM10086d = C2994k.m10086d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        c2994kM10086d.mo3491w(1, i4);
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            int iM10143e = C3020b.m10143e(cursorM10145b, "required_network_type");
            int iM10143e2 = C3020b.m10143e(cursorM10145b, "requires_charging");
            int iM10143e3 = C3020b.m10143e(cursorM10145b, "requires_device_idle");
            int iM10143e4 = C3020b.m10143e(cursorM10145b, "requires_battery_not_low");
            int iM10143e5 = C3020b.m10143e(cursorM10145b, "requires_storage_not_low");
            int iM10143e6 = C3020b.m10143e(cursorM10145b, "trigger_content_update_delay");
            int iM10143e7 = C3020b.m10143e(cursorM10145b, "trigger_max_content_delay");
            int iM10143e8 = C3020b.m10143e(cursorM10145b, "content_uri_triggers");
            int iM10143e9 = C3020b.m10143e(cursorM10145b, "id");
            int iM10143e10 = C3020b.m10143e(cursorM10145b, "state");
            int iM10143e11 = C3020b.m10143e(cursorM10145b, "worker_class_name");
            int iM10143e12 = C3020b.m10143e(cursorM10145b, "input_merger_class_name");
            int iM10143e13 = C3020b.m10143e(cursorM10145b, "input");
            int iM10143e14 = C3020b.m10143e(cursorM10145b, "output");
            c2994k = c2994kM10086d;
            try {
                int iM10143e15 = C3020b.m10143e(cursorM10145b, "initial_delay");
                int iM10143e16 = C3020b.m10143e(cursorM10145b, "interval_duration");
                int iM10143e17 = C3020b.m10143e(cursorM10145b, "flex_duration");
                int iM10143e18 = C3020b.m10143e(cursorM10145b, "run_attempt_count");
                int iM10143e19 = C3020b.m10143e(cursorM10145b, "backoff_policy");
                int iM10143e20 = C3020b.m10143e(cursorM10145b, "backoff_delay_duration");
                int iM10143e21 = C3020b.m10143e(cursorM10145b, "period_start_time");
                int iM10143e22 = C3020b.m10143e(cursorM10145b, "minimum_retention_duration");
                int iM10143e23 = C3020b.m10143e(cursorM10145b, "schedule_requested_at");
                int iM10143e24 = C3020b.m10143e(cursorM10145b, "run_in_foreground");
                int i5 = iM10143e14;
                ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
                while (cursorM10145b.moveToNext()) {
                    String string = cursorM10145b.getString(iM10143e9);
                    int i6 = iM10143e9;
                    String string2 = cursorM10145b.getString(iM10143e11);
                    int i7 = iM10143e11;
                    C3434c c3434c = new C3434c();
                    int i8 = iM10143e;
                    c3434c.m10472k(C2526x.m8489e(cursorM10145b.getInt(iM10143e)));
                    c3434c.m10474m(cursorM10145b.getInt(iM10143e2) != 0);
                    c3434c.m10475n(cursorM10145b.getInt(iM10143e3) != 0);
                    c3434c.m10473l(cursorM10145b.getInt(iM10143e4) != 0);
                    c3434c.m10476o(cursorM10145b.getInt(iM10143e5) != 0);
                    int i9 = iM10143e2;
                    int i10 = iM10143e3;
                    c3434c.m10477p(cursorM10145b.getLong(iM10143e6));
                    c3434c.m10478q(cursorM10145b.getLong(iM10143e7));
                    c3434c.m10471j(C2526x.m8486b(cursorM10145b.getBlob(iM10143e8)));
                    C2520r c2520r = new C2520r(string, string2);
                    c2520r.f10166b = C2526x.m8490f(cursorM10145b.getInt(iM10143e10));
                    c2520r.f10168d = cursorM10145b.getString(iM10143e12);
                    c2520r.f10169e = C0810a.m4148g(cursorM10145b.getBlob(iM10143e13));
                    int i11 = i5;
                    c2520r.f10170f = C0810a.m4148g(cursorM10145b.getBlob(i11));
                    i5 = i11;
                    int i12 = iM10143e15;
                    c2520r.f10171g = cursorM10145b.getLong(i12);
                    int i13 = iM10143e12;
                    int i14 = iM10143e16;
                    c2520r.f10172h = cursorM10145b.getLong(i14);
                    int i15 = iM10143e4;
                    int i16 = iM10143e17;
                    c2520r.f10173i = cursorM10145b.getLong(i16);
                    int i17 = iM10143e18;
                    c2520r.f10175k = cursorM10145b.getInt(i17);
                    int i18 = iM10143e19;
                    c2520r.f10176l = C2526x.m8488d(cursorM10145b.getInt(i18));
                    iM10143e17 = i16;
                    int i19 = iM10143e20;
                    c2520r.f10177m = cursorM10145b.getLong(i19);
                    int i20 = iM10143e21;
                    c2520r.f10178n = cursorM10145b.getLong(i20);
                    iM10143e21 = i20;
                    int i21 = iM10143e22;
                    c2520r.f10179o = cursorM10145b.getLong(i21);
                    int i22 = iM10143e23;
                    c2520r.f10180p = cursorM10145b.getLong(i22);
                    int i23 = iM10143e24;
                    c2520r.f10181q = cursorM10145b.getInt(i23) != 0;
                    c2520r.f10174j = c3434c;
                    arrayList.add(c2520r);
                    iM10143e23 = i22;
                    iM10143e24 = i23;
                    iM10143e2 = i9;
                    iM10143e12 = i13;
                    iM10143e15 = i12;
                    iM10143e16 = i14;
                    iM10143e18 = i17;
                    iM10143e9 = i6;
                    iM10143e11 = i7;
                    iM10143e = i8;
                    iM10143e22 = i21;
                    iM10143e3 = i10;
                    iM10143e20 = i19;
                    iM10143e4 = i15;
                    iM10143e19 = i18;
                }
                cursorM10145b.close();
                c2994k.m10091o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM10145b.close();
                c2994k.m10091o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2994k = c2994kM10086d;
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: k */
    public C2520r mo8463k(String str) throws Throwable {
        C2994k c2994k;
        C2520r c2520r;
        C2994k c2994kM10086d = C2994k.m10086d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            int iM10143e = C3020b.m10143e(cursorM10145b, "required_network_type");
            int iM10143e2 = C3020b.m10143e(cursorM10145b, "requires_charging");
            int iM10143e3 = C3020b.m10143e(cursorM10145b, "requires_device_idle");
            int iM10143e4 = C3020b.m10143e(cursorM10145b, "requires_battery_not_low");
            int iM10143e5 = C3020b.m10143e(cursorM10145b, "requires_storage_not_low");
            int iM10143e6 = C3020b.m10143e(cursorM10145b, "trigger_content_update_delay");
            int iM10143e7 = C3020b.m10143e(cursorM10145b, "trigger_max_content_delay");
            int iM10143e8 = C3020b.m10143e(cursorM10145b, "content_uri_triggers");
            int iM10143e9 = C3020b.m10143e(cursorM10145b, "id");
            int iM10143e10 = C3020b.m10143e(cursorM10145b, "state");
            int iM10143e11 = C3020b.m10143e(cursorM10145b, "worker_class_name");
            int iM10143e12 = C3020b.m10143e(cursorM10145b, "input_merger_class_name");
            int iM10143e13 = C3020b.m10143e(cursorM10145b, "input");
            int iM10143e14 = C3020b.m10143e(cursorM10145b, "output");
            c2994k = c2994kM10086d;
            try {
                int iM10143e15 = C3020b.m10143e(cursorM10145b, "initial_delay");
                int iM10143e16 = C3020b.m10143e(cursorM10145b, "interval_duration");
                int iM10143e17 = C3020b.m10143e(cursorM10145b, "flex_duration");
                int iM10143e18 = C3020b.m10143e(cursorM10145b, "run_attempt_count");
                int iM10143e19 = C3020b.m10143e(cursorM10145b, "backoff_policy");
                int iM10143e20 = C3020b.m10143e(cursorM10145b, "backoff_delay_duration");
                int iM10143e21 = C3020b.m10143e(cursorM10145b, "period_start_time");
                int iM10143e22 = C3020b.m10143e(cursorM10145b, "minimum_retention_duration");
                int iM10143e23 = C3020b.m10143e(cursorM10145b, "schedule_requested_at");
                int iM10143e24 = C3020b.m10143e(cursorM10145b, "run_in_foreground");
                if (cursorM10145b.moveToFirst()) {
                    String string = cursorM10145b.getString(iM10143e9);
                    String string2 = cursorM10145b.getString(iM10143e11);
                    C3434c c3434c = new C3434c();
                    c3434c.m10472k(C2526x.m8489e(cursorM10145b.getInt(iM10143e)));
                    c3434c.m10474m(cursorM10145b.getInt(iM10143e2) != 0);
                    c3434c.m10475n(cursorM10145b.getInt(iM10143e3) != 0);
                    c3434c.m10473l(cursorM10145b.getInt(iM10143e4) != 0);
                    c3434c.m10476o(cursorM10145b.getInt(iM10143e5) != 0);
                    c3434c.m10477p(cursorM10145b.getLong(iM10143e6));
                    c3434c.m10478q(cursorM10145b.getLong(iM10143e7));
                    c3434c.m10471j(C2526x.m8486b(cursorM10145b.getBlob(iM10143e8)));
                    C2520r c2520r2 = new C2520r(string, string2);
                    c2520r2.f10166b = C2526x.m8490f(cursorM10145b.getInt(iM10143e10));
                    c2520r2.f10168d = cursorM10145b.getString(iM10143e12);
                    c2520r2.f10169e = C0810a.m4148g(cursorM10145b.getBlob(iM10143e13));
                    c2520r2.f10170f = C0810a.m4148g(cursorM10145b.getBlob(iM10143e14));
                    c2520r2.f10171g = cursorM10145b.getLong(iM10143e15);
                    c2520r2.f10172h = cursorM10145b.getLong(iM10143e16);
                    c2520r2.f10173i = cursorM10145b.getLong(iM10143e17);
                    c2520r2.f10175k = cursorM10145b.getInt(iM10143e18);
                    c2520r2.f10176l = C2526x.m8488d(cursorM10145b.getInt(iM10143e19));
                    c2520r2.f10177m = cursorM10145b.getLong(iM10143e20);
                    c2520r2.f10178n = cursorM10145b.getLong(iM10143e21);
                    c2520r2.f10179o = cursorM10145b.getLong(iM10143e22);
                    c2520r2.f10180p = cursorM10145b.getLong(iM10143e23);
                    c2520r2.f10181q = cursorM10145b.getInt(iM10143e24) != 0;
                    c2520r2.f10174j = c3434c;
                    c2520r = c2520r2;
                } else {
                    c2520r = null;
                }
                cursorM10145b.close();
                c2994k.m10091o();
                return c2520r;
            } catch (Throwable th) {
                th = th;
                cursorM10145b.close();
                c2994k.m10091o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2994k = c2994kM10086d;
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: l */
    public int mo8464l(String str) {
        this.f10190a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10196g.m10094a();
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(1);
        } else {
            interfaceC3375fM10094a.mo3488c(1, str);
        }
        this.f10190a.m3542e();
        try {
            int iMo3521i = interfaceC3375fM10094a.mo3521i();
            this.f10190a.m3539A();
            return iMo3521i;
        } finally {
            this.f10190a.m3546i();
            this.f10196g.m10096f(interfaceC3375fM10094a);
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: m */
    public void mo8465m(C2520r c2520r) {
        this.f10190a.m3541d();
        this.f10190a.m3542e();
        try {
            this.f10191b.m10083h(c2520r);
            this.f10190a.m3539A();
        } finally {
            this.f10190a.m3546i();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: n */
    public LiveData<List<C2520r.c>> mo8466n(List<String> list) {
        StringBuilder sbM10151b = C3024f.m10151b();
        sbM10151b.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        C3024f.m10150a(sbM10151b, size);
        sbM10151b.append(")");
        C2994k c2994kM10086d = C2994k.m10086d(sbM10151b.toString(), size + 0);
        int i4 = 1;
        for (String str : list) {
            if (str == null) {
                c2994kM10086d.mo3489k(i4);
            } else {
                c2994kM10086d.mo3488c(i4, str);
            }
            i4++;
        }
        return this.f10190a.m3548k().m3618e(new String[]{"WorkTag", "WorkProgress", "workspec"}, true, new a(c2994kM10086d));
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: o */
    public List<String> mo8467o(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                arrayList.add(cursorM10145b.getString(0));
            }
            return arrayList;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: p */
    public List<C0810a> mo8468p(String str) {
        C2994k c2994kM10086d = C2994k.m10086d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            c2994kM10086d.mo3489k(1);
        } else {
            c2994kM10086d.mo3488c(1, str);
        }
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                arrayList.add(C0810a.m4148g(cursorM10145b.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorM10145b.close();
            c2994kM10086d.m10091o();
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: q */
    public int mo8469q(String str) {
        this.f10190a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10195f.m10094a();
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(1);
        } else {
            interfaceC3375fM10094a.mo3488c(1, str);
        }
        this.f10190a.m3542e();
        try {
            int iMo3521i = interfaceC3375fM10094a.mo3521i();
            this.f10190a.m3539A();
            return iMo3521i;
        } finally {
            this.f10190a.m3546i();
            this.f10195f.m10096f(interfaceC3375fM10094a);
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: r */
    public void mo8470r(String str, long j4) {
        this.f10190a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10194e.m10094a();
        interfaceC3375fM10094a.mo3491w(1, j4);
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(2);
        } else {
            interfaceC3375fM10094a.mo3488c(2, str);
        }
        this.f10190a.m3542e();
        try {
            interfaceC3375fM10094a.mo3521i();
            this.f10190a.m3539A();
        } finally {
            this.f10190a.m3546i();
            this.f10194e.m10096f(interfaceC3375fM10094a);
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: s */
    public List<C2520r> mo8471s() throws Throwable {
        C2994k c2994k;
        int iM10143e;
        int iM10143e2;
        int iM10143e3;
        int iM10143e4;
        int iM10143e5;
        int iM10143e6;
        int iM10143e7;
        int iM10143e8;
        int iM10143e9;
        int iM10143e10;
        int iM10143e11;
        int iM10143e12;
        int iM10143e13;
        int iM10143e14;
        C2994k c2994kM10086d = C2994k.m10086d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            iM10143e = C3020b.m10143e(cursorM10145b, "required_network_type");
            iM10143e2 = C3020b.m10143e(cursorM10145b, "requires_charging");
            iM10143e3 = C3020b.m10143e(cursorM10145b, "requires_device_idle");
            iM10143e4 = C3020b.m10143e(cursorM10145b, "requires_battery_not_low");
            iM10143e5 = C3020b.m10143e(cursorM10145b, "requires_storage_not_low");
            iM10143e6 = C3020b.m10143e(cursorM10145b, "trigger_content_update_delay");
            iM10143e7 = C3020b.m10143e(cursorM10145b, "trigger_max_content_delay");
            iM10143e8 = C3020b.m10143e(cursorM10145b, "content_uri_triggers");
            iM10143e9 = C3020b.m10143e(cursorM10145b, "id");
            iM10143e10 = C3020b.m10143e(cursorM10145b, "state");
            iM10143e11 = C3020b.m10143e(cursorM10145b, "worker_class_name");
            iM10143e12 = C3020b.m10143e(cursorM10145b, "input_merger_class_name");
            iM10143e13 = C3020b.m10143e(cursorM10145b, "input");
            iM10143e14 = C3020b.m10143e(cursorM10145b, "output");
            c2994k = c2994kM10086d;
        } catch (Throwable th) {
            th = th;
            c2994k = c2994kM10086d;
        }
        try {
            int iM10143e15 = C3020b.m10143e(cursorM10145b, "initial_delay");
            int iM10143e16 = C3020b.m10143e(cursorM10145b, "interval_duration");
            int iM10143e17 = C3020b.m10143e(cursorM10145b, "flex_duration");
            int iM10143e18 = C3020b.m10143e(cursorM10145b, "run_attempt_count");
            int iM10143e19 = C3020b.m10143e(cursorM10145b, "backoff_policy");
            int iM10143e20 = C3020b.m10143e(cursorM10145b, "backoff_delay_duration");
            int iM10143e21 = C3020b.m10143e(cursorM10145b, "period_start_time");
            int iM10143e22 = C3020b.m10143e(cursorM10145b, "minimum_retention_duration");
            int iM10143e23 = C3020b.m10143e(cursorM10145b, "schedule_requested_at");
            int iM10143e24 = C3020b.m10143e(cursorM10145b, "run_in_foreground");
            int i4 = iM10143e14;
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                String string = cursorM10145b.getString(iM10143e9);
                int i5 = iM10143e9;
                String string2 = cursorM10145b.getString(iM10143e11);
                int i6 = iM10143e11;
                C3434c c3434c = new C3434c();
                int i7 = iM10143e;
                c3434c.m10472k(C2526x.m8489e(cursorM10145b.getInt(iM10143e)));
                c3434c.m10474m(cursorM10145b.getInt(iM10143e2) != 0);
                c3434c.m10475n(cursorM10145b.getInt(iM10143e3) != 0);
                c3434c.m10473l(cursorM10145b.getInt(iM10143e4) != 0);
                c3434c.m10476o(cursorM10145b.getInt(iM10143e5) != 0);
                int i8 = iM10143e2;
                int i9 = iM10143e3;
                c3434c.m10477p(cursorM10145b.getLong(iM10143e6));
                c3434c.m10478q(cursorM10145b.getLong(iM10143e7));
                c3434c.m10471j(C2526x.m8486b(cursorM10145b.getBlob(iM10143e8)));
                C2520r c2520r = new C2520r(string, string2);
                c2520r.f10166b = C2526x.m8490f(cursorM10145b.getInt(iM10143e10));
                c2520r.f10168d = cursorM10145b.getString(iM10143e12);
                c2520r.f10169e = C0810a.m4148g(cursorM10145b.getBlob(iM10143e13));
                int i10 = i4;
                c2520r.f10170f = C0810a.m4148g(cursorM10145b.getBlob(i10));
                i4 = i10;
                int i11 = iM10143e15;
                c2520r.f10171g = cursorM10145b.getLong(i11);
                int i12 = iM10143e13;
                int i13 = iM10143e16;
                c2520r.f10172h = cursorM10145b.getLong(i13);
                int i14 = iM10143e4;
                int i15 = iM10143e17;
                c2520r.f10173i = cursorM10145b.getLong(i15);
                int i16 = iM10143e18;
                c2520r.f10175k = cursorM10145b.getInt(i16);
                int i17 = iM10143e19;
                c2520r.f10176l = C2526x.m8488d(cursorM10145b.getInt(i17));
                iM10143e17 = i15;
                int i18 = iM10143e20;
                c2520r.f10177m = cursorM10145b.getLong(i18);
                int i19 = iM10143e21;
                c2520r.f10178n = cursorM10145b.getLong(i19);
                iM10143e21 = i19;
                int i20 = iM10143e22;
                c2520r.f10179o = cursorM10145b.getLong(i20);
                int i21 = iM10143e23;
                c2520r.f10180p = cursorM10145b.getLong(i21);
                int i22 = iM10143e24;
                c2520r.f10181q = cursorM10145b.getInt(i22) != 0;
                c2520r.f10174j = c3434c;
                arrayList.add(c2520r);
                iM10143e23 = i21;
                iM10143e24 = i22;
                iM10143e2 = i8;
                iM10143e13 = i12;
                iM10143e15 = i11;
                iM10143e16 = i13;
                iM10143e18 = i16;
                iM10143e9 = i5;
                iM10143e11 = i6;
                iM10143e = i7;
                iM10143e22 = i20;
                iM10143e3 = i9;
                iM10143e20 = i18;
                iM10143e4 = i14;
                iM10143e19 = i17;
            }
            cursorM10145b.close();
            c2994k.m10091o();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            cursorM10145b.close();
            c2994k.m10091o();
            throw th;
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: t */
    public List<C2520r> mo8472t(int i4) throws Throwable {
        C2994k c2994k;
        C2994k c2994kM10086d = C2994k.m10086d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        c2994kM10086d.mo3491w(1, i4);
        this.f10190a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10190a, c2994kM10086d, false, null);
        try {
            int iM10143e = C3020b.m10143e(cursorM10145b, "required_network_type");
            int iM10143e2 = C3020b.m10143e(cursorM10145b, "requires_charging");
            int iM10143e3 = C3020b.m10143e(cursorM10145b, "requires_device_idle");
            int iM10143e4 = C3020b.m10143e(cursorM10145b, "requires_battery_not_low");
            int iM10143e5 = C3020b.m10143e(cursorM10145b, "requires_storage_not_low");
            int iM10143e6 = C3020b.m10143e(cursorM10145b, "trigger_content_update_delay");
            int iM10143e7 = C3020b.m10143e(cursorM10145b, "trigger_max_content_delay");
            int iM10143e8 = C3020b.m10143e(cursorM10145b, "content_uri_triggers");
            int iM10143e9 = C3020b.m10143e(cursorM10145b, "id");
            int iM10143e10 = C3020b.m10143e(cursorM10145b, "state");
            int iM10143e11 = C3020b.m10143e(cursorM10145b, "worker_class_name");
            int iM10143e12 = C3020b.m10143e(cursorM10145b, "input_merger_class_name");
            int iM10143e13 = C3020b.m10143e(cursorM10145b, "input");
            int iM10143e14 = C3020b.m10143e(cursorM10145b, "output");
            c2994k = c2994kM10086d;
            try {
                int iM10143e15 = C3020b.m10143e(cursorM10145b, "initial_delay");
                int iM10143e16 = C3020b.m10143e(cursorM10145b, "interval_duration");
                int iM10143e17 = C3020b.m10143e(cursorM10145b, "flex_duration");
                int iM10143e18 = C3020b.m10143e(cursorM10145b, "run_attempt_count");
                int iM10143e19 = C3020b.m10143e(cursorM10145b, "backoff_policy");
                int iM10143e20 = C3020b.m10143e(cursorM10145b, "backoff_delay_duration");
                int iM10143e21 = C3020b.m10143e(cursorM10145b, "period_start_time");
                int iM10143e22 = C3020b.m10143e(cursorM10145b, "minimum_retention_duration");
                int iM10143e23 = C3020b.m10143e(cursorM10145b, "schedule_requested_at");
                int iM10143e24 = C3020b.m10143e(cursorM10145b, "run_in_foreground");
                int i5 = iM10143e14;
                ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
                while (cursorM10145b.moveToNext()) {
                    String string = cursorM10145b.getString(iM10143e9);
                    int i6 = iM10143e9;
                    String string2 = cursorM10145b.getString(iM10143e11);
                    int i7 = iM10143e11;
                    C3434c c3434c = new C3434c();
                    int i8 = iM10143e;
                    c3434c.m10472k(C2526x.m8489e(cursorM10145b.getInt(iM10143e)));
                    c3434c.m10474m(cursorM10145b.getInt(iM10143e2) != 0);
                    c3434c.m10475n(cursorM10145b.getInt(iM10143e3) != 0);
                    c3434c.m10473l(cursorM10145b.getInt(iM10143e4) != 0);
                    c3434c.m10476o(cursorM10145b.getInt(iM10143e5) != 0);
                    int i9 = iM10143e2;
                    int i10 = iM10143e3;
                    c3434c.m10477p(cursorM10145b.getLong(iM10143e6));
                    c3434c.m10478q(cursorM10145b.getLong(iM10143e7));
                    c3434c.m10471j(C2526x.m8486b(cursorM10145b.getBlob(iM10143e8)));
                    C2520r c2520r = new C2520r(string, string2);
                    c2520r.f10166b = C2526x.m8490f(cursorM10145b.getInt(iM10143e10));
                    c2520r.f10168d = cursorM10145b.getString(iM10143e12);
                    c2520r.f10169e = C0810a.m4148g(cursorM10145b.getBlob(iM10143e13));
                    int i11 = i5;
                    c2520r.f10170f = C0810a.m4148g(cursorM10145b.getBlob(i11));
                    i5 = i11;
                    int i12 = iM10143e15;
                    c2520r.f10171g = cursorM10145b.getLong(i12);
                    int i13 = iM10143e12;
                    int i14 = iM10143e16;
                    c2520r.f10172h = cursorM10145b.getLong(i14);
                    int i15 = iM10143e4;
                    int i16 = iM10143e17;
                    c2520r.f10173i = cursorM10145b.getLong(i16);
                    int i17 = iM10143e18;
                    c2520r.f10175k = cursorM10145b.getInt(i17);
                    int i18 = iM10143e19;
                    c2520r.f10176l = C2526x.m8488d(cursorM10145b.getInt(i18));
                    iM10143e17 = i16;
                    int i19 = iM10143e20;
                    c2520r.f10177m = cursorM10145b.getLong(i19);
                    int i20 = iM10143e21;
                    c2520r.f10178n = cursorM10145b.getLong(i20);
                    iM10143e21 = i20;
                    int i21 = iM10143e22;
                    c2520r.f10179o = cursorM10145b.getLong(i21);
                    int i22 = iM10143e23;
                    c2520r.f10180p = cursorM10145b.getLong(i22);
                    int i23 = iM10143e24;
                    c2520r.f10181q = cursorM10145b.getInt(i23) != 0;
                    c2520r.f10174j = c3434c;
                    arrayList.add(c2520r);
                    iM10143e23 = i22;
                    iM10143e24 = i23;
                    iM10143e2 = i9;
                    iM10143e12 = i13;
                    iM10143e15 = i12;
                    iM10143e16 = i14;
                    iM10143e18 = i17;
                    iM10143e9 = i6;
                    iM10143e11 = i7;
                    iM10143e = i8;
                    iM10143e22 = i21;
                    iM10143e3 = i10;
                    iM10143e20 = i19;
                    iM10143e4 = i15;
                    iM10143e19 = i18;
                }
                cursorM10145b.close();
                c2994k.m10091o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM10145b.close();
                c2994k.m10091o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c2994k = c2994kM10086d;
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: u */
    public void mo8473u(String str, C0810a c0810a) throws Throwable {
        this.f10190a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10193d.m10094a();
        byte[] bArrM4149m = C0810a.m4149m(c0810a);
        if (bArrM4149m == null) {
            interfaceC3375fM10094a.mo3489k(1);
        } else {
            interfaceC3375fM10094a.mo3486C(1, bArrM4149m);
        }
        if (str == null) {
            interfaceC3375fM10094a.mo3489k(2);
        } else {
            interfaceC3375fM10094a.mo3488c(2, str);
        }
        this.f10190a.m3542e();
        try {
            interfaceC3375fM10094a.mo3521i();
            this.f10190a.m3539A();
        } finally {
            this.f10190a.m3546i();
            this.f10193d.m10096f(interfaceC3375fM10094a);
        }
    }

    @Override // p085f1.InterfaceC2521s
    /* renamed from: v */
    public int mo8474v() {
        this.f10190a.m3541d();
        InterfaceC3375f interfaceC3375fM10094a = this.f10198i.m10094a();
        this.f10190a.m3542e();
        try {
            int iMo3521i = interfaceC3375fM10094a.mo3521i();
            this.f10190a.m3539A();
            return iMo3521i;
        } finally {
            this.f10190a.m3546i();
            this.f10198i.m10096f(interfaceC3375fM10094a);
        }
    }
}
