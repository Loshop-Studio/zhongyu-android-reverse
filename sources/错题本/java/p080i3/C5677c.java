package p080i3;

import android.view.View;
import android.view.animation.Animation;
import com.xuexiang.xui.widget.popupwindow.status.Status;
import com.xuexiang.xui.widget.popupwindow.status.StatusView;

/* renamed from: i3.c */
/* loaded from: classes3.dex */
public final class C5677c extends AbstractAnimationAnimationListenerC5675a {

    /* renamed from: a */
    public final /* synthetic */ View f8847a;

    /* renamed from: b */
    public final /* synthetic */ StatusView f8848b;

    public C5677c(StatusView statusView, View view) {
        this.f8848b = statusView;
        this.f8847a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Status status = Status.NONE;
        StatusView statusView = this.f8848b;
        statusView.f4628a = status;
        this.f8847a.setVisibility(4);
        statusView.f4634g.setAnimationListener(null);
        statusView.setVisibility(8);
    }
}
