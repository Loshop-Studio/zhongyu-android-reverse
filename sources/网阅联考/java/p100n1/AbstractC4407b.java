package p100n1;

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

/* renamed from: n1.b */
/* loaded from: classes2.dex */
public abstract class AbstractC4407b {

    /* renamed from: a */
    public static Toast f4936a;

    /* renamed from: n1.b$a */
    public static class a {

        /* renamed from: i */
        public static volatile a f4937i;

        /* renamed from: j */
        public static final Typeface f4938j = Typeface.create("sans-serif-condensed", 0);

        /* renamed from: a */
        public Typeface f4939a = f4938j;

        /* renamed from: b */
        public int f4940b = -1;

        /* renamed from: c */
        public boolean f4941c = true;

        /* renamed from: d */
        public boolean f4942d = true;

        /* renamed from: e */
        public int f4943e = -1;

        /* renamed from: f */
        public int f4944f = -1;

        /* renamed from: g */
        public int f4945g = 0;

        /* renamed from: h */
        public int f4946h = 0;

        /* renamed from: j */
        public static a m5491j() {
            if (f4937i == null) {
                synchronized (a.class) {
                    if (f4937i == null) {
                        f4937i = new a();
                    }
                }
            }
            return f4937i;
        }

        /* renamed from: i */
        public a m5492i(boolean z3) {
            this.f4942d = z3;
            return this;
        }

        /* renamed from: k */
        public a m5493k(int i4) {
            this.f4943e = i4;
            return this;
        }

        /* renamed from: l */
        public a m5494l(int i4) {
            this.f4944f = i4;
            return this;
        }
    }

