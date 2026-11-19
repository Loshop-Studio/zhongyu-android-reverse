package com.zykj.blackboard.core.canvas.control;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectDrawControl;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionBackgroundRectF;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.view.ActiveLayer;
import com.zykj.blackboard.core.canvas.view.ActiveView;
import com.zykj.blackboard.core.canvas.view.BackgroundLayer;
import com.zykj.blackboard.core.canvas.view.FixLayer;
import com.zykj.blackboard.core.canvas.view.MaskLayer;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import com.zykj.blackboard.core.graph.IDraw;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.utils.BitmapUtil;
import com.zykj.blackboard.utils.CanvasUtils;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.RectExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0002¢\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0012J7\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0012J\u0015\u0010)\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010%J\u0015\u0010*\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u0012J1\u0010,\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020+2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020+2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b.\u0010/J)\u00100\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b0\u0010'J\u001b\u00101\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020\b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0004\b3\u00102J#\u00107\u001a\u00020\b2\u0006\u00105\u001a\u0002042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f06¢\u0006\u0004\b7\u00108J)\u00109\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u0004\u0018\u00010;2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0004\u0018\u00010;2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b>\u0010=Ja\u0010I\u001a\u0004\u0018\u00010;2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?2\u0006\u0010A\u001a\u00020?2\u0006\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020?2\b\b\u0002\u0010E\u001a\u00020D2\b\b\u0002\u0010F\u001a\u00020D2\b\b\u0002\u0010G\u001a\u00020D2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020\b2\u0006\u0010K\u001a\u00020?¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020?¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020P¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\bV\u0010%J\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\u001aJ\r\u0010X\u001a\u00020\b¢\u0006\u0004\bX\u0010\u001aJ\r\u0010Y\u001a\u00020D¢\u0006\u0004\bY\u0010ZJ-\u0010`\u001a\u00020\b2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020[2\u0006\u0010^\u001a\u00020[2\u0006\u0010_\u001a\u00020[¢\u0006\u0004\b`\u0010aJO\u0010l\u001a\u00020\b2\u0006\u0010b\u001a\u0002042\u0006\u0010#\u001a\u00020\"2\u0006\u0010c\u001a\u0002042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u001d2\n\b\u0002\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bl\u0010mJ]\u0010o\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u000f2\u0006\u0010b\u001a\u0002042\u0006\u0010#\u001a\u00020\"2\u0006\u0010c\u001a\u0002042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u001d2\b\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bo\u0010pJU\u0010q\u001a\u00020\b2\u0006\u0010n\u001a\u00020\u000f2\u0006\u0010b\u001a\u0002042\u0006\u0010#\u001a\u00020\"2\u0006\u0010c\u001a\u0002042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u001d2\b\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bq\u0010rJU\u0010s\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010b\u001a\u0002042\u0006\u0010#\u001a\u00020\"2\u0006\u0010c\u001a\u0002042\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u001d2\b\u0010k\u001a\u0004\u0018\u00010j¢\u0006\u0004\bs\u0010rJ'\u0010w\u001a\u00020\b2\u0006\u0010t\u001a\u00020;2\u0006\u0010u\u001a\u00020[2\u0006\u0010v\u001a\u00020[H\u0002¢\u0006\u0004\bw\u0010xJ\u001f\u0010y\u001a\u00020\b2\u0006\u0010t\u001a\u00020;2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b{\u0010\u0012J!\u0010~\u001a\u00020\b2\u0006\u0010}\u001a\u00020|2\b\b\u0002\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0080\u0001\u0010\u001aJ\u001d\u0010\u0081\u0001\u001a\u00020\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0005\b\u0081\u0001\u0010%J\u0011\u0010\u0082\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0082\u0001\u0010\u001aJ\u001a\u0010\u0083\u0001\u001a\u00020\b2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u001aJ\u0011\u0010\u0086\u0001\u001a\u00020\bH\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u001aR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010\u0087\u0001R\u001c\u0010\u0088\u0001\u001a\u0002048\u0006¢\u0006\u0010\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0007\u0010\u008c\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008f\u0001R\u001b\u0010\u0093\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0091\u0001R\u001b\u0010\u0094\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008f\u0001R\u0019\u0010\u0095\u0001\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0089\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008f\u0001R\u001b\u0010\u009a\u0001\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0091\u0001R\u0017\u0010\u009b\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0089\u0001R\u0017\u0010\u009c\u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010\u009e\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0089\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009d\u0001R\u0017\u0010 \u0001\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010¦\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001¨\u0006¨\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/core/canvas/control/DrawControl;", "", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "<init>", "(Lcom/zykj/blackboard/bean/BoardConfig;)V", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "renderLayer", "Ld6/s;", "setRenderLayer", "(Lcom/zykj/blackboard/core/canvas/view/RenderLayer;)V", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "setMatrixAdapter", "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)V", "Lcom/zykj/blackboard/core/graph/IGraph;", "graph", "add", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "select", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "selectCancel", "()V", "rootGraph", RequestParameters.SUBRESOURCE_DELETE, "", "graphList", "selectRectPath", "transGraphStart", "(Lcom/zykj/blackboard/core/graph/IGraph;Ljava/util/List;Landroid/graphics/Path;Landroid/graphics/Paint;)V", "Landroid/graphics/Matrix;", "matrix", "transGraph", "(Landroid/graphics/Matrix;)V", "transGraphEnd", "(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V", "cameraChangeStart", "cameraChanging", "cameraChangeEnd", "Lcom/zykj/blackboard/core/graph/group/TextGraph;", "textHandleStart", "(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V", "textHandle", "(Lcom/zykj/blackboard/core/graph/group/TextGraph;Landroid/graphics/Path;Landroid/graphics/Paint;)V", "textHandleEnd", "drawGraphInFix", "(Ljava/util/List;)V", "drawGraphInActive", "Landroid/graphics/RectF;", "rectF", "", "renderRectFInFix", "(Landroid/graphics/RectF;Ljava/util/List;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;Landroid/graphics/Matrix;)V", "Landroid/graphics/Bitmap;", "screenshot", "(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;", "contentThumbnail", "", "horizontalOffset", "verticalOffset", "minWidth", "minHeight", "", "isWidthAsBoard", "isContainLimit", "isBoardAsTop", "interruptGraph", "getMinScreenShot", "(Lcom/zykj/blackboard/core/graph/IGraph;IIIIZZZLcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/Bitmap;", TypedValues.Custom.S_COLOR, "setBackgroundColor", "(I)V", "getBackgroundColor", "()I", "Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "backgroundLineConfig", "setBackgroundLineConfig", "(Lcom/zykj/blackboard/bean/BackgroundLineConfig;)V", "getBackgroundLineConfig", "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;", "updateBackgroundMatrix", "reset", "release", "refresh", "()Z", "", "l", "t", "r", "b", "newSelecting", "(FFFF)V", "selectRectF", "selectFunctionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;", "functionRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;", "functionBackgroundRectF", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectFunctionType;", "typeList", "Landroid/graphics/PointF;", "pointF", "newSelect", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "textGraph", "newTextHandleStart", "(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "newTextHandling", "(Lcom/zykj/blackboard/core/graph/IGraph;Landroid/graphics/RectF;Landroid/graphics/Matrix;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionRectF;Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionBackgroundRectF;Ljava/util/List;Landroid/graphics/PointF;)V", "newTextHandleEnd", "bitmap", "offsetX", "offsetY", "drawCameraRegion", "(Landroid/graphics/Bitmap;FF)V", "drawCameraBitmap", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V", "initCameraBitmap", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "drawFixLayer", "drawActiveLayer", "drawMaskLayer", "initActiveLayer", "(Landroid/graphics/RectF;)V", "checkActiveLayer", "clearActiveBitmapAndCanvas", "Lcom/zykj/blackboard/bean/BoardConfig;", "oldPageRectF", "Landroid/graphics/RectF;", "getOldPageRectF", "()Landroid/graphics/RectF;", "Lcom/zykj/blackboard/core/canvas/view/RenderLayer;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "fixLayerBitmap", "Landroid/graphics/Bitmap;", "fixLayerCanvas", "Landroid/graphics/Canvas;", "activeLayerBitmap", "activeLayerCanvas", "snapshotBitmap", "drawLimitRectF", "Landroid/graphics/Rect;", "renderLayerRect", "Landroid/graphics/Rect;", "cameraBitmap", "cameraCanvas", "cameraRenderRectF", "translateMatrix", "Landroid/graphics/Matrix;", "tempRenderLimitRectF", "tempMatrix", "boardPaint", "Landroid/graphics/Paint;", "com/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1", "renderChangeListener", "Lcom/zykj/blackboard/core/canvas/control/DrawControl$renderChangeListener$1;", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;", "newSelectDrawControl", "Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectDrawControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DrawControl {

    @Nullable
    private Bitmap activeLayerBitmap;

    @Nullable
    private Canvas activeLayerCanvas;

    @NotNull
    private final BoardConfig boardConfig;

    @NotNull
    private final Paint boardPaint;

    @Nullable
    private Bitmap cameraBitmap;

    @Nullable
    private Canvas cameraCanvas;

    @NotNull
    private final RectF cameraRenderRectF;

    @NotNull
    private RectF drawLimitRectF;

    @Nullable
    private Bitmap fixLayerBitmap;

    @Nullable
    private Canvas fixLayerCanvas;

    @Nullable
    private MatrixAdapter matrixAdapter;

    @NotNull
    private final NewSelectDrawControl newSelectDrawControl;

    @NotNull
    private final RectF oldPageRectF;

    @NotNull
    private final DrawControl$renderChangeListener$1 renderChangeListener;

    @Nullable
    private RenderLayer renderLayer;

    @NotNull
    private final Rect renderLayerRect;

    @Nullable
    private Bitmap snapshotBitmap;

    @NotNull
    private final Matrix tempMatrix;

    @NotNull
    private final RectF tempRenderLimitRectF;

    @NotNull
    private final Matrix translateMatrix;

    /* JADX WARN: Type inference failed for: r0v9, types: [com.zykj.blackboard.core.canvas.control.DrawControl$renderChangeListener$1] */
    public DrawControl(@NotNull BoardConfig boardConfig) {
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        this.boardConfig = boardConfig;
        this.oldPageRectF = new RectF();
        this.drawLimitRectF = new RectF();
        this.renderLayerRect = new Rect();
        this.cameraRenderRectF = new RectF();
        this.translateMatrix = new Matrix();
        this.tempRenderLimitRectF = new RectF();
        this.tempMatrix = new Matrix();
        Paint paint = new Paint();
        paint.setColor(-16776961);
        paint.setStrokeWidth(5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.boardPaint = paint;
        this.renderChangeListener = new RenderChangeListener() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$renderChangeListener$1
            @Override // com.zykj.blackboard.core.edit.RenderChangeListener
            public void onCameraChange(@NotNull Matrix matrix) {
                AbstractC5830k.m5330g(matrix, "matrix");
                this.this$0.drawMaskLayer();
            }

            @Override // com.zykj.blackboard.core.edit.RenderChangeListener
            public void onRenderChange(@NotNull RectF renderRectF, @NotNull RectF visibleRectF) {
                AbstractC5830k.m5330g(renderRectF, "renderRectF");
                AbstractC5830k.m5330g(visibleRectF, "visibleRectF");
            }
        };
        this.newSelectDrawControl = new NewSelectDrawControl(boardConfig);
    }

    private final void checkActiveLayer() {
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap != null) {
            AbstractC5830k.m5327d(bitmap);
            if (!bitmap.isRecycled()) {
                Bitmap bitmap2 = this.activeLayerBitmap;
                AbstractC5830k.m5327d(bitmap2);
                if (bitmap2.getWidth() == this.renderLayerRect.width()) {
                    Bitmap bitmap3 = this.activeLayerBitmap;
                    AbstractC5830k.m5327d(bitmap3);
                    if (bitmap3.getHeight() == this.renderLayerRect.height()) {
                        return;
                    }
                }
            }
        }
        initActiveLayer(new RectF(this.renderLayerRect));
    }

    private final void clearActiveBitmapAndCanvas() {
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.activeLayerBitmap = null;
        this.activeLayerCanvas = null;
    }

    private final void drawActiveLayer(Matrix matrix) {
        RenderLayer renderLayer;
        ActiveLayer activeLayer;
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap == null || (renderLayer = this.renderLayer) == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.draw(bitmap, matrix);
    }

    public static /* synthetic */ void drawActiveLayer$default(DrawControl drawControl, Matrix matrix, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = null;
        }
        drawControl.drawActiveLayer(matrix);
    }

    private final void drawBackground(Canvas canvas, Matrix matrix) {
        BackgroundLayer backgroundLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (backgroundLayer = renderLayer.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.drawBackground(canvas, matrix);
    }

    public static /* synthetic */ void drawBackground$default(DrawControl drawControl, Canvas canvas, Matrix matrix, int i, Object obj) {
        if ((i & 2) != 0) {
            matrix = new Matrix();
        }
        drawControl.drawBackground(canvas, matrix);
    }

    private final void drawCameraBitmap(Bitmap bitmap, Matrix matrix) {
        RenderLayer renderLayer = this.renderLayer;
        ActiveLayer activeLayer = renderLayer != null ? renderLayer.getActiveLayer() : null;
        if (activeLayer instanceof ActiveView) {
            ((ActiveView) activeLayer).drawReference(bitmap, matrix);
        } else if (activeLayer != null) {
            activeLayer.draw(bitmap, matrix);
        }
    }

    private final void drawCameraRegion(Bitmap bitmap, float offsetX, float offsetY) {
        ActiveLayer activeLayer;
        int i = (int) offsetX;
        int i8 = -i;
        int i9 = (int) offsetY;
        int i10 = -i9;
        int iMin = Math.min(bitmap.getWidth() + i, this.renderLayerRect.width());
        int iMin2 = Math.min(bitmap.getHeight() + i9, this.renderLayerRect.height());
        if (i8 < 0 || i10 < 0 || i8 > bitmap.getWidth() || i10 > bitmap.getHeight() || iMin <= 0 || iMin2 <= 0) {
            RenderLayer renderLayer = this.renderLayer;
            if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
                return;
            }
            activeLayer.clear();
            return;
        }
        Rect rect = new Rect(i8, i10, i8 + iMin, i10 + iMin2);
        RenderLayer renderLayer2 = this.renderLayer;
        ActiveLayer activeLayer2 = renderLayer2 != null ? renderLayer2.getActiveLayer() : null;
        if (activeLayer2 instanceof ActiveView) {
            ((ActiveView) activeLayer2).drawRegion(bitmap, rect);
        } else if (activeLayer2 != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, iMin, iMin2);
            AbstractC5830k.m5329f(bitmapCreateBitmap, "createBitmap(bitmap, sou…eRect.top, width, height)");
            activeLayer2.draw(bitmapCreateBitmap, null);
        }
    }

    private final void drawFixLayer() {
        RenderLayer renderLayer;
        FixLayer fixLayer;
        Bitmap bitmap = this.fixLayerBitmap;
        if (bitmap == null || (renderLayer = this.renderLayer) == null || (fixLayer = renderLayer.getFixLayer()) == null) {
            return;
        }
        fixLayer.draw(bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawMaskLayer() {
        MaskLayer maskLayer;
        MaskLayer maskLayer2;
        MaskLayer maskLayer3;
        float fIntValue;
        float fIntValue2;
        Rect renderRect;
        Rect renderRect2;
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            if (this.oldPageRectF.isEmpty()) {
                RenderLayer renderLayer = this.renderLayer;
                Integer numValueOf = null;
                Integer numValueOf2 = (renderLayer == null || (renderRect2 = renderLayer.getRenderRect()) == null) ? null : Integer.valueOf(renderRect2.width());
                AbstractC5830k.m5327d(numValueOf2);
                fIntValue = numValueOf2.intValue();
                RenderLayer renderLayer2 = this.renderLayer;
                if (renderLayer2 != null && (renderRect = renderLayer2.getRenderRect()) != null) {
                    numValueOf = Integer.valueOf(renderRect.height());
                }
                AbstractC5830k.m5327d(numValueOf);
                fIntValue2 = numValueOf.intValue();
            } else {
                fIntValue = this.oldPageRectF.width();
                fIntValue2 = this.oldPageRectF.height();
            }
            this.drawLimitRectF.set(0.0f, 0.0f, fIntValue * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), fIntValue2 * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
        } else {
            this.drawLimitRectF.setEmpty();
        }
        if (this.drawLimitRectF.isEmpty()) {
            RenderLayer renderLayer3 = this.renderLayer;
            if (renderLayer3 == null || (maskLayer3 = renderLayer3.getMaskLayer()) == null) {
                return;
            }
            maskLayer3.hide();
            return;
        }
        this.tempRenderLimitRectF.set(this.drawLimitRectF);
        Matrix matrix = this.tempMatrix;
        matrix.reset();
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        if (matrixAdapter != null) {
            if (this.oldPageRectF.isEmpty()) {
                matrix.postConcat(MatrixExtKt.invert(matrixAdapter.getScreenMatrix()));
                matrix.postConcat(matrixAdapter.getAdapterMatrix());
            } else {
                matrix.postConcat(matrixAdapter.getAdapterMatrix());
            }
        }
        this.tempMatrix.mapRect(this.tempRenderLimitRectF);
        if (!this.tempRenderLimitRectF.intersect(RectExtKt.toRectF(this.renderLayerRect))) {
            RenderLayer renderLayer4 = this.renderLayer;
            if (renderLayer4 == null || (maskLayer2 = renderLayer4.getMaskLayer()) == null) {
                return;
            }
            maskLayer2.hide();
            return;
        }
        RenderLayer renderLayer5 = this.renderLayer;
        if (renderLayer5 == null || (maskLayer = renderLayer5.getMaskLayer()) == null) {
            return;
        }
        maskLayer.show();
        maskLayer.changeClipRectF(this.tempRenderLimitRectF);
        maskLayer.refresh();
    }

    public static /* synthetic */ void drawPath$default(DrawControl drawControl, Path path, Paint paint, Matrix matrix, int i, Object obj) {
        if ((i & 2) != 0) {
            paint = drawControl.boardPaint;
        }
        drawControl.drawPath(path, paint, matrix);
    }

    public static /* synthetic */ Bitmap getMinScreenShot$default(DrawControl drawControl, IGraph iGraph, int i, int i8, int i9, int i10, boolean z8, boolean z9, boolean z10, IGraph iGraph2, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z8 = false;
        }
        if ((i11 & 64) != 0) {
            z9 = false;
        }
        if ((i11 & 128) != 0) {
            z10 = false;
        }
        if ((i11 & 256) != 0) {
            iGraph2 = null;
        }
        return drawControl.getMinScreenShot(iGraph, i, i8, i9, i10, z8, z9, z10, iGraph2);
    }

    private final void initActiveLayer(RectF rectF) {
        Bitmap bitmap = this.activeLayerBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (rectF.isEmpty()) {
            return;
        }
        this.activeLayerBitmap = Bitmap.createBitmap((int) rectF.width(), (int) rectF.height(), Bitmap.Config.ARGB_8888);
        Bitmap bitmap2 = this.activeLayerBitmap;
        AbstractC5830k.m5327d(bitmap2);
        this.activeLayerCanvas = new Canvas(bitmap2);
    }

    private final void initCameraBitmap(IGraph rootGraph) {
        Matrix matrix;
        ActiveLayer activeLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (activeLayer = renderLayer.getActiveLayer()) != null) {
            activeLayer.clear();
        }
        RectF rectF = this.cameraRenderRectF;
        rectF.setEmpty();
        Iterator<T> it = rootGraph.getChildGraph().iterator();
        while (true) {
            Matrix adapterMatrix = null;
            if (!it.hasNext()) {
                break;
            }
            IGraph iGraph = (IGraph) it.next();
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                adapterMatrix = matrixAdapter.getAdapterMatrix();
            }
            rectF.union(iGraph.getMinOutRectF(adapterMatrix));
        }
        Bitmap bitmap = this.cameraBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (this.cameraRenderRectF.isEmpty()) {
            this.cameraBitmap = null;
            this.cameraCanvas = null;
        } else {
            this.cameraBitmap = Bitmap.createBitmap((int) this.cameraRenderRectF.width(), (int) this.cameraRenderRectF.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap2 = this.cameraBitmap;
            AbstractC5830k.m5327d(bitmap2);
            this.cameraCanvas = new Canvas(bitmap2);
        }
        Canvas canvas = this.cameraCanvas;
        if (canvas != null) {
            canvas.save();
            RectF rectF2 = this.cameraRenderRectF;
            canvas.translate(-rectF2.left, -rectF2.top);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 == null || (matrix = matrixAdapter2.getAdapterMatrix()) == null) {
                matrix = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrix, null, false, true, 12, null);
            canvas.restore();
        }
    }

    public final void add(@NotNull IGraph graph) {
        ActiveLayer activeLayer;
        MatrixAdapter matrixAdapter;
        AbstractC5830k.m5330g(graph, "graph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null && (matrixAdapter = this.matrixAdapter) != null) {
            graph.render(canvas, matrixAdapter.getAdapterMatrix());
        }
        Log.i("DrawView", "开始绘制");
        drawFixLayer();
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.clear();
    }

    public final void cameraChangeEnd(@NotNull IGraph rootGraph) {
        Matrix adapterMatrix;
        ActiveLayer activeLayer;
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.getIsGroupGraphComplete(), 12, null);
            }
        }
        drawFixLayer();
        if (this.boardConfig.getIsGroupGraphComplete()) {
            clearActiveBitmapAndCanvas();
            RenderLayer renderLayer = this.renderLayer;
            if (renderLayer != null && (activeLayer = renderLayer.getActiveLayer()) != null) {
                activeLayer.clear();
            }
        } else {
            checkActiveLayer();
            Canvas canvas2 = this.activeLayerCanvas;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            }
            drawActiveLayer$default(this, null, 1, null);
        }
        MatrixAdapter matrixAdapter2 = this.matrixAdapter;
        if (matrixAdapter2 == null || (adapterMatrix = matrixAdapter2.getAdapterMatrix()) == null) {
            return;
        }
        updateBackgroundMatrix(adapterMatrix);
    }

    public final void cameraChangeStart(@NotNull IGraph rootGraph) {
        Bitmap bitmap;
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        if (this.boardConfig.getIsGroupGraphComplete()) {
            initCameraBitmap(rootGraph);
            Matrix matrix = this.translateMatrix;
            RectF rectF = this.cameraRenderRectF;
            matrix.setTranslate(rectF.left, rectF.top);
            Bitmap bitmap2 = this.cameraBitmap;
            if (bitmap2 != null) {
                if (this.cameraRenderRectF.contains(new RectF(this.renderLayerRect))) {
                    RectF rectF2 = this.cameraRenderRectF;
                    drawCameraRegion(bitmap2, rectF2.left, rectF2.top);
                } else {
                    drawCameraBitmap(bitmap2, this.translateMatrix);
                }
            }
        } else {
            checkActiveLayer();
            Canvas canvas = this.activeLayerCanvas;
            if (canvas != null && (bitmap = this.fixLayerBitmap) != null) {
                CanvasUtils.INSTANCE.drawLargeBitmap(canvas, bitmap, new Matrix());
            }
            drawActiveLayer$default(this, null, 1, null);
        }
        Canvas canvas2 = this.fixLayerCanvas;
        if (canvas2 != null) {
            DrawControlKt.clear(canvas2);
        }
        drawFixLayer();
    }

    public final void cameraChanging(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        if (this.boardConfig.getIsGroupGraphComplete()) {
            Matrix matrix2 = this.tempMatrix;
            matrix2.set(this.translateMatrix);
            matrix2.postConcat(matrix);
            float[] fArr = {0.0f, 0.0f};
            this.tempMatrix.mapPoints(fArr);
            Log.i("cameraChanging", fArr[0] + "  " + fArr[1]);
            Bitmap bitmap = this.cameraBitmap;
            if (bitmap != null) {
                if (this.cameraRenderRectF.contains(new RectF(this.renderLayerRect))) {
                    drawCameraRegion(bitmap, fArr[0], fArr[1]);
                } else {
                    drawCameraBitmap(bitmap, this.tempMatrix);
                }
            }
        } else {
            drawActiveLayer(matrix);
        }
        Matrix matrix3 = new Matrix();
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        if (matrixAdapter != null) {
            matrix3.postConcat(matrixAdapter.getCameraMatrix());
            matrix3.postConcat(matrix);
            matrix3.postConcat(matrixAdapter.getScreenMatrix());
        }
        updateBackgroundMatrix(matrix3);
    }

    @Nullable
    public final Bitmap contentThumbnail(@NotNull IGraph graph) {
        Matrix screenMatrix;
        FixLayer fixLayer;
        AbstractC5830k.m5330g(graph, "graph");
        RectF rectF = new RectF();
        Iterator<T> it = graph.getChildGraph().iterator();
        while (true) {
            Matrix screenMatrix2 = null;
            if (!it.hasNext()) {
                break;
            }
            IGraph iGraph = (IGraph) it.next();
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                screenMatrix2 = matrixAdapter.getScreenMatrix();
            }
            rectF.union(iGraph.getMinOutRectF(screenMatrix2));
        }
        RenderLayer renderLayer = this.renderLayer;
        RectF rectF2 = new RectF((renderLayer == null || (fixLayer = renderLayer.getFixLayer()) == null) ? null : fixLayer.rect());
        RectF rectF3 = new RectF();
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            rectF3.set(0.0f, 0.0f, rectF2.width() * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), rectF2.height() * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
        } else {
            rectF3.set(rectF2);
        }
        float fMin = Math.min(rectF3.bottom, rectF.bottom);
        rectF3.bottom = fMin;
        rectF3.bottom = Math.max(fMin, rectF2.bottom);
        if (rectF3.isEmpty()) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF3.width(), (int) rectF3.height(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        MatrixAdapter matrixAdapter2 = this.matrixAdapter;
        if (matrixAdapter2 != null && (screenMatrix = matrixAdapter2.getScreenMatrix()) != null) {
            drawBackground(canvas, screenMatrix);
            graph.onDraw(canvas, screenMatrix, null, false, true);
        }
        return bitmapCreateBitmap;
    }

    public final void delete(@NotNull IGraph rootGraph) {
        Matrix matrix;
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                matrix = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrix, null, false, this.boardConfig.getIsGroupGraphComplete(), 12, null);
        }
        drawFixLayer();
    }

    public final void drawGraphInActive(@NotNull List<? extends IGraph> graphList) {
        Matrix matrix;
        AbstractC5830k.m5330g(graphList, "graphList");
        Canvas canvas = this.activeLayerCanvas;
        if (canvas != null) {
            for (IGraph iGraph : graphList) {
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                    matrix = new Matrix();
                }
                IDraw.DefaultImpls.onDraw$default(iGraph, canvas, matrix, null, false, this.boardConfig.getIsGroupGraphComplete(), 12, null);
            }
        }
        drawActiveLayer$default(this, null, 1, null);
    }

    public final void drawGraphInFix(@NotNull List<? extends IGraph> graphList) {
        Matrix matrix;
        AbstractC5830k.m5330g(graphList, "graphList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            for (IGraph iGraph : graphList) {
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                    matrix = new Matrix();
                }
                IDraw.DefaultImpls.onDraw$default(iGraph, canvas, matrix, null, false, this.boardConfig.getIsGroupGraphComplete(), 12, null);
            }
        }
        drawFixLayer();
    }

    public final void drawPath(@NotNull Path path, @NotNull Paint paint, @Nullable Matrix matrix) {
        ActiveLayer activeLayer;
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(paint, "paint");
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.draw(path, paint, matrix);
    }

    public final int getBackgroundColor() {
        BackgroundLayer backgroundLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (backgroundLayer = renderLayer.getBackgroundLayer()) != null) {
            Integer numValueOf = Integer.valueOf(backgroundLayer.getMBackgroundColor());
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return this.boardConfig.getBackgroundColorOutside();
    }

    @NotNull
    public final BackgroundLineConfig getBackgroundLineConfig() {
        BackgroundLayer backgroundLayer;
        BackgroundLineConfig backgroundLineConfig;
        RenderLayer renderLayer = this.renderLayer;
        return (renderLayer == null || (backgroundLayer = renderLayer.getBackgroundLayer()) == null || (backgroundLineConfig = backgroundLayer.getBackgroundLineConfig()) == null) ? new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null) : backgroundLineConfig;
    }

    @Nullable
    public final Bitmap getMinScreenShot(@NotNull IGraph graph, int horizontalOffset, int verticalOffset, int minWidth, int minHeight, boolean isWidthAsBoard, boolean isContainLimit, boolean isBoardAsTop, @Nullable final IGraph interruptGraph) {
        int i;
        Matrix adapterMatrix;
        FixLayer fixLayer;
        AbstractC5830k.m5330g(graph, "graph");
        RectF rectF = new RectF();
        Iterator<T> it = graph.getChildGraph().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IGraph iGraph = (IGraph) it.next();
            if (!AbstractC5830k.m5325b(iGraph, interruptGraph)) {
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                rectF.union(iGraph.getMinOutRectF(matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null));
            }
        }
        float f = horizontalOffset;
        rectF.left -= f;
        rectF.right += f;
        float f7 = verticalOffset;
        rectF.top -= f7;
        rectF.bottom += f7;
        RenderLayer renderLayer = this.renderLayer;
        RectF rectF2 = new RectF((renderLayer == null || (fixLayer = renderLayer.getFixLayer()) == null) ? null : fixLayer.rect());
        RectF rectF3 = new RectF();
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            rectF3.set(0.0f, 0.0f, rectF2.width() * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), rectF2.height() * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
            Matrix matrix = new Matrix();
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 != null) {
                matrix.postConcat(MatrixExtKt.invert(matrixAdapter2.getScreenMatrix()));
                matrix.postConcat(matrixAdapter2.getAdapterMatrix());
            }
            matrix.mapRect(rectF3);
        } else {
            rectF3.setEmpty();
        }
        MatrixAdapter matrixAdapter3 = this.matrixAdapter;
        if (matrixAdapter3 != null && (adapterMatrix = matrixAdapter3.getAdapterMatrix()) != null) {
            adapterMatrix.mapRect(rectF2);
        }
        if (isContainLimit && !rectF3.isEmpty()) {
            rectF2.intersect(rectF3);
            rectF.intersect(rectF3);
        }
        Matrix matrix2 = new Matrix();
        MatrixAdapter matrixAdapter4 = this.matrixAdapter;
        if (matrixAdapter4 != null) {
            matrix2.postConcat(matrixAdapter4.getAdapterMatrix());
        }
        int iWidth = (int) rectF.width();
        int iHeight = (int) rectF.height();
        if (isWidthAsBoard) {
            matrix2.postTranslate(-rectF2.left, 0.0f);
            iWidth = (int) rectF2.width();
        } else if (iWidth < minWidth) {
            matrix2.postTranslate(((minWidth - iWidth) / 2) - rectF.left, 0.0f);
            iWidth = minWidth;
        } else {
            matrix2.postTranslate(-rectF.left, 0.0f);
        }
        if (isBoardAsTop && !rectF3.isEmpty()) {
            matrix2.postTranslate(0.0f, -rectF3.top);
            i = (int) (rectF.bottom - rectF3.top);
        } else if (iHeight < minHeight) {
            matrix2.postTranslate(0.0f, ((minHeight - iHeight) / 2) - rectF.top);
            i = minHeight;
        } else {
            matrix2.postTranslate(0.0f, -rectF.top);
            i = iHeight;
        }
        if (iWidth <= 0 || i <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth, i, Bitmap.Config.ARGB_8888);
        this.snapshotBitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawBackground(canvas, matrix2);
            graph.onDraw(canvas, matrix2, new InterfaceC6471c() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$getMinScreenShot$1$1
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                @NotNull
                public final Boolean invoke(@NotNull IGraph it2) {
                    AbstractC5830k.m5330g(it2, "it");
                    return Boolean.valueOf(it2.equals(interruptGraph));
                }
            }, false, true);
        }
        return this.snapshotBitmap;
    }

    @NotNull
    public final RectF getOldPageRectF() {
        return this.oldPageRectF;
    }

    public final void newSelect(@NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        Path selectPath = this.newSelectDrawControl.getSelectPath(selectRectF, typeList, matrix);
        if (!this.boardConfig.getIsGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas = this.activeLayerCanvas;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                this.newSelectDrawControl.drawSelect(canvas, getBackgroundColor(), selectPath, functionRectF, functionBackgroundRectF, typeList, pointF);
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        selectPath.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        initActiveLayer(rectF2);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            this.newSelectDrawControl.drawSelect(canvas2, getBackgroundColor(), selectPath, functionRectF, functionBackgroundRectF, typeList, pointF);
            canvas2.restore();
        }
        this.tempMatrix.setTranslate(rectF2.left, rectF2.top);
        drawActiveLayer(this.tempMatrix);
    }

    public final void newSelecting(float l, float t8, float r, float b6) {
        ActiveLayer activeLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.draw(this.newSelectDrawControl.drawSelectingPath(l, t8, r, b6), this.newSelectDrawControl.drawSelectingPaint(getBackgroundColor()), null);
    }

    public final void newTextHandleEnd(@NotNull IGraph rootGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.getIsGroupGraphComplete(), 8, null);
            }
        }
        drawFixLayer();
        newSelect(selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    public final void newTextHandleStart(@NotNull IGraph rootGraph, @NotNull final IGraph textGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(textGraph, "textGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), new InterfaceC6471c() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$newTextHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    @NotNull
                    public final Boolean invoke(@NotNull IGraph childGraph) {
                        AbstractC5830k.m5330g(childGraph, "childGraph");
                        return Boolean.valueOf(AbstractC5830k.m5325b(childGraph.getId(), textGraph.getId()));
                    }
                }, false, this.boardConfig.getIsGroupGraphComplete(), 8, null);
            }
        }
        drawFixLayer();
        newTextHandling(textGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, functionBackgroundRectF, typeList, pointF);
    }

    public final void newTextHandling(@NotNull IGraph textGraph, @NotNull RectF selectRectF, @NotNull Matrix matrix, @NotNull RectF selectFunctionRectF, @NotNull FunctionRectF functionRectF, @NotNull FunctionBackgroundRectF functionBackgroundRectF, @NotNull List<? extends NewSelectFunctionType> typeList, @Nullable PointF pointF) {
        Matrix matrix2;
        AbstractC5830k.m5330g(textGraph, "textGraph");
        AbstractC5830k.m5330g(selectRectF, "selectRectF");
        AbstractC5830k.m5330g(matrix, "matrix");
        AbstractC5830k.m5330g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC5830k.m5330g(functionRectF, "functionRectF");
        AbstractC5830k.m5330g(functionBackgroundRectF, "functionBackgroundRectF");
        AbstractC5830k.m5330g(typeList, "typeList");
        Path selectPath = this.newSelectDrawControl.getSelectPath(selectRectF, typeList, matrix);
        if (!this.boardConfig.getIsGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas = this.activeLayerCanvas;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                MatrixAdapter matrixAdapter = this.matrixAdapter;
                if (matrixAdapter != null) {
                    IDraw.DefaultImpls.onDraw$default(textGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, false, 28, null);
                }
                this.newSelectDrawControl.drawSelect(canvas, getBackgroundColor(), selectPath, functionRectF, functionBackgroundRectF, typeList, pointF);
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        RectF rectF = new RectF();
        selectPath.computeBounds(rectF, false);
        rectF.left -= 3.0f;
        rectF.top -= 3.0f;
        rectF.right += 3.0f;
        rectF.bottom += 3.0f;
        RectF rectF2 = new RectF();
        rectF2.union(rectF);
        rectF2.union(selectFunctionRectF);
        initActiveLayer(rectF2);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF2.left, -rectF2.top);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 == null || (matrix2 = matrixAdapter2.getAdapterMatrix()) == null) {
                matrix2 = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(textGraph, canvas2, matrix2, null, false, true, 12, null);
            rectF2 = rectF2;
            this.newSelectDrawControl.drawSelect(canvas2, getBackgroundColor(), selectPath, functionRectF, functionBackgroundRectF, typeList, pointF);
            canvas2.restore();
        }
        this.tempMatrix.setTranslate(rectF2.left, rectF2.top);
        drawActiveLayer(this.tempMatrix);
    }

    public final boolean refresh() {
        ActiveLayer activeLayer;
        FixLayer fixLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (fixLayer = renderLayer.getFixLayer()) != null) {
            fixLayer.refresh();
        }
        RenderLayer renderLayer2 = this.renderLayer;
        if (renderLayer2 == null || (activeLayer = renderLayer2.getActiveLayer()) == null) {
            return true;
        }
        activeLayer.refresh();
        return true;
    }

    public final void release() {
        ActiveLayer activeLayer;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (activeLayer = renderLayer.getActiveLayer()) != null) {
            activeLayer.clear();
        }
        this.fixLayerCanvas = null;
        this.activeLayerCanvas = null;
        BitmapUtil.INSTANCE.recycle(new Bitmap[]{this.fixLayerBitmap, this.activeLayerBitmap, this.snapshotBitmap, this.cameraBitmap}, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl.release.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13756invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13756invoke() {
                DrawControl.this.fixLayerBitmap = null;
                DrawControl.this.activeLayerBitmap = null;
                DrawControl.this.snapshotBitmap = null;
                DrawControl.this.cameraBitmap = null;
            }
        });
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        if (matrixAdapter != null) {
            matrixAdapter.unRegisterRenderRectFChangeListener(this.renderChangeListener);
        }
    }

    public final void renderRectFInFix(@NotNull RectF rectF, @NotNull List<IGraph> graphList) {
        Matrix matrix;
        AbstractC5830k.m5330g(rectF, "rectF");
        AbstractC5830k.m5330g(graphList, "graphList");
        Rect rect = new Rect();
        rect.left = ((int) rectF.left) + 1;
        rect.top = ((int) rectF.top) + 1;
        rect.right = (int) rectF.right;
        rect.bottom = (int) rectF.bottom;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(-rect.left, -rect.top);
        for (IGraph iGraph : graphList) {
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                matrix = new Matrix();
            }
            IDraw.DefaultImpls.onDraw$default(iGraph, canvas, matrix, null, false, this.boardConfig.getIsGroupGraphComplete(), 4, null);
        }
        Canvas canvas2 = this.fixLayerCanvas;
        if (canvas2 != null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas2.drawRect(rect, paint);
            canvas2.drawBitmap(bitmapCreateBitmap, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), rect, (Paint) null);
        }
        drawFixLayer();
    }

    public final void reset() {
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null) {
            renderLayer.reset();
        }
    }

    @Nullable
    public final Bitmap screenshot(@NotNull IGraph graph) {
        Matrix adapterMatrix;
        FixLayer fixLayer;
        AbstractC5830k.m5330g(graph, "graph");
        RenderLayer renderLayer = this.renderLayer;
        RectF rectF = new RectF((renderLayer == null || (fixLayer = renderLayer.getFixLayer()) == null) ? null : fixLayer.rect());
        RectF rectF2 = new RectF();
        if (this.boardConfig.getMoveActionConfig().isMoveActionEnable()) {
            rectF2.set(0.0f, 0.0f, rectF.width() * this.boardConfig.getMoveActionConfig().getMaxWidthTimes(), rectF.height() * this.boardConfig.getMoveActionConfig().getMaxHeightTimes());
            Matrix matrix = new Matrix();
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                matrix.postConcat(MatrixExtKt.invert(matrixAdapter.getScreenMatrix()));
                matrix.postConcat(matrixAdapter.getAdapterMatrix());
            }
            matrix.mapRect(rectF2);
        } else {
            rectF2.setEmpty();
        }
        if (!rectF2.isEmpty()) {
            rectF.intersect(rectF2);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) rectF.width()) + 1, ((int) rectF.height()) + 1, Bitmap.Config.ARGB_8888);
        this.snapshotBitmap = bitmapCreateBitmap;
        if (bitmapCreateBitmap != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 != null && (adapterMatrix = matrixAdapter2.getAdapterMatrix()) != null) {
                drawBackground(canvas, adapterMatrix);
                IDraw.DefaultImpls.onDraw$default(graph, canvas, adapterMatrix, null, false, false, 4, null);
            }
        }
        return this.snapshotBitmap;
    }

    public final void select(@NotNull Path path, @Nullable Paint paint) {
        AbstractC5830k.m5330g(path, "path");
        if (!this.boardConfig.getIsGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas = this.activeLayerCanvas;
            if (canvas != null) {
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                if (paint == null) {
                    paint = this.boardPaint;
                }
                canvas.drawPath(path, paint);
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        if (paint == null) {
            paint = this.boardPaint;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right = paint.getStrokeWidth() + rectF.right;
        rectF.bottom = paint.getStrokeWidth() + rectF.bottom;
        initActiveLayer(rectF);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(path, paint);
            canvas2.restore();
        }
        this.tempMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.tempMatrix);
    }

    public final void selectCancel() {
        ActiveLayer activeLayer;
        if (this.boardConfig.getIsGroupGraphComplete()) {
            clearActiveBitmapAndCanvas();
        }
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
            return;
        }
        activeLayer.clear();
    }

    public final void setBackgroundColor(int color) {
        BackgroundLayer backgroundLayer;
        BackgroundLayer backgroundLayer2;
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (backgroundLayer2 = renderLayer.getBackgroundLayer()) != null) {
            backgroundLayer2.setMyBackgroundColor(color);
        }
        RenderLayer renderLayer2 = this.renderLayer;
        if (renderLayer2 == null || (backgroundLayer = renderLayer2.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.refresh();
    }

    public final void setBackgroundLineConfig(@NotNull BackgroundLineConfig backgroundLineConfig) {
        BackgroundLayer backgroundLayer;
        BackgroundLayer backgroundLayer2;
        AbstractC5830k.m5330g(backgroundLineConfig, "backgroundLineConfig");
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer != null && (backgroundLayer2 = renderLayer.getBackgroundLayer()) != null) {
            backgroundLayer2.setBackgroundLineConfig(backgroundLineConfig);
        }
        RenderLayer renderLayer2 = this.renderLayer;
        if (renderLayer2 == null || (backgroundLayer = renderLayer2.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.refresh();
    }

    public final void setMatrixAdapter(@NotNull MatrixAdapter matrixAdapter) {
        AbstractC5830k.m5330g(matrixAdapter, "matrixAdapter");
        this.matrixAdapter = matrixAdapter;
        matrixAdapter.registerRenderRectFChangeListener(this.renderChangeListener);
    }

    public final void setRenderLayer(@NotNull RenderLayer renderLayer) {
        AbstractC5830k.m5330g(renderLayer, "renderLayer");
        this.renderLayer = renderLayer;
        this.renderLayerRect.set(renderLayer.getRenderRect());
        if (!this.renderLayerRect.isEmpty()) {
            this.fixLayerBitmap = Bitmap.createBitmap(this.renderLayerRect.width(), this.renderLayerRect.height(), Bitmap.Config.ARGB_8888);
            Bitmap bitmap = this.fixLayerBitmap;
            AbstractC5830k.m5327d(bitmap);
            this.fixLayerCanvas = new Canvas(bitmap);
        }
        drawMaskLayer();
    }

    public final void textHandle(@NotNull TextGraph graph, @Nullable Path selectRectPath, @Nullable Paint paint) {
        AbstractC5830k.m5330g(graph, "graph");
        Paint paint2 = paint == null ? this.boardPaint : paint;
        RectF rectF = new RectF();
        if (selectRectPath != null) {
            selectRectPath.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right = paint2.getStrokeWidth() + rectF.right;
            rectF.bottom = paint2.getStrokeWidth() + rectF.bottom;
        } else {
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            rectF.set(graph.getMinOutRectF(matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null));
        }
        initActiveLayer(rectF);
        Canvas canvas = this.activeLayerCanvas;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas.save();
            canvas.translate(-rectF.left, -rectF.top);
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            if (matrixAdapter2 != null) {
                IDraw.DefaultImpls.onDraw$default(graph, canvas, matrixAdapter2.getAdapterMatrix(), null, false, this.boardConfig.getIsGroupGraphComplete(), 4, null);
            }
            if (selectRectPath != null) {
                if (paint == null) {
                    paint = this.boardPaint;
                }
                canvas.drawPath(selectRectPath, paint);
            }
            canvas.restore();
        }
        this.translateMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.translateMatrix);
    }

    public final void textHandleEnd(@NotNull IGraph rootGraph, @Nullable Path selectRectPath, @Nullable Paint paint) {
        ActiveLayer activeLayer;
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.getIsGroupGraphComplete(), 4, null);
            }
        }
        drawFixLayer();
        if (selectRectPath == null) {
            clearActiveBitmapAndCanvas();
            RenderLayer renderLayer = this.renderLayer;
            if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
                return;
            }
            activeLayer.clear();
            return;
        }
        if (paint == null) {
            paint = this.boardPaint;
        }
        RectF rectF = new RectF();
        selectRectPath.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right = paint.getStrokeWidth() + rectF.right;
        rectF.bottom = paint.getStrokeWidth() + rectF.bottom;
        initActiveLayer(rectF);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            canvas2.drawPath(selectRectPath, paint);
            canvas2.restore();
        }
        Matrix matrix = this.tempMatrix;
        matrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(matrix);
    }

    public final void textHandleStart(@NotNull IGraph rootGraph, @NotNull final TextGraph graph, @Nullable Path selectRectPath, @Nullable Paint paint) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(graph, "graph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), new InterfaceC6471c() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$textHandleStart$1$1$1
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    @NotNull
                    public final Boolean invoke(@NotNull IGraph childGraph) {
                        AbstractC5830k.m5330g(childGraph, "childGraph");
                        return Boolean.valueOf(AbstractC5830k.m5325b(childGraph.getId(), graph.getId()));
                    }
                }, false, false, 24, null);
            }
        }
        drawFixLayer();
        Paint paint2 = paint == null ? this.boardPaint : paint;
        RectF rectF = new RectF();
        if (selectRectPath != null) {
            selectRectPath.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right = paint2.getStrokeWidth() + rectF.right;
            rectF.bottom = paint2.getStrokeWidth() + rectF.bottom;
        } else {
            MatrixAdapter matrixAdapter2 = this.matrixAdapter;
            graph.getMinOutRectF(matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null);
        }
        initActiveLayer(rectF);
        Canvas canvas2 = this.activeLayerCanvas;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas2.save();
            canvas2.translate(-rectF.left, -rectF.top);
            MatrixAdapter matrixAdapter3 = this.matrixAdapter;
            if (matrixAdapter3 != null) {
                IDraw.DefaultImpls.onDraw$default(graph, canvas2, matrixAdapter3.getAdapterMatrix(), null, false, this.boardConfig.getIsGroupGraphComplete(), 4, null);
            }
            if (selectRectPath != null) {
                if (paint == null) {
                    paint = this.boardPaint;
                }
                canvas2.drawPath(selectRectPath, paint);
            }
            canvas2.restore();
        }
        this.translateMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.translateMatrix);
    }

    public final void transGraph(@NotNull Matrix matrix) {
        AbstractC5830k.m5330g(matrix, "matrix");
        if (!this.boardConfig.getIsGroupGraphComplete()) {
            drawActiveLayer(matrix);
            return;
        }
        Matrix matrix2 = new Matrix();
        matrix2.set(this.translateMatrix);
        matrix2.postConcat(matrix);
        drawActiveLayer(matrix2);
    }

    public final void transGraphEnd(@NotNull IGraph rootGraph, @Nullable Path path, @Nullable Paint paint) {
        ActiveLayer activeLayer;
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), null, false, this.boardConfig.getIsGroupGraphComplete(), 12, null);
            }
        }
        drawFixLayer();
        if (!this.boardConfig.getIsGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas2 = this.activeLayerCanvas;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                if (path != null) {
                    if (paint == null) {
                        paint = this.boardPaint;
                    }
                    canvas2.drawPath(path, paint);
                }
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        if (path == null) {
            clearActiveBitmapAndCanvas();
            RenderLayer renderLayer = this.renderLayer;
            if (renderLayer == null || (activeLayer = renderLayer.getActiveLayer()) == null) {
                return;
            }
            activeLayer.clear();
            return;
        }
        if (paint == null) {
            paint = this.boardPaint;
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        rectF.left -= paint.getStrokeWidth();
        rectF.top -= paint.getStrokeWidth();
        rectF.right = paint.getStrokeWidth() + rectF.right;
        rectF.bottom = paint.getStrokeWidth() + rectF.bottom;
        initActiveLayer(rectF);
        Canvas canvas3 = this.activeLayerCanvas;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            canvas3.drawPath(path, paint);
            canvas3.restore();
        }
        Matrix matrix = this.tempMatrix;
        matrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(matrix);
    }

    public final void transGraphStart(@NotNull IGraph rootGraph, @NotNull final List<? extends IGraph> graphList, @Nullable Path selectRectPath, @Nullable Paint paint) {
        AbstractC5830k.m5330g(rootGraph, "rootGraph");
        AbstractC5830k.m5330g(graphList, "graphList");
        Canvas canvas = this.fixLayerCanvas;
        if (canvas != null) {
            DrawControlKt.clear(canvas);
            MatrixAdapter matrixAdapter = this.matrixAdapter;
            if (matrixAdapter != null) {
                IDraw.DefaultImpls.onDraw$default(rootGraph, canvas, matrixAdapter.getAdapterMatrix(), new InterfaceC6471c() { // from class: com.zykj.blackboard.core.canvas.control.DrawControl$transGraphStart$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    @NotNull
                    public final Boolean invoke(@NotNull IGraph childGraph) {
                        AbstractC5830k.m5330g(childGraph, "childGraph");
                        List<IGraph> list = graphList;
                        boolean z8 = false;
                        if (list == null || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (AbstractC5830k.m5325b(childGraph.getId(), ((IGraph) it.next()).getId())) {
                                    z8 = true;
                                    break;
                                }
                            }
                        }
                        return Boolean.valueOf(z8);
                    }
                }, false, this.boardConfig.getIsGroupGraphComplete(), 8, null);
            }
        }
        drawFixLayer();
        if (!this.boardConfig.getIsGroupGraphComplete()) {
            checkActiveLayer();
            Canvas canvas2 = this.activeLayerCanvas;
            if (canvas2 != null) {
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                for (IGraph iGraph : graphList) {
                    MatrixAdapter matrixAdapter2 = this.matrixAdapter;
                    if (matrixAdapter2 != null) {
                        IDraw.DefaultImpls.onDraw$default(iGraph, canvas2, matrixAdapter2.getAdapterMatrix(), null, false, false, 28, null);
                    }
                }
                if (selectRectPath != null) {
                    canvas2.drawPath(selectRectPath, paint == null ? this.boardPaint : paint);
                }
            }
            drawActiveLayer$default(this, null, 1, null);
            return;
        }
        Paint paint2 = paint == null ? this.boardPaint : paint;
        RectF rectF = new RectF();
        if (selectRectPath != null) {
            selectRectPath.computeBounds(rectF, false);
            rectF.left -= paint2.getStrokeWidth();
            rectF.top -= paint2.getStrokeWidth();
            rectF.right = paint2.getStrokeWidth() + rectF.right;
            rectF.bottom = paint2.getStrokeWidth() + rectF.bottom;
        } else {
            for (IGraph iGraph2 : graphList) {
                MatrixAdapter matrixAdapter3 = this.matrixAdapter;
                rectF.union(iGraph2.getMinOutRectF(matrixAdapter3 != null ? matrixAdapter3.getAdapterMatrix() : null));
            }
        }
        initActiveLayer(rectF);
        Canvas canvas3 = this.activeLayerCanvas;
        if (canvas3 != null) {
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            canvas3.save();
            canvas3.translate(-rectF.left, -rectF.top);
            for (IGraph iGraph3 : graphList) {
                MatrixAdapter matrixAdapter4 = this.matrixAdapter;
                if (matrixAdapter4 != null) {
                    IDraw.DefaultImpls.onDraw$default(iGraph3, canvas3, matrixAdapter4.getAdapterMatrix(), null, false, true, 12, null);
                }
            }
            if (selectRectPath != null) {
                canvas3.drawPath(selectRectPath, paint == null ? this.boardPaint : paint);
            }
            canvas3.restore();
        }
        this.translateMatrix.setTranslate(rectF.left, rectF.top);
        drawActiveLayer(this.translateMatrix);
    }

    public final void updateBackgroundMatrix(@NotNull Matrix matrix) {
        BackgroundLayer backgroundLayer;
        AbstractC5830k.m5330g(matrix, "matrix");
        RenderLayer renderLayer = this.renderLayer;
        if (renderLayer == null || (backgroundLayer = renderLayer.getBackgroundLayer()) == null) {
            return;
        }
        backgroundLayer.setMatrix(matrix);
    }
}
