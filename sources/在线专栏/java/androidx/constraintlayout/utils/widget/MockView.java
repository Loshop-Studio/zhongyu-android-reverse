package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0298f;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class MockView extends View {

    /* renamed from: a */
    private Paint f1798a;

    /* renamed from: b */
    private Paint f1799b;

    /* renamed from: c */
    private Paint f1800c;

    /* renamed from: d */
    private boolean f1801d;

    /* renamed from: e */
    private boolean f1802e;

    /* renamed from: f */
    protected String f1803f;

    /* renamed from: g */
    private Rect f1804g;

    /* renamed from: h */
    private int f1805h;

    /* renamed from: i */
    private int f1806i;

    /* renamed from: j */
    private int f1807j;

    /* renamed from: k */
    private int f1808k;

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1798a = new Paint();
        this.f1799b = new Paint();
        this.f1800c = new Paint();
        this.f1801d = true;
        this.f1802e = true;
        this.f1803f = null;
        this.f1804g = new Rect();
        this.f1805h = Color.argb(255, 0, 0, 0);
        this.f1806i = Color.argb(255, 200, 200, 200);
        this.f1807j = Color.argb(255, 50, 50, 50);
        this.f1808k = 4;
        m1585a(context, attributeSet);
    }

    /* renamed from: a */
    private void m1585a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0298f.f2478q6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2496s6) {
                    this.f1803f = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == C0298f.f2523v6) {
                    this.f1801d = typedArrayObtainStyledAttributes.getBoolean(index, this.f1801d);
                } else if (index == C0298f.f2487r6) {
                    this.f1805h = typedArrayObtainStyledAttributes.getColor(index, this.f1805h);
                } else if (index == C0298f.f2505t6) {
                    this.f1807j = typedArrayObtainStyledAttributes.getColor(index, this.f1807j);
                } else if (index == C0298f.f2514u6) {
                    this.f1806i = typedArrayObtainStyledAttributes.getColor(index, this.f1806i);
                } else if (index == C0298f.f2532w6) {
                    this.f1802e = typedArrayObtainStyledAttributes.getBoolean(index, this.f1802e);
                }
            }
        }
        if (this.f1803f == null) {
            try {
                this.f1803f = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f1798a.setColor(this.f1805h);
        this.f1798a.setAntiAlias(true);
        this.f1799b.setColor(this.f1806i);
        this.f1799b.setAntiAlias(true);
        this.f1800c.setColor(this.f1807j);
        this.f1808k = Math.round(this.f1808k * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f1801d) {
            width--;
            height--;
            float f4 = width;
            float f5 = height;
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f4, f5, this.f1798a);
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, f5, f4, IGoodView.DEFAULT_TO_ALPHA, this.f1798a);
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, f4, IGoodView.DEFAULT_TO_ALPHA, this.f1798a);
            canvas.drawLine(f4, IGoodView.DEFAULT_TO_ALPHA, f4, f5, this.f1798a);
            canvas.drawLine(f4, f5, IGoodView.DEFAULT_TO_ALPHA, f5, this.f1798a);
            canvas.drawLine(IGoodView.DEFAULT_TO_ALPHA, f5, IGoodView.DEFAULT_TO_ALPHA, IGoodView.DEFAULT_TO_ALPHA, this.f1798a);
        }
        String str = this.f1803f;
        if (str == null || !this.f1802e) {
            return;
        }
        this.f1799b.getTextBounds(str, 0, str.length(), this.f1804g);
        float fWidth = (width - this.f1804g.width()) / 2.0f;
        float fHeight = ((height - this.f1804g.height()) / 2.0f) + this.f1804g.height();
        this.f1804g.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f1804g;
        int i4 = rect.left;
        int i5 = this.f1808k;
        rect.set(i4 - i5, rect.top - i5, rect.right + i5, rect.bottom + i5);
        canvas.drawRect(this.f1804g, this.f1800c);
        canvas.drawText(this.f1803f, fWidth, fHeight, this.f1799b);
    }

    public MockView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1798a = new Paint();
        this.f1799b = new Paint();
        this.f1800c = new Paint();
        this.f1801d = true;
        this.f1802e = true;
        this.f1803f = null;
        this.f1804g = new Rect();
        this.f1805h = Color.argb(255, 0, 0, 0);
        this.f1806i = Color.argb(255, 200, 200, 200);
        this.f1807j = Color.argb(255, 50, 50, 50);
        this.f1808k = 4;
        m1585a(context, attributeSet);
    }
}
