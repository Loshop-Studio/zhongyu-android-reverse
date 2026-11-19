package com.zykj.base.ext;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.C2861f;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.zykj.base.R$mipmap;
import com.zykj.base.ext.BindingAdaptersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p016c0.C2753d;

@Metadata(m5174d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0000\u001a\u0004\u0018\u00010\u0003H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007\u001a\u001b\u0010\n\u001a\u00020\u0001*\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m5175d2 = {"netUrl", "", "Landroid/widget/ImageView;", "", "netUrlHeader", "netUrlSnapshot", "onClick", "Landroid/view/View;", "listener", "Lkotlin/Function0;", "visibleOrGone", "isVisible", "", "(Landroid/view/View;Ljava/lang/Boolean;)V", "base_release"}, m5176k = 2, m5177mv = {1, 5, 1}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class BindingAdaptersKt {
    /* renamed from: b */
    public static final void m4600b(Long[] mHits, Function0 function0, View view) {
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
        ComponentCallbacks2C2858c.m1687u(imageView).m1742s(str).m1726v0(imageView);
    }

    @BindingAdapter({"netUrlHeader"})
    @Keep
    public static final void netUrlHeader(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ComponentCallbacks2C2858c.m1687u(imageView).m1742s(str).mo1579a(((C2753d) new C2753d().m1575W(R$mipmap.icon_personal)).m1586e()).m1726v0(imageView);
    }

    @BindingAdapter({"netUrlSnapshot"})
    @Keep
    public static final void netUrlSnapshot(ImageView imageView, String str) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        ((C2861f) ComponentCallbacks2C2858c.m1687u(imageView).m1742s(str).m1584d()).m1714C0(0.1f).m1726v0(imageView);
    }

    @BindingAdapter({"onClick"})
    @Keep
    public static final void onClick(View view, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        final Long[] lArr = {0L, 0L};
        view.setOnClickListener(new View.OnClickListener() { // from class: p1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BindingAdaptersKt.m4600b(lArr, function0, view2);
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
