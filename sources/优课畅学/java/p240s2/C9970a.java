package p240s2;

import android.content.Context;
import java.util.List;

/* renamed from: s2.a */
/* loaded from: classes4.dex */
public class C9970a extends AbstractC9971b {

    /* renamed from: f */
    public final List f20009f;

    public C9970a(Context context, List list) {
        super(context);
        this.f20009f = list;
    }

    @Override // p240s2.AbstractC9971b
    /* renamed from: a */
    public Object mo18653a(int i10) {
        if (this.f20009f == null || i10 < 0 || i10 > r0.size() - 1) {
            return null;
        }
        return this.f20009f.get(i10);
    }

    @Override // p240s2.AbstractC9971b
    /* renamed from: c */
    public List mo18654c() {
        return this.f20009f;
    }

    @Override // p240s2.AbstractC9971b, android.widget.Adapter
    public int getCount() {
        if (this.f20009f != null) {
            return r0.size() - 1;
        }
        return 0;
    }

    @Override // p240s2.AbstractC9971b, android.widget.Adapter
    public Object getItem(int i10) {
        return i10 >= m18656d() ? this.f20009f.get(i10 + 1) : this.f20009f.get(i10);
    }
}
