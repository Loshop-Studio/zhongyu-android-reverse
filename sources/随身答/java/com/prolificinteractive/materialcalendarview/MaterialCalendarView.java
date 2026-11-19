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
import p003a2.AbstractC0016c;
import p003a2.C0015b;
import p003a2.C0020g;
import p003a2.C0023j;
import p003a2.C0025l;
import p003a2.C0030q;
import p003a2.InterfaceC0026m;
import p003a2.InterfaceC0027n;
import p003a2.InterfaceC0028o;
import p003a2.InterfaceC0029p;
import p020b2.C5099a;
import p020b2.C5102d;
import p020b2.C5104f;
import p020b2.InterfaceC5103e;
import p020b2.InterfaceC5105g;
import p020b2.InterfaceC5106h;

/* loaded from: classes4.dex */
public class MaterialCalendarView extends ViewGroup {

    /* renamed from: C */
    public static final InterfaceC5105g f5347C = new C5102d();

    /* renamed from: A */
    public boolean f5348A;

    /* renamed from: B */
    public C6603f f5349B;

    /* renamed from: a */
    public final C0030q f5350a;

    /* renamed from: b */
    public final TextView f5351b;

    /* renamed from: c */
    public final C0023j f5352c;

    /* renamed from: d */
    public final C0023j f5353d;

    /* renamed from: e */
    public final C0015b f5354e;

    /* renamed from: f */
    public AbstractC0016c f5355f;

    /* renamed from: g */
    public CalendarDay f5356g;

    /* renamed from: h */
    public LinearLayout f5357h;

    /* renamed from: i */
    public CalendarMode f5358i;

    /* renamed from: j */
    public boolean f5359j;

    /* renamed from: k */
    public final ArrayList f5360k;

    /* renamed from: l */
    public final View.OnClickListener f5361l;

    /* renamed from: m */
    public final ViewPager.OnPageChangeListener f5362m;

    /* renamed from: n */
    public CalendarDay f5363n;

    /* renamed from: o */
    public CalendarDay f5364o;

    /* renamed from: p */
    public InterfaceC0027n f5365p;

    /* renamed from: q */
    public CharSequence f5366q;

    /* renamed from: r */
    public int f5367r;

    /* renamed from: s */
    public int f5368s;

    /* renamed from: t */
    public Drawable f5369t;

    /* renamed from: u */
    public Drawable f5370u;

    /* renamed from: v */
    public int f5371v;

    /* renamed from: w */
    public int f5372w;

    /* renamed from: x */
    public int f5373x;

    /* renamed from: y */
    public boolean f5374y;

    /* renamed from: z */
    public int f5375z;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C6597a();

        /* renamed from: a */
        public int f5376a;

        /* renamed from: b */
        public int f5377b;

        /* renamed from: c */
        public int f5378c;

        /* renamed from: d */
        public int f5379d;

        /* renamed from: e */
        public boolean f5380e;

        /* renamed from: f */
        public CalendarDay f5381f;

        /* renamed from: g */
        public CalendarDay f5382g;

        /* renamed from: h */
        public List f5383h;

        /* renamed from: i */
        public int f5384i;

        /* renamed from: j */
        public int f5385j;

        /* renamed from: k */
        public int f5386k;

        /* renamed from: l */
        public int f5387l;

        /* renamed from: m */
        public boolean f5388m;

        /* renamed from: n */
        public int f5389n;

        /* renamed from: o */
        public boolean f5390o;

        /* renamed from: p */
        public CalendarMode f5391p;

        /* renamed from: q */
        public CalendarDay f5392q;

        /* renamed from: r */
        public boolean f5393r;

        /* renamed from: s */
        public boolean f5394s;

