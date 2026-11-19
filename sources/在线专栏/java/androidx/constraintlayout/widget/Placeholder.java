package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p121n.C2869e;

/* loaded from: classes.dex */
public class Placeholder extends View {

    /* renamed from: a */
    private int f1941a;

    /* renamed from: b */
    private View f1942b;

    /* renamed from: c */
    private int f1943c;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1941a = -1;
        this.f1942b = null;
        this.f1943c = 4;
        m1627a(attributeSet);
    }

    /* renamed from: a */
    private void m1627a(AttributeSet attributeSet) {
        super.setVisibility(this.f1943c);
        this.f1941a = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2192M2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2201N2) {
                    this.f1941a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1941a);
                } else if (index == C0298f.f2210O2) {
                    this.f1943c = typedArrayObtainStyledAttributes.getInt(index, this.f1943c);
                }
            }
        }
    }

    /* renamed from: b */
    public void m1628b(ConstraintLayout constraintLayout) {
        if (this.f1942b == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f1942b.getLayoutParams();
        layoutParams2.f1903n0.m9700E0(0);
        C2869e.b bVarM9769z = layoutParams.f1903n0.m9769z();
        C2869e.b bVar = C2869e.b.FIXED;
        if (bVarM9769z != bVar) {
            layoutParams.f1903n0.m9702F0(layoutParams2.f1903n0.m9718Q());
        }
        if (layoutParams.f1903n0.m9715N() != bVar) {
            layoutParams.f1903n0.m9737i0(layoutParams2.f1903n0.m9763w());
        }
        layoutParams2.f1903n0.m9700E0(8);
    }

    /* renamed from: c */
    public void m1629c(ConstraintLayout constraintLayout) {
        if (this.f1941a == -1 && !isInEditMode()) {
            setVisibility(this.f1943c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1941a);
        this.f1942b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).f1879b0 = true;
            this.f1942b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1942b;
    }

    public int getEmptyVisibility() {
        return this.f1943c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i4) {
        View viewFindViewById;
        if (this.f1941a == i4) {
            return;
        }
        View view = this.f1942b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f1942b.getLayoutParams()).f1879b0 = false;
            this.f1942b = null;
        }
        this.f1941a = i4;
        if (i4 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i4)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i4) {
        this.f1943c = i4;
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1941a = -1;
        this.f1942b = null;
        this.f1943c = 4;
        m1627a(attributeSet);
    }
}
