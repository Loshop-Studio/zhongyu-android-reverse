package p435z7;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z7.b */
/* loaded from: classes5.dex */
public abstract class AbstractC12025b extends BaseAdapter {

    /* renamed from: d */
    public Context f28396d;

    /* renamed from: c */
    public final List f28395c = new ArrayList();

    /* renamed from: e */
    public int f28397e = -1;

    public AbstractC12025b(Context context) {
        this.f28396d = context;
    }

    /* renamed from: a */
    public void m26630a(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f28395c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final boolean m26631b(int i10) {
        return i10 >= 0 && i10 <= this.f28395c.size() - 1;
    }

    /* renamed from: c */
    public void m26632c() {
        this.f28395c.clear();
        this.f28397e = -1;
    }

    /* renamed from: d */
    public Context m26633d() {
        return this.f28396d;
    }

    /* renamed from: e */
    public void m26634e(List list) {
        if (list != null) {
            this.f28395c.clear();
            this.f28395c.addAll(list);
            this.f28397e = -1;
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f28395c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        if (m26631b(i10)) {
            return this.f28395c.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    public AbstractC12025b(Context context, List list) {
        this.f28396d = context;
        m26634e(list);
    }
}
