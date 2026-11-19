package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import io.github.inflationx.calligraphy3.BuildConfig;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Objects;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p005b.p012g.p013i.C0056i;
import p000a.p005b.p012g.p013i.InterfaceC0061n;
import p000a.p005b.p014h.C0110u0;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0061n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    public C0056i f2752b;

    /* renamed from: c */
    public ImageView f2753c;

    /* renamed from: d */
    public RadioButton f2754d;

    /* renamed from: e */
    public TextView f2755e;

    /* renamed from: f */
    public CheckBox f2756f;

    /* renamed from: g */
    public TextView f2757g;

    /* renamed from: h */
    public ImageView f2758h;

    /* renamed from: i */
    public ImageView f2759i;

    /* renamed from: j */
    public LinearLayout f2760j;

    /* renamed from: k */
    public Drawable f2761k;

    /* renamed from: l */
    public int f2762l;

    /* renamed from: m */
    public Context f2763m;

    /* renamed from: n */
    public boolean f2764n;

    /* renamed from: o */
    public Drawable f2765o;

    /* renamed from: p */
    public boolean f2766p;

    /* renamed from: q */
    public LayoutInflater f2767q;

    /* renamed from: r */
    public boolean f2768r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0110u0 c0110u0M414q = C0110u0.m414q(getContext(), attributeSet, C0014b.f42q, C1088R.attr.listMenuViewStyle, 0);
        this.f2761k = c0110u0M414q.m421g(5);
        this.f2762l = c0110u0M414q.m426l(1, -1);
        this.f2764n = c0110u0M414q.m415a(7, false);
        this.f2763m = context;
        this.f2765o = c0110u0M414q.m421g(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, C1088R.attr.dropDownListViewStyle, 0);
        this.f2766p = typedArrayObtainStyledAttributes.hasValue(0);
        c0110u0M414q.f810b.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f2767q == null) {
            this.f2767q = LayoutInflater.from(getContext());
        }
        return this.f2767q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f2758h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public final void m1566a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C1088R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.f2756f = checkBox;
        LinearLayout linearLayout = this.f2760j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f2759i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2759i.getLayoutParams();
        rect.top = this.f2759i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* renamed from: b */
    public final void m1567b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C1088R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.f2754d = radioButton;
        LinearLayout linearLayout = this.f2760j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    /* renamed from: c */
    public void m1568c(boolean z) {
        int i;
        String string;
        int i2 = (z && this.f2752b.m233m()) ? 0 : 8;
        if (i2 == 0) {
            TextView textView = this.f2757g;
            C0056i c0056i = this.f2752b;
            char cM225e = c0056i.m225e();
            if (cM225e == 0) {
                string = BuildConfig.FLAVOR;
            } else {
                Resources resources = c0056i.f477n.f433a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(c0056i.f477n.f433a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(C1088R.string.abc_prepend_shortcut_label));
                }
                int i3 = c0056i.f477n.mo209n() ? c0056i.f474k : c0056i.f472i;
                C0056i.m223c(sb, i3, 65536, resources.getString(C1088R.string.abc_menu_meta_shortcut_label));
                C0056i.m223c(sb, i3, 4096, resources.getString(C1088R.string.abc_menu_ctrl_shortcut_label));
                C0056i.m223c(sb, i3, 2, resources.getString(C1088R.string.abc_menu_alt_shortcut_label));
                C0056i.m223c(sb, i3, 1, resources.getString(C1088R.string.abc_menu_shift_shortcut_label));
                C0056i.m223c(sb, i3, 4, resources.getString(C1088R.string.abc_menu_sym_shortcut_label));
                C0056i.m223c(sb, i3, 8, resources.getString(C1088R.string.abc_menu_function_shortcut_label));
                if (cM225e == '\b') {
                    i = C1088R.string.abc_menu_delete_shortcut_label;
                } else if (cM225e == '\n') {
                    i = C1088R.string.abc_menu_enter_shortcut_label;
                } else if (cM225e != ' ') {
                    sb.append(cM225e);
                    string = sb.toString();
                } else {
                    i = C1088R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i));
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f2757g.getVisibility() != i2) {
            this.f2757g.setVisibility(i2);
        }
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n.a
    /* renamed from: d */
    public void mo251d(C0056i c0056i, int i) {
        this.f2752b = c0056i;
        setVisibility(c0056i.isVisible() ? 0 : 8);
        setTitle(c0056i.f468e);
        setCheckable(c0056i.isCheckable());
        boolean zM233m = c0056i.m233m();
        c0056i.m225e();
        m1568c(zM233m);
        setIcon(c0056i.getIcon());
        setEnabled(c0056i.isEnabled());
        setSubMenuArrowVisible(c0056i.hasSubMenu());
        setContentDescription(c0056i.f480q);
    }

    @Override // p000a.p005b.p012g.p013i.InterfaceC0061n.a
    public C0056i getItemData() {
        return this.f2752b;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f2761k;
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        setBackground(drawable);
        TextView textView = (TextView) findViewById(C1088R.id.title);
        this.f2755e = textView;
        int i = this.f2762l;
        if (i != -1) {
            textView.setTextAppearance(this.f2763m, i);
        }
        this.f2757g = (TextView) findViewById(C1088R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(C1088R.id.submenuarrow);
        this.f2758h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f2765o);
        }
        this.f2759i = (ImageView) findViewById(C1088R.id.group_divider);
        this.f2760j = (LinearLayout) findViewById(C1088R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f2753c != null && this.f2764n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2753c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f2754d == null && this.f2756f == null) {
            return;
        }
        if (this.f2752b.m228h()) {
            if (this.f2754d == null) {
                m1567b();
            }
            compoundButton = this.f2754d;
            compoundButton2 = this.f2756f;
        } else {
            if (this.f2756f == null) {
                m1566a();
            }
            compoundButton = this.f2756f;
            compoundButton2 = this.f2754d;
        }
        if (z) {
            compoundButton.setChecked(this.f2752b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f2756f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f2754d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2752b.m228h()) {
            if (this.f2754d == null) {
                m1567b();
            }
            compoundButton = this.f2754d;
        } else {
            if (this.f2756f == null) {
                m1566a();
            }
            compoundButton = this.f2756f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2768r = z;
        this.f2764n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f2759i;
        if (imageView != null) {
            imageView.setVisibility((this.f2766p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f2752b.f477n);
        boolean z = this.f2768r;
        if (z || this.f2764n) {
            ImageView imageView = this.f2753c;
            if (imageView == null && drawable == null && !this.f2764n) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(C1088R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f2753c = imageView2;
                LinearLayout linearLayout = this.f2760j;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f2764n) {
                this.f2753c.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f2753c;
            if (!z) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f2753c.getVisibility() != 0) {
                this.f2753c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.f2755e.setText(charSequence);
            if (this.f2755e.getVisibility() == 0) {
                return;
            }
            textView = this.f2755e;
            i = 0;
        } else {
            i = 8;
            if (this.f2755e.getVisibility() == 8) {
                return;
            } else {
                textView = this.f2755e;
            }
        }
        textView.setVisibility(i);
    }
}
