package p006a5;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.location.LocationRequestCompat;
import androidx.navigation.C2827b;
import androidx.navigation.C2857e;
import coil3.C3243c;
import coil3.C3259d;
import coil3.decode.InterfaceC3268i;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.C4458a;
import com.zykj.mistake.activity.C4462c;
import com.zykj.mistake.activity.C4466e;
import com.zykj.mistake.activity.C4468f;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC5774b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5823d;
import kotlin.text.AbstractC5855p;
import p119n.InterfaceC6201f;
import p134p.C6357a;
import p152r6.InterfaceC6471c;

/* renamed from: a5.e */
/* loaded from: classes3.dex */
public final class C0014e {

    /* renamed from: a */
    public final /* synthetic */ int f37a;

    /* renamed from: b */
    public final Object f38b;

    /* renamed from: c */
    public final Object f39c;

    /* renamed from: d */
    public final Object f40d;

    /* renamed from: e */
    public final Object f41e;

    /* renamed from: f */
    public final Object f42f;

    public C0014e(MainActivity mainActivity, InterfaceC6471c interfaceC6471c, C4462c c4462c, C4468f c4468f) {
        this.f37a = 1;
        this.f38b = mainActivity;
        this.f40d = interfaceC6471c;
        this.f41e = c4462c;
        this.f42f = c4468f;
        this.f39c = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
    }

