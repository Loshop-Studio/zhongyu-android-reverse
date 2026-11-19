package p242s4;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.xuexiang.xui.R$color;
import com.xuexiang.xui.R$drawable;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;

/* renamed from: s4.b */
/* loaded from: classes4.dex */
public abstract class AbstractC9472b {

    /* renamed from: a */
    public static Toast f16514a;

    /* renamed from: s4.b$a */
    public static class a {

        /* renamed from: i */
        public static volatile a f16515i;

        /* renamed from: j */
        public static final Typeface f16516j = Typeface.create("sans-serif-condensed", 0);

        /* renamed from: a */
        public Typeface f16517a = f16516j;

        /* renamed from: b */
        public int f16518b = -1;

        /* renamed from: c */
        public boolean f16519c = true;

        /* renamed from: d */
        public boolean f16520d = true;

        /* renamed from: e */
        public int f16521e = -1;

        /* renamed from: f */
        public int f16522f = -1;

        /* renamed from: g */
        public int f16523g = 0;

        /* renamed from: h */
        public int f16524h = 0;

        /* renamed from: j */
        public static a m15692j() {
            if (f16515i == null) {
                synchronized (a.class) {
                    try {
                        if (f16515i == null) {
                            f16515i = new a();
                        }
                    } finally {
                    }
                }
            }
            return f16515i;
        }

        /* renamed from: i */
        public a m15693i(boolean z9) {
            this.f16520d = z9;
            return this;
        }

        /* renamed from: k */
        public a m15694k(int i9) {
            this.f16521e = i9;
            return this;
        }

        /* renamed from: l */
        public a m15695l(int i9) {
            this.f16522f = i9;
            return this;
        }
    }

