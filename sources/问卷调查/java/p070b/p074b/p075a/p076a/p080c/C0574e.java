package p070b.p074b.p075a.p076a.p080c;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: b.b.a.a.c.e */
/* loaded from: classes.dex */
public class C0574e extends Property<ImageView, Matrix> {

    /* renamed from: a */
    public final Matrix f3543a;

    public C0574e() {
        super(Matrix.class, "imageMatrixProperty");
        this.f3543a = new Matrix();
    }

    @Override // android.util.Property
    public Matrix get(ImageView imageView) {
        this.f3543a.set(imageView.getImageMatrix());
        return this.f3543a;
    }

    @Override // android.util.Property
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
