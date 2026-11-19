package p000a.p005b.p014h;

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
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p000a.p031h.p035d.p036l.InterfaceC0213a;

/* renamed from: a.b.h.m */
/* loaded from: classes.dex */
public class C0093m {

    /* renamed from: c */
    public static final int[] f705c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final ProgressBar f706a;

    /* renamed from: b */
    public Bitmap f707b;

    public C0093m(ProgressBar progressBar) {
        this.f706a = progressBar;
    }

    /* renamed from: a */
    public void mo363a(AttributeSet attributeSet, int i) {
        C0110u0 c0110u0M414q = C0110u0.m414q(this.f706a.getContext(), attributeSet, f705c, i, 0);
        Drawable drawableM422h = c0110u0M414q.m422h(0);
        if (drawableM422h != null) {
            ProgressBar progressBar = this.f706a;
            if (drawableM422h instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM422h;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM364b = m364b(animationDrawable.getFrame(i2), true);
                    drawableM364b.setLevel(10000);
                    animationDrawable2.addFrame(drawableM364b, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM422h = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(drawableM422h);
        }
        Drawable drawableM422h2 = c0110u0M414q.m422h(1);
        if (drawableM422h2 != null) {
            this.f706a.setProgressDrawable(m364b(drawableM422h2, false));
        }
        c0110u0M414q.f810b.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final Drawable m364b(Drawable drawable, boolean z) {
        if (drawable instanceof InterfaceC0213a) {
            InterfaceC0213a interfaceC0213a = (InterfaceC0213a) drawable;
            Drawable drawableM786a = interfaceC0213a.m786a();
            if (drawableM786a != null) {
                interfaceC0213a.m787b(m364b(drawableM786a, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = m364b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f707b == null) {
                    this.f707b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
