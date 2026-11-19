package com.zykj.sketch.core.record;

// RE note 本类字节码直接引用的读写或显示接口包括文件流、位图。

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.v4.media.AbstractC0037f;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.autofill.HintConstants;
import androidx.camera.core.processing.concurrent.RunnableC0421c;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.C5180R;
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
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.p102io.AbstractC5818a;
import kotlin.p102io.FileWalkDirection;
import kotlin.text.AbstractC5862w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p214z6.AbstractC6833k;
import p214z6.C6827e;

@Metadata(m5109d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  \u00012\u00020\u0001:\u0002 \u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020\u000e2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020(¢\u0006\u0004\b,\u0010-Js\u00107\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\b\b\u0002\u00102\u001a\u00020&2\b\b\u0002\u0010\u001f\u001a\u00020&2\u0016\b\u0002\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u000e0\u00132\b\b\u0002\u00105\u001a\u00020\u00112\u0016\b\u0002\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b7\u00108Jm\u00107\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&2\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u000e0\u00132\b\b\u0002\u00105\u001a\u00020\u00112\u0016\b\u0002\u00106\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b7\u00109JI\u0010=\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u000e¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u000e¢\u0006\u0004\bA\u0010@J7\u0010I\u001a\u00020G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020B2\b\b\u0002\u0010H\u001a\u00020G¢\u0006\u0004\bI\u0010JJ)\u0010M\u001a\u00020G2\b\u0010K\u001a\u0004\u0018\u00010B2\b\u0010L\u001a\u0004\u0018\u00010B2\u0006\u0010H\u001a\u00020G¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u000e¢\u0006\u0004\bO\u0010@J\r\u0010P\u001a\u00020\u000e¢\u0006\u0004\bP\u0010@J\u0017\u0010R\u001a\u00020\u000e2\b\b\u0002\u0010Q\u001a\u00020G¢\u0006\u0004\bR\u0010SJD\u0010V\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&2%\b\u0002\u00104\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\bT\u0012\b\bU\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000e0\u0013¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u000e¢\u0006\u0004\bX\u0010@J\u001d\u0010Y\u001a\u00020.2\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&¢\u0006\u0004\bY\u0010ZJ\u000f\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\b\\\u0010]J\u0013\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00110^¢\u0006\u0004\b_\u0010`J\r\u0010a\u001a\u00020\u000e¢\u0006\u0004\ba\u0010@J\r\u0010b\u001a\u00020\u000e¢\u0006\u0004\bb\u0010@J\r\u0010c\u001a\u00020G¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010e¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010h¢\u0006\u0004\bi\u0010jJ\u0017\u0010l\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010k¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010n¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020G¢\u0006\u0004\bq\u0010dJ;\u0010v\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020&2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020t0s2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0004\bv\u0010wJ\u001d\u0010y\u001a\u00020\u000e2\f\u0010u\u001a\b\u0012\u0004\u0012\u00020x0sH\u0002¢\u0006\u0004\by\u0010zJM\u0010|\u001a\u00020\u000e2\u0006\u0010{\u001a\u00020\u00112\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u00102\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&2\u0014\u00104\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u000e0\u0013H\u0002¢\u0006\u0004\b|\u0010>J8\u0010\u007f\u001a\u00020B2\u0006\u0010}\u001a\u00020&2\u0006\u0010~\u001a\u00020&2\u0006\u00100\u001a\u00020&2\u0006\u00101\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020&H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J+\u0010\u0084\u0001\u001a\u00020\u000e2\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0081\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\"\u0010\u0086\u0001\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020&H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0088\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010\u0089\u0001R\"\u0010\u008c\u0001\u001a\r \u008b\u0001*\u0005\u0018\u00010\u008a\u00010\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001a\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001¨\u0006¡\u0001"}, m5110d2 = {"Lcom/zykj/sketch/core/record/RecordControl;", "", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/zykj/sketch/core/config/SketchConfig;", "sketchConfig", "Lcom/zykj/sketch/core/listener/RealDraw;", "realDraw", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "imitateDraw", "<init>", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/config/SketchConfig;Lcom/zykj/sketch/core/listener/RealDraw;Lcom/zykj/sketch/core/listener/ImitateDraw;)V", "Lcom/zykj/sketch/core/listener/ImageDeleteListener;", "listener", "Ld6/s;", "setImageDeleteListener", "(Lcom/zykj/sketch/core/listener/ImageDeleteListener;)V", "", "path", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/listener/ViewControl;", "viewBack", "Lcom/zykj/sketch/core/graph/Graph;", "finish", "loadData", "(Ljava/lang/String;Lr6/c;Lr6/c;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchAdapterEvent", "(Landroid/view/MotionEvent;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "mode", "setActionMode", "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;", "config", "setGraphConfig", "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig$GraphConfig;)V", "", TypedValues.Custom.S_COLOR, "Landroid/graphics/RectF;", "rectF", "setDrawConfig", "(Ljava/lang/Integer;Landroid/graphics/RectF;)V", "getDrawConfig", "()Landroid/graphics/RectF;", "Landroid/graphics/Bitmap;", "bitmap", "viewWidth", "viewHeight", "positionFlag", "Lcom/zykj/sketch/core/graph/ImageGraph;", "callBack", "imageName", "pathCallBack", "addAdapterImage", "(Landroid/graphics/Bitmap;IIIILr6/c;Ljava/lang/String;Lr6/c;)V", "(Ljava/lang/String;IIIILr6/c;Ljava/lang/String;Lr6/c;)V", "width", "height", "Lcom/zykj/sketch/core/listener/PPTControl;", "addAdapterPPT", "(Ljava/lang/String;IIIILr6/c;)V", "prevAction", "()V", "nextAction", "", "scaleX", "scaleY", "centerX", "centerY", "", "keep", "zoom", "(FFFFZ)Z", "translateX", "translateY", "translation", "(Ljava/lang/Float;Ljava/lang/Float;Z)Z", "resetMatrix", "clear", "isDelete", "reset", "(Z)V", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "getRecordPath", "(IILr6/c;)V", "onDestroy", "thumbnail", "(II)Landroid/graphics/Bitmap;", "Lcom/zykj/sketch/core/data/ThumbnailBean;", "limitThumbnail", "()Lcom/zykj/sketch/core/data/ThumbnailBean;", "", "getResList", "()Ljava/util/List;", "startAudio", "stopAudio", "isRecord", "()Z", "Lcom/zykj/sketch/core/listener/ProgressListener;", "addProgressListener", "(Lcom/zykj/sketch/core/listener/ProgressListener;)V", "Lcom/zykj/sketch/core/listener/NextPrevListener;", "addNextPrevListener", "(Lcom/zykj/sketch/core/listener/NextPrevListener;)V", "Lcom/zykj/sketch/core/listener/ActionChangeListener;", "addActionChangeListener", "(Lcom/zykj/sketch/core/listener/ActionChangeListener;)V", "Lcom/zykj/sketch/core/listener/GraphMatrixListener;", "setGraphMatrixListener", "(Lcom/zykj/sketch/core/listener/GraphMatrixListener;)V", "isTouch", "version", "", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "parseEventList", "executeActionContent", "(ILjava/util/List;Lr6/c;)V", "Lcom/zykj/sketch/core/data/GraphTask;", "executeTask", "(Ljava/util/List;)V", "filePath", "addImage", "bitmapWidth", "bitmapHeight", "countScale", "(IIIII)F", "Ljava/util/ArrayList;", "list", "graph", "getImagePath", "(Ljava/util/ArrayList;Lcom/zykj/sketch/core/graph/Graph;)V", "saveBitmap", "(II)V", "Landroid/view/ViewGroup;", "Lcom/zykj/sketch/core/config/SketchConfig;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lcom/zykj/sketch/core/GraphControl;", "graphControl", "Lcom/zykj/sketch/core/GraphControl;", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "actionFactory", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "Lcom/zykj/sketch/core/ActionRecord;", "actionRecord", "Lcom/zykj/sketch/core/ActionRecord;", "Lcom/zykj/sketch/core/record/AudioControl;", "audioControl", "Lcom/zykj/sketch/core/record/AudioControl;", "Lcom/zykj/sketch/core/ActionRecordExecute;", "actionExecute", "Lcom/zykj/sketch/core/ActionRecordExecute;", "Landroid/graphics/Matrix;", "cameraInvertMatrix", "Landroid/graphics/Matrix;", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RecordControl {

    @NotNull
    public static final String thumbnailFileName = "thumbnail.jpg";

    @NotNull
    private final ActionRecordExecute actionExecute;

    @NotNull
    private final ActionStrategyFactory actionFactory;

    @NotNull
    private final ActionRecord actionRecord;

    @NotNull
    private AudioControl audioControl;

    @NotNull
    private Matrix cameraInvertMatrix;
    private final Context context;

    @NotNull
    private final GraphControl graphControl;

    @NotNull
    private final SketchConfig sketchConfig;

    @NotNull
    private final ViewGroup viewGroup;

    public RecordControl(@NotNull ViewGroup viewGroup, @NotNull SketchConfig sketchConfig, @NotNull RealDraw realDraw, @NotNull ImitateDraw imitateDraw) {
        AbstractC5830k.m5330g(viewGroup, "viewGroup");
        AbstractC5830k.m5330g(sketchConfig, "sketchConfig");
        AbstractC5830k.m5330g(realDraw, "realDraw");
        AbstractC5830k.m5330g(imitateDraw, "imitateDraw");
        this.viewGroup = viewGroup;
        this.sketchConfig = sketchConfig;
        Context context = viewGroup.getContext();
        this.context = context;
        AbstractC5830k.m5329f(context, "context");
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

    public static /* synthetic */ void addAdapterImage$default(RecordControl recordControl, Bitmap bitmap, int i, int i8, int i9, int i10, InterfaceC6471c interfaceC6471c, String str, InterfaceC6471c interfaceC6471c2, int i11, Object obj) {
        String strM5407A;
        if ((i11 & 8) != 0) {
            i9 = 0;
        }
        int i12 = i9;
        int i13 = (i11 & 16) != 0 ? 24 : i10;
        InterfaceC6471c interfaceC6471c3 = (i11 & 32) != 0 ? new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.1
            public final void invoke(@Nullable ImageGraph imageGraph) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((ImageGraph) obj2);
                return C5443s.f8405a;
            }
        } : interfaceC6471c;
        if ((i11 & 64) != 0) {
            String string = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(string, "randomUUID().toString()");
            strM5407A = AbstractC5862w.m5407A(string, "-", "");
        } else {
            strM5407A = str;
        }
        recordControl.addAdapterImage(bitmap, i, i8, i12, i13, interfaceC6471c3, strM5407A, (i11 & 128) != 0 ? new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.2
            public final void invoke(@Nullable String str2) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return C5443s.f8405a;
            }
        } : interfaceC6471c2);
    }

    private final void addImage(String filePath, int viewWidth, int viewHeight, int positionFlag, int mode, InterfaceC6471c callBack) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(filePath, options);
        float fCountScale = countScale(options.outWidth, options.outHeight, viewWidth, viewHeight, mode);
        ActionRecordExecute actionRecordExecute = this.actionExecute;
        ActionRecord actionRecord = this.actionRecord;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = new File(filePath).getName();
        AbstractC5830k.m5329f(name, "File(filePath).name");
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
        float f = scale3 / scale;
        float f7 = scale2 / bitmapWidth;
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = f / bitmapHeight;
        float f9 = f8 <= 1.0f ? f8 : 1.0f;
        switch (mode) {
        }
        return Math.min(f7, f9);
    }
    // A touch may carry the entire saved graph. Restore the last such graph, then execute its tail.
    private final void executeActionContent(int version, List<EzyDrawBoard.ActionContent> parseEventList, final InterfaceC6471c viewBack) {
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
            executeTask(EventTaskParseFactory.INSTANCE.create(version).parse(parseEventList, this.actionExecute, new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.executeActionContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ViewControl) obj);
                    return C5443s.f8405a;
                }

                public final void invoke(@NotNull ViewControl viewControl) {
                    AbstractC5830k.m5330g(viewControl, "viewControl");
                    RecordControl.this.actionExecute.addViewControl(viewControl);
                    viewBack.invoke(viewControl);
                }
            }).getGraphTask());
            return;
        }
        int i = size + 1;
        this.actionRecord.addHistoryRecord(parseEventList.subList(0, i));
        EventListener.DefaultImpls.graphSnapShot$default(this.actionExecute, parseEventList.get(size), false, 2, null);
        this.actionRecord.addHistoryRenderGraphSnapshot(parseEventList.get(size));
        if (size != parseEventList.size() - 1) {
            executeTask(ITaskParse.DefaultImpls.parse$default(EventTaskParseFactory.INSTANCE.create(version), parseEventList.subList(i, parseEventList.size()), this.actionExecute, null, 4, null).getGraphTask());
        }
    }

    public static /* synthetic */ void executeActionContent$default(RecordControl recordControl, int i, List list, InterfaceC6471c interfaceC6471c, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.executeActionContent.1
                public final void invoke(@NotNull ViewControl it) {
                    AbstractC5830k.m5330g(it, "it");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ViewControl) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        recordControl.executeActionContent(i, list, interfaceC6471c);
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

    public static /* synthetic */ void getRecordPath$default(RecordControl recordControl, int i, int i8, InterfaceC6471c interfaceC6471c, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.getRecordPath.1
                public final void invoke(@Nullable String str) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((String) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        recordControl.getRecordPath(i, i8, interfaceC6471c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRecordPath$lambda-13, reason: not valid java name */
    public static final void m13876getRecordPath$lambda13(int i, int i8, RecordControl this$0, InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callBack, "$callBack");
        if (i <= 0 || i8 <= 0) {
            callBack.invoke(null);
            return;
        }
        this$0.saveBitmap(i, i8);
        this$0.actionRecord.saveRecord(this$0.sketchConfig.getSourcePath(), i, i8);
        callBack.invoke(this$0.sketchConfig.getSourcePath());
    }

    public static /* synthetic */ void loadData$default(RecordControl recordControl, String str, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i, Object obj) throws HighVersionException, EmptyDataException, LowVersionException, IOException {
        if ((i & 2) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.loadData.1
                public final void invoke(@NotNull ViewControl it) {
                    AbstractC5830k.m5330g(it, "it");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ViewControl) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        recordControl.loadData(str, interfaceC6471c, interfaceC6471c2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-1$lambda-0, reason: not valid java name */
    public static final void m13877loadData$lambda1$lambda0(EzyDrawBoard.BoardHead it, String path, EzyDrawBoard.DrawBoard drawBoard, RecordControl this$0, InterfaceC6471c viewBack, InterfaceC6471c finish) {
        AbstractC5830k.m5330g(it, "$it");
        AbstractC5830k.m5330g(path, "$path");
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(viewBack, "$viewBack");
        AbstractC5830k.m5330g(finish, "$finish");
        VersionParseFactory.Companion companion = VersionParseFactory.INSTANCE;
        int version = it.getVersion();
        EzyDrawBoard.BoardBody boardBody = drawBoard.getBoardBody();
        AbstractC5830k.m5329f(boardBody, "data.boardBody");
        this$0.executeActionContent(it.getVersion(), companion.parse(version, path, boardBody), viewBack);
        this$0.graphControl.render();
        this$0.graphControl.setMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING);
        this$0.graphControl.resetGraph();
        this$0.graphControl.resetStatus();
        this$0.actionFactory.reset();
        finish.invoke(this$0.graphControl.getRootGraph());
    }

    public static /* synthetic */ void reset$default(RecordControl recordControl, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = false;
        }
        recordControl.reset(z8);
    }

    private final void saveBitmap(int width, int height) {
        Bitmap bitmapThumbnail = thumbnail(width, height);
        FileUtils.INSTANCE.saveBitmap2SDCard(bitmapThumbnail, this.graphControl.getBasePath() + thumbnailFileName);
        bitmapThumbnail.recycle();
    }

    public static /* synthetic */ boolean zoom$default(RecordControl recordControl, float f, float f7, float f8, float f9, boolean z8, int i, Object obj) {
        if ((i & 16) != 0) {
            z8 = true;
        }
        return recordControl.zoom(f, f7, f8, f9, z8);
    }

    public final void addActionChangeListener(@Nullable ActionChangeListener listener) {
        this.actionRecord.addActionChangeListener(listener);
    }

    public final void addAdapterImage(@NotNull Bitmap bitmap, int viewWidth, int viewHeight, int positionFlag, int mode, @NotNull InterfaceC6471c callBack, @NotNull String imageName, @NotNull InterfaceC6471c pathCallBack) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        AbstractC5830k.m5330g(callBack, "callBack");
        AbstractC5830k.m5330g(imageName, "imageName");
        AbstractC5830k.m5330g(pathCallBack, "pathCallBack");
        if (this.graphControl.getRootGraph().childTypeNumber(ImageGraph.class.getName()) >= this.sketchConfig.getMaxImageCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C5180R.string.tips_max_image, Integer.valueOf(this.sketchConfig.getMaxImageCount())));
            callBack.invoke(null);
            return;
        }
        String str = this.graphControl.getBaseImagePath() + imageName + ".jpg";
        FileUtils.Companion companion = FileUtils.INSTANCE;
        String absolutePath = new File(str).getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "File(imagePath).absolutePath");
        pathCallBack.invoke(companion.saveBitmap2SDCard(bitmap, absolutePath));
        addImage(str, viewWidth, viewHeight, positionFlag, mode, callBack);
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    // Copies the source folder contents into res/ and records the entry name, time
    // and dimensions. The playback graph looks for the same entry under res/ppt/.
    public final void addAdapterPPT(@NotNull String path, int width, int height, int viewWidth, int viewHeight, @NotNull InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(callBack, "callBack");
        if (this.graphControl.getRootGraph().childTypeNumber(WebViewGraph.class.getName()) >= this.sketchConfig.getMaxPPTCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C5180R.string.tips_max_ppt, Integer.valueOf(this.sketchConfig.getMaxPPTCount())));
            return;
        }
        File file = new File(path);
        if (!file.exists()) {
            Context context2 = this.context;
            ToastUtils.showShort(context2, context2.getString(C5180R.string.tips_file_not_found));
            return;
        }
        FileUtils.Companion companion = FileUtils.INSTANCE;
        String absolutePath = file.getParentFile().getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath, "file.parentFile.absolutePath");
        String absolutePath2 = new File(this.graphControl.getBasePPTPath()).getParentFile().getAbsolutePath();
        AbstractC5830k.m5329f(absolutePath2, "File(graphControl.getBas…).parentFile.absolutePath");
        companion.copyFolder(absolutePath, absolutePath2);
        ActionRecordExecute actionRecordExecute = this.actionExecute;
        ActionRecord actionRecord = this.actionRecord;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = file.getName();
        AbstractC5830k.m5329f(name, "file.name");
        actionRecordExecute.onAddPPTEvent(actionRecord.buildWebViewData(jCurrentTimeMillis, name, width, height, viewWidth, viewHeight), callBack);
    }

    public final void addNextPrevListener(@Nullable NextPrevListener listener) {
        this.actionRecord.addNextPrevListener(listener);
    }

    public final void addProgressListener(@Nullable ProgressListener listener) {
        this.audioControl.addListener(listener);
    }

    public final void clear() {
        this.actionExecute.onClearBoardEvent(this.actionRecord.buildClearBoardData(System.currentTimeMillis()));
    }

    @NotNull
    public final RectF getDrawConfig() {
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        return drawArea != null ? new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY()) : new RectF();
    }

    public final void getRecordPath(final int width, final int height, @NotNull final InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(callBack, "callBack");
        new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.a
            @Override // java.lang.Runnable
            public final void run() {
                RecordControl.m13876getRecordPath$lambda13(width, height, this, callBack);
            }
        }).start();
    }

    @NotNull
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

    @Nullable
    public final ThumbnailBean limitThumbnail() {
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        if (drawArea != null) {
            ActionRecordExecute actionRecordExecute = this.actionExecute;
            List<Float> matrixList = drawArea.getMatrixList();
            AbstractC5830k.m5329f(matrixList, "this.matrixList");
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
                    graphBuildGraph.onDrawComplete(new Canvas(bitmap), new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl$limitThumbnail$1$1$1
                        @Override // p152r6.InterfaceC6471c
                        @NotNull
                        public final Boolean invoke(@NotNull Graph graph) {
                            AbstractC5830k.m5330g(graph, "graph");
                            return Boolean.valueOf(graph instanceof WritingGroupGraph);
                        }
                    });
                    matrixBuildMatrix.mapRect(rectF2, rectF);
                    RectF rectFMaxWritingRenderOutRectF = GraphExtKt.maxWritingRenderOutRectF(graphBuildGraph);
                    this.graphControl.setCameraMatrix(cameraMatrix);
                    AbstractC5830k.m5329f(bitmap, "bitmap");
                    return new ThumbnailBean(bitmap, rectFMaxWritingRenderOutRectF, rectF2);
                }
            }
        }
        return null;
    }

    public final void loadData(@NotNull String path, @NotNull InterfaceC6471c viewBack, @NotNull InterfaceC6471c finish) throws HighVersionException, EmptyDataException, LowVersionException, IOException {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(viewBack, "viewBack");
        AbstractC5830k.m5330g(finish, "finish");
        EzyDrawBoard.DrawBoard from = EzyDrawBoard.DrawBoard.parseFrom(new FileInputStream(new File(path, "actions.bin")));
        if (!from.hasBoardHead()) {
            finish.invoke(this.graphControl.getRootGraph());
            throw new EmptyDataException(path);
        }
        EzyDrawBoard.BoardHead boardHead = from.getBoardHead();
        if (boardHead != null) {
            if (boardHead.getCreateDate() < 1546272000 || boardHead.getVersion() < 2) { // Load the JPEG as one image, then return before replaying any stored actions.
                File file = new File(AbstractC0037f.m91p(AbstractC0037f.m97v(path), File.separator, thumbnailFileName));
                if (!file.exists()) {
                    finish.invoke(this.graphControl.getRootGraph());
                    throw new EmptyDataException(path);
                }
                Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath());
                AbstractC5830k.m5329f(bitmap, "bitmap");
                addAdapterImage$default(this, bitmap, this.viewGroup.getWidth(), this.viewGroup.getHeight(), 0, 23, (InterfaceC6471c) null, (String) null, (InterfaceC6471c) null, 224, (Object) null);
                this.graphControl.forceRender();
                finish.invoke(this.graphControl.getRootGraph());
                return;
            }
            if (boardHead.getVersion() > 5) {
                finish.invoke(this.graphControl.getRootGraph());
                throw new HighVersionException("version=" + boardHead.getVersion() + " Maximum resolution version=5");
            }
            this.sketchConfig.setSourcePath(path);
            this.actionRecord.setHeader(boardHead);
            this.graphControl.setCameraMatrix(this.viewGroup.getWidth(), this.viewGroup.getHeight(), boardHead.getWidth(), boardHead.getHeight());
            this.graphControl.getCameraMatrix().invert(this.cameraInvertMatrix);
            new Thread(new RunnableC0421c(boardHead, path, from, this, viewBack, finish, 1)).start();
        }
    }

    public final void nextAction() {
        this.actionExecute.onNextActionEvent(this.actionRecord.buildNextActionData(System.currentTimeMillis()));
    }

    public final void onDestroy() {
        this.graphControl.onDestroy();
    }

    public final void onTouchAdapterEvent(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
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
            C6827e c6827e = new C6827e(AbstractC6833k.m6494u(AbstractC5818a.m5316z(new File(this.sketchConfig.getSourcePath()), FileWalkDirection.TOP_DOWN), new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.reset.1
                @Override // p152r6.InterfaceC6471c
                @NotNull
                public final Boolean invoke(@NotNull File it) {
                    AbstractC5830k.m5330g(it, "it");
                    return Boolean.valueOf(it.isFile());
                }
            }));
            while (c6827e.hasNext()) {
                ((File) c6827e.next()).delete();
            }
        }
    }

    public final void resetMatrix() {
        this.actionExecute.resetMatrix(this.actionRecord.buildResetMatrix(System.currentTimeMillis()));
    }

    public final void setActionMode(@NotNull EzyDrawBoard.ActionModeConfig.Mode mode) {
        AbstractC5830k.m5330g(mode, "mode");
        this.actionExecute.onActionModeEvent(this.actionRecord.buildModeConfig(System.currentTimeMillis(), mode));
    }

    public final void setDrawConfig(@Nullable Integer color, @Nullable RectF rectF) {
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
            for (int i = 0; i < 9; i++) {
                arrayList.add(Float.valueOf(fArr[i]));
            }
            this.actionExecute.onDrawConfigEvent(this.actionRecord.buildDrawConfig(System.currentTimeMillis(), color, EzyDrawBoard.DrawArea.newBuilder().setLeftTopPoint(pointFBuild).setRightBottomPoint(pointFBuild2).addAllMatrix(arrayList).build()));
        }
    }

    public final void setGraphConfig(@NotNull EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        AbstractC5830k.m5330g(config, "config");
        this.actionExecute.onGraphConfigEvent(this.actionRecord.buildGraphConfig(System.currentTimeMillis(), config));
    }

    public final void setGraphMatrixListener(@Nullable GraphMatrixListener listener) {
        this.graphControl.setGraphMatrixListener(listener);
    }

    public final void setImageDeleteListener(@Nullable ImageDeleteListener listener) {
        this.graphControl.setImageDeleteListener(listener);
    }

    public final void startAudio() {
        synchronized (this.audioControl) {
            this.audioControl.startRecord(this.graphControl.getBaseAudioPath());
        }
    }

    public final void stopAudio() {
        synchronized (this.audioControl) {
            this.audioControl.stopRecord();
        }
    }
    // Fill the whole bitmap first. The transformed draw area clips the graph drawn above it.
    @NotNull
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
        this.graphControl.getRootGraph().onDrawComplete(canvas, new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.thumbnail.2
            @Override // p152r6.InterfaceC6471c
            @NotNull
            public final Boolean invoke(@NotNull Graph it) {
                AbstractC5830k.m5330g(it, "it");
                return Boolean.TRUE;
            }
        });
        AbstractC5830k.m5329f(bitmap, "bitmap");
        return bitmap;
    }

    public final boolean translation(@Nullable Float translateX, @Nullable Float translateY, boolean keep) {
        return this.actionExecute.onTranslation(this.actionRecord.buildTranslation(System.currentTimeMillis(), translateX, translateY, keep));
    }

    public final boolean zoom(float scaleX, float scaleY, float centerX, float centerY, boolean keep) {
        return this.actionExecute.onZoom(this.actionRecord.buildZoomActionData(System.currentTimeMillis(), scaleX, scaleY, centerX, centerY, keep));
    }

    public static /* synthetic */ void addAdapterImage$default(RecordControl recordControl, String str, int i, int i8, int i9, int i10, InterfaceC6471c interfaceC6471c, String str2, InterfaceC6471c interfaceC6471c2, int i11, Object obj) {
        String strM5407A;
        if ((i11 & 64) != 0) {
            String string = UUID.randomUUID().toString();
            AbstractC5830k.m5329f(string, "randomUUID().toString()");
            strM5407A = AbstractC5862w.m5407A(string, "-", "");
        } else {
            strM5407A = str2;
        }
        recordControl.addAdapterImage(str, i, i8, i9, i10, interfaceC6471c, strM5407A, (i11 & 128) != 0 ? new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.3
            public final void invoke(@Nullable String str3) {
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return C5443s.f8405a;
            }
        } : interfaceC6471c2);
    }

    public final void addAdapterImage(@NotNull String path, int viewWidth, int viewHeight, int positionFlag, int mode, @NotNull InterfaceC6471c callBack, @NotNull String imageName, @NotNull InterfaceC6471c pathCallBack) {
        InterfaceC6471c callBack2 = callBack;
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(callBack2, "callBack");
        AbstractC5830k.m5330g(imageName, "imageName");
        AbstractC5830k.m5330g(pathCallBack, "pathCallBack");
        if (this.graphControl.getRootGraph().childTypeNumber(ImageGraph.class.getName()) >= this.sketchConfig.getMaxImageCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C5180R.string.tips_max_image, Integer.valueOf(this.sketchConfig.getMaxImageCount())));
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
                C6827e c6827e = new C6827e(AbstractC6833k.m6494u(AbstractC5818a.m5316z(file2, FileWalkDirection.TOP_DOWN), new InterfaceC6471c() { // from class: com.zykj.sketch.core.record.RecordControl$addAdapterImage$4$1$1
                    @Override // p152r6.InterfaceC6471c
                    @NotNull
                    public final Boolean invoke(@NotNull File filterFile) {
                        AbstractC5830k.m5330g(filterFile, "filterFile");
                        return Boolean.valueOf(filterFile.isFile());
                    }
                }));
                while (c6827e.hasNext()) {
                    File file3 = (File) c6827e.next();
                    if (AbstractC5862w.m5415v(FileUtils.INSTANCE.Md5HashCode(file3), strMd5HashCode, false)) {
                        String absolutePath = file3.getAbsolutePath();
                        AbstractC5830k.m5329f(absolutePath, "imageFile.absolutePath");
                        addImage(absolutePath, viewWidth, viewHeight, positionFlag, mode, callBack2);
                        pathCallBack.invoke(file3.getAbsolutePath());
                        return;
                    }
                    callBack2 = callBack;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(file2.getAbsolutePath());
                String strM92q = AbstractC0037f.m92q(sb, File.separator, imageName, ".jpg");
                FileUtils.INSTANCE.copyFileUsingFileChannels(file, new File(strM92q));
                addImage(strM92q, viewWidth, viewHeight, positionFlag, mode, callBack);
                pathCallBack.invoke(strM92q);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file2.getAbsolutePath());
            String strM92q2 = AbstractC0037f.m92q(sb2, File.separator, imageName, ".jpg");
            companion.copyFileUsingFileChannels(file, new File(strM92q2));
            addImage(strM92q2, viewWidth, viewHeight, positionFlag, mode, callBack);
            pathCallBack.invoke(strM92q2);
            return;
        }
        callBack2.invoke(null);
    }
}
