package com.zykj.sketch.core.record;

import android.graphics.Bitmap;
import android.graphics.RectF;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import com.zykj.sketch.core.data.ThumbnailBean;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.NextPrevListener;
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.core.listener.ViewControl;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(m13412d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001JT\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&J\\\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&JT\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&J\\\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00030\nH&J$\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\nH&J\b\u0010\u0013\u001a\u00020\u0003H&J\b\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H&J-\u0010\u0018\u001a\u00020\u00032#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00030\nH&J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001cH&J?\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020 2#\b\u0002\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110 ¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u00030\nH&J\b\u0010\"\u001a\u00020 H&J\n\u0010#\u001a\u0004\u0018\u00010$H&JJ\u0010%\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030\n2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00030\n2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010*H&J\b\u0010+\u001a\u00020\u0003H&J\b\u0010,\u001a\u00020\u0003H&J\u0012\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020 H&J\b\u0010/\u001a\u00020\u0003H&J\b\u00100\u001a\u00020\u0003H&J\u0012\u00101\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000103H&J\u0010\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0017H&J\u0010\u00106\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000207H&J\u0012\u00108\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u000109H&J\u0012\u0010:\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010;H&J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020=H&J\u0012\u0010>\u001a\u00020\u00032\b\u00102\u001a\u0004\u0018\u00010?H&J\u0010\u0010@\u001a\u00020\u00032\u0006\u0010A\u001a\u00020\u0007H&J\b\u0010B\u001a\u00020\u0005H&J+\u0010C\u001a\u00020 2\b\u0010D\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010E2\b\b\u0002\u0010G\u001a\u00020 H&¢\u0006\u0002\u0010HJ2\u0010I\u001a\u00020 2\u0006\u0010J\u001a\u00020E2\u0006\u0010K\u001a\u00020E2\u0006\u0010L\u001a\u00020E2\u0006\u0010M\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020 H&J\b\u0010N\u001a\u00020 H&J\b\u0010O\u001a\u00020 H&¨\u0006P"}, m13413d2 = {"Lcom/zykj/sketch/core/record/GraphOperation;", "", "addImage", "", "bitmap", "Landroid/graphics/Bitmap;", "positionFlag", "", "mode", "imageCallBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "pathCallBack", "", "imageName", "path", "addPPT", "callBack", "Lcom/zykj/sketch/core/listener/PPTControl;", "clear", "getConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "getDrawArea", "Landroid/graphics/RectF;", "getRecordPath", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResList", "", "initConfig", "config", "copy", "", "success", "isTouch", "limitThumbnail", "Lcom/zykj/sketch/core/data/ThumbnailBean;", "loadData", "Lcom/zykj/sketch/core/listener/ViewControl;", "finish", "Lcom/zykj/sketch/core/graph/Graph;", "exception", "Lkotlin/Function0;", "next", "prev", "reset", "isDelete", "resetMatrix", "save", "setActionChangeListener", "listener", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "setDrawArea", "rectF", "setGraphConfig", "Lcom/zykj/sketch/core/config/GraphConfig;", "setGraphMatrixListener", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "setImageDeleteListener", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "setMode", "Lcom/zykj/sketch/core/data/Mode;", "setNextPrevListener", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "setSketchBackground", TypedValues.Custom.S_COLOR, "thumbnail", "tranlation", "translateX", "", "translateY", "keep", "(Ljava/lang/Float;Ljava/lang/Float;Z)Z", "zoom", "scaleX", "scaleY", "centerX", "centerY", "zoomIn", "zoomOut", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public interface GraphOperation {
    void addImage(Bitmap bitmap, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack);

    void addImage(Bitmap bitmap, String imageName, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack);

    void addImage(String path, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack);

    void addImage(String path, String imageName, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack);

    void addPPT(String path, Function1<? super PPTControl, Unit> callBack);

    void clear();

    SketchConfig getConfig();

    RectF getDrawArea();

    void getRecordPath(Function1<? super String, Unit> callBack);

    List<String> getResList();

    void initConfig(SketchConfig config, boolean copy, Function1<? super Boolean, Unit> callBack);

    boolean isTouch();

    ThumbnailBean limitThumbnail();

    void loadData(String path, Function1<? super ViewControl, Unit> callBack, Function1<? super Graph, Unit> finish, Function0<Unit> exception);

    void next();

    void prev();

    void reset(boolean isDelete);

    void resetMatrix();

    void save();

    void setActionChangeListener(ActionChangeListener listener);

    void setDrawArea(RectF rectF);

    void setGraphConfig(GraphConfig config);

    void setGraphMatrixListener(GraphMatrixListener listener);

    void setImageDeleteListener(ImageDeleteListener listener);

    void setMode(Mode mode);

    void setNextPrevListener(NextPrevListener listener);

    void setSketchBackground(int color);

    Bitmap thumbnail();

    boolean tranlation(Float translateX, Float translateY, boolean keep);

    boolean zoom(float scaleX, float scaleY, float centerX, float centerY, boolean keep);

    boolean zoomIn();

    boolean zoomOut();

    @Metadata(m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, Bitmap bitmap, int i9, int i10, Function1 function1, Function1 function12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i11 & 2) != 0) {
                i9 = 5;
            }
            int i12 = i9;
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            int i13 = i10;
            if ((i11 & 8) != 0) {
                function1 = new Function1<ImageGraph, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ImageGraph imageGraph) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageGraph imageGraph) {
                        invoke2(imageGraph);
                        return Unit.INSTANCE;
                    }
                };
            }
            Function1 function13 = function1;
            if ((i11 & 16) != 0) {
                function12 = new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str) {
                        invoke2(str);
                        return Unit.INSTANCE;
                    }
                };
            }
            graphOperation.addImage(bitmap, i12, i13, (Function1<? super ImageGraph, Unit>) function13, (Function1<? super String, Unit>) function12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void initConfig$default(GraphOperation graphOperation, SketchConfig sketchConfig, boolean z9, Function1 function1, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initConfig");
            }
            if ((i9 & 2) != 0) {
                z9 = false;
            }
            if ((i9 & 4) != 0) {
                function1 = new Function1<Boolean, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.initConfig.1
                    public final void invoke(boolean z10) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }
                };
            }
            graphOperation.initConfig(sketchConfig, z9, function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void loadData$default(GraphOperation graphOperation, String str, Function1 function1, Function1 function12, Function0 function0, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
            }
            if ((i9 & 8) != 0) {
                function0 = null;
            }
            graphOperation.loadData(str, function1, function12, function0);
        }

        public static /* synthetic */ void reset$default(GraphOperation graphOperation, boolean z9, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
            }
            if ((i9 & 1) != 0) {
                z9 = false;
            }
            graphOperation.reset(z9);
        }

        public static /* synthetic */ boolean tranlation$default(GraphOperation graphOperation, Float f10, Float f11, boolean z9, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tranlation");
            }
            if ((i9 & 4) != 0) {
                z9 = true;
            }
            return graphOperation.tranlation(f10, f11, z9);
        }

        public static /* synthetic */ boolean zoom$default(GraphOperation graphOperation, float f10, float f11, float f12, float f13, boolean z9, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoom");
            }
            if ((i9 & 16) != 0) {
                z9 = true;
            }
            return graphOperation.zoom(f10, f11, f12, f13, z9);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, String str, int i9, int i10, Function1 function1, Function1 function12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i11 & 2) != 0) {
                i9 = 5;
            }
            int i12 = i9;
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            int i13 = i10;
            if ((i11 & 8) != 0) {
                function1 = new Function1<ImageGraph, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ImageGraph imageGraph) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageGraph imageGraph) {
                        invoke2(imageGraph);
                        return Unit.INSTANCE;
                    }
                };
            }
            Function1 function13 = function1;
            if ((i11 & 16) != 0) {
                function12 = new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.4
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str2) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.INSTANCE;
                    }
                };
            }
            graphOperation.addImage(str, i12, i13, (Function1<? super ImageGraph, Unit>) function13, (Function1<? super String, Unit>) function12);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, String str, String str2, int i9, int i10, Function1 function1, Function1 function12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i11 & 4) != 0) {
                i9 = 5;
            }
            int i12 = i9;
            if ((i11 & 8) != 0) {
                i10 = 0;
            }
            int i13 = i10;
            if ((i11 & 16) != 0) {
                function1 = new Function1<ImageGraph, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.5
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ImageGraph imageGraph) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageGraph imageGraph) {
                        invoke2(imageGraph);
                        return Unit.INSTANCE;
                    }
                };
            }
            Function1 function13 = function1;
            if ((i11 & 32) != 0) {
                function12 = new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.6
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str3) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                        invoke2(str3);
                        return Unit.INSTANCE;
                    }
                };
            }
            graphOperation.addImage(str, str2, i12, i13, (Function1<? super ImageGraph, Unit>) function13, (Function1<? super String, Unit>) function12);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, Bitmap bitmap, String str, int i9, int i10, Function1 function1, Function1 function12, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i11 & 4) != 0) {
                i9 = 5;
            }
            int i12 = i9;
            if ((i11 & 8) != 0) {
                i10 = 0;
            }
            int i13 = i10;
            if ((i11 & 16) != 0) {
                function1 = new Function1<ImageGraph, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.7
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ImageGraph imageGraph) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageGraph imageGraph) {
                        invoke2(imageGraph);
                        return Unit.INSTANCE;
                    }
                };
            }
            Function1 function13 = function1;
            if ((i11 & 32) != 0) {
                function12 = new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.8
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String str2) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.INSTANCE;
                    }
                };
            }
            graphOperation.addImage(bitmap, str, i12, i13, (Function1<? super ImageGraph, Unit>) function13, (Function1<? super String, Unit>) function12);
        }
    }
}
