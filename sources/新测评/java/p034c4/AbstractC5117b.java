package p034c4;

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

/* renamed from: c4.b */
/* loaded from: classes4.dex */
public abstract class AbstractC5117b {

    /* renamed from: a */
    public static Toast f2675a;

    /* renamed from: c4.b$b */
    public static class b {

        /* renamed from: j */
        public static volatile b f2677j;

        /* renamed from: k */
        public static final Typeface f2678k = Typeface.create("sans-serif-condensed", 0);

        /* renamed from: a */
        public Typeface f2679a = f2678k;

        /* renamed from: b */
        public int f2680b = -1;

        /* renamed from: c */
        public boolean f2681c = true;

        /* renamed from: d */
        public boolean f2682d = true;

        /* renamed from: e */
        public int f2683e = -1;

        /* renamed from: f */
        public int f2684f = -1;

        /* renamed from: g */
        public int f2685g = 0;

        /* renamed from: h */
        public int f2686h = 0;

        /* renamed from: i */
        public boolean f2687i = false;

        /* renamed from: k */
        public static b m2770k() {
            if (f2677j == null) {
                synchronized (b.class) {
                    try {
                        if (f2677j == null) {
                            f2677j = new b();
                        }
                    } finally {
                    }
                }
            }
            return f2677j;
        }

        /* renamed from: j */
        public b m2771j(boolean z9) {
            this.f2682d = z9;
            return this;
        }

        /* renamed from: l */
        public b m2772l(int i10) {
            this.f2683e = i10;
            return this;
        }

        /* renamed from: m */
        public b m2773m(int i10) {
            this.f2684f = i10;
            return this;
        }
    }

    /* renamed from: A */
    public static Toast m2733A(Context context, CharSequence charSequence, int i10) {
        return m2734B(context, charSequence, i10, true);
    }

    /* renamed from: B */
    public static Toast m2734B(Context context, CharSequence charSequence, int i10, boolean z9) {
        return m2737c(context, charSequence, AbstractC5116a.m2729b(context, R$drawable.xtoast_ic_error_outline_white_24dp), AbstractC5116a.m2728a(context, R$color.toast_warning_color), AbstractC5116a.m2728a(context, R$color.toast_default_text_color), i10, z9, true);
    }

