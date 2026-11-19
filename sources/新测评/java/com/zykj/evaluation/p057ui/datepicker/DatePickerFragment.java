package com.zykj.evaluation.p057ui.datepicker;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.compose.DialogNavigator;
import com.blankj.utilcode.util.TimeUtils;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.xuexiang.xui.widget.picker.widget.configure.TimePickerType;
import com.zykj.evaluation.R;
import com.zykj.evaluation.databinding.FragmentDatePickerBinding;
import com.zykj.evaluation.p057ui.datepicker.DatePickerFragment;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p021b2.InterfaceC4974n;
import p027b8.AbstractC5046c;
import p032c2.InterfaceC5112g;
import p189o5.AbstractC8712h;
import p231s3.C9135a;
import p253u3.InterfaceC9540c;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0018\u001a\u00020\u00002\u001c\u0010\u0017\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J!\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J3\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001d2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050#H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010/\u001a\u00020\u00168\u0002X\u0082D¢\u0006\u0006\n\u0004\b.\u0010(R.\u0010\u0017\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00105\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006>"}, m13558d2 = {"Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;", "Lcom/zykj/evaluation/base/BaseDialogFragment;", "Lcom/zykj/evaluation/databinding/FragmentDatePickerBinding;", "<init>", "()V", "", "s", "", "layoutId", "()I", "", "isFullDialog", "()Z", "Landroid/content/DialogInterface;", DialogNavigator.NAME, "onCancel", "(Landroid/content/DialogInterface;)V", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "", "onConfirmCallback", "F", "(Lkotlin/jvm/functions/Function2;)Lcom/zykj/evaluation/ui/datepicker/DatePickerFragment;", "C", "Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;", "view", "Ljava/util/Date;", "date", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "(Lcom/prolificinteractive/materialcalendarview/MaterialCalendarView;Ljava/util/Date;)V", "isStart", "currentDate", "Lkotlin/Function1;", "callback", "G", "(ZLjava/util/Date;Lkotlin/jvm/functions/Function1;)V", "f", "Ljava/lang/String;", "mcvFormatString", "g", "dateFormatString", "h", "dateWithTimeFormatString", "i", "timeFormatString", "j", "Lkotlin/jvm/functions/Function2;", "Lkotlin/Function0;", "k", "Lkotlin/jvm/functions/Function0;", "onCancelCallback", "Lcom/zykj/evaluation/ui/datepicker/DatePickerFragmentArgs;", "l", "Landroidx/navigation/NavArgsLazy;", "r", "()Lcom/zykj/evaluation/ui/datepicker/DatePickerFragmentArgs;", "args", "m", "a", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nDatePickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/evaluation/ui/datepicker/DatePickerFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n42#2,3:265\n1#3:268\n*S KotlinDebug\n*F\n+ 1 DatePickerFragment.kt\ncom/zykj/evaluation/ui/datepicker/DatePickerFragment\n*L\n41#1:265,3\n*E\n"})
/* loaded from: classes4.dex */
public final class DatePickerFragment extends Hilt_DatePickerFragment<FragmentDatePickerBinding> {

    /* renamed from: m, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n */
    public static final int f9067n = 8;

    /* renamed from: j, reason: from kotlin metadata */
    public Function2 onConfirmCallback;

    /* renamed from: k, reason: from kotlin metadata */
    public Function0 onCancelCallback;

    /* renamed from: f, reason: from kotlin metadata */
    public final String mcvFormatString = "yyyy.MM";

    /* renamed from: g, reason: from kotlin metadata */
    public final String dateFormatString = "yyyy-MM-dd";

    /* renamed from: h, reason: from kotlin metadata */
    public final String dateWithTimeFormatString = "yyyy-MM-dd HH:mm";

    /* renamed from: i, reason: from kotlin metadata */
    public final String timeFormatString = "HH:mm";

    /* renamed from: l, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(DatePickerFragmentArgs.class), new C6888b(this));

    /* renamed from: com.zykj.evaluation.ui.datepicker.DatePickerFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DatePickerFragment m9241a(DatePickerFragmentArgs args) {
            Intrinsics.checkNotNullParameter(args, "args");
            DatePickerFragment datePickerFragment = new DatePickerFragment();
            datePickerFragment.setArguments(args.m9245c());
            return datePickerFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.evaluation.ui.datepicker.DatePickerFragment$b */
    public static final class C6888b implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f9075a;

