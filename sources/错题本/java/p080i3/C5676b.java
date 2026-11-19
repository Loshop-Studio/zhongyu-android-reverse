package p080i3;

import android.view.View;
import android.view.animation.Animation;
import com.xuexiang.xui.widget.popupwindow.status.StatusView;

/* renamed from: i3.b */
/* loaded from: classes3.dex */
public final class C5676b extends AbstractAnimationAnimationListenerC5675a {

    /* renamed from: a */
    public final /* synthetic */ View f8844a;

    /* renamed from: b */
    public final /* synthetic */ View f8845b;

    /* renamed from: c */
    public final /* synthetic */ StatusView f8846c;

    public C5676b(StatusView statusView, View view, View view2) {
        this.f8846c = statusView;
        this.f8844a = view;
        this.f8845b = view2;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        StatusView statusView = this.f8846c;
        statusView.f4634g.setAnimationListener(null);
        this.f8844a.setVisibility(4);
        View view = this.f8845b;
        view.setVisibility(0);
        view.startAnimation(statusView.f4635h);
    }
}
