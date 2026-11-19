package androidx.constraintlayout.core.widgets;

/* loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f1325x;

    /* renamed from: y */
    public int f1326y;

    public boolean contains(int i9, int i10) {
        int i11;
        int i12 = this.f1325x;
        return i9 >= i12 && i9 < i12 + this.width && i10 >= (i11 = this.f1326y) && i10 < i11 + this.height;
    }

    public int getCenterX() {
        return (this.f1325x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f1326y + this.height) / 2;
    }

    public void grow(int i9, int i10) {
        this.f1325x -= i9;
        this.f1326y -= i10;
        this.width += i9 * 2;
        this.height += i10 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i9;
        int i10;
        int i11 = this.f1325x;
        int i12 = rectangle.f1325x;
        return i11 >= i12 && i11 < i12 + rectangle.width && (i9 = this.f1326y) >= (i10 = rectangle.f1326y) && i9 < i10 + rectangle.height;
    }

    public void setBounds(int i9, int i10, int i11, int i12) {
        this.f1325x = i9;
        this.f1326y = i10;
        this.width = i11;
        this.height = i12;
    }
}
