package p222k9;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import com.xuexiang.xui.R$id;
import java.util.ArrayList;
import java.util.List;

/* renamed from: k9.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9829a {

    /* renamed from: a */
    public Pools.Pool f23112a;

    /* renamed from: b */
    public List f23113b = new ArrayList();

    /* renamed from: c */
    public List f23114c = new ArrayList();

    /* renamed from: d */
    public ViewGroup f23115d;

    public AbstractC9829a(ViewGroup viewGroup) {
        this.f23115d = viewGroup;
    }

    /* renamed from: a */
    public AbstractC9829a m19928a(Object obj) {
        this.f23113b.add(obj);
        return this;
    }

    /* renamed from: b */
    public abstract void mo13375b(Object obj, View view, int i10);

    /* renamed from: c */
    public void m19929c() {
        this.f23113b.clear();
        m19930e(this.f23114c.size());
    }

    /* renamed from: d */
    public abstract View mo13376d(ViewGroup viewGroup);

    /* renamed from: e */
    public void m19930e(int i10) {
        int size = this.f23114c.size();
        while (size > 0 && i10 > 0) {
            View view = (View) this.f23114c.remove(size - 1);
            if (this.f23112a == null) {
                this.f23112a = new Pools.SimplePool(12);
            }
            Object tag = view.getTag(R$id.xui_view_can_not_cache_tag);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                try {
                    this.f23112a.release(view);
                } catch (Exception unused) {
                }
            }
            this.f23115d.removeView(view);
            size--;
            i10--;
        }
    }

    /* renamed from: f */
    public Object m19931f(int i10) {
        List list = this.f23113b;
        if (list != null && i10 >= 0 && i10 < list.size()) {
            return this.f23113b.get(i10);
        }
        return null;
    }

    /* renamed from: g */
    public int m19932g() {
        List list = this.f23113b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: h */
    public final View m19933h() {
        Pools.Pool pool = this.f23112a;
        View view = pool != null ? (View) pool.acquire() : null;
        return view == null ? mo13376d(this.f23115d) : view;
    }

    /* renamed from: i */
    public List m19934i() {
        return this.f23114c;
    }

    /* renamed from: j */
    public void m19935j() {
        int size = this.f23113b.size();
        int size2 = this.f23114c.size();
        if (size2 > size) {
            m19930e(size2 - size);
        } else if (size2 < size) {
            for (int i10 = 0; i10 < size - size2; i10++) {
                View viewM19933h = m19933h();
                this.f23115d.addView(viewM19933h);
                this.f23114c.add(viewM19933h);
            }
        }
        for (int i11 = 0; i11 < size; i11++) {
            mo13375b(this.f23113b.get(i11), (View) this.f23114c.get(i11), i11);
        }
        this.f23115d.invalidate();
        this.f23115d.requestLayout();
    }
}
