package p070b.p074b.p105b.p106a0.p108z;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0768i;
import p070b.p074b.p105b.C0781v;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p110b0.C0757a;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.a0.z.l */
/* loaded from: classes.dex */
public final class C0747l extends AbstractC0783x<Time> {

    /* renamed from: b */
    public static final InterfaceC0784y f4307b = new a();

    /* renamed from: a */
    public final DateFormat f4308a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: b.b.b.a0.z.l$a */
    public class a implements InterfaceC0784y {
        @Override // p070b.p074b.p105b.InterfaceC0784y
        /* renamed from: a */
        public <T> AbstractC0783x<T> mo2367a(C0768i c0768i, C0757a<T> c0757a) {
            if (c0757a.f4386a == Time.class) {
                return new C0747l();
            }
            return null;
        }
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: a */
    public Time mo2370a(C0759a c0759a) {
        synchronized (this) {
            if (c0759a.mo2403v() == EnumC0760b.NULL) {
                c0759a.mo2401r();
                return null;
            }
            try {
                return new Time(this.f4308a.parse(c0759a.mo2402t()).getTime());
            } catch (ParseException e2) {
                throw new C0781v(e2);
            }
        }
    }

    @Override // p070b.p074b.p105b.AbstractC0783x
    /* renamed from: b */
    public void mo2371b(C0761c c0761c, Time time) {
        Time time2 = time;
        synchronized (this) {
            c0761c.mo2413p(time2 == null ? null : this.f4308a.format((Date) time2));
        }
    }
}