    /* renamed from: a */
    public static Toast m5457a(Context context, CharSequence charSequence, Drawable drawable, int i4, int i5, int i6, boolean z3, boolean z4) {
        Toast toastMakeText = Toast.makeText(context, "", i6);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.xui_layout_xtoast, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(R$id.toast_text);
        AbstractC4406a.m5454c(viewInflate, z4 ? AbstractC4406a.m5455d(context, i4) : AbstractC4406a.m5453b(context, R$drawable.xtoast_frame));
        if (!z3) {
            imageView.setVisibility(8);
        } else {
            if (drawable == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            if (a.m5491j().f4941c) {
                drawable = AbstractC4406a.m5456e(drawable, i5);
            }
            AbstractC4406a.m5454c(imageView, drawable);
        }
        textView.setText(charSequence);
        textView.setTextColor(i5);
        textView.setTypeface(a.m5491j().f4939a, 0);
        if (a.m5491j().f4940b != -1) {
            textView.setTextSize(2, a.m5491j().f4940b);
        }
        if (a.m5491j().f4943e != -1) {
            viewInflate.getBackground().setAlpha(a.m5491j().f4943e);
        }
        toastMakeText.setView(viewInflate);
        if (!a.m5491j().f4942d) {
            Toast toast = f4936a;
            if (toast != null) {
                toast.cancel();
            }
            f4936a = toastMakeText;
        }
        if (a.m5491j().f4944f != -1) {
            toastMakeText.setGravity(a.m5491j().f4944f, a.m5491j().f4945g, a.m5491j().f4946h);
        }
        return toastMakeText;
    }

    /* renamed from: b */
    public static Toast m5458b(Context context, int i4) {
        return m5462f(context, context.getString(i4), 0, true);
    }

    /* renamed from: c */
    public static Toast m5459c(Context context, int i4, int i5) {
        return m5462f(context, context.getString(i4), i5, true);
    }

    /* renamed from: d */
    public static Toast m5460d(Context context, CharSequence charSequence) {
        return m5462f(context, charSequence, 0, true);
    }

    /* renamed from: e */
    public static Toast m5461e(Context context, CharSequence charSequence, int i4) {
        return m5462f(context, charSequence, i4, true);
    }

    /* renamed from: f */
    public static Toast m5462f(Context context, CharSequence charSequence, int i4, boolean z3) {
        return m5457a(context, charSequence, AbstractC4406a.m5453b(context, R$drawable.xtoast_ic_clear_white_24dp), AbstractC4406a.m5452a(context, R$color.toast_error_color), AbstractC4406a.m5452a(context, R$color.toast_default_text_color), i4, z3, true);
    }

    /* renamed from: g */
    public static Toast m5463g(Context context, int i4) {
        return m5467k(context, context.getString(i4), 0, true);
    }

    /* renamed from: h */
    public static Toast m5464h(Context context, int i4, int i5) {
        return m5467k(context, context.getString(i4), i5, true);
    }

    /* renamed from: i */
    public static Toast m5465i(Context context, CharSequence charSequence) {
        return m5467k(context, charSequence, 0, true);
    }

    /* renamed from: j */
    public static Toast m5466j(Context context, CharSequence charSequence, int i4) {
        return m5467k(context, charSequence, i4, true);
    }

    /* renamed from: k */
    public static Toast m5467k(Context context, CharSequence charSequence, int i4, boolean z3) {
        return m5457a(context, charSequence, AbstractC4406a.m5453b(context, R$drawable.xtoast_ic_info_outline_white_24dp), AbstractC4406a.m5452a(context, R$color.toast_info_color), AbstractC4406a.m5452a(context, R$color.toast_default_text_color), i4, z3, true);
    }

    /* renamed from: l */
    public static Toast m5468l(Context context, int i4) {
        return m5472p(context, context.getString(i4), 0, null, false);
    }

    /* renamed from: m */
    public static Toast m5469m(Context context, int i4, int i5) {
        return m5472p(context, context.getString(i4), i5, null, false);
    }

    /* renamed from: n */
    public static Toast m5470n(Context context, CharSequence charSequence) {
        return m5472p(context, charSequence, 0, null, false);
    }

    /* renamed from: o */
    public static Toast m5471o(Context context, CharSequence charSequence, int i4) {
        return m5472p(context, charSequence, i4, null, false);
    }

    /* renamed from: p */
    public static Toast m5472p(Context context, CharSequence charSequence, int i4, Drawable drawable, boolean z3) {
        return m5457a(context, charSequence, drawable, AbstractC4406a.m5452a(context, R$color.toast_normal_tint_color), AbstractC4406a.m5452a(context, R$color.toast_default_text_color), i4, z3, true);
    }

    /* renamed from: q */
    public static Toast m5473q(Context context, int i4) {
        return m5477u(context, context.getString(i4), 0, true);
    }

    /* renamed from: r */
    public static Toast m5474r(Context context, int i4, int i5) {
        return m5477u(context, context.getString(i4), i5, true);
    }

    /* renamed from: s */
    public static Toast m5475s(Context context, CharSequence charSequence) {
        return m5477u(context, charSequence, 0, true);
    }

    /* renamed from: t */
    public static Toast m5476t(Context context, CharSequence charSequence, int i4) {
        return m5477u(context, charSequence, i4, true);
    }

    /* renamed from: u */
    public static Toast m5477u(Context context, CharSequence charSequence, int i4, boolean z3) {
        return m5457a(context, charSequence, AbstractC4406a.m5453b(context, R$drawable.xtoast_ic_check_white_24dp), AbstractC4406a.m5452a(context, R$color.toast_success_color), AbstractC4406a.m5452a(context, R$color.toast_default_text_color), i4, z3, true);
    }

    /* renamed from: v */
    public static Toast m5478v(Context context, int i4) {
        return m5482z(context, context.getString(i4), 0, true);
    }

    /* renamed from: w */
    public static Toast m5479w(Context context, int i4, int i5) {
        return m5482z(context, context.getString(i4), i5, true);
    }

    /* renamed from: x */
    public static Toast m5480x(Context context, CharSequence charSequence) {
        return m5482z(context, charSequence, 0, true);
    }

    /* renamed from: y */
    public static Toast m5481y(Context context, CharSequence charSequence, int i4) {
        return m5482z(context, charSequence, i4, true);
    }

    /* renamed from: z */
    public static Toast m5482z(Context context, CharSequence charSequence, int i4, boolean z3) {
        return m5457a(context, charSequence, AbstractC4406a.m5453b(context, R$drawable.xtoast_ic_error_outline_white_24dp), AbstractC4406a.m5452a(context, R$color.toast_warning_color), AbstractC4406a.m5452a(context, R$color.toast_default_text_color), i4, z3, true);
    }
}
