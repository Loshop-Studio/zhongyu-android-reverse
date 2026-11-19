package p334s6;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.thread.PictureThreadUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p008a7.AbstractC0075h;
import p008a7.AbstractC0076i;
import p008a7.AbstractC0077j;
import p008a7.AbstractC0080m;
import p008a7.AbstractC0084q;
import p235l6.AbstractC10149c;
import p235l6.AbstractC10150d;
import p260n6.InterfaceC10322a;
import p273o6.C10445a;
import p304q6.AbstractC10747g;
import p304q6.InterfaceC10745e;
import p304q6.InterfaceC10746f;

/* renamed from: s6.d */
/* loaded from: classes5.dex */
public final class C11076d extends AbstractC11073a {

    /* renamed from: s6.d$a */
    public class a extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ long f26720h;

        /* renamed from: i */
        public final /* synthetic */ int f26721i;

        /* renamed from: j */
        public final /* synthetic */ int f26722j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC10747g f26723k;

        public a(long j10, int i10, int i11, AbstractC10747g abstractC10747g) {
            this.f26720h = j10;
            this.f26721i = i10;
            this.f26722j = i11;
            this.f26723k = abstractC10747g;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C10445a mo192d() {
            String strM24610H;
            Cursor cursorQuery;
            ArrayList arrayListM24623a;
            Cursor cursor = null;
            try {
                try {
                    boolean z10 = true;
                    if (AbstractC0077j.m218f()) {
                        String strM24615u = C11076d.this.m24615u(this.f26720h);
                        String[] strArrM24616v = C11076d.this.m24616v(this.f26720h);
                        int i10 = this.f26721i;
                        cursorQuery = C11076d.this.m24566b().getContentResolver().query(AbstractC11073a.f26711d, AbstractC11073a.f26712e, AbstractC0075h.m178a(strM24615u, strArrM24616v, i10, (this.f26722j - 1) * i10, C11076d.this.m24610H()), null);
                    } else {
                        if (this.f26722j == -1) {
                            strM24610H = C11076d.this.m24610H();
                        } else {
                            strM24610H = C11076d.this.m24610H() + " limit " + this.f26721i + " offset " + ((this.f26722j - 1) * this.f26721i);
                        }
                        cursorQuery = C11076d.this.m24566b().getContentResolver().query(AbstractC11073a.f26711d, AbstractC11073a.f26712e, C11076d.this.m24615u(this.f26720h), C11076d.this.m24616v(this.f26720h), strM24610H);
                    }
                    cursor = cursorQuery;
                    if (cursor == null) {
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return new C10445a();
                    }
                    ArrayList arrayList = new ArrayList();
                    if (cursor.getCount() > 0) {
                        cursor.moveToFirst();
                        do {
                            LocalMedia localMediaM24612J = C11076d.this.m24612J(cursor, false);
                            if (localMediaM24612J != null) {
                                arrayList.add(localMediaM24612J);
                            }
                        } while (cursor.moveToNext());
                    }
                    if (this.f26720h == -1 && this.f26722j == 1 && (arrayListM24623a = AbstractC11077e.m24623a(C11076d.this.m24566b(), C11076d.this.m24565a().f12336Z)) != null) {
                        arrayList.addAll(arrayListM24623a);
                        AbstractC0080m.m222d(arrayList);
                    }
                    if (cursor.getCount() <= 0) {
                        z10 = false;
                    }
                    C10445a c10445a = new C10445a(z10, arrayList);
                    if (!cursor.isClosed()) {
                        cursor.close();
                    }
                    return c10445a;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    Log.i(AbstractC11073a.f26710c, "loadMedia Page Data Error: " + e10.getMessage());
                    C10445a c10445a2 = new C10445a();
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    return c10445a2;
                }
            } catch (Throwable th) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(C10445a c10445a) {
            PictureThreadUtils.m9580d(this);
            AbstractC10747g abstractC10747g = this.f26723k;
            if (abstractC10747g != null) {
                ArrayList arrayList = c10445a.f24846b;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                abstractC10747g.mo8990a(arrayList, c10445a.f24845a);
            }
        }
    }

    /* renamed from: s6.d$b */
    public class b extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC10745e f26725h;

        public b(InterfaceC10745e interfaceC10745e) {
            this.f26725h = interfaceC10745e;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public LocalMediaFolder mo192d() {
            return AbstractC11077e.m24624b(C11076d.this.m24566b(), C11076d.this.m24565a().f12336Z);
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void mo193i(LocalMediaFolder localMediaFolder) {
            PictureThreadUtils.m9580d(this);
            InterfaceC10745e interfaceC10745e = this.f26725h;
            if (interfaceC10745e != null) {
                interfaceC10745e.mo8991a(localMediaFolder);
            }
        }
    }

    /* renamed from: s6.d$c */
    public class c extends PictureThreadUtils.AbstractC7504d {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC10746f f26727h;

        public c(InterfaceC10746f interfaceC10746f) {
            this.f26727h = interfaceC10746f;
        }

        @Override // com.luck.picture.lib.thread.PictureThreadUtils.AbstractRunnableC7505e
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public List mo192d() {
            int iM9412j;
            String string;
            Context contextM24566b;
            int i10;
            Cursor cursorQuery = C11076d.this.m24566b().getContentResolver().query(AbstractC11073a.f26711d, C11076d.this.m24611I() ? AbstractC11073a.f26712e : AbstractC11073a.f26713f, C11076d.this.m24608A(), C11076d.this.m24609B(), C11076d.this.m24610H());
            try {
                if (cursorQuery != null) {
                    try {
                        int count = cursorQuery.getCount();
                        ArrayList arrayList = new ArrayList();
                        if (count > 0) {
                            if (C11076d.this.m24611I()) {
                                HashMap map = new HashMap();
                                while (cursorQuery.moveToNext()) {
                                    if (C11076d.this.m24565a().f12319K0) {
                                        LocalMedia localMediaM24612J = C11076d.this.m24612J(cursorQuery, true);
                                        if (localMediaM24612J != null) {
                                            localMediaM24612J.m9353O();
                                        }
                                    }
                                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                    Long l10 = (Long) map.get(Long.valueOf(j10));
                                    map.put(Long.valueOf(j10), l10 == null ? 1L : Long.valueOf(l10.longValue() + 1));
                                }
                                if (cursorQuery.moveToFirst()) {
                                    HashSet hashSet = new HashSet();
                                    iM9412j = 0;
                                    do {
                                        long j11 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                        if (!hashSet.contains(Long.valueOf(j11))) {
                                            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
                                            localMediaFolder.m9415m(j11);
                                            String string2 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                            String string3 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                                            if (map.containsKey(Long.valueOf(j11))) {
                                                Long l11 = (Long) map.get(Long.valueOf(j11));
                                                long jLongValue = l11.longValue();
                                                long j12 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"));
                                                localMediaFolder.m9420r(string2);
                                                localMediaFolder.m9421s(AbstractC0084q.m238c(l11));
                                                localMediaFolder.m9418p(AbstractC0075h.m187j(j12, string3));
                                                localMediaFolder.m9419q(string3);
                                                arrayList.add(localMediaFolder);
                                                hashSet.add(Long.valueOf(j11));
                                                iM9412j = (int) (iM9412j + jLongValue);
                                            }
                                        }
                                    } while (cursorQuery.moveToNext());
                                } else {
                                    iM9412j = 0;
                                }
                            } else {
                                cursorQuery.moveToFirst();
                                int i11 = 0;
                                do {
                                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                    String string5 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("bucket_display_name"));
                                    String string6 = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"));
                                    long j13 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("bucket_id"));
                                    int i12 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("count"));
                                    LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
                                    localMediaFolder2.m9415m(j13);
                                    localMediaFolder2.m9418p(string4);
                                    localMediaFolder2.m9420r(string5);
                                    localMediaFolder2.m9419q(string6);
                                    localMediaFolder2.m9421s(i12);
                                    arrayList.add(localMediaFolder2);
                                    i11 += i12;
                                } while (cursorQuery.moveToNext());
                                iM9412j = i11;
                            }
                            LocalMediaFolder localMediaFolder3 = new LocalMediaFolder();
                            LocalMediaFolder localMediaFolderM24624b = AbstractC11077e.m24624b(C11076d.this.m24566b(), C11076d.this.m24565a().f12336Z);
                            if (localMediaFolderM24624b != null) {
                                arrayList.add(localMediaFolderM24624b);
                                long jLastModified = new File(localMediaFolderM24624b.m9409g()).lastModified();
                                iM9412j += localMediaFolderM24624b.m9412j();
                                localMediaFolder3.m9417o(new ArrayList());
                                if (cursorQuery.moveToFirst()) {
                                    localMediaFolder3.m9418p(AbstractC0077j.m217e() ? C11076d.m24602s(cursorQuery) : C11076d.m24603t(cursorQuery));
                                    localMediaFolder3.m9419q(C11076d.m24601r(cursorQuery));
                                    if (jLastModified > (AbstractC10149c.m21174c(localMediaFolder3.m9409g()) ? new File(AbstractC0076i.m203h(C11076d.this.m24566b(), Uri.parse(localMediaFolder3.m9409g()))).lastModified() : new File(localMediaFolder3.m9409g()).lastModified())) {
                                        localMediaFolder3.m9418p(localMediaFolderM24624b.m9409g());
                                        localMediaFolder3.m9419q(localMediaFolderM24624b.m9410h());
                                    }
                                }
                            } else if (cursorQuery.moveToFirst()) {
                                localMediaFolder3.m9418p(AbstractC0077j.m217e() ? C11076d.m24602s(cursorQuery) : C11076d.m24603t(cursorQuery));
                                localMediaFolder3.m9419q(C11076d.m24601r(cursorQuery));
                            }
                            if (iM9412j != 0) {
                                AbstractC0080m.m221c(arrayList);
                                localMediaFolder3.m9421s(iM9412j);
                                localMediaFolder3.m9415m(-1L);
                                if (TextUtils.isEmpty(C11076d.this.m24565a().f12346h0)) {
                                    if (C11076d.this.m24565a().f12337c == AbstractC10150d.m21191b()) {
                                        contextM24566b = C11076d.this.m24566b();
                                        i10 = R$string.ps_all_audio;
                                    } else {
                                        contextM24566b = C11076d.this.m24566b();
                                        i10 = R$string.ps_camera_roll;
                                    }
                                    string = contextM24566b.getString(i10);
                                } else {
                                    string = C11076d.this.m24565a().f12346h0;
                                }
                                localMediaFolder3.m9420r(string);
                                arrayList.add(0, localMediaFolder3);
                                if (C11076d.this.m24565a().f12366r0 && C11076d.this.m24565a().f12337c == AbstractC10150d.m21190a()) {
                                    C11076d.this.m24613K(arrayList);
                                }
                                if (!cursorQuery.isClosed()) {
                                    cursorQuery.close();
                                }
                            } else if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            return arrayList;
                        }
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        Log.i(AbstractC11073a.f26710c, "loadAllMedia Data Error: " + e10.getMessage());
                        if (!cursorQuery.isClosed()) {
                        }
                    }
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                } else if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return new ArrayList();
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
            LocalMedia.m9338b();
            InterfaceC10746f interfaceC10746f = this.f26727h;
            if (interfaceC10746f != null) {
                interfaceC10746f.mo8989a(list);
            }
        }
    }

