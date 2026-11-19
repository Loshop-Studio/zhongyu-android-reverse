package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import android.view.View;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public enum Edge {
    LEFT,
    TOP,
    RIGHT,
    BOTTOM;

    public static final int MIN_CROP_LENGTH_PX = 40;
    private float mCoordinate;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.Edge$1 */
    static /* synthetic */ class C21771 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge;

        static {
            int[] iArr = new int[Edge.values().length];
            $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge = iArr;
            try {
                iArr[Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static float adjustBottom(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.bottom;
        if (i4 - f4 < f5) {
            return i4;
        }
        Edge edge = TOP;
        return Math.max(f4, Math.max((f4 - edge.getCoordinate()) * f6 <= 40.0f ? edge.getCoordinate() + (40.0f / f6) : Float.NEGATIVE_INFINITY, f4 <= edge.getCoordinate() + 40.0f ? edge.getCoordinate() + 40.0f : Float.NEGATIVE_INFINITY));
    }

    private static float adjustLeft(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.left;
        if (f4 - i4 < f5) {
            return i4;
        }
        Edge edge = RIGHT;
        return Math.min(f4, Math.min(f4 >= edge.getCoordinate() - 40.0f ? edge.getCoordinate() - 40.0f : Float.POSITIVE_INFINITY, (edge.getCoordinate() - f4) / f6 <= 40.0f ? edge.getCoordinate() - (f6 * 40.0f) : Float.POSITIVE_INFINITY));
    }

    private static float adjustRight(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.right;
        if (i4 - f4 < f5) {
            return i4;
        }
        Edge edge = LEFT;
        return Math.max(f4, Math.max(f4 <= edge.getCoordinate() + 40.0f ? edge.getCoordinate() + 40.0f : Float.NEGATIVE_INFINITY, (f4 - edge.getCoordinate()) / f6 <= 40.0f ? edge.getCoordinate() + (f6 * 40.0f) : Float.NEGATIVE_INFINITY));
    }

    private static float adjustTop(float f4, Rect rect, float f5, float f6) {
        int i4 = rect.top;
        if (f4 - i4 < f5) {
            return i4;
        }
        Edge edge = BOTTOM;
        return Math.min(f4, Math.min(f4 >= edge.getCoordinate() - 40.0f ? edge.getCoordinate() - 40.0f : Float.POSITIVE_INFINITY, (edge.getCoordinate() - f4) * f6 <= 40.0f ? edge.getCoordinate() - (40.0f / f6) : Float.POSITIVE_INFINITY));
    }

    public static float getHeight() {
        return BOTTOM.getCoordinate() - TOP.getCoordinate();
    }

    public static float getWidth() {
        return RIGHT.getCoordinate() - LEFT.getCoordinate();
    }

    private boolean isOutOfBounds(float f4, float f5, float f6, float f7, Rect rect) {
        return f4 < ((float) rect.top) || f5 < ((float) rect.left) || f6 > ((float) rect.bottom) || f7 > ((float) rect.right);
    }

    public void adjustCoordinate(float f4, float f5, Rect rect, float f6, float f7) {
        int i4 = C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[ordinal()];
        if (i4 == 1) {
            this.mCoordinate = adjustLeft(f4, rect, f6, f7);
            return;
        }
        if (i4 == 2) {
            this.mCoordinate = adjustTop(f5, rect, f6, f7);
        } else if (i4 == 3) {
            this.mCoordinate = adjustRight(f4, rect, f6, f7);
        } else {
            if (i4 != 4) {
                return;
            }
            this.mCoordinate = adjustBottom(f5, rect, f6, f7);
        }
    }

    public float getCoordinate() {
        return this.mCoordinate;
    }

    public boolean isNewRectangleOutOfBounds(Edge edge, Rect rect, float f4) {
        float fSnapOffset = edge.snapOffset(rect);
        int i4 = C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[ordinal()];
        if (i4 == 1) {
            Edge edge2 = TOP;
            if (edge.equals(edge2)) {
                float f5 = rect.top;
                float coordinate = BOTTOM.getCoordinate() - fSnapOffset;
                float coordinate2 = RIGHT.getCoordinate();
                return isOutOfBounds(f5, AspectRatioUtil.calculateLeft(f5, coordinate2, coordinate, f4), coordinate, coordinate2, rect);
            }
            if (edge.equals(BOTTOM)) {
                float f6 = rect.bottom;
                float coordinate3 = edge2.getCoordinate() - fSnapOffset;
                float coordinate4 = RIGHT.getCoordinate();
                return isOutOfBounds(coordinate3, AspectRatioUtil.calculateLeft(coordinate3, coordinate4, f6, f4), f6, coordinate4, rect);
            }
        } else if (i4 == 2) {
            Edge edge3 = LEFT;
            if (edge.equals(edge3)) {
                float f7 = rect.left;
                float coordinate5 = RIGHT.getCoordinate() - fSnapOffset;
                float coordinate6 = BOTTOM.getCoordinate();
                return isOutOfBounds(AspectRatioUtil.calculateTop(f7, coordinate5, coordinate6, f4), f7, coordinate6, coordinate5, rect);
            }
            if (edge.equals(RIGHT)) {
                float f8 = rect.right;
                float coordinate7 = edge3.getCoordinate() - fSnapOffset;
                float coordinate8 = BOTTOM.getCoordinate();
                return isOutOfBounds(AspectRatioUtil.calculateTop(coordinate7, f8, coordinate8, f4), coordinate7, coordinate8, f8, rect);
            }
        } else if (i4 == 3) {
            Edge edge4 = TOP;
            if (edge.equals(edge4)) {
                float f9 = rect.top;
                float coordinate9 = BOTTOM.getCoordinate() - fSnapOffset;
                float coordinate10 = LEFT.getCoordinate();
                return isOutOfBounds(f9, coordinate10, coordinate9, AspectRatioUtil.calculateRight(coordinate10, f9, coordinate9, f4), rect);
            }
            if (edge.equals(BOTTOM)) {
                float f10 = rect.bottom;
                float coordinate11 = edge4.getCoordinate() - fSnapOffset;
                float coordinate12 = LEFT.getCoordinate();
                return isOutOfBounds(coordinate11, coordinate12, f10, AspectRatioUtil.calculateRight(coordinate12, coordinate11, f10, f4), rect);
            }
        } else if (i4 == 4) {
            Edge edge5 = LEFT;
            if (edge.equals(edge5)) {
                float f11 = rect.left;
                float coordinate13 = RIGHT.getCoordinate() - fSnapOffset;
                float coordinate14 = TOP.getCoordinate();
                return isOutOfBounds(coordinate14, f11, AspectRatioUtil.calculateBottom(f11, coordinate14, coordinate13, f4), coordinate13, rect);
            }
            if (edge.equals(RIGHT)) {
                float f12 = rect.right;
                float coordinate15 = edge5.getCoordinate() - fSnapOffset;
                float coordinate16 = TOP.getCoordinate();
                return isOutOfBounds(coordinate16, coordinate15, AspectRatioUtil.calculateBottom(coordinate15, coordinate16, f12, f4), f12, rect);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isOutsideFrame(android.graphics.Rect r8) {
        /*
            r7 = this;
            int[] r0 = com.xuexiang.xui.widget.imageview.crop.Edge.C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge
            int r1 = r7.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == r1) goto L3c
            r5 = 2
            if (r0 == r5) goto L30
            r5 = 3
            if (r0 == r5) goto L24
            r5 = 4
            if (r0 == r5) goto L18
            goto L4a
        L18:
            int r8 = r8.bottom
            float r8 = (float) r8
            float r0 = r7.mCoordinate
            float r8 = r8 - r0
            double r5 = (double) r8
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 >= 0) goto L48
            goto L49
        L24:
            int r8 = r8.right
            float r8 = (float) r8
            float r0 = r7.mCoordinate
            float r8 = r8 - r0
            double r5 = (double) r8
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 >= 0) goto L48
            goto L49
        L30:
            float r0 = r7.mCoordinate
            int r8 = r8.top
            float r8 = (float) r8
            float r0 = r0 - r8
            double r5 = (double) r0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 >= 0) goto L48
            goto L49
        L3c:
            float r0 = r7.mCoordinate
            int r8 = r8.left
            float r8 = (float) r8
            float r0 = r0 - r8
            double r5 = (double) r0
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 >= 0) goto L48
            goto L49
        L48:
            r1 = 0
        L49:
            r2 = r1
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.crop.Edge.isOutsideFrame(android.graphics.Rect):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isOutsideMargin(android.graphics.Rect r5, float r6) {
        /*
            r4 = this;
            int[] r0 = com.xuexiang.xui.widget.imageview.crop.Edge.C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L37
            r3 = 2
            if (r0 == r3) goto L2c
            r3 = 3
            if (r0 == r3) goto L21
            r3 = 4
            if (r0 == r3) goto L16
            goto L44
        L16:
            int r5 = r5.bottom
            float r5 = (float) r5
            float r0 = r4.mCoordinate
            float r5 = r5 - r0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L21:
            int r5 = r5.right
            float r5 = (float) r5
            float r0 = r4.mCoordinate
            float r5 = r5 - r0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L2c:
            float r0 = r4.mCoordinate
            int r5 = r5.top
            float r5 = (float) r5
            float r0 = r0 - r5
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L37:
            float r0 = r4.mCoordinate
            int r5 = r5.left
            float r5 = (float) r5
            float r0 = r0 - r5
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            r2 = r1
        L44:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xuexiang.xui.widget.imageview.crop.Edge.isOutsideMargin(android.graphics.Rect, float):boolean");
    }

    public void offset(float f4) {
        this.mCoordinate += f4;
    }

    public void setCoordinate(float f4) {
        this.mCoordinate = f4;
    }

    public float snapOffset(Rect rect) {
        int i4;
        float f4;
        float f5 = this.mCoordinate;
        int i5 = C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[ordinal()];
        if (i5 == 1) {
            i4 = rect.left;
        } else if (i5 == 2) {
            i4 = rect.top;
        } else if (i5 == 3) {
            i4 = rect.right;
        } else {
            if (i5 != 4) {
                f4 = f5;
                return f4 - f5;
            }
            i4 = rect.bottom;
        }
        f4 = i4;
        return f4 - f5;
    }

    public float snapToRect(Rect rect) {
        float f4 = this.mCoordinate;
        int i4 = C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[ordinal()];
        if (i4 == 1) {
            this.mCoordinate = rect.left;
        } else if (i4 == 2) {
            this.mCoordinate = rect.top;
        } else if (i4 == 3) {
            this.mCoordinate = rect.right;
        } else if (i4 == 4) {
            this.mCoordinate = rect.bottom;
        }
        return this.mCoordinate - f4;
    }

    public void snapToView(View view) {
        int i4 = C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[ordinal()];
        if (i4 == 1) {
            this.mCoordinate = IGoodView.DEFAULT_TO_ALPHA;
            return;
        }
        if (i4 == 2) {
            this.mCoordinate = IGoodView.DEFAULT_TO_ALPHA;
        } else if (i4 == 3) {
            this.mCoordinate = view.getWidth();
        } else {
            if (i4 != 4) {
                return;
            }
            this.mCoordinate = view.getHeight();
        }
    }

    public void adjustCoordinate(float f4) {
        float coordinate = LEFT.getCoordinate();
        float coordinate2 = TOP.getCoordinate();
        float coordinate3 = RIGHT.getCoordinate();
        float coordinate4 = BOTTOM.getCoordinate();
        int i4 = C21771.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Edge[ordinal()];
        if (i4 == 1) {
            this.mCoordinate = AspectRatioUtil.calculateLeft(coordinate2, coordinate3, coordinate4, f4);
            return;
        }
        if (i4 == 2) {
            this.mCoordinate = AspectRatioUtil.calculateTop(coordinate, coordinate3, coordinate4, f4);
        } else if (i4 == 3) {
            this.mCoordinate = AspectRatioUtil.calculateRight(coordinate, coordinate2, coordinate4, f4);
        } else {
            if (i4 != 4) {
                return;
            }
            this.mCoordinate = AspectRatioUtil.calculateBottom(coordinate, coordinate2, coordinate3, f4);
        }
    }
}
