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
import com.xuexiang.xui.utils.AbstractC5857e;
import com.xuexiang.xui.utils.AbstractC5858f;
import com.xuexiang.xui.utils.AbstractC5859g;
import com.xuexiang.xui.widget.dialog.materialdialog.C5892a;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p003a2.AbstractDialogC0008a;
import p017b2.AbstractC4411b;
import p017b2.C4412c;
import p025c2.AbstractC4485a;
import p126p1.AbstractC7591b;

/* loaded from: classes3.dex */
public class MaterialDialog extends AbstractDialogC0008a implements View.OnClickListener, C5892a.c {

    /* renamed from: c */
    public final C5891g f4792c;

    /* renamed from: d */
    public final Handler f4793d;

    /* renamed from: e */
    public ImageView f4794e;

    /* renamed from: f */
    public TextView f4795f;

    /* renamed from: g */
    public TextView f4796g;

    /* renamed from: h */
    public EditText f4797h;

    /* renamed from: i */
    public RecyclerView f4798i;

    /* renamed from: j */
    public View f4799j;

    /* renamed from: k */
    public FrameLayout f4800k;

    /* renamed from: l */
    public ProgressBar f4801l;

    /* renamed from: m */
    public TextView f4802m;

    /* renamed from: n */
    public TextView f4803n;

    /* renamed from: o */
    public TextView f4804o;

    /* renamed from: p */
    public CheckBox f4805p;

    /* renamed from: q */
    public MDButton f4806q;

    /* renamed from: r */
    public MDButton f4807r;

    /* renamed from: s */
    public MDButton f4808s;

    /* renamed from: t */
    public ListType f4809t;

