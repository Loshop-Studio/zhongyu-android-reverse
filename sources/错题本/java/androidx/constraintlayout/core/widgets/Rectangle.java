package androidx.constraintlayout.core.widgets;

/* loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f969x;

    /* renamed from: y */
    public int f970y;

    public boolean contains(int i, int i8) {
        int i9;
        int i10 = this.f969x;
        return i >= i10 && i < i10 + this.width && i8 >= (i9 = this.f970y) && i8 < i9 + this.height;
    }

    public int getCenterX() {
        return (this.f969x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f970y + this.height) / 2;
    }

    public void grow(int i, int i8) {
        this.f969x -= i;
        this.f970y -= i8;
        this.width = (i * 2) + this.width;
        this.height = (i8 * 2) + this.height;
    }

    public boolean intersects(Rectangle rectangle) {
        int i;
        int i8;
        int i9 = this.f969x;
        int i10 = rectangle.f969x;
        return i9 >= i10 && i9 < i10 + rectangle.width && (i = this.f970y) >= (i8 = rectangle.f970y) && i < i8 + rectangle.height;
    }

    public void setBounds(int i, int i8, int i9, int i10) {
        this.f969x = i;
        this.f970y = i8;
        this.width = i9;
        this.height = i10;
    }
}