    /* renamed from: a */
    public static Toast m15658a(Context context, CharSequence charSequence, Drawable drawable, int i9, int i10, int i11, boolean z9, boolean z10) {
        Toast toastMakeText = Toast.makeText(context, "", i11);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.xui_layout_xtoast, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(R$id.toast_text);
        AbstractC9471a.m15655c(viewInflate, z10 ? AbstractC9471a.m15656d(context, i9) : AbstractC9471a.m15654b(context, R$drawable.xtoast_frame));
        if (!z9) {
            imageView.setVisibility(8);
        } else {
            if (drawable == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            if (a.m15692j().f16519c) {
                drawable = AbstractC9471a.m15657e(drawable, i10);
            }
            AbstractC9471a.m15655c(imageView, drawable);
        }
        textView.setText(charSequence);
        textView.setTextColor(i10);
        textView.setTypeface(a.m15692j().f16517a, 0);
        if (a.m15692j().f16518b != -1) {
            textView.setTextSize(2, a.m15692j().f16518b);
        }
        if (a.m15692j().f16521e != -1) {
            viewInflate.getBackground().setAlpha(a.m15692j().f16521e);
        }
        toastMakeText.setView(viewInflate);
        if (!a.m15692j().f16520d) {
            Toast toast = f16514a;
            if (toast != null) {
                toast.cancel();
            }
            f16514a = toastMakeText;
        }
        if (a.m15692j().f16522f != -1) {
            toastMakeText.setGravity(a.m15692j().f16522f, a.m15692j().f16523g, a.m15692j().f16524h);
        }
        return toastMakeText;
    }

    /* renamed from: b */
    public static Toast m15659b(Context context, int i9) {
        return m15663f(context, context.getString(i9), 0, true);
    }

    /* renamed from: c */
    public static Toast m15660c(Context context, int i9, int i10) {
        return m15663f(context, context.getString(i9), i10, true);
    }

    /* renamed from: d */
    public static Toast m15661d(Context context, CharSequence charSequence) {
        return m15663f(context, charSequence, 0, true);
    }

    /* renamed from: e */
    public static Toast m15662e(Context context, CharSequence charSequence, int i9) {
        return m15663f(context, charSequence, i9, true);
    }

    /* renamed from: f */
    public static Toast m15663f(Context context, CharSequence charSequence, int i9, boolean z9) {
        return m15658a(context, charSequence, AbstractC9471a.m15654b(context, R$drawable.xtoast_ic_clear_white_24dp), AbstractC9471a.m15653a(context, R$color.toast_error_color), AbstractC9471a.m15653a(context, R$color.toast_default_text_color), i9, z9, true);
    }

    /* renamed from: g */
    public static Toast m15664g(Context context, int i9) {
        return m15668k(context, context.getString(i9), 0, true);
    }

    /* renamed from: h */
    public static Toast m15665h(Context context, int i9, int i10) {
        return m15668k(context, context.getString(i9), i10, true);
    }

    /* renamed from: i */
    public static Toast m15666i(Context context, CharSequence charSequence) {
        return m15668k(context, charSequence, 0, true);
    }

    /* renamed from: j */
    public static Toast m15667j(Context context, CharSequence charSequence, int i9) {
        return m15668k(context, charSequence, i9, true);
    }

    /* renamed from: k */
    public static Toast m15668k(Context context, CharSequence charSequence, int i9, boolean z9) {
        return m15658a(context, charSequence, AbstractC9471a.m15654b(context, R$drawable.xtoast_ic_info_outline_white_24dp), AbstractC9471a.m15653a(context, R$color.toast_info_color), AbstractC9471a.m15653a(context, R$color.toast_default_text_color), i9, z9, true);
    }

    /* renamed from: l */
    public static Toast m15669l(Context context, int i9) {
        return m15673p(context, context.getString(i9), 0, null, false);
    }

    /* renamed from: m */
    public static Toast m15670m(Context context, int i9, int i10) {
        return m15673p(context, context.getString(i9), i10, null, false);
    }

    /* renamed from: n */
    public static Toast m15671n(Context context, CharSequence charSequence) {
        return m15673p(context, charSequence, 0, null, false);
    }

    /* renamed from: o */
    public static Toast m15672o(Context context, CharSequence charSequence, int i9) {
        return m15673p(context, charSequence, i9, null, false);
    }

    /* renamed from: p */
    public static Toast m15673p(Context context, CharSequence charSequence, int i9, Drawable drawable, boolean z9) {
        return m15658a(context, charSequence, drawable, AbstractC9471a.m15653a(context, R$color.toast_normal_tint_color), AbstractC9471a.m15653a(context, R$color.toast_default_text_color), i9, z9, true);
    }

    /* renamed from: q */
    public static Toast m15674q(Context context, int i9) {
        return m15678u(context, context.getString(i9), 0, true);
    }

    /* renamed from: r */
    public static Toast m15675r(Context context, int i9, int i10) {
        return m15678u(context, context.getString(i9), i10, true);
    }

    /* renamed from: s */
    public static Toast m15676s(Context context, CharSequence charSequence) {
        return m15678u(context, charSequence, 0, true);
    }

    /* renamed from: t */
    public static Toast m15677t(Context context, CharSequence charSequence, int i9) {
        return m15678u(context, charSequence, i9, true);
    }

    /* renamed from: u */
    public static Toast m15678u(Context context, CharSequence charSequence, int i9, boolean z9) {
        return m15658a(context, charSequence, AbstractC9471a.m15654b(context, R$drawable.xtoast_ic_check_white_24dp), AbstractC9471a.m15653a(context, R$color.toast_success_color), AbstractC9471a.m15653a(context, R$color.toast_default_text_color), i9, z9, true);
    }

    /* renamed from: v */
    public static Toast m15679v(Context context, int i9) {
        return m15683z(context, context.getString(i9), 0, true);
    }

    /* renamed from: w */
    public static Toast m15680w(Context context, int i9, int i10) {
        return m15683z(context, context.getString(i9), i10, true);
    }

    /* renamed from: x */
    public static Toast m15681x(Context context, CharSequence charSequence) {
        return m15683z(context, charSequence, 0, true);
    }

    /* renamed from: y */
    public static Toast m15682y(Context context, CharSequence charSequence, int i9) {
        return m15683z(context, charSequence, i9, true);
    }

    /* renamed from: z */
    public static Toast m15683z(Context context, CharSequence charSequence, int i9, boolean z9) {
        return m15658a(context, charSequence, AbstractC9471a.m15654b(context, R$drawable.xtoast_ic_error_outline_white_24dp), AbstractC9471a.m15653a(context, R$color.toast_warning_color), AbstractC9471a.m15653a(context, R$color.toast_default_text_color), i9, z9, true);
    }
}
