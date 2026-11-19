package p085f1;

import android.database.Cursor;
import androidx.collection.C0247a;
import androidx.room.AbstractC0621h0;
import androidx.work.C0810a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import p085f1.C2520r;
import p136p0.C2994k;
import p144r0.C3020b;
import p144r0.C3021c;
import p144r0.C3024f;
import p149s0.InterfaceC3374e;

/* renamed from: f1.h */
/* loaded from: classes.dex */
public final class C2510h implements InterfaceC2509g {

    /* renamed from: a */
    private final AbstractC0621h0 f10141a;

    public C2510h(AbstractC0621h0 abstractC0621h0) {
        this.f10141a = abstractC0621h0;
    }

    /* renamed from: b */
    private void m8433b(C0247a<String, ArrayList<C0810a>> c0247a) {
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
                m8433b(c0247a2);
                c0247a2 = new C0247a<>(999);
            }
            if (i4 > 0) {
                m8433b(c0247a2);
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
        Cursor cursorM10145b = C3021c.m10145b(this.f10141a, c2994kM10086d, false, null);
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

    /* renamed from: c */
    private void m8434c(C0247a<String, ArrayList<String>> c0247a) {
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
                m8434c(c0247a2);
                c0247a2 = new C0247a<>(999);
            }
            if (i4 > 0) {
                m8434c(c0247a2);
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
        Cursor cursorM10145b = C3021c.m10145b(this.f10141a, c2994kM10086d, false, null);
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

    @Override // p085f1.InterfaceC2509g
    /* renamed from: a */
    public List<C2520r.c> mo8432a(InterfaceC3374e interfaceC3374e) {
        this.f10141a.m3541d();
        Cursor cursorM10145b = C3021c.m10145b(this.f10141a, interfaceC3374e, true, null);
        try {
            int iM10142d = C3020b.m10142d(cursorM10145b, "id");
            int iM10142d2 = C3020b.m10142d(cursorM10145b, "state");
            int iM10142d3 = C3020b.m10142d(cursorM10145b, "output");
            int iM10142d4 = C3020b.m10142d(cursorM10145b, "run_attempt_count");
            C0247a<String, ArrayList<String>> c0247a = new C0247a<>();
            C0247a<String, ArrayList<C0810a>> c0247a2 = new C0247a<>();
            while (cursorM10145b.moveToNext()) {
                if (!cursorM10145b.isNull(iM10142d)) {
                    String string = cursorM10145b.getString(iM10142d);
                    if (c0247a.get(string) == null) {
                        c0247a.put(string, new ArrayList<>());
                    }
                }
                if (!cursorM10145b.isNull(iM10142d)) {
                    String string2 = cursorM10145b.getString(iM10142d);
                    if (c0247a2.get(string2) == null) {
                        c0247a2.put(string2, new ArrayList<>());
                    }
                }
            }
            cursorM10145b.moveToPosition(-1);
            m8434c(c0247a);
            m8433b(c0247a2);
            ArrayList arrayList = new ArrayList(cursorM10145b.getCount());
            while (cursorM10145b.moveToNext()) {
                ArrayList<String> arrayList2 = !cursorM10145b.isNull(iM10142d) ? c0247a.get(cursorM10145b.getString(iM10142d)) : null;
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>();
                }
                ArrayList<C0810a> arrayList3 = !cursorM10145b.isNull(iM10142d) ? c0247a2.get(cursorM10145b.getString(iM10142d)) : null;
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList<>();
                }
                C2520r.c cVar = new C2520r.c();
                if (iM10142d != -1) {
                    cVar.f10184a = cursorM10145b.getString(iM10142d);
                }
                if (iM10142d2 != -1) {
                    cVar.f10185b = C2526x.m8490f(cursorM10145b.getInt(iM10142d2));
                }
                if (iM10142d3 != -1) {
                    cVar.f10186c = C0810a.m4148g(cursorM10145b.getBlob(iM10142d3));
                }
                if (iM10142d4 != -1) {
                    cVar.f10187d = cursorM10145b.getInt(iM10142d4);
                }
                cVar.f10188e = arrayList2;
                cVar.f10189f = arrayList3;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            cursorM10145b.close();
        }
    }
}
