package com.xuexiang.xui.widget.popupwindow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Html;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.material3.AbstractC1923c;
import com.xuexiang.xui.R$attr;
import kotlin.collections.AbstractC5806u;
import p072h3.AbstractC5621a;
import p072h3.InterfaceC5622b;
import p072h3.InterfaceC5623c;
import p072h3.InterfaceC5624d;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class ViewTooltip$TooltipView extends FrameLayout {

    /* renamed from: a */
    public View f4611a;

    /* renamed from: b */
    public int f4612b;

    /* renamed from: c */
    public Path f4613c;

    /* renamed from: d */
    public final Paint f4614d;

    /* renamed from: e */
    public ViewTooltip$Position f4615e;

    /* renamed from: f */
    public ViewTooltip$ALIGN f4616f;

    /* renamed from: g */
    public int f4617g;

    /* renamed from: h */
    public final int f4618h;

    /* renamed from: i */
    public final int f4619i;

    /* renamed from: j */
    public final int f4620j;

    /* renamed from: k */
    public final int f4621k;

    public ViewTooltip$TooltipView(Context context) {
        super(context);
        this.f4612b = Color.parseColor("#B2299EE3");
        this.f4615e = ViewTooltip$Position.BOTTOM;
        this.f4616f = ViewTooltip$ALIGN.CENTER;
        this.f4617g = 30;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.f4611a = textView;
        textView.setTextColor(-1);
        addView(this.f4611a, -2, -2);
        this.f4611a.setPadding(0, 0, 0, 0);
        Paint paint = new Paint(1);
        this.f4614d = paint;
        paint.setColor(this.f4612b);
        paint.setStyle(Paint.Style.FILL);
        int iM5253G = AbstractC5806u.m5253G(getContext(), R$attr.xui_tip_popup_padding_top, -1);
        this.f4619i = iM5253G;
        this.f4618h = iM5253G;
        int iM5253G2 = AbstractC5806u.m5253G(getContext(), R$attr.xui_tip_popup_padding_left, -1);
        this.f4621k = iM5253G2;
        this.f4620j = iM5253G2;
        AbstractC6582a.m6218b();
        setTextTypeFace(null);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f4613c;
        if (path != null) {
            canvas.drawPath(path, this.f4614d);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i8, int i9, int i10) {
        super.onSizeChanged(i, i8, i9, i10);
        new RectF(0.0f, 0.0f, i, i8);
        this.f4613c = new Path();
    }

    public void setAlign(ViewTooltip$ALIGN viewTooltip$ALIGN) {
        this.f4616f = viewTooltip$ALIGN;
        postInvalidate();
    }

    public void setAutoHide(boolean z8) {
    }

    public void setClickToHide(boolean z8) {
    }

    public void setColor(int i) {
        this.f4612b = i;
        this.f4614d.setColor(i);
        postInvalidate();
    }

    public void setCorner(int i) {
        this.f4617g = i;
    }

    public void setCustomView(View view) {
        removeView(this.f4611a);
        this.f4611a = view;
        addView(view, -2, -2);
    }

    public void setDuration(long j7) {
    }

    public void setPosition(ViewTooltip$Position viewTooltip$Position) {
        this.f4615e = viewTooltip$Position;
        int i = AbstractC5621a.f8754a[viewTooltip$Position.ordinal()];
        int i8 = this.f4619i;
        int i9 = this.f4620j;
        int i10 = this.f4618h;
        int i11 = this.f4621k;
        if (i == 1) {
            setPaddingRelative(i11, i10, i9, i8 + 15);
        } else if (i == 2) {
            setPaddingRelative(i11, i10 + 15, i9, i8);
        } else if (i == 3) {
            setPaddingRelative(i11, i10, i9 + 15, i8);
        } else if (i == 4) {
            setPaddingRelative(i11 + 15, i10, i9, i8);
        }
        postInvalidate();
    }

    public void setText(String str) {
        View view = this.f4611a;
        if (view instanceof TextView) {
            ((TextView) view).setText(Html.fromHtml(str));
        }
        postInvalidate();
    }

    public void setTextColor(int i) {
        View view = this.f4611a;
        if (view instanceof TextView) {
            ((TextView) view).setTextColor(i);
        }
        postInvalidate();
    }

    public void setTextGravity(int i) {
        View view = this.f4611a;
        if (view instanceof TextView) {
            ((TextView) view).setGravity(i);
        }
        postInvalidate();
    }

    public void setTextTypeFace(Typeface typeface) {
        View view = this.f4611a;
        if (view instanceof TextView) {
            ((TextView) view).setTypeface(typeface);
        }
        postInvalidate();
    }

    public void setupPosition(Rect rect) {
        ViewTooltip$Position viewTooltip$Position = this.f4615e;
        ViewTooltip$Position viewTooltip$Position2 = ViewTooltip$Position.LEFT;
        int iM1036D = 0;
        if (viewTooltip$Position != viewTooltip$Position2 && viewTooltip$Position != ViewTooltip$Position.RIGHT) {
            int width = getWidth();
            int iWidth = rect.width();
            if (this.f4616f == ViewTooltip$ALIGN.CENTER) {
                iM1036D = (int) AbstractC1923c.m1036D(width, 1.0f, 2.0f, iWidth / 2.0f);
            }
            if (this.f4615e == ViewTooltip$Position.BOTTOM) {
                setTranslationY(rect.bottom);
                setTranslationX(rect.left + iM1036D);
                return;
            } else {
                setTranslationY(rect.top - getHeight());
                setTranslationX(rect.left + iM1036D);
                return;
            }
        }
        int height = getHeight();
        int iHeight = rect.height();
        int iMax = Math.max(iHeight, height);
        int iMin = Math.min(iHeight, height);
        int i = AbstractC5621a.f8755b[this.f4616f.ordinal()];
        if (i != 1 && i == 2) {
            iM1036D = (int) ((iMin / 2.0f) + ((iMax * (-1.0f)) / 2.0f));
        }
        if (this.f4615e == viewTooltip$Position2) {
            setTranslationY(rect.top + iM1036D);
            setTranslationX(rect.left - getWidth());
        } else {
            setTranslationY(rect.top + iM1036D);
            setTranslationX(rect.right);
        }
    }

    public void setListenerDisplay(InterfaceC5622b interfaceC5622b) {
    }

    public void setListenerHide(InterfaceC5623c interfaceC5623c) {
    }

    public void setTooltipAnimation(InterfaceC5624d interfaceC5624d) {
    }
}
