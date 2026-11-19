package p041d2;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: d2.e */
/* loaded from: classes3.dex */
public final class C5415e implements InterfaceC5411a {

    /* renamed from: a */
    public View f8378a;

    /* renamed from: b */
    public int f8379b;

    /* renamed from: c */
    public int f8380c;

    /* renamed from: d */
    public float f8381d;

    /* renamed from: e */
    public float f8382e;

    /* renamed from: a */
    public static C5415e m4808a(View view) {
        C5415e c5415e = new C5415e();
        c5415e.f8379b = 1;
        c5415e.f8380c = 233;
        c5415e.f8381d = 0.0f;
        c5415e.f8378a = view;
        c5415e.f8381d = view.getY();
        c5415e.f8382e = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) view.getLayoutParams())).topMargin + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.LayoutParams) view.getLayoutParams())).bottomMargin;
        return c5415e;
    }

    @Override // p041d2.InterfaceC5411a
    /* renamed from: b */
    public final void mo4801b(int i) {
        this.f8380c = i;
    }

    @Override // p041d2.InterfaceC5411a
    public final int getState() {
        return this.f8379b;
    }

    @Override // p041d2.InterfaceC5411a
    public final void hide() {
        View view = this.f8378a;
        int i = this.f8380c;
        if (i == 233) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getY(), -view.getHeight());
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new C5414d(this, 0));
            valueAnimatorOfFloat.start();
            this.f8379b = 0;
            return;
        }
        if (i == 2333) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(view.getY(), this.f8381d + view.getHeight() + this.f8382e);
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.addUpdateListener(new C5414d(this, 3));
            valueAnimatorOfFloat2.start();
            this.f8379b = 0;
        }
    }

    @Override // p041d2.InterfaceC5411a
    public final void show() {
        View view = this.f8378a;
        int i = this.f8380c;
        if (i == 233) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getY(), 0.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new C5414d(this, 1));
            valueAnimatorOfFloat.start();
            this.f8379b = 1;
            return;
        }
        if (i == 2333) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(view.getY(), this.f8381d);
            valueAnimatorOfFloat2.setDuration(300L);
            valueAnimatorOfFloat2.addUpdateListener(new C5414d(this, 2));
            valueAnimatorOfFloat2.start();
            this.f8379b = 1;
        }
    }
}
