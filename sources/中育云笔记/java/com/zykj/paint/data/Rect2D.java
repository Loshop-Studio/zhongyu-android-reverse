package com.zykj.paint.data;

import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: classes6.dex */
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
        double d10;
        double d11;
        if (rect2D == null) {
            double d12 = vector2D.f19847x;
            double d13 = vector2D.f19848y;
            return new Rect2D(d12, d13, d12, d13);
        }
        double d14 = rect2D.minX;
        double d15 = vector2D.f19847x;
        if (d14 >= d15) {
            d14 = d15;
        }
        double d16 = rect2D.minY;
        double d17 = vector2D.f19848y;
        if (d16 >= d17) {
            d16 = d17;
        }
        double d18 = rect2D.maxX;
        if (d18 > d15) {
            d15 = d18;
        }
        double d19 = rect2D.maxY;
        if (d19 > d17) {
            double d20 = d16;
            d10 = d15;
            d11 = d20;
            d17 = d19;
        } else {
            double d21 = d16;
            d10 = d15;
            d11 = d21;
        }
        return new Rect2D(d14, d11, d10, d17);
    }

    public static Rect2D nestRect(Rect2D rect2D, Rect2D rect2D2) {
        if (rect2D == null) {
            return rect2D2;
        }
        if (rect2D2 == null) {
            return rect2D;
        }
        double d10 = rect2D.minX;
        double d11 = rect2D2.minX;
        if (d10 >= d11) {
            d10 = d11;
        }
        double d12 = rect2D.minY;
        double d13 = rect2D2.minY;
        if (d12 >= d13) {
            d12 = d13;
        }
        double d14 = rect2D.maxX;
        double d15 = rect2D2.maxX;
        if (d14 <= d15) {
            d14 = d15;
        }
        double d16 = rect2D.maxY;
        double d17 = rect2D2.maxY;
        if (d16 <= d17) {
            d16 = d17;
        }
        return new Rect2D(d10, d12, d14, d16);
    }

    public static Rect2D scaleRect(Rect2D rect2D, double d10) {
        double width = rect2D.getWidth() * 0.5d * (d10 - 1.0d);
        double height = rect2D.getHeight() * 0.5d * d10;
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
        vector2D.f19847x = (this.minX + this.maxX) * 0.5d;
        double d10 = this.minY;
        vector2D.f19848y = (d10 + d10) * 0.5d;
        return vector2D;
    }

    public double getWidth() {
        return this.width;
    }

    public boolean isInBox(Vector2D vector2D) {
        double d10 = vector2D.f19847x;
        if (d10 < this.minX || d10 > this.maxX) {
            return false;
        }
        double d11 = vector2D.f19848y;
        return d11 >= this.minY && d11 <= this.maxY;
    }

    public boolean isRectCross(Rect2D rect2D) {
        return rect2D.maxX >= this.minX && rect2D.maxY >= this.minY && rect2D.minX <= this.maxX && rect2D.minY <= this.maxY;
    }

    public void move(Vector2D vector2D) {
        double d10 = this.minX;
        double d11 = vector2D.f19847x;
        this.minX = d10 + d11;
        this.maxX += d11;
        double d12 = this.minY;
        double d13 = vector2D.f19848y;
        this.minY = d12 + d13;
        this.maxY += d13;
    }

    public void setMiddle(Vector2D vector2D) {
        vector2D.f19847x = (this.minX + this.maxX) * 0.5d;
        double d10 = this.minY;
        vector2D.f19848y = (d10 + d10) * 0.5d;
    }

    public Rect toRect() {
        return new Rect((int) this.minX, (int) this.minY, (int) getWidth(), (int) getHeight());
    }

    public Rect2D(double d10, double d11, double d12, double d13) {
        this.minX = d10;
        this.minY = d11;
        this.maxX = d12;
        this.maxY = d13;
        this.width = d12 - d10;
        this.height = d13 - d11;
    }

    public boolean isInBox(Vector2D vector2D, double d10) {
        double d11 = vector2D.f19847x;
        if (d11 < this.minX - d10 || d11 > this.maxX - d10) {
            return false;
        }
        double d12 = vector2D.f19848y;
        return d12 >= this.minY + d10 && d12 <= this.maxY + d10;
    }
}
