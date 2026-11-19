package p070b.p074b.p075a.p076a.p091m;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: b.b.a.a.m.t */
/* loaded from: classes.dex */
public class C0628t extends BaseAdapter {

    /* renamed from: f */
    public static final int f3801f = C0607a0.m2181e().getMaximum(4);

    /* renamed from: b */
    public final C0627s f3802b;

    /* renamed from: c */
    public final InterfaceC0612d<?> f3803c;

    /* renamed from: d */
    public C0610c f3804d;

    /* renamed from: e */
    public final C0606a f3805e;

    public C0628t(C0627s c0627s, InterfaceC0612d<?> interfaceC0612d, C0606a c0606a) {
        this.f3802b = c0627s;
        this.f3803c = interfaceC0612d;
        this.f3805e = c0606a;
    }

    /* renamed from: a */
    public int m2212a() {
        return this.f3802b.m2209q();
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.f3802b.m2209q() || i > m2214c()) {
            return null;
        }
        C0627s c0627s = this.f3802b;
        int iM2209q = (i - c0627s.m2209q()) + 1;
        Calendar calendarM2178b = C0607a0.m2178b(c0627s.f3794b);
        calendarM2178b.set(5, iM2209q);
        return Long.valueOf(calendarM2178b.getTimeInMillis());
    }

    /* renamed from: c */
    public int m2214c() {
        return (this.f3802b.m2209q() + this.f3802b.f3799g) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return m2212a() + this.f3802b.f3799g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f3802b.f3798f;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p075a.p076a.p091m.C0628t.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
