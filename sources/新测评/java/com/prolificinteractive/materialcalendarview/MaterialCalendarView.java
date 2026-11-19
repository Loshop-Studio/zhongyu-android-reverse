package com.prolificinteractive.materialcalendarview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p021b2.AbstractC4963c;
import p021b2.C4962b;
import p021b2.C4967g;
import p021b2.C4970j;
import p021b2.C4972l;
import p021b2.C4977q;
import p021b2.InterfaceC4973m;
import p021b2.InterfaceC4974n;
import p021b2.InterfaceC4975o;
import p021b2.InterfaceC4976p;
import p032c2.C5106a;
import p032c2.C5109d;
import p032c2.C5111f;
import p032c2.InterfaceC5110e;
import p032c2.InterfaceC5112g;
import p032c2.InterfaceC5113h;

/* loaded from: classes4.dex */
public class MaterialCalendarView extends ViewGroup {

    /* renamed from: C */
    public static final InterfaceC5112g f4739C = new C5109d();

    /* renamed from: A */
    public boolean f4740A;

    /* renamed from: B */
    public C6337f f4741B;

    /* renamed from: a */
    public final C4977q f4742a;

    /* renamed from: b */
    public final TextView f4743b;

    /* renamed from: c */
    public final C4970j f4744c;

    /* renamed from: d */
    public final C4970j f4745d;

    /* renamed from: e */
    public final C4962b f4746e;

    /* renamed from: f */
    public AbstractC4963c f4747f;

    /* renamed from: g */
    public CalendarDay f4748g;

    /* renamed from: h */
    public LinearLayout f4749h;

    /* renamed from: i */
    public CalendarMode f4750i;

    /* renamed from: j */
    public boolean f4751j;

    /* renamed from: k */
    public final ArrayList f4752k;

    /* renamed from: l */
    public final View.OnClickListener f4753l;

    /* renamed from: m */
    public final ViewPager.OnPageChangeListener f4754m;

    /* renamed from: n */
    public CalendarDay f4755n;

    /* renamed from: o */
    public CalendarDay f4756o;

    /* renamed from: p */
    public InterfaceC4974n f4757p;

    /* renamed from: q */
    public CharSequence f4758q;

    /* renamed from: r */
    public int f4759r;

    /* renamed from: s */
    public int f4760s;

    /* renamed from: t */
    public Drawable f4761t;

    /* renamed from: u */
    public Drawable f4762u;

    /* renamed from: v */
    public int f4763v;

    /* renamed from: w */
    public int f4764w;

    /* renamed from: x */
    public int f4765x;

    /* renamed from: y */
    public boolean f4766y;

    /* renamed from: z */
    public int f4767z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6331a();

        /* renamed from: a */
        public int f4768a;

        /* renamed from: b */
        public int f4769b;

        /* renamed from: c */
        public int f4770c;

        /* renamed from: d */
        public int f4771d;

        /* renamed from: e */
        public boolean f4772e;

        /* renamed from: f */
        public CalendarDay f4773f;

        /* renamed from: g */
        public CalendarDay f4774g;

        /* renamed from: h */
        public List f4775h;

        /* renamed from: i */
        public int f4776i;

        /* renamed from: j */
        public int f4777j;

        /* renamed from: k */
        public int f4778k;

        /* renamed from: l */
        public int f4779l;

        /* renamed from: m */
        public boolean f4780m;

        /* renamed from: n */
        public int f4781n;

        /* renamed from: o */
        public boolean f4782o;

        /* renamed from: p */
        public CalendarMode f4783p;

        /* renamed from: q */
        public CalendarDay f4784q;

        /* renamed from: r */
        public boolean f4785r;

        /* renamed from: s */
        public boolean f4786s;

