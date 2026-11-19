package p070b.p074b.p075a.p076a.p091m;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Calendar;
import java.util.Locale;

/* renamed from: b.b.a.a.m.f */
/* loaded from: classes.dex */
public class C0614f extends BaseAdapter {

    /* renamed from: e */
    public static final int f3734e;

    /* renamed from: b */
    public final Calendar f3735b;

    /* renamed from: c */
    public final int f3736c;

    /* renamed from: d */
    public final int f3737d;

    static {
        f3734e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C0614f() {
        Calendar calendarM2181e = C0607a0.m2181e();
        this.f3735b = calendarM2181e;
        this.f3736c = calendarM2181e.getMaximum(7);
        this.f3737d = calendarM2181e.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3736c;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.f3736c;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f3737d;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1088R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f3735b;
        int i2 = i + this.f3737d;
        int i3 = this.f3736c;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f3735b.getDisplayName(7, f3734e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C1088R.string.mtrl_picker_day_of_week_column_header), this.f3735b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
