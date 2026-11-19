package com.zykj.base.ext;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.databinding.BindingAdapter;
import com.blankj.utilcode.util.AbstractC5361f;
import com.bumptech.glide.C5396g;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.kunminx.architecture.p043ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.R$mipmap;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.view.ToastView;
import kotlin.jvm.internal.AbstractC9133u;
import p004a3.ViewOnClickListenerC0023a;
import p069d0.C8272d;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class BindingAdaptersKt {
    /* renamed from: b */
    public static final void m7346b(InterfaceC10559a interfaceC10559a, View view) {
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
    }

    @BindingAdapter(requireAll = false, value = {"message"})
    @Keep
    public static final void bindLiveData(ToastView toastView, ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData) {
        AbstractC9133u.m16133g(toastView, "<this>");
        toastView.setToastLiveData(protectedUnPeekLiveData);
    }

    @BindingAdapter({"netUrl"})
    @Keep
    public static final void netUrl(ImageView imageView, String str) {
        AbstractC9133u.m16133g(imageView, "<this>");
        ComponentCallbacks2C5391b.m2739u(imageView).m2809u(str).m2790w0(imageView);
    }

    @BindingAdapter({"netUrlHeader"})
    @Keep
    public static final void netUrlHeader(ImageView imageView, String str) {
        AbstractC9133u.m16133g(imageView, "<this>");
        ComponentCallbacks2C5391b.m2739u(imageView).m2809u(str).mo2777c(((C8272d) new C8272d().m13377X(R$mipmap.icon_personal)).m13388g()).m2790w0(imageView);
    }

    @BindingAdapter({"netUrlSnapshot"})
    @Keep
    public static final void netUrlSnapshot(ImageView imageView, String str) {
        AbstractC9133u.m16133g(imageView, "<this>");
        ((C5396g) ComponentCallbacks2C5391b.m2739u(imageView).m2809u(str).m13386f()).m2776E0(0.1f).m2790w0(imageView);
    }

    @BindingAdapter({"onClick"})
    @Keep
    public static final void onClick(View view, InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(view, "<this>");
        AbstractC5361f.m2454e(view, 500L, new ViewOnClickListenerC0023a(interfaceC10559a));
    }

    @BindingAdapter({"visibleOrGone"})
    @Keep
    public static final void visibleOrGone(View view, Boolean bool) {
        AbstractC9133u.m16133g(view, "<this>");
        if (bool != null) {
            view.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }
}
