package com.zykj.sketch.core.record;

// RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.C7077R;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.ActionRecord;
import com.zykj.sketch.core.ActionRecordExecute;
import com.zykj.sketch.core.ActionStrategyFactory;
import com.zykj.sketch.core.EventTaskParseFactory;
import com.zykj.sketch.core.GraphControl;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.GraphTask;
import com.zykj.sketch.core.data.ThumbnailBean;
import com.zykj.sketch.core.data.VersionParseFactory;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.graph.ImageHistoryGraph;
import com.zykj.sketch.core.graph.WebViewGraph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.EventListener;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.ImitateDraw;
import com.zykj.sketch.core.listener.NextPrevListener;
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.core.listener.ProgressListener;
import com.zykj.sketch.core.listener.RealDraw;
import com.zykj.sketch.core.listener.ViewControl;
import com.zykj.sketch.core.version.ITaskParse;
import com.zykj.sketch.exception.EmptyDataException;
import com.zykj.sketch.exception.HighVersionException;
import com.zykj.sketch.exception.LowVersionException;
import com.zykj.sketch.utils.EventConvertUtils;
import com.zykj.sketch.utils.FileUtils;
import com.zykj.sketch.utils.ToastUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p148io.FilesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(m13557d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 |2\u00020\u0001:\u0001|B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJl\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"2\u0016\b\u0002\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u001b0'2\b\b\u0002\u0010)\u001a\u00020*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u001b0'Jf\u0010\u001e\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020*2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u001b0'2\b\b\u0002\u0010)\u001a\u00020*2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010*\u0012\u0004\u0012\u00020\u001b0'JB\u0010-\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020*2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u001b0'JF\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020*2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0014\u0010&\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010(\u0012\u0004\u0012\u00020\u001b0'H\u0002J\u0010\u00103\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u000104J\u0010\u00105\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u000106J\u0006\u00107\u001a\u00020\u001bJ0\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0002J4\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u00020\"2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001b0'H\u0002J\u0016\u0010C\u001a\u00020\u001b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020D0?H\u0002J\u0006\u0010E\u001a\u00020FJ\u001e\u0010G\u001a\u00020\u001b2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020*0I2\u0006\u0010J\u001a\u00020KH\u0002J=\u0010L\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"2%\b\u0002\u0010&\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010*¢\u0006\f\bM\u0012\b\bN\u0012\u0004\b\b(,\u0012\u0004\u0012\u00020\u001b0'J\f\u0010O\u001a\b\u0012\u0004\u0012\u00020*0PJ\u0006\u0010Q\u001a\u00020RJ\u0006\u0010S\u001a\u00020RJ\b\u0010T\u001a\u0004\u0018\u00010UJ8\u0010V\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020*2\u0014\b\u0002\u0010A\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u001b0'2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\u001b0'J\u0006\u0010X\u001a\u00020\u001bJ\u0006\u0010Y\u001a\u00020\u001bJ\u000e\u0010Z\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020\\J\u0006\u0010]\u001a\u00020\u001bJ\u0010\u0010^\u001a\u00020\u001b2\b\b\u0002\u0010_\u001a\u00020RJ\u0006\u0010`\u001a\u00020\u001bJ\u0018\u0010a\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"H\u0002J\u000e\u0010b\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020cJ\u001f\u0010d\u001a\u00020\u001b2\b\u0010e\u001a\u0004\u0018\u00010\"2\b\u0010f\u001a\u0004\u0018\u00010F¢\u0006\u0002\u0010gJ\u000e\u0010h\u001a\u00020\u001b2\u0006\u0010i\u001a\u00020jJ\u0010\u0010k\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010lJ\u0010\u0010m\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010nJ\u0006\u0010o\u001a\u00020\u001bJ\u0006\u0010p\u001a\u00020\u001bJ\u0016\u0010q\u001a\u00020 2\u0006\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u00020\"J'\u0010r\u001a\u00020R2\b\u0010s\u001a\u0004\u0018\u0001092\b\u0010t\u001a\u0004\u0018\u0001092\u0006\u0010u\u001a\u00020R¢\u0006\u0002\u0010vJ0\u0010w\u001a\u00020R2\u0006\u0010x\u001a\u0002092\u0006\u0010y\u001a\u0002092\u0006\u0010z\u001a\u0002092\u0006\u0010{\u001a\u0002092\b\b\u0002\u0010u\u001a\u00020RR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006}"}, m13558d2 = {"Lcom/zykj/sketch/core/record/RecordControl;", "", "viewGroup", "Landroid/view/ViewGroup;", "sketchConfig", "Lcom/zykj/sketch/core/config/SketchConfig;", "realDraw", "Lcom/zykj/sketch/core/listener/RealDraw;", "imitateDraw", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V", "actionExecute", "Lcom/zykj/sketch/core/ActionRecordExecute;", "actionFactory", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "actionRecord", "Lcom/zykj/sketch/core/ActionRecord;", "audioControl", "Lcom/zykj/sketch/core/record/AudioControl;", "cameraInvertMatrix", "Landroid/graphics/Matrix;", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "graphControl", "Lcom/zykj/sketch/core/GraphControl;", "addActionChangeListener", "", "listener", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "addAdapterImage", "bitmap", "Landroid/graphics/Bitmap;", "viewWidth", "", "viewHeight", "positionFlag", "mode", "callBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "imageName", "", "pathCallBack", "path", "addAdapterPPT", "width", "height", "Lcom/zykj/sketch/core/listener/PPTControl;", "addImage", "filePath", "addNextPrevListener", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "addProgressListener", "Lcom/zykj/sketch/core/listener/ProgressListener;", "clear", "countScale", "", "bitmapWidth", "bitmapHeight", "executeActionContent", "version", "parseEventList", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "viewBack", "Lcom/zykj/sketch/core/listener/ViewControl;", "executeTask", "Lcom/zykj/sketch/core/data/GraphTask;", "getDrawConfig", "Landroid/graphics/RectF;", "getImagePath", "list", "Ljava/util/ArrayList;", "graph", "Lcom/zykj/sketch/core/graph/Graph;", "getRecordPath", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getResList", "", "isRecord", "", "isTouch", "limitThumbnail", "Lcom/zykj/sketch/core/data/ThumbnailBean;", "loadData", "finish", "nextAction", "onDestroy", "onTouchAdapterEvent", NotificationCompat.CATEGORY_EVENT, "Landroid/view/MotionEvent;", "prevAction", "reset", "isDelete", "resetMatrix", "saveBitmap", "setActionMode", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "setDrawConfig", TypedValues.Custom.S_COLOR, "rectF", "(Ljava/lang/Integer;Landroid/graphics/RectF;)V", "setGraphConfig", "config", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "setGraphMatrixListener", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "setImageDeleteListener", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "startAudio", "stopAudio", "thumbnail", "translation", "translateX", "translateY", "keep", "(Ljava/lang/Float;Ljava/lang/Float;Z)Z", "zoom", "scaleX", "scaleY", "centerX", "centerY", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class RecordControl {
    public static final String thumbnailFileName = "thumbnail.jpg";
    private final ActionRecordExecute actionExecute;
    private final ActionStrategyFactory actionFactory;
    private final ActionRecord actionRecord;
    private AudioControl audioControl;
    private Matrix cameraInvertMatrix;
    private final Context context;
    private final GraphControl graphControl;
    private final SketchConfig sketchConfig;
    private final ViewGroup viewGroup;

    public RecordControl(ViewGroup viewGroup, SketchConfig sketchConfig, RealDraw realDraw, ImitateDraw imitateDraw) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(sketchConfig, "sketchConfig");
        Intrinsics.checkNotNullParameter(realDraw, "realDraw");
        Intrinsics.checkNotNullParameter(imitateDraw, "imitateDraw");
        this.viewGroup = viewGroup;
        this.sketchConfig = sketchConfig;
        Context context = viewGroup.getContext();
        this.context = context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        GraphControl graphControl = new GraphControl(context, realDraw, imitateDraw, sketchConfig);
        this.graphControl = graphControl;
        ActionStrategyFactory actionStrategyFactory = new ActionStrategyFactory(graphControl);
        this.actionFactory = actionStrategyFactory;
        ActionRecord actionRecord = new ActionRecord(graphControl, actionStrategyFactory);
        this.actionRecord = actionRecord;
        this.audioControl = new AudioControl(actionRecord);
        this.actionExecute = new ActionRecordExecute(viewGroup, graphControl, actionRecord, actionStrategyFactory);
        this.cameraInvertMatrix = new Matrix();
    }

    public static /* synthetic */ void addAdapterImage$default(RecordControl recordControl, Bitmap bitmap, int i10, int i11, int i12, int i13, Function1 function1, String str, Function1 function12, int i14, Object obj) {
        String strReplace$default;
        int i15 = (i14 & 8) != 0 ? 0 : i12;
        int i16 = (i14 & 16) != 0 ? 24 : i13;
        Function1 function13 = (i14 & 32) != 0 ? new Function1<ImageGraph, Unit>() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ImageGraph imageGraph) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ImageGraph imageGraph) {
                invoke2(imageGraph);
                return Unit.INSTANCE;
            }
        } : function1;
        if ((i14 & 64) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            strReplace$default = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
        } else {
            strReplace$default = str;
        }
        recordControl.addAdapterImage(bitmap, i10, i11, i15, i16, (Function1<? super ImageGraph, Unit>) function13, strReplace$default, (Function1<? super String, Unit>) ((i14 & 128) != 0 ? new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str2) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                invoke2(str2);
                return Unit.INSTANCE;
            }
        } : function12));
    }

    private final void addImage(String filePath, int viewWidth, int viewHeight, int positionFlag, int mode, Function1<? super ImageGraph, Unit> callBack) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(filePath, options);
        float fCountScale = countScale(options.outWidth, options.outHeight, viewWidth, viewHeight, mode);
        ActionRecordExecute actionRecordExecute = this.actionExecute;
        ActionRecord actionRecord = this.actionRecord;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = new File(filePath).getName();
        Intrinsics.checkNotNullExpressionValue(name, "File(filePath).name");
        actionRecordExecute.onAddImageEvent(actionRecord.buildImageData(jCurrentTimeMillis, name, (int) (options.outWidth * fCountScale), (int) (options.outHeight * fCountScale), (int) (viewWidth / this.graphControl.getScale()), (int) (viewHeight / this.graphControl.getScale()), positionFlag), callBack);
    }

    private final float countScale(int bitmapWidth, int bitmapHeight, int viewWidth, int viewHeight, int mode) {
        float scale;
        float scale2;
        float scale3;
        if (mode == 24) {
            scale = 2;
            scale2 = (viewWidth / this.graphControl.getScale()) / scale;
            scale3 = viewHeight / this.graphControl.getScale();
        } else if (mode != 25) {
            scale2 = viewWidth / this.graphControl.getScale();
            scale3 = viewHeight;
            scale = this.graphControl.getScale();
        } else {
            scale2 = viewWidth / (this.graphControl.getScale() / 0.9f);
            scale3 = viewHeight;
            scale = this.graphControl.getScale() / 0.9f;
        }
        float f10 = scale3 / scale;
        float f11 = scale2 / bitmapWidth;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        float f12 = f10 / bitmapHeight;
        float f13 = f12 <= 1.0f ? f12 : 1.0f;
        switch (mode) {
        }
        return Math.min(f11, f13);
    }

    private final void executeActionContent(int version, List<EzyDrawBoard.ActionContent> parseEventList, final Function1<? super ViewControl, Unit> viewBack) {
        int size = parseEventList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                size = -1;
                break;
            } else if (parseEventList.get(size).hasGraphSnapshot()) {
                break;
            }
        }
        if (size <= -1) {
            executeTask(EventTaskParseFactory.INSTANCE.create(version).parse(parseEventList, this.actionExecute, new Function1<ViewControl, Unit>() { // from class: com.zykj.sketch.core.record.RecordControl.executeActionContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewControl viewControl) {
                    invoke2(viewControl);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ViewControl viewControl) {
                    Intrinsics.checkNotNullParameter(viewControl, "viewControl");
                    RecordControl.this.actionExecute.addViewControl(viewControl);
                    viewBack.invoke(viewControl);
                }
            }).getGraphTask());
            return;
        }
        int i10 = size + 1;
        this.actionRecord.addHistoryRecord(parseEventList.subList(0, i10));
        EventListener.DefaultImpls.graphSnapShot$default(this.actionExecute, parseEventList.get(size), false, 2, null);
        this.actionRecord.addHistoryRenderGraphSnapshot(parseEventList.get(size));
        if (size != parseEventList.size() - 1) {
            executeTask(ITaskParse.DefaultImpls.parse$default(EventTaskParseFactory.INSTANCE.create(version), parseEventList.subList(i10, parseEventList.size()), this.actionExecute, null, 4, null).getGraphTask());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void executeActionContent$default(RecordControl recordControl, int i10, List list, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = new Function1<ViewControl, Unit>() { // from class: com.zykj.sketch.core.record.RecordControl.executeActionContent.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ViewControl it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewControl viewControl) {
                    invoke2(viewControl);
                    return Unit.INSTANCE;
                }
            };
        }
        recordControl.executeActionContent(i10, list, function1);
    }

    private final void executeTask(List<GraphTask> parseEventList) {
        Iterator<T> it = parseEventList.iterator();
        while (it.hasNext()) {
            ((GraphTask) it.next()).getExecuteVoid().invoke();
        }
    }

    private final void getImagePath(ArrayList<String> list, Graph graph) {
        if (graph instanceof ImageGraph) {
            list.add(((ImageGraph) graph).getFileName());
        } else if (graph instanceof ImageHistoryGraph) {
            list.add(((ImageHistoryGraph) graph).getFileName());
        }
        Iterator<T> it = graph.getChild().iterator();
        while (it.hasNext()) {
            getImagePath(list, (Graph) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getRecordPath$default(RecordControl recordControl, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            function1 = new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.RecordControl.getRecordPath.1
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
        recordControl.getRecordPath(i10, i11, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRecordPath$lambda-13, reason: not valid java name */
    public static final void m24283getRecordPath$lambda13(int i10, int i11, RecordControl this$0, Function1 callBack) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callBack, "$callBack");
        if (i10 <= 0 || i11 <= 0) {
            callBack.invoke(null);
            return;
        }
        this$0.saveBitmap(i10, i11);
        this$0.actionRecord.saveRecord(this$0.sketchConfig.getSourcePath(), i10, i11);
        callBack.invoke(this$0.sketchConfig.getSourcePath());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadData$default(RecordControl recordControl, String str, Function1 function1, Function1 function12, int i10, Object obj) throws HighVersionException, EmptyDataException, LowVersionException, IOException {
        if ((i10 & 2) != 0) {
            function1 = new Function1<ViewControl, Unit>() { // from class: com.zykj.sketch.core.record.RecordControl.loadData.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ViewControl it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ViewControl viewControl) {
                    invoke2(viewControl);
                    return Unit.INSTANCE;
                }
            };
        }
        recordControl.loadData(str, function1, function12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-1$lambda-0, reason: not valid java name */
    public static final void m24284loadData$lambda1$lambda0(EzyDrawBoard.BoardHead it, String path, EzyDrawBoard.DrawBoard drawBoard, RecordControl this$0, Function1 viewBack, Function1 finish) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBack, "$viewBack");
        Intrinsics.checkNotNullParameter(finish, "$finish");
        VersionParseFactory.Companion companion = VersionParseFactory.INSTANCE;
        int version = it.getVersion();
        EzyDrawBoard.BoardBody boardBody = drawBoard.getBoardBody();
        Intrinsics.checkNotNullExpressionValue(boardBody, "data.boardBody");
        this$0.executeActionContent(it.getVersion(), companion.parse(version, path, boardBody), viewBack);
        this$0.graphControl.render();
        this$0.graphControl.setMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING);
        this$0.graphControl.resetGraph();
        this$0.graphControl.resetStatus();
        this$0.actionFactory.reset();
        finish.invoke(this$0.graphControl.getRootGraph());
    }

    public static /* synthetic */ void reset$default(RecordControl recordControl, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        recordControl.reset(z9);
    }

    private final void saveBitmap(int width, int height) {
        Bitmap bitmapThumbnail = thumbnail(width, height);
        FileUtils.INSTANCE.saveBitmap2SDCard(bitmapThumbnail, this.graphControl.getBasePath() + thumbnailFileName);
        bitmapThumbnail.recycle();
    }

    public static /* synthetic */ boolean zoom$default(RecordControl recordControl, float f10, float f11, float f12, float f13, boolean z9, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z9 = true;
        }
        return recordControl.zoom(f10, f11, f12, f13, z9);
    }

    public final void addActionChangeListener(ActionChangeListener listener) {
        this.actionRecord.addActionChangeListener(listener);
    }

    public final void addAdapterImage(Bitmap bitmap, int viewWidth, int viewHeight, int positionFlag, int mode, Function1<? super ImageGraph, Unit> callBack, String imageName, Function1<? super String, Unit> pathCallBack) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(pathCallBack, "pathCallBack");
        Graph rootGraph = this.graphControl.getRootGraph();
        String name = ImageGraph.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ImageGraph::class.java.name");
        if (rootGraph.childTypeNumber(name) >= this.sketchConfig.getMaxImageCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C7077R.string.tips_max_image, Integer.valueOf(this.sketchConfig.getMaxImageCount())));
            callBack.invoke(null);
            return;
        }
        String str = this.graphControl.getBaseImagePath() + imageName + ".jpg";
        FileUtils.Companion companion = FileUtils.INSTANCE;
        String absolutePath = new File(str).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "File(imagePath).absolutePath");
        pathCallBack.invoke(companion.saveBitmap2SDCard(bitmap, absolutePath));
        addImage(str, viewWidth, viewHeight, positionFlag, mode, callBack);
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    // Copies the source folder contents into res/ and records the entry name, time
    // and dimensions. The playback graph looks for the same entry under res/ppt/.
    public final void addAdapterPPT(String path, int width, int height, int viewWidth, int viewHeight, Function1<? super PPTControl, Unit> callBack) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        Graph rootGraph = this.graphControl.getRootGraph();
        String name = WebViewGraph.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "WebViewGraph::class.java.name");
        if (rootGraph.childTypeNumber(name) >= this.sketchConfig.getMaxPPTCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C7077R.string.tips_max_ppt, Integer.valueOf(this.sketchConfig.getMaxPPTCount())));
            return;
        }
        File file = new File(path);
        if (!file.exists()) {
            Context context2 = this.context;
            ToastUtils.showShort(context2, context2.getString(C7077R.string.tips_file_not_found));
            return;
        }
        FileUtils.Companion companion = FileUtils.INSTANCE;
        String absolutePath = file.getParentFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "file.parentFile.absolutePath");
        String absolutePath2 = new File(this.graphControl.getBasePPTPath()).getParentFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath2, "File(graphControl.getBas…).parentFile.absolutePath");
        companion.copyFolder(absolutePath, absolutePath2);
        ActionRecordExecute actionRecordExecute = this.actionExecute;
        ActionRecord actionRecord = this.actionRecord;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name2 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "file.name");
        actionRecordExecute.onAddPPTEvent(actionRecord.buildWebViewData(jCurrentTimeMillis, name2, width, height, viewWidth, viewHeight), callBack);
    }

    public final void addNextPrevListener(NextPrevListener listener) {
        this.actionRecord.addNextPrevListener(listener);
    }

    public final void addProgressListener(ProgressListener listener) {
        this.audioControl.addListener(listener);
    }

    public final void clear() {
        this.actionExecute.onClearBoardEvent(this.actionRecord.buildClearBoardData(System.currentTimeMillis()));
    }

    public final RectF getDrawConfig() {
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        return drawArea != null ? new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY()) : new RectF();
    }

    public final void getRecordPath(final int width, final int height, final Function1<? super String, Unit> callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.b
            @Override // java.lang.Runnable
            public final void run() {
                RecordControl.m24283getRecordPath$lambda13(width, height, this, callBack);
            }
        }).start();
    }

    public final List<String> getResList() {
        ArrayList<String> arrayList = new ArrayList<>();
        getImagePath(arrayList, this.graphControl.getRootGraph());
        return arrayList;
    }

    public final boolean isRecord() {
        boolean zIsRecord;
        synchronized (this.audioControl) {
            zIsRecord = this.audioControl.getIsRecord();
        }
        return zIsRecord;
    }

    public final boolean isTouch() {
        return this.graphControl.getIsTouch();
    }

    public final ThumbnailBean limitThumbnail() {
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        if (drawArea != null) {
            ActionRecordExecute actionRecordExecute = this.actionExecute;
            List<Float> matrixList = drawArea.getMatrixList();
            Intrinsics.checkNotNullExpressionValue(matrixList, "this.matrixList");
            Matrix matrixBuildMatrix = actionRecordExecute.buildMatrix(matrixList);
            Graph graphBuildGraph = this.actionExecute.buildGraph(null, this.graphControl.getRootGraph().getSnapshot());
            if (graphBuildGraph != null) {
                RectF rectF = new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY());
                RectF rectF2 = new RectF();
                matrixBuildMatrix.mapRect(rectF2, rectF);
                if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
                    Bitmap bitmap = Bitmap.createBitmap((int) rectF2.width(), (int) rectF2.height(), Bitmap.Config.ARGB_8888);
                    matrixBuildMatrix.postTranslate(-rectF2.left, -rectF2.top);
                    graphBuildGraph.setMatrix(matrixBuildMatrix);
                    Matrix cameraMatrix = this.graphControl.getCameraMatrix();
                    this.graphControl.setCameraMatrix(new Matrix());
                    graphBuildGraph.onDrawComplete(new Canvas(bitmap), new Function1<Graph, Boolean>() { // from class: com.zykj.sketch.core.record.RecordControl$limitThumbnail$1$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(Graph graph) {
                            Intrinsics.checkNotNullParameter(graph, "graph");
                            return Boolean.valueOf(graph instanceof WritingGroupGraph);
                        }
                    });
                    matrixBuildMatrix.mapRect(rectF2, rectF);
                    RectF rectFMaxWritingRenderOutRectF = GraphExtKt.maxWritingRenderOutRectF(graphBuildGraph);
                    this.graphControl.setCameraMatrix(cameraMatrix);
                    Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
                    return new ThumbnailBean(bitmap, rectFMaxWritingRenderOutRectF, rectF2);
                }
            }
        }
        return null;
    }

    public final void loadData(final String path, final Function1<? super ViewControl, Unit> viewBack, final Function1<? super Graph, Unit> finish) throws HighVersionException, EmptyDataException, LowVersionException, IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(viewBack, "viewBack");
        Intrinsics.checkNotNullParameter(finish, "finish");
        final EzyDrawBoard.DrawBoard from = EzyDrawBoard.DrawBoard.parseFrom(new FileInputStream(new File(path, "actions.bin")));
        if (!from.hasBoardHead()) {
            finish.invoke(this.graphControl.getRootGraph());
            throw new EmptyDataException(path);
        }
        final EzyDrawBoard.BoardHead boardHead = from.getBoardHead();
        if (boardHead != null) {
            if (boardHead.getCreateDate() >= 1546272000 && boardHead.getVersion() >= 2) {
                if (boardHead.getVersion() <= 5) {
                    this.sketchConfig.setSourcePath(path);
                    this.actionRecord.setHeader(boardHead);
                    this.graphControl.setCameraMatrix(this.viewGroup.getWidth(), this.viewGroup.getHeight(), boardHead.getWidth(), boardHead.getHeight());
                    this.graphControl.getCameraMatrix().invert(this.cameraInvertMatrix);
                    new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            RecordControl.m24284loadData$lambda1$lambda0(boardHead, path, from, this, viewBack, finish);
                        }
                    }).start();
                    return;
                }
                finish.invoke(this.graphControl.getRootGraph());
                throw new HighVersionException("version=" + boardHead.getVersion() + " Maximum resolution version=5");
            }
            File file = new File(path + File.separator + thumbnailFileName);
            if (!file.exists()) {
                finish.invoke(this.graphControl.getRootGraph());
                throw new EmptyDataException(path);
            }
            Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            addAdapterImage$default(this, bitmap, this.viewGroup.getWidth(), this.viewGroup.getHeight(), 0, 23, (Function1) null, (String) null, (Function1) null, 224, (Object) null);
            this.graphControl.forceRender();
            finish.invoke(this.graphControl.getRootGraph());
        }
    }

    public final void nextAction() {
        this.actionExecute.onNextActionEvent(this.actionRecord.buildNextActionData(System.currentTimeMillis()));
    }

    public final void onDestroy() {
        this.graphControl.onDestroy();
    }

    public final void onTouchAdapterEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EzyDrawBoard.ActionTouchEvent.TouchEvent touchEventEvent2MotionEvent = EventConvertUtils.INSTANCE.event2MotionEvent(event, this.cameraInvertMatrix);
        if (touchEventEvent2MotionEvent != null) {
            this.actionExecute.onTouchEvent(touchEventEvent2MotionEvent);
        }
    }

    public final void prevAction() {
        this.actionExecute.onPrevActionEvent(this.actionRecord.buildPrevActionData(System.currentTimeMillis()));
    }

    public final void reset(boolean isDelete) {
        this.actionFactory.reset();
        this.actionExecute.reset();
        this.graphControl.reset();
        this.audioControl.reset();
        if (isDelete) {
            Iterator it = SequencesKt.filter(FilesKt.walk$default(new File(this.sketchConfig.getSourcePath()), null, 1, null), new Function1<File, Boolean>() { // from class: com.zykj.sketch.core.record.RecordControl.reset.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(File it2) {
                    Intrinsics.checkNotNullParameter(it2, "it");
                    return Boolean.valueOf(it2.isFile());
                }
            }).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
    }

    public final void resetMatrix() {
        this.actionExecute.resetMatrix(this.actionRecord.buildResetMatrix(System.currentTimeMillis()));
    }

    public final void setActionMode(EzyDrawBoard.ActionModeConfig.Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.actionExecute.onActionModeEvent(this.actionRecord.buildModeConfig(System.currentTimeMillis(), mode));
    }

    public final void setDrawConfig(Integer color, RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = new RectF();
            Matrix matrix = new Matrix();
            matrix.postConcat(this.cameraInvertMatrix);
            matrix.postConcat(GraphExtKt.inverts(this.graphControl.getRootGraph().getMMatrix()));
            matrix.mapRect(rectF2, rectF);
            GraphSnapshot.PointF pointFBuild = GraphSnapshot.PointF.newBuilder().setX(rectF2.left).setY(rectF2.top).build();
            GraphSnapshot.PointF pointFBuild2 = GraphSnapshot.PointF.newBuilder().setX(rectF2.right).setY(rectF2.bottom).build();
            float[] fArr = new float[9];
            this.graphControl.getRootGraph().getMMatrix().getValues(fArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 9; i10++) {
                arrayList.add(Float.valueOf(fArr[i10]));
            }
            this.actionExecute.onDrawConfigEvent(this.actionRecord.buildDrawConfig(System.currentTimeMillis(), color, EzyDrawBoard.DrawArea.newBuilder().setLeftTopPoint(pointFBuild).setRightBottomPoint(pointFBuild2).addAllMatrix(arrayList).build()));
        }
    }

    public final void setGraphConfig(EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.actionExecute.onGraphConfigEvent(this.actionRecord.buildGraphConfig(System.currentTimeMillis(), config));
    }

    public final void setGraphMatrixListener(GraphMatrixListener listener) {
        this.graphControl.setGraphMatrixListener(listener);
    }

    public final void setImageDeleteListener(ImageDeleteListener listener) {
        this.graphControl.setImageDeleteListener(listener);
    }

    public final void startAudio() {
        synchronized (this.audioControl) {
            this.audioControl.startRecord(this.graphControl.getBaseAudioPath());
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void stopAudio() {
        synchronized (this.audioControl) {
            this.audioControl.stopRecord();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Bitmap thumbnail(int width, int height) {
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(this.graphControl.getBackgroundColor());
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        if (drawArea != null) {
            RectF rectF = new RectF();
            this.graphControl.getRootGraph().getMMatrix().mapRect(rectF, new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY()));
            canvas.clipRect(rectF);
        }
        this.graphControl.getRootGraph().onDrawComplete(canvas, new Function1<Graph, Boolean>() { // from class: com.zykj.sketch.core.record.RecordControl.thumbnail.2
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Graph it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.TRUE;
            }
        });
        Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
        return bitmap;
    }

    public final boolean translation(Float translateX, Float translateY, boolean keep) {
        return this.actionExecute.onTranslation(this.actionRecord.buildTranslation(System.currentTimeMillis(), translateX, translateY, keep));
    }

    public final boolean zoom(float scaleX, float scaleY, float centerX, float centerY, boolean keep) {
        return this.actionExecute.onZoom(this.actionRecord.buildZoomActionData(System.currentTimeMillis(), scaleX, scaleY, centerX, centerY, keep));
    }

    public static /* synthetic */ void addAdapterImage$default(RecordControl recordControl, String str, int i10, int i11, int i12, int i13, Function1 function1, String str2, Function1 function12, int i14, Object obj) {
        String strReplace$default;
        if ((i14 & 64) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            strReplace$default = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
        } else {
            strReplace$default = str2;
        }
        recordControl.addAdapterImage(str, i10, i11, i12, i13, (Function1<? super ImageGraph, Unit>) function1, strReplace$default, (Function1<? super String, Unit>) ((i14 & 128) != 0 ? new Function1<String, Unit>() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str3) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str3) {
                invoke2(str3);
                return Unit.INSTANCE;
            }
        } : function12));
    }

    public final void addAdapterImage(String path, int viewWidth, int viewHeight, int positionFlag, int mode, Function1<? super ImageGraph, Unit> callBack, String imageName, Function1<? super String, Unit> pathCallBack) {
        Function1<? super ImageGraph, Unit> callBack2 = callBack;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callBack2, "callBack");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(pathCallBack, "pathCallBack");
        Graph rootGraph = this.graphControl.getRootGraph();
        String name = ImageGraph.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "ImageGraph::class.java.name");
        if (rootGraph.childTypeNumber(name) >= this.sketchConfig.getMaxImageCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C7077R.string.tips_max_image, Integer.valueOf(this.sketchConfig.getMaxImageCount())));
            callBack2.invoke(null);
            pathCallBack.invoke(null);
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            FileUtils.Companion companion = FileUtils.INSTANCE;
            String strMd5HashCode = companion.Md5HashCode(file);
            File file2 = new File(this.graphControl.getBaseImagePath());
            if (file2.exists()) {
                for (File file3 : SequencesKt.filter(FilesKt.walk$default(file2, null, 1, null), new Function1<File, Boolean>() { // from class: com.zykj.sketch.core.record.RecordControl$addAdapterImage$4$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(File filterFile) {
                        Intrinsics.checkNotNullParameter(filterFile, "filterFile");
                        return Boolean.valueOf(filterFile.isFile());
                    }
                })) {
                    if (StringsKt.equals$default(FileUtils.INSTANCE.Md5HashCode(file3), strMd5HashCode, false, 2, null)) {
                        String absolutePath = file3.getAbsolutePath();
                        Intrinsics.checkNotNullExpressionValue(absolutePath, "imageFile.absolutePath");
                        addImage(absolutePath, viewWidth, viewHeight, positionFlag, mode, callBack2);
                        pathCallBack.invoke(file3.getAbsolutePath());
                        return;
                    }
                    callBack2 = callBack;
                }
                String str = file2.getAbsolutePath() + File.separator + imageName + ".jpg";
                FileUtils.INSTANCE.copyFileUsingFileChannels(file, new File(str));
                addImage(str, viewWidth, viewHeight, positionFlag, mode, callBack);
                pathCallBack.invoke(str);
                return;
            }
            String str2 = file2.getAbsolutePath() + File.separator + imageName + ".jpg";
            companion.copyFileUsingFileChannels(file, new File(str2));
            addImage(str2, viewWidth, viewHeight, positionFlag, mode, callBack);
            pathCallBack.invoke(str2);
            return;
        }
        callBack2.invoke(null);
    }
}
