package com.zykj.mistake.feature.collection.detail;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.location.LocationRequestCompat;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.C4462c;
import com.zykj.mistake.activity.MainActivity;
import com.zykj.mistake.feature.collection.filter.C4646d0;
import com.zykj.mistake.feature.collection.filter.C4683w;
import com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel;
import com.zykj.mistake.feature.notebook.detail.C4794f2;
import com.zykj.mistake.feature.notebook.detail.C4883u1;
import com.zykj.mistake.feature.notebook.detail.C4889v1;
import com.zykj.mistake.feature.notebook.detail.C4901x1;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.main.AbstractC5020a0;
import com.zykj.mistake.main.C5068q;
import com.zykj.mistake.main.C5070r;
import com.zykj.mistake.main.C5074t;
import com.zykj.mistake.main.C5080w;
import com.zykj.mistake.main.C5082x;
import com.zykj.mistake.main.C5084y;
import com.zykj.mistake.main.C5086z;
import com.zykj.mistake.main.C5087z0;
import com.zykj.mistake.main.TagEditorTarget;
import com.zykj.mistake.platform.picker.CollectionDatePickerTarget;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p006a5.C0012c;
import p006a5.C0014e;
import p006a5.RunnableC0017h;
import p006a5.ViewOnClickListenerC0015f;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p212z4.C6820g;

/* renamed from: com.zykj.mistake.feature.collection.detail.f */
/* loaded from: classes3.dex */
public final class C4590f implements InterfaceC5912g {

    /* renamed from: a */
    public final /* synthetic */ int f6475a;

    /* renamed from: b */
    public final /* synthetic */ Object f6476b;

