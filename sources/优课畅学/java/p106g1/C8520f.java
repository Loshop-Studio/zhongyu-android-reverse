package p106g1;

import android.text.SpannableStringBuilder;
import com.prolificinteractive.materialcalendarview.CalendarDay;

/* renamed from: g1.f */
/* loaded from: classes4.dex */
public class C8520f implements InterfaceC8521g {

    /* renamed from: a */
    public final CharSequence[] f16105a;

    public C8520f(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            throw new IllegalArgumentException("Label array cannot be null");
        }
        if (charSequenceArr.length < 12) {
            throw new IllegalArgumentException("Label array is too short");
        }
        this.f16105a = charSequenceArr;
    }

    @Override // p106g1.InterfaceC8521g
    /* renamed from: a */
    public CharSequence mo13885a(CalendarDay calendarDay) {
        return new SpannableStringBuilder().append(this.f16105a[calendarDay.m3992k()]).append((CharSequence) " ").append((CharSequence) String.valueOf(calendarDay.m3993l()));
    }
}
