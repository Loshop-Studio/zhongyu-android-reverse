package p020b2;

import android.text.SpannableStringBuilder;
import com.prolificinteractive.materialcalendarview.CalendarDay;

/* renamed from: b2.f */
/* loaded from: classes4.dex */
public class C5104f implements InterfaceC5105g {

    /* renamed from: a */
    public final CharSequence[] f2212a;

    public C5104f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        }
        if (charSequenceArr.length < 12) {
            throw new IllegalArgumentException("Label array is too short");
        }
        this.f2212a = charSequenceArr;
    }

    @Override // p020b2.InterfaceC5105g
    /* renamed from: a */
    public CharSequence mo2164a(CalendarDay calendarDay) {
        return new SpannableStringBuilder().append(this.f2212a[calendarDay.m4627i()]).append((CharSequence) " ").append((CharSequence) String.valueOf(calendarDay.m4628j()));
    }
}
