package p020b2;

import java.util.Calendar;
import java.util.Locale;

/* renamed from: b2.b */
/* loaded from: classes4.dex */
public class C5100b implements InterfaceC5106h {

    /* renamed from: b */
    public final Calendar f2208b;

    public C5100b(Calendar calendar) {
        calendar.get(7);
        this.f2208b = calendar;
    }

    @Override // p020b2.InterfaceC5106h
    public CharSequence format(int i9) {
        this.f2208b.set(7, i9);
        return this.f2208b.getDisplayName(7, 1, Locale.getDefault());
    }
}
