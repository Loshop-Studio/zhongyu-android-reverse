package p295x2;

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
/* loaded from: classes4.dex */
public abstract class AbstractC10492b {

    /* renamed from: a */
    public static Toast f20915a;

    /* renamed from: x2.b$b */
    public static class b {

        /* renamed from: j */
        public static volatile b f20917j;

        /* renamed from: k */
        public static final Typeface f20918k = Typeface.create("sans-serif-condensed", 0);

        /* renamed from: a */
        public Typeface f20919a = f20918k;

        /* renamed from: b */
        public int f20920b = -1;

        /* renamed from: c */
        public boolean f20921c = true;

        /* renamed from: d */
        public boolean f20922d = true;

        /* renamed from: e */
        public int f20923e = -1;

        /* renamed from: f */
        public int f20924f = -1;

        /* renamed from: g */
        public int f20925g = 0;

        /* renamed from: h */
        public int f20926h = 0;

        /* renamed from: i */
        public boolean f20927i = false;

        /* renamed from: k */
        public static b m19736k() {
            if (f20917j == null) {
                synchronized (b.class) {
                    try {
                        if (f20917j == null) {
                            f20917j = new b();
                        }
                    } finally {
                    }
                }
            }
            return f20917j;
        }

        /* renamed from: j */
        public b m19737j(boolean z10) {
            this.f20922d = z10;
            return this;
        }

        /* renamed from: l */
        public b m19738l(int i10) {
            this.f20923e = i10;
            return this;
        }

        /* renamed from: m */
        public b m19739m(int i10) {
            this.f20924f = i10;
            return this;
        }

        /* renamed from: n */
        public b m19740n(Typeface typeface) {
            if (typeface != null) {
                this.f20919a = typeface;
            }
            return this;
        }
    }

    /* renamed from: A */
    public static Toast m19699A(Context context, CharSequence charSequence, int i10) {
        return m19700B(context, charSequence, i10, true);
    }

    /* renamed from: B */
    public static Toast m19700B(Context context, CharSequence charSequence, int i10, boolean z10) {
        return m19703c(context, charSequence, AbstractC10491a.m19695b(context, R$drawable.xtoast_ic_error_outline_white_24dp), AbstractC10491a.m19694a(context, R$color.toast_warning_color), AbstractC10491a.m19694a(context, R$color.toast_default_text_color), i10, z10, true);
    }

