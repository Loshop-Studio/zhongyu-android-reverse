package com.zykj.subscriber.dao;

import android.database.SQLException;
import androidx.room.AbstractC0621h0;
import androidx.room.C0622i;
import androidx.room.C0623i0;
import androidx.room.C0633o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p081e2.C2474c;
import p081e2.InterfaceC2473b;
import p144r0.C3021c;
import p144r0.C3025g;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;

/* loaded from: classes.dex */
public final class PDFPreviewDatabase_Impl extends PDFPreviewDatabase {

    /* renamed from: p */
    private volatile InterfaceC2473b f9930p;

    /* renamed from: com.zykj.subscriber.dao.PDFPreviewDatabase_Impl$a */
    class C2438a extends C0623i0.a {
        C2438a(int i4) {
            super(i4);
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: a */
        public void mo3587a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `previewInfo` (`path` TEXT NOT NULL, `pageIndex` INTEGER NOT NULL, `pageOffset` REAL NOT NULL, PRIMARY KEY(`path`))");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC3371b.mo3508h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '43b6ca552b2fc97cead13e6104e3e4b4')");
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: b */
        public void mo3588b(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `previewInfo`");
            if (((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h.get(i4)).m3567b(interfaceC3371b);
                }
            }
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: c */
        protected void mo3589c(InterfaceC3371b interfaceC3371b) {
            if (((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h.get(i4)).m3566a(interfaceC3371b);
                }
            }
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: d */
        public void mo3590d(InterfaceC3371b interfaceC3371b) {
            ((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3956a = interfaceC3371b;
            PDFPreviewDatabase_Impl.this.m3555t(interfaceC3371b);
            if (((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) PDFPreviewDatabase_Impl.this).f3963h.get(i4)).mo3568c(interfaceC3371b);
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
            HashMap map = new HashMap(3);
            map.put("path", new C3025g.a("path", "TEXT", true, 1, null, 1));
            map.put("pageIndex", new C3025g.a("pageIndex", "INTEGER", true, 0, null, 1));
            map.put("pageOffset", new C3025g.a("pageOffset", "REAL", true, 0, null, 1));
            C3025g c3025g = new C3025g("previewInfo", map, new HashSet(0), new HashSet(0));
            C3025g c3025gM10152a = C3025g.m10152a(interfaceC3371b, "previewInfo");
            if (c3025g.equals(c3025gM10152a)) {
                return new C0623i0.b(true, null);
            }
            return new C0623i0.b(false, "previewInfo(com.zykj.subscriber.dao.PDFPreviewInfo).\n Expected:\n" + c3025g + "\n Found:\n" + c3025gM10152a);
        }
    }

    @Override // com.zykj.subscriber.dao.PDFPreviewDatabase
    /* renamed from: E */
    public InterfaceC2473b mo8125E() {
        InterfaceC2473b interfaceC2473b;
        if (this.f9930p != null) {
            return this.f9930p;
        }
        synchronized (this) {
            if (this.f9930p == null) {
                this.f9930p = new C2474c(this);
            }
            interfaceC2473b = this.f9930p;
        }
        return interfaceC2473b;
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: g */
    protected C0633o mo3544g() {
        return new C0633o(this, new HashMap(0), new HashMap(0), "previewInfo");
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: h */
    protected InterfaceC3372c mo3545h(C0622i c0622i) {
        return c0622i.f3997a.mo3484a(InterfaceC3372c.b.m10261a(c0622i.f3998b).m10264c(c0622i.f3999c).m10263b(new C0623i0(c0622i, new C2438a(1), "43b6ca552b2fc97cead13e6104e3e4b4", "fa316293a896d0c677ebb7e47cd8e391")).m10262a());
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: n */
    protected Map<Class<?>, List<Class<?>>> mo3551n() {
        HashMap map = new HashMap();
        map.put(InterfaceC2473b.class, C2474c.m8255c());
        return map;
    }
}