    public /* synthetic */ C4590f(Object obj, int i) {
        this.f6475a = i;
        this.f6476b = obj;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    public final Object emit(Object obj, InterfaceC5631c interfaceC5631c) throws ParseException {
        Calendar calendar;
        Calendar calendar2;
        switch (this.f6475a) {
            case 0:
                AbstractC5020a0 abstractC5020a0 = (AbstractC5020a0) obj;
                MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = (MistakeCollectionDetailViewModel) this.f6476b;
                if (abstractC5020a0 instanceof C5068q) {
                    C5068q c5068q = (C5068q) abstractC5020a0;
                    if (c5068q.f7953a == CollectionDatePickerTarget.DETAIL_FILTER) {
                        mistakeCollectionDetailViewModel.m4027d(new C4625w(c5068q.f7954b, c5068q.f7955c));
                    }
                } else if ((abstractC5020a0 instanceof C5070r) && ((C5070r) abstractC5020a0).f7958a == CollectionDatePickerTarget.DETAIL_FILTER) {
                    mistakeCollectionDetailViewModel.m4027d(C4602k0.f6506a);
                }
                break;
            case 1:
                AbstractC5020a0 abstractC5020a02 = (AbstractC5020a0) obj;
                MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel = (MistakeCollectionFilterResultViewModel) this.f6476b;
                if (abstractC5020a02 instanceof C5068q) {
                    C5068q c5068q2 = (C5068q) abstractC5020a02;
                    if (c5068q2.f7953a == CollectionDatePickerTarget.FILTER_RESULT) {
                        mistakeCollectionFilterResultViewModel.m4068c(new C4683w(c5068q2.f7954b, c5068q2.f7955c));
                    }
                } else if ((abstractC5020a02 instanceof C5070r) && ((C5070r) abstractC5020a02).f7958a == CollectionDatePickerTarget.FILTER_RESULT) {
                    mistakeCollectionFilterResultViewModel.m4068c(C4646d0.f6594a);
                }
                break;
            case 2:
                AbstractC5020a0 abstractC5020a03 = (AbstractC5020a0) obj;
                MistakeDetailNewViewModel mistakeDetailNewViewModel = (MistakeDetailNewViewModel) this.f6476b;
                if (AbstractC5830k.m5325b(abstractC5020a03, C5074t.f7962a)) {
                    mistakeDetailNewViewModel.m4162t(C4883u1.f7336a);
                } else if (abstractC5020a03 instanceof C5080w) {
                    C5080w c5080w = (C5080w) abstractC5020a03;
                    if (c5080w.f7968a == TagEditorTarget.DETAIL) {
                        C5087z0 c5087z0 = c5080w.f7969b;
                        mistakeDetailNewViewModel.m4162t(new C4889v1(c5087z0.f7981a, c5087z0.f7982b, c5087z0.f7983c, c5087z0.f7984d, c5087z0.f7985e));
                    }
                } else if (abstractC5020a03 instanceof C5082x) {
                    C5082x c5082x = (C5082x) abstractC5020a03;
                    if (c5082x.f7971a == TagEditorTarget.DETAIL) {
                        mistakeDetailNewViewModel.m4162t(new C4901x1(c5082x.f7972b));
                    }
                } else if (abstractC5020a03 instanceof C5084y) {
                    C5084y c5084y = (C5084y) abstractC5020a03;
                    if (c5084y.f7974a == TagEditorTarget.DETAIL) {
                        mistakeDetailNewViewModel.m4162t(new C4794f2(c5084y.f7975b, c5084y.f7976c, c5084y.f7977d));
                    }
                }
                break;
            default:
                AbstractC5020a0 abstractC5020a04 = (AbstractC5020a0) obj;
                if (abstractC5020a04 instanceof C5086z) {
                    final C0014e c0014e = ((C6820g) this.f6476b).f11554b;
                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) c0014e.f39c;
                    C5086z c5086z = (C5086z) abstractC5020a04;
                    String str = c5086z.f7979a;
                    String str2 = c5086z.f7980b;
                    MainActivity mainActivity = (MainActivity) c0014e.f38b;
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
                    final DatePicker datePickerM60c = c0014e.m60c(calendar);
                    AbstractC5830k.m5327d(calendar2);
                    final DatePicker datePickerM60c2 = c0014e.m60c(calendar2);
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
                    textView.setOnClickListener(new ViewOnClickListenerC0015f(0, c0014e, dialog));
                    TextView textView2 = new TextView(mainActivity);
                    textView2.setText(mainActivity.getString(R.string.confirm));
                    textView2.setGravity(17);
                    textView2.setTextSize(14.0f);
                    textView2.setTextColor(-1);
                    textView2.setBackgroundResource(R.drawable.bg_filter_confirm);
                    textView2.setOnClickListener(new View.OnClickListener() { // from class: a5.g
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Calendar calendar3 = Calendar.getInstance();
                            DatePicker datePicker = datePickerM60c;
                            calendar3.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
                            Calendar calendar4 = Calendar.getInstance();
                            DatePicker datePicker2 = datePickerM60c2;
                            calendar4.set(datePicker2.getYear(), datePicker2.getMonth(), datePicker2.getDayOfMonth());
                            boolean zAfter = calendar3.after(calendar4);
                            C0014e c0014e2 = c0014e;
                            if (zAfter) {
                                ((InterfaceC6471c) c0014e2.f40d).invoke("开始时间不能大于结束时间");
                                return;
                            }
                            C4462c c4462c = (C4462c) c0014e2.f41e;
                            SimpleDateFormat simpleDateFormat2 = (SimpleDateFormat) c0014e2.f39c;
                            String str3 = simpleDateFormat2.format(calendar3.getTime());
                            AbstractC5830k.m5329f(str3, "format(...)");
                            String str4 = simpleDateFormat2.format(calendar4.getTime());
                            AbstractC5830k.m5329f(str4, "format(...)");
                            c4462c.invoke(str3, str4);
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
                    datePickerM60c.post(new RunnableC0017h(c0014e, datePickerM60c, datePickerM60c2, new C0012c(linearLayout2, 1)));
                }
                break;
        }
        return C5443s.f8405a;
    }
}