    /* renamed from: c */
    public static Toast m2737c(Context context, CharSequence charSequence, Drawable drawable, int i10, int i11, int i12, boolean z9, boolean z10) {
        Toast toastMakeText = Toast.makeText(context, "", i12);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.xui_layout_xtoast, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(R$id.toast_text);
        AbstractC5116a.m2730c(viewInflate, z10 ? AbstractC5116a.m2731d(context, i10) : AbstractC5116a.m2729b(context, R$drawable.xtoast_frame));
        if (!z9) {
            imageView.setVisibility(8);
        } else {
            if (drawable == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            if (b.m2770k().f2687i) {
                viewInflate.setLayoutDirection(1);
            }
            if (b.m2770k().f2681c) {
                drawable = AbstractC5116a.m2732e(drawable, i11);
            }
            AbstractC5116a.m2730c(imageView, drawable);
        }
        textView.setText(charSequence);
        textView.setTextColor(i11);
        textView.setTypeface(b.m2770k().f2679a, 0);
        if (b.m2770k().f2680b != -1) {
            textView.setTextSize(2, b.m2770k().f2680b);
        }
        if (b.m2770k().f2683e != -1) {
            viewInflate.getBackground().setAlpha(b.m2770k().f2683e);
        }
        toastMakeText.setView(viewInflate);
        if (b.m2770k().f2684f != -1) {
            toastMakeText.setGravity(b.m2770k().f2684f, b.m2770k().f2685g, b.m2770k().f2686h);
        }
        if (!b.m2770k().f2682d) {
            Toast toast = f2675a;
            if (toast != null) {
                toast.cancel();
            }
            f2675a = toastMakeText;
            toastMakeText.getView().addOnAttachStateChangeListener(new a(toastMakeText));
        }
        return toastMakeText;
    }

    /* renamed from: d */
    public static Toast m2738d(Context context, int i10) {
        return m2742h(context, context.getString(i10), 0, true);
    }

    /* renamed from: e */
    public static Toast m2739e(Context context, int i10, int i11) {
        return m2742h(context, context.getString(i10), i11, true);
    }

    /* renamed from: f */
    public static Toast m2740f(Context context, CharSequence charSequence) {
        return m2742h(context, charSequence, 0, true);
    }

    /* renamed from: g */
    public static Toast m2741g(Context context, CharSequence charSequence, int i10) {
        return m2742h(context, charSequence, i10, true);
    }

    /* renamed from: h */
    public static Toast m2742h(Context context, CharSequence charSequence, int i10, boolean z9) {
        return m2737c(context, charSequence, AbstractC5116a.m2729b(context, R$drawable.xtoast_ic_clear_white_24dp), AbstractC5116a.m2728a(context, R$color.toast_error_color), AbstractC5116a.m2728a(context, R$color.toast_default_text_color), i10, z9, true);
    }

    /* renamed from: i */
    public static Toast m2743i(Context context, int i10) {
        return m2747m(context, context.getString(i10), 0, true);
    }

    /* renamed from: j */
    public static Toast m2744j(Context context, int i10, int i11) {
        return m2747m(context, context.getString(i10), i11, true);
    }

    /* renamed from: k */
    public static Toast m2745k(Context context, CharSequence charSequence) {
        return m2747m(context, charSequence, 0, true);
    }

    /* renamed from: l */
    public static Toast m2746l(Context context, CharSequence charSequence, int i10) {
        return m2747m(context, charSequence, i10, true);
    }

    /* renamed from: m */
    public static Toast m2747m(Context context, CharSequence charSequence, int i10, boolean z9) {
        return m2737c(context, charSequence, AbstractC5116a.m2729b(context, R$drawable.xtoast_ic_info_outline_white_24dp), AbstractC5116a.m2728a(context, R$color.toast_info_color), AbstractC5116a.m2728a(context, R$color.toast_default_text_color), i10, z9, true);
    }

    /* renamed from: n */
    public static Toast m2748n(Context context, int i10) {
        return m2752r(context, context.getString(i10), 0, null, false);
    }

    /* renamed from: o */
    public static Toast m2749o(Context context, int i10, int i11) {
        return m2752r(context, context.getString(i10), i11, null, false);
    }

    /* renamed from: p */
    public static Toast m2750p(Context context, CharSequence charSequence) {
        return m2752r(context, charSequence, 0, null, false);
    }

    /* renamed from: q */
    public static Toast m2751q(Context context, CharSequence charSequence, int i10) {
        return m2752r(context, charSequence, i10, null, false);
    }

    /* renamed from: r */
    public static Toast m2752r(Context context, CharSequence charSequence, int i10, Drawable drawable, boolean z9) {
        return m2737c(context, charSequence, drawable, AbstractC5116a.m2728a(context, R$color.toast_normal_tint_color), AbstractC5116a.m2728a(context, R$color.toast_default_text_color), i10, z9, true);
    }

    /* renamed from: s */
    public static Toast m2753s(Context context, int i10) {
        return m2757w(context, context.getString(i10), 0, true);
    }

    /* renamed from: t */
    public static Toast m2754t(Context context, int i10, int i11) {
        return m2757w(context, context.getString(i10), i11, true);
    }

    /* renamed from: u */
    public static Toast m2755u(Context context, CharSequence charSequence) {
        return m2757w(context, charSequence, 0, true);
    }

    /* renamed from: v */
    public static Toast m2756v(Context context, CharSequence charSequence, int i10) {
        return m2757w(context, charSequence, i10, true);
    }

    /* renamed from: w */
    public static Toast m2757w(Context context, CharSequence charSequence, int i10, boolean z9) {
        return m2737c(context, charSequence, AbstractC5116a.m2729b(context, R$drawable.xtoast_ic_check_white_24dp), AbstractC5116a.m2728a(context, R$color.toast_success_color), AbstractC5116a.m2728a(context, R$color.toast_default_text_color), i10, z9, true);
    }

    /* renamed from: x */
    public static Toast m2758x(Context context, int i10) {
        return m2734B(context, context.getString(i10), 0, true);
    }

    /* renamed from: y */
    public static Toast m2759y(Context context, int i10, int i11) {
        return m2734B(context, context.getString(i10), i11, true);
    }

    /* renamed from: z */
    public static Toast m2760z(Context context, CharSequence charSequence) {
        return m2734B(context, charSequence, 0, true);
    }

    /* renamed from: c4.b$a */
    public static class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Toast f2676a;

        public a(Toast toast) {
            this.f2676a = toast;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            if (this.f2676a == AbstractC5117b.f2675a) {
                Toast unused = AbstractC5117b.f2675a = null;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
