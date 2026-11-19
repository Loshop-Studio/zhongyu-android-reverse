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
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.NextPrevListener;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JF\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010$\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u00062\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\n0\u00062\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\"H&¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b(\u0010)J[\u00100\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b0\u00101J[\u00100\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b0\u00102Jc\u00100\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00103\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b0\u00104Jc\u00100\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u00103\u001a\u00020\u001d2\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010'\u001a\u00020\u00132\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010-\u0012\u0004\u0012\u00020\n0\u00062\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b0\u00105J+\u00107\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\nH&¢\u0006\u0004\b9\u0010:J\u0019\u0010<\u001a\u00020\n2\b\b\u0002\u0010;\u001a\u00020\u0004H&¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\nH&¢\u0006\u0004\b>\u0010:J\u000f\u0010?\u001a\u00020\nH&¢\u0006\u0004\b?\u0010:J\u000f\u0010@\u001a\u00020\u0004H&¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0004H&¢\u0006\u0004\bB\u0010AJ9\u0010I\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\u0006\u0010F\u001a\u00020C2\u0006\u0010G\u001a\u00020C2\b\b\u0002\u0010H\u001a\u00020\u0004H&¢\u0006\u0004\bI\u0010JJ-\u0010M\u001a\u00020\u00042\b\u0010K\u001a\u0004\u0018\u00010C2\b\u0010L\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010H\u001a\u00020\u0004H&¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\nH&¢\u0006\u0004\bO\u0010:J\u000f\u0010P\u001a\u00020\nH&¢\u0006\u0004\bP\u0010:J4\u0010Q\u001a\u00020\n2#\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\n0\u0006H&¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020*H&¢\u0006\u0004\bS\u0010TJ\u0011\u0010V\u001a\u0004\u0018\u00010UH&¢\u0006\u0004\bV\u0010WJ\u000f\u0010X\u001a\u00020\u0004H&¢\u0006\u0004\bX\u0010AJ\u0019\u0010[\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010YH&¢\u0006\u0004\b[\u0010\\J\u0019\u0010^\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010]H&¢\u0006\u0004\b^\u0010_J\u0019\u0010a\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010`H&¢\u0006\u0004\ba\u0010bJ\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001d0cH&¢\u0006\u0004\bd\u0010eJ\u0019\u0010g\u001a\u00020\n2\b\u0010Z\u001a\u0004\u0018\u00010fH&¢\u0006\u0004\bg\u0010h¨\u0006i"}, m5110d2 = {"Lcom/zykj/sketch/core/record/GraphOperation;", "", "Lcom/zykj/sketch/core/config/SketchConfig;", "config", "", "copy", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "success", "Ld6/s;", "callBack", "initConfig", "(Lcom/zykj/sketch/core/config/SketchConfig;ZLr6/c;)V", "getConfig", "()Lcom/zykj/sketch/core/config/SketchConfig;", "Lcom/zykj/sketch/core/config/GraphConfig;", "setGraphConfig", "(Lcom/zykj/sketch/core/config/GraphConfig;)V", "", TypedValues.Custom.S_COLOR, "setSketchBackground", "(I)V", "Landroid/graphics/RectF;", "rectF", "setDrawArea", "(Landroid/graphics/RectF;)V", "getDrawArea", "()Landroid/graphics/RectF;", "", "path", "Lcom/zykj/sketch/core/listener/ViewControl;", "Lcom/zykj/sketch/core/graph/Graph;", "finish", "Lkotlin/Function0;", "exception", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V", "Lcom/zykj/sketch/core/data/Mode;", "mode", "setMode", "(Lcom/zykj/sketch/core/data/Mode;)V", "Landroid/graphics/Bitmap;", "bitmap", "positionFlag", "Lcom/zykj/sketch/core/graph/ImageGraph;", "imageCallBack", "pathCallBack", "addImage", "(Landroid/graphics/Bitmap;IILr6/c;Lr6/c;)V", "(Ljava/lang/String;IILr6/c;Lr6/c;)V", "imageName", "(Ljava/lang/String;Ljava/lang/String;IILr6/c;Lr6/c;)V", "(Landroid/graphics/Bitmap;Ljava/lang/String;IILr6/c;Lr6/c;)V", "Lcom/zykj/sketch/core/listener/PPTControl;", "addPPT", "(Ljava/lang/String;Lr6/c;)V", "clear", "()V", "isDelete", "reset", "(Z)V", "prev", "next", "zoomIn", "()Z", "zoomOut", "", "scaleX", "scaleY", "centerX", "centerY", "keep", "zoom", "(FFFFZ)Z", "translateX", "translateY", "tranlation", "(Ljava/lang/Float;Ljava/lang/Float;Z)Z", "resetMatrix", "save", "getRecordPath", "(Lr6/c;)V", "thumbnail", "()Landroid/graphics/Bitmap;", "Lcom/zykj/sketch/core/data/ThumbnailBean;", "limitThumbnail", "()Lcom/zykj/sketch/core/data/ThumbnailBean;", "isTouch", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "listener", "setNextPrevListener", "(Lcom/zykj/sketch/core/listener/NextPrevListener;)V", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "setActionChangeListener", "(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "setGraphMatrixListener", "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V", "", "getResList", "()Ljava/util/List;", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "setImageDeleteListener", "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface GraphOperation {
    void addImage(@NotNull Bitmap bitmap, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack);

    void addImage(@NotNull Bitmap bitmap, @NotNull String imageName, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack);

    void addImage(@NotNull String path, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack);

    void addImage(@NotNull String path, @NotNull String imageName, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack);

    void addPPT(@NotNull String path, @NotNull InterfaceC6471c callBack);

    void clear();

    @NotNull
    /* renamed from: getConfig */
    SketchConfig getSketchConfig();

    @NotNull
    RectF getDrawArea();

    void getRecordPath(@NotNull InterfaceC6471c callBack);

    @NotNull
    List<String> getResList();

    void initConfig(@NotNull SketchConfig config, boolean copy, @NotNull InterfaceC6471c callBack);

    boolean isTouch();

    @Nullable
    ThumbnailBean limitThumbnail();

    void loadData(@NotNull String path, @NotNull InterfaceC6471c callBack, @NotNull InterfaceC6471c finish, @Nullable InterfaceC6469a exception);

    void next();

    void prev();

    void reset(boolean isDelete);

    void resetMatrix();

    void save();

    void setActionChangeListener(@Nullable ActionChangeListener listener);

    void setDrawArea(@NotNull RectF rectF);

    void setGraphConfig(@NotNull GraphConfig config);

    void setGraphMatrixListener(@Nullable GraphMatrixListener listener);

    void setImageDeleteListener(@Nullable ImageDeleteListener listener);

    void setMode(@NotNull Mode mode);

    void setNextPrevListener(@Nullable NextPrevListener listener);

    void setSketchBackground(int color);

    @NotNull
    Bitmap thumbnail();

    boolean tranlation(@Nullable Float translateX, @Nullable Float translateY, boolean keep);

    boolean zoom(float scaleX, float scaleY, float centerX, float centerY, boolean keep);

    boolean zoomIn();

    boolean zoomOut();

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, Bitmap bitmap, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i9 & 2) != 0) {
                i = 5;
            }
            int i10 = i;
            if ((i9 & 4) != 0) {
                i8 = 0;
            }
            int i11 = i8;
            if ((i9 & 8) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.1
                    public final void invoke(@Nullable ImageGraph imageGraph) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
            if ((i9 & 16) != 0) {
                interfaceC6471c2 = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.2
                    public final void invoke(@Nullable String str) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            graphOperation.addImage(bitmap, i10, i11, interfaceC6471c3, interfaceC6471c2);
        }

        public static /* synthetic */ void initConfig$default(GraphOperation graphOperation, SketchConfig sketchConfig, boolean z8, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initConfig");
            }
            if ((i & 2) != 0) {
                z8 = false;
            }
            if ((i & 4) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.initConfig.1
                    public final void invoke(boolean z9) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke(((Boolean) obj2).booleanValue());
                        return C5443s.f8405a;
                    }
                };
            }
            graphOperation.initConfig(sketchConfig, z8, interfaceC6471c);
        }

        public static /* synthetic */ void loadData$default(GraphOperation graphOperation, String str, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6469a interfaceC6469a, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
            }
            if ((i & 8) != 0) {
                interfaceC6469a = null;
            }
            graphOperation.loadData(str, interfaceC6471c, interfaceC6471c2, interfaceC6469a);
        }

        public static /* synthetic */ void reset$default(GraphOperation graphOperation, boolean z8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
            }
            if ((i & 1) != 0) {
                z8 = false;
            }
            graphOperation.reset(z8);
        }

        public static /* synthetic */ boolean tranlation$default(GraphOperation graphOperation, Float f, Float f7, boolean z8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tranlation");
            }
            if ((i & 4) != 0) {
                z8 = true;
            }
            return graphOperation.tranlation(f, f7, z8);
        }

        public static /* synthetic */ boolean zoom$default(GraphOperation graphOperation, float f, float f7, float f8, float f9, boolean z8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: zoom");
            }
            if ((i & 16) != 0) {
                z8 = true;
            }
            return graphOperation.zoom(f, f7, f8, f9, z8);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, String str, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i9 & 2) != 0) {
                i = 5;
            }
            int i10 = i;
            if ((i9 & 4) != 0) {
                i8 = 0;
            }
            int i11 = i8;
            if ((i9 & 8) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.3
                    public final void invoke(@Nullable ImageGraph imageGraph) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
            if ((i9 & 16) != 0) {
                interfaceC6471c2 = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.4
                    public final void invoke(@Nullable String str2) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            graphOperation.addImage(str, i10, i11, interfaceC6471c3, interfaceC6471c2);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, String str, String str2, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i9 & 4) != 0) {
                i = 5;
            }
            int i10 = i;
            if ((i9 & 8) != 0) {
                i8 = 0;
            }
            int i11 = i8;
            if ((i9 & 16) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.5
                    public final void invoke(@Nullable ImageGraph imageGraph) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
            if ((i9 & 32) != 0) {
                interfaceC6471c2 = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.6
                    public final void invoke(@Nullable String str3) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            graphOperation.addImage(str, str2, i10, i11, interfaceC6471c3, interfaceC6471c2);
        }

        public static /* synthetic */ void addImage$default(GraphOperation graphOperation, Bitmap bitmap, String str, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i9, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i9 & 4) != 0) {
                i = 5;
            }
            int i10 = i;
            if ((i9 & 8) != 0) {
                i8 = 0;
            }
            int i11 = i8;
            if ((i9 & 16) != 0) {
                interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.7
                    public final void invoke(@Nullable ImageGraph imageGraph) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((ImageGraph) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            InterfaceC6471c interfaceC6471c3 = interfaceC6471c;
            if ((i9 & 32) != 0) {
                interfaceC6471c2 = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.GraphOperation.addImage.8
                    public final void invoke(@Nullable String str2) {
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        invoke((String) obj2);
                        return C5443s.f8405a;
                    }
                };
            }
            graphOperation.addImage(bitmap, str, i10, i11, interfaceC6471c3, interfaceC6471c2);
        }
    }
}
