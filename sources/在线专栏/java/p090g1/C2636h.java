package p090g1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p085f1.C2526x;
import p149s0.C3370a;
import p149s0.InterfaceC3374e;
import p169x0.C3453v;
import p169x0.C3455x;

/* renamed from: g1.h */
/* loaded from: classes.dex */
public final class C2636h {
    /* renamed from: a */
    private static void m8841a(StringBuilder sb, int i4) {
        if (i4 <= 0) {
            return;
        }
        sb.append("?");
        for (int i5 = 1; i5 < i4; i5++) {
            sb.append(",");
            sb.append("?");
        }
    }

    /* renamed from: b */
    public static InterfaceC3374e m8842b(C3455x c3455x) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        List<C3453v.a> listM10533b = c3455x.m10533b();
        String str = " AND";
        String str2 = " WHERE";
        if (!listM10533b.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(listM10533b.size());
            Iterator<C3453v.a> it = listM10533b.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(C2526x.m8492h(it.next())));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            m8841a(sb, arrayList2.size());
            sb.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        List<UUID> listM10532a = c3455x.m10532a();
        if (!listM10532a.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(listM10532a.size());
            Iterator<UUID> it2 = listM10532a.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().toString());
            }
            sb.append(str2);
            sb.append(" id IN (");
            m8841a(sb, listM10532a.size());
            sb.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        List<String> listM10534c = c3455x.m10534c();
        if (listM10534c.isEmpty()) {
            str = str2;
        } else {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            m8841a(sb, listM10534c.size());
            sb.append("))");
            arrayList.addAll(listM10534c);
        }
        List<String> listM10535d = c3455x.m10535d();
        if (!listM10535d.isEmpty()) {
            sb.append(str);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            m8841a(sb, listM10535d.size());
            sb.append("))");
            arrayList.addAll(listM10535d);
        }
        sb.append(";");
        return new C3370a(sb.toString(), arrayList.toArray());
    }
}
