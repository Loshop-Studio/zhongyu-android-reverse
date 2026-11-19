package p334s6;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p008a7.AbstractC0075h;
import p008a7.AbstractC0077j;
import p008a7.AbstractC0080m;
import p235l6.AbstractC10149c;
import p235l6.AbstractC10150d;
import p260n6.InterfaceC10322a;
import p304q6.AbstractC10747g;
import p304q6.InterfaceC10745e;
import p304q6.InterfaceC10746f;

/* renamed from: s6.b */
/* loaded from: classes5.dex */
public final class C11074b extends AbstractC11073a {

    /* renamed from: s6.b$a */
    public class a extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC10746f f26716h;

        public a(InterfaceC10746f interfaceC10746f) {
            this.f26716h = interfaceC10746f;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public List mo192d() {
            String string;
            Context contextM24566b;
            int i10;
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = C11074b.this.m24566b().getContentResolver().query(AbstractC11073a.f26711d, AbstractC11073a.f26712e, C11074b.this.m24580l(), C11074b.this.m24581m(), C11074b.this.m24582r());
            try {
                if (cursorQuery != null) {
                    try {
                        LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                        ArrayList arrayList2 = new ArrayList();
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToFirst();
                            do {
                                LocalMedia localMediaM24583s = C11074b.this.m24583s(cursorQuery, false);
                                if (localMediaM24583s != null) {
                                    LocalMediaFolder localMediaFolderM24579k = C11074b.this.m24579k(localMediaM24583s.m9401x(), localMediaM24583s.m9397t(), localMediaM24583s.m9400w(), arrayList);
                                    localMediaFolderM24579k.m9415m(localMediaM24583s.m9373h());
                                    localMediaFolderM24579k.m9408c().add(localMediaM24583s);
                                    localMediaFolderM24579k.m9421s(localMediaFolderM24579k.m9412j() + 1);
                                    localMediaFolderM24579k.m9415m(localMediaM24583s.m9373h());
                                    arrayList2.add(localMediaM24583s);
                                    localMediaFolder.m9421s(localMediaFolder.m9412j() + 1);
                                }
                            } while (cursorQuery.moveToNext());
                            LocalMediaFolder localMediaFolderM24624b = AbstractC11077e.m24624b(C11074b.this.m24566b(), C11074b.this.m24565a().f12336Z);
                            if (localMediaFolderM24624b != null) {
                                arrayList.add(localMediaFolderM24624b);
                                localMediaFolder.m9421s(localMediaFolder.m9412j() + localMediaFolderM24624b.m9412j());
                                localMediaFolder.m9417o(localMediaFolderM24624b.m9408c());
                                arrayList2.addAll(0, localMediaFolderM24624b.m9408c());
                                if (60 > localMediaFolderM24624b.m9412j()) {
                                    if (arrayList2.size() > 60) {
                                        AbstractC0080m.m222d(arrayList2.subList(0, 60));
                                    } else {
                                        AbstractC0080m.m222d(arrayList2);
                                    }
                                }
                            }
                            if (arrayList2.size() > 0) {
                                AbstractC0080m.m221c(arrayList);
                                arrayList.add(0, localMediaFolder);
                                localMediaFolder.m9418p(((LocalMedia) arrayList2.get(0)).m9401x());
                                localMediaFolder.m9419q(((LocalMedia) arrayList2.get(0)).m9397t());
                                if (TextUtils.isEmpty(C11074b.this.m24565a().f12346h0)) {
                                    if (C11074b.this.m24565a().f12337c == AbstractC10150d.m21191b()) {
                                        contextM24566b = C11074b.this.m24566b();
                                        i10 = R$string.ps_all_audio;
                                    } else {
                                        contextM24566b = C11074b.this.m24566b();
                                        i10 = R$string.ps_camera_roll;
                                    }
                                    string = contextM24566b.getString(i10);
                                } else {
                                    string = C11074b.this.m24565a().f12346h0;
                                }
                                localMediaFolder.m9420r(string);
                                localMediaFolder.m9415m(-1L);
                                localMediaFolder.m9417o(arrayList2);
                            }
                        }
                        if (cursorQuery != null && !cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                    }
                } else if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return arrayList;
            } catch (Throwable th) {
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                throw th;
            }
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(List list) {
            PictureThreadUtils.m9580d(this);
            InterfaceC10746f interfaceC10746f = this.f26716h;
            if (interfaceC10746f != null) {
                interfaceC10746f.mo8989a(list);
            }
        }
    }

    /* renamed from: s6.b$b */
    public class b extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC10745e f26718h;

        public b(InterfaceC10745e interfaceC10745e) {
            this.f26718h = interfaceC10745e;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder mo192d() {
            return AbstractC11077e.m24624b(C11074b.this.m24566b(), C11074b.this.m24565a().f12336Z);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(LocalMediaFolder localMediaFolder) {
            PictureThreadUtils.m9580d(this);
            InterfaceC10745e interfaceC10745e = this.f26718h;
            if (interfaceC10745e != null) {
                interfaceC10745e.mo8991a(localMediaFolder);
            }
        }
    }

    /* renamed from: n */
    public static String m24575n(String str, String str2, String str3) {
        return "(media_type=?" + str3 + " OR media_type=? AND " + str + ") AND " + str2;
    }

    /* renamed from: o */
    public static String m24576o(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    /* renamed from: p */
    public static String m24577p(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    /* renamed from: q */
    public static String m24578q(String str, String str2) {
        return "media_type=?" + str2 + " AND " + str;
    }

    @Override // p334s6.AbstractC11073a
    /* renamed from: g */
    public void mo24571g(InterfaceC10746f interfaceC10746f) {
        PictureThreadUtils.m9584h(new a(interfaceC10746f));
    }

    @Override // p334s6.AbstractC11073a
    /* renamed from: h */
    public void mo24572h(InterfaceC10745e interfaceC10745e) {
        PictureThreadUtils.m9584h(new b(interfaceC10745e));
    }

    /* renamed from: k */
    public final LocalMediaFolder m24579k(String str, String str2, String str3, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalMediaFolder localMediaFolder = (LocalMediaFolder) it.next();
            String strM9411i = localMediaFolder.m9411i();
            if (!TextUtils.isEmpty(strM9411i) && TextUtils.equals(strM9411i, str3)) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.m9420r(str3);
        localMediaFolder2.m9418p(str);
        localMediaFolder2.m9419q(str2);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }

    /* renamed from: l */
    public String m24580l() {
        String strM24567c = m24567c();
        String strM24568d = m24568d();
        String strM24569e = m24569e();
        int i10 = m24565a().f12337c;
        if (i10 == 0) {
            return m24575n(strM24567c, strM24568d, strM24569e);
        }
        if (i10 == 1) {
            return m24577p(strM24568d, strM24569e);
        }
        if (i10 == 2) {
            return m24578q(strM24567c, strM24569e);
        }
        if (i10 != 3) {
            return null;
        }
        return m24576o(strM24567c, strM24569e);
    }

    /* renamed from: m */
    public String[] m24581m() {
        int i10 = m24565a().f12337c;
        if (i10 == 0) {
            return new String[]{String.valueOf(1), String.valueOf(3)};
        }
        if (i10 == 1) {
            return new String[]{String.valueOf(1)};
        }
        if (i10 == 2) {
            return new String[]{String.valueOf(3)};
        }
        if (i10 != 3) {
            return null;
        }
        return new String[]{String.valueOf(2)};
    }

    /* renamed from: r */
    public String m24582r() {
        return TextUtils.isEmpty(m24565a().f12344g0) ? "date_modified DESC" : m24565a().f12344g0;
    }

    /* renamed from: s */
    public LocalMedia m24583s(Cursor cursor, boolean z10) throws IllegalArgumentException {
        int i10;
        long j10;
        String[] strArr = AbstractC11073a.f26712e;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(strArr[0]);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(strArr[1]);
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(strArr[2]);
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(strArr[3]);
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(strArr[4]);
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(strArr[5]);
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(strArr[6]);
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow(strArr[7]);
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow(strArr[8]);
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow(strArr[9]);
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow(strArr[10]);
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow(strArr[11]);
        long j11 = cursor.getLong(columnIndexOrThrow);
        long j12 = cursor.getLong(columnIndexOrThrow11);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String strM187j = AbstractC0077j.m217e() ? AbstractC0075h.m187j(j11, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = AbstractC10149c.m21186o();
        }
        if (string.endsWith("image/*")) {
            String strM185h = AbstractC0075h.m185h(string2);
            if (!m24565a().f12308F && AbstractC10149c.m21177f(strM185h)) {
                return null;
            }
            string = strM185h;
        }
        if (string.endsWith("image/*")) {
            return null;
        }
        if (!m24565a().f12310G && string.startsWith(AbstractC10149c.m21187p())) {
            return null;
        }
        if (!m24565a().f12312H && AbstractC10149c.m21176e(string)) {
            return null;
        }
        int i11 = cursor.getInt(columnIndexOrThrow4);
        int i12 = cursor.getInt(columnIndexOrThrow5);
        int i13 = cursor.getInt(columnIndexOrThrow12);
        if (i13 == 90 || i13 == 270) {
            i10 = cursor.getInt(columnIndexOrThrow5);
            i12 = cursor.getInt(columnIndexOrThrow4);
        } else {
            i10 = i11;
        }
        int i14 = i12;
        long j13 = cursor.getLong(columnIndexOrThrow6);
        long j14 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        long j15 = cursor.getLong(columnIndexOrThrow10);
        String strM21173b = TextUtils.isEmpty(string4) ? AbstractC10149c.m21173b(string2) : string4;
        if (m24565a().f12315I0 && j14 > 0 && j14 < 1024) {
            return null;
        }
        if (AbstractC10149c.m21180i(string) || AbstractC10149c.m21175d(string)) {
            if (m24565a().f12369t > 0) {
                j10 = j14;
                if (j13 < m24565a().f12369t) {
                    return null;
                }
            } else {
                j10 = j14;
            }
            if (m24565a().f12367s > 0 && j13 > m24565a().f12367s) {
                return null;
            }
            if (m24565a().f12315I0 && j13 <= 0) {
                return null;
            }
        } else {
            j10 = j14;
        }
        LocalMedia localMediaM9337a = LocalMedia.m9337a();
        localMediaM9337a.m9372g0(j11);
        localMediaM9337a.m9354P(j15);
        localMediaM9337a.m9386n0(strM187j);
        localMediaM9337a.m9390p0(string2);
        localMediaM9337a.m9368d0(strM21173b);
        localMediaM9337a.m9384m0(string3);
        localMediaM9337a.m9366b0(j13);
        localMediaM9337a.m9356R(m24565a().f12337c);
        localMediaM9337a.m9376i0(string);
        localMediaM9337a.m9396s0(i10);
        localMediaM9337a.m9370f0(i14);
        localMediaM9337a.m9394r0(j10);
        localMediaM9337a.m9365a0(j12);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return localMediaM9337a;
    }

    @Override // p334s6.AbstractC11073a
    /* renamed from: i */
    public void mo24573i(long j10, int i10, int i11, AbstractC10747g abstractC10747g) {
    }
}
