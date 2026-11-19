package androidx.constraintlayout.core.widgets;

/* loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f1392x;

    /* renamed from: y */
    public int f1393y;

    public boolean contains(int i10, int i11) {
        int i12;
        int i13 = this.f1392x;
        return i10 >= i13 && i10 < i13 + this.width && i11 >= (i12 = this.f1393y) && i11 < i12 + this.height;
    }

    public int getCenterX() {
        return (this.f1392x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f1393y + this.height) / 2;
    }

    public void grow(int i10, int i11) {
        this.f1392x -= i10;
        this.f1393y -= i11;
        this.width += i10 * 2;
        this.height += i11 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i10;
        int i11;
        int i12 = this.f1392x;
        int i13 = rectangle.f1392x;
        return i12 >= i13 && i12 < i13 + rectangle.width && (i10 = this.f1393y) >= (i11 = rectangle.f1393y) && i10 < i11 + rectangle.height;
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f1392x = i10;
        this.f1393y = i11;
        this.width = i12;
        this.height = i13;
    }
}
