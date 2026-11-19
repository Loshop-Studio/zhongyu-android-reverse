package com.zykj.download.data;

import android.database.SQLException;
import androidx.room.AbstractC0621h0;
import androidx.room.C0622i;
import androidx.room.C0623i0;
import androidx.room.C0633o;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import p144r0.C3021c;
import p144r0.C3025g;
import p149s0.InterfaceC3371b;
import p149s0.InterfaceC3372c;
import p162v1.C3421d;
import p162v1.C3423f;
import p162v1.InterfaceC3420c;
import p162v1.InterfaceC3422e;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: p */
    private volatile InterfaceC3420c f9703p;

    /* renamed from: com.zykj.download.data.AppDatabase_Impl$a */
    class C2376a extends C0623i0.a {
        C2376a(int i4) {
            super(i4);
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: a */
        public void mo3587a(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `download` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `downloadUrl` TEXT NOT NULL, `localPath` TEXT NOT NULL, `totalSize` INTEGER NOT NULL, `downloadSize` INTEGER NOT NULL, `verifyCode` TEXT, `flag` INTEGER NOT NULL)");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS `upload` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            interfaceC3371b.mo3508h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            interfaceC3371b.mo3508h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2eb05d347b056192efce82d4a1a31864')");
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: b */
        public void mo3588b(InterfaceC3371b interfaceC3371b) throws SQLException {
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `download`");
            interfaceC3371b.mo3508h("DROP TABLE IF EXISTS `upload`");
            if (((AbstractC0621h0) AppDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) AppDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) AppDatabase_Impl.this).f3963h.get(i4)).m3567b(interfaceC3371b);
                }
            }
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: c */
        protected void mo3589c(InterfaceC3371b interfaceC3371b) {
            if (((AbstractC0621h0) AppDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) AppDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) AppDatabase_Impl.this).f3963h.get(i4)).m3566a(interfaceC3371b);
                }
            }
        }

        @Override // androidx.room.C0623i0.a
        /* renamed from: d */
        public void mo3590d(InterfaceC3371b interfaceC3371b) {
            ((AbstractC0621h0) AppDatabase_Impl.this).f3956a = interfaceC3371b;
            AppDatabase_Impl.this.m3555t(interfaceC3371b);
            if (((AbstractC0621h0) AppDatabase_Impl.this).f3963h != null) {
                int size = ((AbstractC0621h0) AppDatabase_Impl.this).f3963h.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((AbstractC0621h0.b) ((AbstractC0621h0) AppDatabase_Impl.this).f3963h.get(i4)).mo3568c(interfaceC3371b);
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
            HashMap map = new HashMap(7);
            map.put("id", new C3025g.a("id", "INTEGER", true, 1, null, 1));
            map.put("downloadUrl", new C3025g.a("downloadUrl", "TEXT", true, 0, null, 1));
            map.put("localPath", new C3025g.a("localPath", "TEXT", true, 0, null, 1));
            map.put("totalSize", new C3025g.a("totalSize", "INTEGER", true, 0, null, 1));
            map.put("downloadSize", new C3025g.a("downloadSize", "INTEGER", true, 0, null, 1));
            map.put("verifyCode", new C3025g.a("verifyCode", "TEXT", false, 0, null, 1));
            map.put(AgooConstants.MESSAGE_FLAG, new C3025g.a(AgooConstants.MESSAGE_FLAG, "INTEGER", true, 0, null, 1));
            C3025g c3025g = new C3025g("download", map, new HashSet(0), new HashSet(0));
            C3025g c3025gM10152a = C3025g.m10152a(interfaceC3371b, "download");
            if (!c3025g.equals(c3025gM10152a)) {
                return new C0623i0.b(false, "download(com.zykj.download.data.DownloadEntity).\n Expected:\n" + c3025g + "\n Found:\n" + c3025gM10152a);
            }
            HashMap map2 = new HashMap(1);
            map2.put("id", new C3025g.a("id", "INTEGER", true, 1, null, 1));
            C3025g c3025g2 = new C3025g("upload", map2, new HashSet(0), new HashSet(0));
            C3025g c3025gM10152a2 = C3025g.m10152a(interfaceC3371b, "upload");
            if (c3025g2.equals(c3025gM10152a2)) {
                return new C0623i0.b(true, null);
            }
            return new C0623i0.b(false, "upload(com.zykj.download.data.UploadEntity).\n Expected:\n" + c3025g2 + "\n Found:\n" + c3025gM10152a2);
        }
    }

    @Override // com.zykj.download.data.AppDatabase
    /* renamed from: E */
    public InterfaceC3420c mo7975E() {
        InterfaceC3420c interfaceC3420c;
        if (this.f9703p != null) {
            return this.f9703p;
        }
        synchronized (this) {
            if (this.f9703p == null) {
                this.f9703p = new C3421d(this);
            }
            interfaceC3420c = this.f9703p;
        }
        return interfaceC3420c;
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: g */
    protected C0633o mo3544g() {
        return new C0633o(this, new HashMap(0), new HashMap(0), "download", "upload");
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: h */
    protected InterfaceC3372c mo3545h(C0622i c0622i) {
        return c0622i.f3997a.mo3484a(InterfaceC3372c.b.m10261a(c0622i.f3998b).m10264c(c0622i.f3999c).m10263b(new C0623i0(c0622i, new C2376a(1), "2eb05d347b056192efce82d4a1a31864", "4bf3ee84833a0c2d99ec4a28d4cd32bb")).m10262a());
    }

    @Override // androidx.room.AbstractC0621h0
    /* renamed from: n */
    protected Map<Class<?>, List<Class<?>>> mo3551n() {
        HashMap map = new HashMap();
        map.put(InterfaceC3420c.class, C3421d.m10436e());
        map.put(InterfaceC3422e.class, C3423f.m10440a());
        return map;
    }
}
