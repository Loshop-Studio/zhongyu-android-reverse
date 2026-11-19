package p183x2;

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

/* renamed from: x2.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7832b {

    /* renamed from: a */
    public static Toast f10426a;

    /* renamed from: x2.b$b */
    public static class b {

        /* renamed from: j */
        public static volatile b f10428j;

        /* renamed from: k */
        public static final Typeface f10429k = Typeface.create("sans-serif-condensed", 0);

        /* renamed from: a */
        public Typeface f10430a = f10429k;

        /* renamed from: b */
        public int f10431b = -1;

        /* renamed from: c */
        public boolean f10432c = true;

        /* renamed from: d */
        public boolean f10433d = true;

        /* renamed from: e */
        public int f10434e = -1;

        /* renamed from: f */
        public int f10435f = -1;

        /* renamed from: g */
        public int f10436g = 0;

        /* renamed from: h */
        public int f10437h = 0;

        /* renamed from: i */
        public boolean f10438i = false;

        /* renamed from: k */
        public static b m9504k() {
            if (f10428j == null) {
                synchronized (b.class) {
                    try {
                        if (f10428j == null) {
                            f10428j = new b();
                        }
                    } finally {
                    }
                }
            }
            return f10428j;
        }

        /* renamed from: j */
        public b m9505j(boolean z6) {
            this.f10433d = z6;
            return this;
        }

        /* renamed from: l */
        public b m9506l(int i6) {
            this.f10434e = i6;
            return this;
        }

        /* renamed from: m */
        public b m9507m(int i6) {
            this.f10435f = i6;
            return this;
        }

        /* renamed from: n */
        public b m9508n(Typeface typeface) {
            if (typeface != null) {
                this.f10430a = typeface;
            }
            return this;
        }
    }

    /* renamed from: A */
    public static Toast m9467A(Context context, CharSequence charSequence, int i6) {
        return m9468B(context, charSequence, i6, true);
    }

    /* renamed from: B */
    public static Toast m9468B(Context context, CharSequence charSequence, int i6, boolean z6) {
        return m9471c(context, charSequence, AbstractC7831a.m9463b(context, R$drawable.xtoast_ic_error_outline_white_24dp), AbstractC7831a.m9462a(context, R$color.toast_warning_color), AbstractC7831a.m9462a(context, R$color.toast_default_text_color), i6, z6, true);
    }

    /* renamed from: c */
    public static Toast m9471c(Context context, CharSequence charSequence, Drawable drawable, int i6, int i7, int i8, boolean z6, boolean z7) {
        Toast toastMakeText = Toast.makeText(context, "", i8);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.xui_layout_xtoast, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(R$id.toast_text);
        AbstractC7831a.m9464c(viewInflate, z7 ? AbstractC7831a.m9465d(context, i6) : AbstractC7831a.m9463b(context, R$drawable.xtoast_frame));
        if (!z6) {
            imageView.setVisibility(8);
        } else {
            if (drawable == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            if (b.m9504k().f10438i) {
                viewInflate.setLayoutDirection(1);
            }
            if (b.m9504k().f10432c) {
                drawable = AbstractC7831a.m9466e(drawable, i7);
            }
            AbstractC7831a.m9464c(imageView, drawable);
        }
        textView.setText(charSequence);
        textView.setTextColor(i7);
        textView.setTypeface(b.m9504k().f10430a, 0);
        if (b.m9504k().f10431b != -1) {
            textView.setTextSize(2, b.m9504k().f10431b);
        }
        if (b.m9504k().f10434e != -1) {
            viewInflate.getBackground().setAlpha(b.m9504k().f10434e);
        }
        toastMakeText.setView(viewInflate);
        if (b.m9504k().f10435f != -1) {
            toastMakeText.setGravity(b.m9504k().f10435f, b.m9504k().f10436g, b.m9504k().f10437h);
        }
        if (!b.m9504k().f10433d) {
            Toast toast = f10426a;
            if (toast != null) {
                toast.cancel();
            }
            f10426a = toastMakeText;
            toastMakeText.getView().addOnAttachStateChangeListener(new a(toastMakeText));
        }
        return toastMakeText;
    }

    /* renamed from: d */
    public static Toast m9472d(Context context, int i6) {
        return m9476h(context, context.getString(i6), 0, true);
    }

    /* renamed from: e */
    public static Toast m9473e(Context context, int i6, int i7) {
        return m9476h(context, context.getString(i6), i7, true);
    }

    /* renamed from: f */
    public static Toast m9474f(Context context, CharSequence charSequence) {
        return m9476h(context, charSequence, 0, true);
    }

    /* renamed from: g */
    public static Toast m9475g(Context context, CharSequence charSequence, int i6) {
        return m9476h(context, charSequence, i6, true);
    }

    /* renamed from: h */
    public static Toast m9476h(Context context, CharSequence charSequence, int i6, boolean z6) {
        return m9471c(context, charSequence, AbstractC7831a.m9463b(context, R$drawable.xtoast_ic_clear_white_24dp), AbstractC7831a.m9462a(context, R$color.toast_error_color), AbstractC7831a.m9462a(context, R$color.toast_default_text_color), i6, z6, true);
    }

    /* renamed from: i */
    public static Toast m9477i(Context context, int i6) {
        return m9481m(context, context.getString(i6), 0, true);
    }

    /* renamed from: j */
    public static Toast m9478j(Context context, int i6, int i7) {
        return m9481m(context, context.getString(i6), i7, true);
    }

    /* renamed from: k */
    public static Toast m9479k(Context context, CharSequence charSequence) {
        return m9481m(context, charSequence, 0, true);
    }

    /* renamed from: l */
    public static Toast m9480l(Context context, CharSequence charSequence, int i6) {
        return m9481m(context, charSequence, i6, true);
    }

    /* renamed from: m */
    public static Toast m9481m(Context context, CharSequence charSequence, int i6, boolean z6) {
        return m9471c(context, charSequence, AbstractC7831a.m9463b(context, R$drawable.xtoast_ic_info_outline_white_24dp), AbstractC7831a.m9462a(context, R$color.toast_info_color), AbstractC7831a.m9462a(context, R$color.toast_default_text_color), i6, z6, true);
    }

    /* renamed from: n */
    public static Toast m9482n(Context context, int i6) {
        return m9486r(context, context.getString(i6), 0, null, false);
    }

    /* renamed from: o */
    public static Toast m9483o(Context context, int i6, int i7) {
        return m9486r(context, context.getString(i6), i7, null, false);
    }

    /* renamed from: p */
    public static Toast m9484p(Context context, CharSequence charSequence) {
        return m9486r(context, charSequence, 0, null, false);
    }

    /* renamed from: q */
    public static Toast m9485q(Context context, CharSequence charSequence, int i6) {
        return m9486r(context, charSequence, i6, null, false);
    }

    /* renamed from: r */
    public static Toast m9486r(Context context, CharSequence charSequence, int i6, Drawable drawable, boolean z6) {
        return m9471c(context, charSequence, drawable, AbstractC7831a.m9462a(context, R$color.toast_normal_tint_color), AbstractC7831a.m9462a(context, R$color.toast_default_text_color), i6, z6, true);
    }

    /* renamed from: s */
    public static Toast m9487s(Context context, int i6) {
        return m9491w(context, context.getString(i6), 0, true);
    }

    /* renamed from: t */
    public static Toast m9488t(Context context, int i6, int i7) {
        return m9491w(context, context.getString(i6), i7, true);
    }

    /* renamed from: u */
    public static Toast m9489u(Context context, CharSequence charSequence) {
        return m9491w(context, charSequence, 0, true);
    }

    /* renamed from: v */
    public static Toast m9490v(Context context, CharSequence charSequence, int i6) {
        return m9491w(context, charSequence, i6, true);
    }

    /* renamed from: w */
    public static Toast m9491w(Context context, CharSequence charSequence, int i6, boolean z6) {
        return m9471c(context, charSequence, AbstractC7831a.m9463b(context, R$drawable.xtoast_ic_check_white_24dp), AbstractC7831a.m9462a(context, R$color.toast_success_color), AbstractC7831a.m9462a(context, R$color.toast_default_text_color), i6, z6, true);
    }

    /* renamed from: x */
    public static Toast m9492x(Context context, int i6) {
        return m9468B(context, context.getString(i6), 0, true);
    }

    /* renamed from: y */
    public static Toast m9493y(Context context, int i6, int i7) {
        return m9468B(context, context.getString(i6), i7, true);
    }

    /* renamed from: z */
    public static Toast m9494z(Context context, CharSequence charSequence) {
        return m9468B(context, charSequence, 0, true);
    }

    /* renamed from: x2.b$a */
    public static class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Toast f10427a;

        public a(Toast toast) {
            this.f10427a = toast;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            if (this.f10427a == AbstractC7832b.f10426a) {
                Toast unused = AbstractC7832b.f10426a = null;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
