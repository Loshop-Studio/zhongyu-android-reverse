package p193i9;

import android.content.Context;
import java.util.List;

/* renamed from: i9.a */
/* loaded from: classes5.dex */
public class C9615a extends AbstractC9616b {

    /* renamed from: h */
    public final List f22142h;

    public C9615a(Context context, List list) {
        super(context);
        this.f22142h = list;
    }

    @Override // p193i9.AbstractC9616b
    /* renamed from: a */
    public Object mo18844a(int i10) {
        if (this.f22142h == null || i10 < 0 || i10 > r0.size() - 1) {
            return null;
        }
        return this.f22142h.get(i10);
    }

    @Override // p193i9.AbstractC9616b
    /* renamed from: c */
    public List mo18845c() {
        return this.f22142h;
    }

    @Override // p193i9.AbstractC9616b, android.widget.Adapter
    public int getCount() {
        if (this.f22142h != null) {
            return r0.size() - 1;
        }
        return 0;
    }

    @Override // p193i9.AbstractC9616b, android.widget.Adapter
    public Object getItem(int i10) {
        return i10 >= m18847d() ? this.f22142h.get(i10 + 1) : this.f22142h.get(i10);
    }
}
