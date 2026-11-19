package p047c9;

import android.content.Context;
import android.graphics.Point;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.R$layout;
import com.xuexiang.xui.R$style;
import com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup;

/* renamed from: c9.b */
/* loaded from: classes5.dex */
public abstract class AbstractC5409b extends XUIBasePopup {

    /* renamed from: l */
    public int f3459l;

    /* renamed from: m */
    public int f3460m;

    /* renamed from: n */
    public ImageView f3461n;

    /* renamed from: o */
    public ImageView f3462o;

    /* renamed from: p */
    public int f3463p;

    /* renamed from: q */
    public int f3464q;

    /* renamed from: r */
    public int f3465r;

    /* renamed from: s */
    public int f3466s;

    /* renamed from: t */
    public int f3467t;

    /* renamed from: u */
    public int f3468u;

    /* renamed from: v */
    public int f3469v;

    /* renamed from: w */
    public int f3470w;

    /* renamed from: x */
    public int f3471x;

    public AbstractC5409b(Context context) {
        this(context, 2);
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup
    /* renamed from: k */
    public Point mo2849k(View view) {
        m2851p(view);
        m2855t();
        m2852q(this.f16657h.x, this.f3468u);
        int i10 = this.f3465r;
        return new Point(this.f3466s + this.f3469v, this.f3467t + (i10 == 0 ? this.f3470w : i10 == 1 ? this.f3471x : 0));
    }

    @Override // com.xuexiang.xui.widget.popupwindow.popup.XUIBasePopup
    /* renamed from: m */
    public void mo2850m(View view) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(m13052d()).inflate(R$layout.xui_layout_popup, (ViewGroup) null, false);
        this.f3462o = (ImageView) frameLayout.findViewById(R$id.arrow_down);
        this.f3461n = (ImageView) frameLayout.findViewById(R$id.arrow_up);
        ((FrameLayout) frameLayout.findViewById(R$id.box)).addView(view);
        super.mo2850m(frameLayout);
    }

    /* renamed from: p */
    public final void m2851p(View view) {
        if (view == null) {
            Point point = this.f16657h;
            this.f3466s = (point.x - this.f16659j) / 2;
            this.f3467t = (point.y - this.f16658i) / 2;
            this.f3465r = 2;
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        this.f3468u = width;
        int i10 = this.f16657h.x;
        if (width < i10 / 2) {
            this.f3466s = Math.max(width - (this.f16659j / 2), this.f3459l);
        } else {
            int i11 = this.f16659j;
            int i12 = (i11 / 2) + width;
            int i13 = this.f3459l;
            if (i12 < i10 - i13) {
                this.f3466s = width - (i11 / 2);
            } else {
                this.f3466s = (i10 - i13) - i11;
            }
        }
        int i14 = this.f3464q;
        this.f3465r = i14;
        if (i14 == 0) {
            int i15 = iArr[1];
            int i16 = i15 - this.f16658i;
            this.f3467t = i16;
            if (i16 < this.f3460m) {
                this.f3467t = i15 + view.getHeight();
                this.f3465r = 1;
                return;
            }
            return;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            this.f3467t = iArr[1];
        } else {
            int height = iArr[1] + view.getHeight();
            this.f3467t = height;
            if (height > this.f16657h.y - this.f3460m) {
                this.f3467t = iArr[1] - this.f16658i;
                this.f3465r = 0;
            }
        }
    }

    /* renamed from: q */
    public final void m2852q(int i10, int i11) {
        ImageView imageView = this.f3461n;
        if (imageView != null) {
            i11 -= imageView.getMeasuredWidth() / 2;
        }
        boolean z10 = this.f3465r == 0;
        int i12 = this.f3463p;
        if (i12 == 1) {
            m13053e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Left : R$style.XUI_Animation_PopDownMenu_Left);
            return;
        }
        if (i12 == 2) {
            m13053e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Right : R$style.XUI_Animation_PopDownMenu_Right);
            return;
        }
        if (i12 == 3) {
            m13053e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Center : R$style.XUI_Animation_PopDownMenu_Center);
            return;
        }
        if (i12 != 4) {
            return;
        }
        int i13 = i10 / 4;
        if (i11 <= i13) {
            m13053e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Left : R$style.XUI_Animation_PopDownMenu_Left);
        } else if (i11 <= i13 || i11 >= i13 * 3) {
            m13053e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Right : R$style.XUI_Animation_PopDownMenu_Right);
        } else {
            m13053e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Center : R$style.XUI_Animation_PopDownMenu_Center);
        }
    }

    /* renamed from: r */
    public AbstractC5409b m2853r(int i10) {
        this.f3464q = i10;
        return this;
    }

    /* renamed from: s */
    public final void m2854s(View view, boolean z10) {
        if (view != null) {
            view.setVisibility(z10 ? 0 : 4);
        }
    }

    /* renamed from: t */
    public final void m2855t() {
        ImageView imageView;
        int i10 = this.f3465r;
        if (i10 == 0) {
            m2854s(this.f3462o, true);
            m2854s(this.f3461n, false);
            imageView = this.f3462o;
        } else if (i10 != 1) {
            if (i10 == 2) {
                m2854s(this.f3462o, false);
                m2854s(this.f3461n, false);
            }
            imageView = null;
        } else {
            m2854s(this.f3461n, true);
            m2854s(this.f3462o, false);
            imageView = this.f3461n;
        }
        if (imageView != null) {
            int measuredWidth = this.f3461n.getMeasuredWidth();
            ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = (this.f3468u - this.f3466s) - (measuredWidth / 2);
        }
    }

    /* renamed from: u */
    public void m2856u(View view) {
        m2853r(1);
        m13060n(view);
    }

    /* renamed from: v */
    public void m2857v(View view) {
        m2853r(0);
        m13060n(view);
    }

    public AbstractC5409b(Context context, int i10) {
        super(context);
        this.f3459l = 0;
        this.f3460m = 0;
        this.f3466s = -1;
        this.f3467t = -1;
        this.f3469v = 0;
        this.f3470w = 0;
        this.f3471x = 0;
        this.f3463p = 4;
        this.f3464q = i10;
        this.f3465r = i10;
    }
}
