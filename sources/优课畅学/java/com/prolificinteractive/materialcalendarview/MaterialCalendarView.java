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
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p094f1.AbstractC8408c;
import p094f1.C8407b;
import p094f1.C8412g;
import p094f1.C8415j;
import p094f1.C8417l;
import p094f1.C8422q;
import p094f1.InterfaceC8418m;
import p094f1.InterfaceC8419n;
import p094f1.InterfaceC8420o;
import p094f1.InterfaceC8421p;
import p106g1.C8515a;
import p106g1.C8518d;
import p106g1.C8520f;
import p106g1.InterfaceC8519e;
import p106g1.InterfaceC8521g;
import p106g1.InterfaceC8522h;

/* loaded from: classes4.dex */
public class MaterialCalendarView extends ViewGroup {

    /* renamed from: B */
    public static final InterfaceC8521g f4228B = new C8518d();

    /* renamed from: A */
    public C6406f f4229A;

    /* renamed from: a */
    public final C8422q f4230a;

    /* renamed from: b */
    public final TextView f4231b;

    /* renamed from: c */
    public final C8415j f4232c;

    /* renamed from: d */
    public final C8415j f4233d;

    /* renamed from: e */
    public final C8407b f4234e;

    /* renamed from: f */
    public AbstractC8408c f4235f;

    /* renamed from: g */
    public CalendarDay f4236g;

    /* renamed from: h */
    public LinearLayout f4237h;

    /* renamed from: i */
    public CalendarMode f4238i;

    /* renamed from: j */
    public boolean f4239j;

    /* renamed from: k */
    public final ArrayList f4240k;

    /* renamed from: l */
    public final View.OnClickListener f4241l;

    /* renamed from: m */
    public final ViewPager.OnPageChangeListener f4242m;

    /* renamed from: n */
    public CalendarDay f4243n;

    /* renamed from: o */
    public CalendarDay f4244o;

    /* renamed from: p */
    public CharSequence f4245p;

    /* renamed from: q */
    public int f4246q;

    /* renamed from: r */
    public int f4247r;

    /* renamed from: s */
    public Drawable f4248s;

    /* renamed from: t */
    public Drawable f4249t;

    /* renamed from: u */
    public int f4250u;

    /* renamed from: v */
    public int f4251v;

    /* renamed from: w */
    public int f4252w;

    /* renamed from: x */
    public boolean f4253x;

    /* renamed from: y */
    public int f4254y;

    /* renamed from: z */
    public boolean f4255z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6400a();

        /* renamed from: a */
        public int f4256a;

        /* renamed from: b */
        public int f4257b;

        /* renamed from: c */
        public int f4258c;

        /* renamed from: d */
        public int f4259d;

        /* renamed from: e */
        public boolean f4260e;

        /* renamed from: f */
        public CalendarDay f4261f;

        /* renamed from: g */
        public CalendarDay f4262g;

        /* renamed from: h */
        public List f4263h;

        /* renamed from: i */
        public int f4264i;

        /* renamed from: j */
        public int f4265j;

        /* renamed from: k */
        public int f4266k;

        /* renamed from: l */
        public int f4267l;

        /* renamed from: m */
        public boolean f4268m;

        /* renamed from: n */
        public int f4269n;

        /* renamed from: o */
        public boolean f4270o;

        /* renamed from: p */
        public CalendarMode f4271p;

        /* renamed from: q */
        public CalendarDay f4272q;

        /* renamed from: r */
        public boolean f4273r;

        /* renamed from: s */
        public boolean f4274s;

        /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$SavedState$a */
        public static class C6400a implements Parcelable.Creator {
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