        /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$SavedState$a */
        public static class C6331a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, ViewOnClickListenerC6332a viewOnClickListenerC6332a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4768a);
            parcel.writeInt(this.f4769b);
            parcel.writeInt(this.f4770c);
            parcel.writeInt(this.f4771d);
            parcel.writeByte(this.f4772e ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f4773f, 0);
            parcel.writeParcelable(this.f4774g, 0);
            parcel.writeTypedList(this.f4775h);
            parcel.writeInt(this.f4776i);
            parcel.writeInt(this.f4777j);
            parcel.writeInt(this.f4778k);
            parcel.writeInt(this.f4779l);
            parcel.writeInt(this.f4780m ? 1 : 0);
            parcel.writeInt(this.f4781n);
            parcel.writeInt(this.f4782o ? 1 : 0);
            parcel.writeInt(this.f4783p == CalendarMode.WEEKS ? 1 : 0);
            parcel.writeParcelable(this.f4784q, 0);
            parcel.writeByte(this.f4785r ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f4786s ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f4768a = 0;
            this.f4769b = 0;
            this.f4770c = 0;
            this.f4771d = 4;
            this.f4772e = true;
            this.f4773f = null;
            this.f4774g = null;
            this.f4775h = new ArrayList();
            this.f4776i = 1;
            this.f4777j = 0;
            this.f4778k = -1;
            this.f4779l = -1;
            this.f4780m = true;
            this.f4781n = 1;
            this.f4782o = false;
            this.f4783p = CalendarMode.MONTHS;
            this.f4784q = null;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4768a = 0;
            this.f4769b = 0;
            this.f4770c = 0;
            this.f4771d = 4;
            this.f4772e = true;
            this.f4773f = null;
            this.f4774g = null;
            this.f4775h = new ArrayList();
            this.f4776i = 1;
            this.f4777j = 0;
            this.f4778k = -1;
            this.f4779l = -1;
            this.f4780m = true;
            this.f4781n = 1;
            this.f4782o = false;
            CalendarMode calendarMode = CalendarMode.MONTHS;
            this.f4783p = calendarMode;
            this.f4784q = null;
            this.f4768a = parcel.readInt();
            this.f4769b = parcel.readInt();
            this.f4770c = parcel.readInt();
            this.f4771d = parcel.readInt();
            this.f4772e = parcel.readByte() != 0;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.f4773f = (CalendarDay) parcel.readParcelable(classLoader);
            this.f4774g = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.f4775h, CalendarDay.CREATOR);
            this.f4776i = parcel.readInt();
            this.f4777j = parcel.readInt();
            this.f4778k = parcel.readInt();
            this.f4779l = parcel.readInt();
            this.f4780m = parcel.readInt() == 1;
            this.f4781n = parcel.readInt();
            this.f4782o = parcel.readInt() == 1;
            this.f4783p = parcel.readInt() == 1 ? CalendarMode.WEEKS : calendarMode;
            this.f4784q = (CalendarDay) parcel.readParcelable(classLoader);
            this.f4785r = parcel.readByte() != 0;
            this.f4786s = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$a */
    public class ViewOnClickListenerC6332a implements View.OnClickListener {
        public ViewOnClickListenerC6332a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            if (view == MaterialCalendarView.this.f4745d) {
                MaterialCalendarView.this.f4746e.setCurrentItem(MaterialCalendarView.this.f4746e.getCurrentItem() + 1, true);
            } else if (view == MaterialCalendarView.this.f4744c) {
                MaterialCalendarView.this.f4746e.setCurrentItem(MaterialCalendarView.this.f4746e.getCurrentItem() - 1, true);
            }
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$b */
    public class C6333b implements ViewPager.OnPageChangeListener {
        public C6333b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            MaterialCalendarView.this.f4742a.m2456k(MaterialCalendarView.this.f4748g);
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.f4748g = materialCalendarView.f4747f.mo2380f(i10);
            MaterialCalendarView.this.m4452M();
            MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
            materialCalendarView2.m4459q(materialCalendarView2.f4748g);
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$c */
    public class C6334c implements ViewPager.PageTransformer {
        public C6334c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f10) {
            view.setAlpha((float) Math.sqrt(1.0f - Math.abs(f10)));
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$d */
    public static /* synthetic */ class C6335d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4790a;

        static {
            int[] iArr = new int[CalendarMode.values().length];
            f4790a = iArr;
            try {
                iArr[CalendarMode.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4790a[CalendarMode.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$e */
    public static class C6336e extends ViewGroup.MarginLayoutParams {
        public C6336e(int i10) {
            super(-1, i10);
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$f */
    public class C6337f {

        /* renamed from: a */
        public final CalendarMode f4791a;

        /* renamed from: b */
        public final int f4792b;

        /* renamed from: c */
        public final CalendarDay f4793c;

        /* renamed from: d */
        public final CalendarDay f4794d;

        /* renamed from: e */
        public final boolean f4795e;

        /* renamed from: f */
        public final boolean f4796f;

        public /* synthetic */ C6337f(MaterialCalendarView materialCalendarView, C6338g c6338g, ViewOnClickListenerC6332a viewOnClickListenerC6332a) {
            this(c6338g);
        }

        /* renamed from: g */
        public C6338g m4476g() {
            return new C6338g(MaterialCalendarView.this, this, null);
        }

        public C6337f(C6338g c6338g) {
            this.f4791a = c6338g.f4798a;
            this.f4792b = c6338g.f4799b;
            this.f4793c = c6338g.f4801d;
            this.f4794d = c6338g.f4802e;
            this.f4795e = c6338g.f4800c;
            this.f4796f = c6338g.f4803f;
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$g */
    public class C6338g {

        /* renamed from: a */
        public CalendarMode f4798a;

        /* renamed from: b */
        public int f4799b;

        /* renamed from: c */
        public boolean f4800c;

        /* renamed from: d */
        public CalendarDay f4801d;

        /* renamed from: e */
        public CalendarDay f4802e;

        /* renamed from: f */
        public boolean f4803f;

        public /* synthetic */ C6338g(MaterialCalendarView materialCalendarView, C6337f c6337f, ViewOnClickListenerC6332a viewOnClickListenerC6332a) {
            this(c6337f);
        }

        /* renamed from: g */
        public void m4483g() {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.m4457o(new C6337f(materialCalendarView, this, null));
        }

        /* renamed from: h */
        public C6338g m4484h(boolean z9) {
            this.f4800c = z9;
            return this;
        }

        /* renamed from: i */
        public C6338g m4485i(CalendarMode calendarMode) {
            this.f4798a = calendarMode;
            return this;
        }

        /* renamed from: j */
        public C6338g m4486j(int i10) {
            this.f4799b = i10;
            return this;
        }

        /* renamed from: k */
        public C6338g m4487k(CalendarDay calendarDay) {
            this.f4802e = calendarDay;
            return this;
        }

        /* renamed from: l */
        public C6338g m4488l(CalendarDay calendarDay) {
            this.f4801d = calendarDay;
            return this;
        }

        /* renamed from: m */
        public C6338g m4489m(boolean z9) {
            this.f4803f = z9;
            return this;
        }

        public C6338g() {
            this.f4798a = CalendarMode.MONTHS;
            this.f4799b = Calendar.getInstance().getFirstDayOfWeek();
            this.f4800c = false;
            this.f4801d = null;
            this.f4802e = null;
        }

        public C6338g(C6337f c6337f) {
            this.f4798a = CalendarMode.MONTHS;
            this.f4799b = Calendar.getInstance().getFirstDayOfWeek();
            this.f4800c = false;
            this.f4801d = null;
            this.f4802e = null;
            this.f4798a = c6337f.f4791a;
            this.f4799b = c6337f.f4792b;
            this.f4801d = c6337f.f4793c;
            this.f4802e = c6337f.f4794d;
            this.f4800c = c6337f.f4795e;
            this.f4803f = c6337f.f4796f;
        }
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f4752k = new ArrayList();
        ViewOnClickListenerC6332a viewOnClickListenerC6332a = new ViewOnClickListenerC6332a();
        this.f4753l = viewOnClickListenerC6332a;
        C6333b c6333b = new C6333b();
        this.f4754m = c6333b;
        this.f4755n = null;
        this.f4756o = null;
        this.f4759r = 0;
        this.f4760s = ViewCompat.MEASURED_STATE_MASK;
        this.f4763v = -10;
        this.f4764w = -10;
        this.f4765x = 1;
        this.f4766y = true;
        setClipToPadding(false);
        setClipChildren(false);
        C4970j c4970j = new C4970j(getContext());
        this.f4744c = c4970j;
        c4970j.setContentDescription(getContext().getString(R$string.previous));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f4743b = appCompatTextView;
        C4970j c4970j2 = new C4970j(getContext());
        this.f4745d = c4970j2;
        c4970j2.setContentDescription(getContext().getString(R$string.next));
        C4962b c4962b = new C4962b(getContext());
        this.f4746e = c4962b;
        c4970j.setOnClickListener(viewOnClickListenerC6332a);
        c4970j2.setOnClickListener(viewOnClickListenerC6332a);
        C4977q c4977q = new C4977q(appCompatTextView);
        this.f4742a = c4977q;
        c4977q.m2457l(f4739C);
        c4962b.setOnPageChangeListener(c6333b);
        c4962b.setPageTransformer(false, new C6334c());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.MaterialCalendarView, 0, 0);
        try {
            try {
                int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_calendarMode, 0);
                this.f4767z = typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_firstDayOfWeek, -1);
                c4977q.m2455j(typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_titleAnimationOrientation, 0));
                if (this.f4767z < 0) {
                    this.f4767z = Calendar.getInstance().getFirstDayOfWeek();
                }
                this.f4740A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialCalendarView_mcv_showWeekDays, true);
                m4467z().m4486j(this.f4767z).m4485i(CalendarMode.values()[integer]).m4489m(this.f4740A).m4483g();
                int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.MaterialCalendarView_mcv_tileSize, -10);
                if (layoutDimension > -10) {
                    setTileSize(layoutDimension);
                }
                int layoutDimension2 = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.MaterialCalendarView_mcv_tileWidth, -10);
                if (layoutDimension2 > -10) {
                    setTileWidth(layoutDimension2);
                }
                int layoutDimension3 = typedArrayObtainStyledAttributes.getLayoutDimension(R$styleable.MaterialCalendarView_mcv_tileHeight, -10);
                if (layoutDimension3 > -10) {
                    setTileHeight(layoutDimension3);
                }
                setArrowColor(typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialCalendarView_mcv_arrowColor, ViewCompat.MEASURED_STATE_MASK));
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialCalendarView_mcv_leftArrowMask);
                setLeftArrowMask(drawable == null ? getResources().getDrawable(R$drawable.mcv_action_previous) : drawable);
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialCalendarView_mcv_rightArrowMask);
                setRightArrowMask(drawable2 == null ? getResources().getDrawable(R$drawable.mcv_action_next) : drawable2);
                setSelectionColor(typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialCalendarView_mcv_selectionColor, m4442v(context)));
                CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(R$styleable.MaterialCalendarView_mcv_weekDayLabels);
                if (textArray != null) {
                    setWeekDayFormatter(new C5106a(textArray));
                }
                CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(R$styleable.MaterialCalendarView_mcv_monthLabels);
                if (textArray2 != null) {
                    setTitleFormatter(new C5111f(textArray2));
                }
                setHeaderTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarView_mcv_headerTextAppearance, R$style.TextAppearance_MaterialCalendarWidget_Header));
                setWeekDayTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarView_mcv_weekDayTextAppearance, R$style.TextAppearance_MaterialCalendarWidget_WeekDay));
                setDateTextAppearance(typedArrayObtainStyledAttributes.getResourceId(R$styleable.MaterialCalendarView_mcv_dateTextAppearance, R$style.TextAppearance_MaterialCalendarWidget_Date));
                setShowOtherDates(typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_showOtherDates, 4));
                setAllowClickDaysOutsideCurrentMonth(typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialCalendarView_mcv_allowClickDaysOutsideCurrentMonth, true));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f4747f.mo2399y(f4739C);
            m4450H();
            CalendarDay calendarDayM4417q = CalendarDay.m4417q();
            this.f4748g = calendarDayM4417q;
            setCurrentDate(calendarDayM4417q);
            if (isInEditMode()) {
                removeView(this.f4746e);
                C4972l c4972l = new C4972l(this, this.f4748g, getFirstDayOfWeek(), true);
                c4972l.setSelectionColor(getSelectionColor());
                c4972l.setDateTextAppearance(this.f4747f.m2378d());
                c4972l.setWeekDayTextAppearance(this.f4747f.m2384j());
                c4972l.setShowOtherDates(getShowOtherDates());
                addView(c4972l, new C6336e(this.f4750i.f4738a + 1));
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: I */
    public static boolean m4429I(int i10) {
        return (i10 & 4) != 0;
    }

    /* renamed from: J */
    public static boolean m4430J(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: K */
    public static boolean m4431K(int i10) {
        return (i10 & 2) != 0;
    }

    private int getWeekCountBasedOnMode() {
        AbstractC4963c abstractC4963c;
        C4962b c4962b;
        CalendarMode calendarMode = this.f4750i;
        int i10 = calendarMode.f4738a;
        if (calendarMode.equals(CalendarMode.MONTHS) && this.f4751j && (abstractC4963c = this.f4747f) != null && (c4962b = this.f4746e) != null) {
            Calendar calendar = (Calendar) abstractC4963c.mo2380f(c4962b.getCurrentItem()).m4419e().clone();
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.setFirstDayOfWeek(getFirstDayOfWeek());
            calendar.setMinimalDaysInFirstWeek(1);
            i10 = calendar.get(4);
        }
        return this.f4740A ? i10 + 1 : i10;
    }

    /* renamed from: m */
    public static int m4441m(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i10 : size : Math.min(i10, size);
    }

    /* renamed from: v */
    public static int m4442v(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: A */
    public void m4443A(C4967g c4967g) {
        CalendarDay currentDate = getCurrentDate();
        CalendarDay calendarDayM2424g = c4967g.m2424g();
        int iM4422i = currentDate.m4422i();
        int iM4422i2 = calendarDayM2424g.m4422i();
        if (this.f4750i == CalendarMode.MONTHS && this.f4766y && iM4422i != iM4422i2) {
            if (currentDate.m4424n(calendarDayM2424g)) {
                m4465x();
            } else if (currentDate.m4425o(calendarDayM2424g)) {
                m4464w();
            }
        }
        m4444B(c4967g.m2424g(), !c4967g.isChecked());
    }

    /* renamed from: B */
    public void m4444B(CalendarDay calendarDay, boolean z9) {
        int i10 = this.f4765x;
        if (i10 == 2) {
            this.f4747f.mo2390p(calendarDay, z9);
            m4458p(calendarDay, z9);
            return;
        }
        if (i10 != 3) {
            this.f4747f.mo2375a();
            this.f4747f.mo2390p(calendarDay, true);
            m4458p(calendarDay, true);
            return;
        }
        List listMo2382h = this.f4747f.mo2382h();
        if (listMo2382h.size() == 0) {
            this.f4747f.mo2390p(calendarDay, z9);
            m4458p(calendarDay, z9);
            return;
        }
        if (listMo2382h.size() != 1) {
            this.f4747f.mo2375a();
            this.f4747f.mo2390p(calendarDay, z9);
            m4458p(calendarDay, z9);
            return;
        }
        CalendarDay calendarDay2 = (CalendarDay) listMo2382h.get(0);
        this.f4747f.mo2390p(calendarDay, z9);
        if (calendarDay2.equals(calendarDay)) {
            m4458p(calendarDay, z9);
        } else if (calendarDay2.m4424n(calendarDay)) {
            m4460r(calendarDay, calendarDay2);
        } else {
            m4460r(calendarDay2, calendarDay);
        }
    }

    /* renamed from: D */
    public void m4446D(CalendarDay calendarDay) {
        m4458p(calendarDay, false);
    }

    /* renamed from: E */
    public void m4447E(CalendarDay calendarDay, boolean z9) throws Resources.NotFoundException {
        if (calendarDay == null) {
            return;
        }
        this.f4746e.setCurrentItem(this.f4747f.mo2379e(calendarDay), z9);
        m4452M();
    }

    /* renamed from: F */
    public void m4448F(CalendarDay calendarDay, boolean z9) {
        if (calendarDay == null) {
            return;
        }
        this.f4747f.mo2390p(calendarDay, z9);
    }

    /* renamed from: G */
    public final void m4449G(CalendarDay calendarDay, CalendarDay calendarDay2) throws Resources.NotFoundException {
        CalendarDay calendarDay3 = this.f4748g;
        this.f4747f.mo2394t(calendarDay, calendarDay2);
        this.f4748g = calendarDay3;
        if (calendarDay != null) {
            if (!calendarDay.m4424n(calendarDay3)) {
                calendarDay = this.f4748g;
            }
            this.f4748g = calendarDay;
        }
        this.f4746e.setCurrentItem(this.f4747f.mo2379e(calendarDay3), false);
        m4452M();
    }

    /* renamed from: H */
    public final void m4450H() throws Resources.NotFoundException {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f4749h = linearLayout;
        linearLayout.setOrientation(0);
        this.f4749h.setClipChildren(false);
        this.f4749h.setClipToPadding(false);
        addView(this.f4749h, new C6336e(1));
        C4970j c4970j = this.f4744c;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        c4970j.setScaleType(scaleType);
        this.f4749h.addView(this.f4744c, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f4743b.setGravity(17);
        this.f4749h.addView(this.f4743b, new LinearLayout.LayoutParams(0, -1, 5.0f));
        this.f4745d.setScaleType(scaleType);
        this.f4749h.addView(this.f4745d, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f4746e.setId(R$id.mcv_pager);
        this.f4746e.setOffscreenPageLimit(1);
        addView(this.f4746e, new C6336e(this.f4740A ? this.f4750i.f4738a + 1 : this.f4750i.f4738a));
    }

    /* renamed from: L */
    public C6337f m4451L() {
        return this.f4741B;
    }

    /* renamed from: M */
    public final void m4452M() {
        this.f4742a.m2451f(this.f4748g);
        this.f4744c.setEnabled(m4454k());
        this.f4745d.setEnabled(m4455l());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6336e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public int getArrowColor() {
        return this.f4760s;
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.f4758q;
        return charSequence != null ? charSequence : getContext().getString(R$string.calendar);
    }

    public CalendarMode getCalendarMode() {
        return this.f4750i;
    }

    public CalendarDay getCurrentDate() {
        return this.f4747f.mo2380f(this.f4746e.getCurrentItem());
    }

    public int getFirstDayOfWeek() {
        return this.f4767z;
    }

    public Drawable getLeftArrowMask() {
        return this.f4761t;
    }

    public CalendarDay getMaximumDate() {
        return this.f4756o;
    }

    public CalendarDay getMinimumDate() {
        return this.f4755n;
    }

    public Drawable getRightArrowMask() {
        return this.f4762u;
    }

    public CalendarDay getSelectedDate() {
        List listMo2382h = this.f4747f.mo2382h();
        if (listMo2382h.isEmpty()) {
            return null;
        }
        return (CalendarDay) listMo2382h.get(listMo2382h.size() - 1);
    }

    @NonNull
    public List<CalendarDay> getSelectedDates() {
        return this.f4747f.mo2382h();
    }

    public int getSelectionColor() {
        return this.f4759r;
    }

    public int getSelectionMode() {
        return this.f4765x;
    }

    public int getShowOtherDates() {
        return this.f4747f.mo2383i();
    }

    public int getTileHeight() {
        return this.f4763v;
    }

    @Deprecated
    public int getTileSize() {
        return Math.max(this.f4763v, this.f4764w);
    }

    public int getTileWidth() {
        return this.f4764w;
    }

    public int getTitleAnimationOrientation() {
        return this.f4742a.m2454i();
    }

    public boolean getTopbarVisible() {
        return this.f4749h.getVisibility() == 0;
    }

    /* renamed from: j */
    public boolean m4453j() {
        return this.f4766y;
    }

    /* renamed from: k */
    public boolean m4454k() {
        return this.f4746e.getCurrentItem() > 0;
    }

    /* renamed from: l */
    public boolean m4455l() {
        return this.f4746e.getCurrentItem() < this.f4747f.getCount() - 1;
    }

    /* renamed from: n */
    public void m4456n() {
        List<CalendarDay> selectedDates = getSelectedDates();
        this.f4747f.mo2375a();
        Iterator<CalendarDay> it = selectedDates.iterator();
        while (it.hasNext()) {
            m4458p(it.next(), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4457o(com.prolificinteractive.materialcalendarview.MaterialCalendarView.C6337f r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.m4457o(com.prolificinteractive.materialcalendarview.MaterialCalendarView$f):void");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MaterialCalendarView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MaterialCalendarView.class.getName());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i12 - i10) - paddingLeft) - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i15 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(i15, paddingTop, measuredWidth + i15, measuredHeight);
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int weekCountBasedOnMode = getWeekCountBasedOnMode();
        if (getTopbarVisible()) {
            weekCountBasedOnMode++;
        }
        int iMin = paddingLeft / 7;
        int iM4461s = paddingTop / weekCountBasedOnMode;
        int i12 = this.f4764w;
        int i13 = -1;
        if (i12 == -10 && this.f4763v == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    iMin = Math.min(iMin, iM4461s);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                iMin = iM4461s;
            } else {
                iMin = -1;
                iM4461s = -1;
            }
            iM4461s = -1;
        } else {
            if (i12 > 0) {
                iMin = i12;
            }
            int i14 = this.f4763v;
            if (i14 > 0) {
                i13 = iMin;
                iMin = -1;
                iM4461s = i14;
            } else {
                i13 = iMin;
                iMin = -1;
            }
        }
        if (iMin > 0) {
            iM4461s = iMin;
        } else if (iMin <= 0) {
            int iM4461s2 = i13 <= 0 ? m4461s(44) : i13;
            if (iM4461s <= 0) {
                iM4461s = m4461s(44);
            }
            iMin = iM4461s2;
        } else {
            iMin = i13;
        }
        int i15 = iMin * 7;
        setMeasuredDimension(m4441m(getPaddingLeft() + getPaddingRight() + i15, i10), m4441m((weekCountBasedOnMode * iM4461s) + getPaddingTop() + getPaddingBottom(), i11));
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ((C6336e) childAt.getLayoutParams())).height * iM4461s, 1073741824));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m4467z().m4486j(savedState.f4776i).m4485i(savedState.f4783p).m4488l(savedState.f4773f).m4487k(savedState.f4774g).m4484h(savedState.f4785r).m4489m(savedState.f4786s).m4483g();
        setSelectionColor(savedState.f4768a);
        setDateTextAppearance(savedState.f4769b);
        setWeekDayTextAppearance(savedState.f4770c);
        setShowOtherDates(savedState.f4771d);
        setAllowClickDaysOutsideCurrentMonth(savedState.f4772e);
        m4456n();
        Iterator it = savedState.f4775h.iterator();
        while (it.hasNext()) {
            m4448F((CalendarDay) it.next(), true);
        }
        setTitleAnimationOrientation(savedState.f4777j);
        setTileWidth(savedState.f4778k);
        setTileHeight(savedState.f4779l);
        setTopbarVisible(savedState.f4780m);
        setSelectionMode(savedState.f4781n);
        setDynamicHeightEnabled(savedState.f4782o);
        setCurrentDate(savedState.f4784q);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4768a = getSelectionColor();
        savedState.f4769b = this.f4747f.m2378d();
        savedState.f4770c = this.f4747f.m2384j();
        savedState.f4771d = getShowOtherDates();
        savedState.f4772e = m4453j();
        savedState.f4773f = getMinimumDate();
        savedState.f4774g = getMaximumDate();
        savedState.f4775h = getSelectedDates();
        savedState.f4776i = getFirstDayOfWeek();
        savedState.f4777j = getTitleAnimationOrientation();
        savedState.f4781n = getSelectionMode();
        savedState.f4778k = getTileWidth();
        savedState.f4779l = getTileHeight();
        savedState.f4780m = getTopbarVisible();
        savedState.f4783p = this.f4750i;
        savedState.f4782o = this.f4751j;
        savedState.f4784q = this.f4748g;
        savedState.f4785r = this.f4741B.f4795e;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f4746e.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void m4458p(CalendarDay calendarDay, boolean z9) {
        InterfaceC4974n interfaceC4974n = this.f4757p;
        if (interfaceC4974n != null) {
            interfaceC4974n.mo2445a(this, calendarDay, z9);
        }
    }

    /* renamed from: q */
    public void m4459q(CalendarDay calendarDay) {
    }

    /* renamed from: r */
    public void m4460r(CalendarDay calendarDay, CalendarDay calendarDay2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(calendarDay.m4420g());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendarDay2.m4420g());
        while (true) {
            if (!calendar.before(calendar2) && !calendar.equals(calendar2)) {
                return;
            }
            CalendarDay calendarDayM4414c = CalendarDay.m4414c(calendar);
            this.f4747f.mo2390p(calendarDayM4414c, true);
            arrayList.add(calendarDayM4414c);
            calendar.add(5, 1);
        }
    }

    /* renamed from: s */
    public final int m4461s(int i10) {
        return (int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics());
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z9) {
        this.f4766y = z9;
    }

    public void setArrowColor(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f4760s = i10;
        this.f4744c.m2441b(i10);
        this.f4745d.m2441b(i10);
        invalidate();
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f4745d.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f4744c.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.f4758q = charSequence;
    }

    public void setCurrentDate(@Nullable Calendar calendar) throws Resources.NotFoundException {
        setCurrentDate(CalendarDay.m4414c(calendar));
    }

    public void setDateTextAppearance(int i10) {
        this.f4747f.mo2391q(i10);
    }

    public void setDayFormatter(InterfaceC5110e interfaceC5110e) {
        AbstractC4963c abstractC4963c = this.f4747f;
        if (interfaceC5110e == null) {
            interfaceC5110e = InterfaceC5110e.f2670a;
        }
        abstractC4963c.mo2392r(interfaceC5110e);
    }

    public void setDayFormatterContentDescription(InterfaceC5110e interfaceC5110e) {
        this.f4747f.mo2393s(interfaceC5110e);
    }

    public void setDynamicHeightEnabled(boolean z9) {
        this.f4751j = z9;
    }

    public void setHeaderTextAppearance(int i10) {
        this.f4743b.setTextAppearance(getContext(), i10);
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.f4761t = drawable;
        this.f4744c.setImageDrawable(drawable);
    }

    public void setOnDateChangedListener(InterfaceC4974n interfaceC4974n) {
        this.f4757p = interfaceC4974n;
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.f4743b.setOnClickListener(onClickListener);
    }

    public void setPagingEnabled(boolean z9) {
        this.f4746e.m2372a(z9);
        m4452M();
    }

    public void setRightArrowMask(Drawable drawable) {
        this.f4762u = drawable;
        this.f4745d.setImageDrawable(drawable);
    }

    public void setSelectedDate(@Nullable Calendar calendar) {
        setSelectedDate(CalendarDay.m4414c(calendar));
    }

    public void setSelectionColor(int i10) {
        if (i10 == 0) {
            if (!isInEditMode()) {
                return;
            } else {
                i10 = -7829368;
            }
        }
        this.f4759r = i10;
        this.f4747f.mo2395u(i10);
        invalidate();
    }

    public void setSelectionMode(int i10) {
        int i11 = this.f4765x;
        this.f4765x = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f4765x = 0;
                    if (i11 != 0) {
                        m4456n();
                    }
                } else {
                    m4456n();
                }
            }
        } else if ((i11 == 2 || i11 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        this.f4747f.mo2396v(this.f4765x != 0);
    }

    public void setShowOtherDates(int i10) {
        this.f4747f.mo2397w(i10);
    }

    public void setTileHeight(int i10) {
        this.f4763v = i10;
        requestLayout();
    }

    public void setTileHeightDp(int i10) {
        setTileHeight(m4461s(i10));
    }

    public void setTileSize(int i10) {
        this.f4764w = i10;
        this.f4763v = i10;
        requestLayout();
    }

    public void setTileSizeDp(int i10) {
        setTileSize(m4461s(i10));
    }

    public void setTileWidth(int i10) {
        this.f4764w = i10;
        requestLayout();
    }

    public void setTileWidthDp(int i10) {
        setTileWidth(m4461s(i10));
    }

    public void setTitleAnimationOrientation(int i10) {
        this.f4742a.m2455j(i10);
    }

    public void setTitleFormatter(InterfaceC5112g interfaceC5112g) {
        if (interfaceC5112g == null) {
            interfaceC5112g = f4739C;
        }
        this.f4742a.m2457l(interfaceC5112g);
        this.f4747f.mo2399y(interfaceC5112g);
        m4452M();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new C5111f(charSequenceArr));
    }

    public void setTopbarVisible(boolean z9) {
        this.f4749h.setVisibility(z9 ? 0 : 8);
        requestLayout();
    }

    public void setWeekDayFormatter(InterfaceC5113h interfaceC5113h) {
        AbstractC4963c abstractC4963c = this.f4747f;
        if (interfaceC5113h == null) {
            interfaceC5113h = InterfaceC5113h.f2672a;
        }
        abstractC4963c.mo2400z(interfaceC5113h);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new C5106a(charSequenceArr));
    }

    public void setWeekDayTextAppearance(int i10) {
        this.f4747f.mo2373A(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C6336e generateDefaultLayoutParams() {
        return new C6336e(1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C6336e generateLayoutParams(AttributeSet attributeSet) {
        return new C6336e(1);
    }

    /* renamed from: w */
    public void m4464w() throws Resources.NotFoundException {
        if (m4455l()) {
            C4962b c4962b = this.f4746e;
            c4962b.setCurrentItem(c4962b.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: x */
    public void m4465x() throws Resources.NotFoundException {
        if (m4454k()) {
            C4962b c4962b = this.f4746e;
            c4962b.setCurrentItem(c4962b.getCurrentItem() - 1, true);
        }
    }

    /* renamed from: y */
    public void m4466y() {
        this.f4747f.mo2386l();
    }

    /* renamed from: z */
    public C6338g m4467z() {
        return new C6338g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C6336e(1);
    }

    public void setCurrentDate(@Nullable Date date) {
        setCurrentDate(CalendarDay.m4415d(date));
    }

    public void setSelectedDate(@Nullable Date date) {
        setSelectedDate(CalendarDay.m4415d(date));
    }

    public void setTitleMonths(@ArrayRes int i10) {
        setTitleMonths(getResources().getTextArray(i10));
    }

    public void setWeekDayLabels(@ArrayRes int i10) {
        setWeekDayLabels(getResources().getTextArray(i10));
    }

    public void setCurrentDate(@Nullable CalendarDay calendarDay) throws Resources.NotFoundException {
        m4447E(calendarDay, true);
    }

    public void setSelectedDate(@Nullable CalendarDay calendarDay) {
        m4456n();
        if (calendarDay != null) {
            m4448F(calendarDay, true);
        }
    }

    /* renamed from: C */
    public void m4445C(C4967g c4967g) {
    }

    public void setOnDateLongClickListener(InterfaceC4973m interfaceC4973m) {
    }

    public void setOnMonthChangedListener(InterfaceC4975o interfaceC4975o) {
    }

    public void setOnRangeSelectedListener(InterfaceC4976p interfaceC4976p) {
    }
}
