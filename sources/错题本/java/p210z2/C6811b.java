package p210z2;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: z2.b */
/* loaded from: classes3.dex */
public final class C6811b extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ C6812c f11493a;

    public C6811b(C6812c c6812c) {
        this.f11493a = c6812c;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        int i8;
        int i9;
        int i10;
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            return;
        }
        C6812c c6812c = this.f11493a;
        int i11 = c6812c.f11494A;
        if (i11 > 0 && (i = c6812c.f11495B) != 0) {
            if (i == 4) {
                i8 = height;
                i9 = 0 - i11;
                i10 = 0;
            } else if (i == 1) {
                i10 = 0 - i11;
                i8 = height;
                i9 = 0;
            } else {
                if (i == 2) {
                    width += i11;
                } else if (i == 3) {
                    height += i11;
                }
                i8 = height;
                i9 = 0;
                i10 = 0;
            }
            outline.setRoundRect(i9, i10, width, i8, i11);
            return;
        }
        int paddingTop = c6812c.f11510Q;
        int iMax = Math.max(paddingTop + 1, height - c6812c.f11511R);
        int paddingLeft = c6812c.f11508O;
        int iMax2 = width - c6812c.f11509P;
        if (c6812c.f11502I) {
            paddingLeft += view.getPaddingLeft();
            paddingTop += view.getPaddingTop();
            iMax2 = Math.max(paddingLeft + 1, iMax2 - view.getPaddingRight());
            iMax = Math.max(paddingTop + 1, iMax - view.getPaddingBottom());
        }
        int i12 = paddingTop;
        int i13 = iMax;
        float f = c6812c.f11506M;
        if (c6812c.f11505L == 0) {
            f = 1.0f;
        }
        outline.setAlpha(f);
        int i14 = c6812c.f11494A;
        if (i14 <= 0) {
            outline.setRect(paddingLeft, i12, iMax2, i13);
        } else {
            outline.setRoundRect(paddingLeft, i12, iMax2, i13, i14);
        }
    }
}
