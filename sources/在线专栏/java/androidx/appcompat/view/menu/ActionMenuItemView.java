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
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0218i0;
import p015c.C1047j;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0132n.a, View.OnClickListener, ActionMenuView.InterfaceC0150a {

    /* renamed from: a */
    C0127i f491a;

    /* renamed from: b */
    private CharSequence f492b;

    /* renamed from: c */
    private Drawable f493c;

    /* renamed from: d */
    C0125g.b f494d;

    /* renamed from: e */
    private AbstractViewOnTouchListenerC0234t f495e;

    /* renamed from: f */
    AbstractC0118b f496f;

    /* renamed from: g */
    private boolean f497g;

    /* renamed from: h */
    private boolean f498h;

    /* renamed from: i */
    private int f499i;

    /* renamed from: j */
    private int f500j;

    /* renamed from: k */
    private int f501k;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    private class C0117a extends AbstractViewOnTouchListenerC0234t {
        public C0117a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
        /* renamed from: b */
        public InterfaceC0134p mo413b() {
            AbstractC0118b abstractC0118b = ActionMenuItemView.this.f496f;
            if (abstractC0118b != null) {
                return abstractC0118b.mo415a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractViewOnTouchListenerC0234t
        /* renamed from: c */
        protected boolean mo414c() {
            InterfaceC0134p interfaceC0134pMo413b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0125g.b bVar = actionMenuItemView.f494d;
            return bVar != null && bVar.mo416a(actionMenuItemView.f491a) && (interfaceC0134pMo413b = mo413b()) != null && interfaceC0134pMo413b.mo450a();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    public static abstract class AbstractC0118b {
        /* renamed from: a */
        public abstract InterfaceC0134p mo415a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: d */
    private boolean m408d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        return i4 >= 480 || (i4 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: e */
    private void m409e() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f492b);
        if (this.f493c != null && (!this.f491a.m479B() || (!this.f497g && !this.f498h))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f492b : null);
        CharSequence contentDescription = this.f491a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z5 ? null : this.f491a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f491a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            C0218i0.m886a(this, z5 ? null : this.f491a.getTitle());
        } else {
            C0218i0.m886a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0150a
    /* renamed from: a */
    public boolean mo410a() {
        return m412c();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0150a
    /* renamed from: b */
    public boolean mo411b() {
        return m412c() && this.f491a.getIcon() == null;
    }

    /* renamed from: c */
    public boolean m412c() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public C0127i getItemData() {
        return this.f491a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public void initialize(C0127i c0127i, int i4) {
        this.f491a = c0127i;
        setIcon(c0127i.getIcon());
        setTitle(c0127i.m484i(this));
        setId(c0127i.getItemId());
        setVisibility(c0127i.isVisible() ? 0 : 8);
        setEnabled(c0127i.isEnabled());
        if (c0127i.hasSubMenu() && this.f495e == null) {
            this.f495e = new C0117a();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0125g.b bVar = this.f494d;
        if (bVar != null) {
            bVar.mo416a(this.f491a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f497g = m408d();
        m409e();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        boolean zM412c = m412c();
        if (zM412c && (i6 = this.f500j) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f499i) : this.f499i;
        if (mode != 1073741824 && this.f499i > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i5);
        }
        if (zM412c || this.f493c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f493c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractViewOnTouchListenerC0234t abstractViewOnTouchListenerC0234t;
        if (this.f491a.hasSubMenu() && (abstractViewOnTouchListenerC0234t = this.f495e) != null && abstractViewOnTouchListenerC0234t.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f498h != z3) {
            this.f498h = z3;
            C0127i c0127i = this.f491a;
            if (c0127i != null) {
                c0127i.m480c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f493c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f501k;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        m409e();
    }

    public void setItemInvoker(C0125g.b bVar) {
        this.f494d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f500j = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(AbstractC0118b abstractC0118b) {
        this.f496f = abstractC0118b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f492b = charSequence;
        m409e();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f497g = m408d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1047j.f6158v, i4, 0);
        this.f499i = typedArrayObtainStyledAttributes.getDimensionPixelSize(C1047j.f6163w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f501k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f500j = -1;
        setSaveEnabled(false);
    }
}
