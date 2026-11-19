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
import android.text.Editable;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.utils.AbstractC6799e;
import com.xuexiang.xui.utils.AbstractC6800f;
import com.xuexiang.xui.utils.AbstractC6801g;
import com.xuexiang.xui.widget.dialog.materialdialog.C6833a;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p093e3.AbstractC7843b;
import p211p3.AbstractDialogC9320a;
import p221q3.AbstractC9358b;
import p221q3.C9359c;
import p231r3.AbstractC9428a;

/* loaded from: classes4.dex */
public class MaterialDialog extends AbstractDialogC9320a implements View.OnClickListener, C6833a.c {

    /* renamed from: c */
    public final C6831g f7321c;

    /* renamed from: d */
    public final Handler f7322d;

    /* renamed from: e */
    public ImageView f7323e;

    /* renamed from: f */
    public TextView f7324f;

    /* renamed from: g */
    public TextView f7325g;

    /* renamed from: h */
    public EditText f7326h;

    /* renamed from: i */
    public RecyclerView f7327i;

    /* renamed from: j */
    public View f7328j;

    /* renamed from: k */
    public FrameLayout f7329k;

    /* renamed from: l */
    public ProgressBar f7330l;

    /* renamed from: m */
    public TextView f7331m;

    /* renamed from: n */
    public TextView f7332n;

    /* renamed from: o */
    public TextView f7333o;

    /* renamed from: p */
    public CheckBox f7334p;

    /* renamed from: q */
    public MDButton f7335q;

    /* renamed from: r */
    public MDButton f7336r;

    /* renamed from: s */
    public MDButton f7337s;

    /* renamed from: t */
    public ListType f7338t;

