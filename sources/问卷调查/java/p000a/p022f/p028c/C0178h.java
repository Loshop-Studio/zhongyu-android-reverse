package p000a.p022f.p028c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p000a.p022f.p025b.p026i.C0150d;

/* renamed from: a.f.c.h */
/* loaded from: classes.dex */
public class C0178h extends View {

    /* renamed from: b */
    public int f1373b;

    /* renamed from: c */
    public View f1374c;

    /* renamed from: d */
    public int f1375d;

    /* renamed from: a */
    public void m681a() {
        if (this.f1374c == null) {
            return;
        }
        ConstraintLayout.C0499a c0499a = (ConstraintLayout.C0499a) getLayoutParams();
        ConstraintLayout.C0499a c0499a2 = (ConstraintLayout.C0499a) this.f1374c.getLayoutParams();
        c0499a2.f3064l0.f1095X = 0;
        C0150d.a aVarM599j = c0499a.f3064l0.m599j();
        C0150d.a aVar = C0150d.a.FIXED;
        if (aVarM599j != aVar) {
            c0499a.f3064l0.m590B(c0499a2.f3064l0.m604o());
        }
        if (c0499a.f3064l0.m603n() != aVar) {
            c0499a.f3064l0.m612w(c0499a2.f3064l0.m598i());
        }
        c0499a2.f3064l0.f1095X = 8;
    }

    public View getContent() {
        return this.f1374c;
    }

    public int getEmptyVisibility() {
        return this.f1375d;
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
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f1373b == i) {
            return;
        }
        View view = this.f1374c;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0499a) this.f1374c.getLayoutParams()).f3042a0 = false;
            this.f1374c = null;
        }
        this.f1373b = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f1375d = i;
    }
}
