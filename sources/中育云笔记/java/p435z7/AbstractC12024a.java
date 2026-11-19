package p435z7;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: z7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC12024a extends AbstractC12025b {
    public AbstractC12024a(Context context) {
        super(context);
    }

    /* renamed from: f */
    public abstract void mo246f(Object obj, Object obj2, int i10);

    /* renamed from: g */
    public abstract int mo247g();

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        Object tag;
        if (view == null) {
            view = View.inflate(m26633d(), mo247g(), null);
            tag = mo248h(view);
            view.setTag(tag);
        } else {
            tag = view.getTag();
        }
        Object item = getItem(i10);
        if (item != null) {
            mo246f(tag, item, i10);
        }
        return view;
    }

    /* renamed from: h */
    public abstract Object mo248h(View view);

    public AbstractC12024a(Context context, List list) {
        super(context, list);
    }
}