        public /* synthetic */ SavedState(Parcel parcel, ViewOnClickListenerC6401a viewOnClickListenerC6401a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f4256a);
            parcel.writeInt(this.f4257b);
            parcel.writeInt(this.f4258c);
            parcel.writeInt(this.f4259d);
            parcel.writeByte(this.f4260e ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f4261f, 0);
            parcel.writeParcelable(this.f4262g, 0);
            parcel.writeTypedList(this.f4263h);
            parcel.writeInt(this.f4264i);
            parcel.writeInt(this.f4265j);
            parcel.writeInt(this.f4266k);
            parcel.writeInt(this.f4267l);
            parcel.writeInt(this.f4268m ? 1 : 0);
            parcel.writeInt(this.f4269n);
            parcel.writeInt(this.f4270o ? 1 : 0);
            parcel.writeInt(this.f4271p == CalendarMode.WEEKS ? 1 : 0);
            parcel.writeParcelable(this.f4272q, 0);
            parcel.writeByte(this.f4273r ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f4274s ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f4256a = 0;
            this.f4257b = 0;
            this.f4258c = 0;
            this.f4259d = 4;
            this.f4260e = true;
            this.f4261f = null;
            this.f4262g = null;
            this.f4263h = new ArrayList();
            this.f4264i = 1;
            this.f4265j = 0;
            this.f4266k = -1;
            this.f4267l = -1;
            this.f4268m = true;
            this.f4269n = 1;
            this.f4270o = false;
            this.f4271p = CalendarMode.MONTHS;
            this.f4272q = null;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f4256a = 0;
            this.f4257b = 0;
            this.f4258c = 0;
            this.f4259d = 4;
            this.f4260e = true;
            this.f4261f = null;
            this.f4262g = null;
            this.f4263h = new ArrayList();
            this.f4264i = 1;
            this.f4265j = 0;
            this.f4266k = -1;
            this.f4267l = -1;
            this.f4268m = true;
            this.f4269n = 1;
            this.f4270o = false;
            CalendarMode calendarMode = CalendarMode.MONTHS;
            this.f4271p = calendarMode;
            this.f4272q = null;
            this.f4256a = parcel.readInt();
            this.f4257b = parcel.readInt();
            this.f4258c = parcel.readInt();
            this.f4259d = parcel.readInt();
            this.f4260e = parcel.readByte() != 0;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.f4261f = (CalendarDay) parcel.readParcelable(classLoader);
            this.f4262g = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.f4263h, CalendarDay.CREATOR);
            this.f4264i = parcel.readInt();
            this.f4265j = parcel.readInt();
            this.f4266k = parcel.readInt();
            this.f4267l = parcel.readInt();
            this.f4268m = parcel.readInt() == 1;
            this.f4269n = parcel.readInt();
            this.f4270o = parcel.readInt() == 1;
            this.f4271p = parcel.readInt() == 1 ? CalendarMode.WEEKS : calendarMode;
            this.f4272q = (CalendarDay) parcel.readParcelable(classLoader);
            this.f4273r = parcel.readByte() != 0;
            this.f4274s = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$a */
    public class ViewOnClickListenerC6401a implements View.OnClickListener {
        public ViewOnClickListenerC6401a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            if (view == MaterialCalendarView.this.f4233d) {
                MaterialCalendarView.this.f4234e.setCurrentItem(MaterialCalendarView.this.f4234e.getCurrentItem() + 1, true);
            } else if (view == MaterialCalendarView.this.f4232c) {
                MaterialCalendarView.this.f4234e.setCurrentItem(MaterialCalendarView.this.f4234e.getCurrentItem() - 1, true);
            }
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$b */
    public class C6402b implements ViewPager.OnPageChangeListener {
        public C6402b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            MaterialCalendarView.this.f4230a.m13758k(MaterialCalendarView.this.f4236g);
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.f4236g = materialCalendarView.f4235f.mo4067f(i10);
            MaterialCalendarView.this.m4022M();
            MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
            materialCalendarView2.m4029q(materialCalendarView2.f4236g);
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$c */
    public class C6403c implements ViewPager.PageTransformer {
        public C6403c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f10) {
            view.setAlpha((float) Math.sqrt(1.0f - Math.abs(f10)));
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$d */
    public static /* synthetic */ class C6404d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4278a;

        static {
            int[] iArr = new int[CalendarMode.values().length];
            f4278a = iArr;
            try {
                iArr[CalendarMode.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4278a[CalendarMode.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$e */
    public static class C6405e extends ViewGroup.MarginLayoutParams {
        public C6405e(int i10) {
            super(-1, i10);
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$f */
    public class C6406f {

        /* renamed from: a */
        public final CalendarMode f4279a;

        /* renamed from: b */
        public final int f4280b;

        /* renamed from: c */
        public final CalendarDay f4281c;

        /* renamed from: d */
        public final CalendarDay f4282d;

        /* renamed from: e */
        public final boolean f4283e;

        /* renamed from: f */
        public final boolean f4284f;

        public /* synthetic */ C6406f(MaterialCalendarView materialCalendarView, C6407g c6407g, ViewOnClickListenerC6401a viewOnClickListenerC6401a) {
            this(c6407g);
        }

        /* renamed from: g */
        public C6407g m4046g() {
            return new C6407g(MaterialCalendarView.this, this, null);
        }

        public C6406f(C6407g c6407g) {
            this.f4279a = c6407g.f4286a;
            this.f4280b = c6407g.f4287b;
            this.f4281c = c6407g.f4289d;
            this.f4282d = c6407g.f4290e;
            this.f4283e = c6407g.f4288c;
            this.f4284f = c6407g.f4291f;
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$g */
    public class C6407g {

        /* renamed from: a */
        public CalendarMode f4286a;

        /* renamed from: b */
        public int f4287b;

        /* renamed from: c */
        public boolean f4288c;

        /* renamed from: d */
        public CalendarDay f4289d;

        /* renamed from: e */
        public CalendarDay f4290e;

        /* renamed from: f */
        public boolean f4291f;

        public /* synthetic */ C6407g(MaterialCalendarView materialCalendarView, C6406f c6406f, ViewOnClickListenerC6401a viewOnClickListenerC6401a) {
            this(c6406f);
        }

        /* renamed from: g */
        public void m4053g() throws Resources.NotFoundException {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.m4027o(new C6406f(materialCalendarView, this, null));
        }

        /* renamed from: h */
        public C6407g m4054h(boolean z10) {
            this.f4288c = z10;
            return this;
        }

        /* renamed from: i */
        public C6407g m4055i(CalendarMode calendarMode) {
            this.f4286a = calendarMode;
            return this;
        }

        /* renamed from: j */
        public C6407g m4056j(int i10) {
            this.f4287b = i10;
            return this;
        }

        /* renamed from: k */
        public C6407g m4057k(CalendarDay calendarDay) {
            this.f4290e = calendarDay;
            return this;
        }

        /* renamed from: l */
        public C6407g m4058l(CalendarDay calendarDay) {
            this.f4289d = calendarDay;
            return this;
        }

        /* renamed from: m */
        public C6407g m4059m(boolean z10) {
            this.f4291f = z10;
            return this;
        }

        public C6407g() {
            this.f4286a = CalendarMode.MONTHS;
            this.f4287b = Calendar.getInstance().getFirstDayOfWeek();
            this.f4288c = false;
            this.f4289d = null;
            this.f4290e = null;
        }

        public C6407g(C6406f c6406f) {
            this.f4286a = CalendarMode.MONTHS;
            this.f4287b = Calendar.getInstance().getFirstDayOfWeek();
            this.f4288c = false;
            this.f4289d = null;
            this.f4290e = null;
            this.f4286a = c6406f.f4279a;
            this.f4287b = c6406f.f4280b;
            this.f4289d = c6406f.f4281c;
            this.f4290e = c6406f.f4282d;
            this.f4288c = c6406f.f4283e;
            this.f4291f = c6406f.f4284f;
        }
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f4240k = new ArrayList();
        ViewOnClickListenerC6401a viewOnClickListenerC6401a = new ViewOnClickListenerC6401a();
        this.f4241l = viewOnClickListenerC6401a;
        C6402b c6402b = new C6402b();
        this.f4242m = c6402b;
        this.f4243n = null;
        this.f4244o = null;
        this.f4246q = 0;
        this.f4247r = -16777216;
        this.f4250u = -10;
        this.f4251v = -10;
        this.f4252w = 1;
        this.f4253x = true;
        setClipToPadding(false);
        setClipChildren(false);
        C8415j c8415j = new C8415j(getContext());
        this.f4232c = c8415j;
        c8415j.setContentDescription(getContext().getString(R$string.previous));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f4231b = appCompatTextView;
        C8415j c8415j2 = new C8415j(getContext());
        this.f4233d = c8415j2;
        c8415j2.setContentDescription(getContext().getString(R$string.next));
        C8407b c8407b = new C8407b(getContext());
        this.f4234e = c8407b;
        c8415j.setOnClickListener(viewOnClickListenerC6401a);
        c8415j2.setOnClickListener(viewOnClickListenerC6401a);
        C8422q c8422q = new C8422q(appCompatTextView);
        this.f4230a = c8422q;
        c8422q.m13759l(f4228B);
        c8407b.setOnPageChangeListener(c6402b);
        c8407b.setPageTransformer(false, new C6403c());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.MaterialCalendarView, 0, 0);
        try {
            try {
                int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_calendarMode, 0);
                this.f4254y = typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_firstDayOfWeek, -1);
                c8422q.m13757j(typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_titleAnimationOrientation, 0));
                if (this.f4254y < 0) {
                    this.f4254y = Calendar.getInstance().getFirstDayOfWeek();
                }
                this.f4255z = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialCalendarView_mcv_showWeekDays, true);
                m4037z().m4056j(this.f4254y).m4055i(CalendarMode.values()[integer]).m4059m(this.f4255z).m4053g();
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
                setArrowColor(typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialCalendarView_mcv_arrowColor, -16777216));
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialCalendarView_mcv_leftArrowMask);
                setLeftArrowMask(drawable == null ? getResources().getDrawable(R$drawable.mcv_action_previous) : drawable);
                Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R$styleable.MaterialCalendarView_mcv_rightArrowMask);
                setRightArrowMask(drawable2 == null ? getResources().getDrawable(R$drawable.mcv_action_next) : drawable2);
                setSelectionColor(typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialCalendarView_mcv_selectionColor, m4012v(context)));
                CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(R$styleable.MaterialCalendarView_mcv_weekDayLabels);
                if (textArray != null) {
                    setWeekDayFormatter(new C8515a(textArray));
                }
                CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(R$styleable.MaterialCalendarView_mcv_monthLabels);
                if (textArray2 != null) {
                    setTitleFormatter(new C8520f(textArray2));
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
            this.f4235f.mo4084y(f4228B);
            m4020H();
            CalendarDay calendarDayM3987q = CalendarDay.m3987q();
            this.f4236g = calendarDayM3987q;
            setCurrentDate(calendarDayM3987q);
            if (isInEditMode()) {
                removeView(this.f4234e);
                C8417l c8417l = new C8417l(this, this.f4236g, getFirstDayOfWeek(), true);
                c8417l.setSelectionColor(getSelectionColor());
                c8417l.setDateTextAppearance(this.f4235f.m13702d());
                c8417l.setWeekDayTextAppearance(this.f4235f.m13703j());
                c8417l.setShowOtherDates(getShowOtherDates());
                addView(c8417l, new C6405e(this.f4238i.f4227a + 1));
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: I */
    public static boolean m3999I(int i10) {
        return (i10 & 4) != 0;
    }

    /* renamed from: J */
    public static boolean m4000J(int i10) {
        return (i10 & 1) != 0;
    }

    /* renamed from: K */
    public static boolean m4001K(int i10) {
        return (i10 & 2) != 0;
    }

    private int getWeekCountBasedOnMode() {
        AbstractC8408c abstractC8408c;
        C8407b c8407b;
        CalendarMode calendarMode = this.f4238i;
        int i10 = calendarMode.f4227a;
        if (calendarMode.equals(CalendarMode.MONTHS) && this.f4239j && (abstractC8408c = this.f4235f) != null && (c8407b = this.f4234e) != null) {
            Calendar calendar = (Calendar) abstractC8408c.mo4067f(c8407b.getCurrentItem()).m3989h().clone();
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.setFirstDayOfWeek(getFirstDayOfWeek());
            calendar.setMinimalDaysInFirstWeek(1);
            i10 = calendar.get(4);
        }
        return this.f4255z ? i10 + 1 : i10;
    }

    /* renamed from: m */
    public static int m4011m(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i10 : size : Math.min(i10, size);
    }

    /* renamed from: v */
    public static int m4012v(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: A */
    public void m4013A(CalendarDay calendarDay, boolean z10) {
        int i10 = this.f4252w;
        if (i10 == 2) {
            this.f4235f.mo4075p(calendarDay, z10);
            m4028p(calendarDay, z10);
            return;
        }
        if (i10 != 3) {
            this.f4235f.mo4063a();
            this.f4235f.mo4075p(calendarDay, true);
            m4028p(calendarDay, true);
            return;
        }
        List listMo4069h = this.f4235f.mo4069h();
        if (listMo4069h.size() == 0) {
            this.f4235f.mo4075p(calendarDay, z10);
            m4028p(calendarDay, z10);
            return;
        }
        if (listMo4069h.size() != 1) {
            this.f4235f.mo4063a();
            this.f4235f.mo4075p(calendarDay, z10);
            m4028p(calendarDay, z10);
            return;
        }
        CalendarDay calendarDay2 = (CalendarDay) listMo4069h.get(0);
        this.f4235f.mo4075p(calendarDay, z10);
        if (calendarDay2.equals(calendarDay)) {
            m4028p(calendarDay, z10);
        } else if (calendarDay2.m3994n(calendarDay)) {
            m4030r(calendarDay, calendarDay2);
        } else {
            m4030r(calendarDay2, calendarDay);
        }
    }

    /* renamed from: B */
    public void m4014B(C8412g c8412g) throws Resources.NotFoundException {
        CalendarDay currentDate = getCurrentDate();
        CalendarDay calendarDayM13727g = c8412g.m13727g();
        int iM3992k = currentDate.m3992k();
        int iM3992k2 = calendarDayM13727g.m3992k();
        if (this.f4238i == CalendarMode.MONTHS && this.f4253x && iM3992k != iM3992k2) {
            if (currentDate.m3994n(calendarDayM13727g)) {
                m4035x();
            } else if (currentDate.m3995o(calendarDayM13727g)) {
                m4034w();
            }
        }
        m4013A(c8412g.m13727g(), !c8412g.isChecked());
    }

    /* renamed from: D */
    public void m4016D(CalendarDay calendarDay) {
        m4028p(calendarDay, false);
    }

    /* renamed from: E */
    public void m4017E(CalendarDay calendarDay, boolean z10) throws Resources.NotFoundException {
        if (calendarDay == null) {
            return;
        }
        this.f4234e.setCurrentItem(this.f4235f.mo4066e(calendarDay), z10);
        m4022M();
    }

    /* renamed from: F */
    public void m4018F(CalendarDay calendarDay, boolean z10) {
        if (calendarDay == null) {
            return;
        }
        this.f4235f.mo4075p(calendarDay, z10);
    }

    /* renamed from: G */
    public final void m4019G(CalendarDay calendarDay, CalendarDay calendarDay2) throws Resources.NotFoundException {
        CalendarDay calendarDay3 = this.f4236g;
        this.f4235f.mo4079t(calendarDay, calendarDay2);
        this.f4236g = calendarDay3;
        if (calendarDay != null) {
            if (!calendarDay.m3994n(calendarDay3)) {
                calendarDay = this.f4236g;
            }
            this.f4236g = calendarDay;
        }
        this.f4234e.setCurrentItem(this.f4235f.mo4066e(calendarDay3), false);
        m4022M();
    }

    /* renamed from: H */
    public final void m4020H() throws Resources.NotFoundException {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f4237h = linearLayout;
        linearLayout.setOrientation(0);
        this.f4237h.setClipChildren(false);
        this.f4237h.setClipToPadding(false);
        addView(this.f4237h, new C6405e(1));
        C8415j c8415j = this.f4232c;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        c8415j.setScaleType(scaleType);
        this.f4237h.addView(this.f4232c, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f4231b.setGravity(17);
        this.f4237h.addView(this.f4231b, new LinearLayout.LayoutParams(0, -1, 5.0f));
        this.f4233d.setScaleType(scaleType);
        this.f4237h.addView(this.f4233d, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f4234e.setId(R$id.mcv_pager);
        this.f4234e.setOffscreenPageLimit(1);
        addView(this.f4234e, new C6405e(this.f4255z ? this.f4238i.f4227a + 1 : this.f4238i.f4227a));
    }

    /* renamed from: L */
    public C6406f m4021L() {
        return this.f4229A;
    }

    /* renamed from: M */
    public final void m4022M() {
        this.f4230a.m13753f(this.f4236g);
        this.f4232c.setEnabled(m4024k());
        this.f4233d.setEnabled(m4025l());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6405e;
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
        return this.f4247r;
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.f4245p;
        return charSequence != null ? charSequence : getContext().getString(R$string.calendar);
    }

    public CalendarMode getCalendarMode() {
        return this.f4238i;
    }

    public CalendarDay getCurrentDate() {
        return this.f4235f.mo4067f(this.f4234e.getCurrentItem());
    }

    public int getFirstDayOfWeek() {
        return this.f4254y;
    }

    public Drawable getLeftArrowMask() {
        return this.f4248s;
    }

    public CalendarDay getMaximumDate() {
        return this.f4244o;
    }

    public CalendarDay getMinimumDate() {
        return this.f4243n;
    }

    public Drawable getRightArrowMask() {
        return this.f4249t;
    }

    public CalendarDay getSelectedDate() {
        List listMo4069h = this.f4235f.mo4069h();
        if (listMo4069h.isEmpty()) {
            return null;
        }
        return (CalendarDay) listMo4069h.get(listMo4069h.size() - 1);
    }

    @NonNull
    public List<CalendarDay> getSelectedDates() {
        return this.f4235f.mo4069h();
    }

    public int getSelectionColor() {
        return this.f4246q;
    }

    public int getSelectionMode() {
        return this.f4252w;
    }

    public int getShowOtherDates() {
        return this.f4235f.mo4070i();
    }

    public int getTileHeight() {
        return this.f4250u;
    }

    @Deprecated
    public int getTileSize() {
        return Math.max(this.f4250u, this.f4251v);
    }

    public int getTileWidth() {
        return this.f4251v;
    }

    public int getTitleAnimationOrientation() {
        return this.f4230a.m13756i();
    }

    public boolean getTopbarVisible() {
        return this.f4237h.getVisibility() == 0;
    }

    /* renamed from: j */
    public boolean m4023j() {
        return this.f4253x;
    }

    /* renamed from: k */
    public boolean m4024k() {
        return this.f4234e.getCurrentItem() > 0;
    }

    /* renamed from: l */
    public boolean m4025l() {
        return this.f4234e.getCurrentItem() < this.f4235f.getCount() - 1;
    }

    /* renamed from: n */
    public void m4026n() {
        List<CalendarDay> selectedDates = getSelectedDates();
        this.f4235f.mo4063a();
        Iterator<CalendarDay> it = selectedDates.iterator();
        while (it.hasNext()) {
            m4028p(it.next(), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4027o(com.prolificinteractive.materialcalendarview.MaterialCalendarView.C6406f r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.m4027o(com.prolificinteractive.materialcalendarview.MaterialCalendarView$f):void");
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
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
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
        int iM4031s = paddingTop / weekCountBasedOnMode;
        int i12 = this.f4251v;
        int i13 = -1;
        if (i12 == -10 && this.f4250u == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    iMin = Math.min(iMin, iM4031s);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                iMin = iM4031s;
            } else {
                iMin = -1;
                iM4031s = -1;
            }
            iM4031s = -1;
        } else {
            if (i12 > 0) {
                iMin = i12;
            }
            int i14 = this.f4250u;
            if (i14 > 0) {
                i13 = iMin;
                iMin = -1;
                iM4031s = i14;
            } else {
                i13 = iMin;
                iMin = -1;
            }
        }
        if (iMin > 0) {
            iM4031s = iMin;
        } else if (iMin <= 0) {
            int iM4031s2 = i13 <= 0 ? m4031s(44) : i13;
            if (iM4031s <= 0) {
                iM4031s = m4031s(44);
            }
            iMin = iM4031s2;
        } else {
            iMin = i13;
        }
        int i15 = iMin * 7;
        setMeasuredDimension(m4011m(getPaddingLeft() + getPaddingRight() + i15, i10), m4011m((weekCountBasedOnMode * iM4031s) + getPaddingTop() + getPaddingBottom(), i11));
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ((C6405e) childAt.getLayoutParams())).height * iM4031s, BasicMeasure.EXACTLY));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m4037z().m4056j(savedState.f4264i).m4055i(savedState.f4271p).m4058l(savedState.f4261f).m4057k(savedState.f4262g).m4054h(savedState.f4273r).m4059m(savedState.f4274s).m4053g();
        setSelectionColor(savedState.f4256a);
        setDateTextAppearance(savedState.f4257b);
        setWeekDayTextAppearance(savedState.f4258c);
        setShowOtherDates(savedState.f4259d);
        setAllowClickDaysOutsideCurrentMonth(savedState.f4260e);
        m4026n();
        Iterator it = savedState.f4263h.iterator();
        while (it.hasNext()) {
            m4018F((CalendarDay) it.next(), true);
        }
        setTitleAnimationOrientation(savedState.f4265j);
        setTileWidth(savedState.f4266k);
        setTileHeight(savedState.f4267l);
        setTopbarVisible(savedState.f4268m);
        setSelectionMode(savedState.f4269n);
        setDynamicHeightEnabled(savedState.f4270o);
        setCurrentDate(savedState.f4272q);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4256a = getSelectionColor();
        savedState.f4257b = this.f4235f.m13702d();
        savedState.f4258c = this.f4235f.m13703j();
        savedState.f4259d = getShowOtherDates();
        savedState.f4260e = m4023j();
        savedState.f4261f = getMinimumDate();
        savedState.f4262g = getMaximumDate();
        savedState.f4263h = getSelectedDates();
        savedState.f4264i = getFirstDayOfWeek();
        savedState.f4265j = getTitleAnimationOrientation();
        savedState.f4269n = getSelectionMode();
        savedState.f4266k = getTileWidth();
        savedState.f4267l = getTileHeight();
        savedState.f4268m = getTopbarVisible();
        savedState.f4271p = this.f4238i;
        savedState.f4270o = this.f4239j;
        savedState.f4272q = this.f4236g;
        savedState.f4273r = this.f4229A.f4283e;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f4234e.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void m4028p(CalendarDay calendarDay, boolean z10) {
    }

    /* renamed from: q */
    public void m4029q(CalendarDay calendarDay) {
    }

    /* renamed from: r */
    public void m4030r(CalendarDay calendarDay, CalendarDay calendarDay2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(calendarDay.m3990i());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendarDay2.m3990i());
        while (true) {
            if (!calendar.before(calendar2) && !calendar.equals(calendar2)) {
                return;
            }
            CalendarDay calendarDayM3984d = CalendarDay.m3984d(calendar);
            this.f4235f.mo4075p(calendarDayM3984d, true);
            arrayList.add(calendarDayM3984d);
            calendar.add(5, 1);
        }
    }

    /* renamed from: s */
    public final int m4031s(int i10) {
        return (int) TypedValue.applyDimension(1, i10, getResources().getDisplayMetrics());
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z10) {
        this.f4253x = z10;
    }

    public void setArrowColor(int i10) {
        if (i10 == 0) {
            return;
        }
        this.f4247r = i10;
        this.f4232c.m13744b(i10);
        this.f4233d.m13744b(i10);
        invalidate();
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f4233d.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f4232c.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.f4245p = charSequence;
    }

    public void setCurrentDate(@Nullable Calendar calendar) throws Resources.NotFoundException {
        setCurrentDate(CalendarDay.m3984d(calendar));
    }

    public void setDateTextAppearance(int i10) {
        this.f4235f.mo4076q(i10);
    }

    public void setDayFormatter(InterfaceC8519e interfaceC8519e) {
        AbstractC8408c abstractC8408c = this.f4235f;
        if (interfaceC8519e == null) {
            interfaceC8519e = InterfaceC8519e.f16104a;
        }
        abstractC8408c.mo4077r(interfaceC8519e);
    }

    public void setDayFormatterContentDescription(InterfaceC8519e interfaceC8519e) {
        this.f4235f.mo4078s(interfaceC8519e);
    }

    public void setDynamicHeightEnabled(boolean z10) {
        this.f4239j = z10;
    }

    public void setHeaderTextAppearance(int i10) {
        this.f4231b.setTextAppearance(getContext(), i10);
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.f4248s = drawable;
        this.f4232c.setImageDrawable(drawable);
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.f4231b.setOnClickListener(onClickListener);
    }

    public void setPagingEnabled(boolean z10) {
        this.f4234e.m13700a(z10);
        m4022M();
    }

    public void setRightArrowMask(Drawable drawable) {
        this.f4249t = drawable;
        this.f4233d.setImageDrawable(drawable);
    }

    public void setSelectedDate(@Nullable Calendar calendar) {
        setSelectedDate(CalendarDay.m3984d(calendar));
    }

    public void setSelectionColor(int i10) {
        if (i10 == 0) {
            if (!isInEditMode()) {
                return;
            } else {
                i10 = -7829368;
            }
        }
        this.f4246q = i10;
        this.f4235f.mo4080u(i10);
        invalidate();
    }

    public void setSelectionMode(int i10) {
        int i11 = this.f4252w;
        this.f4252w = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    this.f4252w = 0;
                    if (i11 != 0) {
                        m4026n();
                    }
                } else {
                    m4026n();
                }
            }
        } else if ((i11 == 2 || i11 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        this.f4235f.mo4081v(this.f4252w != 0);
    }

    public void setShowOtherDates(int i10) {
        this.f4235f.mo4082w(i10);
    }

    public void setTileHeight(int i10) {
        this.f4250u = i10;
        requestLayout();
    }

    public void setTileHeightDp(int i10) {
        setTileHeight(m4031s(i10));
    }

    public void setTileSize(int i10) {
        this.f4251v = i10;
        this.f4250u = i10;
        requestLayout();
    }

    public void setTileSizeDp(int i10) {
        setTileSize(m4031s(i10));
    }

    public void setTileWidth(int i10) {
        this.f4251v = i10;
        requestLayout();
    }

    public void setTileWidthDp(int i10) {
        setTileWidth(m4031s(i10));
    }

    public void setTitleAnimationOrientation(int i10) {
        this.f4230a.m13757j(i10);
    }

    public void setTitleFormatter(InterfaceC8521g interfaceC8521g) {
        if (interfaceC8521g == null) {
            interfaceC8521g = f4228B;
        }
        this.f4230a.m13759l(interfaceC8521g);
        this.f4235f.mo4084y(interfaceC8521g);
        m4022M();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new C8520f(charSequenceArr));
    }

    public void setTopbarVisible(boolean z10) {
        this.f4237h.setVisibility(z10 ? 0 : 8);
        requestLayout();
    }

    public void setWeekDayFormatter(InterfaceC8522h interfaceC8522h) {
        AbstractC8408c abstractC8408c = this.f4235f;
        if (interfaceC8522h == null) {
            interfaceC8522h = InterfaceC8522h.f16106a;
        }
        abstractC8408c.mo4085z(interfaceC8522h);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new C8515a(charSequenceArr));
    }

    public void setWeekDayTextAppearance(int i10) {
        this.f4235f.mo4060A(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C6405e generateDefaultLayoutParams() {
        return new C6405e(1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C6405e generateLayoutParams(AttributeSet attributeSet) {
        return new C6405e(1);
    }

    /* renamed from: w */
    public void m4034w() throws Resources.NotFoundException {
        if (m4025l()) {
            C8407b c8407b = this.f4234e;
            c8407b.setCurrentItem(c8407b.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: x */
    public void m4035x() throws Resources.NotFoundException {
        if (m4024k()) {
            C8407b c8407b = this.f4234e;
            c8407b.setCurrentItem(c8407b.getCurrentItem() - 1, true);
        }
    }

    /* renamed from: y */
    public void m4036y() {
        this.f4235f.mo4072l();
    }

    /* renamed from: z */
    public C6407g m4037z() {
        return new C6407g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C6405e(1);
    }

    public void setCurrentDate(@Nullable Date date) throws Resources.NotFoundException {
        setCurrentDate(CalendarDay.m3985f(date));
    }

    public void setSelectedDate(@Nullable Date date) {
        setSelectedDate(CalendarDay.m3985f(date));
    }

    public void setTitleMonths(@ArrayRes int i10) {
        setTitleMonths(getResources().getTextArray(i10));
    }

    public void setWeekDayLabels(@ArrayRes int i10) {
        setWeekDayLabels(getResources().getTextArray(i10));
    }

    public void setCurrentDate(@Nullable CalendarDay calendarDay) throws Resources.NotFoundException {
        m4017E(calendarDay, true);
    }

    public void setSelectedDate(@Nullable CalendarDay calendarDay) {
        m4026n();
        if (calendarDay != null) {
            m4018F(calendarDay, true);
        }
    }

    /* renamed from: C */
    public void m4015C(C8412g c8412g) {
    }

    public void setOnDateChangedListener(InterfaceC8419n interfaceC8419n) {
    }

    public void setOnDateLongClickListener(InterfaceC8418m interfaceC8418m) {
    }

    public void setOnMonthChangedListener(InterfaceC8420o interfaceC8420o) {
    }

    public void setOnRangeSelectedListener(InterfaceC8421p interfaceC8421p) {
    }
}
