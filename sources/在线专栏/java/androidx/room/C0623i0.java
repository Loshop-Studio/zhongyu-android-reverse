package androidx.room;

import android.database.Cursor;
import android.database.SQLException;
import java.util.Iterator;
import java.util.List;
import p136p0.C2993j;
import p140q0.AbstractC3006a;
import p149s0.C3370a;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;

/* renamed from: androidx.room.i0 */
/* loaded from: classes.dex */
public class C0623i0 extends InterfaceC3372c.a {

    /* renamed from: b */
    private C0622i f4014b;

    /* renamed from: c */
    private final a f4015c;

    /* renamed from: d */
    private final String f4016d;

    /* renamed from: e */
    private final String f4017e;

    /* renamed from: androidx.room.i0$a */
    public static abstract class a {

        /* renamed from: a */
        public final int f4018a;

        public a(int i4) {
            this.f4018a = i4;
        }

        /* renamed from: a */
        protected abstract void mo3587a(InterfaceC3371b interfaceC3371b);

        /* renamed from: b */
        protected abstract void mo3588b(InterfaceC3371b interfaceC3371b);

        /* renamed from: c */
        protected abstract void mo3589c(InterfaceC3371b interfaceC3371b);

        /* renamed from: d */
        protected abstract void mo3590d(InterfaceC3371b interfaceC3371b);

        /* renamed from: e */
        protected abstract void mo3591e(InterfaceC3371b interfaceC3371b);

        /* renamed from: f */
        protected abstract void mo3592f(InterfaceC3371b interfaceC3371b);

        /* renamed from: g */
        protected abstract b mo3593g(InterfaceC3371b interfaceC3371b);
    }

    /* renamed from: androidx.room.i0$b */
    public static class b {

        /* renamed from: a */
        public final boolean f4019a;

        /* renamed from: b */
        public final String f4020b;

        public b(boolean z3, String str) {
            this.f4019a = z3;
            this.f4020b = str;
        }
    }

    public C0623i0(C0622i c0622i, a aVar, String str, String str2) {
        super(aVar.f4018a);
        this.f4014b = c0622i;
        this.f4015c = aVar;
        this.f4016d = str;
        this.f4017e = str2;
    }

    /* renamed from: h */
    private void m3577h(InterfaceC3371b interfaceC3371b) throws SQLException {
        if (!m3580k(interfaceC3371b)) {
            b bVarMo3593g = this.f4015c.mo3593g(interfaceC3371b);
            if (bVarMo3593g.f4019a) {
                this.f4015c.mo3591e(interfaceC3371b);
                m3581l(interfaceC3371b);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarMo3593g.f4020b);
            }
        }
        Cursor cursorMo3502D = interfaceC3371b.mo3502D(new C3370a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorMo3502D.moveToFirst() ? cursorMo3502D.getString(0) : null;
            cursorMo3502D.close();
            if (!this.f4016d.equals(string) && !this.f4017e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorMo3502D.close();
            throw th;
        }
    }

    /* renamed from: i */
    private void m3578i(InterfaceC3371b interfaceC3371b) throws SQLException {
        interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private static boolean m3579j(InterfaceC3371b interfaceC3371b) {
        Cursor cursorMo3504H = interfaceC3371b.mo3504H("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (cursorMo3504H.moveToFirst()) {
                if (cursorMo3504H.getInt(0) == 0) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            cursorMo3504H.close();
        }
    }

    /* renamed from: k */
    private static boolean m3580k(InterfaceC3371b interfaceC3371b) {
        Cursor cursorMo3504H = interfaceC3371b.mo3504H("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z3 = false;
            if (cursorMo3504H.moveToFirst()) {
                if (cursorMo3504H.getInt(0) != 0) {
                    z3 = true;
                }
            }
            return z3;
        } finally {
            cursorMo3504H.close();
        }
    }

    /* renamed from: l */
    private void m3581l(InterfaceC3371b interfaceC3371b) throws SQLException {
        m3578i(interfaceC3371b);
        interfaceC3371b.mo3508h(C2993j.m10085a(this.f4016d));
    }

    @Override // p149s0.InterfaceC3372c.a
    /* renamed from: b */
    public void mo3582b(InterfaceC3371b interfaceC3371b) {
        super.mo3582b(interfaceC3371b);
    }

    @Override // p149s0.InterfaceC3372c.a
    /* renamed from: d */
    public void mo3583d(InterfaceC3371b interfaceC3371b) throws SQLException {
        boolean zM3579j = m3579j(interfaceC3371b);
        this.f4015c.mo3587a(interfaceC3371b);
        if (!zM3579j) {
            b bVarMo3593g = this.f4015c.mo3593g(interfaceC3371b);
            if (!bVarMo3593g.f4019a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarMo3593g.f4020b);
            }
        }
        m3581l(interfaceC3371b);
        this.f4015c.mo3589c(interfaceC3371b);
    }

    @Override // p149s0.InterfaceC3372c.a
    /* renamed from: e */
    public void mo3584e(InterfaceC3371b interfaceC3371b, int i4, int i5) throws SQLException {
        mo3586g(interfaceC3371b, i4, i5);
    }

    @Override // p149s0.InterfaceC3372c.a
    /* renamed from: f */
    public void mo3585f(InterfaceC3371b interfaceC3371b) throws SQLException {
        super.mo3585f(interfaceC3371b);
        m3577h(interfaceC3371b);
        this.f4015c.mo3590d(interfaceC3371b);
        this.f4014b = null;
    }

    @Override // p149s0.InterfaceC3372c.a
    /* renamed from: g */
    public void mo3586g(InterfaceC3371b interfaceC3371b, int i4, int i5) throws SQLException {
        boolean z3;
        List<AbstractC3006a> listM3574c;
        C0622i c0622i = this.f4014b;
        if (c0622i == null || (listM3574c = c0622i.f4000d.m3574c(i4, i5)) == null) {
            z3 = false;
        } else {
            this.f4015c.mo3592f(interfaceC3371b);
            Iterator<AbstractC3006a> it = listM3574c.iterator();
            while (it.hasNext()) {
                it.next().mo4184a(interfaceC3371b);
            }
            b bVarMo3593g = this.f4015c.mo3593g(interfaceC3371b);
            if (!bVarMo3593g.f4019a) {
                throw new IllegalStateException("Migration didn't properly handle: " + bVarMo3593g.f4020b);
            }
            this.f4015c.mo3591e(interfaceC3371b);
            m3581l(interfaceC3371b);
            z3 = true;
        }
        if (z3) {
            return;
        }
        C0622i c0622i2 = this.f4014b;
        if (c0622i2 != null && !c0622i2.m3576a(i4, i5)) {
            this.f4015c.mo3588b(interfaceC3371b);
            this.f4015c.mo3587a(interfaceC3371b);
            return;
        }
        throw new IllegalStateException("A migration from " + i4 + " to " + i5 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
