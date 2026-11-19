package androidx.constraintlayout.solver.widgets;

/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f269x;

    /* renamed from: y */
    public int f270y;

    public boolean contains(int i4, int i5) {
        int i6;
        int i7 = this.f269x;
        return i4 >= i7 && i4 < i7 + this.width && i5 >= (i6 = this.f270y) && i5 < i6 + this.height;
    }

    public int getCenterX() {
        return (this.f269x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f270y + this.height) / 2;
    }

    public void grow(int i4, int i5) {
        this.f269x -= i4;
        this.f270y -= i5;
        this.width += i4 * 2;
        this.height += i5 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i4;
        int i5;
        int i6 = this.f269x;
        int i7 = rectangle.f269x;
        return i6 >= i7 && i6 < i7 + rectangle.width && (i4 = this.f270y) >= (i5 = rectangle.f270y) && i4 < i5 + rectangle.height;
    }

    public void setBounds(int i4, int i5, int i6, int i7) {
        this.f269x = i4;
        this.f270y = i5;
        this.width = i6;
        this.height = i7;
    }
}
