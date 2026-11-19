package androidx.constraintlayout.core.widgets;

/* loaded from: classes2.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f374x;

    /* renamed from: y */
    public int f375y;

    public boolean contains(int i6, int i7) {
        int i8;
        int i9 = this.f374x;
        return i6 >= i9 && i6 < i9 + this.width && i7 >= (i8 = this.f375y) && i7 < i8 + this.height;
    }

    public int getCenterX() {
        return (this.f374x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f375y + this.height) / 2;
    }

    public void grow(int i6, int i7) {
        this.f374x -= i6;
        this.f375y -= i7;
        this.width += i6 * 2;
        this.height += i7 * 2;
    }

    public boolean intersects(Rectangle rectangle) {
        int i6;
        int i7;
        int i8 = this.f374x;
        int i9 = rectangle.f374x;
        return i8 >= i9 && i8 < i9 + rectangle.width && (i6 = this.f375y) >= (i7 = rectangle.f375y) && i6 < i7 + rectangle.height;
    }

    public void setBounds(int i6, int i7, int i8, int i9) {
        this.f374x = i6;
        this.f375y = i7;
        this.width = i8;
        this.height = i9;
    }
}