        /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$SavedState$a */
        public static class C6597a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i9) {
                return new SavedState[i9];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, ViewOnClickListenerC6598a viewOnClickListenerC6598a) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i9) {
            super.writeToParcel(parcel, i9);
            parcel.writeInt(this.f5376a);
            parcel.writeInt(this.f5377b);
            parcel.writeInt(this.f5378c);
            parcel.writeInt(this.f5379d);
            parcel.writeByte(this.f5380e ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.f5381f, 0);
            parcel.writeParcelable(this.f5382g, 0);
            parcel.writeTypedList(this.f5383h);
            parcel.writeInt(this.f5384i);
            parcel.writeInt(this.f5385j);
            parcel.writeInt(this.f5386k);
            parcel.writeInt(this.f5387l);
            parcel.writeInt(this.f5388m ? 1 : 0);
            parcel.writeInt(this.f5389n);
            parcel.writeInt(this.f5390o ? 1 : 0);
            parcel.writeInt(this.f5391p == CalendarMode.WEEKS ? 1 : 0);
            parcel.writeParcelable(this.f5392q, 0);
            parcel.writeByte(this.f5393r ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f5394s ? (byte) 1 : (byte) 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f5376a = 0;
            this.f5377b = 0;
            this.f5378c = 0;
            this.f5379d = 4;
            this.f5380e = true;
            this.f5381f = null;
            this.f5382g = null;
            this.f5383h = new ArrayList();
            this.f5384i = 1;
            this.f5385j = 0;
            this.f5386k = -1;
            this.f5387l = -1;
            this.f5388m = true;
            this.f5389n = 1;
            this.f5390o = false;
            this.f5391p = CalendarMode.MONTHS;
            this.f5392q = null;
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5376a = 0;
            this.f5377b = 0;
            this.f5378c = 0;
            this.f5379d = 4;
            this.f5380e = true;
            this.f5381f = null;
            this.f5382g = null;
            this.f5383h = new ArrayList();
            this.f5384i = 1;
            this.f5385j = 0;
            this.f5386k = -1;
            this.f5387l = -1;
            this.f5388m = true;
            this.f5389n = 1;
            this.f5390o = false;
            CalendarMode calendarMode = CalendarMode.MONTHS;
            this.f5391p = calendarMode;
            this.f5392q = null;
            this.f5376a = parcel.readInt();
            this.f5377b = parcel.readInt();
            this.f5378c = parcel.readInt();
            this.f5379d = parcel.readInt();
            this.f5380e = parcel.readByte() != 0;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.f5381f = (CalendarDay) parcel.readParcelable(classLoader);
            this.f5382g = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.f5383h, CalendarDay.CREATOR);
            this.f5384i = parcel.readInt();
            this.f5385j = parcel.readInt();
            this.f5386k = parcel.readInt();
            this.f5387l = parcel.readInt();
            this.f5388m = parcel.readInt() == 1;
            this.f5389n = parcel.readInt();
            this.f5390o = parcel.readInt() == 1;
            this.f5391p = parcel.readInt() == 1 ? CalendarMode.WEEKS : calendarMode;
            this.f5392q = (CalendarDay) parcel.readParcelable(classLoader);
            this.f5393r = parcel.readByte() != 0;
            this.f5394s = parcel.readByte() != 0;
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$a */
    public class ViewOnClickListenerC6598a implements View.OnClickListener {
        public ViewOnClickListenerC6598a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws Resources.NotFoundException {
            if (view == MaterialCalendarView.this.f5353d) {
                MaterialCalendarView.this.f5354e.setCurrentItem(MaterialCalendarView.this.f5354e.getCurrentItem() + 1, true);
            } else if (view == MaterialCalendarView.this.f5352c) {
                MaterialCalendarView.this.f5354e.setCurrentItem(MaterialCalendarView.this.f5354e.getCurrentItem() - 1, true);
            }
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$b */
    public class C6599b implements ViewPager.OnPageChangeListener {
        public C6599b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i9) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i9, float f10, int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i9) {
            MaterialCalendarView.this.f5350a.m167k(MaterialCalendarView.this.f5356g);
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.f5356g = materialCalendarView.f5355f.mo91f(i9);
            MaterialCalendarView.this.m4657M();
            MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
            materialCalendarView2.m4664q(materialCalendarView2.f5356g);
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$c */
    public class C6600c implements ViewPager.PageTransformer {
        public C6600c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(View view, float f10) {
            view.setAlpha((float) Math.sqrt(1.0f - Math.abs(f10)));
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$d */
    public static /* synthetic */ class C6601d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5398a;

        static {
            int[] iArr = new int[CalendarMode.values().length];
            f5398a = iArr;
            try {
                iArr[CalendarMode.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5398a[CalendarMode.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$e */
    public static class C6602e extends ViewGroup.MarginLayoutParams {
        public C6602e(int i9) {
            super(-1, i9);
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$f */
    public class C6603f {

        /* renamed from: a */
        public final CalendarMode f5399a;

        /* renamed from: b */
        public final int f5400b;

        /* renamed from: c */
        public final CalendarDay f5401c;

        /* renamed from: d */
        public final CalendarDay f5402d;

        /* renamed from: e */
        public final boolean f5403e;

        /* renamed from: f */
        public final boolean f5404f;

        public /* synthetic */ C6603f(MaterialCalendarView materialCalendarView, C6604g c6604g, ViewOnClickListenerC6598a viewOnClickListenerC6598a) {
            this(c6604g);
        }

        /* renamed from: g */
        public C6604g m4681g() {
            return new C6604g(MaterialCalendarView.this, this, null);
        }

        public C6603f(C6604g c6604g) {
            this.f5399a = c6604g.f5406a;
            this.f5400b = c6604g.f5407b;
            this.f5401c = c6604g.f5409d;
            this.f5402d = c6604g.f5410e;
            this.f5403e = c6604g.f5408c;
            this.f5404f = c6604g.f5411f;
        }
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$g */
    public class C6604g {

        /* renamed from: a */
        public CalendarMode f5406a;

        /* renamed from: b */
        public int f5407b;

        /* renamed from: c */
        public boolean f5408c;

        /* renamed from: d */
        public CalendarDay f5409d;

        /* renamed from: e */
        public CalendarDay f5410e;

        /* renamed from: f */
        public boolean f5411f;

        public /* synthetic */ C6604g(MaterialCalendarView materialCalendarView, C6603f c6603f, ViewOnClickListenerC6598a viewOnClickListenerC6598a) {
            this(c6603f);
        }

        /* renamed from: g */
        public void m4688g() throws Resources.NotFoundException {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.m4662o(new C6603f(materialCalendarView, this, null));
        }

        /* renamed from: h */
        public C6604g m4689h(boolean z9) {
            this.f5408c = z9;
            return this;
        }

        /* renamed from: i */
        public C6604g m4690i(CalendarMode calendarMode) {
            this.f5406a = calendarMode;
            return this;
        }

        /* renamed from: j */
        public C6604g m4691j(int i9) {
            this.f5407b = i9;
            return this;
        }

        /* renamed from: k */
        public C6604g m4692k(CalendarDay calendarDay) {
            this.f5410e = calendarDay;
            return this;
        }

        /* renamed from: l */
        public C6604g m4693l(CalendarDay calendarDay) {
            this.f5409d = calendarDay;
            return this;
        }

        /* renamed from: m */
        public C6604g m4694m(boolean z9) {
            this.f5411f = z9;
            return this;
        }

        public C6604g() {
            this.f5406a = CalendarMode.MONTHS;
            this.f5407b = Calendar.getInstance().getFirstDayOfWeek();
            this.f5408c = false;
            this.f5409d = null;
            this.f5410e = null;
        }

        public C6604g(C6603f c6603f) {
            this.f5406a = CalendarMode.MONTHS;
            this.f5407b = Calendar.getInstance().getFirstDayOfWeek();
            this.f5408c = false;
            this.f5409d = null;
            this.f5410e = null;
            this.f5406a = c6603f.f5399a;
            this.f5407b = c6603f.f5400b;
            this.f5409d = c6603f.f5401c;
            this.f5410e = c6603f.f5402d;
            this.f5408c = c6603f.f5403e;
            this.f5411f = c6603f.f5404f;
        }
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        this.f5360k = new ArrayList();
        ViewOnClickListenerC6598a viewOnClickListenerC6598a = new ViewOnClickListenerC6598a();
        this.f5361l = viewOnClickListenerC6598a;
        C6599b c6599b = new C6599b();
        this.f5362m = c6599b;
        this.f5363n = null;
        this.f5364o = null;
        this.f5367r = 0;
        this.f5368s = ViewCompat.MEASURED_STATE_MASK;
        this.f5371v = -10;
        this.f5372w = -10;
        this.f5373x = 1;
        this.f5374y = true;
        setClipToPadding(false);
        setClipChildren(false);
        C0023j c0023j = new C0023j(getContext());
        this.f5352c = c0023j;
        c0023j.setContentDescription(getContext().getString(R$string.previous));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f5351b = appCompatTextView;
        C0023j c0023j2 = new C0023j(getContext());
        this.f5353d = c0023j2;
        c0023j2.setContentDescription(getContext().getString(R$string.next));
        C0015b c0015b = new C0015b(getContext());
        this.f5354e = c0015b;
        c0023j.setOnClickListener(viewOnClickListenerC6598a);
        c0023j2.setOnClickListener(viewOnClickListenerC6598a);
        C0030q c0030q = new C0030q(appCompatTextView);
        this.f5350a = c0030q;
        c0030q.m168l(f5347C);
        c0015b.setOnPageChangeListener(c6599b);
        c0015b.setPageTransformer(false, new C6600c());
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.MaterialCalendarView, 0, 0);
        try {
            try {
                int integer = typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_calendarMode, 0);
                this.f5375z = typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_firstDayOfWeek, -1);
                c0030q.m166j(typedArrayObtainStyledAttributes.getInteger(R$styleable.MaterialCalendarView_mcv_titleAnimationOrientation, 0));
                if (this.f5375z < 0) {
                    this.f5375z = Calendar.getInstance().getFirstDayOfWeek();
                }
                this.f5348A = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MaterialCalendarView_mcv_showWeekDays, true);
                m4672z().m4691j(this.f5375z).m4690i(CalendarMode.values()[integer]).m4694m(this.f5348A).m4688g();
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
                setSelectionColor(typedArrayObtainStyledAttributes.getColor(R$styleable.MaterialCalendarView_mcv_selectionColor, m4647v(context)));
                CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(R$styleable.MaterialCalendarView_mcv_weekDayLabels);
                if (textArray != null) {
                    setWeekDayFormatter(new C5099a(textArray));
                }
                CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(R$styleable.MaterialCalendarView_mcv_monthLabels);
                if (textArray2 != null) {
                    setTitleFormatter(new C5104f(textArray2));
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
            this.f5355f.mo110y(f5347C);
            m4655H();
            CalendarDay calendarDayM4622p = CalendarDay.m4622p();
            this.f5356g = calendarDayM4622p;
            setCurrentDate(calendarDayM4622p);
            if (isInEditMode()) {
                removeView(this.f5354e);
                C0025l c0025l = new C0025l(this, this.f5356g, getFirstDayOfWeek(), true);
                c0025l.setSelectionColor(getSelectionColor());
                c0025l.setDateTextAppearance(this.f5355f.m89d());
                c0025l.setWeekDayTextAppearance(this.f5355f.m95j());
                c0025l.setShowOtherDates(getShowOtherDates());
                addView(c0025l, new C6602e(this.f5358i.f5346a + 1));
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: I */
    public static boolean m4634I(int i9) {
        return (i9 & 4) != 0;
    }

    /* renamed from: J */
    public static boolean m4635J(int i9) {
        return (i9 & 1) != 0;
    }

    /* renamed from: K */
    public static boolean m4636K(int i9) {
        return (i9 & 2) != 0;
    }

    private int getWeekCountBasedOnMode() {
        AbstractC0016c abstractC0016c;
        C0015b c0015b;
        CalendarMode calendarMode = this.f5358i;
        int i9 = calendarMode.f5346a;
        if (calendarMode.equals(CalendarMode.MONTHS) && this.f5359j && (abstractC0016c = this.f5355f) != null && (c0015b = this.f5354e) != null) {
            Calendar calendar = (Calendar) abstractC0016c.mo91f(c0015b.getCurrentItem()).m4624e().clone();
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.setFirstDayOfWeek(getFirstDayOfWeek());
            calendar.setMinimalDaysInFirstWeek(1);
            i9 = calendar.get(4);
        }
        return this.f5348A ? i9 + 1 : i9;
    }

    /* renamed from: m */
    public static int m4646m(int i9, int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i9 : size : Math.min(i9, size);
    }

    /* renamed from: v */
    public static int m4647v(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
        return typedValue.data;
    }

    /* renamed from: A */
    public void m4648A(C0020g c0020g) {
        CalendarDay currentDate = getCurrentDate();
        CalendarDay calendarDayM135g = c0020g.m135g();
        int iM4627i = currentDate.m4627i();
        int iM4627i2 = calendarDayM135g.m4627i();
        if (this.f5358i == CalendarMode.MONTHS && this.f5374y && iM4627i != iM4627i2) {
            if (currentDate.m4629l(calendarDayM135g)) {
                m4670x();
            } else if (currentDate.m4630m(calendarDayM135g)) {
                m4669w();
            }
        }
        m4649B(c0020g.m135g(), !c0020g.isChecked());
    }

    /* renamed from: B */
    public void m4649B(CalendarDay calendarDay, boolean z9) {
        int i9 = this.f5373x;
        if (i9 == 2) {
            this.f5355f.mo101p(calendarDay, z9);
            m4663p(calendarDay, z9);
            return;
        }
        if (i9 != 3) {
            this.f5355f.mo86a();
            this.f5355f.mo101p(calendarDay, true);
            m4663p(calendarDay, true);
            return;
        }
        List listMo93h = this.f5355f.mo93h();
        if (listMo93h.size() == 0) {
            this.f5355f.mo101p(calendarDay, z9);
            m4663p(calendarDay, z9);
            return;
        }
        if (listMo93h.size() != 1) {
            this.f5355f.mo86a();
            this.f5355f.mo101p(calendarDay, z9);
            m4663p(calendarDay, z9);
            return;
        }
        CalendarDay calendarDay2 = (CalendarDay) listMo93h.get(0);
        this.f5355f.mo101p(calendarDay, z9);
        if (calendarDay2.equals(calendarDay)) {
            m4663p(calendarDay, z9);
        } else if (calendarDay2.m4629l(calendarDay)) {
            m4665r(calendarDay, calendarDay2);
        } else {
            m4665r(calendarDay2, calendarDay);
        }
    }

    /* renamed from: D */
    public void m4651D(CalendarDay calendarDay) {
        m4663p(calendarDay, false);
    }

    /* renamed from: E */
    public void m4652E(CalendarDay calendarDay, boolean z9) throws Resources.NotFoundException {
        if (calendarDay == null) {
            return;
        }
        this.f5354e.setCurrentItem(this.f5355f.mo90e(calendarDay), z9);
        m4657M();
    }

    /* renamed from: F */
    public void m4653F(CalendarDay calendarDay, boolean z9) {
        if (calendarDay == null) {
            return;
        }
        this.f5355f.mo101p(calendarDay, z9);
    }

    /* renamed from: G */
    public final void m4654G(CalendarDay calendarDay, CalendarDay calendarDay2) throws Resources.NotFoundException {
        CalendarDay calendarDay3 = this.f5356g;
        this.f5355f.mo105t(calendarDay, calendarDay2);
        this.f5356g = calendarDay3;
        if (calendarDay != null) {
            if (!calendarDay.m4629l(calendarDay3)) {
                calendarDay = this.f5356g;
            }
            this.f5356g = calendarDay;
        }
        this.f5354e.setCurrentItem(this.f5355f.mo90e(calendarDay3), false);
        m4657M();
    }

    /* renamed from: H */
    public final void m4655H() throws Resources.NotFoundException {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f5357h = linearLayout;
        linearLayout.setOrientation(0);
        this.f5357h.setClipChildren(false);
        this.f5357h.setClipToPadding(false);
        addView(this.f5357h, new C6602e(1));
        C0023j c0023j = this.f5352c;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        c0023j.setScaleType(scaleType);
        this.f5357h.addView(this.f5352c, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f5351b.setGravity(17);
        this.f5357h.addView(this.f5351b, new LinearLayout.LayoutParams(0, -1, 5.0f));
        this.f5353d.setScaleType(scaleType);
        this.f5357h.addView(this.f5353d, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.f5354e.setId(R$id.mcv_pager);
        this.f5354e.setOffscreenPageLimit(1);
        addView(this.f5354e, new C6602e(this.f5348A ? this.f5358i.f5346a + 1 : this.f5358i.f5346a));
    }

    /* renamed from: L */
    public C6603f m4656L() {
        return this.f5349B;
    }

    /* renamed from: M */
    public final void m4657M() {
        this.f5350a.m162f(this.f5356g);
        this.f5352c.setEnabled(m4659k());
        this.f5353d.setEnabled(m4660l());
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C6602e;
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
        return this.f5368s;
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.f5366q;
        return charSequence != null ? charSequence : getContext().getString(R$string.calendar);
    }

    public CalendarMode getCalendarMode() {
        return this.f5358i;
    }

    public CalendarDay getCurrentDate() {
        return this.f5355f.mo91f(this.f5354e.getCurrentItem());
    }

    public int getFirstDayOfWeek() {
        return this.f5375z;
    }

    public Drawable getLeftArrowMask() {
        return this.f5369t;
    }

    public CalendarDay getMaximumDate() {
        return this.f5364o;
    }

    public CalendarDay getMinimumDate() {
        return this.f5363n;
    }

    public Drawable getRightArrowMask() {
        return this.f5370u;
    }

    public CalendarDay getSelectedDate() {
        List listMo93h = this.f5355f.mo93h();
        if (listMo93h.isEmpty()) {
            return null;
        }
        return (CalendarDay) listMo93h.get(listMo93h.size() - 1);
    }

    @NonNull
    public List<CalendarDay> getSelectedDates() {
        return this.f5355f.mo93h();
    }

    public int getSelectionColor() {
        return this.f5367r;
    }

    public int getSelectionMode() {
        return this.f5373x;
    }

    public int getShowOtherDates() {
        return this.f5355f.mo94i();
    }

    public int getTileHeight() {
        return this.f5371v;
    }

    @Deprecated
    public int getTileSize() {
        return Math.max(this.f5371v, this.f5372w);
    }

    public int getTileWidth() {
        return this.f5372w;
    }

    public int getTitleAnimationOrientation() {
        return this.f5350a.m165i();
    }

    public boolean getTopbarVisible() {
        return this.f5357h.getVisibility() == 0;
    }

    /* renamed from: j */
    public boolean m4658j() {
        return this.f5374y;
    }

    /* renamed from: k */
    public boolean m4659k() {
        return this.f5354e.getCurrentItem() > 0;
    }

    /* renamed from: l */
    public boolean m4660l() {
        return this.f5354e.getCurrentItem() < this.f5355f.getCount() - 1;
    }

    /* renamed from: n */
    public void m4661n() {
        List<CalendarDay> selectedDates = getSelectedDates();
        this.f5355f.mo86a();
        Iterator<CalendarDay> it = selectedDates.iterator();
        while (it.hasNext()) {
            m4663p(it.next(), false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4662o(com.prolificinteractive.materialcalendarview.MaterialCalendarView.C6603f r8) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.m4662o(com.prolificinteractive.materialcalendarview.MaterialCalendarView$f):void");
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
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i11 - i9) - paddingLeft) - getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i14 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(i14, paddingTop, measuredWidth + i14, measuredHeight);
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int mode = View.MeasureSpec.getMode(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int weekCountBasedOnMode = getWeekCountBasedOnMode();
        if (getTopbarVisible()) {
            weekCountBasedOnMode++;
        }
        int iMin = paddingLeft / 7;
        int iM4666s = paddingTop / weekCountBasedOnMode;
        int i11 = this.f5372w;
        int i12 = -1;
        if (i11 == -10 && this.f5371v == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    iMin = Math.min(iMin, iM4666s);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                iMin = iM4666s;
            } else {
                iMin = -1;
                iM4666s = -1;
            }
            iM4666s = -1;
        } else {
            if (i11 > 0) {
                iMin = i11;
            }
            int i13 = this.f5371v;
            if (i13 > 0) {
                i12 = iMin;
                iMin = -1;
                iM4666s = i13;
            } else {
                i12 = iMin;
                iMin = -1;
            }
        }
        if (iMin > 0) {
            iM4666s = iMin;
        } else if (iMin <= 0) {
            int iM4666s2 = i12 <= 0 ? m4666s(44) : i12;
            if (iM4666s <= 0) {
                iM4666s = m4666s(44);
            }
            iMin = iM4666s2;
        } else {
            iMin = i12;
        }
        int i14 = iMin * 7;
        setMeasuredDimension(m4646m(getPaddingLeft() + getPaddingRight() + i14, i9), m4646m((weekCountBasedOnMode * iM4666s) + getPaddingTop() + getPaddingBottom(), i10));
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup.MarginLayoutParams) ((C6602e) childAt.getLayoutParams())).height * iM4666s, 1073741824));
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m4672z().m4691j(savedState.f5384i).m4690i(savedState.f5391p).m4693l(savedState.f5381f).m4692k(savedState.f5382g).m4689h(savedState.f5393r).m4694m(savedState.f5394s).m4688g();
        setSelectionColor(savedState.f5376a);
        setDateTextAppearance(savedState.f5377b);
        setWeekDayTextAppearance(savedState.f5378c);
        setShowOtherDates(savedState.f5379d);
        setAllowClickDaysOutsideCurrentMonth(savedState.f5380e);
        m4661n();
        Iterator it = savedState.f5383h.iterator();
        while (it.hasNext()) {
            m4653F((CalendarDay) it.next(), true);
        }
        setTitleAnimationOrientation(savedState.f5385j);
        setTileWidth(savedState.f5386k);
        setTileHeight(savedState.f5387l);
        setTopbarVisible(savedState.f5388m);
        setSelectionMode(savedState.f5389n);
        setDynamicHeightEnabled(savedState.f5390o);
        setCurrentDate(savedState.f5392q);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5376a = getSelectionColor();
        savedState.f5377b = this.f5355f.m89d();
        savedState.f5378c = this.f5355f.m95j();
        savedState.f5379d = getShowOtherDates();
        savedState.f5380e = m4658j();
        savedState.f5381f = getMinimumDate();
        savedState.f5382g = getMaximumDate();
        savedState.f5383h = getSelectedDates();
        savedState.f5384i = getFirstDayOfWeek();
        savedState.f5385j = getTitleAnimationOrientation();
        savedState.f5389n = getSelectionMode();
        savedState.f5386k = getTileWidth();
        savedState.f5387l = getTileHeight();
        savedState.f5388m = getTopbarVisible();
        savedState.f5391p = this.f5358i;
        savedState.f5390o = this.f5359j;
        savedState.f5392q = this.f5356g;
        savedState.f5393r = this.f5349B.f5403e;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f5354e.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public void m4663p(CalendarDay calendarDay, boolean z9) {
        InterfaceC0027n interfaceC0027n = this.f5365p;
        if (interfaceC0027n != null) {
            interfaceC0027n.mo156a(this, calendarDay, z9);
        }
    }

    /* renamed from: q */
    public void m4664q(CalendarDay calendarDay) {
    }

    /* renamed from: r */
    public void m4665r(CalendarDay calendarDay, CalendarDay calendarDay2) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(calendarDay.m4625f());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(calendarDay2.m4625f());
        while (true) {
            if (!calendar.before(calendar2) && !calendar.equals(calendar2)) {
                return;
            }
            CalendarDay calendarDayM4619c = CalendarDay.m4619c(calendar);
            this.f5355f.mo101p(calendarDayM4619c, true);
            arrayList.add(calendarDayM4619c);
            calendar.add(5, 1);
        }
    }

    /* renamed from: s */
    public final int m4666s(int i9) {
        return (int) TypedValue.applyDimension(1, i9, getResources().getDisplayMetrics());
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z9) {
        this.f5374y = z9;
    }

    public void setArrowColor(int i9) {
        if (i9 == 0) {
            return;
        }
        this.f5368s = i9;
        this.f5352c.m152b(i9);
        this.f5353d.m152b(i9);
        invalidate();
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.f5353d.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.f5352c.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.f5366q = charSequence;
    }

    public void setCurrentDate(@Nullable Calendar calendar) throws Resources.NotFoundException {
        setCurrentDate(CalendarDay.m4619c(calendar));
    }

    public void setDateTextAppearance(int i9) {
        this.f5355f.mo102q(i9);
    }

    public void setDayFormatter(InterfaceC5103e interfaceC5103e) {
        AbstractC0016c abstractC0016c = this.f5355f;
        if (interfaceC5103e == null) {
            interfaceC5103e = InterfaceC5103e.f2211a;
        }
        abstractC0016c.mo103r(interfaceC5103e);
    }

    public void setDayFormatterContentDescription(InterfaceC5103e interfaceC5103e) {
        this.f5355f.mo104s(interfaceC5103e);
    }

    public void setDynamicHeightEnabled(boolean z9) {
        this.f5359j = z9;
    }

    public void setHeaderTextAppearance(int i9) {
        this.f5351b.setTextAppearance(getContext(), i9);
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.f5369t = drawable;
        this.f5352c.setImageDrawable(drawable);
    }

    public void setOnDateChangedListener(InterfaceC0027n interfaceC0027n) {
        this.f5365p = interfaceC0027n;
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener) {
        this.f5351b.setOnClickListener(onClickListener);
    }

    public void setPagingEnabled(boolean z9) {
        this.f5354e.m83a(z9);
        m4657M();
    }

    public void setRightArrowMask(Drawable drawable) {
        this.f5370u = drawable;
        this.f5353d.setImageDrawable(drawable);
    }

    public void setSelectedDate(@Nullable Calendar calendar) {
        setSelectedDate(CalendarDay.m4619c(calendar));
    }

    public void setSelectionColor(int i9) {
        if (i9 == 0) {
            if (!isInEditMode()) {
                return;
            } else {
                i9 = -7829368;
            }
        }
        this.f5367r = i9;
        this.f5355f.mo106u(i9);
        invalidate();
    }

    public void setSelectionMode(int i9) {
        int i10 = this.f5373x;
        this.f5373x = i9;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    this.f5373x = 0;
                    if (i10 != 0) {
                        m4661n();
                    }
                } else {
                    m4661n();
                }
            }
        } else if ((i10 == 2 || i10 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        this.f5355f.mo107v(this.f5373x != 0);
    }

    public void setShowOtherDates(int i9) {
        this.f5355f.mo108w(i9);
    }

    public void setTileHeight(int i9) {
        this.f5371v = i9;
        requestLayout();
    }

    public void setTileHeightDp(int i9) {
        setTileHeight(m4666s(i9));
    }

    public void setTileSize(int i9) {
        this.f5372w = i9;
        this.f5371v = i9;
        requestLayout();
    }

    public void setTileSizeDp(int i9) {
        setTileSize(m4666s(i9));
    }

    public void setTileWidth(int i9) {
        this.f5372w = i9;
        requestLayout();
    }

    public void setTileWidthDp(int i9) {
        setTileWidth(m4666s(i9));
    }

    public void setTitleAnimationOrientation(int i9) {
        this.f5350a.m166j(i9);
    }

    public void setTitleFormatter(InterfaceC5105g interfaceC5105g) {
        if (interfaceC5105g == null) {
            interfaceC5105g = f5347C;
        }
        this.f5350a.m168l(interfaceC5105g);
        this.f5355f.mo110y(interfaceC5105g);
        m4657M();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new C5104f(charSequenceArr));
    }

    public void setTopbarVisible(boolean z9) {
        this.f5357h.setVisibility(z9 ? 0 : 8);
        requestLayout();
    }

    public void setWeekDayFormatter(InterfaceC5106h interfaceC5106h) {
        AbstractC0016c abstractC0016c = this.f5355f;
        if (interfaceC5106h == null) {
            interfaceC5106h = InterfaceC5106h.f2213a;
        }
        abstractC0016c.mo111z(interfaceC5106h);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new C5099a(charSequenceArr));
    }

    public void setWeekDayTextAppearance(int i9) {
        this.f5355f.mo84A(i9);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C6602e generateDefaultLayoutParams() {
        return new C6602e(1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public C6602e generateLayoutParams(AttributeSet attributeSet) {
        return new C6602e(1);
    }

    /* renamed from: w */
    public void m4669w() throws Resources.NotFoundException {
        if (m4660l()) {
            C0015b c0015b = this.f5354e;
            c0015b.setCurrentItem(c0015b.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: x */
    public void m4670x() throws Resources.NotFoundException {
        if (m4659k()) {
            C0015b c0015b = this.f5354e;
            c0015b.setCurrentItem(c0015b.getCurrentItem() - 1, true);
        }
    }

    /* renamed from: y */
    public void m4671y() {
        this.f5355f.mo97l();
    }

    /* renamed from: z */
    public C6604g m4672z() {
        return new C6604g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C6602e(1);
    }

    public void setCurrentDate(@Nullable Date date) throws Resources.NotFoundException {
        setCurrentDate(CalendarDay.m4620d(date));
    }

    public void setSelectedDate(@Nullable Date date) {
        setSelectedDate(CalendarDay.m4620d(date));
    }

    public void setTitleMonths(@ArrayRes int i9) {
        setTitleMonths(getResources().getTextArray(i9));
    }

    public void setWeekDayLabels(@ArrayRes int i9) {
        setWeekDayLabels(getResources().getTextArray(i9));
    }

    public void setCurrentDate(@Nullable CalendarDay calendarDay) throws Resources.NotFoundException {
        m4652E(calendarDay, true);
    }

    public void setSelectedDate(@Nullable CalendarDay calendarDay) {
        m4661n();
        if (calendarDay != null) {
            m4653F(calendarDay, true);
        }
    }

    /* renamed from: C */
    public void m4650C(C0020g c0020g) {
    }

    public void setOnDateLongClickListener(InterfaceC0026m interfaceC0026m) {
    }

    public void setOnMonthChangedListener(InterfaceC0028o interfaceC0028o) {
    }

    public void setOnRangeSelectedListener(InterfaceC0029p interfaceC0029p) {
    }
}
