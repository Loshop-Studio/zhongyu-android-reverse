package p144r0;

import android.database.Cursor;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.umeng.analytics.pro.C1851ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p149s0.InterfaceC3371b;

/* renamed from: r0.g */
/* loaded from: classes.dex */
public final class C3025g {

    /* renamed from: a */
    public final String f11707a;

    /* renamed from: b */
    public final Map<String, a> f11708b;

    /* renamed from: c */
    public final Set<b> f11709c;

    /* renamed from: d */
    public final Set<d> f11710d;

    /* renamed from: r0.g$a */
    public static final class a {

        /* renamed from: a */
        public final String f11711a;

        /* renamed from: b */
        public final String f11712b;

        /* renamed from: c */
        public final int f11713c;

        /* renamed from: d */
        public final boolean f11714d;

        /* renamed from: e */
        public final int f11715e;

        /* renamed from: f */
        public final String f11716f;

        /* renamed from: g */
        private final int f11717g;

        public a(String str, String str2, boolean z3, int i4, String str3, int i5) {
            this.f11711a = str;
            this.f11712b = str2;
            this.f11714d = z3;
            this.f11715e = i4;
            this.f11713c = m10158a(str2);
            this.f11716f = str3;
            this.f11717g = i5;
        }

        /* renamed from: a */
        private static int m10158a(String str) {
            if (str == null) {
                return 5;
            }
            String upperCase = str.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            return (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
        }

        public boolean equals(Object obj) {
            String str;
            String str2;
            String str3;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f11715e != aVar.f11715e || !this.f11711a.equals(aVar.f11711a) || this.f11714d != aVar.f11714d) {
                return false;
            }
            if (this.f11717g == 1 && aVar.f11717g == 2 && (str3 = this.f11716f) != null && !str3.equals(aVar.f11716f)) {
                return false;
            }
            if (this.f11717g == 2 && aVar.f11717g == 1 && (str2 = aVar.f11716f) != null && !str2.equals(this.f11716f)) {
                return false;
            }
            int i4 = this.f11717g;
            return (i4 == 0 || i4 != aVar.f11717g || ((str = this.f11716f) == null ? aVar.f11716f == null : str.equals(aVar.f11716f))) && this.f11713c == aVar.f11713c;
        }

        public int hashCode() {
            return (((((this.f11711a.hashCode() * 31) + this.f11713c) * 31) + (this.f11714d ? 1231 : 1237)) * 31) + this.f11715e;
        }

        public String toString() {
            return "Column{name='" + this.f11711a + "', type='" + this.f11712b + "', affinity='" + this.f11713c + "', notNull=" + this.f11714d + ", primaryKeyPosition=" + this.f11715e + ", defaultValue='" + this.f11716f + "'}";
        }
    }

    /* renamed from: r0.g$b */
    public static final class b {

        /* renamed from: a */
        public final String f11718a;

        /* renamed from: b */
        public final String f11719b;

        /* renamed from: c */
        public final String f11720c;

        /* renamed from: d */
        public final List<String> f11721d;

        /* renamed from: e */
        public final List<String> f11722e;

