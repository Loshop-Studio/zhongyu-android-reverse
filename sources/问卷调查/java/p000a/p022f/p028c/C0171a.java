package p000a.p022f.p028c;

import android.content.Context;
import android.util.AttributeSet;
import p000a.p022f.p025b.p026i.C0147a;

/* renamed from: a.f.c.a */
/* loaded from: classes.dex */
public class C0171a extends AbstractC0173c {

    /* renamed from: h */
    public int f1222h;

    /* renamed from: i */
    public int f1223i;

    /* renamed from: j */
    public C0147a f1224j;

    public C0171a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // p000a.p022f.p028c.AbstractC0173c
    /* renamed from: e */
    public void mo657e(AttributeSet attributeSet) {
        super.mo657e(null);
        C0147a c0147a = new C0147a();
        this.f1224j = c0147a;
        this.f1243e = c0147a;
        m668j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 == 6) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r0 == 6) goto L9;
     */
    @Override // p000a.p022f.p028c.AbstractC0173c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo658f(p000a.p022f.p025b.p026i.C0150d r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f1222h
            r3.f1223i = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto Le
            if (r0 != r2) goto Lb
            goto L16
        Lb:
            if (r0 != r1) goto L18
            goto L10
        Le:
            if (r0 != r2) goto L14
        L10:
            r5 = 0
        L11:
            r3.f1223i = r5
            goto L18
        L14:
            if (r0 != r1) goto L18
        L16:
            r5 = 1
            goto L11
        L18:
            boolean r5 = r4 instanceof p000a.p022f.p025b.p026i.C0147a
            if (r5 == 0) goto L22
            a.f.b.i.a r4 = (p000a.p022f.p025b.p026i.C0147a) r4
            int r5 = r3.f1223i
            r4.f1032g0 = r5
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p022f.p028c.C0171a.mo658f(a.f.b.i.d, boolean):void");
    }

    public int getMargin() {
        return this.f1224j.f1034i0;
    }

    public int getType() {
        return this.f1222h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1224j.f1033h0 = z;
    }

    public void setDpMargin(int i) {
        this.f1224j.f1034i0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1224j.f1034i0 = i;
    }

    public void setType(int i) {
        this.f1222h = i;
    }
}
