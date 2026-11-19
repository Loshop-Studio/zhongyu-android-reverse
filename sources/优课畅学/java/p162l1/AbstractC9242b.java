package p162l1;

import android.content.Context;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: l1.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9242b extends BaseAdapter {

    /* renamed from: b */
    public Context f18234b;

    /* renamed from: a */
    public final List f18233a = new ArrayList();

    /* renamed from: c */
    public int f18235c = -1;

    public AbstractC9242b(Context context, Collection collection) {
        this.f18234b = context;
        m16950c(collection);
    }

    /* renamed from: a */
    public final boolean m16948a(int i10) {
        return i10 >= 0 && i10 <= this.f18233a.size() - 1;
    }

    /* renamed from: b */
    public Context m16949b() {
        return this.f18234b;
    }

    /* renamed from: c */
    public void m16950c(Collection collection) {
        if (collection != null) {
            this.f18233a.clear();
            this.f18233a.addAll(collection);
            this.f18235c = -1;
            notifyDataSetChanged();
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f18233a.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        if (m16948a(i10)) {
            return this.f18233a.get(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }
}
