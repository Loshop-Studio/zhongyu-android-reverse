package com.zykj.base.ext;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.databinding.BindingAdapter;
import com.blankj.utilcode.util.AbstractC4644f;
import com.bumptech.glide.C4683h;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.kunminx.architecture.p031ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.R$mipmap;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.ext.BindingAdaptersKt;
import com.zykj.base.view.ToastView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p181x0.C7826d;

@Metadata(m7879d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004H\u0007\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u0016\u0010\t\u001a\u00020\u0001*\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u0016\u0010\r\u001a\u00020\u0001*\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0007¨\u0006\u0013"}, m7880d2 = {"onClick", "", "Landroid/view/View;", "listener", "Lkotlin/Function0;", "visibleOrGone", "isVisible", "", "(Landroid/view/View;Ljava/lang/Boolean;)V", "netUrl", "Landroid/widget/ImageView;", "", "netUrlSnapshot", "netUrlHeader", "bindLiveData", "Lcom/zykj/base/view/ToastView;", "toastLiveData", "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;", "Lcom/zykj/base/bean/toast/ToastMessage;", "base_release"}, m7881k = 2, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes3.dex */
public final class BindingAdaptersKt {
    /* renamed from: b */
    public static final void m4987b(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @BindingAdapter(requireAll = false, value = {"message"})
    @Keep
    public static final void bindLiveData(ToastView toastView, ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData) {
        Intrinsics.checkNotNullParameter(toastView, "<this>");
        toastView.setToastLiveData(protectedUnPeekLiveData);
    }

    @BindingAdapter({"netUrl"})
    @Keep
    public static final void netUrl(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ComponentCallbacks2C4678c.m2477u(imageView).mo2544t(str).m2527w0(imageView);
    }

    @BindingAdapter({"netUrlHeader"})
    @Keep
    public static final void netUrlHeader(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ComponentCallbacks2C4678c.m2477u(imageView).mo2544t(str).mo2514b(((C7826d) new C7826d().mo7346X(R$mipmap.icon_personal)).mo7352f()).m2527w0(imageView);
    }

    @BindingAdapter({"netUrlSnapshot"})
    @Keep
    public static final void netUrlSnapshot(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ((C4683h) ComponentCallbacks2C4678c.m2477u(imageView).mo2544t(str).mo7396e()).mo2513D0(0.1f).m2527w0(imageView);
    }

    @BindingAdapter({"onClick"})
    @Keep
    public static final void onClick(View view, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        AbstractC4644f.m2171b(view, 500L, new View.OnClickListener() { // from class: y2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BindingAdaptersKt.m4987b(function0, view2);
            }
        });
    }

    @BindingAdapter({"visibleOrGone"})
    @Keep
    public static final void visibleOrGone(View view, Boolean bool) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (bool != null) {
            view.setVisibility(bool.booleanValue() ? 0 : 8);
        }
    }
}
