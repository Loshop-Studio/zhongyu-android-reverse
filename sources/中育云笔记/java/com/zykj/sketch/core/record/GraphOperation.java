package com.zykj.sketch.core.record;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import com.zykj.sketch.core.data.ThumbnailBean;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.NextPrevListener;
import java.util.List;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public interface GraphOperation {
    void addImage(Bitmap bitmap, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void addImage(Bitmap bitmap, String str, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void addImage(String str, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void addImage(String str, String str2, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2);

    void addPPT(String str, InterfaceC9540l interfaceC9540l);

    void clear();

    SketchConfig getConfig();

    RectF getDrawArea();

    void getRecordPath(InterfaceC9540l interfaceC9540l);

    List<String> getResList();

    void initConfig(SketchConfig sketchConfig, boolean z10, InterfaceC9540l interfaceC9540l);

    boolean isTouch();

    ThumbnailBean limitThumbnail();

    void loadData(String str, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9529a interfaceC9529a);

    void next();

    void prev();

    void reset(boolean z10);

    void resetMatrix();

    void save();

    void setActionChangeListener(ActionChangeListener actionChangeListener);

    void setDrawArea(RectF rectF);

    void setGraphConfig(GraphConfig graphConfig);

    void setGraphMatrixListener(GraphMatrixListener graphMatrixListener);

    void setImageDeleteListener(ImageDeleteListener imageDeleteListener);

    void setMode(Mode mode);

    void setNextPrevListener(NextPrevListener nextPrevListener);

    void setSketchBackground(int i10);

    Bitmap thumbnail();

    boolean tranlation(Float f10, Float f11, boolean z10);

    boolean zoom(float f10, float f11, float f12, float f13, boolean z10);

    boolean zoomIn();

    boolean zoomOut();

    public static final class DefaultImpls {
        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, Bitmap bitmap, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i12 & 2) != 0) {
                i10 = 5;
            }
            int i13 = i10;
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            int i14 = i11;
            if ((i12 & 8) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.1
                    public final void invoke(ImageGraph imageGraph) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
            if ((i12 & 16) != 0) {
                interfaceC9540l2 = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.2
                    public final void invoke(String str) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            graphOperation.addImage(bitmap, i13, i14, interfaceC9540l3, interfaceC9540l2);
        }

        public static /* synthetic */ void initConfig$default(GraphOperation graphOperation, SketchConfig sketchConfig, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initConfig");
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.initConfig.1
                    public final void invoke(boolean z11) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Boolean) obj2).booleanValue());
                        return C10786q.f26013a;
                    }
                };
            }
            graphOperation.initConfig(sketchConfig, z10, interfaceC9540l);
        }

        public static /* synthetic */ void loadData$default(GraphOperation graphOperation, String str, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9529a interfaceC9529a, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
            }
            if ((i10 & 8) != 0) {
                interfaceC9529a = null;
            }
            graphOperation.loadData(str, interfaceC9540l, interfaceC9540l2, interfaceC9529a);
        }

        public static /* synthetic */ void reset$default(GraphOperation graphOperation, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            graphOperation.reset(z10);
        }

        public static /* synthetic */ boolean tranlation$default(GraphOperation graphOperation, Float f10, Float f11, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tranlation");
            }
            if ((i10 & 4) != 0) {
                z10 = true;
            }
            return graphOperation.tranlation(f10, f11, z10);
        }

        public static /* synthetic */ boolean zoom$default(GraphOperation graphOperation, float f10, float f11, float f12, float f13, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoom");
            }
            if ((i10 & 16) != 0) {
                z10 = true;
            }
            return graphOperation.zoom(f10, f11, f12, f13, z10);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, String str, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i12 & 2) != 0) {
                i10 = 5;
            }
            int i13 = i10;
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            int i14 = i11;
            if ((i12 & 8) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.3
                    public final void invoke(ImageGraph imageGraph) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
            if ((i12 & 16) != 0) {
                interfaceC9540l2 = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.4
                    public final void invoke(String str2) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            graphOperation.addImage(str, i13, i14, interfaceC9540l3, interfaceC9540l2);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, String str, String str2, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i12 & 4) != 0) {
                i10 = 5;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.5
                    public final void invoke(ImageGraph imageGraph) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
            if ((i12 & 32) != 0) {
                interfaceC9540l2 = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.6
                    public final void invoke(String str3) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            graphOperation.addImage(str, str2, i13, i14, interfaceC9540l3, interfaceC9540l2);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, Bitmap bitmap, String str, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i12 & 4) != 0) {
                i10 = 5;
            }
            int i13 = i10;
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            int i14 = i11;
            if ((i12 & 16) != 0) {
                interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.7
                    public final void invoke(ImageGraph imageGraph) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            InterfaceC9540l interfaceC9540l3 = interfaceC9540l;
            if ((i12 & 32) != 0) {
                interfaceC9540l2 = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.8
                    public final void invoke(String str2) {
                    }

                    @Override // p181hd.InterfaceC9540l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C10786q.f26013a;
                    }
                };
            }
            graphOperation.addImage(bitmap, str, i13, i14, interfaceC9540l3, interfaceC9540l2);
        }
    }
}
