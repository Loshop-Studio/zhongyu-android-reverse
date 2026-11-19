package androidx.work.impl;

import android.content.Context;
import android.database.SQLException;
import android.os.Build;
import p090g1.C2631c;
import p090g1.C2634f;
import p140q0.AbstractC3006a;
import p149s0.InterfaceC3371b;

/* renamed from: androidx.work.impl.a */
/* loaded from: classes.dex */
public class C0814a {

    /* renamed from: a */
    public static AbstractC3006a f4767a = new a(1, 2);

    /* renamed from: b */
    public static AbstractC3006a f4768b = new b(3, 4);

    /* renamed from: c */
    public static AbstractC3006a f4769c = new c(4, 5);

    /* renamed from: d */
    public static AbstractC3006a f4770d = new d(6, 7);

    /* renamed from: e */
    public static AbstractC3006a f4771e = new e(7, 8);

    /* renamed from: f */
    public static AbstractC3006a f4772f = new f(8, 9);

    /* renamed from: androidx.work.impl.a$a */
    class a extends AbstractC3006a {
        a(int i4, int i5) {
            super(i4, i5);
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            interfaceC3371b.mo3508h("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS alarmInfo");
            interfaceC3371b.mo3508h("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    class b extends AbstractC3006a {
        b(int i4, int i5) {
            super(i4, i5);
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            if (Build.VERSION.SDK_INT >= 23) {
                interfaceC3371b.mo3508h("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    class c extends AbstractC3006a {
        c(int i4, int i5) {
            super(i4, i5);
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            interfaceC3371b.mo3508h("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    class d extends AbstractC3006a {
        d(int i4, int i5) {
            super(i4, i5);
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    class e extends AbstractC3006a {
        e(int i4, int i5) {
            super(i4, i5);
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    class f extends AbstractC3006a {
        f(int i4, int i5) {
            super(i4, i5);
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    public static class g extends AbstractC3006a {

        /* renamed from: c */
        final Context f4773c;

        public g(Context context, int i4, int i5) {
            super(i4, i5);
            this.f4773c = context;
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            if (this.f11668b >= 10) {
                interfaceC3371b.mo3514z("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f4773c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    public static class h extends AbstractC3006a {

        /* renamed from: c */
        final Context f4774c;

        public h(Context context) {
            super(9, 10);
            this.f4774c = context;
        }

        @Override // p140q0.AbstractC3006a
        /* renamed from: a */
        public void mo4184a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            C2634f.m8835b(this.f4774c, interfaceC3371b);
            C2631c.m8828a(this.f4774c, interfaceC3371b);
        }
    }
}
