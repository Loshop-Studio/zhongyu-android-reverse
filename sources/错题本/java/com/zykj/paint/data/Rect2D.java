package com.zykj.paint.data;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public class Rect2D {
    private double height;
    public double maxX;
    public double maxY;
    public double minX;
    public double minY;
    private double width;

    public Rect2D() {
    }

    public static Rect2D nestPoint(Rect2D rect2D, Vector2D vector2D) {
        double d9;
        double d10;
        if (rect2D == null) {
            double d11 = vector2D.f8118x;
            double d12 = vector2D.f8119y;
            return new Rect2D(d11, d12, d11, d12);
        }
        double d13 = rect2D.minX;
        double d14 = vector2D.f8118x;
        if (d13 >= d14) {
            d13 = d14;
        }
        double d15 = rect2D.minY;
        double d16 = vector2D.f8119y;
        if (d15 >= d16) {
            d15 = d16;
        }
        double d17 = rect2D.maxX;
        if (d17 > d14) {
            d14 = d17;
        }
        double d18 = rect2D.maxY;
        if (d18 > d16) {
            double d19 = d15;
            d9 = d14;
            d10 = d19;
            d16 = d18;
        } else {
            double d20 = d15;
            d9 = d14;
            d10 = d20;
        }
        return new Rect2D(d13, d10, d9, d16);
    }

    public static Rect2D nestRect(Rect2D rect2D, Rect2D rect2D2) {
        if (rect2D == null) {
            return rect2D2;
        }
        if (rect2D2 == null) {
            return rect2D;
        }
        double d9 = rect2D.minX;
        double d10 = rect2D2.minX;
        if (d9 >= d10) {
            d9 = d10;
        }
        double d11 = rect2D.minY;
        double d12 = rect2D2.minY;
        if (d11 >= d12) {
            d11 = d12;
        }
        double d13 = rect2D.maxX;
        double d14 = rect2D2.maxX;
        if (d13 <= d14) {
            d13 = d14;
        }
        double d15 = rect2D.maxY;
        double d16 = rect2D2.maxY;
        if (d15 <= d16) {
            d15 = d16;
        }
        return new Rect2D(d9, d11, d13, d15);
    }

    public static Rect2D scaleRect(Rect2D rect2D, double d9) {
        double width = (d9 - 1.0d) * rect2D.getWidth() * 0.5d;
        double height = rect2D.getHeight() * 0.5d * d9;
        return new Rect2D(rect2D.minX - width, rect2D.minY - height, rect2D.maxX + width, rect2D.maxY + height);
    }

    public RectF ToRectF() {
        return new RectF((float) this.minX, (float) this.minY, (float) getWidth(), (float) getHeight());
    }

    public double getHeight() {
        return this.height;
    }

    public Vector2D getMiddle() {
        Vector2D vector2D = new Vector2D();
        vector2D.f8118x = (this.minX + this.maxX) * 0.5d;
        double d9 = this.minY;
        vector2D.f8119y = (d9 + d9) * 0.5d;
        return vector2D;
    }

    public double getWidth() {
        return this.width;
    }

    public boolean isInBox(Vector2D vector2D) {
        double d9 = vector2D.f8118x;
        if (d9 < this.minX || d9 > this.maxX) {
            return false;
        }
        double d10 = vector2D.f8119y;
        return d10 >= this.minY && d10 <= this.maxY;
    }

    public boolean isRectCross(Rect2D rect2D) {
        return rect2D.maxX >= this.minX && rect2D.maxY >= this.minY && rect2D.minX <= this.maxX && rect2D.minY <= this.maxY;
    }

    public void move(Vector2D vector2D) {
        double d9 = this.minX;
        double d10 = vector2D.f8118x;
        this.minX = d9 + d10;
        this.maxX += d10;
        double d11 = this.minY;
        double d12 = vector2D.f8119y;
        this.minY = d11 + d12;
        this.maxY += d12;
    }

    public void setMiddle(Vector2D vector2D) {
        vector2D.f8118x = (this.minX + this.maxX) * 0.5d;
        double d9 = this.minY;
        vector2D.f8119y = (d9 + d9) * 0.5d;
    }

    public Rect toRect() {
        return new Rect((int) this.minX, (int) this.minY, (int) getWidth(), (int) getHeight());
    }

    public Rect2D(double d9, double d10, double d11, double d12) {
        this.minX = d9;
        this.minY = d10;
        this.maxX = d11;
        this.maxY = d12;
        this.width = d11 - d9;
        this.height = d12 - d10;
    }

    public boolean isInBox(Vector2D vector2D, double d9) {
        double d10 = vector2D.f8118x;
        if (d10 < this.minX - d9 || d10 > this.maxX - d9) {
            return false;
        }
        double d11 = vector2D.f8119y;
        return d11 >= this.minY + d9 && d11 <= this.maxY + d9;
    }
}
