package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p005b.C0014b;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p000a.p031h.p043j.InterfaceC0274w;

/* renamed from: a.b.h.a */
/* loaded from: classes.dex */
public abstract class AbstractC0067a extends ViewGroup {

    /* renamed from: b */
    public final a f541b;

    /* renamed from: c */
    public final Context f542c;

    /* renamed from: d */
    public ActionMenuView f543d;

    /* renamed from: e */
    public C0073c f544e;

    /* renamed from: f */
    public int f545f;

    /* renamed from: g */
    public C0273v f546g;

    /* renamed from: h */
    public boolean f547h;

    /* renamed from: i */
    public boolean f548i;

    /* renamed from: a.b.h.a$a */
    public class a implements InterfaceC0274w {

        /* renamed from: a */
        public boolean f549a = false;

        /* renamed from: b */
        public int f550b;

        public a() {
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: a */
        public void mo88a(View view) {
            if (this.f549a) {
                return;
            }
            AbstractC0067a abstractC0067a = AbstractC0067a.this;
            abstractC0067a.f546g = null;
            AbstractC0067a.super.setVisibility(this.f550b);
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: b */
        public void mo97b(View view) {
            AbstractC0067a.super.setVisibility(0);
            this.f549a = false;
        }

        @Override // p000a.p031h.p043j.InterfaceC0274w
        /* renamed from: c */
        public void mo257c(View view) {
            this.f549a = true;
        }
    }

    public AbstractC0067a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC0067a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f541b = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C1088R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f542c = context;
        } else {
            this.f542c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* renamed from: c */
    public int m254c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: d */
    public int m255d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: e */
    public C0273v m256e(int i, long j) {
        C0273v c0273v = this.f546g;
        if (c0273v != null) {
            c0273v.m887b();
        }
        if (i != 0) {
            C0273v c0273vM862a = C0266o.m862a(this);
            c0273vM862a.m886a(0.0f);
            c0273vM862a.m888c(j);
            a aVar = this.f541b;
            AbstractC0067a.this.f546g = c0273vM862a;
            aVar.f550b = i;
            View view = c0273vM862a.f1632a.get();
            if (view != null) {
                c0273vM862a.m890e(view, aVar);
            }
            return c0273vM862a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0273v c0273vM862a2 = C0266o.m862a(this);
        c0273vM862a2.m886a(1.0f);
        c0273vM862a2.m888c(j);
        a aVar2 = this.f541b;
        AbstractC0067a.this.f546g = c0273vM862a2;
        aVar2.f550b = i;
        View view2 = c0273vM862a2.f1632a.get();
        if (view2 != null) {
            c0273vM862a2.m890e(view2, aVar2);
        }
        return c0273vM862a2;
    }

    public int getAnimatedVisibility() {
        return this.f546g != null ? this.f541b.f550b : getVisibility();
    }

    public int getContentHeight() {
        return this.f545f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0014b.f26a, C1088R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0073c c0073c = this.f544e;
        if (c0073c != null) {
            Configuration configuration2 = c0073c.f372c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c0073c.f563q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            C0054g c0054g = c0073c.f373d;
            if (c0054g != null) {
                c0054g.m212q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f548i = false;
        }
        if (!this.f548i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f548i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f548i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f547h = false;
        }
        if (!this.f547h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f547h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f547h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0273v c0273v = this.f546g;
            if (c0273v != null) {
                c0273v.m887b();
            }
            super.setVisibility(i);
        }
    }
}
