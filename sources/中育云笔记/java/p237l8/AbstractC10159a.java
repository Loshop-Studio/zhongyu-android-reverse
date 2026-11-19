package p237l8;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p435z7.AbstractC12024a;

/* renamed from: l8.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10159a extends AbstractC12024a {

    /* renamed from: f */
    public List f24212f;

    /* renamed from: g */
    public List f24213g;

    public AbstractC10159a(Context context) {
        super(context);
        this.f24212f = new ArrayList();
    }

    /* renamed from: i */
    public void m21195i(List list) {
        m26630a(list);
    }

    /* renamed from: j */
    public void m21196j(List list) {
        m26632c();
        m21195i(list);
    }

    /* renamed from: k */
    public List m21197k() {
        return this.f24212f;
    }

    /* renamed from: l */
    public int m21198l() {
        List listM21199m = m21199m();
        if (listM21199m == null || listM21199m.size() <= 0) {
            return -1;
        }
        return ((Integer) listM21199m.get(0)).intValue();
    }

    /* renamed from: m */
    public List m21199m() {
        List list = this.f24213g;
        return list != null ? list : m21197k();
    }

    /* renamed from: n */
    public Object m21200n() {
        return getItem(m21198l());
    }

    /* renamed from: o */
    public boolean m21201o(int i10) {
        for (int i11 = 0; i11 < this.f24212f.size(); i11++) {
            if (((Integer) this.f24212f.get(i11)).intValue() == i10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public AbstractC10159a m21202p(List list) {
        this.f24213g = list;
        return this;
    }

    /* renamed from: q */
    public AbstractC10159a m21203q(int[] iArr) {
        this.f24212f.clear();
        for (int i10 : iArr) {
            this.f24212f.add(Integer.valueOf(i10));
        }
        notifyDataSetChanged();
        return this;
    }
}
