package p070b.p113c.p114a.p116e.p144h.p145a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: b.c.a.e.h.a.w */
/* loaded from: classes.dex */
public class C0877w extends C0861g implements InterfaceC0875u {

    /* renamed from: n */
    public boolean f4683n;

    public C0877w(Context context) {
        super(context);
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: a */
    public boolean mo2567a() {
        return this.f4683n;
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.InterfaceC0875u
    /* renamed from: b */
    public void mo2568b(boolean z) {
        if (this.f4683n != z) {
            this.f4683n = z;
            invalidateSelf();
        }
    }

    @Override // p070b.p113c.p114a.p116e.p144h.p145a.C0861g
    /* renamed from: h */
    public void mo2571h(Canvas canvas, Paint paint) {
        int level = getLevel();
        if (level == 0) {
            return;
        }
        int iSave = canvas.save();
        RectF rectF = C0861g.f4662l;
        canvas.scale(level / 10000.0f, 1.0f, rectF.left, 0.0f);
        canvas.drawRect(rectF, paint);
        if (this.f4683n) {
            canvas.drawRect(rectF, paint);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }
}
