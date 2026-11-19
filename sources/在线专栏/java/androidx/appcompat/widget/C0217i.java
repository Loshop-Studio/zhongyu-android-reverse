package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p156u.InterfaceC3405c;

/* renamed from: androidx.appcompat.widget.i */
/* loaded from: classes.dex */
class C0217i {

    /* renamed from: c */
    private static final int[] f1120c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    private final ProgressBar f1121a;

    /* renamed from: b */
    private Bitmap f1122b;

    C0217i(ProgressBar progressBar) {
        this.f1121a = progressBar;
    }

    /* renamed from: a */
    private Shape m881a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    private Drawable m882d(Drawable drawable, boolean z3) {
        if (drawable instanceof InterfaceC3405c) {
            InterfaceC3405c interfaceC3405c = (InterfaceC3405c) drawable;
            Drawable drawableMo10403b = interfaceC3405c.mo10403b();
            if (drawableMo10403b != null) {
                interfaceC3405c.mo10402a(m882d(drawableMo10403b, z3));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id = layerDrawable.getId(i4);
                    drawableArr[i4] = m882d(layerDrawable.getDrawable(i4), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable2.setId(i5, layerDrawable.getId(i5));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f1122b == null) {
                    this.f1122b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m881a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z3 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m883e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i4 = 0; i4 < numberOfFrames; i4++) {
            Drawable drawableM882d = m882d(animationDrawable.getFrame(i4), true);
            drawableM882d.setLevel(10000);
            animationDrawable2.addFrame(drawableM882d, animationDrawable.getDuration(i4));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: b */
    Bitmap m884b() {
        return this.f1122b;
    }

    /* renamed from: c */
    void mo885c(AttributeSet attributeSet, int i4) {
        C0214g0 c0214g0M815v = C0214g0.m815v(this.f1121a.getContext(), attributeSet, f1120c, i4, 0);
        Drawable drawableM823h = c0214g0M815v.m823h(0);
        if (drawableM823h != null) {
            this.f1121a.setIndeterminateDrawable(m883e(drawableM823h));
        }
        Drawable drawableM823h2 = c0214g0M815v.m823h(1);
        if (drawableM823h2 != null) {
            this.f1121a.setProgressDrawable(m882d(drawableM823h2, false));
        }
        c0214g0M815v.m835w();
    }
}
