package p207p2;

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

/* renamed from: p2.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9641c extends AbstractC9639a {

    /* renamed from: l */
    public int f19319l;

    /* renamed from: m */
    public int f19320m;

    /* renamed from: n */
    public ImageView f19321n;

    /* renamed from: o */
    public ImageView f19322o;

    /* renamed from: p */
    public int f19323p;

    /* renamed from: q */
    public int f19324q;

    /* renamed from: r */
    public int f19325r;

    /* renamed from: s */
    public int f19326s;

    /* renamed from: t */
    public int f19327t;

    /* renamed from: u */
    public int f19328u;

    /* renamed from: v */
    public int f19329v;

    /* renamed from: w */
    public int f19330w;

    /* renamed from: x */
    public int f19331x;

    public AbstractC9641c(Context context) {
        this(context, 2);
    }

    @Override // p207p2.AbstractC9639a
    /* renamed from: k */
    public Point mo18215k(View view) {
        m18224q(view);
        m18228u();
        m18225r(this.f19308h.x, this.f19328u);
        int i10 = this.f19325r;
        return new Point(this.f19326s + this.f19329v, this.f19327t + (i10 == 0 ? this.f19330w : i10 == 1 ? this.f19331x : 0));
    }

    @Override // p207p2.AbstractC9639a
    /* renamed from: m */
    public void mo18217m(View view) {
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(m18208d()).inflate(R$layout.xui_layout_popup, (ViewGroup) null, false);
        this.f19322o = (ImageView) frameLayout.findViewById(R$id.arrow_down);
        this.f19321n = (ImageView) frameLayout.findViewById(R$id.arrow_up);
        ((FrameLayout) frameLayout.findViewById(R$id.box)).addView(view);
        super.mo18217m(frameLayout);
    }

    /* renamed from: q */
    public final void m18224q(View view) {
        if (view == null) {
            Point point = this.f19308h;
            this.f19326s = (point.x - this.f19310j) / 2;
            this.f19327t = (point.y - this.f19309i) / 2;
            this.f19325r = 2;
            return;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int width = iArr[0] + (view.getWidth() / 2);
        this.f19328u = width;
        int i10 = this.f19308h.x;
        if (width < i10 / 2) {
            this.f19326s = Math.max(width - (this.f19310j / 2), this.f19319l);
        } else {
            int i11 = this.f19310j;
            int i12 = (i11 / 2) + width;
            int i13 = this.f19319l;
            if (i12 < i10 - i13) {
                this.f19326s = width - (i11 / 2);
            } else {
                this.f19326s = (i10 - i13) - i11;
            }
        }
        int i14 = this.f19324q;
        this.f19325r = i14;
        if (i14 == 0) {
            int i15 = iArr[1];
            int i16 = i15 - this.f19309i;
            this.f19327t = i16;
            if (i16 < this.f19320m) {
                this.f19327t = i15 + view.getHeight();
                this.f19325r = 1;
                return;
            }
            return;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                return;
            }
            this.f19327t = iArr[1];
        } else {
            int height = iArr[1] + view.getHeight();
            this.f19327t = height;
            if (height > this.f19308h.y - this.f19320m) {
                this.f19327t = iArr[1] - this.f19309i;
                this.f19325r = 0;
            }
        }
    }

    /* renamed from: r */
    public final void m18225r(int i10, int i11) {
        ImageView imageView = this.f19321n;
        if (imageView != null) {
            i11 -= imageView.getMeasuredWidth() / 2;
        }
        boolean z10 = this.f19325r == 0;
        int i12 = this.f19323p;
        if (i12 == 1) {
            m18209e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Left : R$style.XUI_Animation_PopDownMenu_Left);
            return;
        }
        if (i12 == 2) {
            m18209e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Right : R$style.XUI_Animation_PopDownMenu_Right);
            return;
        }
        if (i12 == 3) {
            m18209e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Center : R$style.XUI_Animation_PopDownMenu_Center);
            return;
        }
        if (i12 != 4) {
            return;
        }
        int i13 = i10 / 4;
        if (i11 <= i13) {
            m18209e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Left : R$style.XUI_Animation_PopDownMenu_Left);
        } else if (i11 <= i13 || i11 >= i13 * 3) {
            m18209e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Right : R$style.XUI_Animation_PopDownMenu_Right);
        } else {
            m18209e().setAnimationStyle(z10 ? R$style.XUI_Animation_PopUpMenu_Center : R$style.XUI_Animation_PopDownMenu_Center);
        }
    }

    /* renamed from: s */
    public AbstractC9641c m18226s(int i10) {
        this.f19324q = i10;
        return this;
    }

    /* renamed from: t */
    public final void m18227t(View view, boolean z10) {
        if (view != null) {
            view.setVisibility(z10 ? 0 : 4);
        }
    }

    /* renamed from: u */
    public final void m18228u() {
        ImageView imageView;
        int i10 = this.f19325r;
        if (i10 == 0) {
            m18227t(this.f19322o, true);
            m18227t(this.f19321n, false);
            imageView = this.f19322o;
        } else if (i10 != 1) {
            if (i10 == 2) {
                m18227t(this.f19322o, false);
                m18227t(this.f19321n, false);
            }
            imageView = null;
        } else {
            m18227t(this.f19321n, true);
            m18227t(this.f19322o, false);
            imageView = this.f19321n;
        }
        if (imageView != null) {
            int measuredWidth = this.f19321n.getMeasuredWidth();
            ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).leftMargin = (this.f19328u - this.f19326s) - (measuredWidth / 2);
        }
    }

    /* renamed from: v */
    public void mo18229v(View view) {
        m18226s(1);
        m18219o(view);
    }

    public AbstractC9641c(Context context, int i10) {
        super(context);
        this.f19319l = 0;
        this.f19320m = 0;
        this.f19326s = -1;
        this.f19327t = -1;
        this.f19329v = 0;
        this.f19330w = 0;
        this.f19331x = 0;
        this.f19323p = 4;
        this.f19324q = i10;
        this.f19325r = i10;
    }
}
