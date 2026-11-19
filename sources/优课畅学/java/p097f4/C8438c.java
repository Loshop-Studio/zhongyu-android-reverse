package p097f4;

import android.graphics.Canvas;
import java.util.ArrayList;
import java.util.List;
import p073d4.C8289a;
import p120h4.C8712a;

/* renamed from: f4.c */
/* loaded from: classes.dex */
public class C8438c extends AbstractC8436a {

    /* renamed from: g */
    public C8437b f16020g;

    /* renamed from: h */
    public List f16021h = new ArrayList();

    @Override // p097f4.AbstractC8436a
    /* renamed from: a */
    public void mo13779a(C8712a c8712a, Canvas canvas) {
        if (m13782d()) {
            int size = this.f16021h.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((C8437b) this.f16021h.get(i10)).mo13779a(c8712a, canvas);
            }
        }
    }

    @Override // p097f4.AbstractC8436a
    /* renamed from: b */
    public C8289a mo13780b() {
        List list = this.f16021h;
        if (list == null) {
            return new C8289a();
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f16014b = C8289a.m13460a(this.f16014b, ((C8437b) this.f16021h.get(i10)).f16014b);
        }
        return this.f16014b;
    }

    @Override // p097f4.AbstractC8436a
    /* renamed from: c */
    public void mo13781c(int i10) {
        int size = this.f16021h.size();
        for (int i11 = 0; i11 < size; i11++) {
            C8437b c8437b = (C8437b) this.f16021h.get(i11);
            if (c8437b.f16015c == i10) {
                c8437b.m13783e(false);
                return;
            }
            c8437b.mo13781c(i10);
        }
    }

    /* renamed from: f */
    public C8437b m13784f() {
        return this.f16020g;
    }

    /* renamed from: g */
    public void m13785g() {
        C8437b c8437b = this.f16020g;
        if (c8437b != null) {
            for (AbstractC8436a abstractC8436a : c8437b.f16019g) {
                if (abstractC8436a instanceof AbstractC8439d) {
                    ((AbstractC8439d) abstractC8436a).m13786f();
                }
            }
        }
        this.f16021h.clear();
    }
}