        public b(String str, String str2, String str3, List<String> list, List<String> list2) {
            this.f11718a = str;
            this.f11719b = str2;
            this.f11720c = str3;
            this.f11721d = Collections.unmodifiableList(list);
            this.f11722e = Collections.unmodifiableList(list2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f11718a.equals(bVar.f11718a) && this.f11719b.equals(bVar.f11719b) && this.f11720c.equals(bVar.f11720c) && this.f11721d.equals(bVar.f11721d)) {
                return this.f11722e.equals(bVar.f11722e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f11718a.hashCode() * 31) + this.f11719b.hashCode()) * 31) + this.f11720c.hashCode()) * 31) + this.f11721d.hashCode()) * 31) + this.f11722e.hashCode();
        }

        public String toString() {
            return "ForeignKey{referenceTable='" + this.f11718a + "', onDelete='" + this.f11719b + "', onUpdate='" + this.f11720c + "', columnNames=" + this.f11721d + ", referenceColumnNames=" + this.f11722e + '}';
        }
    }

    /* renamed from: r0.g$c */
    static class c implements Comparable<c> {

        /* renamed from: a */
        final int f11723a;

        /* renamed from: b */
        final int f11724b;

        /* renamed from: c */
        final String f11725c;

        /* renamed from: d */
        final String f11726d;

        c(int i4, int i5, String str, String str2) {
            this.f11723a = i4;
            this.f11724b = i5;
            this.f11725c = str;
            this.f11726d = str2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int i4 = this.f11723a - cVar.f11723a;
            return i4 == 0 ? this.f11724b - cVar.f11724b : i4;
        }
    }

    /* renamed from: r0.g$d */
    public static final class d {

        /* renamed from: a */
        public final String f11727a;

        /* renamed from: b */
        public final boolean f11728b;

        /* renamed from: c */
        public final List<String> f11729c;

        public d(String str, boolean z3, List<String> list) {
            this.f11727a = str;
            this.f11728b = z3;
            this.f11729c = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.f11728b == dVar.f11728b && this.f11729c.equals(dVar.f11729c)) {
                return this.f11727a.startsWith("index_") ? dVar.f11727a.startsWith("index_") : this.f11727a.equals(dVar.f11727a);
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f11727a.startsWith("index_") ? -1184239155 : this.f11727a.hashCode()) * 31) + (this.f11728b ? 1 : 0)) * 31) + this.f11729c.hashCode();
        }

        public String toString() {
            return "Index{name='" + this.f11727a + "', unique=" + this.f11728b + ", columns=" + this.f11729c + '}';
        }
    }

    public C3025g(String str, Map<String, a> map, Set<b> set, Set<d> set2) {
        this.f11707a = str;
        this.f11708b = Collections.unmodifiableMap(map);
        this.f11709c = Collections.unmodifiableSet(set);
        this.f11710d = set2 == null ? null : Collections.unmodifiableSet(set2);
    }

    /* renamed from: a */
    public static C3025g m10152a(InterfaceC3371b interfaceC3371b, String str) {
        return new C3025g(str, m10153b(interfaceC3371b, str), m10155d(interfaceC3371b, str), m10157f(interfaceC3371b, str));
    }

    /* renamed from: b */
    private static Map<String, a> m10153b(InterfaceC3371b interfaceC3371b, String str) {
        Cursor cursorMo3504H = interfaceC3371b.mo3504H("PRAGMA table_info(`" + str + "`)");
        HashMap map = new HashMap();
        try {
            if (cursorMo3504H.getColumnCount() > 0) {
                int columnIndex = cursorMo3504H.getColumnIndex("name");
                int columnIndex2 = cursorMo3504H.getColumnIndex("type");
                int columnIndex3 = cursorMo3504H.getColumnIndex("notnull");
                int columnIndex4 = cursorMo3504H.getColumnIndex("pk");
                int columnIndex5 = cursorMo3504H.getColumnIndex("dflt_value");
                while (cursorMo3504H.moveToNext()) {
                    String string = cursorMo3504H.getString(columnIndex);
                    map.put(string, new a(string, cursorMo3504H.getString(columnIndex2), cursorMo3504H.getInt(columnIndex3) != 0, cursorMo3504H.getInt(columnIndex4), cursorMo3504H.getString(columnIndex5), 2));
                }
            }
            return map;
        } finally {
            cursorMo3504H.close();
        }
    }

    /* renamed from: c */
    private static List<c> m10154c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < count; i4++) {
            cursor.moveToPosition(i4);
            arrayList.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static Set<b> m10155d(InterfaceC3371b interfaceC3371b, String str) {
        HashSet hashSet = new HashSet();
        Cursor cursorMo3504H = interfaceC3371b.mo3504H("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorMo3504H.getColumnIndex("id");
            int columnIndex2 = cursorMo3504H.getColumnIndex("seq");
            int columnIndex3 = cursorMo3504H.getColumnIndex("table");
            int columnIndex4 = cursorMo3504H.getColumnIndex("on_delete");
            int columnIndex5 = cursorMo3504H.getColumnIndex("on_update");
            List<c> listM10154c = m10154c(cursorMo3504H);
            int count = cursorMo3504H.getCount();
            for (int i4 = 0; i4 < count; i4++) {
                cursorMo3504H.moveToPosition(i4);
                if (cursorMo3504H.getInt(columnIndex2) == 0) {
                    int i5 = cursorMo3504H.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (c cVar : listM10154c) {
                        if (cVar.f11723a == i5) {
                            arrayList.add(cVar.f11725c);
                            arrayList2.add(cVar.f11726d);
                        }
                    }
                    hashSet.add(new b(cursorMo3504H.getString(columnIndex3), cursorMo3504H.getString(columnIndex4), cursorMo3504H.getString(columnIndex5), arrayList, arrayList2));
                }
            }
            return hashSet;
        } finally {
            cursorMo3504H.close();
        }
    }

    /* renamed from: e */
    private static d m10156e(InterfaceC3371b interfaceC3371b, String str, boolean z3) {
        Cursor cursorMo3504H = interfaceC3371b.mo3504H("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorMo3504H.getColumnIndex("seqno");
            int columnIndex2 = cursorMo3504H.getColumnIndex("cid");
            int columnIndex3 = cursorMo3504H.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (cursorMo3504H.moveToNext()) {
                    if (cursorMo3504H.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(cursorMo3504H.getInt(columnIndex)), cursorMo3504H.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new d(str, z3, arrayList);
            }
            return null;
        } finally {
            cursorMo3504H.close();
        }
    }

    /* renamed from: f */
    private static Set<d> m10157f(InterfaceC3371b interfaceC3371b, String str) {
        Cursor cursorMo3504H = interfaceC3371b.mo3504H("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorMo3504H.getColumnIndex("name");
            int columnIndex2 = cursorMo3504H.getColumnIndex(OSSHeaders.ORIGIN);
            int columnIndex3 = cursorMo3504H.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                HashSet hashSet = new HashSet();
                while (cursorMo3504H.moveToNext()) {
                    if (C1851ai.f8255aD.equals(cursorMo3504H.getString(columnIndex2))) {
                        String string = cursorMo3504H.getString(columnIndex);
                        boolean z3 = true;
                        if (cursorMo3504H.getInt(columnIndex3) != 1) {
                            z3 = false;
                        }
                        d dVarM10156e = m10156e(interfaceC3371b, string, z3);
                        if (dVarM10156e == null) {
                            return null;
                        }
                        hashSet.add(dVarM10156e);
                    }
                }
                return hashSet;
            }
            return null;
        } finally {
            cursorMo3504H.close();
        }
    }

    public boolean equals(Object obj) {
        Set<d> set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3025g)) {
            return false;
        }
        C3025g c3025g = (C3025g) obj;
        String str = this.f11707a;
        if (str == null ? c3025g.f11707a != null : !str.equals(c3025g.f11707a)) {
            return false;
        }
        Map<String, a> map = this.f11708b;
        if (map == null ? c3025g.f11708b != null : !map.equals(c3025g.f11708b)) {
            return false;
        }
        Set<b> set2 = this.f11709c;
        if (set2 == null ? c3025g.f11709c != null : !set2.equals(c3025g.f11709c)) {
            return false;
        }
        Set<d> set3 = this.f11710d;
        if (set3 == null || (set = c3025g.f11710d) == null) {
            return true;
        }
        return set3.equals(set);
    }

    public int hashCode() {
        String str = this.f11707a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Map<String, a> map = this.f11708b;
        int iHashCode2 = (iHashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set<b> set = this.f11709c;
        return iHashCode2 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "TableInfo{name='" + this.f11707a + "', columns=" + this.f11708b + ", foreignKeys=" + this.f11709c + ", indices=" + this.f11710d + '}';
    }
}