    /* renamed from: c */
    public static Toast m19703c(Context context, CharSequence charSequence, Drawable drawable, int i10, int i11, int i12, boolean z10, boolean z11) {
        Toast toastMakeText = Toast.makeText(context, "", i12);
        View viewInflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R$layout.xui_layout_xtoast, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R$id.toast_icon);
        TextView textView = (TextView) viewInflate.findViewById(R$id.toast_text);
        AbstractC10491a.m19696c(viewInflate, z11 ? AbstractC10491a.m19697d(context, i10) : AbstractC10491a.m19695b(context, R$drawable.xtoast_frame));
        if (!z10) {
            imageView.setVisibility(8);
        } else {
            if (drawable == null) {
                throw new IllegalArgumentException("Avoid passing 'icon' as null if 'withIcon' is set to true");
            }
            if (b.m19736k().f20927i) {
                viewInflate.setLayoutDirection(1);
            }
            if (b.m19736k().f20921c) {
                drawable = AbstractC10491a.m19698e(drawable, i11);
            }
            AbstractC10491a.m19696c(imageView, drawable);
        }
        textView.setText(charSequence);
        textView.setTextColor(i11);
        textView.setTypeface(b.m19736k().f20919a, 0);
        if (b.m19736k().f20920b != -1) {
            textView.setTextSize(2, b.m19736k().f20920b);
        }
        if (b.m19736k().f20923e != -1) {
            viewInflate.getBackground().setAlpha(b.m19736k().f20923e);
        }
        toastMakeText.setView(viewInflate);
        if (b.m19736k().f20924f != -1) {
            toastMakeText.setGravity(b.m19736k().f20924f, b.m19736k().f20925g, b.m19736k().f20926h);
        }
        if (!b.m19736k().f20922d) {
            Toast toast = f20915a;
            if (toast != null) {
                toast.cancel();
            }
            f20915a = toastMakeText;
            toastMakeText.getView().addOnAttachStateChangeListener(new a(toastMakeText));
        }
        return toastMakeText;
    }

    /* renamed from: d */
    public static Toast m19704d(Context context, int i10) {
        return m19708h(context, context.getString(i10), 0, true);
    }

    /* renamed from: e */
    public static Toast m19705e(Context context, int i10, int i11) {
        return m19708h(context, context.getString(i10), i11, true);
    }

    /* renamed from: f */
    public static Toast m19706f(Context context, CharSequence charSequence) {
        return m19708h(context, charSequence, 0, true);
    }

    /* renamed from: g */
    public static Toast m19707g(Context context, CharSequence charSequence, int i10) {
        return m19708h(context, charSequence, i10, true);
    }

    /* renamed from: h */
    public static Toast m19708h(Context context, CharSequence charSequence, int i10, boolean z10) {
        return m19703c(context, charSequence, AbstractC10491a.m19695b(context, R$drawable.xtoast_ic_clear_white_24dp), AbstractC10491a.m19694a(context, R$color.toast_error_color), AbstractC10491a.m19694a(context, R$color.toast_default_text_color), i10, z10, true);
    }

    /* renamed from: i */
    public static Toast m19709i(Context context, int i10) {
        return m19713m(context, context.getString(i10), 0, true);
    }

    /* renamed from: j */
    public static Toast m19710j(Context context, int i10, int i11) {
        return m19713m(context, context.getString(i10), i11, true);
    }

    /* renamed from: k */
    public static Toast m19711k(Context context, CharSequence charSequence) {
        return m19713m(context, charSequence, 0, true);
    }

    /* renamed from: l */
    public static Toast m19712l(Context context, CharSequence charSequence, int i10) {
        return m19713m(context, charSequence, i10, true);
    }

    /* renamed from: m */
    public static Toast m19713m(Context context, CharSequence charSequence, int i10, boolean z10) {
        return m19703c(context, charSequence, AbstractC10491a.m19695b(context, R$drawable.xtoast_ic_info_outline_white_24dp), AbstractC10491a.m19694a(context, R$color.toast_info_color), AbstractC10491a.m19694a(context, R$color.toast_default_text_color), i10, z10, true);
    }

    /* renamed from: n */
    public static Toast m19714n(Context context, int i10) {
        return m19718r(context, context.getString(i10), 0, null, false);
    }

    /* renamed from: o */
    public static Toast m19715o(Context context, int i10, int i11) {
        return m19718r(context, context.getString(i10), i11, null, false);
    }

    /* renamed from: p */
    public static Toast m19716p(Context context, CharSequence charSequence) {
        return m19718r(context, charSequence, 0, null, false);
    }

    /* renamed from: q */
    public static Toast m19717q(Context context, CharSequence charSequence, int i10) {
        return m19718r(context, charSequence, i10, null, false);
    }

    /* renamed from: r */
    public static Toast m19718r(Context context, CharSequence charSequence, int i10, Drawable drawable, boolean z10) {
        return m19703c(context, charSequence, drawable, AbstractC10491a.m19694a(context, R$color.toast_normal_tint_color), AbstractC10491a.m19694a(context, R$color.toast_default_text_color), i10, z10, true);
    }

    /* renamed from: s */
    public static Toast m19719s(Context context, int i10) {
        return m19723w(context, context.getString(i10), 0, true);
    }

    /* renamed from: t */
    public static Toast m19720t(Context context, int i10, int i11) {
        return m19723w(context, context.getString(i10), i11, true);
    }

    /* renamed from: u */
    public static Toast m19721u(Context context, CharSequence charSequence) {
        return m19723w(context, charSequence, 0, true);
    }

    /* renamed from: v */
    public static Toast m19722v(Context context, CharSequence charSequence, int i10) {
        return m19723w(context, charSequence, i10, true);
    }

    /* renamed from: w */
    public static Toast m19723w(Context context, CharSequence charSequence, int i10, boolean z10) {
        return m19703c(context, charSequence, AbstractC10491a.m19695b(context, R$drawable.xtoast_ic_check_white_24dp), AbstractC10491a.m19694a(context, R$color.toast_success_color), AbstractC10491a.m19694a(context, R$color.toast_default_text_color), i10, z10, true);
    }

    /* renamed from: x */
    public static Toast m19724x(Context context, int i10) {
        return m19700B(context, context.getString(i10), 0, true);
    }

    /* renamed from: y */
    public static Toast m19725y(Context context, int i10, int i11) {
        return m19700B(context, context.getString(i10), i11, true);
    }

    /* renamed from: z */
    public static Toast m19726z(Context context, CharSequence charSequence) {
        return m19700B(context, charSequence, 0, true);
    }

    /* renamed from: x2.b$a */
    public static class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ Toast f20916a;

        public a(Toast toast) {
            this.f20916a = toast;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            if (this.f20916a == AbstractC10492b.f20915a) {
                Toast unused = AbstractC10492b.f20915a = null;
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
