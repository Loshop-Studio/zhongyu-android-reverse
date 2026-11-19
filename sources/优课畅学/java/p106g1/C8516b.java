package p106g1;

import java.util.Calendar;
import java.util.Locale;

/* renamed from: g1.b */
/* loaded from: classes4.dex */
public class C8516b implements InterfaceC8522h {

    /* renamed from: b */
    public final Calendar f16101b;

    public C8516b(Calendar calendar) {
        calendar.get(7);
        this.f16101b = calendar;
    }

    @Override // p106g1.InterfaceC8522h
    public CharSequence format(int i10) {
        this.f16101b.set(7, i10);
        return this.f16101b.getDisplayName(7, 1, Locale.getDefault());
    }
}
