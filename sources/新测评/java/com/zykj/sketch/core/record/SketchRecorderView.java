package com.zykj.sketch.core.record;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.C7077R;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import com.zykj.sketch.core.data.ThumbnailBean;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.AudioOperation;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.NextPrevListener;
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.core.listener.ProgressListener;
import com.zykj.sketch.core.listener.ViewControl;
import com.zykj.sketch.exception.EmptyDataException;
import com.zykj.sketch.exception.HighVersionException;
import com.zykj.sketch.exception.LowVersionException;
import com.zykj.sketch.utils.FileUtils;
import com.zykj.sketch.widgets.DrawTempView;
import com.zykj.sketch.widgets.TextureDrawView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001kB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJL\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016JT\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016JL\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016JT\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u00160\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u00160\u001dH\u0016J$\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00160\u001dH\u0016J\b\u0010&\u001a\u00020\u0016H\u0016J\b\u0010'\u001a\u00020\u0014H\u0016J\b\u0010(\u001a\u00020)H\u0016J-\u0010*\u001a\u00020\u00162#\u0010$\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010 ¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00160\u001dH\u0016J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020 0.H\u0016J;\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u00142\u0006\u00101\u001a\u00020\n2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00160\u001dH\u0016J\b\u00103\u001a\u00020\nH\u0016J\b\u00104\u001a\u00020\nH\u0016J\n\u00105\u001a\u0004\u0018\u000106H\u0016JH\u00107\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u00160\u001d2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00160\u001d2\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020\u0016H\u0016J\u0010\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@H\u0017J\b\u0010A\u001a\u00020\u0016H\u0016J\u0010\u0010B\u001a\u00020\u00162\u0006\u0010C\u001a\u00020\nH\u0016J\b\u0010D\u001a\u00020\u0016H\u0016J\b\u0010E\u001a\u00020\u0016H\u0016J\u000e\u0010F\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010G\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\u0010\u0010J\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u001aH\u0016J\u0010\u0010L\u001a\u00020\u00162\u0006\u0010M\u001a\u00020)H\u0016J\u0010\u0010N\u001a\u00020\u00162\u0006\u00100\u001a\u00020OH\u0016J\u0012\u0010P\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010QH\u0016J\u0012\u0010R\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020UH\u0016J\u0012\u0010V\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010WH\u0016J\u0012\u0010X\u001a\u00020\u00162\b\u0010H\u001a\u0004\u0018\u00010YH\u0016J\u0010\u0010Z\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u001aH\u0016J\b\u0010[\u001a\u00020\u0016H\u0016J\b\u0010\\\u001a\u00020\u0016H\u0016J\b\u0010]\u001a\u00020\u0018H\u0016J)\u0010^\u001a\u00020\n2\b\u0010_\u001a\u0004\u0018\u00010`2\b\u0010a\u001a\u0004\u0018\u00010`2\u0006\u0010b\u001a\u00020\nH\u0016¢\u0006\u0002\u0010cJ0\u0010d\u001a\u00020\n2\u0006\u0010e\u001a\u00020`2\u0006\u0010f\u001a\u00020`2\u0006\u0010g\u001a\u00020`2\u0006\u0010h\u001a\u00020`2\u0006\u0010b\u001a\u00020\nH\u0016J\b\u0010i\u001a\u00020\nH\u0016J\b\u0010j\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006l"}, m13558d2 = {"Lcom/zykj/sketch/core/record/SketchRecorderView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/sketch/core/record/GraphOperation;", "Lcom/zykj/sketch/core/listener/AudioOperation;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "acceptTouchEvent", "", "isLoading", "isReady", "mDrawView", "Lcom/zykj/sketch/widgets/TextureDrawView;", "mTempDrawView", "Lcom/zykj/sketch/widgets/DrawTempView;", "recordControl", "Lcom/zykj/sketch/core/record/RecordControl;", "sketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "addImage", "", "bitmap", "Landroid/graphics/Bitmap;", "positionFlag", "", "mode", "imageCallBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "pathCallBack", "", "imageName", "path", "addPPT", "callBack", "Lcom/zykj/sketch/core/listener/PPTControl;", "clear", "getConfig", "getDrawArea", "Landroid/graphics/RectF;", "getRecordPath", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResList", "", "initConfig", "config", "copy", "success", "isRecord", "isTouch", "limitThumbnail", "Lcom/zykj/sketch/core/data/ThumbnailBean;", "loadData", "Lcom/zykj/sketch/core/listener/ViewControl;", "finish", "Lcom/zykj/sketch/core/graph/Graph;", "exception", "Lkotlin/Function0;", "next", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "prev", "reset", "isDelete", "resetMatrix", "save", "setAcceptTouchEvent", "setActionChangeListener", "listener", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "setBackgroundColor", TypedValues.Custom.S_COLOR, "setDrawArea", "rectF", "setGraphConfig", "Lcom/zykj/sketch/core/config/GraphConfig;", "setGraphMatrixListener", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "setImageDeleteListener", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "setMode", "Lcom/zykj/sketch/core/data/Mode;", "setNextPrevListener", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "setProgressListener", "Lcom/zykj/sketch/core/listener/ProgressListener;", "setSketchBackground", "startRecord", "stopRecord", "thumbnail", "tranlation", "translateX", "", "translateY", "keep", "(Ljava/lang/Float;Ljava/lang/Float;Z)Z", "zoom", "scaleX", "scaleY", "centerX", "centerY", "zoomIn", "zoomOut", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class SketchRecorderView extends RelativeLayout implements GraphOperation, AudioOperation {
    public static final float ZOOM_IN_X = 1.2f;
    public static final float ZOOM_IN_Y = 1.2f;
    public static final float ZOOM_OUT_X = 0.8f;
    public static final float ZOOM_OUT_Y = 0.8f;
    public Map<Integer, View> _$_findViewCache;
    private boolean acceptTouchEvent;
    private boolean isLoading;
    private boolean isReady;
    private final TextureDrawView mDrawView;
    private final DrawTempView mTempDrawView;
    private RecordControl recordControl;
    private SketchConfig sketchConfig;

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            iArr[Mode.ACTION_SELECT.ordinal()] = 1;
            iArr[Mode.ACTION_WRITING.ordinal()] = 2;
            iArr[Mode.ACTION_WRITING_MOVE.ordinal()] = 3;
            iArr[Mode.ACTION_SHAPE_RECT.ordinal()] = 4;
            iArr[Mode.ACTION_SHAPE_CIRCLE.ordinal()] = 5;
            iArr[Mode.ACTION_ERASER_VIEW.ordinal()] = 6;
            iArr[Mode.ACTION_ERASER_WRITING.ordinal()] = 7;
            iArr[Mode.ACTION_DELETE.ordinal()] = 8;
            iArr[Mode.ACTION_WRITING_MOVE_VERTICAL.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        DrawTempView drawTempView = new DrawTempView(context, attributeSet);
        this.mTempDrawView = drawTempView;
        TextureDrawView textureDrawView = new TextureDrawView(context, attributeSet);
        this.mDrawView = textureDrawView;
        this.acceptTouchEvent = true;
        this.sketchConfig = new SketchConfig.Builder().build(context);
        setKeepScreenOn(true);
        addView(textureDrawView);
        addView(drawTempView);
        this.recordControl = new RecordControl(this, this.sketchConfig, textureDrawView, drawTempView);
        post(new Runnable() { // from class: com.zykj.sketch.core.record.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m24285_init_$lambda0(this.f10808a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m24285_init_$lambda0(SketchRecorderView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.isReady = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initConfig$lambda-2$lambda-1, reason: not valid java name */
    public static final void m24286initConfig$lambda2$lambda1(SketchRecorderView this$0, String it, SketchConfig config, Function1 callBack) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(config, "$config");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        if (FileUtils.INSTANCE.copyFolder(this$0.sketchConfig.getSourcePath(), it)) {
            this$0.sketchConfig.setSourcePath(config.getSourcePath());
            callBack.invoke(Boolean.TRUE);
        } else {
            this$0.sketchConfig.setSourcePath(config.getSourcePath());
            callBack.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12, reason: not valid java name */
    public static final void m24287loadData$lambda12(final SketchRecorderView this$0, final String path, final Function1 finish, final Function0 function0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(finish, "$finish");
        new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.e
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                SketchRecorderView.m24288loadData$lambda12$lambda11(this.f10813a, path, finish, function0);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11, reason: not valid java name */
    public static final void m24288loadData$lambda12$lambda11(final SketchRecorderView this$0, String path, Function1 finish, final Function0 function0) throws IOException {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(finish, "$finish");
        try {
            RecordControl.loadData$default(this$0.recordControl, path, null, new SketchRecorderView$loadData$1$1$1(this$0, finish), 2, null);
        } catch (EmptyDataException unused) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.i
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m24289loadData$lambda12$lambda11$lambda10(function0, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (HighVersionException unused2) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.g
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m24291loadData$lambda12$lambda11$lambda6(function0, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (LowVersionException unused3) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.f
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m24290loadData$lambda12$lambda11$lambda4(function0, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (FileNotFoundException unused4) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.h
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m24292loadData$lambda12$lambda11$lambda8(function0, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-10, reason: not valid java name */
    public static final void m24289loadData$lambda12$lambda11$lambda10(Function0 function0, SketchRecorderView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function0 != null) {
            function0.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7077R.string.tips_file_not_found), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-4, reason: not valid java name */
    public static final void m24290loadData$lambda12$lambda11$lambda4(Function0 function0, SketchRecorderView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function0 != null) {
            function0.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7077R.string.tips_low_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-6, reason: not valid java name */
    public static final void m24291loadData$lambda12$lambda11$lambda6(Function0 function0, SketchRecorderView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function0 != null) {
            function0.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7077R.string.tips_height_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-8, reason: not valid java name */
    public static final void m24292loadData$lambda12$lambda11$lambda8(Function0 function0, SketchRecorderView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (function0 != null) {
            function0.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7077R.string.tips_file_corrupted), 0).show();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(Bitmap bitmap, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageCallBack, "imageCallBack");
        Intrinsics.checkNotNullParameter(pathCallBack, "pathCallBack");
        RecordControl.addAdapterImage$default(this.recordControl, bitmap, getWidth(), getHeight(), positionFlag, mode, imageCallBack, (String) null, pathCallBack, 64, (Object) null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addPPT(String path, Function1<? super PPTControl, Unit> callBack) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.recordControl.addAdapterPPT(path, getWidth(), getHeight(), getWidth(), getHeight(), callBack);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void clear() {
        this.recordControl.clear();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    /* renamed from: getConfig, reason: from getter */
    public SketchConfig getSketchConfig() {
        return this.sketchConfig;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public RectF getDrawArea() {
        return this.recordControl.getDrawConfig();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void getRecordPath(final Function1<? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        stopRecord();
        this.recordControl.getRecordPath(getWidth(), getHeight(), new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.SketchRecorderView.getRecordPath.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                callBack.invoke(str);
            }
        });
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public List<String> getResList() {
        return this.recordControl.getResList();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void initConfig(final SketchConfig config, boolean copy, final Function1<? super Boolean, Unit> callBack) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        this.sketchConfig.setTouchable(config.getIsTouchable());
        this.sketchConfig.setMaxImageCount(config.getMaxImageCount());
        if (Intrinsics.areEqual(this.sketchConfig.getSourcePath(), config.getSourcePath()) || !new File(this.sketchConfig.getSourcePath()).exists() || !copy) {
            this.sketchConfig.setSourcePath(config.getSourcePath());
            callBack.invoke(Boolean.TRUE);
            return;
        }
        final String sourcePath = config.getSourcePath();
        File file = new File(sourcePath);
        if (file.exists() || file.mkdirs()) {
            new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.j
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m24286initConfig$lambda2$lambda1(this.f10825a, sourcePath, config, callBack);
                }
            }).start();
        } else {
            callBack.invoke(Boolean.FALSE);
        }
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public boolean isRecord() {
        return this.recordControl.isRecord();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean isTouch() {
        return this.recordControl.isTouch();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public ThumbnailBean limitThumbnail() {
        return this.recordControl.limitThumbnail();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void loadData(final String path, Function1<? super ViewControl, Unit> callBack, final Function1<? super Graph, Unit> finish, final Function0<Unit> exception) throws EmptyDataException, LowVersionException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Intrinsics.checkNotNullParameter(finish, "finish");
        if (this.isLoading) {
            return;
        }
        this.isReady = false;
        this.isLoading = true;
        post(new Runnable() { // from class: com.zykj.sketch.core.record.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m24287loadData$lambda12(this.f10809a, path, finish, exception);
            }
        });
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void next() {
        this.recordControl.nextAction();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!this.isReady || this.isLoading || !this.acceptTouchEvent) {
            return true;
        }
        this.recordControl.onTouchAdapterEvent(event);
        return true;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void prev() {
        this.recordControl.prevAction();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void reset(boolean isDelete) {
        this.recordControl.reset(isDelete);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void resetMatrix() {
        this.recordControl.resetMatrix();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void save() {
        RecordControl.getRecordPath$default(this.recordControl, getWidth(), getHeight(), null, 4, null);
    }

    public final void setAcceptTouchEvent(boolean acceptTouchEvent) {
        this.acceptTouchEvent = acceptTouchEvent;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setActionChangeListener(ActionChangeListener listener) {
        this.recordControl.addActionChangeListener(listener);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.recordControl.setDrawConfig(Integer.valueOf(color), null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setDrawArea(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        rectF.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.recordControl.setDrawConfig(null, rectF);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setGraphConfig(GraphConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        EzyDrawBoard.ActionGraphConfig.GraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.GraphConfig.newBuilder();
        builderNewBuilder.setColor(config.getColor());
        builderNewBuilder.setWidth(config.getWidth());
        RecordControl recordControl = this.recordControl;
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfigBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(graphConfigBuild, "newBuilder.build()");
        recordControl.setGraphConfig(graphConfigBuild);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setGraphMatrixListener(GraphMatrixListener listener) {
        this.recordControl.setGraphMatrixListener(listener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setImageDeleteListener(ImageDeleteListener listener) {
        this.recordControl.setImageDeleteListener(listener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setMode(Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        switch (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
            case 1:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_SELECT);
                break;
            case 2:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING);
                break;
            case 3:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE);
                break;
            case 4:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_SHAPE_RECT);
                break;
            case 5:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_SHAPE_CIRCLE);
                break;
            case 6:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_VIEW);
                break;
            case 7:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_WRITING);
                break;
            case 8:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_DELETE);
                break;
            case 9:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE_VERTICAL);
                break;
        }
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setNextPrevListener(NextPrevListener listener) {
        this.recordControl.addNextPrevListener(listener);
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public void setProgressListener(ProgressListener listener) {
        this.recordControl.addProgressListener(listener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setSketchBackground(int color) {
        this.recordControl.setDrawConfig(Integer.valueOf(color), null);
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public void startRecord() {
        if (isRecord()) {
            return;
        }
        this.recordControl.startAudio();
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public void stopRecord() {
        if (isRecord()) {
            this.recordControl.stopAudio();
        }
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public Bitmap thumbnail() {
        return this.recordControl.thumbnail(getWidth(), getHeight());
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean tranlation(Float translateX, Float translateY, boolean keep) {
        return this.recordControl.translation(translateX, translateY, keep);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean zoom(float scaleX, float scaleY, float centerX, float centerY, boolean keep) {
        return this.recordControl.zoom(scaleX, scaleY, centerX, centerY, keep);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean zoomIn() {
        return RecordControl.zoom$default(this.recordControl, 1.2f, 1.2f, getWidth() / 2.0f, getHeight() / 2.0f, false, 16, null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean zoomOut() {
        return RecordControl.zoom$default(this.recordControl, 0.8f, 0.8f, getWidth() / 2.0f, getHeight() / 2.0f, false, 16, null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(String path, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(imageCallBack, "imageCallBack");
        Intrinsics.checkNotNullParameter(pathCallBack, "pathCallBack");
        RecordControl.addAdapterImage$default(this.recordControl, path, getWidth(), getHeight(), positionFlag, mode, imageCallBack, (String) null, pathCallBack, 64, (Object) null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(Bitmap bitmap, String imageName, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageCallBack, "imageCallBack");
        Intrinsics.checkNotNullParameter(pathCallBack, "pathCallBack");
        this.recordControl.addAdapterImage(bitmap, getWidth(), getHeight(), positionFlag, mode, imageCallBack, imageName, pathCallBack);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(String path, String imageName, int positionFlag, int mode, Function1<? super ImageGraph, Unit> imageCallBack, Function1<? super String, Unit> pathCallBack) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(imageCallBack, "imageCallBack");
        Intrinsics.checkNotNullParameter(pathCallBack, "pathCallBack");
        this.recordControl.addAdapterImage(path, getWidth(), getHeight(), positionFlag, mode, imageCallBack, imageName, pathCallBack);
    }
}
