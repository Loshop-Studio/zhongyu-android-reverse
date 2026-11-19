package p070b.p074b.p105b.p106a0.p108z;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.C0781v;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.a0.z.k */
/* loaded from: classes.dex */
public final class C0746k extends AbstractC0783x<Date> {

    /* renamed from: b */
    public static final InterfaceC0784y f4305b = new a();

    /* renamed from: a */
    public final DateFormat f4306a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: b.b.b.a0.z.k$a */
    public class a implements InterfaceC0784y {
        @Override // p070b.p074b.p105b.InterfaceC0784y
        /* renamed from: a */
        public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
            if (c0757a.f4386a == Date.class) {
                return new C0746k();
            }
            return null;
        }
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public Date mo2370a(C0759a c0759a) {
        Date date;
        synchronized (this) {
            if (c0759a.mo2403v() == EnumC0760b.NULL) {
                c0759a.mo2401r();
                date = null;
            } else {
                try {
                    date = new Date(this.f4306a.parse(c0759a.mo2402t()).getTime());
                } catch (ParseException e2) {
                    throw new C0781v(e2);
                }
            }
        }
        return date;
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, Date date) {
        Date date2 = date;
        synchronized (this) {
            c0761c.mo2413p(date2 == null ? null : this.f4306a.format((java.util.Date) date2));
        }
    }
}
