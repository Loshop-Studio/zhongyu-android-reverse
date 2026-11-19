package p000a.p005b.p014h;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* renamed from: a.b.h.b */
/* loaded from: classes.dex */
public class C0070b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f553a;

    public C0070b(ActionBarContainer actionBarContainer) {
        this.f553a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f553a;
        if (actionBarContainer.f2776i) {
            Drawable drawable = actionBarContainer.f2775h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f2773f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f553a;
        Drawable drawable3 = actionBarContainer2.f2774g;
        if (drawable3 == null || !actionBarContainer2.f2777j) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f553a;
        if (actionBarContainer.f2776i) {
            drawable = actionBarContainer.f2775h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f2773f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
