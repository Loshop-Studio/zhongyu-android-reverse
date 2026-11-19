package com.xuexiang.xui.widget.dialog.materialdialog;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC6875e;
import com.xuexiang.xui.utils.AbstractC6876f;
import com.xuexiang.xui.utils.AbstractC6877g;
import com.xuexiang.xui.widget.dialog.materialdialog.C6916a;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p003a2.AbstractC0022a;
import p150k1.AbstractC9051b;
import p305y1.AbstractDialogC10601a;
import p316z1.AbstractC10702b;
import p316z1.C10703c;

/* loaded from: classes4.dex */
public class MaterialDialog extends AbstractDialogC10601a implements View.OnClickListener, C6916a.c {

    /* renamed from: c */
    public final C6913g f7449c;

    /* renamed from: d */
    public final Handler f7450d;

    /* renamed from: e */
    public ImageView f7451e;

    /* renamed from: f */
    public TextView f7452f;

    /* renamed from: g */
    public TextView f7453g;

    /* renamed from: h */
    public EditText f7454h;

    /* renamed from: i */
    public RecyclerView f7455i;

    /* renamed from: j */
    public View f7456j;

    /* renamed from: k */
    public FrameLayout f7457k;

    /* renamed from: l */
    public ProgressBar f7458l;

    /* renamed from: m */
    public TextView f7459m;

    /* renamed from: n */
    public TextView f7460n;

    /* renamed from: o */
    public TextView f7461o;

    /* renamed from: p */
    public CheckBox f7462p;

    /* renamed from: q */
    public MDButton f7463q;

    /* renamed from: r */
    public MDButton f7464r;

    /* renamed from: s */
    public MDButton f7465s;

    /* renamed from: t */
    public ListType f7466t;

    /* renamed from: u */
    public List f7467u;

    public static class DialogException extends WindowManager.BadTokenException {
        public DialogException(String str) {
            super(str);
        }
    }

    public enum ListType {
        REGULAR,
        SINGLE,
        MULTI;