    /* renamed from: u */
    public List f7339u;

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
        public static int m6690a(ListType listType) {
            int i9 = C6830f.f7354b[listType.ordinal()];
            if (i9 == 1) {
                return R$layout.xmd_layout_listitem;
            }
            if (i9 == 2) {
                return R$layout.xmd_layout_listitem_single_choice;
            }
            if (i9 == 3) {
                return R$layout.xmd_layout_listitem_multi_choice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC6825a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$a$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f7345a;

            public a(int i9) {
                this.f7345a = i9;
            }

            @Override // java.lang.Runnable
            public void run() {
                MaterialDialog.this.f7327i.requestFocus();
                MaterialDialog.this.f7321c.f7386U.scrollToPosition(this.f7345a);
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC6825a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int iIntValue;
            MaterialDialog.this.f7327i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MaterialDialog materialDialog = MaterialDialog.this;
            ListType listType = materialDialog.f7338t;
            ListType listType2 = ListType.SINGLE;
            if (listType == listType2 || listType == ListType.MULTI) {
                if (listType == listType2) {
                    iIntValue = materialDialog.f7321c.f7375K;
                    if (iIntValue < 0) {
                        return;
                    }
                } else {
                    List list = materialDialog.f7339u;
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    Collections.sort(MaterialDialog.this.f7339u);
                    iIntValue = ((Integer) MaterialDialog.this.f7339u.get(0)).intValue();
                }
                MaterialDialog.this.f7327i.post(new a(iIntValue));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$b */
    public class C6826b implements AbstractC6800f.a {
        public C6826b() {
        }

        @Override // com.xuexiang.xui.utils.AbstractC6800f.a
        /* renamed from: a */
        public void mo6467a(Window window) {
            MaterialDialog.this.m6689w();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$c */
    public class RunnableC6827c implements Runnable {
        public RunnableC6827c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialDialog materialDialog = MaterialDialog.this;
            TextView textView = materialDialog.f7331m;
            if (textView != null) {
                textView.setText(materialDialog.f7321c.f7435v0.format(materialDialog.m6675i() / MaterialDialog.this.m6678l()));
            }
            MaterialDialog materialDialog2 = MaterialDialog.this;
            TextView textView2 = materialDialog2.f7332n;
            if (textView2 != null) {
                textView2.setText(String.format(materialDialog2.f7321c.f7433u0, Integer.valueOf(materialDialog2.m6675i()), Integer.valueOf(MaterialDialog.this.m6678l())));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$d */
    public class C6828d implements TextWatcher {
        public C6828d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
            int length = charSequence.toString().length();
            MaterialDialog materialDialog = MaterialDialog.this;
            if (!materialDialog.f7321c.f7413k0) {
                z = length == 0;
                materialDialog.m6672f(DialogAction.POSITIVE).setEnabled(!z);
            }
            MaterialDialog.this.m6681o(length, z);
            C6831g c6831g = MaterialDialog.this.f7321c;
            if (c6831g.f7417m0) {
                c6831g.getClass();
                throw null;
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$e */
    public class RunnableC6829e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MaterialDialog f7350a;

        /* renamed from: b */
        public final /* synthetic */ C6831g f7351b;

        public RunnableC6829e(MaterialDialog materialDialog, C6831g c6831g) {
            this.f7350a = materialDialog;
            this.f7351b = c6831g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7350a.m6676j().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f7351b.m6698h().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f7350a.m6676j(), 1);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$f */
    public static /* synthetic */ class C6830f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7353a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f7354b;

        static {
            int[] iArr = new int[ListType.values().length];
            f7354b = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7354b[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7354b[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            f7353a = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7353a[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7353a[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g */
    public static class C6831g {

        /* renamed from: A */
        public InterfaceC6832h f7355A;

        /* renamed from: A0 */
        public boolean f7356A0;

        /* renamed from: B */
        public InterfaceC6832h f7357B;

        /* renamed from: B0 */
        public boolean f7358B0;

        /* renamed from: C */
        public InterfaceC6832h f7359C;

        /* renamed from: C0 */
        public boolean f7360C0;

        /* renamed from: D */
        public boolean f7361D;

        /* renamed from: D0 */
        public boolean f7362D0;

        /* renamed from: E */
        public boolean f7363E;

        /* renamed from: E0 */
        public boolean f7364E0;

        /* renamed from: F */
        public Theme f7365F;

        /* renamed from: F0 */
        public int f7366F0;

        /* renamed from: G */
        public int f7367G;

        /* renamed from: G0 */
        public int f7368G0;

        /* renamed from: H */
        public boolean f7369H;

        /* renamed from: H0 */
        public int f7370H0;

        /* renamed from: I */
        public boolean f7371I;

        /* renamed from: I0 */
        public int f7372I0;

        /* renamed from: J */
        public float f7373J;

        /* renamed from: J0 */
        public int f7374J0;

        /* renamed from: K */
        public int f7375K;

        /* renamed from: K0 */
        public boolean f7376K0;

        /* renamed from: L */
        public Integer[] f7377L;

        /* renamed from: M */
        public Integer[] f7378M;

        /* renamed from: N */
        public boolean f7379N;

        /* renamed from: O */
        public Typeface f7380O;

        /* renamed from: P */
        public Typeface f7381P;

        /* renamed from: Q */
        public Drawable f7382Q;

        /* renamed from: R */
        public boolean f7383R;

        /* renamed from: S */
        public int f7384S;

        /* renamed from: T */
        public RecyclerView.Adapter f7385T;

        /* renamed from: U */
        public RecyclerView.LayoutManager f7386U;

        /* renamed from: V */
        public DialogInterface.OnDismissListener f7387V;

        /* renamed from: W */
        public DialogInterface.OnCancelListener f7388W;

        /* renamed from: X */
        public DialogInterface.OnKeyListener f7389X;

        /* renamed from: Y */
        public DialogInterface.OnShowListener f7390Y;

        /* renamed from: Z */
        public StackingBehavior f7391Z;

        /* renamed from: a */
        public final Context f7392a;

        /* renamed from: a0 */
        public boolean f7393a0;

        /* renamed from: b */
        public CharSequence f7394b;

        /* renamed from: b0 */
        public int f7395b0;

        /* renamed from: c */
        public GravityEnum f7396c;

        /* renamed from: c0 */
        public int f7397c0;

        /* renamed from: d */
        public GravityEnum f7398d;

        /* renamed from: d0 */
        public int f7399d0;

        /* renamed from: e */
        public GravityEnum f7400e;

        /* renamed from: e0 */
        public boolean f7401e0;

        /* renamed from: f */
        public GravityEnum f7402f;

        /* renamed from: f0 */
        public boolean f7403f0;

        /* renamed from: g */
        public GravityEnum f7404g;

        /* renamed from: g0 */
        public int f7405g0;

        /* renamed from: h */
        public int f7406h;

        /* renamed from: h0 */
        public int f7407h0;

        /* renamed from: i */
        public int f7408i;

        /* renamed from: i0 */
        public CharSequence f7409i0;

        /* renamed from: j */
        public int f7410j;

        /* renamed from: j0 */
        public CharSequence f7411j0;

        /* renamed from: k */
        public CharSequence f7412k;

        /* renamed from: k0 */
        public boolean f7413k0;

        /* renamed from: l */
        public ArrayList f7414l;

        /* renamed from: l0 */
        public int f7415l0;

        /* renamed from: m */
        public CharSequence f7416m;

        /* renamed from: m0 */
        public boolean f7417m0;

        /* renamed from: n */
        public CharSequence f7418n;

        /* renamed from: n0 */
        public int f7419n0;

        /* renamed from: o */
        public CharSequence f7420o;

        /* renamed from: o0 */
        public int f7421o0;

        /* renamed from: p */
        public boolean f7422p;

        /* renamed from: p0 */
        public int f7423p0;

        /* renamed from: q */
        public boolean f7424q;

        /* renamed from: q0 */
        public int[] f7425q0;

        /* renamed from: r */
        public boolean f7426r;

        /* renamed from: r0 */
        public CharSequence f7427r0;

        /* renamed from: s */
        public View f7428s;

        /* renamed from: s0 */
        public boolean f7429s0;

        /* renamed from: t */
        public int f7430t;

        /* renamed from: t0 */
        public CompoundButton.OnCheckedChangeListener f7431t0;

        /* renamed from: u */
        public ColorStateList f7432u;

        /* renamed from: u0 */
        public String f7433u0;

        /* renamed from: v */
        public ColorStateList f7434v;

        /* renamed from: v0 */
        public NumberFormat f7435v0;

        /* renamed from: w */
        public ColorStateList f7436w;

        /* renamed from: w0 */
        public boolean f7437w0;

        /* renamed from: x */
        public ColorStateList f7438x;

        /* renamed from: x0 */
        public boolean f7439x0;

        /* renamed from: y */
        public ColorStateList f7440y;

        /* renamed from: y0 */
        public boolean f7441y0;

        /* renamed from: z */
        public InterfaceC6832h f7442z;

        /* renamed from: z0 */
        public boolean f7443z0;

        public C6831g(Context context) {
            GravityEnum gravityEnum = GravityEnum.START;
            this.f7396c = gravityEnum;
            this.f7398d = gravityEnum;
            this.f7400e = GravityEnum.END;
            this.f7402f = gravityEnum;
            this.f7404g = gravityEnum;
            this.f7406h = 0;
            this.f7408i = -1;
            this.f7410j = -1;
            this.f7361D = false;
            this.f7363E = false;
            Theme theme = Theme.LIGHT;
            this.f7365F = theme;
            this.f7367G = -1;
            this.f7369H = true;
            this.f7371I = true;
            this.f7373J = 1.2f;
            this.f7375K = -1;
            this.f7377L = null;
            this.f7378M = null;
            this.f7379N = true;
            this.f7384S = -1;
            this.f7405g0 = -2;
            this.f7407h0 = 0;
            this.f7415l0 = -1;
            this.f7419n0 = -1;
            this.f7421o0 = -1;
            this.f7423p0 = 0;
            this.f7439x0 = false;
            this.f7441y0 = false;
            this.f7443z0 = false;
            this.f7356A0 = false;
            this.f7358B0 = false;
            this.f7360C0 = false;
            this.f7362D0 = false;
            this.f7364E0 = false;
            this.f7392a = context;
            int iM6480m = AbstractC6801g.m6480m(context, R$attr.colorAccent, AbstractC6801g.m6470c(context, R$color.md_material_blue_600));
            this.f7430t = iM6480m;
            int iM6480m2 = AbstractC6801g.m6480m(context, R.attr.colorAccent, iM6480m);
            this.f7430t = iM6480m2;
            this.f7434v = AbstractC6801g.m6469b(context, iM6480m2);
            this.f7436w = AbstractC6801g.m6469b(context, this.f7430t);
            this.f7438x = AbstractC6801g.m6469b(context, this.f7430t);
            this.f7440y = AbstractC6801g.m6469b(context, AbstractC6801g.m6480m(context, R$attr.md_link_color, this.f7430t));
            this.f7406h = AbstractC6801g.m6480m(context, R$attr.md_btn_ripple_color, AbstractC6801g.m6480m(context, R$attr.colorControlHighlight, AbstractC6801g.m6479l(context, R.attr.colorControlHighlight)));
            this.f7435v0 = NumberFormat.getPercentInstance();
            this.f7433u0 = "%1d/%2d";
            this.f7365F = AbstractC6801g.m6474g(AbstractC6801g.m6479l(context, R.attr.textColorPrimary)) ? theme : Theme.DARK;
            m6695e();
            this.f7396c = AbstractC6801g.m6486s(context, R$attr.md_title_gravity, this.f7396c);
            this.f7398d = AbstractC6801g.m6486s(context, R$attr.md_content_gravity, this.f7398d);
            this.f7400e = AbstractC6801g.m6486s(context, R$attr.md_btnstacked_gravity, this.f7400e);
            this.f7402f = AbstractC6801g.m6486s(context, R$attr.md_items_gravity, this.f7402f);
            this.f7404g = AbstractC6801g.m6486s(context, R$attr.md_buttons_gravity, this.f7404g);
            try {
                m6706p(AbstractC6801g.m6487t(context, R$attr.md_medium_font, AbstractC7843b.m12291b()), AbstractC6801g.m6487t(context, R$attr.md_regular_font, AbstractC7843b.m12291b()));
            } catch (Throwable unused) {
            }
            if (this.f7381P == null) {
                try {
                    this.f7381P = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.f7381P = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f7380O == null) {
                try {
                    this.f7380O = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f7380O = typeface;
                    if (typeface == null) {
                        this.f7380O = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: a */
        public MaterialDialog m6691a() {
            return new MaterialDialog(this);
        }

        /* renamed from: b */
        public C6831g m6692b(DialogInterface.OnCancelListener onCancelListener) {
            this.f7388W = onCancelListener;
            return this;
        }

        /* renamed from: c */
        public C6831g m6693c(boolean z9) {
            this.f7369H = z9;
            this.f7371I = z9;
            return this;
        }

        /* renamed from: d */
        public C6831g m6694d(boolean z9) {
            this.f7371I = z9;
            return this;
        }

        /* renamed from: e */
        public final void m6695e() {
            if (C9359c.m15334b(false) == null) {
                return;
            }
            C9359c c9359cM15333a = C9359c.m15333a();
            if (c9359cM15333a.f16255a) {
                this.f7365F = Theme.DARK;
            }
            int i9 = c9359cM15333a.f16256b;
            if (i9 != 0) {
                this.f7408i = i9;
            }
            int i10 = c9359cM15333a.f16257c;
            if (i10 != 0) {
                this.f7410j = i10;
            }
            ColorStateList colorStateList = c9359cM15333a.f16258d;
            if (colorStateList != null) {
                this.f7434v = colorStateList;
            }
            ColorStateList colorStateList2 = c9359cM15333a.f16259e;
            if (colorStateList2 != null) {
                this.f7438x = colorStateList2;
            }
            ColorStateList colorStateList3 = c9359cM15333a.f16260f;
            if (colorStateList3 != null) {
                this.f7436w = colorStateList3;
            }
            int i11 = c9359cM15333a.f16262h;
            if (i11 != 0) {
                this.f7399d0 = i11;
            }
            Drawable drawable = c9359cM15333a.f16263i;
            if (drawable != null) {
                this.f7382Q = drawable;
            }
            int i12 = c9359cM15333a.f16264j;
            if (i12 != 0) {
                this.f7397c0 = i12;
            }
            int i13 = c9359cM15333a.f16265k;
            if (i13 != 0) {
                this.f7395b0 = i13;
            }
            int i14 = c9359cM15333a.f16268n;
            if (i14 != 0) {
                this.f7368G0 = i14;
            }
            int i15 = c9359cM15333a.f16267m;
            if (i15 != 0) {
                this.f7366F0 = i15;
            }
            int i16 = c9359cM15333a.f16269o;
            if (i16 != 0) {
                this.f7370H0 = i16;
            }
            int i17 = c9359cM15333a.f16270p;
            if (i17 != 0) {
                this.f7372I0 = i17;
            }
            int i18 = c9359cM15333a.f16271q;
            if (i18 != 0) {
                this.f7374J0 = i18;
            }
            int i19 = c9359cM15333a.f16261g;
            if (i19 != 0) {
                this.f7430t = i19;
            }
            ColorStateList colorStateList4 = c9359cM15333a.f16266l;
            if (colorStateList4 != null) {
                this.f7440y = colorStateList4;
            }
            this.f7396c = c9359cM15333a.f16272r;
            this.f7398d = c9359cM15333a.f16273s;
            this.f7400e = c9359cM15333a.f16274t;
            this.f7402f = c9359cM15333a.f16275u;
            this.f7404g = c9359cM15333a.f16276v;
        }

        /* renamed from: f */
        public C6831g m6696f(CharSequence charSequence) {
            if (this.f7428s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.f7412k = charSequence;
            return this;
        }

        /* renamed from: g */
        public C6831g m6697g(GravityEnum gravityEnum) {
            this.f7398d = gravityEnum;
            return this;
        }

        /* renamed from: h */
        public final Context m6698h() {
            return this.f7392a;
        }

        /* renamed from: i */
        public C6831g m6699i(CharSequence charSequence) {
            this.f7420o = charSequence;
            return this;
        }

        /* renamed from: j */
        public C6831g m6700j(InterfaceC6832h interfaceC6832h) {
            this.f7442z = interfaceC6832h;
            return this;
        }

        /* renamed from: k */
        public C6831g m6701k(CharSequence charSequence) {
            this.f7416m = charSequence;
            return this;
        }

        /* renamed from: l */
        public C6831g m6702l(boolean z9, int i9) {
            if (this.f7428s != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z9) {
                this.f7401e0 = true;
                this.f7405g0 = -2;
                return this;
            }
            this.f7437w0 = false;
            this.f7401e0 = false;
            this.f7405g0 = -1;
            this.f7407h0 = i9;
            return this;
        }

        /* renamed from: m */
        public C6831g m6703m(boolean z9, int i9, boolean z10) {
            this.f7403f0 = z10;
            return m6702l(z9, i9);
        }

        /* renamed from: n */
        public MaterialDialog m6704n() {
            MaterialDialog materialDialogM6691a = m6691a();
            materialDialogM6691a.show();
            return materialDialogM6691a;
        }

        /* renamed from: o */
        public C6831g m6705o(CharSequence charSequence) {
            this.f7394b = charSequence;
            return this;
        }

        /* renamed from: p */
        public C6831g m6706p(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface typefaceM12293d = AbstractC7843b.m12293d(str);
                this.f7381P = typefaceM12293d;
                if (typefaceM12293d == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface typefaceM12293d2 = AbstractC7843b.m12293d(str2);
                this.f7380O = typefaceM12293d2;
                if (typefaceM12293d2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$h */
    public interface InterfaceC6832h {
        /* renamed from: a */
        void mo6707a(MaterialDialog materialDialog, DialogAction dialogAction);
    }

    public MaterialDialog(C6831g c6831g) throws Resources.NotFoundException {
        super(c6831g.f7392a, AbstractC6834b.m6717c(c6831g));
        this.f7322d = new Handler();
        this.f7321c = c6831g;
        this.f16162a = (MDRootLayout) LayoutInflater.from(c6831g.f7392a).inflate(AbstractC6834b.m6716b(c6831g), (ViewGroup) null);
        AbstractC6834b.m6718d(this);
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.C6833a.c
    /* renamed from: a */
    public boolean mo6670a(MaterialDialog materialDialog, View view, int i9, CharSequence charSequence, boolean z9) {
        boolean zM6684r = false;
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.f7338t;
        if (listType == null || listType == ListType.REGULAR) {
            if (this.f7321c.f7379N) {
                dismiss();
            }
            if (!z9) {
                this.f7321c.getClass();
            }
            if (z9) {
                this.f7321c.getClass();
            }
        } else if (listType == ListType.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(R$id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (this.f7339u.contains(Integer.valueOf(i9))) {
                this.f7339u.remove(Integer.valueOf(i9));
                if (!this.f7321c.f7361D || m6683q()) {
                    checkBox.setChecked(false);
                } else {
                    this.f7339u.add(Integer.valueOf(i9));
                }
            } else {
                this.f7339u.add(Integer.valueOf(i9));
                if (!this.f7321c.f7361D || m6683q()) {
                    checkBox.setChecked(true);
                } else {
                    this.f7339u.remove(Integer.valueOf(i9));
                }
            }
        } else if (listType == ListType.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(R$id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            C6831g c6831g = this.f7321c;
            int i10 = c6831g.f7375K;
            if (c6831g.f7379N && c6831g.f7416m == null) {
                dismiss();
                this.f7321c.f7375K = i9;
                m6684r(view);
            } else if (c6831g.f7363E) {
                c6831g.f7375K = i9;
                zM6684r = m6684r(view);
                this.f7321c.f7375K = i10;
            } else {
                zM6684r = true;
            }
            if (zM6684r) {
                this.f7321c.f7375K = i9;
                radioButton.setChecked(true);
                this.f7321c.f7385T.notifyItemChanged(i10);
                this.f7321c.f7385T.notifyItemChanged(i9);
            }
        }
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f7326h != null) {
            m6680n(this, this.f7321c);
        }
        super.dismiss();
    }

    /* renamed from: e */
    public final void m6671e() {
        RecyclerView recyclerView = this.f7327i;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC6825a());
    }

    /* renamed from: f */
    public final MDButton m6672f(DialogAction dialogAction) {
        int i9 = C6830f.f7353a[dialogAction.ordinal()];
        return i9 != 1 ? i9 != 2 ? this.f7335q : this.f7337s : this.f7336r;
    }

    @Override // p211p3.AbstractDialogC9320a, android.app.Dialog
    public /* bridge */ /* synthetic */ View findViewById(int i9) {
        return super.findViewById(i9);
    }

    /* renamed from: g */
    public final C6831g m6673g() {
        return this.f7321c;
    }

    /* renamed from: h */
    public Drawable m6674h(DialogAction dialogAction, boolean z9) {
        if (z9) {
            C6831g c6831g = this.f7321c;
            int i9 = c6831g.f7368G0;
            if (i9 != 0) {
                return AbstractC6799e.m6460e(c6831g.f7392a, i9);
            }
            Drawable drawableM6483p = AbstractC6801g.m6483p(c6831g.f7392a, R$attr.md_btn_stacked_selector);
            return drawableM6483p != null ? drawableM6483p : AbstractC6801g.m6483p(getContext(), R$attr.md_btn_stacked_selector);
        }
        int i10 = C6830f.f7353a[dialogAction.ordinal()];
        if (i10 == 1) {
            C6831g c6831g2 = this.f7321c;
            int i11 = c6831g2.f7372I0;
            if (i11 != 0) {
                return AbstractC6799e.m6460e(c6831g2.f7392a, i11);
            }
            Drawable drawableM6483p2 = AbstractC6801g.m6483p(c6831g2.f7392a, R$attr.md_btn_neutral_selector);
            if (drawableM6483p2 != null) {
                return drawableM6483p2;
            }
            Drawable drawableM6483p3 = AbstractC6801g.m6483p(getContext(), R$attr.md_btn_neutral_selector);
            AbstractC9428a.m15571a(drawableM6483p3, this.f7321c.f7406h);
            return drawableM6483p3;
        }
        if (i10 != 2) {
            C6831g c6831g3 = this.f7321c;
            int i12 = c6831g3.f7370H0;
            if (i12 != 0) {
                return AbstractC6799e.m6460e(c6831g3.f7392a, i12);
            }
            Drawable drawableM6483p4 = AbstractC6801g.m6483p(c6831g3.f7392a, R$attr.md_btn_positive_selector);
            if (drawableM6483p4 != null) {
                return drawableM6483p4;
            }
            Drawable drawableM6483p5 = AbstractC6801g.m6483p(getContext(), R$attr.md_btn_positive_selector);
            AbstractC9428a.m15571a(drawableM6483p5, this.f7321c.f7406h);
            return drawableM6483p5;
        }
        C6831g c6831g4 = this.f7321c;
        int i13 = c6831g4.f7374J0;
        if (i13 != 0) {
            return AbstractC6799e.m6460e(c6831g4.f7392a, i13);
        }
        Drawable drawableM6483p6 = AbstractC6801g.m6483p(c6831g4.f7392a, R$attr.md_btn_negative_selector);
        if (drawableM6483p6 != null) {
            return drawableM6483p6;
        }
        Drawable drawableM6483p7 = AbstractC6801g.m6483p(getContext(), R$attr.md_btn_negative_selector);
        AbstractC9428a.m15571a(drawableM6483p7, this.f7321c.f7406h);
        return drawableM6483p7;
    }

    /* renamed from: i */
    public final int m6675i() {
        ProgressBar progressBar = this.f7330l;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    /* renamed from: j */
    public final EditText m6676j() {
        return this.f7326h;
    }

    /* renamed from: k */
    public final Drawable m6677k() {
        C6831g c6831g = this.f7321c;
        int i9 = c6831g.f7366F0;
        if (i9 != 0) {
            return AbstractC6799e.m6460e(c6831g.f7392a, i9);
        }
        Drawable drawableM6483p = AbstractC6801g.m6483p(c6831g.f7392a, R$attr.md_list_selector);
        return drawableM6483p != null ? drawableM6483p : AbstractC6801g.m6483p(getContext(), R$attr.md_list_selector);
    }

    /* renamed from: l */
    public final int m6678l() {
        ProgressBar progressBar = this.f7330l;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    /* renamed from: m */
    public final View m6679m() {
        return this.f16162a;
    }

    /* renamed from: n */
    public final void m6680n(DialogInterface dialogInterface, C6831g c6831g) {
        InputMethodManager inputMethodManager;
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m6676j() == null || (inputMethodManager = (InputMethodManager) c6831g.m6698h().getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = materialDialog.getCurrentFocus();
        IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : materialDialog.m6679m().getWindowToken();
        if (windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: o */
    public void m6681o(int i9, boolean z9) {
        C6831g c6831g;
        int i10;
        TextView textView = this.f7333o;
        if (textView != null) {
            if (this.f7321c.f7421o0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i9), Integer.valueOf(this.f7321c.f7421o0)));
                this.f7333o.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean z10 = (z9 && i9 == 0) || ((i10 = (c6831g = this.f7321c).f7421o0) > 0 && i9 > i10) || i9 < c6831g.f7419n0;
            C6831g c6831g2 = this.f7321c;
            int i11 = z10 ? c6831g2.f7423p0 : c6831g2.f7410j;
            C6831g c6831g3 = this.f7321c;
            int i12 = z10 ? c6831g3.f7423p0 : c6831g3.f7430t;
            if (this.f7321c.f7421o0 > 0) {
                this.f7333o.setTextColor(i11);
            }
            AbstractC9358b.m15330e(this.f7326h, i12);
            m6672f(DialogAction.POSITIVE).setEnabled(!z10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DialogAction dialogAction = (DialogAction) view.getTag();
        int i9 = C6830f.f7353a[dialogAction.ordinal()];
        if (i9 == 1) {
            this.f7321c.getClass();
            InterfaceC6832h interfaceC6832h = this.f7321c.f7357B;
            if (interfaceC6832h != null) {
                interfaceC6832h.mo6707a(this, dialogAction);
            }
            if (this.f7321c.f7379N) {
                dismiss();
            }
        } else if (i9 == 2) {
            this.f7321c.getClass();
            InterfaceC6832h interfaceC6832h2 = this.f7321c.f7355A;
            if (interfaceC6832h2 != null) {
                interfaceC6832h2.mo6707a(this, dialogAction);
            }
            if (this.f7321c.f7379N) {
                cancel();
            }
        } else if (i9 == 3) {
            this.f7321c.getClass();
            InterfaceC6832h interfaceC6832h3 = this.f7321c.f7442z;
            if (interfaceC6832h3 != null) {
                interfaceC6832h3.mo6707a(this, dialogAction);
            }
            if (!this.f7321c.f7363E) {
                m6684r(view);
            }
            if (!this.f7321c.f7361D) {
                m6683q();
            }
            this.f7321c.getClass();
            if (this.f7321c.f7379N) {
                dismiss();
            }
        }
        InterfaceC6832h interfaceC6832h4 = this.f7321c.f7359C;
        if (interfaceC6832h4 != null) {
            interfaceC6832h4.mo6707a(this, dialogAction);
        }
    }

    @Override // p211p3.AbstractDialogC9320a, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.f7326h != null) {
            m6688v(this, this.f7321c);
            if (this.f7326h.getText().length() > 0) {
                EditText editText = this.f7326h;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // p211p3.AbstractDialogC9320a, android.app.Dialog
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m6682p() {
        if (this.f7327i == null) {
            return;
        }
        ArrayList arrayList = this.f7321c.f7414l;
        if ((arrayList == null || arrayList.size() == 0) && this.f7321c.f7385T == null) {
            return;
        }
        C6831g c6831g = this.f7321c;
        if (c6831g.f7386U == null) {
            c6831g.f7386U = new LinearLayoutManager(getContext());
        }
        if (this.f7327i.getLayoutManager() == null) {
            this.f7327i.setLayoutManager(this.f7321c.f7386U);
        }
        this.f7327i.setAdapter(this.f7321c.f7385T);
        if (this.f7338t != null) {
            ((C6833a) this.f7321c.f7385T).m6713g(this);
        }
    }

    /* renamed from: q */
    public final boolean m6683q() {
        this.f7321c.getClass();
        return false;
    }

    /* renamed from: r */
    public final boolean m6684r(View view) {
        this.f7321c.getClass();
        return false;
    }

    /* renamed from: s */
    public void m6685s() {
        EditText editText = this.f7326h;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new C6828d());
    }

    @Override // p211p3.AbstractDialogC9320a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i9) {
        super.setContentView(i9);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f7324f.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (this.f7321c.f7376K0) {
                AbstractC6800f.m6466b(getWindow(), new C6826b());
            } else {
                m6689w();
            }
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* renamed from: t */
    public final void m6686t(int i9) {
        if (this.f7321c.f7405g0 <= -2) {
            Log.w("MaterialDialog", "Calling setProgress(int) on an indeterminate progress dialog has no effect!");
        } else {
            this.f7330l.setProgress(i9);
            this.f7322d.post(new RunnableC6827c());
        }
    }

    /* renamed from: u */
    public final void m6687u(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    /* renamed from: v */
    public final void m6688v(DialogInterface dialogInterface, C6831g c6831g) {
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m6676j() == null) {
            return;
        }
        materialDialog.m6676j().post(new RunnableC6829e(materialDialog, c6831g));
    }

    /* renamed from: w */
    public final void m6689w() {
        super.show();
    }

    @Override // p211p3.AbstractDialogC9320a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i9) {
        setTitle(this.f7321c.f7392a.getString(i9));
    }

    @Override // p211p3.AbstractDialogC9320a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
