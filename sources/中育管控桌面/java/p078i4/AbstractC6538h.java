package p078i4;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.AbstractC4644f;
import com.bumptech.glide.C4683h;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.ComponentCallbacks2C4684i;
import com.zykj.huiwei.launcher.app.App;
import com.zykj.huiwei.launcher.bean.resp.WeatherCityBean;
import com.zykj.huiwei.launcher.ext.CommonExtKt;
import com.zykj.huiwei.launcher.p035ui.view.BubbleProgressView;
import com.zykj.manage.R;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import p149s3.ViewOnClickListenerC7698f;
import p163u3.AbstractC7772d;

/* renamed from: i4.h */
/* loaded from: classes4.dex */
public abstract class AbstractC6538h {
    /* renamed from: a */
    public static final void m7318a(View view, float f6) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object parent = view.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        AbstractC4644f.m2173d(view, (int) f6);
    }

    /* renamed from: b */
    public static final void m7319b(ImageView view, String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        ComponentCallbacks2C4684i componentCallbacks2C4684iM2477u = ComponentCallbacks2C4678c.m2477u(view);
        if (str == null) {
            str = "";
        }
        ((C4683h) ((C4683h) componentCallbacks2C4684iM2477u.mo2544t(str).mo7346X(R.drawable.hw_ic_default_person)).mo7359l(R.drawable.hw_ic_default_person)).m2527w0(view);
    }

    /* renamed from: c */
    public static final void m7320c(BubbleProgressView bubbleProgressView, float f6) {
        Intrinsics.checkNotNullParameter(bubbleProgressView, "<this>");
        bubbleProgressView.setProgress(f6);
    }

    /* renamed from: d */
    public static final void m7321d(TextView view, String color) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(color, "color");
        view.setTextColor(Color.parseColor(color));
    }

    /* renamed from: e */
    public static final void m7322e(TextView textView, int i6, float f6) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        m7323f(textView, i6, f6, f6);
    }

    /* renamed from: f */
    public static final void m7323f(TextView textView, int i6, float f6, float f7) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Drawable drawable = ContextCompat.getDrawable(App.INSTANCE.m5206a(), i6);
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) f6, (int) f7);
        }
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    /* renamed from: g */
    public static final void m7324g(View view, View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (view instanceof Group) {
            CommonExtKt.m5315h((Group) view, new ViewOnClickListenerC7698f(onClickListener));
        } else {
            view.setOnClickListener(new ViewOnClickListenerC7698f(onClickListener));
        }
    }

    /* renamed from: h */
    public static final void m7325h(ImageView imageView, WeatherCityBean weatherCityBean) {
        String iconDay;
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        if (weatherCityBean == null || (iconDay = weatherCityBean.getIconDay()) == null) {
            imageView.setImageDrawable(null);
            return;
        }
        int identifier = imageView.getContext().getResources().getIdentifier("hw_" + iconDay + "_fill", "drawable", imageView.getContext().getPackageName());
        if (identifier == 0) {
            imageView.setImageDrawable(null);
        } else {
            imageView.setImageResource(identifier);
        }
    }

    /* renamed from: i */
    public static final void m7326i(TextView view, WeatherCityBean weatherCityBean) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText(weatherCityBean != null ? view.getContext().getString(R.string.hw_temperature_replace, weatherCityBean.getTempMin(), weatherCityBean.getTempMax()) : null);
    }

    /* renamed from: j */
    public static final void m7327j(TextView view, WeatherCityBean weatherCityBean) {
        String fxDate;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setText((weatherCityBean == null || (fxDate = weatherCityBean.getFxDate()) == null) ? null : AbstractC7772d.m9303c(new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA).parse(fxDate).getTime()));
    }
}
