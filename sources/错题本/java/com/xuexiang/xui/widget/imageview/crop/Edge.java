package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import android.support.v4.media.AbstractC0037f;
import android.view.View;
import androidx.camera.video.AudioStats;
import androidx.collection.AbstractC0584a;
import p135p2.AbstractC6359b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class Edge {
    public static final Edge BOTTOM;
    public static final Edge LEFT;
    public static final int MIN_CROP_LENGTH_PX = 40;
    public static final Edge RIGHT;
    public static final Edge TOP;

    /* renamed from: a */
    public static final /* synthetic */ Edge[] f4387a;
    private float mCoordinate;

    static {
        Edge edge = new Edge("LEFT", 0);
        LEFT = edge;
        Edge edge2 = new Edge("TOP", 1);
        TOP = edge2;
        Edge edge3 = new Edge("RIGHT", 2);
        RIGHT = edge3;
        Edge edge4 = new Edge("BOTTOM", 3);
        BOTTOM = edge4;
        f4387a = new Edge[]{edge, edge2, edge3, edge4};
    }

    /* renamed from: a */
    public static boolean m3500a(float f, float f7, float f8, Rect rect, float f9) {
        return f < ((float) rect.top) || f7 < ((float) rect.left) || f8 > ((float) rect.bottom) || f9 > ((float) rect.right);
    }

    public static float getHeight() {
        return BOTTOM.getCoordinate() - TOP.getCoordinate();
    }

    public static float getWidth() {
        return RIGHT.getCoordinate() - LEFT.getCoordinate();
    }

    public static Edge valueOf(String str) {
        return (Edge) Enum.valueOf(Edge.class, str);
    }

    public static Edge[] values() {
        return (Edge[]) f4387a.clone();
    }

    public void adjustCoordinate(float f, float f7, Rect rect, float f8, float f9) {
        int i = AbstractC6359b.f10397a[ordinal()];
        if (i == 1) {
            float fMin = rect.left;
            if (f - fMin >= f8) {
                Edge edge = RIGHT;
                fMin = Math.min(f, Math.min(f >= edge.getCoordinate() - 40.0f ? edge.getCoordinate() - 40.0f : Float.POSITIVE_INFINITY, (edge.getCoordinate() - f) / f9 <= 40.0f ? edge.getCoordinate() - (f9 * 40.0f) : Float.POSITIVE_INFINITY));
            }
            this.mCoordinate = fMin;
            return;
        }
        if (i == 2) {
            float fMin2 = rect.top;
            if (f7 - fMin2 >= f8) {
                Edge edge2 = BOTTOM;
                fMin2 = Math.min(f7, Math.min(f7 >= edge2.getCoordinate() - 40.0f ? edge2.getCoordinate() - 40.0f : Float.POSITIVE_INFINITY, (edge2.getCoordinate() - f7) * f9 <= 40.0f ? edge2.getCoordinate() - (40.0f / f9) : Float.POSITIVE_INFINITY));
            }
            this.mCoordinate = fMin2;
            return;
        }
        if (i == 3) {
            float fMax = rect.right;
            if (fMax - f >= f8) {
                Edge edge3 = LEFT;
                fMax = Math.max(f, Math.max(f <= edge3.getCoordinate() + 40.0f ? edge3.getCoordinate() + 40.0f : Float.NEGATIVE_INFINITY, (f - edge3.getCoordinate()) / f9 <= 40.0f ? (f9 * 40.0f) + edge3.getCoordinate() : Float.NEGATIVE_INFINITY));
            }
            this.mCoordinate = fMax;
            return;
        }
        if (i != 4) {
            return;
        }
        float fMax2 = rect.bottom;
        if (fMax2 - f7 >= f8) {
            Edge edge4 = TOP;
            fMax2 = Math.max(f7, Math.max((f7 - edge4.getCoordinate()) * f9 <= 40.0f ? (40.0f / f9) + edge4.getCoordinate() : Float.NEGATIVE_INFINITY, f7 <= edge4.getCoordinate() + 40.0f ? edge4.getCoordinate() + 40.0f : Float.NEGATIVE_INFINITY));
        }
        this.mCoordinate = fMax2;
    }

    public float getCoordinate() {
        return this.mCoordinate;
    }

    public boolean isNewRectangleOutOfBounds(Edge edge, Rect rect, float f) {
        float fSnapOffset = edge.snapOffset(rect);
        int i = AbstractC6359b.f10397a[ordinal()];
        if (i == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f7 = rect.top;
                float coordinate = BOTTOM.getCoordinate() - fSnapOffset;
                float coordinate2 = RIGHT.getCoordinate();
                return m3500a(f7, coordinate2 - ((coordinate - f7) * f), coordinate, rect, coordinate2);
            }
            if (edge.equals(BOTTOM)) {
                float f8 = rect.bottom;
                float coordinate3 = edge2.getCoordinate() - fSnapOffset;
                float coordinate4 = RIGHT.getCoordinate();
                return m3500a(coordinate3, coordinate4 - ((f8 - coordinate3) * f), f8, rect, coordinate4);
            }
        } else if (i == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f9 = rect.left;
                float coordinate5 = RIGHT.getCoordinate() - fSnapOffset;
                float coordinate6 = BOTTOM.getCoordinate();
                return m3500a(coordinate6 - ((coordinate5 - f9) / f), f9, coordinate6, rect, coordinate5);
            }
            if (edge.equals(RIGHT)) {
                float f10 = rect.right;
                float coordinate7 = edge3.getCoordinate() - fSnapOffset;
                float coordinate8 = BOTTOM.getCoordinate();
                return m3500a(coordinate8 - ((f10 - coordinate7) / f), coordinate7, coordinate8, rect, f10);
            }
        } else if (i == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f11 = rect.top;
                float coordinate9 = BOTTOM.getCoordinate() - fSnapOffset;
                float coordinate10 = LEFT.getCoordinate();
                return m3500a(f11, coordinate10, coordinate9, rect, AbstractC0037f.m77b(coordinate9, f11, f, coordinate10));
            }
            if (edge.equals(BOTTOM)) {
                float f12 = rect.bottom;
                float coordinate11 = edge4.getCoordinate() - fSnapOffset;
                float coordinate12 = LEFT.getCoordinate();
                return m3500a(coordinate11, coordinate12, f12, rect, AbstractC0037f.m77b(f12, coordinate11, f, coordinate12));
            }
        } else if (i == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f13 = rect.left;
                float coordinate13 = RIGHT.getCoordinate() - fSnapOffset;
                float coordinate14 = TOP.getCoordinate();
                return m3500a(coordinate14, f13, AbstractC0584a.m900a(coordinate13, f13, f, coordinate14), rect, coordinate13);
            }
            if (edge.equals(RIGHT)) {
                float f14 = rect.right;
                float coordinate15 = edge5.getCoordinate() - fSnapOffset;
                float coordinate16 = TOP.getCoordinate();
                return m3500a(coordinate16, coordinate15, AbstractC0584a.m900a(f14, coordinate15, f, coordinate16), rect, f14);
            }
        }
        return true;
    }

    public boolean isOutsideFrame(Rect rect) {
        int i = AbstractC6359b.f10397a[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i == 4 && ((double) (((float) rect.bottom) - this.mCoordinate)) < AudioStats.AUDIO_AMPLITUDE_NONE : ((double) (((float) rect.right) - this.mCoordinate)) < AudioStats.AUDIO_AMPLITUDE_NONE : ((double) (this.mCoordinate - ((float) rect.top))) < AudioStats.AUDIO_AMPLITUDE_NONE : ((double) (this.mCoordinate - ((float) rect.left))) < AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public boolean isOutsideMargin(Rect rect, float f) {
        int i = AbstractC6359b.f10397a[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i == 4 && ((float) rect.bottom) - this.mCoordinate < f : ((float) rect.right) - this.mCoordinate < f : this.mCoordinate - ((float) rect.top) < f : this.mCoordinate - ((float) rect.left) < f;
    }

    public void offset(float f) {
        this.mCoordinate += f;
    }

    public void setCoordinate(float f) {
        this.mCoordinate = f;
    }

    public float snapOffset(Rect rect) {
        int i;
        float f;
        float f7 = this.mCoordinate;
        int i8 = AbstractC6359b.f10397a[ordinal()];
        if (i8 == 1) {
            i = rect.left;
        } else if (i8 == 2) {
            i = rect.top;
        } else if (i8 == 3) {
            i = rect.right;
        } else {
            if (i8 != 4) {
                f = f7;
                return f - f7;
            }
            i = rect.bottom;
        }
        f = i;
        return f - f7;
    }

    public float snapToRect(Rect rect) {
        float f = this.mCoordinate;
        int i = AbstractC6359b.f10397a[ordinal()];
        if (i == 1) {
            this.mCoordinate = rect.left;
        } else if (i == 2) {
            this.mCoordinate = rect.top;
        } else if (i == 3) {
            this.mCoordinate = rect.right;
        } else if (i == 4) {
            this.mCoordinate = rect.bottom;
        }
        return this.mCoordinate - f;
    }

    public void snapToView(View view) {
        int i = AbstractC6359b.f10397a[ordinal()];
        if (i == 1) {
            this.mCoordinate = 0.0f;
            return;
        }
        if (i == 2) {
            this.mCoordinate = 0.0f;
        } else if (i == 3) {
            this.mCoordinate = view.getWidth();
        } else {
            if (i != 4) {
                return;
            }
            this.mCoordinate = view.getHeight();
        }
    }

    public void adjustCoordinate(float f) {
        float coordinate = LEFT.getCoordinate();
        float coordinate2 = TOP.getCoordinate();
        float coordinate3 = RIGHT.getCoordinate();
        float coordinate4 = BOTTOM.getCoordinate();
        int i = AbstractC6359b.f10397a[ordinal()];
        if (i == 1) {
            this.mCoordinate = coordinate3 - ((coordinate4 - coordinate2) * f);
            return;
        }
        if (i == 2) {
            this.mCoordinate = coordinate4 - ((coordinate3 - coordinate) / f);
        } else if (i == 3) {
            this.mCoordinate = AbstractC0037f.m77b(coordinate4, coordinate2, f, coordinate);
        } else {
            if (i != 4) {
                return;
            }
            this.mCoordinate = AbstractC0584a.m900a(coordinate3, coordinate, f, coordinate2);
        }
    }
}
