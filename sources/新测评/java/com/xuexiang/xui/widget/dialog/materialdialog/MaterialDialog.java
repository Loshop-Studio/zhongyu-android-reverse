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
import com.xuexiang.xui.utils.AbstractC6480e;
import com.xuexiang.xui.utils.AbstractC6481f;
import com.xuexiang.xui.utils.AbstractC6482g;
import com.xuexiang.xui.widget.dialog.materialdialog.C6513a;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p005a3.AbstractC0019b;
import p005a3.C0020c;
import p022b3.AbstractC4980a;
import p186o2.AbstractC8697b;
import p303z2.AbstractDialogC9975a;

/* loaded from: classes4.dex */
public class MaterialDialog extends AbstractDialogC9975a implements View.OnClickListener, C6513a.c {

    /* renamed from: c */
    public final C6512f f6068c;

    /* renamed from: d */
    public final Handler f6069d;

    /* renamed from: e */
    public ImageView f6070e;

    /* renamed from: f */
    public TextView f6071f;

    /* renamed from: g */
    public TextView f6072g;

    /* renamed from: h */
    public EditText f6073h;

    /* renamed from: i */
    public RecyclerView f6074i;

    /* renamed from: j */
    public View f6075j;

    /* renamed from: k */
    public FrameLayout f6076k;

    /* renamed from: l */
    public ProgressBar f6077l;

    /* renamed from: m */
    public TextView f6078m;

    /* renamed from: n */
    public TextView f6079n;

    /* renamed from: o */
    public TextView f6080o;

    /* renamed from: p */
    public CheckBox f6081p;

    /* renamed from: q */
    public MDButton f6082q;

    /* renamed from: r */
    public MDButton f6083r;

    /* renamed from: s */
    public MDButton f6084s;

    /* renamed from: t */
    public ListType f6085t;

