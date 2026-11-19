package com.zykj.base.ext;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.C5474e;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import com.zykj.base.R$mipmap;
import com.zykj.base.ext.BindingAdaptersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p002a1.C0012d;

@Metadata(m13412d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m13413d2 = {"netUrl", "", "Landroid/widget/ImageView;", "", "netUrlHeader", "netUrlSnapshot", "onClick", "Landroid/view/View;", "listener", "Lkotlin/Function0;", "visibleOrGone", "isVisible", "", "(Landroid/view/View;Ljava/lang/Boolean;)V", "base_release"}, m13414k = 2, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class BindingAdaptersKt {
    /* renamed from: b */
    public static final void m7067b(Long[] mHits, Function0 function0, View view) {
        Intrinsics.checkNotNullParameter(mHits, "$mHits");
        System.arraycopy(mHits, 1, mHits, 0, mHits.length - 1);
        mHits[mHits.length - 1] = Long.valueOf(SystemClock.uptimeMillis());
        if (mHits[0].longValue() >= SystemClock.uptimeMillis() - 500 || function0 == null) {
            return;
        }
        function0.invoke();
    }

    @BindingAdapter({"netUrl"})
    @Keep
    public static final void netUrl(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ComponentCallbacks2C5471b.m3013u(imageView).m3066r(str).m3051u0(imageView);
    }

    @BindingAdapter({"netUrlHeader"})
    @Keep
    public static final void netUrlHeader(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ComponentCallbacks2C5471b.m3013u(imageView).m3066r(str).mo40b(((C0012d) new C0012d().m34V(R$mipmap.icon_personal)).m47f()).m3051u0(imageView);
    }

    @BindingAdapter({"netUrlSnapshot"})
    @Keep
    public static final void netUrlSnapshot(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ((C5474e) ComponentCallbacks2C5471b.m3013u(imageView).m3066r(str).m45e()).m3039B0(0.1f).m3051u0(imageView);
    }

    @BindingAdapter({"onClick"})
    @Keep
    public static final void onClick(View view, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final Long[] lArr = {0L, 0L};
        view.setOnClickListener(new View.OnClickListener() { // from class: u4.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BindingAdaptersKt.m7067b(lArr, function0, view2);
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
