package p032c2;

import java.util.Calendar;
import java.util.Locale;

/* renamed from: c2.b */
/* loaded from: classes4.dex */
public class C5107b implements InterfaceC5113h {

    /* renamed from: b */
    public final Calendar f2667b;

    public C5107b(Calendar calendar) {
        calendar.get(7);
        this.f2667b = calendar;
    }

    @Override // p032c2.InterfaceC5113h
    public CharSequence format(int i10) {
        this.f2667b.set(7, i10);
        return this.f2667b.getDisplayName(7, 1, Locale.getDefault());
    }
}