        /* renamed from: a */
        public static int m6729a(ListType listType) {
            int i10 = C6912f.f7482b[listType.ordinal()];
            if (i10 == 1) {
                return R$layout.xmd_layout_listitem;
            }
            if (i10 == 2) {
                return R$layout.xmd_layout_listitem_single_choice;
            }
            if (i10 == 3) {
                return R$layout.xmd_layout_listitem_multi_choice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC6907a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$a$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f7473a;

            public a(int i10) {
                this.f7473a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                MaterialDialog.this.f7455i.requestFocus();
                MaterialDialog.this.f7449c.f7515U.scrollToPosition(this.f7473a);
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC6907a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int iIntValue;
            MaterialDialog.this.f7455i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MaterialDialog materialDialog = MaterialDialog.this;
            ListType listType = materialDialog.f7466t;
            ListType listType2 = ListType.SINGLE;
            if (listType == listType2 || listType == ListType.MULTI) {
                if (listType == listType2) {
                    iIntValue = materialDialog.f7449c.f7503K;
                    if (iIntValue < 0) {
                        return;
                    }
                } else {
                    List list = materialDialog.f7467u;
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    Collections.sort(MaterialDialog.this.f7467u);
                    iIntValue = ((Integer) MaterialDialog.this.f7467u.get(0)).intValue();
                }
                MaterialDialog.this.f7455i.post(new a(iIntValue));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$b */
    public class C6908b implements AbstractC6876f.a {
        public C6908b() {
        }

        @Override // com.xuexiang.xui.utils.AbstractC6876f.a
        /* renamed from: a */
        public void mo6466a(Window window) {
            MaterialDialog.this.m6728w();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$c */
    public class RunnableC6909c implements Runnable {
        public RunnableC6909c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialDialog materialDialog = MaterialDialog.this;
            TextView textView = materialDialog.f7459m;
            if (textView != null) {
                textView.setText(materialDialog.f7449c.f7566w0.format(materialDialog.m6714i() / MaterialDialog.this.m6717l()));
            }
            MaterialDialog materialDialog2 = MaterialDialog.this;
            TextView textView2 = materialDialog2.f7460n;
            if (textView2 != null) {
                textView2.setText(String.format(materialDialog2.f7449c.f7564v0, Integer.valueOf(materialDialog2.m6714i()), Integer.valueOf(MaterialDialog.this.m6717l())));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$d */
    public class C6910d implements TextWatcher {
        public C6910d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            int length = charSequence.toString().length();
            MaterialDialog materialDialog = MaterialDialog.this;
            if (!materialDialog.f7449c.f7544l0) {
                z = length == 0;
                materialDialog.m6711f(DialogAction.POSITIVE).setEnabled(!z);
            }
            MaterialDialog.this.m6720o(length, z);
            MaterialDialog materialDialog2 = MaterialDialog.this;
            C6913g c6913g = materialDialog2.f7449c;
            if (c6913g.f7548n0) {
                c6913g.f7542k0.mo2095a(materialDialog2, charSequence);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$e */
    public class RunnableC6911e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MaterialDialog f7478a;

        /* renamed from: b */
        public final /* synthetic */ C6913g f7479b;

        public RunnableC6911e(MaterialDialog materialDialog, C6913g c6913g) {
            this.f7478a = materialDialog;
            this.f7479b = c6913g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7478a.m6715j().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f7479b.m6752m().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f7478a.m6715j(), 1);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$f */
    public static /* synthetic */ class C6912f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7481a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7482b;

        static {
            int[] iArr = new int[ListType.values().length];
            f7482b = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7482b[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7482b[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            f7481a = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7481a[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7481a[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g */
    public static class C6913g {

        /* renamed from: A */
        public InterfaceC6915i f7483A;

        /* renamed from: A0 */
        public boolean f7484A0;

        /* renamed from: B */
        public InterfaceC6915i f7485B;

        /* renamed from: B0 */
        public boolean f7486B0;

        /* renamed from: C */
        public InterfaceC6915i f7487C;

        /* renamed from: C0 */
        public boolean f7488C0;

        /* renamed from: D */
        public boolean f7489D;

        /* renamed from: D0 */
        public boolean f7490D0;

        /* renamed from: E */
        public boolean f7491E;

        /* renamed from: E0 */
        public boolean f7492E0;

        /* renamed from: F */
        public Theme f7493F;

        /* renamed from: F0 */
        public boolean f7494F0;

        /* renamed from: G */
        public int f7495G;

        /* renamed from: G0 */
        public int f7496G0;

        /* renamed from: H */
        public boolean f7497H;

        /* renamed from: H0 */
        public int f7498H0;

        /* renamed from: I */
        public boolean f7499I;

        /* renamed from: I0 */
        public int f7500I0;

        /* renamed from: J */
        public float f7501J;

        /* renamed from: J0 */
        public int f7502J0;

        /* renamed from: K */
        public int f7503K;

        /* renamed from: K0 */
        public int f7504K0;

        /* renamed from: L */
        public Integer[] f7505L;

        /* renamed from: L0 */
        public boolean f7506L0;

        /* renamed from: M */
        public Integer[] f7507M;

        /* renamed from: N */
        public boolean f7508N;

        /* renamed from: O */
        public Typeface f7509O;

        /* renamed from: P */
        public Typeface f7510P;

        /* renamed from: Q */
        public Drawable f7511Q;

        /* renamed from: R */
        public boolean f7512R;

        /* renamed from: S */
        public int f7513S;

        /* renamed from: T */
        public RecyclerView.Adapter f7514T;

        /* renamed from: U */
        public RecyclerView.LayoutManager f7515U;

        /* renamed from: V */
        public DialogInterface.OnDismissListener f7516V;

        /* renamed from: W */
        public DialogInterface.OnCancelListener f7517W;

        /* renamed from: X */
        public DialogInterface.OnKeyListener f7518X;

        /* renamed from: Y */
        public DialogInterface.OnShowListener f7519Y;

        /* renamed from: Z */
        public StackingBehavior f7520Z;

        /* renamed from: a */
        public final Context f7521a;

        /* renamed from: a0 */
        public boolean f7522a0;

        /* renamed from: b */
        public CharSequence f7523b;

        /* renamed from: b0 */
        public int f7524b0;

        /* renamed from: c */
        public GravityEnum f7525c;

        /* renamed from: c0 */
        public int f7526c0;

        /* renamed from: d */
        public GravityEnum f7527d;

        /* renamed from: d0 */
        public int f7528d0;

        /* renamed from: e */
        public GravityEnum f7529e;

        /* renamed from: e0 */
        public boolean f7530e0;

        /* renamed from: f */
        public GravityEnum f7531f;

        /* renamed from: f0 */
        public boolean f7532f0;

        /* renamed from: g */
        public GravityEnum f7533g;

        /* renamed from: g0 */
        public int f7534g0;

        /* renamed from: h */
        public int f7535h;

        /* renamed from: h0 */
        public int f7536h0;

        /* renamed from: i */
        public int f7537i;

        /* renamed from: i0 */
        public CharSequence f7538i0;

        /* renamed from: j */
        public int f7539j;

        /* renamed from: j0 */
        public CharSequence f7540j0;

        /* renamed from: k */
        public CharSequence f7541k;

        /* renamed from: k0 */
        public InterfaceC6914h f7542k0;

        /* renamed from: l */
        public ArrayList f7543l;

        /* renamed from: l0 */
        public boolean f7544l0;

        /* renamed from: m */
        public CharSequence f7545m;

        /* renamed from: m0 */
        public int f7546m0;

        /* renamed from: n */
        public CharSequence f7547n;

        /* renamed from: n0 */
        public boolean f7548n0;

        /* renamed from: o */
        public CharSequence f7549o;

        /* renamed from: o0 */
        public int f7550o0;

        /* renamed from: p */
        public boolean f7551p;

        /* renamed from: p0 */
        public int f7552p0;

        /* renamed from: q */
        public boolean f7553q;

        /* renamed from: q0 */
        public int f7554q0;

        /* renamed from: r */
        public boolean f7555r;

        /* renamed from: r0 */
        public int[] f7556r0;

        /* renamed from: s */
        public View f7557s;

        /* renamed from: s0 */
        public CharSequence f7558s0;

        /* renamed from: t */
        public int f7559t;

        /* renamed from: t0 */
        public boolean f7560t0;

        /* renamed from: u */
        public ColorStateList f7561u;

        /* renamed from: u0 */
        public CompoundButton.OnCheckedChangeListener f7562u0;

        /* renamed from: v */
        public ColorStateList f7563v;

        /* renamed from: v0 */
        public String f7564v0;

        /* renamed from: w */
        public ColorStateList f7565w;

        /* renamed from: w0 */
        public NumberFormat f7566w0;

        /* renamed from: x */
        public ColorStateList f7567x;

        /* renamed from: x0 */
        public boolean f7568x0;

        /* renamed from: y */
        public ColorStateList f7569y;

        /* renamed from: y0 */
        public boolean f7570y0;

        /* renamed from: z */
        public InterfaceC6915i f7571z;

        /* renamed from: z0 */
        public boolean f7572z0;

        public C6913g(Context context) {
            GravityEnum gravityEnum = GravityEnum.START;
            this.f7525c = gravityEnum;
            this.f7527d = gravityEnum;
            this.f7529e = GravityEnum.END;
            this.f7531f = gravityEnum;
            this.f7533g = gravityEnum;
            this.f7535h = 0;
            this.f7537i = -1;
            this.f7539j = -1;
            this.f7489D = false;
            this.f7491E = false;
            Theme theme = Theme.LIGHT;
            this.f7493F = theme;
            this.f7495G = -1;
            this.f7497H = true;
            this.f7499I = true;
            this.f7501J = 1.2f;
            this.f7503K = -1;
            this.f7505L = null;
            this.f7507M = null;
            this.f7508N = true;
            this.f7513S = -1;
            this.f7534g0 = -2;
            this.f7536h0 = 0;
            this.f7546m0 = -1;
            this.f7550o0 = -1;
            this.f7552p0 = -1;
            this.f7554q0 = 0;
            this.f7570y0 = false;
            this.f7572z0 = false;
            this.f7484A0 = false;
            this.f7486B0 = false;
            this.f7488C0 = false;
            this.f7490D0 = false;
            this.f7492E0 = false;
            this.f7494F0 = false;
            this.f7521a = context;
            int iM6480n = AbstractC6877g.m6480n(context, R$attr.colorAccent, AbstractC6877g.m6469c(context, R$color.md_material_blue_600));
            this.f7559t = iM6480n;
            int iM6480n2 = AbstractC6877g.m6480n(context, R.attr.colorAccent, iM6480n);
            this.f7559t = iM6480n2;
            this.f7563v = AbstractC6877g.m6468b(context, iM6480n2);
            this.f7565w = AbstractC6877g.m6468b(context, this.f7559t);
            this.f7567x = AbstractC6877g.m6468b(context, this.f7559t);
            this.f7569y = AbstractC6877g.m6468b(context, AbstractC6877g.m6480n(context, R$attr.md_link_color, this.f7559t));
            this.f7535h = AbstractC6877g.m6480n(context, R$attr.md_btn_ripple_color, AbstractC6877g.m6480n(context, R$attr.colorControlHighlight, AbstractC6877g.m6479m(context, R.attr.colorControlHighlight)));
            this.f7566w0 = NumberFormat.getPercentInstance();
            this.f7564v0 = "%1d/%2d";
            this.f7493F = AbstractC6877g.m6474h(AbstractC6877g.m6479m(context, R.attr.textColorPrimary)) ? theme : Theme.DARK;
            m6746g();
            this.f7525c = AbstractC6877g.m6486t(context, R$attr.md_title_gravity, this.f7525c);
            this.f7527d = AbstractC6877g.m6486t(context, R$attr.md_content_gravity, this.f7527d);
            this.f7529e = AbstractC6877g.m6486t(context, R$attr.md_btnstacked_gravity, this.f7529e);
            this.f7531f = AbstractC6877g.m6486t(context, R$attr.md_items_gravity, this.f7531f);
            this.f7533g = AbstractC6877g.m6486t(context, R$attr.md_buttons_gravity, this.f7533g);
            try {
                m6739J(AbstractC6877g.m6488v(context, R$attr.md_medium_font, AbstractC9051b.m15848c()), AbstractC6877g.m6488v(context, R$attr.md_regular_font, AbstractC9051b.m15848c()));
            } catch (Throwable unused) {
            }
            if (this.f7510P == null) {
                try {
                    this.f7510P = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.f7510P = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f7509O == null) {
                try {
                    this.f7509O = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f7509O = typeface;
                    if (typeface == null) {
                        this.f7509O = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: A */
        public C6913g m6730A(CharSequence charSequence) {
            this.f7545m = charSequence;
            return this;
        }

        /* renamed from: B */
        public C6913g m6731B(boolean z10, int i10) {
            if (this.f7557s != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z10) {
                this.f7530e0 = true;
                this.f7534g0 = -2;
                return this;
            }
            this.f7568x0 = false;
            this.f7530e0 = false;
            this.f7534g0 = -1;
            this.f7536h0 = i10;
            return this;
        }

        /* renamed from: C */
        public C6913g m6732C(boolean z10, int i10, boolean z11) {
            this.f7532f0 = z11;
            return m6731B(z10, i10);
        }

        /* renamed from: D */
        public C6913g m6733D(boolean z10) {
            this.f7568x0 = z10;
            return this;
        }

        /* renamed from: E */
        public MaterialDialog m6734E() {
            MaterialDialog materialDialogM6742c = m6742c();
            materialDialogM6742c.show();
            return materialDialogM6742c;
        }

        /* renamed from: F */
        public C6913g m6735F(DialogInterface.OnShowListener onShowListener) {
            this.f7519Y = onShowListener;
            return this;
        }

        /* renamed from: G */
        public C6913g m6736G(int i10) {
            m6737H(this.f7521a.getText(i10));
            return this;
        }

        /* renamed from: H */
        public C6913g m6737H(CharSequence charSequence) {
            this.f7523b = charSequence;
            return this;
        }

        /* renamed from: I */
        public C6913g m6738I(GravityEnum gravityEnum) {
            this.f7525c = gravityEnum;
            return this;
        }

        /* renamed from: J */
        public C6913g m6739J(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface typefaceM15850e = AbstractC9051b.m15850e(str);
                this.f7510P = typefaceM15850e;
                if (typefaceM15850e == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface typefaceM15850e2 = AbstractC9051b.m15850e(str2);
                this.f7509O = typefaceM15850e2;
                if (typefaceM15850e2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }

        /* renamed from: a */
        public C6913g m6740a(RecyclerView.Adapter adapter, RecyclerView.LayoutManager layoutManager) {
            if (this.f7557s != null) {
                throw new IllegalStateException("You cannot set adapter() when you're using a custom view.");
            }
            if (layoutManager != null && !(layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
                throw new IllegalStateException("You can currently only use LinearLayoutManager and GridLayoutManager with this library.");
            }
            this.f7514T = adapter;
            this.f7515U = layoutManager;
            return this;
        }

        /* renamed from: b */
        public C6913g m6741b(boolean z10) {
            this.f7508N = z10;
            return this;
        }

        /* renamed from: c */
        public MaterialDialog m6742c() {
            return new MaterialDialog(this);
        }

        /* renamed from: d */
        public C6913g m6743d(DialogInterface.OnCancelListener onCancelListener) {
            this.f7517W = onCancelListener;
            return this;
        }

        /* renamed from: e */
        public C6913g m6744e(boolean z10) {
            this.f7497H = z10;
            this.f7499I = z10;
            return this;
        }

        /* renamed from: f */
        public C6913g m6745f(boolean z10) {
            this.f7499I = z10;
            return this;
        }

        /* renamed from: g */
        public final void m6746g() {
            if (C10703c.m20017b(false) == null) {
                return;
            }
            C10703c c10703cM20016a = C10703c.m20016a();
            if (c10703cM20016a.f21229a) {
                this.f7493F = Theme.DARK;
            }
            int i10 = c10703cM20016a.f21230b;
            if (i10 != 0) {
                this.f7537i = i10;
            }
            int i11 = c10703cM20016a.f21231c;
            if (i11 != 0) {
                this.f7539j = i11;
            }
            ColorStateList colorStateList = c10703cM20016a.f21232d;
            if (colorStateList != null) {
                this.f7563v = colorStateList;
            }
            ColorStateList colorStateList2 = c10703cM20016a.f21233e;
            if (colorStateList2 != null) {
                this.f7567x = colorStateList2;
            }
            ColorStateList colorStateList3 = c10703cM20016a.f21234f;
            if (colorStateList3 != null) {
                this.f7565w = colorStateList3;
            }
            int i12 = c10703cM20016a.f21236h;
            if (i12 != 0) {
                this.f7528d0 = i12;
            }
            Drawable drawable = c10703cM20016a.f21237i;
            if (drawable != null) {
                this.f7511Q = drawable;
            }
            int i13 = c10703cM20016a.f21238j;
            if (i13 != 0) {
                this.f7526c0 = i13;
            }
            int i14 = c10703cM20016a.f21239k;
            if (i14 != 0) {
                this.f7524b0 = i14;
            }
            int i15 = c10703cM20016a.f21242n;
            if (i15 != 0) {
                this.f7498H0 = i15;
            }
            int i16 = c10703cM20016a.f21241m;
            if (i16 != 0) {
                this.f7496G0 = i16;
            }
            int i17 = c10703cM20016a.f21243o;
            if (i17 != 0) {
                this.f7500I0 = i17;
            }
            int i18 = c10703cM20016a.f21244p;
            if (i18 != 0) {
                this.f7502J0 = i18;
            }
            int i19 = c10703cM20016a.f21245q;
            if (i19 != 0) {
                this.f7504K0 = i19;
            }
            int i20 = c10703cM20016a.f21235g;
            if (i20 != 0) {
                this.f7559t = i20;
            }
            ColorStateList colorStateList4 = c10703cM20016a.f21240l;
            if (colorStateList4 != null) {
                this.f7569y = colorStateList4;
            }
            this.f7525c = c10703cM20016a.f21246r;
            this.f7527d = c10703cM20016a.f21247s;
            this.f7529e = c10703cM20016a.f21248t;
            this.f7531f = c10703cM20016a.f21249u;
            this.f7533g = c10703cM20016a.f21250v;
        }

        /* renamed from: h */
        public C6913g m6747h(int i10) {
            return m6748i(i10, false);
        }

        /* renamed from: i */
        public C6913g m6748i(int i10, boolean z10) {
            CharSequence text = this.f7521a.getText(i10);
            if (z10) {
                text = Html.fromHtml(text.toString().replace(SignParameters.NEW_LINE, "<br/>"));
            }
            return m6749j(text);
        }

        /* renamed from: j */
        public C6913g m6749j(CharSequence charSequence) {
            if (this.f7557s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.f7541k = charSequence;
            return this;
        }

        /* renamed from: k */
        public C6913g m6750k(GravityEnum gravityEnum) {
            this.f7527d = gravityEnum;
            return this;
        }

        /* renamed from: l */
        public C6913g m6751l(View view, boolean z10) {
            if (this.f7541k != null) {
                throw new IllegalStateException("You cannot use customView() when you have content set.");
            }
            if (this.f7543l != null) {
                throw new IllegalStateException("You cannot use customView() when you have items set.");
            }
            if (this.f7542k0 != null) {
                throw new IllegalStateException("You cannot use customView() with an input dialog");
            }
            if (this.f7534g0 > -2 || this.f7530e0) {
                throw new IllegalStateException("You cannot use customView() with a progress dialog");
            }
            if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f7557s = view;
            this.f7522a0 = z10;
            return this;
        }

        /* renamed from: m */
        public final Context m6752m() {
            return this.f7521a;
        }

        /* renamed from: n */
        public C6913g m6753n(CharSequence charSequence, CharSequence charSequence2, boolean z10, InterfaceC6914h interfaceC6914h) {
            if (this.f7557s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.f7542k0 = interfaceC6914h;
            this.f7540j0 = charSequence;
            this.f7538i0 = charSequence2;
            this.f7544l0 = z10;
            return this;
        }

        /* renamed from: o */
        public C6913g m6754o(int i10, int i11) {
            return m6755p(i10, i11, 0);
        }

        /* renamed from: p */
        public C6913g m6755p(int i10, int i11, int i12) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Min length for input dialogs cannot be less than 0.");
            }
            this.f7550o0 = i10;
            this.f7552p0 = i11;
            if (i12 == 0) {
                this.f7554q0 = AbstractC6877g.m6479m(this.f7521a, R$attr.xui_config_color_error_text);
            } else {
                this.f7554q0 = i12;
            }
            if (this.f7550o0 > 0) {
                this.f7544l0 = false;
            }
            return this;
        }

        /* renamed from: q */
        public C6913g m6756q(Collection collection) {
            if (collection.size() <= 0) {
                if (collection.size() == 0) {
                    this.f7543l = new ArrayList();
                }
                return this;
            }
            CharSequence[] charSequenceArr = new CharSequence[collection.size()];
            Iterator it = collection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                charSequenceArr[i10] = it.next().toString();
                i10++;
            }
            m6757r(charSequenceArr);
            return this;
        }

        /* renamed from: r */
        public C6913g m6757r(CharSequence... charSequenceArr) {
            if (this.f7557s != null) {
                throw new IllegalStateException("You cannot set items() when you're using a custom view.");
            }
            ArrayList arrayList = new ArrayList();
            this.f7543l = arrayList;
            Collections.addAll(arrayList, charSequenceArr);
            return this;
        }

        /* renamed from: s */
        public C6913g m6758s() {
            this.f7512R = true;
            return this;
        }

        /* renamed from: t */
        public C6913g m6759t(int i10) {
            return i10 == 0 ? this : m6760u(this.f7521a.getText(i10));
        }

        /* renamed from: u */
        public C6913g m6760u(CharSequence charSequence) {
            this.f7549o = charSequence;
            return this;
        }

        /* renamed from: v */
        public C6913g m6761v(InterfaceC6915i interfaceC6915i) {
            this.f7483A = interfaceC6915i;
            return this;
        }

        /* renamed from: w */
        public C6913g m6762w(InterfaceC6915i interfaceC6915i) {
            this.f7571z = interfaceC6915i;
            return this;
        }

        /* renamed from: x */
        public C6913g m6763x(int i10) {
            return m6764y(AbstractC6877g.m6468b(this.f7521a, i10));
        }

        /* renamed from: y */
        public C6913g m6764y(ColorStateList colorStateList) {
            this.f7563v = colorStateList;
            this.f7486B0 = true;
            return this;
        }

        /* renamed from: z */
        public C6913g m6765z(int i10) {
            if (i10 == 0) {
                return this;
            }
            m6730A(this.f7521a.getText(i10));
            return this;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$h */
    public interface InterfaceC6914h {
        /* renamed from: a */
        void mo2095a(MaterialDialog materialDialog, CharSequence charSequence);
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$i */
    public interface InterfaceC6915i {
        /* renamed from: a */
        void mo2080a(MaterialDialog materialDialog, DialogAction dialogAction);
    }

    public MaterialDialog(C6913g c6913g) throws Resources.NotFoundException {
        super(c6913g.f7521a, AbstractC6917b.m6775c(c6913g));
        this.f7450d = new Handler(Looper.getMainLooper());
        this.f7449c = c6913g;
        this.f21003a = (MDRootLayout) LayoutInflater.from(c6913g.f7521a).inflate(AbstractC6917b.m6774b(c6913g), (ViewGroup) null);
        AbstractC6917b.m6776d(this);
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.C6916a.c
    /* renamed from: a */
    public boolean mo6709a(MaterialDialog materialDialog, View view, int i10, CharSequence charSequence, boolean z10) {
        boolean zM6723r = false;
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.f7466t;
        if (listType == null || listType == ListType.REGULAR) {
            if (this.f7449c.f7508N) {
                dismiss();
            }
            if (!z10) {
                this.f7449c.getClass();
            }
            if (z10) {
                this.f7449c.getClass();
            }
        } else if (listType == ListType.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(R$id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (this.f7467u.contains(Integer.valueOf(i10))) {
                this.f7467u.remove(Integer.valueOf(i10));
                if (!this.f7449c.f7489D || m6722q()) {
                    checkBox.setChecked(false);
                } else {
                    this.f7467u.add(Integer.valueOf(i10));
                }
            } else {
                this.f7467u.add(Integer.valueOf(i10));
                if (!this.f7449c.f7489D || m6722q()) {
                    checkBox.setChecked(true);
                } else {
                    this.f7467u.remove(Integer.valueOf(i10));
                }
            }
        } else if (listType == ListType.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(R$id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            C6913g c6913g = this.f7449c;
            int i11 = c6913g.f7503K;
            if (c6913g.f7508N && c6913g.f7545m == null) {
                dismiss();
                this.f7449c.f7503K = i10;
                m6723r(view);
            } else if (c6913g.f7491E) {
                c6913g.f7503K = i10;
                zM6723r = m6723r(view);
                this.f7449c.f7503K = i11;
            } else {
                zM6723r = true;
            }
            if (zM6723r) {
                this.f7449c.f7503K = i10;
                radioButton.setChecked(true);
                this.f7449c.f7514T.notifyItemChanged(i11);
                this.f7449c.f7514T.notifyItemChanged(i10);
            }
        }
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f7454h != null) {
            m6719n(this, this.f7449c);
        }
        super.dismiss();
    }

    /* renamed from: e */
    public final void m6710e() {
        RecyclerView recyclerView = this.f7455i;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC6907a());
    }

    /* renamed from: f */
    public final MDButton m6711f(DialogAction dialogAction) {
        int i10 = C6912f.f7481a[dialogAction.ordinal()];
        return i10 != 1 ? i10 != 2 ? this.f7463q : this.f7465s : this.f7464r;
    }

    @Override // p305y1.AbstractDialogC10601a, android.app.Dialog
    public /* bridge */ /* synthetic */ View findViewById(int i10) {
        return super.findViewById(i10);
    }

    /* renamed from: g */
    public final C6913g m6712g() {
        return this.f7449c;
    }

    /* renamed from: h */
    public Drawable m6713h(DialogAction dialogAction, boolean z10) {
        if (z10) {
            C6913g c6913g = this.f7449c;
            int i10 = c6913g.f7498H0;
            if (i10 != 0) {
                return AbstractC6875e.m6452h(c6913g.f7521a, i10);
            }
            Drawable drawableM6483q = AbstractC6877g.m6483q(c6913g.f7521a, R$attr.md_btn_stacked_selector);
            return drawableM6483q != null ? drawableM6483q : AbstractC6877g.m6483q(getContext(), R$attr.md_btn_stacked_selector);
        }
        int i11 = C6912f.f7481a[dialogAction.ordinal()];
        if (i11 == 1) {
            C6913g c6913g2 = this.f7449c;
            int i12 = c6913g2.f7502J0;
            if (i12 != 0) {
                return AbstractC6875e.m6452h(c6913g2.f7521a, i12);
            }
            Drawable drawableM6483q2 = AbstractC6877g.m6483q(c6913g2.f7521a, R$attr.md_btn_neutral_selector);
            if (drawableM6483q2 != null) {
                return drawableM6483q2;
            }
            Drawable drawableM6483q3 = AbstractC6877g.m6483q(getContext(), R$attr.md_btn_neutral_selector);
            AbstractC0022a.m51a(drawableM6483q3, this.f7449c.f7535h);
            return drawableM6483q3;
        }
        if (i11 != 2) {
            C6913g c6913g3 = this.f7449c;
            int i13 = c6913g3.f7500I0;
            if (i13 != 0) {
                return AbstractC6875e.m6452h(c6913g3.f7521a, i13);
            }
            Drawable drawableM6483q4 = AbstractC6877g.m6483q(c6913g3.f7521a, R$attr.md_btn_positive_selector);
            if (drawableM6483q4 != null) {
                return drawableM6483q4;
            }
            Drawable drawableM6483q5 = AbstractC6877g.m6483q(getContext(), R$attr.md_btn_positive_selector);
            AbstractC0022a.m51a(drawableM6483q5, this.f7449c.f7535h);
            return drawableM6483q5;
        }
        C6913g c6913g4 = this.f7449c;
        int i14 = c6913g4.f7504K0;
        if (i14 != 0) {
            return AbstractC6875e.m6452h(c6913g4.f7521a, i14);
        }
        Drawable drawableM6483q6 = AbstractC6877g.m6483q(c6913g4.f7521a, R$attr.md_btn_negative_selector);
        if (drawableM6483q6 != null) {
            return drawableM6483q6;
        }
        Drawable drawableM6483q7 = AbstractC6877g.m6483q(getContext(), R$attr.md_btn_negative_selector);
        AbstractC0022a.m51a(drawableM6483q7, this.f7449c.f7535h);
        return drawableM6483q7;
    }

    /* renamed from: i */
    public final int m6714i() {
        ProgressBar progressBar = this.f7458l;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    /* renamed from: j */
    public final EditText m6715j() {
        return this.f7454h;
    }

    /* renamed from: k */
    public final Drawable m6716k() {
        C6913g c6913g = this.f7449c;
        int i10 = c6913g.f7496G0;
        if (i10 != 0) {
            return AbstractC6875e.m6452h(c6913g.f7521a, i10);
        }
        Drawable drawableM6483q = AbstractC6877g.m6483q(c6913g.f7521a, R$attr.md_list_selector);
        return drawableM6483q != null ? drawableM6483q : AbstractC6877g.m6483q(getContext(), R$attr.md_list_selector);
    }

    /* renamed from: l */
    public final int m6717l() {
        ProgressBar progressBar = this.f7458l;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    /* renamed from: m */
    public final View m6718m() {
        return this.f21003a;
    }

    /* renamed from: n */
    public final void m6719n(DialogInterface dialogInterface, C6913g c6913g) {
        InputMethodManager inputMethodManager;
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m6715j() == null || (inputMethodManager = (InputMethodManager) c6913g.m6752m().getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = materialDialog.getCurrentFocus();
        IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : materialDialog.m6718m().getWindowToken();
        if (windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: o */
    public void m6720o(int i10, boolean z10) {
        C6913g c6913g;
        int i11;
        TextView textView = this.f7461o;
        if (textView != null) {
            if (this.f7449c.f7552p0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i10), Integer.valueOf(this.f7449c.f7552p0)));
                this.f7461o.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean z11 = (z10 && i10 == 0) || ((i11 = (c6913g = this.f7449c).f7552p0) > 0 && i10 > i11) || i10 < c6913g.f7550o0;
            C6913g c6913g2 = this.f7449c;
            int i12 = z11 ? c6913g2.f7554q0 : c6913g2.f7539j;
            C6913g c6913g3 = this.f7449c;
            int i13 = z11 ? c6913g3.f7554q0 : c6913g3.f7559t;
            if (this.f7449c.f7552p0 > 0) {
                this.f7461o.setTextColor(i12);
            }
            AbstractC10702b.m20013e(this.f7454h, i13);
            m6711f(DialogAction.POSITIVE).setEnabled(!z11);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EditText editText;
        DialogAction dialogAction = (DialogAction) view.getTag();
        int i10 = C6912f.f7481a[dialogAction.ordinal()];
        if (i10 == 1) {
            this.f7449c.getClass();
            InterfaceC6915i interfaceC6915i = this.f7449c.f7485B;
            if (interfaceC6915i != null) {
                interfaceC6915i.mo2080a(this, dialogAction);
            }
            if (this.f7449c.f7508N) {
                dismiss();
            }
        } else if (i10 == 2) {
            this.f7449c.getClass();
            InterfaceC6915i interfaceC6915i2 = this.f7449c.f7483A;
            if (interfaceC6915i2 != null) {
                interfaceC6915i2.mo2080a(this, dialogAction);
            }
            if (this.f7449c.f7508N) {
                cancel();
            }
        } else if (i10 == 3) {
            this.f7449c.getClass();
            InterfaceC6915i interfaceC6915i3 = this.f7449c.f7571z;
            if (interfaceC6915i3 != null) {
                interfaceC6915i3.mo2080a(this, dialogAction);
            }
            if (!this.f7449c.f7491E) {
                m6723r(view);
            }
            if (!this.f7449c.f7489D) {
                m6722q();
            }
            C6913g c6913g = this.f7449c;
            InterfaceC6914h interfaceC6914h = c6913g.f7542k0;
            if (interfaceC6914h != null && (editText = this.f7454h) != null && !c6913g.f7548n0) {
                interfaceC6914h.mo2095a(this, editText.getText());
            }
            if (this.f7449c.f7508N) {
                dismiss();
            }
        }
        InterfaceC6915i interfaceC6915i4 = this.f7449c.f7487C;
        if (interfaceC6915i4 != null) {
            interfaceC6915i4.mo2080a(this, dialogAction);
        }
    }

    @Override // p305y1.AbstractDialogC10601a, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.f7454h != null) {
            m6727v(this, this.f7449c);
            if (this.f7454h.getText().length() > 0) {
                EditText editText = this.f7454h;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // p305y1.AbstractDialogC10601a, android.app.Dialog
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m6721p() {
        if (this.f7455i == null) {
            return;
        }
        ArrayList arrayList = this.f7449c.f7543l;
        if ((arrayList == null || arrayList.size() == 0) && this.f7449c.f7514T == null) {
            return;
        }
        C6913g c6913g = this.f7449c;
        if (c6913g.f7515U == null) {
            c6913g.f7515U = new LinearLayoutManager(getContext());
        }
        if (this.f7455i.getLayoutManager() == null) {
            this.f7455i.setLayoutManager(this.f7449c.f7515U);
        }
        this.f7455i.setAdapter(this.f7449c.f7514T);
        if (this.f7466t != null) {
            ((C6916a) this.f7449c.f7514T).m6771h(this);
        }
    }

    /* renamed from: q */
    public final boolean m6722q() {
        this.f7449c.getClass();
        return false;
    }

    /* renamed from: r */
    public final boolean m6723r(View view) {
        this.f7449c.getClass();
        return false;
    }

    /* renamed from: s */
    public void m6724s() {
        EditText editText = this.f7454h;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new C6910d());
    }

    @Override // p305y1.AbstractDialogC10601a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i10) {
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f7452f.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (this.f7449c.f7506L0) {
                AbstractC6876f.m6463c(getWindow(), new C6908b());
            } else {
                m6728w();
            }
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* renamed from: t */
    public final void m6725t(int i10) {
        if (this.f7449c.f7534g0 <= -2) {
            Log.w("MaterialDialog", "Calling setProgress(int) on an indeterminate progress dialog has no effect!");
        } else {
            this.f7458l.setProgress(i10);
            this.f7450d.post(new RunnableC6909c());
        }
    }

    /* renamed from: u */
    public final void m6726u(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    /* renamed from: v */
    public final void m6727v(DialogInterface dialogInterface, C6913g c6913g) {
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m6715j() == null) {
            return;
        }
        materialDialog.m6715j().post(new RunnableC6911e(materialDialog, c6913g));
    }

    /* renamed from: w */
    public final void m6728w() {
        super.show();
    }

    @Override // p305y1.AbstractDialogC10601a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        setTitle(this.f7449c.f7521a.getString(i10));
    }

    @Override // p305y1.AbstractDialogC10601a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
