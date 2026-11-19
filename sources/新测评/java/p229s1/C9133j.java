package p229s1;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6327a;
import java.util.HashMap;

/* renamed from: s1.j */
/* loaded from: classes4.dex */
public class C9133j {

    /* renamed from: a */
    public final HashMap f15861a;

    /* renamed from: b */
    public final SparseArray f15862b;

    public C9133j() {
        this(new HashMap(), new SparseArray());
    }

    /* renamed from: a */
    public void m15513a(C6327a c6327a, int i10) {
        String strM15514b = m15514b(c6327a);
        this.f15861a.put(strM15514b, Integer.valueOf(i10));
        this.f15862b.put(i10, strM15514b);
    }

    /* renamed from: b */
    public String m15514b(C6327a c6327a) {
        return c6327a.mo4388f() + c6327a.m4375A() + c6327a.mo4384b();
    }

    /* renamed from: c */
    public Integer m15515c(C6327a c6327a) {
        Integer num = (Integer) this.f15861a.get(m15514b(c6327a));
        if (num != null) {
            return num;
        }
        return null;
    }

    /* renamed from: d */
    public void m15516d(int i10) {
        String str = (String) this.f15862b.get(i10);
        if (str != null) {
            this.f15861a.remove(str);
            this.f15862b.remove(i10);
        }
    }

    public C9133j(HashMap map, SparseArray sparseArray) {
        this.f15861a = map;
        this.f15862b = sparseArray;
    }
}
