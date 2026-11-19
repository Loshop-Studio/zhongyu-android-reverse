package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TOP_LEFT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class Handle {
    private static final /* synthetic */ Handle[] $VALUES;
    public static final Handle BOTTOM;
    public static final Handle BOTTOM_LEFT;
    public static final Handle BOTTOM_RIGHT;
    public static final Handle CENTER;
    public static final Handle LEFT;
    public static final Handle RIGHT;
    public static final Handle TOP;
    public static final Handle TOP_LEFT;
    public static final Handle TOP_RIGHT;
    private HandleHelper mHelper;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        Handle handle = new Handle("TOP_LEFT", 0, new HandleHelper(edge, edge2) { // from class: com.xuexiang.xui.widget.imageview.crop.CornerHandleHelper
            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                EdgePair activeEdges = getActiveEdges(f4, f5, f6);
                Edge edge3 = activeEdges.primary;
                Edge edge4 = activeEdges.secondary;
                edge3.adjustCoordinate(f4, f5, rect, f7, f6);
                edge4.adjustCoordinate(f6);
                if (edge4.isOutsideMargin(rect, f7)) {
                    edge4.snapToRect(rect);
                    edge3.adjustCoordinate(f6);
                }
            }
        });
        TOP_LEFT = handle;
        final Edge edge3 = Edge.RIGHT;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new HandleHelper(edge, edge3) { // from class: com.xuexiang.xui.widget.imageview.crop.CornerHandleHelper
            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                EdgePair activeEdges = getActiveEdges(f4, f5, f6);
                Edge edge32 = activeEdges.primary;
                Edge edge4 = activeEdges.secondary;
                edge32.adjustCoordinate(f4, f5, rect, f7, f6);
                edge4.adjustCoordinate(f6);
                if (edge4.isOutsideMargin(rect, f7)) {
                    edge4.snapToRect(rect);
                    edge32.adjustCoordinate(f6);
                }
            }
        });
        TOP_RIGHT = handle2;
        final Edge edge4 = Edge.BOTTOM;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new HandleHelper(edge4, edge2) { // from class: com.xuexiang.xui.widget.imageview.crop.CornerHandleHelper
            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                EdgePair activeEdges = getActiveEdges(f4, f5, f6);
                Edge edge32 = activeEdges.primary;
                Edge edge42 = activeEdges.secondary;
                edge32.adjustCoordinate(f4, f5, rect, f7, f6);
                edge42.adjustCoordinate(f6);
                if (edge42.isOutsideMargin(rect, f7)) {
                    edge42.snapToRect(rect);
                    edge32.adjustCoordinate(f6);
                }
            }
        });
        BOTTOM_LEFT = handle3;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new HandleHelper(edge4, edge3) { // from class: com.xuexiang.xui.widget.imageview.crop.CornerHandleHelper
            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                EdgePair activeEdges = getActiveEdges(f4, f5, f6);
                Edge edge32 = activeEdges.primary;
                Edge edge42 = activeEdges.secondary;
                edge32.adjustCoordinate(f4, f5, rect, f7, f6);
                edge42.adjustCoordinate(f6);
                if (edge42.isOutsideMargin(rect, f7)) {
                    edge42.snapToRect(rect);
                    edge32.adjustCoordinate(f6);
                }
            }
        });
        BOTTOM_RIGHT = handle4;
        Handle handle5 = new Handle("LEFT", 4, new HandleHelper(edge2) { // from class: com.xuexiang.xui.widget.imageview.crop.VerticalHandleHelper
            private Edge mEdge;

            {
                super(null, edge2);
                this.mEdge = edge2;
            }

            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                this.mEdge.adjustCoordinate(f4, f5, rect, f7, f6);
                float coordinate = Edge.LEFT.getCoordinate();
                Edge edge5 = Edge.TOP;
                float coordinate2 = edge5.getCoordinate();
                float coordinate3 = Edge.RIGHT.getCoordinate();
                Edge edge6 = Edge.BOTTOM;
                float coordinate4 = edge6.getCoordinate();
                float fCalculateHeight = (AspectRatioUtil.calculateHeight(coordinate, coordinate3, f6) - (coordinate4 - coordinate2)) / 2.0f;
                edge5.setCoordinate(coordinate2 - fCalculateHeight);
                edge6.setCoordinate(coordinate4 + fCalculateHeight);
                if (edge5.isOutsideMargin(rect, f7) && !this.mEdge.isNewRectangleOutOfBounds(edge5, rect, f6)) {
                    edge6.offset(-edge5.snapToRect(rect));
                    this.mEdge.adjustCoordinate(f6);
                }
                if (!edge6.isOutsideMargin(rect, f7) || this.mEdge.isNewRectangleOutOfBounds(edge6, rect, f6)) {
                    return;
                }
                edge5.offset(-edge6.snapToRect(rect));
                this.mEdge.adjustCoordinate(f6);
            }
        });
        LEFT = handle5;
        Handle handle6 = new Handle("TOP", 5, new HandleHelper(edge) { // from class: com.xuexiang.xui.widget.imageview.crop.HorizontalHandleHelper
            private Edge mEdge;

            {
                super(edge, null);
                this.mEdge = edge;
            }

            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                this.mEdge.adjustCoordinate(f4, f5, rect, f7, f6);
                Edge edge5 = Edge.LEFT;
                float coordinate = edge5.getCoordinate();
                float coordinate2 = Edge.TOP.getCoordinate();
                Edge edge6 = Edge.RIGHT;
                float coordinate3 = edge6.getCoordinate();
                float fCalculateWidth = (AspectRatioUtil.calculateWidth(coordinate2, Edge.BOTTOM.getCoordinate(), f6) - (coordinate3 - coordinate)) / 2.0f;
                edge5.setCoordinate(coordinate - fCalculateWidth);
                edge6.setCoordinate(coordinate3 + fCalculateWidth);
                if (edge5.isOutsideMargin(rect, f7) && !this.mEdge.isNewRectangleOutOfBounds(edge5, rect, f6)) {
                    edge6.offset(-edge5.snapToRect(rect));
                    this.mEdge.adjustCoordinate(f6);
                }
                if (!edge6.isOutsideMargin(rect, f7) || this.mEdge.isNewRectangleOutOfBounds(edge6, rect, f6)) {
                    return;
                }
                edge5.offset(-edge6.snapToRect(rect));
                this.mEdge.adjustCoordinate(f6);
            }
        });
        TOP = handle6;
        Handle handle7 = new Handle("RIGHT", 6, new HandleHelper(edge3) { // from class: com.xuexiang.xui.widget.imageview.crop.VerticalHandleHelper
            private Edge mEdge;

            {
                super(null, edge3);
                this.mEdge = edge3;
            }

            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                this.mEdge.adjustCoordinate(f4, f5, rect, f7, f6);
                float coordinate = Edge.LEFT.getCoordinate();
                Edge edge5 = Edge.TOP;
                float coordinate2 = edge5.getCoordinate();
                float coordinate3 = Edge.RIGHT.getCoordinate();
                Edge edge6 = Edge.BOTTOM;
                float coordinate4 = edge6.getCoordinate();
                float fCalculateHeight = (AspectRatioUtil.calculateHeight(coordinate, coordinate3, f6) - (coordinate4 - coordinate2)) / 2.0f;
                edge5.setCoordinate(coordinate2 - fCalculateHeight);
                edge6.setCoordinate(coordinate4 + fCalculateHeight);
                if (edge5.isOutsideMargin(rect, f7) && !this.mEdge.isNewRectangleOutOfBounds(edge5, rect, f6)) {
                    edge6.offset(-edge5.snapToRect(rect));
                    this.mEdge.adjustCoordinate(f6);
                }
                if (!edge6.isOutsideMargin(rect, f7) || this.mEdge.isNewRectangleOutOfBounds(edge6, rect, f6)) {
                    return;
                }
                edge5.offset(-edge6.snapToRect(rect));
                this.mEdge.adjustCoordinate(f6);
            }
        });
        RIGHT = handle7;
        Handle handle8 = new Handle("BOTTOM", 7, new HandleHelper(edge4) { // from class: com.xuexiang.xui.widget.imageview.crop.HorizontalHandleHelper
            private Edge mEdge;

            {
                super(edge4, null);
                this.mEdge = edge4;
            }

            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                this.mEdge.adjustCoordinate(f4, f5, rect, f7, f6);
                Edge edge5 = Edge.LEFT;
                float coordinate = edge5.getCoordinate();
                float coordinate2 = Edge.TOP.getCoordinate();
                Edge edge6 = Edge.RIGHT;
                float coordinate3 = edge6.getCoordinate();
                float fCalculateWidth = (AspectRatioUtil.calculateWidth(coordinate2, Edge.BOTTOM.getCoordinate(), f6) - (coordinate3 - coordinate)) / 2.0f;
                edge5.setCoordinate(coordinate - fCalculateWidth);
                edge6.setCoordinate(coordinate3 + fCalculateWidth);
                if (edge5.isOutsideMargin(rect, f7) && !this.mEdge.isNewRectangleOutOfBounds(edge5, rect, f6)) {
                    edge6.offset(-edge5.snapToRect(rect));
                    this.mEdge.adjustCoordinate(f6);
                }
                if (!edge6.isOutsideMargin(rect, f7) || this.mEdge.isNewRectangleOutOfBounds(edge6, rect, f6)) {
                    return;
                }
                edge5.offset(-edge6.snapToRect(rect));
                this.mEdge.adjustCoordinate(f6);
            }
        });
        BOTTOM = handle8;
        Handle handle9 = new Handle("CENTER", 8, new HandleHelper() { // from class: com.xuexiang.xui.widget.imageview.crop.CenterHandleHelper
            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, Rect rect, float f6) {
                Edge edge5 = Edge.LEFT;
                float coordinate = edge5.getCoordinate();
                Edge edge6 = Edge.TOP;
                float coordinate2 = edge6.getCoordinate();
                Edge edge7 = Edge.RIGHT;
                float coordinate3 = edge7.getCoordinate();
                Edge edge8 = Edge.BOTTOM;
                float f7 = f4 - ((coordinate + coordinate3) / 2.0f);
                float coordinate4 = f5 - ((coordinate2 + edge8.getCoordinate()) / 2.0f);
                edge5.offset(f7);
                edge6.offset(coordinate4);
                edge7.offset(f7);
                edge8.offset(coordinate4);
                if (edge5.isOutsideMargin(rect, f6)) {
                    edge7.offset(edge5.snapToRect(rect));
                } else if (edge7.isOutsideMargin(rect, f6)) {
                    edge5.offset(edge7.snapToRect(rect));
                }
                if (edge6.isOutsideMargin(rect, f6)) {
                    edge8.offset(edge6.snapToRect(rect));
                } else if (edge8.isOutsideMargin(rect, f6)) {
                    edge6.offset(edge8.snapToRect(rect));
                }
            }

            @Override // com.xuexiang.xui.widget.imageview.crop.HandleHelper
            void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
                updateCropWindow(f4, f5, rect, f7);
            }
        });
        CENTER = handle9;
        $VALUES = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    private Handle(String str, int i4, HandleHelper handleHelper) {
        this.mHelper = handleHelper;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) $VALUES.clone();
    }

    public void updateCropWindow(float f4, float f5, Rect rect, float f6) {
        this.mHelper.updateCropWindow(f4, f5, rect, f6);
    }

    public void updateCropWindow(float f4, float f5, float f6, Rect rect, float f7) {
        this.mHelper.updateCropWindow(f4, f5, f6, rect, f7);
    }
}