    /* renamed from: u */
    public List f4810u;

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
        public static int m4606a(ListType listType) {
            int i6 = C5890f.f4825b[listType.ordinal()];
            if (i6 == 1) {
                return R$layout.xmd_layout_listitem;
            }
            if (i6 == 2) {
                return R$layout.xmd_layout_listitem_single_choice;
            }
            if (i6 == 3) {
                return R$layout.xmd_layout_listitem_multi_choice;
            }
            throw new IllegalArgumentException("Not a valid list type");
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC5885a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$a$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f4816a;

            public a(int i6) {
                this.f4816a = i6;
            }

            @Override // java.lang.Runnable
            public void run() {
                MaterialDialog.this.f4798i.requestFocus();
                MaterialDialog.this.f4792c.f4849Q.scrollToPosition(this.f4816a);
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC5885a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int iIntValue;
            MaterialDialog.this.f4798i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MaterialDialog materialDialog = MaterialDialog.this;
            ListType listType = materialDialog.f4809t;
            ListType listType2 = ListType.SINGLE;
            if (listType == listType2 || listType == ListType.MULTI) {
                if (listType == listType2) {
                    iIntValue = materialDialog.f4792c.f4838G;
                    if (iIntValue < 0) {
                        return;
                    }
                } else {
                    List list = materialDialog.f4810u;
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    Collections.sort(MaterialDialog.this.f4810u);
                    iIntValue = ((Integer) MaterialDialog.this.f4810u.get(0)).intValue();
                }
                MaterialDialog.this.f4798i.post(new a(iIntValue));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$b */
    public class C5886b implements AbstractC5858f.a {
        public C5886b() {
        }

        @Override // com.xuexiang.xui.utils.AbstractC5858f.a
        /* renamed from: a */
        public void mo4374a(Window window) {
            MaterialDialog.this.m4605w();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$c */
    public class RunnableC5887c implements Runnable {
        public RunnableC5887c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MaterialDialog materialDialog = MaterialDialog.this;
            TextView textView = materialDialog.f4802m;
            if (textView != null) {
                textView.setText(materialDialog.f4792c.f4894r0.format(materialDialog.m4591i() / MaterialDialog.this.m4594l()));
            }
            MaterialDialog materialDialog2 = MaterialDialog.this;
            TextView textView2 = materialDialog2.f4803n;
            if (textView2 != null) {
                textView2.setText(String.format(materialDialog2.f4792c.f4892q0, Integer.valueOf(materialDialog2.m4591i()), Integer.valueOf(MaterialDialog.this.m4594l())));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$d */
    public class C5888d implements TextWatcher {
        public C5888d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
            int length = charSequence.toString().length();
            MaterialDialog materialDialog = MaterialDialog.this;
            if (!materialDialog.f4792c.f4872g0) {
                z = length == 0;
                materialDialog.m4588f(DialogAction.POSITIVE).setEnabled(!z);
            }
            MaterialDialog.this.m4597o(length, z);
            C5891g c5891g = MaterialDialog.this.f4792c;
            if (c5891g.f4876i0) {
                c5891g.getClass();
                throw null;
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$e */
    public class RunnableC5889e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MaterialDialog f4821a;

        /* renamed from: b */
        public final /* synthetic */ C5891g f4822b;

        public RunnableC5889e(MaterialDialog materialDialog, C5891g c5891g) {
            this.f4821a = materialDialog;
            this.f4822b = c5891g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4821a.m4592j().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f4822b.m4612f().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f4821a.m4592j(), 1);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$f */
    public static /* synthetic */ class C5890f {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4824a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f4825b;

        static {
            int[] iArr = new int[ListType.values().length];
            f4825b = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4825b[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4825b[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            f4824a = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4824a[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4824a[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$g */
    public static class C5891g {

        /* renamed from: A */
        public boolean f4826A;

        /* renamed from: A0 */
        public boolean f4827A0;

        /* renamed from: B */
        public Theme f4828B;

        /* renamed from: B0 */
        public int f4829B0;

        /* renamed from: C */
        public int f4830C;

        /* renamed from: C0 */
        public int f4831C0;

        /* renamed from: D */
        public boolean f4832D;

        /* renamed from: D0 */
        public int f4833D0;

        /* renamed from: E */
        public boolean f4834E;

        /* renamed from: E0 */
        public int f4835E0;

        /* renamed from: F */
        public float f4836F;

        /* renamed from: F0 */
        public int f4837F0;

        /* renamed from: G */
        public int f4838G;

        /* renamed from: G0 */
        public boolean f4839G0;

        /* renamed from: H */
        public Integer[] f4840H;

        /* renamed from: I */
        public Integer[] f4841I;

        /* renamed from: J */
        public boolean f4842J;

        /* renamed from: K */
        public Typeface f4843K;

        /* renamed from: L */
        public Typeface f4844L;

        /* renamed from: M */
        public Drawable f4845M;

        /* renamed from: N */
        public boolean f4846N;

        /* renamed from: O */
        public int f4847O;

        /* renamed from: P */
        public RecyclerView.Adapter f4848P;

        /* renamed from: Q */
        public RecyclerView.LayoutManager f4849Q;

        /* renamed from: R */
        public DialogInterface.OnDismissListener f4850R;

        /* renamed from: S */
        public DialogInterface.OnCancelListener f4851S;

        /* renamed from: T */
        public DialogInterface.OnKeyListener f4852T;

        /* renamed from: U */
        public DialogInterface.OnShowListener f4853U;

        /* renamed from: V */
        public StackingBehavior f4854V;

        /* renamed from: W */
        public boolean f4855W;

        /* renamed from: X */
        public int f4856X;

        /* renamed from: Y */
        public int f4857Y;

        /* renamed from: Z */
        public int f4858Z;

        /* renamed from: a */
        public final Context f4859a;

        /* renamed from: a0 */
        public boolean f4860a0;

        /* renamed from: b */
        public CharSequence f4861b;

        /* renamed from: b0 */
        public boolean f4862b0;

        /* renamed from: c */
        public GravityEnum f4863c;

        /* renamed from: c0 */
        public int f4864c0;

        /* renamed from: d */
        public GravityEnum f4865d;

        /* renamed from: d0 */
        public int f4866d0;

        /* renamed from: e */
        public GravityEnum f4867e;

        /* renamed from: e0 */
        public CharSequence f4868e0;

        /* renamed from: f */
        public GravityEnum f4869f;

        /* renamed from: f0 */
        public CharSequence f4870f0;

        /* renamed from: g */
        public GravityEnum f4871g;

        /* renamed from: g0 */
        public boolean f4872g0;

        /* renamed from: h */
        public int f4873h;

        /* renamed from: h0 */
        public int f4874h0;

        /* renamed from: i */
        public int f4875i;

        /* renamed from: i0 */
        public boolean f4876i0;

        /* renamed from: j */
        public int f4877j;

        /* renamed from: j0 */
        public int f4878j0;

        /* renamed from: k */
        public CharSequence f4879k;

        /* renamed from: k0 */
        public int f4880k0;

        /* renamed from: l */
        public ArrayList f4881l;

        /* renamed from: l0 */
        public int f4882l0;

        /* renamed from: m */
        public CharSequence f4883m;

        /* renamed from: m0 */
        public int[] f4884m0;

        /* renamed from: n */
        public CharSequence f4885n;

        /* renamed from: n0 */
        public CharSequence f4886n0;

        /* renamed from: o */
        public CharSequence f4887o;

        /* renamed from: o0 */
        public boolean f4888o0;

        /* renamed from: p */
        public boolean f4889p;

        /* renamed from: p0 */
        public CompoundButton.OnCheckedChangeListener f4890p0;

        /* renamed from: q */
        public boolean f4891q;

        /* renamed from: q0 */
        public String f4892q0;

        /* renamed from: r */
        public boolean f4893r;

        /* renamed from: r0 */
        public NumberFormat f4894r0;

        /* renamed from: s */
        public View f4895s;

        /* renamed from: s0 */
        public boolean f4896s0;

        /* renamed from: t */
        public int f4897t;

        /* renamed from: t0 */
        public boolean f4898t0;

        /* renamed from: u */
        public ColorStateList f4899u;

        /* renamed from: u0 */
        public boolean f4900u0;

        /* renamed from: v */
        public ColorStateList f4901v;

        /* renamed from: v0 */
        public boolean f4902v0;

        /* renamed from: w */
        public ColorStateList f4903w;

        /* renamed from: w0 */
        public boolean f4904w0;

        /* renamed from: x */
        public ColorStateList f4905x;

        /* renamed from: x0 */
        public boolean f4906x0;

        /* renamed from: y */
        public ColorStateList f4907y;

        /* renamed from: y0 */
        public boolean f4908y0;

        /* renamed from: z */
        public boolean f4909z;

        /* renamed from: z0 */
        public boolean f4910z0;

        public C5891g(Context context) {
            GravityEnum gravityEnum = GravityEnum.START;
            this.f4863c = gravityEnum;
            this.f4865d = gravityEnum;
            this.f4867e = GravityEnum.END;
            this.f4869f = gravityEnum;
            this.f4871g = gravityEnum;
            this.f4873h = 0;
            this.f4875i = -1;
            this.f4877j = -1;
            this.f4909z = false;
            this.f4826A = false;
            Theme theme = Theme.LIGHT;
            this.f4828B = theme;
            this.f4830C = -1;
            this.f4832D = true;
            this.f4834E = true;
            this.f4836F = 1.2f;
            this.f4838G = -1;
            this.f4840H = null;
            this.f4841I = null;
            this.f4842J = true;
            this.f4847O = -1;
            this.f4864c0 = -2;
            this.f4866d0 = 0;
            this.f4874h0 = -1;
            this.f4878j0 = -1;
            this.f4880k0 = -1;
            this.f4882l0 = 0;
            this.f4898t0 = false;
            this.f4900u0 = false;
            this.f4902v0 = false;
            this.f4904w0 = false;
            this.f4906x0 = false;
            this.f4908y0 = false;
            this.f4910z0 = false;
            this.f4827A0 = false;
            this.f4859a = context;
            int iM4388n = AbstractC5859g.m4388n(context, R$attr.colorAccent, AbstractC5859g.m4377c(context, R$color.md_material_blue_600));
            this.f4897t = iM4388n;
            int iM4388n2 = AbstractC5859g.m4388n(context, R.attr.colorAccent, iM4388n);
            this.f4897t = iM4388n2;
            this.f4901v = AbstractC5859g.m4376b(context, iM4388n2);
            this.f4903w = AbstractC5859g.m4376b(context, this.f4897t);
            this.f4905x = AbstractC5859g.m4376b(context, this.f4897t);
            this.f4907y = AbstractC5859g.m4376b(context, AbstractC5859g.m4388n(context, R$attr.md_link_color, this.f4897t));
            this.f4873h = AbstractC5859g.m4388n(context, R$attr.md_btn_ripple_color, AbstractC5859g.m4388n(context, R$attr.colorControlHighlight, AbstractC5859g.m4387m(context, R.attr.colorControlHighlight)));
            this.f4894r0 = NumberFormat.getPercentInstance();
            this.f4892q0 = "%1d/%2d";
            this.f4828B = AbstractC5859g.m4382h(AbstractC5859g.m4387m(context, R.attr.textColorPrimary)) ? theme : Theme.DARK;
            m4609c();
            this.f4863c = AbstractC5859g.m4394t(context, R$attr.md_title_gravity, this.f4863c);
            this.f4865d = AbstractC5859g.m4394t(context, R$attr.md_content_gravity, this.f4865d);
            this.f4867e = AbstractC5859g.m4394t(context, R$attr.md_btnstacked_gravity, this.f4867e);
            this.f4869f = AbstractC5859g.m4394t(context, R$attr.md_items_gravity, this.f4869f);
            this.f4871g = AbstractC5859g.m4394t(context, R$attr.md_buttons_gravity, this.f4871g);
            try {
                m4621o(AbstractC5859g.m4395u(context, R$attr.md_medium_font, AbstractC7591b.m8999b()), AbstractC5859g.m4395u(context, R$attr.md_regular_font, AbstractC7591b.m8999b()));
            } catch (Throwable unused) {
            }
            if (this.f4844L == null) {
                try {
                    this.f4844L = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.f4844L = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f4843K == null) {
                try {
                    this.f4843K = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f4843K = typeface;
                    if (typeface == null) {
                        this.f4843K = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: a */
        public MaterialDialog m4607a() {
            return new MaterialDialog(this);
        }

        /* renamed from: b */
        public C5891g m4608b(DialogInterface.OnCancelListener onCancelListener) {
            this.f4851S = onCancelListener;
            return this;
        }

        /* renamed from: c */
        public final void m4609c() {
            if (C4412c.m1472b(false) == null) {
                return;
            }
            C4412c c4412cM1471a = C4412c.m1471a();
            if (c4412cM1471a.f1273a) {
                this.f4828B = Theme.DARK;
            }
            int i6 = c4412cM1471a.f1274b;
            if (i6 != 0) {
                this.f4875i = i6;
            }
            int i7 = c4412cM1471a.f1275c;
            if (i7 != 0) {
                this.f4877j = i7;
            }
            ColorStateList colorStateList = c4412cM1471a.f1276d;
            if (colorStateList != null) {
                this.f4901v = colorStateList;
            }
            ColorStateList colorStateList2 = c4412cM1471a.f1277e;
            if (colorStateList2 != null) {
                this.f4905x = colorStateList2;
            }
            ColorStateList colorStateList3 = c4412cM1471a.f1278f;
            if (colorStateList3 != null) {
                this.f4903w = colorStateList3;
            }
            int i8 = c4412cM1471a.f1280h;
            if (i8 != 0) {
                this.f4858Z = i8;
            }
            Drawable drawable = c4412cM1471a.f1281i;
            if (drawable != null) {
                this.f4845M = drawable;
            }
            int i9 = c4412cM1471a.f1282j;
            if (i9 != 0) {
                this.f4857Y = i9;
            }
            int i10 = c4412cM1471a.f1283k;
            if (i10 != 0) {
                this.f4856X = i10;
            }
            int i11 = c4412cM1471a.f1286n;
            if (i11 != 0) {
                this.f4831C0 = i11;
            }
            int i12 = c4412cM1471a.f1285m;
            if (i12 != 0) {
                this.f4829B0 = i12;
            }
            int i13 = c4412cM1471a.f1287o;
            if (i13 != 0) {
                this.f4833D0 = i13;
            }
            int i14 = c4412cM1471a.f1288p;
            if (i14 != 0) {
                this.f4835E0 = i14;
            }
            int i15 = c4412cM1471a.f1289q;
            if (i15 != 0) {
                this.f4837F0 = i15;
            }
            int i16 = c4412cM1471a.f1279g;
            if (i16 != 0) {
                this.f4897t = i16;
            }
            ColorStateList colorStateList4 = c4412cM1471a.f1284l;
            if (colorStateList4 != null) {
                this.f4907y = colorStateList4;
            }
            this.f4863c = c4412cM1471a.f1290r;
            this.f4865d = c4412cM1471a.f1291s;
            this.f4867e = c4412cM1471a.f1292t;
            this.f4869f = c4412cM1471a.f1293u;
            this.f4871g = c4412cM1471a.f1294v;
        }

        /* renamed from: d */
        public C5891g m4610d(CharSequence charSequence) {
            if (this.f4895s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.f4879k = charSequence;
            return this;
        }

        /* renamed from: e */
        public C5891g m4611e(GravityEnum gravityEnum) {
            this.f4865d = gravityEnum;
            return this;
        }

        /* renamed from: f */
        public final Context m4612f() {
            return this.f4859a;
        }

        /* renamed from: g */
        public C5891g m4613g() {
            this.f4846N = true;
            return this;
        }

        /* renamed from: h */
        public C5891g m4614h(CharSequence charSequence) {
            this.f4887o = charSequence;
            return this;
        }

        /* renamed from: i */
        public C5891g m4615i(boolean z6, int i6) {
            if (this.f4895s != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z6) {
                this.f4860a0 = true;
                this.f4864c0 = -2;
                return this;
            }
            this.f4896s0 = false;
            this.f4860a0 = false;
            this.f4864c0 = -1;
            this.f4866d0 = i6;
            return this;
        }

        /* renamed from: j */
        public C5891g m4616j(boolean z6, int i6, boolean z7) {
            this.f4862b0 = z7;
            return m4615i(z6, i6);
        }

        /* renamed from: k */
        public C5891g m4617k(boolean z6) {
            this.f4896s0 = z6;
            return this;
        }

        /* renamed from: l */
        public MaterialDialog m4618l() {
            MaterialDialog materialDialogM4607a = m4607a();
            materialDialogM4607a.show();
            return materialDialogM4607a;
        }

        /* renamed from: m */
        public C5891g m4619m(DialogInterface.OnShowListener onShowListener) {
            this.f4853U = onShowListener;
            return this;
        }

        /* renamed from: n */
        public C5891g m4620n(CharSequence charSequence) {
            this.f4861b = charSequence;
            return this;
        }

        /* renamed from: o */
        public C5891g m4621o(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface typefaceM9001d = AbstractC7591b.m9001d(str);
                this.f4844L = typefaceM9001d;
                if (typefaceM9001d == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface typefaceM9001d2 = AbstractC7591b.m9001d(str2);
                this.f4843K = typefaceM9001d2;
                if (typefaceM9001d2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }
    }

    public MaterialDialog(C5891g c5891g) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, SecurityException, IllegalArgumentException {
        super(c5891g.f4859a, AbstractC5893b.m4631c(c5891g));
        this.f4793d = new Handler(Looper.getMainLooper());
        this.f4792c = c5891g;
        this.f3a = (MDRootLayout) LayoutInflater.from(c5891g.f4859a).inflate(AbstractC5893b.m4630b(c5891g), (ViewGroup) null);
        AbstractC5893b.m4632d(this);
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.C5892a.c
    /* renamed from: a */
    public boolean mo4586a(MaterialDialog materialDialog, View view, int i6, CharSequence charSequence, boolean z6) {
        boolean zM4600r = false;
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.f4809t;
        if (listType == null || listType == ListType.REGULAR) {
            if (this.f4792c.f4842J) {
                dismiss();
            }
            if (!z6) {
                this.f4792c.getClass();
            }
            if (z6) {
                this.f4792c.getClass();
            }
        } else if (listType == ListType.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(R$id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (this.f4810u.contains(Integer.valueOf(i6))) {
                this.f4810u.remove(Integer.valueOf(i6));
                if (!this.f4792c.f4909z || m4599q()) {
                    checkBox.setChecked(false);
                } else {
                    this.f4810u.add(Integer.valueOf(i6));
                }
            } else {
                this.f4810u.add(Integer.valueOf(i6));
                if (!this.f4792c.f4909z || m4599q()) {
                    checkBox.setChecked(true);
                } else {
                    this.f4810u.remove(Integer.valueOf(i6));
                }
            }
        } else if (listType == ListType.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(R$id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            C5891g c5891g = this.f4792c;
            int i7 = c5891g.f4838G;
            if (c5891g.f4842J && c5891g.f4883m == null) {
                dismiss();
                this.f4792c.f4838G = i6;
                m4600r(view);
            } else if (c5891g.f4826A) {
                c5891g.f4838G = i6;
                zM4600r = m4600r(view);
                this.f4792c.f4838G = i7;
            } else {
                zM4600r = true;
            }
            if (zM4600r) {
                this.f4792c.f4838G = i6;
                radioButton.setChecked(true);
                this.f4792c.f4848P.notifyItemChanged(i7);
                this.f4792c.f4848P.notifyItemChanged(i6);
            }
        }
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f4797h != null) {
            m4596n(this, this.f4792c);
        }
        super.dismiss();
    }

    /* renamed from: e */
    public final void m4587e() {
        RecyclerView recyclerView = this.f4798i;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC5885a());
    }

    /* renamed from: f */
    public final MDButton m4588f(DialogAction dialogAction) {
        int i6 = C5890f.f4824a[dialogAction.ordinal()];
        return i6 != 1 ? i6 != 2 ? this.f4806q : this.f4808s : this.f4807r;
    }

    @Override // p003a2.AbstractDialogC0008a, android.app.Dialog
    public /* bridge */ /* synthetic */ View findViewById(int i6) {
        return super.findViewById(i6);
    }

    /* renamed from: g */
    public final C5891g m4589g() {
        return this.f4792c;
    }

    /* renamed from: h */
    public Drawable m4590h(DialogAction dialogAction, boolean z6) {
        if (z6) {
            C5891g c5891g = this.f4792c;
            int i6 = c5891g.f4831C0;
            if (i6 != 0) {
                return AbstractC5857e.m4365f(c5891g.f4859a, i6);
            }
            Context context = c5891g.f4859a;
            int i7 = R$attr.md_btn_stacked_selector;
            Drawable drawableM4391q = AbstractC5859g.m4391q(context, i7);
            return drawableM4391q != null ? drawableM4391q : AbstractC5859g.m4391q(getContext(), i7);
        }
        int i8 = C5890f.f4824a[dialogAction.ordinal()];
        if (i8 == 1) {
            C5891g c5891g2 = this.f4792c;
            int i9 = c5891g2.f4835E0;
            if (i9 != 0) {
                return AbstractC5857e.m4365f(c5891g2.f4859a, i9);
            }
            Context context2 = c5891g2.f4859a;
            int i10 = R$attr.md_btn_neutral_selector;
            Drawable drawableM4391q2 = AbstractC5859g.m4391q(context2, i10);
            if (drawableM4391q2 != null) {
                return drawableM4391q2;
            }
            Drawable drawableM4391q3 = AbstractC5859g.m4391q(getContext(), i10);
            AbstractC4485a.m1596a(drawableM4391q3, this.f4792c.f4873h);
            return drawableM4391q3;
        }
        if (i8 != 2) {
            C5891g c5891g3 = this.f4792c;
            int i11 = c5891g3.f4833D0;
            if (i11 != 0) {
                return AbstractC5857e.m4365f(c5891g3.f4859a, i11);
            }
            Context context3 = c5891g3.f4859a;
            int i12 = R$attr.md_btn_positive_selector;
            Drawable drawableM4391q4 = AbstractC5859g.m4391q(context3, i12);
            if (drawableM4391q4 != null) {
                return drawableM4391q4;
            }
            Drawable drawableM4391q5 = AbstractC5859g.m4391q(getContext(), i12);
            AbstractC4485a.m1596a(drawableM4391q5, this.f4792c.f4873h);
            return drawableM4391q5;
        }
        C5891g c5891g4 = this.f4792c;
        int i13 = c5891g4.f4837F0;
        if (i13 != 0) {
            return AbstractC5857e.m4365f(c5891g4.f4859a, i13);
        }
        Context context4 = c5891g4.f4859a;
        int i14 = R$attr.md_btn_negative_selector;
        Drawable drawableM4391q6 = AbstractC5859g.m4391q(context4, i14);
        if (drawableM4391q6 != null) {
            return drawableM4391q6;
        }
        Drawable drawableM4391q7 = AbstractC5859g.m4391q(getContext(), i14);
        AbstractC4485a.m1596a(drawableM4391q7, this.f4792c.f4873h);
        return drawableM4391q7;
    }

    /* renamed from: i */
    public final int m4591i() {
        ProgressBar progressBar = this.f4801l;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getProgress();
    }

    /* renamed from: j */
    public final EditText m4592j() {
        return this.f4797h;
    }

    /* renamed from: k */
    public final Drawable m4593k() {
        C5891g c5891g = this.f4792c;
        int i6 = c5891g.f4829B0;
        if (i6 != 0) {
            return AbstractC5857e.m4365f(c5891g.f4859a, i6);
        }
        Context context = c5891g.f4859a;
        int i7 = R$attr.md_list_selector;
        Drawable drawableM4391q = AbstractC5859g.m4391q(context, i7);
        return drawableM4391q != null ? drawableM4391q : AbstractC5859g.m4391q(getContext(), i7);
    }

    /* renamed from: l */
    public final int m4594l() {
        ProgressBar progressBar = this.f4801l;
        if (progressBar == null) {
            return -1;
        }
        return progressBar.getMax();
    }

    /* renamed from: m */
    public final View m4595m() {
        return this.f3a;
    }

    /* renamed from: n */
    public final void m4596n(DialogInterface dialogInterface, C5891g c5891g) {
        InputMethodManager inputMethodManager;
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m4592j() == null || (inputMethodManager = (InputMethodManager) c5891g.m4612f().getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = materialDialog.getCurrentFocus();
        IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : materialDialog.m4595m().getWindowToken();
        if (windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: o */
    public void m4597o(int i6, boolean z6) {
        C5891g c5891g;
        int i7;
        TextView textView = this.f4804o;
        if (textView != null) {
            if (this.f4792c.f4880k0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i6), Integer.valueOf(this.f4792c.f4880k0)));
                this.f4804o.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean z7 = (z6 && i6 == 0) || ((i7 = (c5891g = this.f4792c).f4880k0) > 0 && i6 > i7) || i6 < c5891g.f4878j0;
            C5891g c5891g2 = this.f4792c;
            int i8 = z7 ? c5891g2.f4882l0 : c5891g2.f4877j;
            C5891g c5891g3 = this.f4792c;
            int i9 = z7 ? c5891g3.f4882l0 : c5891g3.f4897t;
            if (this.f4792c.f4880k0 > 0) {
                this.f4804o.setTextColor(i8);
            }
            AbstractC4411b.m1468e(this.f4797h, i9);
            m4588f(DialogAction.POSITIVE).setEnabled(!z7);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = C5890f.f4824a[((DialogAction) view.getTag()).ordinal()];
        if (i6 == 1) {
            this.f4792c.getClass();
            this.f4792c.getClass();
            if (this.f4792c.f4842J) {
                dismiss();
            }
        } else if (i6 == 2) {
            this.f4792c.getClass();
            this.f4792c.getClass();
            if (this.f4792c.f4842J) {
                cancel();
            }
        } else if (i6 == 3) {
            this.f4792c.getClass();
            this.f4792c.getClass();
            if (!this.f4792c.f4826A) {
                m4600r(view);
            }
            if (!this.f4792c.f4909z) {
                m4599q();
            }
            this.f4792c.getClass();
            if (this.f4792c.f4842J) {
                dismiss();
            }
        }
        this.f4792c.getClass();
    }

    @Override // p003a2.AbstractDialogC0008a, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.f4797h != null) {
            m4604v(this, this.f4792c);
            if (this.f4797h.getText().length() > 0) {
                EditText editText = this.f4797h;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // p003a2.AbstractDialogC0008a, android.app.Dialog
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final void m4598p() {
        if (this.f4798i == null) {
            return;
        }
        ArrayList arrayList = this.f4792c.f4881l;
        if ((arrayList == null || arrayList.size() == 0) && this.f4792c.f4848P == null) {
            return;
        }
        C5891g c5891g = this.f4792c;
        if (c5891g.f4849Q == null) {
            c5891g.f4849Q = new LinearLayoutManager(getContext());
        }
        if (this.f4798i.getLayoutManager() == null) {
            this.f4798i.setLayoutManager(this.f4792c.f4849Q);
        }
        this.f4798i.setAdapter(this.f4792c.f4848P);
        if (this.f4809t != null) {
            ((C5892a) this.f4792c.f4848P).m4627g(this);
        }
    }

    /* renamed from: q */
    public final boolean m4599q() {
        this.f4792c.getClass();
        return false;
    }

    /* renamed from: r */
    public final boolean m4600r(View view) {
        this.f4792c.getClass();
        return false;
    }

    /* renamed from: s */
    public void m4601s() {
        EditText editText = this.f4797h;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new C5888d());
    }

    @Override // p003a2.AbstractDialogC0008a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i6) {
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f4795f.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (this.f4792c.f4839G0) {
                AbstractC5858f.m4371c(getWindow(), new C5886b());
            } else {
                m4605w();
            }
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* renamed from: t */
    public final void m4602t(int i6) {
        if (this.f4792c.f4864c0 <= -2) {
            Log.w("MaterialDialog", "Calling setProgress(int) on an indeterminate progress dialog has no effect!");
        } else {
            this.f4801l.setProgress(i6);
            this.f4793d.post(new RunnableC5887c());
        }
    }

    /* renamed from: u */
    public final void m4603u(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    /* renamed from: v */
    public final void m4604v(DialogInterface dialogInterface, C5891g c5891g) {
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m4592j() == null) {
            return;
        }
        materialDialog.m4592j().post(new RunnableC5889e(materialDialog, c5891g));
    }

    /* renamed from: w */
    public final void m4605w() {
        super.show();
    }

    @Override // p003a2.AbstractDialogC0008a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i6) {
        setTitle(this.f4792c.f4859a.getString(i6));
    }

    @Override // p003a2.AbstractDialogC0008a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
