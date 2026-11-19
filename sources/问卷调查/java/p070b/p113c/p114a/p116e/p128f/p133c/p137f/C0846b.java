package p070b.p113c.p114a.p116e.p128f.p133c.p137f;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.xuexiang.xui.widget.imageview.preview.view.SmoothImageView;
import io.github.inflationx.calligraphy3.C1088R;

/* renamed from: b.c.a.e.f.c.f.b */
/* loaded from: classes.dex */
public class C0846b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ SmoothImageView f4630a;

    public C0846b(SmoothImageView smoothImageView) {
        this.f4630a = smoothImageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        SmoothImageView smoothImageView = this.f4630a;
        SmoothImageView.InterfaceC0976i interfaceC0976i = smoothImageView.f5274A;
        if (interfaceC0976i != null) {
            interfaceC0976i.mo2556a(smoothImageView.f5275f);
        }
        SmoothImageView smoothImageView2 = this.f4630a;
        if (smoothImageView2.f5275f == SmoothImageView.EnumC0974g.STATE_IN) {
            smoothImageView2.f5275f = SmoothImageView.EnumC0974g.STATE_NORMAL;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        if (this.f4630a.getTag(C1088R.id.item_image_key) != null) {
            this.f4630a.setTag(C1088R.id.item_image_key, null);
            this.f4630a.setOnLongClickListener(null);
        }
    }
}
