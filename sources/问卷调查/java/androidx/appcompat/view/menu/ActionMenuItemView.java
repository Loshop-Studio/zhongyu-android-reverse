package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import java.util.concurrent.ExecutionException;
import p000a.p005b.C0013a;
import p000a.p005b.C0014b;
import p000a.p005b.p012g.p013i.C0054g;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.InterfaceC0061n;
import p000a.p005b.p012g.p013i.InterfaceC0063p;
import p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0;
import p000a.p005b.p014h.C0073c;
import p000a.p005b.p014h.C0113w;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C0113w implements InterfaceC0061n.a, View.OnClickListener, ActionMenuView.InterfaceC0468a {

    /* renamed from: g */
    public C0056i f2738g;

    /* renamed from: h */
    public CharSequence f2739h;

    /* renamed from: i */
    public Drawable f2740i;

    /* renamed from: j */
    public C0054g.b f2741j;

    /* renamed from: k */
    public AbstractViewOnTouchListenerC0078e0 f2742k;

    /* renamed from: l */
    public AbstractC0461b f2743l;

    /* renamed from: m */
    public boolean f2744m;

    /* renamed from: n */
    public boolean f2745n;

    /* renamed from: o */
    public int f2746o;

    /* renamed from: p */
    public int f2747p;

    /* renamed from: q */
    public int f2748q;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    public class C0460a extends AbstractViewOnTouchListenerC0078e0 {
        public C0460a() {
            super(ActionMenuItemView.this);
        }

        @Override // p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0
        /* renamed from: b */
        public InterfaceC0063p mo293b() {
            C0073c.a aVar;
            AbstractC0461b abstractC0461b = ActionMenuItemView.this.f2743l;
            if (abstractC0461b == null || (aVar = C0073c.this.f568v) == null) {
                return null;
            }
            return aVar.m244a();
        }

        @Override // p000a.p005b.p014h.AbstractViewOnTouchListenerC0078e0
        /* renamed from: c */
        public boolean mo294c() {
            InterfaceC0063p interfaceC0063pMo293b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0054g.b bVar = actionMenuItemView.f2741j;
            return bVar != null && bVar.mo222b(actionMenuItemView.f2738g) && (interfaceC0063pMo293b = mo293b()) != null && interfaceC0063pMo293b.mo171a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0461b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f2744m = m1564f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f28c, 0, 0);
        this.f2746o = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f2748q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f2747p = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0468a
    /* renamed from: a */
    public boolean mo291a() {
        return m1563e() && this.f2738g.getIcon() == null;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0468a
    /* renamed from: b */
    public boolean mo292b() {
        return m1563e();
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n.a
    /* renamed from: d */
    public void mo251d(C0056i c0056i, int i) {
        this.f2738g = c0056i;
        setIcon(c0056i.getIcon());
        setTitle(c0056i.getTitleCondensed());
        setId(c0056i.f464a);
        setVisibility(c0056i.isVisible() ? 0 : 8);
        setEnabled(c0056i.isEnabled());
        if (c0056i.hasSubMenu() && this.f2742k == null) {
            this.f2742k = new C0460a();
        }
    }

    /* renamed from: e */
    public boolean m1563e() {
        return !TextUtils.isEmpty(getText());
    }

    /* renamed from: f */
    public final boolean m1564f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: g */
    public final void m1565g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f2739h);
        if (this.f2740i != null) {
            if (!((this.f2738g.f488y & 4) == 4) || (!this.f2744m && !this.f2745n)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.f2739h : null);
        CharSequence charSequence = this.f2738g.f480q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z3 ? null : this.f2738g.f468e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f2738g.f481r;
        if (TextUtils.isEmpty(charSequence2)) {
            C0013a.m13d(this, z3 ? null : this.f2738g.f468e);
        } else {
            C0013a.m13d(this, charSequence2);
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n.a
    public C0056i getItemData() {
        return this.f2738g;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0054g.b bVar = this.f2741j;
        if (bVar != null) {
            bVar.mo222b(this.f2738g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2744m = m1564f();
        m1565g();
    }

    @Override // p000a.p005b.p014h.C0113w, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) throws ExecutionException, InterruptedException {
        int i3;
        boolean zM1563e = m1563e();
        if (zM1563e && (i3 = this.f2747p) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f2746o) : this.f2746o;
        if (mode != 1073741824 && this.f2746o > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i2);
        }
        if (zM1563e || this.f2740i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f2740i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0078e0 abstractViewOnTouchListenerC0078e0;
        if (this.f2738g.hasSubMenu() && (abstractViewOnTouchListenerC0078e0 = this.f2742k) != null && abstractViewOnTouchListenerC0078e0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f2745n != z) {
            this.f2745n = z;
            C0056i c0056i = this.f2738g;
            if (c0056i != null) {
                c0056i.f477n.m211p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f2740i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f2748q;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1565g();
    }

    public void setItemInvoker(C0054g.b bVar) {
        this.f2741j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f2747p = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0461b abstractC0461b) {
        this.f2743l = abstractC0461b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2739h = charSequence;
        m1565g();
    }
}
