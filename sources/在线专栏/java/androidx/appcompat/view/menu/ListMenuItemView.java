package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0132n;
import androidx.appcompat.widget.C0214g0;
import androidx.core.view.C0358u;
import p015c.C1038a;
import p015c.C1043f;
import p015c.C1044g;
import p015c.C1047j;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0132n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a */
    private C0127i f506a;

    /* renamed from: b */
    private ImageView f507b;

    /* renamed from: c */
    private RadioButton f508c;

    /* renamed from: d */
    private TextView f509d;

    /* renamed from: e */
    private CheckBox f510e;

    /* renamed from: f */
    private TextView f511f;

    /* renamed from: g */
    private ImageView f512g;

    /* renamed from: h */
    private ImageView f513h;

    /* renamed from: i */
    private LinearLayout f514i;

    /* renamed from: j */
    private Drawable f515j;

    /* renamed from: k */
    private int f516k;

    /* renamed from: l */
    private Context f517l;

    /* renamed from: m */
    private boolean f518m;

    /* renamed from: n */
    private Drawable f519n;

    /* renamed from: o */
    private boolean f520o;

    /* renamed from: p */
    private LayoutInflater f521p;

    /* renamed from: q */
    private boolean f522q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1038a.f5725D);
    }

    /* renamed from: a */
    private void m417a(View view) {
        m418b(view, -1);
    }

    /* renamed from: b */
    private void m418b(View view, int i4) {
        LinearLayout linearLayout = this.f514i;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    /* renamed from: c */
    private void m419c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C1044g.f5889j, (ViewGroup) this, false);
        this.f510e = checkBox;
        m417a(checkBox);
    }

    /* renamed from: d */
    private void m420d() {
        ImageView imageView = (ImageView) getInflater().inflate(C1044g.f5890k, (ViewGroup) this, false);
        this.f507b = imageView;
        m418b(imageView, 0);
    }

    /* renamed from: e */
    private void m421e() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C1044g.f5892m, (ViewGroup) this, false);
        this.f508c = radioButton;
        m417a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f521p == null) {
            this.f521p = LayoutInflater.from(getContext());
        }
        return this.f521p;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f512g;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f513h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f513h.getLayoutParams();
        rect.top += this.f513h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: f */
    public void m422f(boolean z3, char c4) {
        int i4 = (z3 && this.f506a.m478A()) ? 0 : 8;
        if (i4 == 0) {
            this.f511f.setText(this.f506a.m483h());
        }
        if (this.f511f.getVisibility() != i4) {
            this.f511f.setVisibility(i4);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public C0127i getItemData() {
        return this.f506a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public void initialize(C0127i c0127i, int i4) {
        this.f506a = c0127i;
        setVisibility(c0127i.isVisible() ? 0 : 8);
        setTitle(c0127i.m484i(this));
        setCheckable(c0127i.isCheckable());
        m422f(c0127i.m478A(), c0127i.m482g());
        setIcon(c0127i.getIcon());
        setEnabled(c0127i.isEnabled());
        setSubMenuArrowVisible(c0127i.hasSubMenu());
        setContentDescription(c0127i.getContentDescription());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C0358u.m2057t0(this, this.f515j);
        TextView textView = (TextView) findViewById(C1043f.f5850S);
        this.f509d = textView;
        int i4 = this.f516k;
        if (i4 != -1) {
            textView.setTextAppearance(this.f517l, i4);
        }
        this.f511f = (TextView) findViewById(C1043f.f5843L);
        ImageView imageView = (ImageView) findViewById(C1043f.f5846O);
        this.f512g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f519n);
        }
        this.f513h = (ImageView) findViewById(C1043f.f5874u);
        this.f514i = (LinearLayout) findViewById(C1043f.f5866m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (this.f507b != null && this.f518m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f507b.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0132n.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z3 && this.f508c == null && this.f510e == null) {
            return;
        }
        if (this.f506a.m488m()) {
            if (this.f508c == null) {
                m421e();
            }
            compoundButton = this.f508c;
            compoundButton2 = this.f510e;
        } else {
            if (this.f510e == null) {
                m419c();
            }
            compoundButton = this.f510e;
            compoundButton2 = this.f508c;
        }
        if (z3) {
            compoundButton.setChecked(this.f506a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f510e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f508c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if (this.f506a.m488m()) {
            if (this.f508c == null) {
                m421e();
            }
            compoundButton = this.f508c;
        } else {
            if (this.f510e == null) {
                m419c();
            }
            compoundButton = this.f510e;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f522q = z3;
        this.f518m = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f513h;
        if (imageView != null) {
            imageView.setVisibility((this.f520o || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z3 = this.f506a.m501z() || this.f522q;
        if (z3 || this.f518m) {
            ImageView imageView = this.f507b;
            if (imageView == null && drawable == null && !this.f518m) {
                return;
            }
            if (imageView == null) {
                m420d();
            }
            if (drawable == null && !this.f518m) {
                this.f507b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f507b;
            if (!z3) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f507b.getVisibility() != 0) {
                this.f507b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f509d.getVisibility() != 8) {
                this.f509d.setVisibility(8);
            }
        } else {
            this.f509d.setText(charSequence);
            if (this.f509d.getVisibility() != 0) {
                this.f509d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        C0214g0 c0214g0M815v = C0214g0.m815v(getContext(), attributeSet, C1047j.f6044Y1, i4, 0);
        this.f515j = c0214g0M815v.m822g(C1047j.f6055a2);
        this.f516k = c0214g0M815v.m829n(C1047j.f6049Z1, -1);
        this.f518m = c0214g0M815v.m816a(C1047j.f6061b2, false);
        this.f517l = context;
        this.f519n = c0214g0M815v.m822g(C1047j.f6066c2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C1038a.f5722A, 0);
        this.f520o = typedArrayObtainStyledAttributes.hasValue(0);
        c0214g0M815v.m835w();
        typedArrayObtainStyledAttributes.recycle();
    }
}
