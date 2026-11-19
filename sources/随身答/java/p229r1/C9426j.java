package p229r1;

import android.util.SparseArray;
import com.liulishuo.okdownload.C6593a;
import java.util.HashMap;

/* renamed from: r1.j */
/* loaded from: classes4.dex */
public class C9426j {

    /* renamed from: a */
    public final HashMap f16448a;

    /* renamed from: b */
    public final SparseArray f16449b;

    public C9426j() {
        this(new HashMap(), new SparseArray());
    }

    /* renamed from: a */
    public void m15567a(C6593a c6593a, int i9) {
        String strM15568b = m15568b(c6593a);
        this.f16448a.put(strM15568b, Integer.valueOf(i9));
        this.f16449b.put(i9, strM15568b);
    }

    /* renamed from: b */
    public String m15568b(C6593a c6593a) {
        return c6593a.mo4592f() + c6593a.m4579A() + c6593a.mo4588b();
    }

    /* renamed from: c */
    public Integer m15569c(C6593a c6593a) {
        Integer num = (Integer) this.f16448a.get(m15568b(c6593a));
        if (num != null) {
            return num;
        }
        return null;
    }

    /* renamed from: d */
    public void m15570d(int i9) {
        String str = (String) this.f16449b.get(i9);
        if (str != null) {
            this.f16448a.remove(str);
            this.f16449b.remove(i9);
        }
    }

    public C9426j(HashMap map, SparseArray sparseArray) {
        this.f16448a = map;
        this.f16449b = sparseArray;
    }
}
