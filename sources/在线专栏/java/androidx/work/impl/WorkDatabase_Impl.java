package androidx.work.impl;

import android.database.SQLException;
import androidx.room.AbstractC0621h0;
import androidx.room.C0622i;
import androidx.room.C0623i0;
import androidx.room.C0633o;
import com.zykj.download.OssUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p085f1.C2505c;
import p085f1.C2508f;
import p085f1.C2510h;
import p085f1.C2513k;
import p085f1.C2516n;
import p085f1.C2519q;
import p085f1.C2522t;
import p085f1.C2525w;
import p085f1.InterfaceC2504b;
import p085f1.InterfaceC2507e;
import p085f1.InterfaceC2509g;
import p085f1.InterfaceC2512j;
import p085f1.InterfaceC2515m;
import p085f1.InterfaceC2518p;
import p085f1.InterfaceC2521s;
import p085f1.InterfaceC2524v;
import p144r0.C3021c;
import p144r0.C3025g;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: o */
    private volatile InterfaceC2521s f4758o;

    /* renamed from: p */
    private volatile InterfaceC2504b f4759p;

    /* renamed from: q */
    private volatile InterfaceC2524v f4760q;

    /* renamed from: r */
    private volatile InterfaceC2512j f4761r;

    /* renamed from: s */
    private volatile InterfaceC2515m f4762s;

    /* renamed from: t */
    private volatile InterfaceC2518p f4763t;

    /* renamed from: u */
    private volatile InterfaceC2507e f4764u;

    /* renamed from: v */
    private volatile InterfaceC2509g f4765v;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    class C0813a extends C0623i0.a {
        C0813a(int i4) {
            super(i4);
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: a */
        public void mo3587a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC3371b.mo3508h("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            interfaceC3371b.mo3508h("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            interfaceC3371b.mo3508h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            interfaceC3371b.mo3508h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC3371b.mo3508h("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC3371b.mo3508h("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC3371b.mo3508h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: b */
        public void mo3588b(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `Dependency`");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `WorkSpec`");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `WorkTag`");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `SystemIdInfo`");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `WorkName`");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `WorkProgress`");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `Preference`");
            if (((AbstractC0621h0) WorkDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) WorkDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) WorkDatabase_Impl.this).f3963h.get(i4)).m3567b(interfaceC3371b);
                }
            }
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: c */
        protected void mo3589c(InterfaceC3371b interfaceC3371b) {
            if (((AbstractC0621h0) WorkDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) WorkDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) WorkDatabase_Impl.this).f3963h.get(i4)).m3566a(interfaceC3371b);
                }
            }
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: d */
        public void mo3590d(InterfaceC3371b interfaceC3371b) throws SQLException {
            ((AbstractC0621h0) WorkDatabase_Impl.this).f3956a = interfaceC3371b;
            interfaceC3371b.mo3508h("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m3555t(interfaceC3371b);
            if (((AbstractC0621h0) WorkDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) WorkDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) WorkDatabase_Impl.this).f3963h.get(i4)).mo3568c(interfaceC3371b);
                }
            }
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: e */
        public void mo3591e(InterfaceC3371b interfaceC3371b) {
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: f */
        public void mo3592f(InterfaceC3371b interfaceC3371b) throws SQLException {
            C3021c.m10144a(interfaceC3371b);
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: g */
        protected C0623i0.b mo3593g(InterfaceC3371b interfaceC3371b) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new C3025g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new C3025g.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C3025g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new C3025g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C3025g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new C3025g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            C3025g c3025g = new C3025g("Dependency", map, hashSet, hashSet2);
            C3025g c3025gM10152a = C3025g.m10152a(interfaceC3371b, "Dependency");
            if (!c3025g.equals(c3025gM10152a)) {
                return new C0623i0.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c3025g + "\n Found:\n" + c3025gM10152a);
            }
            HashMap map2 = new HashMap(24);
            map2.put("id", new C3025g.a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new C3025g.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new C3025g.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new C3025g.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new C3025g.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new C3025g.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new C3025g.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new C3025g.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new C3025g.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new C3025g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new C3025g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new C3025g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new C3025g.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new C3025g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new C3025g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new C3025g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new C3025g.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new C3025g.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new C3025g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new C3025g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new C3025g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new C3025g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new C3025g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new C3025g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C3025g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new C3025g.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            C3025g c3025g2 = new C3025g("WorkSpec", map2, hashSet3, hashSet4);
            C3025g c3025gM10152a2 = C3025g.m10152a(interfaceC3371b, "WorkSpec");
            if (!c3025g2.equals(c3025gM10152a2)) {
                return new C0623i0.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c3025g2 + "\n Found:\n" + c3025gM10152a2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new C3025g.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new C3025g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C3025g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C3025g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            C3025g c3025g3 = new C3025g("WorkTag", map3, hashSet5, hashSet6);
            C3025g c3025gM10152a3 = C3025g.m10152a(interfaceC3371b, "WorkTag");
            if (!c3025g3.equals(c3025gM10152a3)) {
                return new C0623i0.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c3025g3 + "\n Found:\n" + c3025gM10152a3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new C3025g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new C3025g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C3025g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C3025g c3025g4 = new C3025g("SystemIdInfo", map4, hashSet7, new HashSet(0));
            C3025g c3025gM10152a4 = C3025g.m10152a(interfaceC3371b, "SystemIdInfo");
            if (!c3025g4.equals(c3025gM10152a4)) {
                return new C0623i0.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c3025g4 + "\n Found:\n" + c3025gM10152a4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new C3025g.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new C3025g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C3025g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C3025g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            C3025g c3025g5 = new C3025g("WorkName", map5, hashSet8, hashSet9);
            C3025g c3025gM10152a5 = C3025g.m10152a(interfaceC3371b, "WorkName");
            if (!c3025g5.equals(c3025gM10152a5)) {
                return new C0623i0.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c3025g5 + "\n Found:\n" + c3025gM10152a5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new C3025g.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put(OssUtils.PROGRESS, new C3025g.a(OssUtils.PROGRESS, "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C3025g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            C3025g c3025g6 = new C3025g("WorkProgress", map6, hashSet10, new HashSet(0));
            C3025g c3025gM10152a6 = C3025g.m10152a(interfaceC3371b, "WorkProgress");
            if (!c3025g6.equals(c3025gM10152a6)) {
                return new C0623i0.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c3025g6 + "\n Found:\n" + c3025gM10152a6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new C3025g.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new C3025g.a("long_value", "INTEGER", false, 0, null, 1));
            C3025g c3025g7 = new C3025g("Preference", map7, new HashSet(0), new HashSet(0));
            C3025g c3025gM10152a7 = C3025g.m10152a(interfaceC3371b, "Preference");
            if (c3025g7.equals(c3025gM10152a7)) {
                return new C0623i0.b(true, null);
            }
            return new C0623i0.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c3025g7 + "\n Found:\n" + c3025gM10152a7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: D */
    public InterfaceC2504b mo4165D() {
        InterfaceC2504b interfaceC2504b;
        if (this.f4759p != null) {
            return this.f4759p;
        }
        synchronized (this) {
            if (this.f4759p == null) {
                this.f4759p = new C2505c(this);
            }
            interfaceC2504b = this.f4759p;
        }
        return interfaceC2504b;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: H */
    public InterfaceC2507e mo4166H() {
        InterfaceC2507e interfaceC2507e;
        if (this.f4764u != null) {
            return this.f4764u;
        }
        synchronized (this) {
            if (this.f4764u == null) {
                this.f4764u = new C2508f(this);
            }
            interfaceC2507e = this.f4764u;
        }
        return interfaceC2507e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: I */
    public InterfaceC2509g mo4167I() {
        InterfaceC2509g interfaceC2509g;
        if (this.f4765v != null) {
            return this.f4765v;
        }
        synchronized (this) {
            if (this.f4765v == null) {
                this.f4765v = new C2510h(this);
            }
            interfaceC2509g = this.f4765v;
        }
        return interfaceC2509g;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: J */
    public InterfaceC2512j mo4168J() {
        InterfaceC2512j interfaceC2512j;
        if (this.f4761r != null) {
            return this.f4761r;
        }
        synchronized (this) {
            if (this.f4761r == null) {
                this.f4761r = new C2513k(this);
            }
            interfaceC2512j = this.f4761r;
        }
        return interfaceC2512j;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: K */
    public InterfaceC2515m mo4169K() {
        InterfaceC2515m interfaceC2515m;
        if (this.f4762s != null) {
            return this.f4762s;
        }
        synchronized (this) {
            if (this.f4762s == null) {
                this.f4762s = new C2516n(this);
            }
            interfaceC2515m = this.f4762s;
        }
        return interfaceC2515m;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: L */
    public InterfaceC2518p mo4170L() {
        InterfaceC2518p interfaceC2518p;
        if (this.f4763t != null) {
            return this.f4763t;
        }
        synchronized (this) {
            if (this.f4763t == null) {
                this.f4763t = new C2519q(this);
            }
            interfaceC2518p = this.f4763t;
        }
        return interfaceC2518p;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: M */
    public InterfaceC2521s mo4171M() {
        InterfaceC2521s interfaceC2521s;
        if (this.f4758o != null) {
            return this.f4758o;
        }
        synchronized (this) {
            if (this.f4758o == null) {
                this.f4758o = new C2522t(this);
            }
            interfaceC2521s = this.f4758o;
        }
        return interfaceC2521s;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: N */
    public InterfaceC2524v mo4172N() {
        InterfaceC2524v interfaceC2524v;
        if (this.f4760q != null) {
            return this.f4760q;
        }
        synchronized (this) {
            if (this.f4760q == null) {
                this.f4760q = new C2525w(this);
            }
            interfaceC2524v = this.f4760q;
        }
        return interfaceC2524v;
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: g */
    protected C0633o mo3544g() {
        return new C0633o(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: h */
    protected InterfaceC3372c mo3545h(C0622i c0622i) {
        return c0622i.f3997a.mo3484a(InterfaceC3372c.b.m10261a(c0622i.f3998b).m10264c(c0622i.f3999c).m10263b(new C0623i0(c0622i, new C0813a(11), "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e")).m10262a());
    }
}
