package p162l1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;

/* renamed from: l1.a */
/* loaded from: classes4.dex */
public abstract class AbstractC9241a extends AbstractC9242b {
    public AbstractC9241a(Context context, Collection collection) {
        super(context, collection);
    }

    /* renamed from: d */
    public abstract void mo16945d(Object obj, Object obj2, int i10);

    /* renamed from: e */
    public abstract int mo16946e();

    /* renamed from: f */
    public abstract Object mo16947f(View view);

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        Object tag;
        if (view == null) {
            view = View.inflate(m16949b(), mo16946e(), null);
            tag = mo16947f(view);
            view.setTag(tag);
        } else {
            tag = view.getTag();
        }
        Object item = getItem(i10);
        if (item != null) {
            mo16945d(tag, item, i10);
        }
        return view;
    }
}