        public C6888b(Fragment fragment) {
            this.f9075a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f9075a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f9075a + " has null arguments");
        }
    }

    /* renamed from: B */
    public static final CharSequence m9213B(DatePickerFragment datePickerFragment, CalendarDay calendarDay) {
        return TimeUtils.date2String(calendarDay.m4420g(), datePickerFragment.mcvFormatString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static final void m9214D(DatePickerFragment datePickerFragment, MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z9) {
        Intrinsics.checkNotNullParameter(materialCalendarView, "<unused var>");
        Intrinsics.checkNotNullParameter(calendarDay, "<unused var>");
        AppCompatTextView appCompatTextView = ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8734i;
        if (appCompatTextView.isEnabled()) {
            return;
        }
        appCompatTextView.setText("00:00");
        appCompatTextView.setEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: E */
    public static final void m9215E(DatePickerFragment datePickerFragment, MaterialCalendarView materialCalendarView, CalendarDay calendarDay, boolean z9) {
        Intrinsics.checkNotNullParameter(materialCalendarView, "<unused var>");
        Intrinsics.checkNotNullParameter(calendarDay, "<unused var>");
        AppCompatTextView appCompatTextView = ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8732g;
        if (appCompatTextView.isEnabled()) {
            return;
        }
        appCompatTextView.setText("23:59");
        appCompatTextView.setEnabled(true);
    }

    /* renamed from: H */
    public static final void m9216H(Function1 function1, Date date, View view) {
        Intrinsics.checkNotNull(date);
        function1.invoke(date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    private final void m9228s() {
        ((FragmentDatePickerBinding) getMBindView()).f8730e.setOnClickListener(new View.OnClickListener() { // from class: u5.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DatePickerFragment.m9229t(this.f16745a, view);
            }
        });
        AppCompatTextView tvStartTime = ((FragmentDatePickerBinding) getMBindView()).f8734i;
        Intrinsics.checkNotNullExpressionValue(tvStartTime, "tvStartTime");
        AbstractC5046c.m2530f(tvStartTime, 0L, new View.OnClickListener() { // from class: u5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DatePickerFragment.m9230u(this.f16746a, view);
            }
        }, 1, null);
        AppCompatTextView tvEndTime = ((FragmentDatePickerBinding) getMBindView()).f8732g;
        Intrinsics.checkNotNullExpressionValue(tvEndTime, "tvEndTime");
        AbstractC5046c.m2530f(tvEndTime, 0L, new View.OnClickListener() { // from class: u5.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DatePickerFragment.m9232w(this.f16747a, view);
            }
        }, 1, null);
        ((FragmentDatePickerBinding) getMBindView()).f8733h.setOnClickListener(new View.OnClickListener() { // from class: u5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DatePickerFragment.m9234y(this.f16748a, view);
            }
        });
        ((FragmentDatePickerBinding) getMBindView()).f8731f.setOnClickListener(new View.OnClickListener() { // from class: u5.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DatePickerFragment.m9235z(this.f16749a, view);
            }
        });
    }

    /* renamed from: t */
    public static final void m9229t(DatePickerFragment datePickerFragment, View view) {
        Dialog dialog = datePickerFragment.getDialog();
        if (dialog != null) {
            dialog.cancel();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static final void m9230u(final DatePickerFragment datePickerFragment, View view) {
        Date dateString2Date;
        if (((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8729d.getSelectedDate() == null || (dateString2Date = TimeUtils.string2Date(((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8734i.getText().toString(), datePickerFragment.timeFormatString)) == null) {
            return;
        }
        datePickerFragment.m9239G(true, dateString2Date, new Function1() { // from class: u5.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DatePickerFragment.m9231v(this.f16750a, (Date) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v */
    public static final Unit m9231v(DatePickerFragment datePickerFragment, Date it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8734i.setText(TimeUtils.date2String(it, datePickerFragment.timeFormatString));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: w */
    public static final void m9232w(final DatePickerFragment datePickerFragment, View view) {
        Date dateString2Date;
        if (((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8728c.getSelectedDate() == null || (dateString2Date = TimeUtils.string2Date(((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8732g.getText().toString(), datePickerFragment.timeFormatString)) == null) {
            return;
        }
        datePickerFragment.m9239G(false, dateString2Date, new Function1() { // from class: u5.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DatePickerFragment.m9233x(this.f16751a, (Date) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: x */
    public static final Unit m9233x(DatePickerFragment datePickerFragment, Date it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8732g.setText(TimeUtils.date2String(it, datePickerFragment.timeFormatString));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public static final void m9234y(DatePickerFragment datePickerFragment, View view) {
        ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8729d.setSelectedDate((CalendarDay) null);
        ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8729d.setCurrentDate(new Date());
        ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8728c.setSelectedDate((CalendarDay) null);
        ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8728c.setCurrentDate(new Date());
        AppCompatTextView appCompatTextView = ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8734i;
        appCompatTextView.setText("—— : ——");
        appCompatTextView.setEnabled(false);
        AppCompatTextView appCompatTextView2 = ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8732g;
        appCompatTextView2.setText("—— : ——");
        appCompatTextView2.setEnabled(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static final void m9235z(DatePickerFragment datePickerFragment, View view) {
        Date dateM4420g;
        Date dateM4420g2;
        CalendarDay selectedDate = ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8729d.getSelectedDate();
        if (selectedDate == null || (dateM4420g = selectedDate.m4420g()) == null) {
            dateM4420g = null;
        } else {
            Date dateString2Date = TimeUtils.string2Date(((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8734i.getText().toString(), datePickerFragment.timeFormatString);
            if (dateString2Date != null) {
                dateM4420g.setHours(dateString2Date.getHours());
                dateM4420g.setMinutes(dateString2Date.getMinutes());
            }
        }
        CalendarDay selectedDate2 = ((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8728c.getSelectedDate();
        if (selectedDate2 == null || (dateM4420g2 = selectedDate2.m4420g()) == null) {
            dateM4420g2 = null;
        } else {
            Date dateString2Date2 = TimeUtils.string2Date(((FragmentDatePickerBinding) datePickerFragment.getMBindView()).f8732g.getText().toString(), datePickerFragment.timeFormatString);
            if (dateString2Date2 != null) {
                dateM4420g2.setHours(dateString2Date2.getHours());
                dateM4420g2.setMinutes(dateString2Date2.getMinutes());
            }
        }
        if (dateM4420g != null && dateM4420g2 != null && dateM4420g.getTime() > dateM4420g2.getTime()) {
            AbstractC8712h.m14350c("开始时间不能大于结束时间");
            return;
        }
        String strDate2String = dateM4420g != null ? TimeUtils.date2String(dateM4420g) : null;
        String strDate2String2 = dateM4420g2 != null ? TimeUtils.date2String(dateM4420g2) : null;
        Function2 function2 = datePickerFragment.onConfirmCallback;
        if (function2 != null) {
            datePickerFragment.dismiss();
            function2.invoke(strDate2String, strDate2String2);
        }
    }

    /* renamed from: A */
    public final void m9236A(MaterialCalendarView view, Date date) {
        view.m4451L().m4476g().m4483g();
        view.setTitleFormatter(new InterfaceC5112g() { // from class: u5.k
            @Override // p032c2.InterfaceC5112g
            /* renamed from: a */
            public final CharSequence mo2727a(CalendarDay calendarDay) {
                return DatePickerFragment.m9213B(this.f16752a, calendarDay);
            }
        });
        view.setCurrentDate(date);
        view.setSelectedDate(date);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: C */
    public final void m9237C() {
        Object objM24299constructorimpl;
        Date date;
        Object objM24299constructorimpl2;
        Object objM24299constructorimpl3;
        Date dateM24299constructorimpl;
        String strM9244b = m9240r().getStart();
        if (strM9244b.length() == 0) {
            strM9244b = null;
        }
        if (strM9244b != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(TimeUtils.string2Date(strM9244b, this.dateWithTimeFormatString));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
                objM24299constructorimpl = null;
            }
            date = (Date) objM24299constructorimpl;
            if (date == null) {
                try {
                    objM24299constructorimpl2 = Result.m24299constructorimpl(TimeUtils.string2Date(strM9244b, this.dateFormatString));
                } catch (Throwable th2) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM24299constructorimpl2 = Result.m24299constructorimpl(ResultKt.createFailure(th2));
                }
                boolean zM24305isFailureimpl = Result.m24305isFailureimpl(objM24299constructorimpl2);
                Object obj = objM24299constructorimpl2;
                if (zM24305isFailureimpl) {
                    obj = null;
                }
                date = (Date) obj;
            }
        } else {
            date = null;
        }
        String strM9243a = m9240r().getEnd();
        if (strM9243a.length() == 0) {
            strM9243a = null;
        }
        if (strM9243a != null) {
            try {
                Result.Companion companion4 = Result.INSTANCE;
                objM24299constructorimpl3 = Result.m24299constructorimpl(TimeUtils.string2Date(strM9243a, this.dateWithTimeFormatString));
            } catch (Throwable th3) {
                Result.Companion companion5 = Result.INSTANCE;
                objM24299constructorimpl3 = Result.m24299constructorimpl(ResultKt.createFailure(th3));
            }
            if (Result.m24305isFailureimpl(objM24299constructorimpl3)) {
                objM24299constructorimpl3 = null;
            }
            Date date2 = (Date) objM24299constructorimpl3;
            if (date2 == null) {
                try {
                    dateM24299constructorimpl = Result.m24299constructorimpl(TimeUtils.string2Date(strM9243a, this.dateFormatString));
                } catch (Throwable th4) {
                    Result.Companion companion6 = Result.INSTANCE;
                    dateM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th4));
                }
                date = Result.m24305isFailureimpl(dateM24299constructorimpl) ? null : dateM24299constructorimpl;
            } else {
                date = date2;
            }
        }
        MaterialCalendarView materialCalendarView = ((FragmentDatePickerBinding) getMBindView()).f8729d;
        Intrinsics.checkNotNull(materialCalendarView);
        m9236A(materialCalendarView, date);
        materialCalendarView.setOnDateChangedListener(new InterfaceC4974n() { // from class: u5.a
            @Override // p021b2.InterfaceC4974n
            /* renamed from: a */
            public final void mo2445a(MaterialCalendarView materialCalendarView2, CalendarDay calendarDay, boolean z9) {
                DatePickerFragment.m9214D(this.f16742a, materialCalendarView2, calendarDay, z9);
            }
        });
        AppCompatTextView appCompatTextView = ((FragmentDatePickerBinding) getMBindView()).f8734i;
        appCompatTextView.setText(date == null ? "—— : ——" : TimeUtils.date2String(date, this.timeFormatString));
        appCompatTextView.setEnabled(date != null);
        MaterialCalendarView materialCalendarView2 = ((FragmentDatePickerBinding) getMBindView()).f8728c;
        Intrinsics.checkNotNull(materialCalendarView2);
        m9236A(materialCalendarView2, date);
        materialCalendarView2.setOnDateChangedListener(new InterfaceC4974n() { // from class: u5.c
            @Override // p021b2.InterfaceC4974n
            /* renamed from: a */
            public final void mo2445a(MaterialCalendarView materialCalendarView3, CalendarDay calendarDay, boolean z9) {
                DatePickerFragment.m9215E(this.f16744a, materialCalendarView3, calendarDay, z9);
            }
        });
        AppCompatTextView appCompatTextView2 = ((FragmentDatePickerBinding) getMBindView()).f8732g;
        appCompatTextView2.setText(date != null ? TimeUtils.date2String(date, this.timeFormatString) : "—— : ——");
        appCompatTextView2.setEnabled(date != null);
    }

    /* renamed from: F */
    public final DatePickerFragment m9238F(Function2 onConfirmCallback) {
        Intrinsics.checkNotNullParameter(onConfirmCallback, "onConfirmCallback");
        this.onConfirmCallback = onConfirmCallback;
        return this;
    }

    /* renamed from: G */
    public final void m9239G(boolean isStart, Date currentDate, final Function1 callback) {
        String str = isStart ? "开始时间选择" : "截止时间选择";
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        TimePickerType timePickerType = TimePickerType.TIME;
        timePickerType.m5868a()[5] = false;
        C9135a c9135aM15519c = new C9135a(getContext(), new InterfaceC9540c() { // from class: u5.b
            @Override // p253u3.InterfaceC9540c
            /* renamed from: a */
            public final void mo15975a(Date date, View view) {
                DatePickerFragment.m9216H(callback, date, view);
            }
        }).m15521e(timePickerType).m15520d(str).m15519c(calendar, null);
        Window window = requireDialog().getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        Intrinsics.checkNotNull(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        c9135aM15519c.m15518b((ViewGroup) decorView).m15517a().m14943v();
    }

    @Override // com.zykj.evaluation.base.BaseDialogFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        m9237C();
        m9228s();
        return Unit.INSTANCE;
    }

    @Override // com.zykj.evaluation.base.BaseDialogFragment
    public boolean isFullDialog() {
        return true;
    }

    @Override // com.zykj.evaluation.base.BaseDialogFragment
    public int layoutId() {
        return R.layout.fragment_date_picker;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onCancel(dialog);
        Function0 function0 = this.onCancelCallback;
        if (function0 != null) {
            dismissAllowingStateLoss();
            function0.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: r */
    public final DatePickerFragmentArgs m9240r() {
        return (DatePickerFragmentArgs) this.args.getValue();
    }
}