    /* renamed from: d */
    public static void m56d(View view) {
        Object objM13956constructorimpl;
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(view.getResources().getResourceEntryName(view.getId()));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
        String str = (String) objM13956constructorimpl;
        if (str == null) {
            str = "";
        }
        if (AbstractC5855p.m5372F(str, "header", true) || AbstractC5855p.m5372F(str, "date_picker_header", true) || AbstractC5855p.m5372F(str, "datePickerHeader", true)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC5830k.m5329f(childAt, "getChildAt(...)");
                m56d(childAt);
            }
        }
    }

    /* renamed from: e */
    public static void m57e(View view) {
        Object objM13956constructorimpl;
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(view.getResources().getResourceEntryName(view.getId()));
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
        String str = (String) objM13956constructorimpl;
        if (str == null) {
            str = "";
        }
        if (AbstractC5855p.m5372F(str, "header", true) || AbstractC5855p.m5372F(str, "date_picker_header", true) || AbstractC5855p.m5372F(str, "datePickerHeader", true)) {
            view.setVisibility(8);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                AbstractC5830k.m5329f(childAt, "getChildAt(...)");
                m57e(childAt);
            }
        }
    }

    /* renamed from: a */
    public void m58a(InterfaceC6201f interfaceC6201f, C5823d c5823d) {
        ((ArrayList) this.f42f).add(new C2857e(2, interfaceC6201f, c5823d));
    }

    /* renamed from: b */
    public void m59b(C6357a c6357a, C5823d c5823d) {
        ((ArrayList) this.f40d).add(new Pair(c6357a, c5823d));
    }

    /* renamed from: c */
    public DatePicker m60c(Calendar calendar) {
        switch (this.f37a) {
            case 0:
                DatePicker datePicker = new DatePicker((MainActivity) this.f38b);
                datePicker.setCalendarViewShown(true);
                datePicker.setSpinnersShown(false);
                datePicker.init(calendar.get(1), calendar.get(2), calendar.get(5), null);
                return datePicker;
            default:
                DatePicker datePicker2 = new DatePicker((MainActivity) this.f38b);
                datePicker2.setCalendarViewShown(true);
                datePicker2.setSpinnersShown(false);
                datePicker2.init(calendar.get(1), calendar.get(2), calendar.get(5), null);
                return datePicker2;
        }
    }

    /* renamed from: f */
    public void m61f(final CollectionDatePickerTarget target, String str, String str2) throws ParseException {
        Calendar calendar;
        Calendar calendar2;
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.f39c;
        MainActivity mainActivity = (MainActivity) this.f38b;
        AbstractC5830k.m5330g(target, "target");
        if (str != null) {
            calendar = Calendar.getInstance();
            Date time = simpleDateFormat.parse(str);
            if (time == null) {
                time = Calendar.getInstance().getTime();
            }
            calendar.setTime(time);
        } else {
            calendar = Calendar.getInstance();
        }
        if (str2 != null) {
            calendar2 = Calendar.getInstance();
            Date time2 = simpleDateFormat.parse(str2);
            if (time2 == null) {
                time2 = Calendar.getInstance().getTime();
            }
            calendar2.setTime(time2);
        } else {
            calendar2 = Calendar.getInstance();
        }
        final Dialog dialog = new Dialog(mainActivity);
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(24, 24, 24, 16);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius((int) (4 * mainActivity.getResources().getDisplayMetrics().density));
        linearLayout.setBackground(gradientDrawable);
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(4);
        AbstractC5830k.m5327d(calendar);
        final DatePicker datePickerM60c = m60c(calendar);
        AbstractC5830k.m5327d(calendar2);
        final DatePicker datePickerM60c2 = m60c(calendar2);
        linearLayout2.addView(datePickerM60c, new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(datePickerM60c2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout linearLayout3 = new LinearLayout(mainActivity);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(17);
        linearLayout3.setPadding(0, 12, 0, 0);
        TextView textView = new TextView(mainActivity);
        textView.setText(mainActivity.getString(R.string.reset));
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.parseColor("#1576FF"));
        textView.setBackgroundResource(R.drawable.bg_filter_reset);
        textView.setOnClickListener(new View.OnClickListener() { // from class: a5.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((C4458a) this.f22a.f42f).invoke(target);
                dialog.dismiss();
            }
        });
        TextView textView2 = new TextView(mainActivity);
        textView2.setText(mainActivity.getString(R.string.confirm));
        textView2.setGravity(17);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(-1);
        textView2.setBackgroundResource(R.drawable.bg_filter_confirm);
        textView2.setOnClickListener(new View.OnClickListener() { // from class: a5.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Calendar calendar3 = Calendar.getInstance();
                DatePicker datePicker = datePickerM60c;
                calendar3.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
                Calendar calendar4 = Calendar.getInstance();
                DatePicker datePicker2 = datePickerM60c2;
                calendar4.set(datePicker2.getYear(), datePicker2.getMonth(), datePicker2.getDayOfMonth());
                boolean zAfter = calendar3.after(calendar4);
                C0014e c0014e = this.f25a;
                if (zAfter) {
                    ((MainActivity) c0014e.f40d).m3907b("开始时间不能大于结束时间");
                    return;
                }
                C4466e c4466e = (C4466e) c0014e.f41e;
                SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) c0014e.f39c;
                String str3 = simpleDateFormat2.format(calendar3.getTime());
                AbstractC5830k.m5329f(str3, "format(...)");
                String str4 = simpleDateFormat2.format(calendar4.getTime());
                AbstractC5830k.m5329f(str4, "format(...)");
                c4466e.invoke(target, str3, str4);
                dialog.dismiss();
            }
        });
        int i = (int) (LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY * mainActivity.getResources().getDisplayMetrics().density);
        int i8 = (int) (42 * mainActivity.getResources().getDisplayMetrics().density);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(i, i8));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i8);
        layoutParams.leftMargin = 56;
        linearLayout3.addView(textView2, layoutParams);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout3);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        datePickerM60c.post(new RunnableC0013d(this, datePickerM60c, datePickerM60c2, new C0012c(linearLayout2, 0), 0));
    }

    public C0014e(MainActivity mainActivity, MainActivity mainActivity2, C4466e c4466e, C4458a c4458a) {
        this.f37a = 0;
        this.f38b = mainActivity;
        this.f40d = mainActivity2;
        this.f41e = c4466e;
        this.f42f = c4458a;
        this.f39c = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
    }

    public C0014e(C3259d c3259d) {
        this.f37a = 2;
        this.f38b = AbstractC5805t.m5218E0(c3259d.f1881a);
        this.f40d = AbstractC5805t.m5218E0(c3259d.f1882b);
        this.f41e = AbstractC5805t.m5218E0(c3259d.f1883c);
        List list = (List) c3259d.f1886f.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2827b((Pair) it.next(), 3));
        }
        this.f42f = arrayList;
        List list2 = (List) c3259d.f1887g.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C3243c((InterfaceC3268i) it2.next(), 0));
        }
        this.f39c = arrayList2;
    }
}
