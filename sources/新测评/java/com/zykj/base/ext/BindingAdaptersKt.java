package com.zykj.base.ext;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.databinding.BindingAdapter;
import com.blankj.utilcode.util.ClickUtils;
import com.bumptech.glide.C5347g;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import com.kunminx.architecture.p040ui.callback.ProtectedUnPeekLiveData;
import com.zykj.base.R$mipmap;
import com.zykj.base.bean.toast.ToastMessage;
import com.zykj.base.ext.BindingAdaptersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p073e1.C7327d;
import p076e4.AbstractC7339a;

@Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\b\u001a\u00020\u0002*\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\f\u001a\u00020\u0002*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000e\u001a\u00020\u0002*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u0002*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\r\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m13558d2 = {"Landroid/view/View;", "Lkotlin/Function0;", "", "listener", "onClick", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "", "isVisible", "visibleOrGone", "(Landroid/view/View;Ljava/lang/Boolean;)V", "Landroid/widget/ImageView;", "", "netUrl", "(Landroid/widget/ImageView;Ljava/lang/String;)V", "netUrlSnapshot", "netUrlHeader", "Le4/a;", "Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;", "Lcom/zykj/base/bean/toast/ToastMessage;", "toastLiveData", "bindLiveData", "(Le4/a;Lcom/kunminx/architecture/ui/callback/ProtectedUnPeekLiveData;)V", "base_release"}, m13559k = 2, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class BindingAdaptersKt {
    /* renamed from: b */
    public static final void m5972b(Function0 function0, View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    @BindingAdapter(requireAll = false, value = {"message"})
    @Keep
    public static final void bindLiveData(AbstractC7339a abstractC7339a, ProtectedUnPeekLiveData<ToastMessage> protectedUnPeekLiveData) {
        Intrinsics.checkNotNullParameter(abstractC7339a, "<this>");
        throw null;
    }

    @BindingAdapter({"netUrl"})
    @Keep
    public static final void netUrl(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ComponentCallbacks2C5342b.m3298u(imageView).m3363s(str).m3348w0(imageView);
    }

    @BindingAdapter({"netUrlHeader"})
    @Keep
    public static final void netUrlHeader(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ComponentCallbacks2C5342b.m3298u(imageView).m3363s(str).mo3335b(((C7327d) new C7327d().m11668X(R$mipmap.icon_personal)).m11677e()).m3348w0(imageView);
    }

    @BindingAdapter({"netUrlSnapshot"})
    @Keep
    public static final void netUrlSnapshot(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ((C5347g) ComponentCallbacks2C5342b.m3298u(imageView).m3363s(str).m11675d()).m3334D0(0.1f).m3348w0(imageView);
    }

    @BindingAdapter({"onClick"})
    @Keep
    public static final void onClick(View view, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ClickUtils.applySingleDebouncing(view, 500L, new View.OnClickListener() { // from class: d4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BindingAdaptersKt.m5972b(function0, view2);
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
