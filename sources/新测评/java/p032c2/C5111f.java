package p032c2;

import android.text.SpannableStringBuilder;
import com.prolificinteractive.materialcalendarview.CalendarDay;

/* renamed from: c2.f */
/* loaded from: classes4.dex */
public class C5111f implements InterfaceC5112g {

    /* renamed from: a */
    public final CharSequence[] f2671a;

    public C5111f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        }
        if (charSequenceArr.length < 12) {
            throw new IllegalArgumentException("Label array is too short");
        }
        this.f2671a = charSequenceArr;
    }

    @Override // p032c2.InterfaceC5112g
    /* renamed from: a */
    public CharSequence mo2727a(CalendarDay calendarDay) {
        return new SpannableStringBuilder().append(this.f2671a[calendarDay.m4422i()]).append((CharSequence) " ").append((CharSequence) String.valueOf(calendarDay.m4423j()));
    }
}
