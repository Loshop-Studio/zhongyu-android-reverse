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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.C5180R;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import com.zykj.sketch.core.data.ThumbnailBean;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.AudioOperation;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.NextPrevListener;
import com.zykj.sketch.core.listener.ProgressListener;
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
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006a5.RunnableC0013d;
import p009a8.RunnableC0023a;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u008c\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00112!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020,H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105JO\u0010<\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\f0\u00172\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f0\u00172\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010:H\u0016¢\u0006\u0004\b<\u0010=J+\u0010?\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001f2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\b?\u0010@JS\u0010G\u001a\u00020\f2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020'2\u0006\u00103\u001a\u00020'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\f0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\bG\u0010HJS\u0010G\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020'2\u0006\u00103\u001a\u00020'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\f0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\bG\u0010IJ[\u0010G\u001a\u00020\f2\u0006\u0010B\u001a\u00020A2\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020'2\u0006\u00103\u001a\u00020'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\f0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\bG\u0010KJ[\u0010G\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020'2\u0006\u00103\u001a\u00020'2\u0014\u0010E\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010D\u0012\u0004\u0012\u00020\f0\u00172\u0014\u0010F\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\bG\u0010LJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\f2\u0006\u0010O\u001a\u00020\u0011H\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0016¢\u0006\u0004\bR\u0010NJ\u000f\u0010S\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010NJ\u000f\u0010T\u001a\u00020\u0011H\u0016¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0011H\u0016¢\u0006\u0004\bV\u0010UJ+\u0010[\u001a\u00020\u00112\b\u0010X\u001a\u0004\u0018\u00010W2\b\u0010Y\u001a\u0004\u0018\u00010W2\u0006\u0010Z\u001a\u00020\u0011H\u0016¢\u0006\u0004\b[\u0010\\J7\u0010a\u001a\u00020\u00112\u0006\u0010]\u001a\u00020W2\u0006\u0010^\u001a\u00020W2\u0006\u0010_\u001a\u00020W2\u0006\u0010`\u001a\u00020W2\u0006\u0010Z\u001a\u00020\u0011H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\fH\u0016¢\u0006\u0004\bc\u0010NJ\u000f\u0010d\u001a\u00020\fH\u0016¢\u0006\u0004\bd\u0010NJ4\u0010e\u001a\u00020\f2#\u0010\u001b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(6\u0012\u0004\u0012\u00020\f0\u0017H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00020AH\u0016¢\u0006\u0004\bg\u0010hJ\u0011\u0010j\u001a\u0004\u0018\u00010iH\u0016¢\u0006\u0004\bj\u0010kJ\u000f\u0010l\u001a\u00020\u0011H\u0016¢\u0006\u0004\bl\u0010UJ\u000f\u0010m\u001a\u00020\fH\u0016¢\u0006\u0004\bm\u0010NJ\u000f\u0010n\u001a\u00020\u0011H\u0016¢\u0006\u0004\bn\u0010UJ\u000f\u0010o\u001a\u00020\fH\u0016¢\u0006\u0004\bo\u0010NJ\u0019\u0010q\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010pH\u0016¢\u0006\u0004\bq\u0010rJ\u0019\u0010t\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bt\u0010uJ\u0019\u0010w\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0004\bw\u0010xJ\u0019\u0010z\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0004\bz\u0010{J\u0015\u0010}\u001a\u00020\f2\u0006\u0010|\u001a\u00020\u0011¢\u0006\u0004\b}\u0010QR\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0017\u0010|\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010\u0088\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008d\u0001"}, m5110d2 = {"Lcom/zykj/sketch/core/record/SketchRecorderView;", "Landroid/widget/RelativeLayout;", "Lcom/zykj/sketch/core/record/GraphOperation;", "Lcom/zykj/sketch/core/listener/AudioOperation;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "listener", "Ld6/s;", "setImageDeleteListener", "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/zykj/sketch/core/config/SketchConfig;", "config", "copy", "Lkotlin/Function1;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "success", "callBack", "initConfig", "(Lcom/zykj/sketch/core/config/SketchConfig;ZLr6/c;)V", "", "", "getResList", "()Ljava/util/List;", "getConfig", "()Lcom/zykj/sketch/core/config/SketchConfig;", "Lcom/zykj/sketch/core/config/GraphConfig;", "setGraphConfig", "(Lcom/zykj/sketch/core/config/GraphConfig;)V", "", TypedValues.Custom.S_COLOR, "setBackgroundColor", "(I)V", "setSketchBackground", "Landroid/graphics/RectF;", "rectF", "setDrawArea", "(Landroid/graphics/RectF;)V", "getDrawArea", "()Landroid/graphics/RectF;", "Lcom/zykj/sketch/core/data/Mode;", "mode", "setMode", "(Lcom/zykj/sketch/core/data/Mode;)V", "path", "Lcom/zykj/sketch/core/listener/ViewControl;", "Lcom/zykj/sketch/core/graph/Graph;", "finish", "Lkotlin/Function0;", "exception", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;Lr6/a;)V", "Lcom/zykj/sketch/core/listener/PPTControl;", "addPPT", "(Ljava/lang/String;Lr6/c;)V", "Landroid/graphics/Bitmap;", "bitmap", "positionFlag", "Lcom/zykj/sketch/core/graph/ImageGraph;", "imageCallBack", "pathCallBack", "addImage", "(Landroid/graphics/Bitmap;IILr6/c;Lr6/c;)V", "(Ljava/lang/String;IILr6/c;Lr6/c;)V", "imageName", "(Landroid/graphics/Bitmap;Ljava/lang/String;IILr6/c;Lr6/c;)V", "(Ljava/lang/String;Ljava/lang/String;IILr6/c;Lr6/c;)V", "clear", "()V", "isDelete", "reset", "(Z)V", "prev", "next", "zoomIn", "()Z", "zoomOut", "", "translateX", "translateY", "keep", "tranlation", "(Ljava/lang/Float;Ljava/lang/Float;Z)Z", "scaleX", "scaleY", "centerX", "centerY", "zoom", "(FFFFZ)Z", "resetMatrix", "save", "getRecordPath", "(Lr6/c;)V", "thumbnail", "()Landroid/graphics/Bitmap;", "Lcom/zykj/sketch/core/data/ThumbnailBean;", "limitThumbnail", "()Lcom/zykj/sketch/core/data/ThumbnailBean;", "isTouch", "startRecord", "isRecord", "stopRecord", "Lcom/zykj/sketch/core/listener/ProgressListener;", "setProgressListener", "(Lcom/zykj/sketch/core/listener/ProgressListener;)V", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "setNextPrevListener", "(Lcom/zykj/sketch/core/listener/NextPrevListener;)V", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "setActionChangeListener", "(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "setGraphMatrixListener", "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V", "acceptTouchEvent", "setAcceptTouchEvent", "Lcom/zykj/sketch/widgets/DrawTempView;", "mTempDrawView", "Lcom/zykj/sketch/widgets/DrawTempView;", "Lcom/zykj/sketch/widgets/TextureDrawView;", "mDrawView", "Lcom/zykj/sketch/widgets/TextureDrawView;", "Lcom/zykj/sketch/core/record/RecordControl;", "recordControl", "Lcom/zykj/sketch/core/record/RecordControl;", "isReady", "Z", "isLoading", "sketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SketchRecorderView extends RelativeLayout implements GraphOperation, AudioOperation {
    public static final float ZOOM_IN_X = 1.2f;
    public static final float ZOOM_IN_Y = 1.2f;
    public static final float ZOOM_OUT_X = 0.8f;
    public static final float ZOOM_OUT_Y = 0.8f;

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private boolean acceptTouchEvent;
    private boolean isLoading;
    private boolean isReady;

    @NotNull
    private final TextureDrawView mDrawView;

    @NotNull
    private final DrawTempView mTempDrawView;

    @NotNull
    private RecordControl recordControl;

    @NotNull
    private SketchConfig sketchConfig;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public SketchRecorderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
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
        post(new RunnableC0023a(this, 20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m13878_init_$lambda0(SketchRecorderView this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        this$0.isReady = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initConfig$lambda-2$lambda-1, reason: not valid java name */
    public static final void m13879initConfig$lambda2$lambda1(SketchRecorderView this$0, String it, SketchConfig config, InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(it, "$it");
        AbstractC5830k.m5330g(config, "$config");
        AbstractC5830k.m5330g(callBack, "$callBack");
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
    public static final void m13880loadData$lambda12(SketchRecorderView this$0, String path, InterfaceC6471c finish, InterfaceC6469a interfaceC6469a) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(path, "$path");
        AbstractC5830k.m5330g(finish, "$finish");
        new Thread(new RunnableC5215b(this$0, path, finish, interfaceC6469a, 1)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11, reason: not valid java name */
    public static final void m13881loadData$lambda12$lambda11(final SketchRecorderView this$0, String path, InterfaceC6471c finish, final InterfaceC6469a interfaceC6469a) throws IOException {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(path, "$path");
        AbstractC5830k.m5330g(finish, "$finish");
        try {
            RecordControl.loadData$default(this$0.recordControl, path, null, new SketchRecorderView$loadData$1$1$1(this$0, finish), 2, null);
        } catch (EmptyDataException unused) {
            final int i = 3;
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            SketchRecorderView.m13883loadData$lambda12$lambda11$lambda4(interfaceC6469a, this$0);
                            break;
                        case 1:
                            SketchRecorderView.m13884loadData$lambda12$lambda11$lambda6(interfaceC6469a, this$0);
                            break;
                        case 2:
                            SketchRecorderView.m13885loadData$lambda12$lambda11$lambda8(interfaceC6469a, this$0);
                            break;
                        default:
                            SketchRecorderView.m13882loadData$lambda12$lambda11$lambda10(interfaceC6469a, this$0);
                            break;
                    }
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (HighVersionException unused2) {
            final int i8 = 1;
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i8) {
                        case 0:
                            SketchRecorderView.m13883loadData$lambda12$lambda11$lambda4(interfaceC6469a, this$0);
                            break;
                        case 1:
                            SketchRecorderView.m13884loadData$lambda12$lambda11$lambda6(interfaceC6469a, this$0);
                            break;
                        case 2:
                            SketchRecorderView.m13885loadData$lambda12$lambda11$lambda8(interfaceC6469a, this$0);
                            break;
                        default:
                            SketchRecorderView.m13882loadData$lambda12$lambda11$lambda10(interfaceC6469a, this$0);
                            break;
                    }
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (LowVersionException unused3) {
            final int i9 = 0;
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i9) {
                        case 0:
                            SketchRecorderView.m13883loadData$lambda12$lambda11$lambda4(interfaceC6469a, this$0);
                            break;
                        case 1:
                            SketchRecorderView.m13884loadData$lambda12$lambda11$lambda6(interfaceC6469a, this$0);
                            break;
                        case 2:
                            SketchRecorderView.m13885loadData$lambda12$lambda11$lambda8(interfaceC6469a, this$0);
                            break;
                        default:
                            SketchRecorderView.m13882loadData$lambda12$lambda11$lambda10(interfaceC6469a, this$0);
                            break;
                    }
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (FileNotFoundException unused4) {
            final int i10 = 2;
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            SketchRecorderView.m13883loadData$lambda12$lambda11$lambda4(interfaceC6469a, this$0);
                            break;
                        case 1:
                            SketchRecorderView.m13884loadData$lambda12$lambda11$lambda6(interfaceC6469a, this$0);
                            break;
                        case 2:
                            SketchRecorderView.m13885loadData$lambda12$lambda11$lambda8(interfaceC6469a, this$0);
                            break;
                        default:
                            SketchRecorderView.m13882loadData$lambda12$lambda11$lambda10(interfaceC6469a, this$0);
                            break;
                    }
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-10, reason: not valid java name */
    public static final void m13882loadData$lambda12$lambda11$lambda10(InterfaceC6469a interfaceC6469a, SketchRecorderView this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_file_not_found), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-4, reason: not valid java name */
    public static final void m13883loadData$lambda12$lambda11$lambda4(InterfaceC6469a interfaceC6469a, SketchRecorderView this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_low_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-6, reason: not valid java name */
    public static final void m13884loadData$lambda12$lambda11$lambda6(InterfaceC6469a interfaceC6469a, SketchRecorderView this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_height_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-8, reason: not valid java name */
    public static final void m13885loadData$lambda12$lambda11$lambda8(InterfaceC6469a interfaceC6469a, SketchRecorderView this$0) {
        AbstractC5830k.m5330g(this$0, "this$0");
        if (interfaceC6469a != null) {
            interfaceC6469a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C5180R.string.tips_file_corrupted), 0).show();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(@NotNull Bitmap bitmap, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(imageCallBack, "imageCallBack");
        AbstractC5830k.m5330g(pathCallBack, "pathCallBack");
        RecordControl.addAdapterImage$default(this.recordControl, bitmap, getWidth(), getHeight(), positionFlag, mode, imageCallBack, (String) null, pathCallBack, 64, (Object) null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addPPT(@NotNull String path, @NotNull InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(callBack, "callBack");
        this.recordControl.addAdapterPPT(path, getWidth(), getHeight(), getWidth(), getHeight(), callBack);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void clear() {
        this.recordControl.clear();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    @NotNull
    /* renamed from: getConfig, reason: from getter */
    public SketchConfig getSketchConfig() {
        return this.sketchConfig;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    @NotNull
    public RectF getDrawArea() {
        return this.recordControl.getDrawConfig();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void getRecordPath(@NotNull final InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(callBack, "callBack");
        stopRecord();
        this.recordControl.getRecordPath(getWidth(), getHeight(), new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.SketchRecorderView.getRecordPath.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@Nullable String str) {
                callBack.invoke(str);
            }
        });
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    @NotNull
    public List<String> getResList() {
        return this.recordControl.getResList();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void initConfig(@NotNull SketchConfig config, boolean copy, @NotNull InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(config, "config");
        AbstractC5830k.m5330g(callBack, "callBack");
        this.sketchConfig.setTouchable(config.getIsTouchable());
        this.sketchConfig.setMaxImageCount(config.getMaxImageCount());
        if (AbstractC5830k.m5325b(this.sketchConfig.getSourcePath(), config.getSourcePath()) || !new File(this.sketchConfig.getSourcePath()).exists() || !copy) {
            this.sketchConfig.setSourcePath(config.getSourcePath());
            callBack.invoke(Boolean.TRUE);
            return;
        }
        String sourcePath = config.getSourcePath();
        File file = new File(sourcePath);
        if (file.exists() || file.mkdirs()) {
            new Thread(new RunnableC0013d(this, sourcePath, config, callBack, 8)).start();
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
    @Nullable
    public ThumbnailBean limitThumbnail() {
        return this.recordControl.limitThumbnail();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void loadData(@NotNull String path, @NotNull InterfaceC6471c callBack, @NotNull InterfaceC6471c finish, @Nullable InterfaceC6469a exception) throws EmptyDataException, LowVersionException {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(callBack, "callBack");
        AbstractC5830k.m5330g(finish, "finish");
        if (this.isLoading) {
            return;
        }
        this.isReady = false;
        this.isLoading = true;
        post(new RunnableC5215b(this, path, finish, exception, 0));
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void next() {
        this.recordControl.nextAction();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
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
    public void setActionChangeListener(@Nullable ActionChangeListener listener) {
        this.recordControl.addActionChangeListener(listener);
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.recordControl.setDrawConfig(Integer.valueOf(color), null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setDrawArea(@NotNull RectF rectF) {
        AbstractC5830k.m5330g(rectF, "rectF");
        rectF.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.recordControl.setDrawConfig(null, rectF);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setGraphConfig(@NotNull GraphConfig config) {
        AbstractC5830k.m5330g(config, "config");
        EzyDrawBoard.ActionGraphConfig.GraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.GraphConfig.newBuilder();
        builderNewBuilder.setColor(config.getColor());
        builderNewBuilder.setWidth(config.getWidth());
        RecordControl recordControl = this.recordControl;
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfigBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(graphConfigBuild, "newBuilder.build()");
        recordControl.setGraphConfig(graphConfigBuild);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setGraphMatrixListener(@Nullable GraphMatrixListener listener) {
        this.recordControl.setGraphMatrixListener(listener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setImageDeleteListener(@Nullable ImageDeleteListener listener) {
        this.recordControl.setImageDeleteListener(listener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setMode(@NotNull Mode mode) {
        AbstractC5830k.m5330g(mode, "mode");
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
    public void setNextPrevListener(@Nullable NextPrevListener listener) {
        this.recordControl.addNextPrevListener(listener);
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public void setProgressListener(@Nullable ProgressListener listener) {
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
    @NotNull
    public Bitmap thumbnail() {
        return this.recordControl.thumbnail(getWidth(), getHeight());
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean tranlation(@Nullable Float translateX, @Nullable Float translateY, boolean keep) {
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
    public void addImage(@NotNull String path, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(imageCallBack, "imageCallBack");
        AbstractC5830k.m5330g(pathCallBack, "pathCallBack");
        RecordControl.addAdapterImage$default(this.recordControl, path, getWidth(), getHeight(), positionFlag, mode, imageCallBack, (String) null, pathCallBack, 64, (Object) null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(@NotNull Bitmap bitmap, @NotNull String imageName, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(imageName, "imageName");
        AbstractC5830k.m5330g(imageCallBack, "imageCallBack");
        AbstractC5830k.m5330g(pathCallBack, "pathCallBack");
        this.recordControl.addAdapterImage(bitmap, getWidth(), getHeight(), positionFlag, mode, imageCallBack, imageName, pathCallBack);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(@NotNull String path, @NotNull String imageName, int positionFlag, int mode, @NotNull InterfaceC6471c imageCallBack, @NotNull InterfaceC6471c pathCallBack) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(imageName, "imageName");
        AbstractC5830k.m5330g(imageCallBack, "imageCallBack");
        AbstractC5830k.m5330g(pathCallBack, "pathCallBack");
        this.recordControl.addAdapterImage(path, getWidth(), getHeight(), positionFlag, mode, imageCallBack, imageName, pathCallBack);
    }
}
