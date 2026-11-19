package com.zykj.study.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentKt;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.zykj.base.BaseDialogFragment;
import com.zykj.base.utils.XToastUtils;
import com.zykj.lib.p063ui.R$dimen;
import com.zykj.study.R$layout;
import com.zykj.study.R$string;
import com.zykj.study.databinding.DialogDateSearchBinding;
import com.zykj.study.dialog.DateSelectedDialog;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p106g1.InterfaceC8521g;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class DateSelectedDialog extends BaseDialogFragment<DialogDateSearchBinding> {

    /* renamed from: a */
    public static final C7710a f11171a = new C7710a(null);

    /* renamed from: b */
    public static final int f11172b = 8;

    /* renamed from: com.zykj.study.dialog.DateSelectedDialog$a */
    public static final class C7710a {
        public /* synthetic */ C7710a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C7710a() {
        }
    }

    /* renamed from: m */
    public static final CharSequence m10241m(SimpleDateFormat simpleDateFormat, CalendarDay calendarDay) {
        return simpleDateFormat.format(calendarDay.m3990i());
    }

    /* renamed from: n */
    public static final CharSequence m10242n(SimpleDateFormat simpleDateFormat, CalendarDay calendarDay) {
        return simpleDateFormat.format(calendarDay.m3990i());
    }

    /* renamed from: o */
    public static final void m10243o(DateSelectedDialog dateSelectedDialog, View view) {
        dateSelectedDialog.getMBindView().mcvStartDate.setSelectedDate((CalendarDay) null);
        dateSelectedDialog.getMBindView().mcvEndDate.setSelectedDate((CalendarDay) null);
    }

    /* renamed from: p */
    public static final void m10244p(DateSelectedDialog dateSelectedDialog, View view) {
        MaterialCalendarView mcvStartDate = dateSelectedDialog.getMBindView().mcvStartDate;
        AbstractC9133u.m16132f(mcvStartDate, "mcvStartDate");
        String strM10247l = dateSelectedDialog.m10247l(mcvStartDate, true);
        MaterialCalendarView mcvEndDate = dateSelectedDialog.getMBindView().mcvEndDate;
        AbstractC9133u.m16132f(mcvEndDate, "mcvEndDate");
        String strM10247l2 = dateSelectedDialog.m10247l(mcvEndDate, false);
        if (strM10247l != null && strM10247l.length() != 0 && strM10247l2 != null && strM10247l2.length() != 0 && dateSelectedDialog.getMBindView().mcvStartDate.getSelectedDate().m3994n(dateSelectedDialog.getMBindView().mcvEndDate.getSelectedDate())) {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = dateSelectedDialog.getString(R$string.date_dialog_tip);
            AbstractC9133u.m16132f(string, "getString(...)");
            xToastUtils.toast(string);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("START_DATE", strM10247l);
        bundle.putString("END_DATE", strM10247l2);
        C8736p c8736p = C8736p.f16368a;
        FragmentKt.setFragmentResult(dateSelectedDialog, "REQUEST_DATE", bundle);
        androidx.navigation.fragment.FragmentKt.findNavController(dateSelectedDialog).navigateUp();
    }

    /* renamed from: q */
    public static final void m10245q(DateSelectedDialog dateSelectedDialog, DialogInterface dialogInterface) {
        androidx.navigation.fragment.FragmentKt.findNavController(dateSelectedDialog).navigateUp();
    }

    @Override // com.zykj.base.BaseDialogFragment
    public Object initView(Bundle bundle, InterfaceC9324c interfaceC9324c) throws Resources.NotFoundException {
        String string;
        String string2;
        Window window;
        Dialog dialog = getDialog();
        CalendarDay calendarDayM10246k = null;
        WindowManager.LayoutParams attributes = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getAttributes();
        if (attributes != null) {
            attributes.width = (int) getResources().getDimension(R$dimen.view_350);
        }
        getMBindView().mcvStartDate.m4021L().m4046g().m4053g();
        getMBindView().mcvEndDate.m4021L().m4046g().m4053g();
        MaterialCalendarView materialCalendarView = getMBindView().mcvStartDate;
        Bundle arguments = getArguments();
        materialCalendarView.setSelectedDate((arguments == null || (string2 = arguments.getString("start")) == null) ? null : m10246k(string2));
        MaterialCalendarView materialCalendarView2 = getMBindView().mcvEndDate;
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("end")) != null) {
            calendarDayM10246k = m10246k(string);
        }
        materialCalendarView2.setSelectedDate(calendarDayM10246k);
        String[] strArr = {"日", "一", "二", "三", "四", "五", "六"};
        getMBindView().mcvStartDate.setWeekDayLabels(strArr);
        getMBindView().mcvEndDate.setWeekDayLabels(strArr);
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM");
        getMBindView().mcvStartDate.setTitleFormatter(new InterfaceC8521g() { // from class: p4.e
            @Override // p106g1.InterfaceC8521g
            /* renamed from: a */
            public final CharSequence mo13885a(CalendarDay calendarDay) {
                return DateSelectedDialog.m10241m(simpleDateFormat, calendarDay);
            }
        });
        getMBindView().mcvEndDate.setTitleFormatter(new InterfaceC8521g() { // from class: p4.f
            @Override // p106g1.InterfaceC8521g
            /* renamed from: a */
            public final CharSequence mo13885a(CalendarDay calendarDay) {
                return DateSelectedDialog.m10242n(simpleDateFormat, calendarDay);
            }
        });
        getMBindView().btDialogLeft.setOnClickListener(new View.OnClickListener() { // from class: p4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateSelectedDialog.m10243o(this.f19342a, view);
            }
        });
        getMBindView().btDialogRight.setOnClickListener(new View.OnClickListener() { // from class: p4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DateSelectedDialog.m10244p(this.f19343a, view);
            }
        });
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: p4.i
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    DateSelectedDialog.m10245q(this.f19344a, dialogInterface);
                }
            });
        }
        return C8736p.f16368a;
    }

    /* renamed from: k */
    public final CalendarDay m10246k(String str) {
        if (str == null || AbstractC8661c0.m13993h0(str)) {
            return null;
        }
        return CalendarDay.m3985f(new SimpleDateFormat("yyyy-MM-dd").parse(str));
    }

    /* renamed from: l */
    public final String m10247l(MaterialCalendarView materialCalendarView, boolean z10) {
        CalendarDay selectedDate = materialCalendarView.getSelectedDate();
        SimpleDateFormat simpleDateFormat = z10 ? new SimpleDateFormat("yyyy-MM-dd 00:00:00") : new SimpleDateFormat("yyyy-MM-dd 23:59:59");
        if (selectedDate == null) {
            return null;
        }
        return simpleDateFormat.format(selectedDate.m3990i());
    }

    @Override // com.zykj.base.BaseDialogFragment
    public int layoutId() {
        return R$layout.dialog_date_search;
    }
}
