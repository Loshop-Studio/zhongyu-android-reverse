package com.xuexiang.xui.widget.imageview.preview.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;

/* renamed from: com.xuexiang.xui.widget.imageview.preview.view.a */
/* loaded from: classes3.dex */
public final class C4182a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ SmoothImageView f4515a;

    public C4182a(SmoothImageView smoothImageView) {
        this.f4515a = smoothImageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SmoothImageView smoothImageView = this.f4515a;
        InterfaceC4183b interfaceC4183b = smoothImageView.f4513w;
        if (interfaceC4183b != null) {
            interfaceC4183b.mo3518a();
        }
        if (smoothImageView.f4493c == SmoothImageView.Status.STATE_IN) {
            smoothImageView.f4493c = SmoothImageView.Status.STATE_NORMAL;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = R$id.item_image_key;
        SmoothImageView smoothImageView = this.f4515a;
        if (smoothImageView.getTag(i) != null) {
            smoothImageView.setTag(R$id.item_image_key, null);
            smoothImageView.setOnLongClickListener(null);
        }
    }
}