    /* renamed from: u */
    public List f6086u;

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
        public static int m5593a(ListType listType) {
            int i10 = C6511e.f6100b[listType.ordinal()];
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
    public class ViewTreeObserverOnGlobalLayoutListenerC6507a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$a$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f6092a;

            public a(int i10) {
                this.f6092a = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                MaterialDialog.this.f6074i.requestFocus();
                MaterialDialog.this.f6068c.f6124Q.scrollToPosition(this.f6092a);
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC6507a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int iIntValue;
            MaterialDialog.this.f6074i.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            MaterialDialog materialDialog = MaterialDialog.this;
            ListType listType = materialDialog.f6085t;
            ListType listType2 = ListType.SINGLE;
            if (listType == listType2 || listType == ListType.MULTI) {
                if (listType == listType2) {
                    iIntValue = materialDialog.f6068c.f6113G;
                    if (iIntValue < 0) {
                        return;
                    }
                } else {
                    List list = materialDialog.f6086u;
                    if (list == null || list.size() == 0) {
                        return;
                    }
                    Collections.sort(MaterialDialog.this.f6086u);
                    iIntValue = ((Integer) MaterialDialog.this.f6086u.get(0)).intValue();
                }
                MaterialDialog.this.f6074i.post(new a(iIntValue));
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$b */
    public class C6508b implements AbstractC6481f.a {
        public C6508b() {
        }

        @Override // com.xuexiang.xui.utils.AbstractC6481f.a
        /* renamed from: a */
        public void mo5369a(Window window) {
            MaterialDialog.this.m5592t();
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$c */
    public class C6509c implements TextWatcher {
        public C6509c() {
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
            if (!materialDialog.f6068c.f6147g0) {
                z = length == 0;
                materialDialog.m5578f(DialogAction.POSITIVE).setEnabled(!z);
            }
            MaterialDialog.this.m5585m(length, z);
            C6512f c6512f = MaterialDialog.this.f6068c;
            if (c6512f.f6151i0) {
                c6512f.getClass();
                throw null;
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$d */
    public class RunnableC6510d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ MaterialDialog f6096a;

        /* renamed from: b */
        public final /* synthetic */ C6512f f6097b;

        public RunnableC6510d(MaterialDialog materialDialog, C6512f c6512f) {
            this.f6096a = materialDialog;
            this.f6097b = c6512f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6096a.m5581i().requestFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) this.f6097b.m5597d().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(this.f6096a.m5581i(), 1);
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$e */
    public static /* synthetic */ class C6511e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6099a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f6100b;

        static {
            int[] iArr = new int[ListType.values().length];
            f6100b = iArr;
            try {
                iArr[ListType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6100b[ListType.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6100b[ListType.MULTI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[DialogAction.values().length];
            f6099a = iArr2;
            try {
                iArr2[DialogAction.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6099a[DialogAction.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6099a[DialogAction.POSITIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: com.xuexiang.xui.widget.dialog.materialdialog.MaterialDialog$f */
    public static class C6512f {

        /* renamed from: A */
        public boolean f6101A;

        /* renamed from: A0 */
        public boolean f6102A0;

        /* renamed from: B */
        public Theme f6103B;

        /* renamed from: B0 */
        public int f6104B0;

        /* renamed from: C */
        public int f6105C;

        /* renamed from: C0 */
        public int f6106C0;

        /* renamed from: D */
        public boolean f6107D;

        /* renamed from: D0 */
        public int f6108D0;

        /* renamed from: E */
        public boolean f6109E;

        /* renamed from: E0 */
        public int f6110E0;

        /* renamed from: F */
        public float f6111F;

        /* renamed from: F0 */
        public int f6112F0;

        /* renamed from: G */
        public int f6113G;

        /* renamed from: G0 */
        public boolean f6114G0;

        /* renamed from: H */
        public Integer[] f6115H;

        /* renamed from: I */
        public Integer[] f6116I;

        /* renamed from: J */
        public boolean f6117J;

        /* renamed from: K */
        public Typeface f6118K;

        /* renamed from: L */
        public Typeface f6119L;

        /* renamed from: M */
        public Drawable f6120M;

        /* renamed from: N */
        public boolean f6121N;

        /* renamed from: O */
        public int f6122O;

        /* renamed from: P */
        public RecyclerView.Adapter f6123P;

        /* renamed from: Q */
        public RecyclerView.LayoutManager f6124Q;

        /* renamed from: R */
        public DialogInterface.OnDismissListener f6125R;

        /* renamed from: S */
        public DialogInterface.OnCancelListener f6126S;

        /* renamed from: T */
        public DialogInterface.OnKeyListener f6127T;

        /* renamed from: U */
        public DialogInterface.OnShowListener f6128U;

        /* renamed from: V */
        public StackingBehavior f6129V;

        /* renamed from: W */
        public boolean f6130W;

        /* renamed from: X */
        public int f6131X;

        /* renamed from: Y */
        public int f6132Y;

        /* renamed from: Z */
        public int f6133Z;

        /* renamed from: a */
        public final Context f6134a;

        /* renamed from: a0 */
        public boolean f6135a0;

        /* renamed from: b */
        public CharSequence f6136b;

        /* renamed from: b0 */
        public boolean f6137b0;

        /* renamed from: c */
        public GravityEnum f6138c;

        /* renamed from: c0 */
        public int f6139c0;

        /* renamed from: d */
        public GravityEnum f6140d;

        /* renamed from: d0 */
        public int f6141d0;

        /* renamed from: e */
        public GravityEnum f6142e;

        /* renamed from: e0 */
        public CharSequence f6143e0;

        /* renamed from: f */
        public GravityEnum f6144f;

        /* renamed from: f0 */
        public CharSequence f6145f0;

        /* renamed from: g */
        public GravityEnum f6146g;

        /* renamed from: g0 */
        public boolean f6147g0;

        /* renamed from: h */
        public int f6148h;

        /* renamed from: h0 */
        public int f6149h0;

        /* renamed from: i */
        public int f6150i;

        /* renamed from: i0 */
        public boolean f6151i0;

        /* renamed from: j */
        public int f6152j;

        /* renamed from: j0 */
        public int f6153j0;

        /* renamed from: k */
        public CharSequence f6154k;

        /* renamed from: k0 */
        public int f6155k0;

        /* renamed from: l */
        public ArrayList f6156l;

        /* renamed from: l0 */
        public int f6157l0;

        /* renamed from: m */
        public CharSequence f6158m;

        /* renamed from: m0 */
        public int[] f6159m0;

        /* renamed from: n */
        public CharSequence f6160n;

        /* renamed from: n0 */
        public CharSequence f6161n0;

        /* renamed from: o */
        public CharSequence f6162o;

        /* renamed from: o0 */
        public boolean f6163o0;

        /* renamed from: p */
        public boolean f6164p;

        /* renamed from: p0 */
        public CompoundButton.OnCheckedChangeListener f6165p0;

        /* renamed from: q */
        public boolean f6166q;

        /* renamed from: q0 */
        public String f6167q0;

        /* renamed from: r */
        public boolean f6168r;

        /* renamed from: r0 */
        public NumberFormat f6169r0;

        /* renamed from: s */
        public View f6170s;

        /* renamed from: s0 */
        public boolean f6171s0;

        /* renamed from: t */
        public int f6172t;

        /* renamed from: t0 */
        public boolean f6173t0;

        /* renamed from: u */
        public ColorStateList f6174u;

        /* renamed from: u0 */
        public boolean f6175u0;

        /* renamed from: v */
        public ColorStateList f6176v;

        /* renamed from: v0 */
        public boolean f6177v0;

        /* renamed from: w */
        public ColorStateList f6178w;

        /* renamed from: w0 */
        public boolean f6179w0;

        /* renamed from: x */
        public ColorStateList f6180x;

        /* renamed from: x0 */
        public boolean f6181x0;

        /* renamed from: y */
        public ColorStateList f6182y;

        /* renamed from: y0 */
        public boolean f6183y0;

        /* renamed from: z */
        public boolean f6184z;

        /* renamed from: z0 */
        public boolean f6185z0;

        public C6512f(Context context) {
            GravityEnum gravityEnum = GravityEnum.START;
            this.f6138c = gravityEnum;
            this.f6140d = gravityEnum;
            this.f6142e = GravityEnum.END;
            this.f6144f = gravityEnum;
            this.f6146g = gravityEnum;
            this.f6148h = 0;
            this.f6150i = -1;
            this.f6152j = -1;
            this.f6184z = false;
            this.f6101A = false;
            Theme theme = Theme.LIGHT;
            this.f6103B = theme;
            this.f6105C = -1;
            this.f6107D = true;
            this.f6109E = true;
            this.f6111F = 1.2f;
            this.f6113G = -1;
            this.f6115H = null;
            this.f6116I = null;
            this.f6117J = true;
            this.f6122O = -1;
            this.f6139c0 = -2;
            this.f6141d0 = 0;
            this.f6149h0 = -1;
            this.f6153j0 = -1;
            this.f6155k0 = -1;
            this.f6157l0 = 0;
            this.f6173t0 = false;
            this.f6175u0 = false;
            this.f6177v0 = false;
            this.f6179w0 = false;
            this.f6181x0 = false;
            this.f6183y0 = false;
            this.f6185z0 = false;
            this.f6102A0 = false;
            this.f6134a = context;
            int iM5383n = AbstractC6482g.m5383n(context, R$attr.colorAccent, AbstractC6482g.m5372c(context, R$color.md_material_blue_600));
            this.f6172t = iM5383n;
            int iM5383n2 = AbstractC6482g.m5383n(context, R.attr.colorAccent, iM5383n);
            this.f6172t = iM5383n2;
            this.f6176v = AbstractC6482g.m5371b(context, iM5383n2);
            this.f6178w = AbstractC6482g.m5371b(context, this.f6172t);
            this.f6180x = AbstractC6482g.m5371b(context, this.f6172t);
            this.f6182y = AbstractC6482g.m5371b(context, AbstractC6482g.m5383n(context, R$attr.md_link_color, this.f6172t));
            this.f6148h = AbstractC6482g.m5383n(context, R$attr.md_btn_ripple_color, AbstractC6482g.m5383n(context, R$attr.colorControlHighlight, AbstractC6482g.m5382m(context, R.attr.colorControlHighlight)));
            this.f6169r0 = NumberFormat.getPercentInstance();
            this.f6167q0 = "%1d/%2d";
            this.f6103B = AbstractC6482g.m5377h(AbstractC6482g.m5382m(context, R.attr.textColorPrimary)) ? theme : Theme.DARK;
            m5595b();
            this.f6138c = AbstractC6482g.m5389t(context, R$attr.md_title_gravity, this.f6138c);
            this.f6140d = AbstractC6482g.m5389t(context, R$attr.md_content_gravity, this.f6140d);
            this.f6142e = AbstractC6482g.m5389t(context, R$attr.md_btnstacked_gravity, this.f6142e);
            this.f6144f = AbstractC6482g.m5389t(context, R$attr.md_items_gravity, this.f6144f);
            this.f6146g = AbstractC6482g.m5389t(context, R$attr.md_buttons_gravity, this.f6146g);
            try {
                m5602i(AbstractC6482g.m5390u(context, R$attr.md_medium_font, AbstractC8697b.m14300b()), AbstractC6482g.m5390u(context, R$attr.md_regular_font, AbstractC8697b.m14300b()));
            } catch (Throwable unused) {
            }
            if (this.f6119L == null) {
                try {
                    this.f6119L = Typeface.create("sans-serif-medium", 0);
                } catch (Throwable unused2) {
                    this.f6119L = Typeface.DEFAULT_BOLD;
                }
            }
            if (this.f6118K == null) {
                try {
                    this.f6118K = Typeface.create("sans-serif", 0);
                } catch (Throwable unused3) {
                    Typeface typeface = Typeface.SANS_SERIF;
                    this.f6118K = typeface;
                    if (typeface == null) {
                        this.f6118K = Typeface.DEFAULT;
                    }
                }
            }
        }

        /* renamed from: a */
        public MaterialDialog m5594a() {
            return new MaterialDialog(this);
        }

        /* renamed from: b */
        public final void m5595b() {
            if (C0020c.m61b(false) == null) {
                return;
            }
            C0020c c0020cM60a = C0020c.m60a();
            if (c0020cM60a.f35a) {
                this.f6103B = Theme.DARK;
            }
            int i10 = c0020cM60a.f36b;
            if (i10 != 0) {
                this.f6150i = i10;
            }
            int i11 = c0020cM60a.f37c;
            if (i11 != 0) {
                this.f6152j = i11;
            }
            ColorStateList colorStateList = c0020cM60a.f38d;
            if (colorStateList != null) {
                this.f6176v = colorStateList;
            }
            ColorStateList colorStateList2 = c0020cM60a.f39e;
            if (colorStateList2 != null) {
                this.f6180x = colorStateList2;
            }
            ColorStateList colorStateList3 = c0020cM60a.f40f;
            if (colorStateList3 != null) {
                this.f6178w = colorStateList3;
            }
            int i12 = c0020cM60a.f42h;
            if (i12 != 0) {
                this.f6133Z = i12;
            }
            Drawable drawable = c0020cM60a.f43i;
            if (drawable != null) {
                this.f6120M = drawable;
            }
            int i13 = c0020cM60a.f44j;
            if (i13 != 0) {
                this.f6132Y = i13;
            }
            int i14 = c0020cM60a.f45k;
            if (i14 != 0) {
                this.f6131X = i14;
            }
            int i15 = c0020cM60a.f48n;
            if (i15 != 0) {
                this.f6106C0 = i15;
            }
            int i16 = c0020cM60a.f47m;
            if (i16 != 0) {
                this.f6104B0 = i16;
            }
            int i17 = c0020cM60a.f49o;
            if (i17 != 0) {
                this.f6108D0 = i17;
            }
            int i18 = c0020cM60a.f50p;
            if (i18 != 0) {
                this.f6110E0 = i18;
            }
            int i19 = c0020cM60a.f51q;
            if (i19 != 0) {
                this.f6112F0 = i19;
            }
            int i20 = c0020cM60a.f41g;
            if (i20 != 0) {
                this.f6172t = i20;
            }
            ColorStateList colorStateList4 = c0020cM60a.f46l;
            if (colorStateList4 != null) {
                this.f6182y = colorStateList4;
            }
            this.f6138c = c0020cM60a.f52r;
            this.f6140d = c0020cM60a.f53s;
            this.f6142e = c0020cM60a.f54t;
            this.f6144f = c0020cM60a.f55u;
            this.f6146g = c0020cM60a.f56v;
        }

        /* renamed from: c */
        public C6512f m5596c(CharSequence charSequence) {
            if (this.f6170s != null) {
                throw new IllegalStateException("You cannot set content() when you're using a custom view.");
            }
            this.f6154k = charSequence;
            return this;
        }

        /* renamed from: d */
        public final Context m5597d() {
            return this.f6134a;
        }

        /* renamed from: e */
        public C6512f m5598e() {
            this.f6121N = true;
            return this;
        }

        /* renamed from: f */
        public C6512f m5599f(boolean z9, int i10) {
            if (this.f6170s != null) {
                throw new IllegalStateException("You cannot set progress() when you're using a custom view.");
            }
            if (z9) {
                this.f6135a0 = true;
                this.f6139c0 = -2;
                return this;
            }
            this.f6171s0 = false;
            this.f6135a0 = false;
            this.f6139c0 = -1;
            this.f6141d0 = i10;
            return this;
        }

        /* renamed from: g */
        public C6512f m5600g(boolean z9) {
            this.f6171s0 = z9;
            return this;
        }

        /* renamed from: h */
        public C6512f m5601h(CharSequence charSequence) {
            this.f6136b = charSequence;
            return this;
        }

        /* renamed from: i */
        public C6512f m5602i(String str, String str2) {
            if (str != null && !str.trim().isEmpty()) {
                Typeface typefaceM14302d = AbstractC8697b.m14302d(str);
                this.f6119L = typefaceM14302d;
                if (typefaceM14302d == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str + "\"");
                }
            }
            if (str2 != null && !str2.trim().isEmpty()) {
                Typeface typefaceM14302d2 = AbstractC8697b.m14302d(str2);
                this.f6118K = typefaceM14302d2;
                if (typefaceM14302d2 == null) {
                    throw new IllegalArgumentException("No font asset found for \"" + str2 + "\"");
                }
            }
            return this;
        }
    }

    public MaterialDialog(C6512f c6512f) throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, SecurityException, IllegalArgumentException {
        super(c6512f.f6134a, AbstractC6514b.m5612c(c6512f));
        this.f6069d = new Handler(Looper.getMainLooper());
        this.f6068c = c6512f;
        this.f17831a = (MDRootLayout) LayoutInflater.from(c6512f.f6134a).inflate(AbstractC6514b.m5611b(c6512f), (ViewGroup) null);
        AbstractC6514b.m5613d(this);
    }

    @Override // com.xuexiang.xui.widget.dialog.materialdialog.C6513a.c
    /* renamed from: a */
    public boolean mo5576a(MaterialDialog materialDialog, View view, int i10, CharSequence charSequence, boolean z9) {
        boolean zM5588p = false;
        if (!view.isEnabled()) {
            return false;
        }
        ListType listType = this.f6085t;
        if (listType == null || listType == ListType.REGULAR) {
            if (this.f6068c.f6117J) {
                dismiss();
            }
            if (!z9) {
                this.f6068c.getClass();
            }
            if (z9) {
                this.f6068c.getClass();
            }
        } else if (listType == ListType.MULTI) {
            CheckBox checkBox = (CheckBox) view.findViewById(R$id.md_control);
            if (!checkBox.isEnabled()) {
                return false;
            }
            if (this.f6086u.contains(Integer.valueOf(i10))) {
                this.f6086u.remove(Integer.valueOf(i10));
                if (!this.f6068c.f6184z || m5587o()) {
                    checkBox.setChecked(false);
                } else {
                    this.f6086u.add(Integer.valueOf(i10));
                }
            } else {
                this.f6086u.add(Integer.valueOf(i10));
                if (!this.f6068c.f6184z || m5587o()) {
                    checkBox.setChecked(true);
                } else {
                    this.f6086u.remove(Integer.valueOf(i10));
                }
            }
        } else if (listType == ListType.SINGLE) {
            RadioButton radioButton = (RadioButton) view.findViewById(R$id.md_control);
            if (!radioButton.isEnabled()) {
                return false;
            }
            C6512f c6512f = this.f6068c;
            int i11 = c6512f.f6113G;
            if (c6512f.f6117J && c6512f.f6158m == null) {
                dismiss();
                this.f6068c.f6113G = i10;
                m5588p(view);
            } else if (c6512f.f6101A) {
                c6512f.f6113G = i10;
                zM5588p = m5588p(view);
                this.f6068c.f6113G = i11;
            } else {
                zM5588p = true;
            }
            if (zM5588p) {
                this.f6068c.f6113G = i10;
                radioButton.setChecked(true);
                this.f6068c.f6123P.notifyItemChanged(i11);
                this.f6068c.f6123P.notifyItemChanged(i10);
            }
        }
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f6073h != null) {
            m5584l(this, this.f6068c);
        }
        super.dismiss();
    }

    /* renamed from: e */
    public final void m5577e() {
        RecyclerView recyclerView = this.f6074i;
        if (recyclerView == null) {
            return;
        }
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC6507a());
    }

    /* renamed from: f */
    public final MDButton m5578f(DialogAction dialogAction) {
        int i10 = C6511e.f6099a[dialogAction.ordinal()];
        return i10 != 1 ? i10 != 2 ? this.f6082q : this.f6084s : this.f6083r;
    }

    @Override // p303z2.AbstractDialogC9975a, android.app.Dialog
    public /* bridge */ /* synthetic */ View findViewById(int i10) {
        return super.findViewById(i10);
    }

    /* renamed from: g */
    public final C6512f m5579g() {
        return this.f6068c;
    }

    /* renamed from: h */
    public Drawable m5580h(DialogAction dialogAction, boolean z9) {
        if (z9) {
            C6512f c6512f = this.f6068c;
            int i10 = c6512f.f6106C0;
            if (i10 != 0) {
                return AbstractC6480e.m5360f(c6512f.f6134a, i10);
            }
            Context context = c6512f.f6134a;
            int i11 = R$attr.md_btn_stacked_selector;
            Drawable drawableM5386q = AbstractC6482g.m5386q(context, i11);
            return drawableM5386q != null ? drawableM5386q : AbstractC6482g.m5386q(getContext(), i11);
        }
        int i12 = C6511e.f6099a[dialogAction.ordinal()];
        if (i12 == 1) {
            C6512f c6512f2 = this.f6068c;
            int i13 = c6512f2.f6110E0;
            if (i13 != 0) {
                return AbstractC6480e.m5360f(c6512f2.f6134a, i13);
            }
            Context context2 = c6512f2.f6134a;
            int i14 = R$attr.md_btn_neutral_selector;
            Drawable drawableM5386q2 = AbstractC6482g.m5386q(context2, i14);
            if (drawableM5386q2 != null) {
                return drawableM5386q2;
            }
            Drawable drawableM5386q3 = AbstractC6482g.m5386q(getContext(), i14);
            AbstractC4980a.m2460a(drawableM5386q3, this.f6068c.f6148h);
            return drawableM5386q3;
        }
        if (i12 != 2) {
            C6512f c6512f3 = this.f6068c;
            int i15 = c6512f3.f6108D0;
            if (i15 != 0) {
                return AbstractC6480e.m5360f(c6512f3.f6134a, i15);
            }
            Context context3 = c6512f3.f6134a;
            int i16 = R$attr.md_btn_positive_selector;
            Drawable drawableM5386q4 = AbstractC6482g.m5386q(context3, i16);
            if (drawableM5386q4 != null) {
                return drawableM5386q4;
            }
            Drawable drawableM5386q5 = AbstractC6482g.m5386q(getContext(), i16);
            AbstractC4980a.m2460a(drawableM5386q5, this.f6068c.f6148h);
            return drawableM5386q5;
        }
        C6512f c6512f4 = this.f6068c;
        int i17 = c6512f4.f6112F0;
        if (i17 != 0) {
            return AbstractC6480e.m5360f(c6512f4.f6134a, i17);
        }
        Context context4 = c6512f4.f6134a;
        int i18 = R$attr.md_btn_negative_selector;
        Drawable drawableM5386q6 = AbstractC6482g.m5386q(context4, i18);
        if (drawableM5386q6 != null) {
            return drawableM5386q6;
        }
        Drawable drawableM5386q7 = AbstractC6482g.m5386q(getContext(), i18);
        AbstractC4980a.m2460a(drawableM5386q7, this.f6068c.f6148h);
        return drawableM5386q7;
    }

    /* renamed from: i */
    public final EditText m5581i() {
        return this.f6073h;
    }

    /* renamed from: j */
    public final Drawable m5582j() {
        C6512f c6512f = this.f6068c;
        int i10 = c6512f.f6104B0;
        if (i10 != 0) {
            return AbstractC6480e.m5360f(c6512f.f6134a, i10);
        }
        Context context = c6512f.f6134a;
        int i11 = R$attr.md_list_selector;
        Drawable drawableM5386q = AbstractC6482g.m5386q(context, i11);
        return drawableM5386q != null ? drawableM5386q : AbstractC6482g.m5386q(getContext(), i11);
    }

    /* renamed from: k */
    public final View m5583k() {
        return this.f17831a;
    }

    /* renamed from: l */
    public final void m5584l(DialogInterface dialogInterface, C6512f c6512f) {
        InputMethodManager inputMethodManager;
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m5581i() == null || (inputMethodManager = (InputMethodManager) c6512f.m5597d().getSystemService("input_method")) == null) {
            return;
        }
        View currentFocus = materialDialog.getCurrentFocus();
        IBinder windowToken = currentFocus != null ? currentFocus.getWindowToken() : materialDialog.m5583k().getWindowToken();
        if (windowToken != null) {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: m */
    public void m5585m(int i10, boolean z9) {
        C6512f c6512f;
        int i11;
        TextView textView = this.f6080o;
        if (textView != null) {
            if (this.f6068c.f6155k0 > 0) {
                textView.setText(String.format(Locale.getDefault(), "%d/%d", Integer.valueOf(i10), Integer.valueOf(this.f6068c.f6155k0)));
                this.f6080o.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            boolean z10 = (z9 && i10 == 0) || ((i11 = (c6512f = this.f6068c).f6155k0) > 0 && i10 > i11) || i10 < c6512f.f6153j0;
            C6512f c6512f2 = this.f6068c;
            int i12 = z10 ? c6512f2.f6157l0 : c6512f2.f6152j;
            C6512f c6512f3 = this.f6068c;
            int i13 = z10 ? c6512f3.f6157l0 : c6512f3.f6172t;
            if (this.f6068c.f6155k0 > 0) {
                this.f6080o.setTextColor(i12);
            }
            AbstractC0019b.m57e(this.f6073h, i13);
            m5578f(DialogAction.POSITIVE).setEnabled(!z10);
        }
    }

    /* renamed from: n */
    public final void m5586n() {
        if (this.f6074i == null) {
            return;
        }
        ArrayList arrayList = this.f6068c.f6156l;
        if ((arrayList == null || arrayList.size() == 0) && this.f6068c.f6123P == null) {
            return;
        }
        C6512f c6512f = this.f6068c;
        if (c6512f.f6124Q == null) {
            c6512f.f6124Q = new LinearLayoutManager(getContext());
        }
        if (this.f6074i.getLayoutManager() == null) {
            this.f6074i.setLayoutManager(this.f6068c.f6124Q);
        }
        this.f6074i.setAdapter(this.f6068c.f6123P);
        if (this.f6085t != null) {
            ((C6513a) this.f6068c.f6123P).m5608g(this);
        }
    }

    /* renamed from: o */
    public final boolean m5587o() {
        this.f6068c.getClass();
        return false;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = C6511e.f6099a[((DialogAction) view.getTag()).ordinal()];
        if (i10 == 1) {
            this.f6068c.getClass();
            this.f6068c.getClass();
            if (this.f6068c.f6117J) {
                dismiss();
            }
        } else if (i10 == 2) {
            this.f6068c.getClass();
            this.f6068c.getClass();
            if (this.f6068c.f6117J) {
                cancel();
            }
        } else if (i10 == 3) {
            this.f6068c.getClass();
            this.f6068c.getClass();
            if (!this.f6068c.f6101A) {
                m5588p(view);
            }
            if (!this.f6068c.f6184z) {
                m5587o();
            }
            this.f6068c.getClass();
            if (this.f6068c.f6117J) {
                dismiss();
            }
        }
        this.f6068c.getClass();
    }

    @Override // p303z2.AbstractDialogC9975a, android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.f6073h != null) {
            m5591s(this, this.f6068c);
            if (this.f6073h.getText().length() > 0) {
                EditText editText = this.f6073h;
                editText.setSelection(editText.getText().length());
            }
        }
        super.onShow(dialogInterface);
    }

    @Override // p303z2.AbstractDialogC9975a, android.app.Dialog
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    public final boolean m5588p(View view) {
        this.f6068c.getClass();
        return false;
    }

    /* renamed from: q */
    public void m5589q() {
        EditText editText = this.f6073h;
        if (editText == null) {
            return;
        }
        editText.addTextChangedListener(new C6509c());
    }

    /* renamed from: r */
    public final void m5590r(TextView textView, Typeface typeface) {
        if (typeface == null) {
            return;
        }
        textView.setPaintFlags(textView.getPaintFlags() | 128);
        textView.setTypeface(typeface);
    }

    /* renamed from: s */
    public final void m5591s(DialogInterface dialogInterface, C6512f c6512f) {
        MaterialDialog materialDialog = (MaterialDialog) dialogInterface;
        if (materialDialog.m5581i() == null) {
            return;
        }
        materialDialog.m5581i().post(new RunnableC6510d(materialDialog, c6512f));
    }

    @Override // p303z2.AbstractDialogC9975a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(int i10) {
        super.setContentView(i10);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f6071f.setText(charSequence);
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            if (this.f6068c.f6114G0) {
                AbstractC6481f.m5366c(getWindow(), new C6508b());
            } else {
                m5592t();
            }
        } catch (WindowManager.BadTokenException unused) {
            throw new DialogException("Bad window token, you cannot show a dialog before an Activity is created or after it's hidden.");
        }
    }

    /* renamed from: t */
    public final void m5592t() {
        super.show();
    }

    @Override // p303z2.AbstractDialogC9975a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view) {
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i10) {
        setTitle(this.f6068c.f6134a.getString(i10));
    }

    @Override // p303z2.AbstractDialogC9975a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
