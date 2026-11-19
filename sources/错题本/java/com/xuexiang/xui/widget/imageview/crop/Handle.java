package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;
import android.support.v4.media.C0039h;
import com.xuexiang.xui.widget.imageview.crop.Edge;
import p135p2.AbstractC6360c;

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
/* loaded from: classes3.dex */
public final class Handle {
    public static final Handle BOTTOM;
    public static final Handle BOTTOM_LEFT;
    public static final Handle BOTTOM_RIGHT;
    public static final Handle CENTER;
    public static final Handle LEFT;
    public static final Handle RIGHT;
    public static final Handle TOP;
    public static final Handle TOP_LEFT;
    public static final Handle TOP_RIGHT;

    /* renamed from: a */
    public static final /* synthetic */ Handle[] f4388a;
    private AbstractC6360c mHelper;

    static {
        final Edge edge = Edge.TOP;
        final Edge edge2 = Edge.LEFT;
        final int i = 1;
        Handle handle = new Handle("TOP_LEFT", 0, new AbstractC6360c(edge, edge2) { // from class: p2.a
            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (i) {
                    case 0:
                        mo6027b(f, f7, rect, f9);
                        break;
                    default:
                        Edge edge3 = Edge.LEFT;
                        Edge edge4 = this.f10399b;
                        float coordinate = edge4 == edge3 ? f : edge3.getCoordinate();
                        Edge edge5 = Edge.TOP;
                        Edge edge6 = this.f10398a;
                        float coordinate2 = edge6 == edge5 ? f7 : edge5.getCoordinate();
                        Edge edge7 = Edge.RIGHT;
                        float coordinate3 = edge4 == edge7 ? f : edge7.getCoordinate();
                        Edge edge8 = Edge.BOTTOM;
                        float coordinate4 = (coordinate3 - coordinate) / ((edge6 == edge8 ? f7 : edge8.getCoordinate()) - coordinate2);
                        C0039h c0039h = this.f10400c;
                        if (coordinate4 > f8) {
                            c0039h.f96b = edge4;
                            c0039h.f97c = edge6;
                        } else {
                            c0039h.f96b = edge6;
                            c0039h.f97c = edge4;
                        }
                        Edge edge9 = (Edge) c0039h.f96b;
                        Edge edge10 = (Edge) c0039h.f97c;
                        edge9.adjustCoordinate(f, f7, rect, f9, f8);
                        edge10.adjustCoordinate(f8);
                        if (edge10.isOutsideMargin(rect, f9)) {
                            edge10.snapToRect(rect);
                            edge9.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: b */
            public void mo6027b(float f, float f7, Rect rect, float f8) {
                switch (i) {
                    case 0:
                        Edge edge3 = Edge.LEFT;
                        float coordinate = edge3.getCoordinate();
                        Edge edge4 = Edge.TOP;
                        float coordinate2 = edge4.getCoordinate();
                        Edge edge5 = Edge.RIGHT;
                        float coordinate3 = edge5.getCoordinate();
                        Edge edge6 = Edge.BOTTOM;
                        float f9 = f - ((coordinate + coordinate3) / 2.0f);
                        float coordinate4 = f7 - ((coordinate2 + edge6.getCoordinate()) / 2.0f);
                        edge3.offset(f9);
                        edge4.offset(coordinate4);
                        edge5.offset(f9);
                        edge6.offset(coordinate4);
                        if (edge3.isOutsideMargin(rect, f8)) {
                            edge5.offset(edge3.snapToRect(rect));
                        } else if (edge5.isOutsideMargin(rect, f8)) {
                            edge3.offset(edge5.snapToRect(rect));
                        }
                        if (!edge4.isOutsideMargin(rect, f8)) {
                            if (edge6.isOutsideMargin(rect, f8)) {
                                edge4.offset(edge6.snapToRect(rect));
                                break;
                            }
                        } else {
                            edge6.offset(edge4.snapToRect(rect));
                            break;
                        }
                        break;
                    default:
                        super.mo6027b(f, f7, rect, f8);
                        break;
                }
            }
        });
        TOP_LEFT = handle;
        final Edge edge3 = Edge.RIGHT;
        final int i8 = 1;
        Handle handle2 = new Handle("TOP_RIGHT", 1, new AbstractC6360c(edge, edge3) { // from class: p2.a
            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (i8) {
                    case 0:
                        mo6027b(f, f7, rect, f9);
                        break;
                    default:
                        Edge edge32 = Edge.LEFT;
                        Edge edge4 = this.f10399b;
                        float coordinate = edge4 == edge32 ? f : edge32.getCoordinate();
                        Edge edge5 = Edge.TOP;
                        Edge edge6 = this.f10398a;
                        float coordinate2 = edge6 == edge5 ? f7 : edge5.getCoordinate();
                        Edge edge7 = Edge.RIGHT;
                        float coordinate3 = edge4 == edge7 ? f : edge7.getCoordinate();
                        Edge edge8 = Edge.BOTTOM;
                        float coordinate4 = (coordinate3 - coordinate) / ((edge6 == edge8 ? f7 : edge8.getCoordinate()) - coordinate2);
                        C0039h c0039h = this.f10400c;
                        if (coordinate4 > f8) {
                            c0039h.f96b = edge4;
                            c0039h.f97c = edge6;
                        } else {
                            c0039h.f96b = edge6;
                            c0039h.f97c = edge4;
                        }
                        Edge edge9 = (Edge) c0039h.f96b;
                        Edge edge10 = (Edge) c0039h.f97c;
                        edge9.adjustCoordinate(f, f7, rect, f9, f8);
                        edge10.adjustCoordinate(f8);
                        if (edge10.isOutsideMargin(rect, f9)) {
                            edge10.snapToRect(rect);
                            edge9.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: b */
            public void mo6027b(float f, float f7, Rect rect, float f8) {
                switch (i8) {
                    case 0:
                        Edge edge32 = Edge.LEFT;
                        float coordinate = edge32.getCoordinate();
                        Edge edge4 = Edge.TOP;
                        float coordinate2 = edge4.getCoordinate();
                        Edge edge5 = Edge.RIGHT;
                        float coordinate3 = edge5.getCoordinate();
                        Edge edge6 = Edge.BOTTOM;
                        float f9 = f - ((coordinate + coordinate3) / 2.0f);
                        float coordinate4 = f7 - ((coordinate2 + edge6.getCoordinate()) / 2.0f);
                        edge32.offset(f9);
                        edge4.offset(coordinate4);
                        edge5.offset(f9);
                        edge6.offset(coordinate4);
                        if (edge32.isOutsideMargin(rect, f8)) {
                            edge5.offset(edge32.snapToRect(rect));
                        } else if (edge5.isOutsideMargin(rect, f8)) {
                            edge32.offset(edge5.snapToRect(rect));
                        }
                        if (!edge4.isOutsideMargin(rect, f8)) {
                            if (edge6.isOutsideMargin(rect, f8)) {
                                edge4.offset(edge6.snapToRect(rect));
                                break;
                            }
                        } else {
                            edge6.offset(edge4.snapToRect(rect));
                            break;
                        }
                        break;
                    default:
                        super.mo6027b(f, f7, rect, f8);
                        break;
                }
            }
        });
        TOP_RIGHT = handle2;
        final Edge edge4 = Edge.BOTTOM;
        final int i9 = 1;
        Handle handle3 = new Handle("BOTTOM_LEFT", 2, new AbstractC6360c(edge4, edge2) { // from class: p2.a
            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (i9) {
                    case 0:
                        mo6027b(f, f7, rect, f9);
                        break;
                    default:
                        Edge edge32 = Edge.LEFT;
                        Edge edge42 = this.f10399b;
                        float coordinate = edge42 == edge32 ? f : edge32.getCoordinate();
                        Edge edge5 = Edge.TOP;
                        Edge edge6 = this.f10398a;
                        float coordinate2 = edge6 == edge5 ? f7 : edge5.getCoordinate();
                        Edge edge7 = Edge.RIGHT;
                        float coordinate3 = edge42 == edge7 ? f : edge7.getCoordinate();
                        Edge edge8 = Edge.BOTTOM;
                        float coordinate4 = (coordinate3 - coordinate) / ((edge6 == edge8 ? f7 : edge8.getCoordinate()) - coordinate2);
                        C0039h c0039h = this.f10400c;
                        if (coordinate4 > f8) {
                            c0039h.f96b = edge42;
                            c0039h.f97c = edge6;
                        } else {
                            c0039h.f96b = edge6;
                            c0039h.f97c = edge42;
                        }
                        Edge edge9 = (Edge) c0039h.f96b;
                        Edge edge10 = (Edge) c0039h.f97c;
                        edge9.adjustCoordinate(f, f7, rect, f9, f8);
                        edge10.adjustCoordinate(f8);
                        if (edge10.isOutsideMargin(rect, f9)) {
                            edge10.snapToRect(rect);
                            edge9.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: b */
            public void mo6027b(float f, float f7, Rect rect, float f8) {
                switch (i9) {
                    case 0:
                        Edge edge32 = Edge.LEFT;
                        float coordinate = edge32.getCoordinate();
                        Edge edge42 = Edge.TOP;
                        float coordinate2 = edge42.getCoordinate();
                        Edge edge5 = Edge.RIGHT;
                        float coordinate3 = edge5.getCoordinate();
                        Edge edge6 = Edge.BOTTOM;
                        float f9 = f - ((coordinate + coordinate3) / 2.0f);
                        float coordinate4 = f7 - ((coordinate2 + edge6.getCoordinate()) / 2.0f);
                        edge32.offset(f9);
                        edge42.offset(coordinate4);
                        edge5.offset(f9);
                        edge6.offset(coordinate4);
                        if (edge32.isOutsideMargin(rect, f8)) {
                            edge5.offset(edge32.snapToRect(rect));
                        } else if (edge5.isOutsideMargin(rect, f8)) {
                            edge32.offset(edge5.snapToRect(rect));
                        }
                        if (!edge42.isOutsideMargin(rect, f8)) {
                            if (edge6.isOutsideMargin(rect, f8)) {
                                edge42.offset(edge6.snapToRect(rect));
                                break;
                            }
                        } else {
                            edge6.offset(edge42.snapToRect(rect));
                            break;
                        }
                        break;
                    default:
                        super.mo6027b(f, f7, rect, f8);
                        break;
                }
            }
        });
        BOTTOM_LEFT = handle3;
        final int i10 = 1;
        Handle handle4 = new Handle("BOTTOM_RIGHT", 3, new AbstractC6360c(edge4, edge3) { // from class: p2.a
            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (i10) {
                    case 0:
                        mo6027b(f, f7, rect, f9);
                        break;
                    default:
                        Edge edge32 = Edge.LEFT;
                        Edge edge42 = this.f10399b;
                        float coordinate = edge42 == edge32 ? f : edge32.getCoordinate();
                        Edge edge5 = Edge.TOP;
                        Edge edge6 = this.f10398a;
                        float coordinate2 = edge6 == edge5 ? f7 : edge5.getCoordinate();
                        Edge edge7 = Edge.RIGHT;
                        float coordinate3 = edge42 == edge7 ? f : edge7.getCoordinate();
                        Edge edge8 = Edge.BOTTOM;
                        float coordinate4 = (coordinate3 - coordinate) / ((edge6 == edge8 ? f7 : edge8.getCoordinate()) - coordinate2);
                        C0039h c0039h = this.f10400c;
                        if (coordinate4 > f8) {
                            c0039h.f96b = edge42;
                            c0039h.f97c = edge6;
                        } else {
                            c0039h.f96b = edge6;
                            c0039h.f97c = edge42;
                        }
                        Edge edge9 = (Edge) c0039h.f96b;
                        Edge edge10 = (Edge) c0039h.f97c;
                        edge9.adjustCoordinate(f, f7, rect, f9, f8);
                        edge10.adjustCoordinate(f8);
                        if (edge10.isOutsideMargin(rect, f9)) {
                            edge10.snapToRect(rect);
                            edge9.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: b */
            public void mo6027b(float f, float f7, Rect rect, float f8) {
                switch (i10) {
                    case 0:
                        Edge edge32 = Edge.LEFT;
                        float coordinate = edge32.getCoordinate();
                        Edge edge42 = Edge.TOP;
                        float coordinate2 = edge42.getCoordinate();
                        Edge edge5 = Edge.RIGHT;
                        float coordinate3 = edge5.getCoordinate();
                        Edge edge6 = Edge.BOTTOM;
                        float f9 = f - ((coordinate + coordinate3) / 2.0f);
                        float coordinate4 = f7 - ((coordinate2 + edge6.getCoordinate()) / 2.0f);
                        edge32.offset(f9);
                        edge42.offset(coordinate4);
                        edge5.offset(f9);
                        edge6.offset(coordinate4);
                        if (edge32.isOutsideMargin(rect, f8)) {
                            edge5.offset(edge32.snapToRect(rect));
                        } else if (edge5.isOutsideMargin(rect, f8)) {
                            edge32.offset(edge5.snapToRect(rect));
                        }
                        if (!edge42.isOutsideMargin(rect, f8)) {
                            if (edge6.isOutsideMargin(rect, f8)) {
                                edge42.offset(edge6.snapToRect(rect));
                                break;
                            }
                        } else {
                            edge6.offset(edge42.snapToRect(rect));
                            break;
                        }
                        break;
                    default:
                        super.mo6027b(f, f7, rect, f8);
                        break;
                }
            }
        });
        BOTTOM_RIGHT = handle4;
        final int i11 = 1;
        Handle handle5 = new Handle("LEFT", 4, new AbstractC6360c(edge2, i11) { // from class: p2.e

            /* renamed from: d */
            public final /* synthetic */ int f10402d;

            /* renamed from: e */
            public final Edge f10403e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(edge2, null);
                this.f10402d = i11;
                switch (i11) {
                    case 1:
                        super(null, edge2);
                        this.f10403e = edge2;
                        break;
                    default:
                        this.f10403e = edge2;
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (this.f10402d) {
                    case 0:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        Edge edge5 = Edge.LEFT;
                        float coordinate = edge5.getCoordinate();
                        float coordinate2 = Edge.TOP.getCoordinate();
                        Edge edge6 = Edge.RIGHT;
                        float coordinate3 = edge6.getCoordinate();
                        float coordinate4 = (((Edge.BOTTOM.getCoordinate() - coordinate2) * f8) - (coordinate3 - coordinate)) / 2.0f;
                        edge5.setCoordinate(coordinate - coordinate4);
                        edge6.setCoordinate(coordinate3 + coordinate4);
                        boolean zIsOutsideMargin = edge5.isOutsideMargin(rect, f9);
                        Edge edge7 = this.f10403e;
                        if (zIsOutsideMargin && !edge7.isNewRectangleOutOfBounds(edge5, rect, f8)) {
                            edge6.offset(-edge5.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                        }
                        if (edge6.isOutsideMargin(rect, f9) && !edge7.isNewRectangleOutOfBounds(edge6, rect, f8)) {
                            edge5.offset(-edge6.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                            break;
                        }
                        break;
                    default:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        float coordinate5 = Edge.LEFT.getCoordinate();
                        Edge edge8 = Edge.TOP;
                        float coordinate6 = edge8.getCoordinate();
                        float coordinate7 = Edge.RIGHT.getCoordinate();
                        Edge edge9 = Edge.BOTTOM;
                        float coordinate8 = edge9.getCoordinate();
                        float f10 = (((coordinate7 - coordinate5) / f8) - (coordinate8 - coordinate6)) / 2.0f;
                        edge8.setCoordinate(coordinate6 - f10);
                        edge9.setCoordinate(coordinate8 + f10);
                        boolean zIsOutsideMargin2 = edge8.isOutsideMargin(rect, f9);
                        Edge edge10 = this.f10403e;
                        if (zIsOutsideMargin2 && !edge10.isNewRectangleOutOfBounds(edge8, rect, f8)) {
                            edge9.offset(-edge8.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                        }
                        if (edge9.isOutsideMargin(rect, f9) && !edge10.isNewRectangleOutOfBounds(edge9, rect, f8)) {
                            edge8.offset(-edge9.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }
        });
        LEFT = handle5;
        final int i12 = 0;
        Handle handle6 = new Handle("TOP", 5, new AbstractC6360c(edge, i12) { // from class: p2.e

            /* renamed from: d */
            public final /* synthetic */ int f10402d;

            /* renamed from: e */
            public final Edge f10403e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(edge, null);
                this.f10402d = i12;
                switch (i12) {
                    case 1:
                        super(null, edge);
                        this.f10403e = edge;
                        break;
                    default:
                        this.f10403e = edge;
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (this.f10402d) {
                    case 0:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        Edge edge5 = Edge.LEFT;
                        float coordinate = edge5.getCoordinate();
                        float coordinate2 = Edge.TOP.getCoordinate();
                        Edge edge6 = Edge.RIGHT;
                        float coordinate3 = edge6.getCoordinate();
                        float coordinate4 = (((Edge.BOTTOM.getCoordinate() - coordinate2) * f8) - (coordinate3 - coordinate)) / 2.0f;
                        edge5.setCoordinate(coordinate - coordinate4);
                        edge6.setCoordinate(coordinate3 + coordinate4);
                        boolean zIsOutsideMargin = edge5.isOutsideMargin(rect, f9);
                        Edge edge7 = this.f10403e;
                        if (zIsOutsideMargin && !edge7.isNewRectangleOutOfBounds(edge5, rect, f8)) {
                            edge6.offset(-edge5.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                        }
                        if (edge6.isOutsideMargin(rect, f9) && !edge7.isNewRectangleOutOfBounds(edge6, rect, f8)) {
                            edge5.offset(-edge6.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                            break;
                        }
                        break;
                    default:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        float coordinate5 = Edge.LEFT.getCoordinate();
                        Edge edge8 = Edge.TOP;
                        float coordinate6 = edge8.getCoordinate();
                        float coordinate7 = Edge.RIGHT.getCoordinate();
                        Edge edge9 = Edge.BOTTOM;
                        float coordinate8 = edge9.getCoordinate();
                        float f10 = (((coordinate7 - coordinate5) / f8) - (coordinate8 - coordinate6)) / 2.0f;
                        edge8.setCoordinate(coordinate6 - f10);
                        edge9.setCoordinate(coordinate8 + f10);
                        boolean zIsOutsideMargin2 = edge8.isOutsideMargin(rect, f9);
                        Edge edge10 = this.f10403e;
                        if (zIsOutsideMargin2 && !edge10.isNewRectangleOutOfBounds(edge8, rect, f8)) {
                            edge9.offset(-edge8.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                        }
                        if (edge9.isOutsideMargin(rect, f9) && !edge10.isNewRectangleOutOfBounds(edge9, rect, f8)) {
                            edge8.offset(-edge9.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }
        });
        TOP = handle6;
        final int i13 = 1;
        Handle handle7 = new Handle("RIGHT", 6, new AbstractC6360c(edge3, i13) { // from class: p2.e

            /* renamed from: d */
            public final /* synthetic */ int f10402d;

            /* renamed from: e */
            public final Edge f10403e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(edge3, null);
                this.f10402d = i13;
                switch (i13) {
                    case 1:
                        super(null, edge3);
                        this.f10403e = edge3;
                        break;
                    default:
                        this.f10403e = edge3;
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (this.f10402d) {
                    case 0:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        Edge edge5 = Edge.LEFT;
                        float coordinate = edge5.getCoordinate();
                        float coordinate2 = Edge.TOP.getCoordinate();
                        Edge edge6 = Edge.RIGHT;
                        float coordinate3 = edge6.getCoordinate();
                        float coordinate4 = (((Edge.BOTTOM.getCoordinate() - coordinate2) * f8) - (coordinate3 - coordinate)) / 2.0f;
                        edge5.setCoordinate(coordinate - coordinate4);
                        edge6.setCoordinate(coordinate3 + coordinate4);
                        boolean zIsOutsideMargin = edge5.isOutsideMargin(rect, f9);
                        Edge edge7 = this.f10403e;
                        if (zIsOutsideMargin && !edge7.isNewRectangleOutOfBounds(edge5, rect, f8)) {
                            edge6.offset(-edge5.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                        }
                        if (edge6.isOutsideMargin(rect, f9) && !edge7.isNewRectangleOutOfBounds(edge6, rect, f8)) {
                            edge5.offset(-edge6.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                            break;
                        }
                        break;
                    default:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        float coordinate5 = Edge.LEFT.getCoordinate();
                        Edge edge8 = Edge.TOP;
                        float coordinate6 = edge8.getCoordinate();
                        float coordinate7 = Edge.RIGHT.getCoordinate();
                        Edge edge9 = Edge.BOTTOM;
                        float coordinate8 = edge9.getCoordinate();
                        float f10 = (((coordinate7 - coordinate5) / f8) - (coordinate8 - coordinate6)) / 2.0f;
                        edge8.setCoordinate(coordinate6 - f10);
                        edge9.setCoordinate(coordinate8 + f10);
                        boolean zIsOutsideMargin2 = edge8.isOutsideMargin(rect, f9);
                        Edge edge10 = this.f10403e;
                        if (zIsOutsideMargin2 && !edge10.isNewRectangleOutOfBounds(edge8, rect, f8)) {
                            edge9.offset(-edge8.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                        }
                        if (edge9.isOutsideMargin(rect, f9) && !edge10.isNewRectangleOutOfBounds(edge9, rect, f8)) {
                            edge8.offset(-edge9.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }
        });
        RIGHT = handle7;
        final int i14 = 0;
        Handle handle8 = new Handle("BOTTOM", 7, new AbstractC6360c(edge4, i14) { // from class: p2.e

            /* renamed from: d */
            public final /* synthetic */ int f10402d;

            /* renamed from: e */
            public final Edge f10403e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(edge4, null);
                this.f10402d = i14;
                switch (i14) {
                    case 1:
                        super(null, edge4);
                        this.f10403e = edge4;
                        break;
                    default:
                        this.f10403e = edge4;
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (this.f10402d) {
                    case 0:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        Edge edge5 = Edge.LEFT;
                        float coordinate = edge5.getCoordinate();
                        float coordinate2 = Edge.TOP.getCoordinate();
                        Edge edge6 = Edge.RIGHT;
                        float coordinate3 = edge6.getCoordinate();
                        float coordinate4 = (((Edge.BOTTOM.getCoordinate() - coordinate2) * f8) - (coordinate3 - coordinate)) / 2.0f;
                        edge5.setCoordinate(coordinate - coordinate4);
                        edge6.setCoordinate(coordinate3 + coordinate4);
                        boolean zIsOutsideMargin = edge5.isOutsideMargin(rect, f9);
                        Edge edge7 = this.f10403e;
                        if (zIsOutsideMargin && !edge7.isNewRectangleOutOfBounds(edge5, rect, f8)) {
                            edge6.offset(-edge5.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                        }
                        if (edge6.isOutsideMargin(rect, f9) && !edge7.isNewRectangleOutOfBounds(edge6, rect, f8)) {
                            edge5.offset(-edge6.snapToRect(rect));
                            edge7.adjustCoordinate(f8);
                            break;
                        }
                        break;
                    default:
                        this.f10403e.adjustCoordinate(f, f7, rect, f9, f8);
                        float coordinate5 = Edge.LEFT.getCoordinate();
                        Edge edge8 = Edge.TOP;
                        float coordinate6 = edge8.getCoordinate();
                        float coordinate7 = Edge.RIGHT.getCoordinate();
                        Edge edge9 = Edge.BOTTOM;
                        float coordinate8 = edge9.getCoordinate();
                        float f10 = (((coordinate7 - coordinate5) / f8) - (coordinate8 - coordinate6)) / 2.0f;
                        edge8.setCoordinate(coordinate6 - f10);
                        edge9.setCoordinate(coordinate8 + f10);
                        boolean zIsOutsideMargin2 = edge8.isOutsideMargin(rect, f9);
                        Edge edge10 = this.f10403e;
                        if (zIsOutsideMargin2 && !edge10.isNewRectangleOutOfBounds(edge8, rect, f8)) {
                            edge9.offset(-edge8.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                        }
                        if (edge9.isOutsideMargin(rect, f9) && !edge10.isNewRectangleOutOfBounds(edge9, rect, f8)) {
                            edge8.offset(-edge9.snapToRect(rect));
                            edge10.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }
        });
        BOTTOM = handle8;
        final Edge edge5 = null;
        final int i15 = 0;
        Handle handle9 = new Handle("CENTER", 8, new AbstractC6360c(edge5, edge5) { // from class: p2.a
            @Override // p135p2.AbstractC6360c
            /* renamed from: a */
            public final void mo6026a(float f, float f7, float f8, Rect rect, float f9) {
                switch (i15) {
                    case 0:
                        mo6027b(f, f7, rect, f9);
                        break;
                    default:
                        Edge edge32 = Edge.LEFT;
                        Edge edge42 = this.f10399b;
                        float coordinate = edge42 == edge32 ? f : edge32.getCoordinate();
                        Edge edge52 = Edge.TOP;
                        Edge edge6 = this.f10398a;
                        float coordinate2 = edge6 == edge52 ? f7 : edge52.getCoordinate();
                        Edge edge7 = Edge.RIGHT;
                        float coordinate3 = edge42 == edge7 ? f : edge7.getCoordinate();
                        Edge edge8 = Edge.BOTTOM;
                        float coordinate4 = (coordinate3 - coordinate) / ((edge6 == edge8 ? f7 : edge8.getCoordinate()) - coordinate2);
                        C0039h c0039h = this.f10400c;
                        if (coordinate4 > f8) {
                            c0039h.f96b = edge42;
                            c0039h.f97c = edge6;
                        } else {
                            c0039h.f96b = edge6;
                            c0039h.f97c = edge42;
                        }
                        Edge edge9 = (Edge) c0039h.f96b;
                        Edge edge10 = (Edge) c0039h.f97c;
                        edge9.adjustCoordinate(f, f7, rect, f9, f8);
                        edge10.adjustCoordinate(f8);
                        if (edge10.isOutsideMargin(rect, f9)) {
                            edge10.snapToRect(rect);
                            edge9.adjustCoordinate(f8);
                            break;
                        }
                        break;
                }
            }

            @Override // p135p2.AbstractC6360c
            /* renamed from: b */
            public void mo6027b(float f, float f7, Rect rect, float f8) {
                switch (i15) {
                    case 0:
                        Edge edge32 = Edge.LEFT;
                        float coordinate = edge32.getCoordinate();
                        Edge edge42 = Edge.TOP;
                        float coordinate2 = edge42.getCoordinate();
                        Edge edge52 = Edge.RIGHT;
                        float coordinate3 = edge52.getCoordinate();
                        Edge edge6 = Edge.BOTTOM;
                        float f9 = f - ((coordinate + coordinate3) / 2.0f);
                        float coordinate4 = f7 - ((coordinate2 + edge6.getCoordinate()) / 2.0f);
                        edge32.offset(f9);
                        edge42.offset(coordinate4);
                        edge52.offset(f9);
                        edge6.offset(coordinate4);
                        if (edge32.isOutsideMargin(rect, f8)) {
                            edge52.offset(edge32.snapToRect(rect));
                        } else if (edge52.isOutsideMargin(rect, f8)) {
                            edge32.offset(edge52.snapToRect(rect));
                        }
                        if (!edge42.isOutsideMargin(rect, f8)) {
                            if (edge6.isOutsideMargin(rect, f8)) {
                                edge42.offset(edge6.snapToRect(rect));
                                break;
                            }
                        } else {
                            edge6.offset(edge42.snapToRect(rect));
                            break;
                        }
                        break;
                    default:
                        super.mo6027b(f, f7, rect, f8);
                        break;
                }
            }
        });
        CENTER = handle9;
        f4388a = new Handle[]{handle, handle2, handle3, handle4, handle5, handle6, handle7, handle8, handle9};
    }

    public Handle(String str, int i, AbstractC6360c abstractC6360c) {
        this.mHelper = abstractC6360c;
    }

    public static Handle valueOf(String str) {
        return (Handle) Enum.valueOf(Handle.class, str);
    }

    public static Handle[] values() {
        return (Handle[]) f4388a.clone();
    }

    public void updateCropWindow(float f, float f7, Rect rect, float f8) {
        this.mHelper.mo6027b(f, f7, rect, f8);
    }

    public void updateCropWindow(float f, float f7, float f8, Rect rect, float f9) {
        this.mHelper.mo6026a(f, f7, f8, rect, f9);
    }
}