    /* renamed from: C */
    private String m24589C(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str3);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append(str2);
        if (m24611I()) {
            return sb2.toString();
        }
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    /* renamed from: D */
    private String m24590D(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (m24611I()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    /* renamed from: E */
    private String m24591E(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (m24611I()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    /* renamed from: F */
    public static String[] m24592F(int i10, long j10) {
        return j10 == -1 ? new String[]{String.valueOf(i10)} : new String[]{String.valueOf(i10), AbstractC0084q.m242g(Long.valueOf(j10))};
    }

    /* renamed from: G */
    private String m24593G(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        if (m24611I()) {
            sb2.append("media_type");
            sb2.append("=?");
            sb2.append(str2);
            sb2.append(" AND ");
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str2);
        sb2.append(") AND ");
        sb2.append(str);
        sb2.append(")");
        sb2.append(" GROUP BY (bucket_id");
        return sb2.toString();
    }

    /* renamed from: r */
    public static String m24601r(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
    }

    /* renamed from: s */
    public static String m24602s(Cursor cursor) {
        return AbstractC0075h.m187j(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow("mime_type")));
    }

    /* renamed from: t */
    public static String m24603t(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("_data"));
    }

    /* renamed from: w */
    public static String m24604w(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" OR ");
        sb2.append("media_type");
        sb2.append("=? AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: x */
    public static String m24605x(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: y */
    public static String m24606y(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        if (j10 == -1) {
            sb2.append(str);
            sb2.append(") AND ");
            sb2.append(str2);
            return sb2.toString();
        }
        sb2.append(str);
        sb2.append(") AND ");
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: z */
    public static String m24607z(long j10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append("media_type");
        sb2.append("=?");
        sb2.append(str);
        sb2.append(" AND ");
        sb2.append(str2);
        sb2.append(") AND ");
        if (j10 == -1) {
            sb2.append(str3);
            return sb2.toString();
        }
        sb2.append("bucket_id");
        sb2.append("=? AND ");
        sb2.append(str3);
        return sb2.toString();
    }

    /* renamed from: A */
    public String m24608A() {
        String strM24567c = m24567c();
        String strM24568d = m24568d();
        String strM24569e = m24569e();
        int i10 = m24565a().f12337c;
        if (i10 == 0) {
            return m24589C(strM24567c, strM24568d, strM24569e);
        }
        if (i10 == 1) {
            return m24591E(strM24568d, strM24569e);
        }
        if (i10 == 2) {
            return m24593G(strM24567c, strM24569e);
        }
        if (i10 != 3) {
            return null;
        }
        return m24590D(strM24567c, strM24569e);
    }

    /* renamed from: B */
    public String[] m24609B() {
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

    /* renamed from: H */
    public String m24610H() {
        return TextUtils.isEmpty(m24565a().f12344g0) ? "date_modified DESC" : m24565a().f12344g0;
    }

    /* renamed from: I */
    public final boolean m24611I() {
        if (AbstractC0077j.m217e()) {
            return true;
        }
        return m24565a().f12319K0;
    }

    /* renamed from: J */
    public LocalMedia m24612J(Cursor cursor, boolean z10) throws IllegalArgumentException {
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
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String strM187j = AbstractC0077j.m217e() ? AbstractC0075h.m187j(j11, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = AbstractC10149c.m21186o();
        }
        if (m24565a().f12352k0) {
            if (AbstractC10149c.m21179h(string)) {
                if (!TextUtils.isEmpty(string2) && !AbstractC0076i.m209n(string2)) {
                    return null;
                }
            } else if (!AbstractC0076i.m207l(string2)) {
                return null;
            }
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
        long j12 = cursor.getLong(columnIndexOrThrow6);
        long j13 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        long j14 = cursor.getLong(columnIndexOrThrow10);
        long j15 = cursor.getLong(columnIndexOrThrow11);
        String strM21173b = TextUtils.isEmpty(string4) ? AbstractC10149c.m21173b(string2) : string4;
        if (m24565a().f12315I0 && j13 > 0 && j13 < 1024) {
            return null;
        }
        if (AbstractC10149c.m21180i(string) || AbstractC10149c.m21175d(string)) {
            if (m24565a().f12369t > 0) {
                j10 = j15;
                if (j12 < m24565a().f12369t) {
                    return null;
                }
            } else {
                j10 = j15;
            }
            if (m24565a().f12367s > 0 && j12 > m24565a().f12367s) {
                return null;
            }
            if (m24565a().f12315I0 && j12 <= 0) {
                return null;
            }
        } else {
            j10 = j15;
        }
        LocalMedia localMediaM9336N = z10 ? LocalMedia.m9336N() : LocalMedia.m9337a();
        localMediaM9336N.m9372g0(j11);
        localMediaM9336N.m9354P(j14);
        localMediaM9336N.m9386n0(strM187j);
        localMediaM9336N.m9390p0(string2);
        localMediaM9336N.m9368d0(strM21173b);
        localMediaM9336N.m9384m0(string3);
        localMediaM9336N.m9366b0(j12);
        localMediaM9336N.m9356R(m24565a().f12337c);
        localMediaM9336N.m9376i0(string);
        localMediaM9336N.m9396s0(i10);
        localMediaM9336N.m9370f0(i14);
        localMediaM9336N.m9394r0(j13);
        localMediaM9336N.m9365a0(j10);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        return localMediaM9336N;
    }

    /* renamed from: K */
    public final void m24613K(List list) throws Throwable {
        for (int i10 = 0; i10 < list.size(); i10++) {
            LocalMediaFolder localMediaFolder = (LocalMediaFolder) list.get(i10);
            if (localMediaFolder != null) {
                String strM24614q = m24614q(localMediaFolder.m9406a());
                if (!TextUtils.isEmpty(strM24614q)) {
                    localMediaFolder.m9418p(strM24614q);
                }
            }
        }
    }

    @Override // p334s6.AbstractC11073a
    /* renamed from: g */
    public void mo24571g(InterfaceC10746f interfaceC10746f) {
        PictureThreadUtils.m9584h(new c(interfaceC10746f));
    }

    @Override // p334s6.AbstractC11073a
    /* renamed from: h */
    public void mo24572h(InterfaceC10745e interfaceC10745e) {
        PictureThreadUtils.m9584h(new b(interfaceC10745e));
    }

    @Override // p334s6.AbstractC11073a
    /* renamed from: i */
    public void mo24573i(long j10, int i10, int i11, AbstractC10747g abstractC10747g) {
        PictureThreadUtils.m9584h(new a(j10, i11, i10, abstractC10747g));
    }

    /* renamed from: q */
    public String m24614q(long j10) throws Throwable {
        Throwable th;
        Exception exc;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2 = null;
        try {
            if (AbstractC0077j.m218f()) {
                cursorQuery = m24566b().getContentResolver().query(AbstractC11073a.f26711d, new String[]{"_id", "mime_type", "_data"}, AbstractC0075h.m178a(m24615u(j10), m24616v(j10), 1, 0, m24610H()), null);
            } else {
                cursorQuery = m24566b().getContentResolver().query(AbstractC11073a.f26711d, new String[]{"_id", "mime_type", "_data"}, m24615u(j10), m24616v(j10), m24610H() + " limit 1 offset 0");
            }
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        if (!cursorQuery.moveToFirst()) {
                            if (!cursorQuery.isClosed()) {
                                cursorQuery.close();
                            }
                            return null;
                        }
                        String strM187j = AbstractC0077j.m217e() ? AbstractC0075h.m187j(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id")), cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("mime_type"))) : cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return strM187j;
                    }
                } catch (Exception e10) {
                    cursor = cursorQuery;
                    exc = e10;
                    try {
                        exc.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null || cursor2.isClosed()) {
                            throw th;
                        }
                        cursor2.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    cursor2 = cursorQuery;
                    th = th3;
                    if (cursor2 != null) {
                        throw th;
                    }
                    throw th;
                }
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        } catch (Exception e11) {
            exc = e11;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
        return null;
    }

    /* renamed from: u */
    public final String m24615u(long j10) {
        String strM24567c = m24567c();
        String strM24568d = m24568d();
        String strM24569e = m24569e();
        int i10 = m24565a().f12337c;
        if (i10 == 0) {
            return m24604w(j10, strM24569e, strM24567c, strM24568d);
        }
        if (i10 == 1) {
            return m24606y(j10, strM24569e, strM24568d);
        }
        if (i10 == 2) {
            return m24607z(j10, strM24569e, strM24567c, strM24568d);
        }
        if (i10 != 3) {
            return null;
        }
        return m24605x(j10, strM24569e, strM24567c, strM24568d);
    }

    /* renamed from: v */
    public final String[] m24616v(long j10) {
        int i10 = m24565a().f12337c;
        if (i10 == 0) {
            return j10 == -1 ? new String[]{String.valueOf(1), String.valueOf(3)} : new String[]{String.valueOf(1), String.valueOf(3), AbstractC0084q.m242g(Long.valueOf(j10))};
        }
        if (i10 == 1) {
            return m24592F(1, j10);
        }
        if (i10 == 2) {
            return m24592F(3, j10);
        }
        if (i10 != 3) {
            return null;
        }
        return m24592F(2, j10);
    }
}
