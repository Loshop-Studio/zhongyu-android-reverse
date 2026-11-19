package p070b.p074b.p075a.p076a.p091m;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: b.b.a.a.m.c0 */
/* loaded from: classes.dex */
public class C0611c0 extends RecyclerView.AbstractC0530d<a> {

    /* renamed from: c */
    public final C0615g<?> f3731c;

    /* renamed from: b.b.a.a.m.c0$a */
    public static class a extends RecyclerView.AbstractC0552z {

        /* renamed from: t */
        public final TextView f3732t;

        public a(TextView textView) {
            super(textView);
            this.f3732t = textView;
        }
    }

    public C0611c0(C0615g<?> c0615g) {
        this.f3731c = c0615g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0530d
    /* renamed from: a */
    public int mo1891a() {
        return this.f3731c.f3741Y.f3706f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0530d
    /* renamed from: c */
    public void mo1893c(RecyclerView.AbstractC0552z abstractC0552z, int i) {
        a aVar = (a) abstractC0552z;
        int i2 = this.f3731c.f3741Y.f3702b.f3797e + i;
        String string = aVar.f3732t.getContext().getString(C1088R.string.mtrl_picker_navigate_to_year_description);
        aVar.f3732t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        aVar.f3732t.setContentDescription(String.format(string, Integer.valueOf(i2)));
        C0610c c0610c = this.f3731c.f3744b0;
        Calendar calendarM2180d = C0607a0.m2180d();
        C0608b c0608b = calendarM2180d.get(1) == i2 ? c0610c.f3728f : c0610c.f3726d;
        Iterator<Long> it = this.f3731c.f3740X.m2193j().iterator();
        while (it.hasNext()) {
            calendarM2180d.setTimeInMillis(it.next().longValue());
            if (calendarM2180d.get(1) == i2) {
                c0608b = c0610c.f3727e;
            }
        }
        c0608b.m2184b(aVar.f3732t);
        aVar.f3732t.setOnClickListener(new ViewOnClickListenerC0609b0(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0530d
    /* renamed from: d */
    public RecyclerView.AbstractC0552z mo1894d(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1088R.layout.mtrl_calendar_year, viewGroup, false));
    }

    /* renamed from: e */
    public int m2185e(int i) {
        return i - this.f3731c.f3741Y.f3702b.f3797e;
    }
}
