package p097f4;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.List;
import p073d4.C8289a;
import p120h4.C8712a;

/* renamed from: f4.b */
/* loaded from: classes.dex */
public class C8437b extends AbstractC8436a {

    /* renamed from: g */
    public List f16019g = new ArrayList();

    @Override // p097f4.AbstractC8436a
    /* renamed from: a */
    public void mo13779a(C8712a c8712a, Canvas canvas) {
        if (m13782d()) {
            int size = this.f16019g.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC8436a) this.f16019g.get(i10)).mo13779a(c8712a, canvas);
            }
        }
    }

    @Override // p097f4.AbstractC8436a
    /* renamed from: b */
    public C8289a mo13780b() {
        List list = this.f16019g;
        if (list == null) {
            return new C8289a();
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f16014b = C8289a.m13460a(this.f16014b, ((AbstractC8436a) this.f16019g.get(i10)).mo13780b());
        }
        return this.f16014b;
    }

    @Override // p097f4.AbstractC8436a
    /* renamed from: c */
    public void mo13781c(int i10) {
        int size = this.f16019g.size();
        for (int i11 = 0; i11 < size; i11++) {
            AbstractC8436a abstractC8436a = (AbstractC8436a) this.f16019g.get(i11);
            if (abstractC8436a.f16015c == i10) {
                abstractC8436a.m13783e(false);
                return;
            }
            abstractC8436a.mo13781c(i10);
        }
    }
}
