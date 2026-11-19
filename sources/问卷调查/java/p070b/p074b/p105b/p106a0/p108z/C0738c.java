package p070b.p074b.p105b.p106a0.p108z;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p106a0.C0726p;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0761c;

/* renamed from: b.b.b.a0.z.c */
/* loaded from: classes.dex */
public final class C0738c extends AbstractC0783x<Date> {

    /* renamed from: b */
    public static final InterfaceC0784y f4268b = new a();

    /* renamed from: a */
    public final List<DateFormat> f4269a;

    /* renamed from: b.b.b.a0.z.c$a */
    public class a implements InterfaceC0784y {
        @Override // p070b.p074b.p105b.InterfaceC0784y
        /* renamed from: a */
        public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
            if (c0757a.f4386a == Date.class) {
                return new C0738c();
            }
            return null;
        }
    }

    public C0738c() {
        ArrayList arrayList = new ArrayList();
        this.f4269a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C0726p.f4232a >= 9) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r3 = p070b.p074b.p105b.p106a0.p108z.p109t.C0755a.m2424b(r3, new java.text.ParsePosition(0));
     */
    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Date mo2370a(p070b.p074b.p105b.p111c0.C0759a r3) {
        /*
            r2 = this;
            b.b.b.c0.b r0 = r3.mo2403v()
            b.b.b.c0.b r1 = p070b.p074b.p105b.p111c0.EnumC0760b.NULL
            if (r0 != r1) goto Ld
            r3.mo2401r()
            r3 = 0
            goto L34
        Ld:
            java.lang.String r3 = r3.mo2402t()
            monitor-enter(r2)
            java.util.List<java.text.DateFormat> r0 = r2.f4269a     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3c
            goto L33
        L29:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            java.util.Date r3 = p070b.p074b.p105b.p106a0.p108z.p109t.C0755a.m2424b(r3, r0)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
        L33:
            monitor-exit(r2)
        L34:
            return r3
        L35:
            r0 = move-exception
            b.b.b.v r1 = new b.b.b.v     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p070b.p074b.p105b.p106a0.p108z.C0738c.mo2370a(b.b.b.c0.a):java.lang.Object");
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, Date date) {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                c0761c.mo2409h();
            } else {
                c0761c.mo2413p(this.f4269a.get(0).format(date2));
            }
        }
    }
}
