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
import cd.AbstractC5429h;
import com.zykj.sketch.C8705R;
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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p296pd.AbstractC10669q;
import p309qc.C10786q;
import p310qd.AbstractC10819z;

/* loaded from: classes6.dex */
public final class RecordControl {
    public static final Companion Companion = new Companion(null);
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

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public RecordControl(ViewGroup viewGroup, SketchConfig sketchConfig, RealDraw realDraw, ImitateDraw imitateDraw) {
        AbstractC9979u.m20294g(viewGroup, "viewGroup");
        AbstractC9979u.m20294g(sketchConfig, "sketchConfig");
        AbstractC9979u.m20294g(realDraw, "realDraw");
        AbstractC9979u.m20294g(imitateDraw, "imitateDraw");
        this.viewGroup = viewGroup;
        this.sketchConfig = sketchConfig;
        Context context = viewGroup.getContext();
        this.context = context;
        AbstractC9979u.m20293f(context, "context");
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

    public static /* synthetic */ void addAdapterImage$default(RecordControl recordControl, Bitmap bitmap, int i10, int i11, int i12, int i13, InterfaceC9540l interfaceC9540l, String str, InterfaceC9540l interfaceC9540l2, int i14, Object obj) {
        String strM23238K;
        int i15 = (i14 & 8) != 0 ? 0 : i12;
        int i16 = (i14 & 16) != 0 ? 24 : i13;
        InterfaceC9540l interfaceC9540l3 = (i14 & 32) != 0 ? new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.1
            public final void invoke(ImageGraph imageGraph) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((ImageGraph) obj2);
                return C10786q.f26013a;
            }
        } : interfaceC9540l;
        if ((i14 & 64) != 0) {
            String string = UUID.randomUUID().toString();
            AbstractC9979u.m20293f(string, "randomUUID().toString()");
            strM23238K = AbstractC10819z.m23238K(string, "-", "", false, 4, null);
        } else {
            strM23238K = str;
        }
        recordControl.addAdapterImage(bitmap, i10, i11, i15, i16, interfaceC9540l3, strM23238K, (i14 & 128) != 0 ? new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.2
            public final void invoke(String str2) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return C10786q.f26013a;
            }
        } : interfaceC9540l2);
    }

    private final void addImage(String str, int i10, int i11, int i12, int i13, InterfaceC9540l interfaceC9540l) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        float fCountScale = countScale(options.outWidth, options.outHeight, i10, i11, i13);
        ActionRecordExecute actionRecordExecute = this.actionExecute;
        ActionRecord actionRecord = this.actionRecord;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name = new File(str).getName();
        AbstractC9979u.m20293f(name, "File(filePath).name");
        actionRecordExecute.onAddImageEvent(actionRecord.buildImageData(jCurrentTimeMillis, name, (int) (options.outWidth * fCountScale), (int) (options.outHeight * fCountScale), (int) (i10 / this.graphControl.getScale()), (int) (i11 / this.graphControl.getScale()), i12), interfaceC9540l);
    }

    private final float countScale(int i10, int i11, int i12, int i13, int i14) {
        float scale;
        float scale2;
        float scale3;
        if (i14 == 24) {
            scale = 2;
            scale2 = (i12 / this.graphControl.getScale()) / scale;
            scale3 = i13 / this.graphControl.getScale();
        } else if (i14 != 25) {
            scale2 = i12 / this.graphControl.getScale();
            scale3 = i13;
            scale = this.graphControl.getScale();
        } else {
            scale2 = i12 / (this.graphControl.getScale() / 0.9f);
            scale3 = i13;
            scale = this.graphControl.getScale() / 0.9f;
        }
        float f10 = scale3 / scale;
        float f11 = scale2 / i10;
        if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        float f12 = f10 / i11;
        float f13 = f12 <= 1.0f ? f12 : 1.0f;
        switch (i14) {
        }
        return Math.min(f11, f13);
    }

    private final void executeActionContent(int i10, List<EzyDrawBoard.ActionContent> list, final InterfaceC9540l interfaceC9540l) {
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                size = -1;
                break;
            } else if (list.get(size).hasGraphSnapshot()) {
                break;
            }
        }
        if (size <= -1) {
            executeTask(EventTaskParseFactory.Companion.create(i10).parse(list, this.actionExecute, new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.executeActionContent.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((ViewControl) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(ViewControl viewControl) {
                    AbstractC9979u.m20294g(viewControl, "viewControl");
                    RecordControl.this.actionExecute.addViewControl(viewControl);
                    interfaceC9540l.invoke(viewControl);
                }
            }).getGraphTask());
            return;
        }
        int i11 = size + 1;
        this.actionRecord.addHistoryRecord(list.subList(0, i11));
        EventListener.DefaultImpls.graphSnapShot$default(this.actionExecute, list.get(size), false, 2, null);
        this.actionRecord.addHistoryRenderGraphSnapshot(list.get(size));
        if (size != list.size() - 1) {
            executeTask(ITaskParse.DefaultImpls.parse$default(EventTaskParseFactory.Companion.create(i10), list.subList(i11, list.size()), this.actionExecute, null, 4, null).getGraphTask());
        }
    }

    public static /* synthetic */ void executeActionContent$default(RecordControl recordControl, int i10, List list, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.executeActionContent.1
                public final void invoke(ViewControl it) {
                    AbstractC9979u.m20294g(it, "it");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ViewControl) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        recordControl.executeActionContent(i10, list, interfaceC9540l);
    }

    private final void executeTask(List<GraphTask> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((GraphTask) it.next()).getExecuteVoid().invoke();
        }
    }

    private final void getImagePath(ArrayList<String> arrayList, Graph graph) {
        if (graph instanceof ImageGraph) {
            arrayList.add(((ImageGraph) graph).getFileName());
        } else if (graph instanceof ImageHistoryGraph) {
            arrayList.add(((ImageHistoryGraph) graph).getFileName());
        }
        Iterator<T> it = graph.getChild().iterator();
        while (it.hasNext()) {
            getImagePath(arrayList, (Graph) it.next());
        }
    }

    public static /* synthetic */ void getRecordPath$default(RecordControl recordControl, int i10, int i11, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.getRecordPath.1
                public final void invoke(String str) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((String) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        recordControl.getRecordPath(i10, i11, interfaceC9540l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRecordPath$lambda-13, reason: not valid java name */
    public static final void m34079getRecordPath$lambda13(int i10, int i11, RecordControl this$0, InterfaceC9540l callBack) throws IOException {
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(callBack, "$callBack");
        if (i10 <= 0 || i11 <= 0) {
            callBack.invoke(null);
            return;
        }
        this$0.saveBitmap(i10, i11);
        this$0.actionRecord.saveRecord(this$0.sketchConfig.getSourcePath(), i10, i11);
        callBack.invoke(this$0.sketchConfig.getSourcePath());
    }

    public static /* synthetic */ void loadData$default(RecordControl recordControl, String str, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, Object obj) throws HighVersionException, EmptyDataException {
        if ((i10 & 2) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.loadData.1
                public final void invoke(ViewControl it) {
                    AbstractC9979u.m20294g(it, "it");
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((ViewControl) obj2);
                    return C10786q.f26013a;
                }
            };
        }
        recordControl.loadData(str, interfaceC9540l, interfaceC9540l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-1$lambda-0, reason: not valid java name */
    public static final void m34080loadData$lambda1$lambda0(EzyDrawBoard.BoardHead it, String path, EzyDrawBoard.DrawBoard drawBoard, RecordControl this$0, InterfaceC9540l viewBack, InterfaceC9540l finish) {
        AbstractC9979u.m20294g(it, "$it");
        AbstractC9979u.m20294g(path, "$path");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(viewBack, "$viewBack");
        AbstractC9979u.m20294g(finish, "$finish");
        VersionParseFactory.Companion companion = VersionParseFactory.Companion;
        int version = it.getVersion();
        EzyDrawBoard.BoardBody boardBody = drawBoard.getBoardBody();
        AbstractC9979u.m20293f(boardBody, "data.boardBody");
        this$0.executeActionContent(it.getVersion(), companion.parse(version, path, boardBody), viewBack);
        this$0.graphControl.render();
        this$0.graphControl.setMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING);
        this$0.graphControl.resetGraph();
        this$0.graphControl.resetStatus();
        this$0.actionFactory.reset();
        finish.invoke(this$0.graphControl.getRootGraph());
    }

    public static /* synthetic */ void reset$default(RecordControl recordControl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        recordControl.reset(z10);
    }

    private final void saveBitmap(int i10, int i11) throws IOException {
        Bitmap bitmapThumbnail = thumbnail(i10, i11);
        FileUtils.Companion.saveBitmap2SDCard(bitmapThumbnail, this.graphControl.getBasePath() + thumbnailFileName);
        bitmapThumbnail.recycle();
    }

    public static /* synthetic */ boolean zoom$default(RecordControl recordControl, float f10, float f11, float f12, float f13, boolean z10, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z10 = true;
        }
        return recordControl.zoom(f10, f11, f12, f13, z10);
    }

    public final void addActionChangeListener(ActionChangeListener actionChangeListener) {
        this.actionRecord.addActionChangeListener(actionChangeListener);
    }

    public final void addAdapterImage(Bitmap bitmap, int i10, int i11, int i12, int i13, InterfaceC9540l callBack, String imageName, InterfaceC9540l pathCallBack) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(callBack, "callBack");
        AbstractC9979u.m20294g(imageName, "imageName");
        AbstractC9979u.m20294g(pathCallBack, "pathCallBack");
        Graph rootGraph = this.graphControl.getRootGraph();
        String name = ImageGraph.class.getName();
        AbstractC9979u.m20293f(name, "ImageGraph::class.java.name");
        if (rootGraph.childTypeNumber(name) >= this.sketchConfig.getMaxImageCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C8705R.string.tips_max_image, Integer.valueOf(this.sketchConfig.getMaxImageCount())));
            callBack.invoke(null);
            return;
        }
        String str = this.graphControl.getBaseImagePath() + imageName + ".jpg";
        FileUtils.Companion companion = FileUtils.Companion;
        String absolutePath = new File(str).getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "File(imagePath).absolutePath");
        pathCallBack.invoke(companion.saveBitmap2SDCard(bitmap, absolutePath));
        addImage(str, i10, i11, i12, i13, callBack);
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    // Copies the source folder contents into res/ and records the entry name, time
    // and dimensions. The playback graph looks for the same entry under res/ppt/.
    public final void addAdapterPPT(String path, int i10, int i11, int i12, int i13, InterfaceC9540l callBack) throws IOException {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(callBack, "callBack");
        Graph rootGraph = this.graphControl.getRootGraph();
        String name = WebViewGraph.class.getName();
        AbstractC9979u.m20293f(name, "WebViewGraph::class.java.name");
        if (rootGraph.childTypeNumber(name) >= this.sketchConfig.getMaxPPTCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C8705R.string.tips_max_ppt, Integer.valueOf(this.sketchConfig.getMaxPPTCount())));
            return;
        }
        File file = new File(path);
        if (!file.exists()) {
            Context context2 = this.context;
            ToastUtils.showShort(context2, context2.getString(C8705R.string.tips_file_not_found));
            return;
        }
        FileUtils.Companion companion = FileUtils.Companion;
        String absolutePath = file.getParentFile().getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath, "file.parentFile.absolutePath");
        String absolutePath2 = new File(this.graphControl.getBasePPTPath()).getParentFile().getAbsolutePath();
        AbstractC9979u.m20293f(absolutePath2, "File(graphControl.getBas…).parentFile.absolutePath");
        companion.copyFolder(absolutePath, absolutePath2);
        ActionRecordExecute actionRecordExecute = this.actionExecute;
        ActionRecord actionRecord = this.actionRecord;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String name2 = file.getName();
        AbstractC9979u.m20293f(name2, "file.name");
        actionRecordExecute.onAddPPTEvent(actionRecord.buildWebViewData(jCurrentTimeMillis, name2, i10, i11, i12, i13), callBack);
    }

    public final void addNextPrevListener(NextPrevListener nextPrevListener) {
        this.actionRecord.addNextPrevListener(nextPrevListener);
    }

    public final void addProgressListener(ProgressListener progressListener) {
        this.audioControl.addListener(progressListener);
    }

    public final void clear() {
        this.actionExecute.onClearBoardEvent(this.actionRecord.buildClearBoardData(System.currentTimeMillis()));
    }

    public final RectF getDrawConfig() {
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        return drawArea != null ? new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY()) : new RectF();
    }

    public final void getRecordPath(final int i10, final int i11, final InterfaceC9540l callBack) {
        AbstractC9979u.m20294g(callBack, "callBack");
        new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                RecordControl.m34079getRecordPath$lambda13(i10, i11, this, callBack);
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
            zIsRecord = this.audioControl.isRecord();
        }
        return zIsRecord;
    }

    public final boolean isTouch() {
        return this.graphControl.isTouch();
    }

    public final ThumbnailBean limitThumbnail() {
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        if (drawArea != null) {
            ActionRecordExecute actionRecordExecute = this.actionExecute;
            List<Float> matrixList = drawArea.getMatrixList();
            AbstractC9979u.m20293f(matrixList, "this.matrixList");
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
                    graphBuildGraph.onDrawComplete(new Canvas(bitmap), new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl$limitThumbnail$1$1$1
                        @Override // p181hd.InterfaceC9540l
                        public final Boolean invoke(Graph graph) {
                            AbstractC9979u.m20294g(graph, "graph");
                            return Boolean.valueOf(graph instanceof WritingGroupGraph);
                        }
                    });
                    matrixBuildMatrix.mapRect(rectF2, rectF);
                    RectF rectFMaxWritingRenderOutRectF = GraphExtKt.maxWritingRenderOutRectF(graphBuildGraph);
                    this.graphControl.setCameraMatrix(cameraMatrix);
                    AbstractC9979u.m20293f(bitmap, "bitmap");
                    return new ThumbnailBean(bitmap, rectFMaxWritingRenderOutRectF, rectF2);
                }
            }
        }
        return null;
    }

    public final void loadData(final String path, final InterfaceC9540l viewBack, final InterfaceC9540l finish) throws HighVersionException, EmptyDataException {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(viewBack, "viewBack");
        AbstractC9979u.m20294g(finish, "finish");
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
                            RecordControl.m34080loadData$lambda1$lambda0(boardHead, path, from, this, viewBack, finish);
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
            AbstractC9979u.m20293f(bitmap, "bitmap");
            addAdapterImage$default(this, bitmap, this.viewGroup.getWidth(), this.viewGroup.getHeight(), 0, 23, (InterfaceC9540l) null, (String) null, (InterfaceC9540l) null, 224, (Object) null);
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
        AbstractC9979u.m20294g(event, "event");
        EzyDrawBoard.ActionTouchEvent.TouchEvent touchEventEvent2MotionEvent = EventConvertUtils.Companion.event2MotionEvent(event, this.cameraInvertMatrix);
        if (touchEventEvent2MotionEvent != null) {
            this.actionExecute.onTouchEvent(touchEventEvent2MotionEvent);
        }
    }

    public final void prevAction() {
        this.actionExecute.onPrevActionEvent(this.actionRecord.buildPrevActionData(System.currentTimeMillis()));
    }

    public final void reset(boolean z10) {
        this.actionFactory.reset();
        this.actionExecute.reset();
        this.graphControl.reset();
        this.audioControl.reset();
        if (z10) {
            Iterator it = AbstractC10669q.m22580r(AbstractC5429h.m2926j(new File(this.sketchConfig.getSourcePath()), null, 1, null), new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.reset.1
                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(File it2) {
                    AbstractC9979u.m20294g(it2, "it");
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
        AbstractC9979u.m20294g(mode, "mode");
        this.actionExecute.onActionModeEvent(this.actionRecord.buildModeConfig(System.currentTimeMillis(), mode));
    }

    public final void setDrawConfig(Integer num, RectF rectF) {
        if (rectF != null) {
            RectF rectF2 = new RectF();
            Matrix matrix = new Matrix();
            matrix.postConcat(this.cameraInvertMatrix);
            matrix.postConcat(GraphExtKt.inverts(this.graphControl.getRootGraph().getMatrix()));
            matrix.mapRect(rectF2, rectF);
            GraphSnapshot.PointF pointFBuild = GraphSnapshot.PointF.newBuilder().setX(rectF2.left).setY(rectF2.top).build();
            GraphSnapshot.PointF pointFBuild2 = GraphSnapshot.PointF.newBuilder().setX(rectF2.right).setY(rectF2.bottom).build();
            float[] fArr = new float[9];
            this.graphControl.getRootGraph().getMatrix().getValues(fArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < 9; i10++) {
                arrayList.add(Float.valueOf(fArr[i10]));
            }
            this.actionExecute.onDrawConfigEvent(this.actionRecord.buildDrawConfig(System.currentTimeMillis(), num, EzyDrawBoard.DrawArea.newBuilder().setLeftTopPoint(pointFBuild).setRightBottomPoint(pointFBuild2).addAllMatrix(arrayList).build()));
        }
    }

    public final void setGraphConfig(EzyDrawBoard.ActionGraphConfig.GraphConfig config) {
        AbstractC9979u.m20294g(config, "config");
        this.actionExecute.onGraphConfigEvent(this.actionRecord.buildGraphConfig(System.currentTimeMillis(), config));
    }

    public final void setGraphMatrixListener(GraphMatrixListener graphMatrixListener) {
        this.graphControl.setGraphMatrixListener(graphMatrixListener);
    }

    public final void setImageDeleteListener(ImageDeleteListener imageDeleteListener) {
        this.graphControl.setImageDeleteListener(imageDeleteListener);
    }

    public final void startAudio() {
        synchronized (this.audioControl) {
            this.audioControl.startRecord(this.graphControl.getBaseAudioPath());
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final void stopAudio() {
        synchronized (this.audioControl) {
            this.audioControl.stopRecord();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    public final Bitmap thumbnail(int i10, int i11) {
        Bitmap bitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(this.graphControl.getBackgroundColor());
        EzyDrawBoard.DrawArea drawArea = this.graphControl.getDrawArea();
        if (drawArea != null) {
            RectF rectF = new RectF();
            this.graphControl.getRootGraph().getMatrix().mapRect(rectF, new RectF(drawArea.getLeftTopPoint().getX(), drawArea.getLeftTopPoint().getY(), drawArea.getRightBottomPoint().getX(), drawArea.getRightBottomPoint().getY()));
            canvas.clipRect(rectF);
        }
        this.graphControl.getRootGraph().onDrawComplete(canvas, new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.thumbnail.2
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(Graph it) {
                AbstractC9979u.m20294g(it, "it");
                return Boolean.TRUE;
            }
        });
        AbstractC9979u.m20293f(bitmap, "bitmap");
        return bitmap;
    }

    public final boolean translation(Float f10, Float f11, boolean z10) {
        return this.actionExecute.onTranslation(this.actionRecord.buildTranslation(System.currentTimeMillis(), f10, f11, z10));
    }

    public final boolean zoom(float f10, float f11, float f12, float f13, boolean z10) {
        return this.actionExecute.onZoom(this.actionRecord.buildZoomActionData(System.currentTimeMillis(), f10, f11, f12, f13, z10));
    }

    public static /* synthetic */ void addAdapterImage$default(RecordControl recordControl, String str, int i10, int i11, int i12, int i13, InterfaceC9540l interfaceC9540l, String str2, InterfaceC9540l interfaceC9540l2, int i14, Object obj) throws Throwable {
        String strM23238K;
        if ((i14 & 64) != 0) {
            String string = UUID.randomUUID().toString();
            AbstractC9979u.m20293f(string, "randomUUID().toString()");
            strM23238K = AbstractC10819z.m23238K(string, "-", "", false, 4, null);
        } else {
            strM23238K = str2;
        }
        recordControl.addAdapterImage(str, i10, i11, i12, i13, interfaceC9540l, strM23238K, (i14 & 128) != 0 ? new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl.addAdapterImage.3
            public final void invoke(String str3) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                invoke((String) obj2);
                return C10786q.f26013a;
            }
        } : interfaceC9540l2);
    }

    public final void addAdapterImage(String path, int i10, int i11, int i12, int i13, InterfaceC9540l interfaceC9540l, String imageName, InterfaceC9540l pathCallBack) throws Throwable {
        InterfaceC9540l callBack = interfaceC9540l;
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(callBack, "callBack");
        AbstractC9979u.m20294g(imageName, "imageName");
        AbstractC9979u.m20294g(pathCallBack, "pathCallBack");
        Graph rootGraph = this.graphControl.getRootGraph();
        String name = ImageGraph.class.getName();
        AbstractC9979u.m20293f(name, "ImageGraph::class.java.name");
        if (rootGraph.childTypeNumber(name) >= this.sketchConfig.getMaxImageCount()) {
            Context context = this.context;
            ToastUtils.showShort(context, context.getString(C8705R.string.tips_max_image, Integer.valueOf(this.sketchConfig.getMaxImageCount())));
            callBack.invoke(null);
            pathCallBack.invoke(null);
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            FileUtils.Companion companion = FileUtils.Companion;
            String strMd5HashCode = companion.Md5HashCode(file);
            File file2 = new File(this.graphControl.getBaseImagePath());
            if (file2.exists()) {
                for (File file3 : AbstractC10669q.m22580r(AbstractC5429h.m2926j(file2, null, 1, null), new InterfaceC9540l() { // from class: com.zykj.sketch.core.record.RecordControl$addAdapterImage$4$1$1
                    @Override // p181hd.InterfaceC9540l
                    public final Boolean invoke(File filterFile) {
                        AbstractC9979u.m20294g(filterFile, "filterFile");
                        return Boolean.valueOf(filterFile.isFile());
                    }
                })) {
                    if (AbstractC10819z.m23231D(FileUtils.Companion.Md5HashCode(file3), strMd5HashCode, false, 2, null)) {
                        String absolutePath = file3.getAbsolutePath();
                        AbstractC9979u.m20293f(absolutePath, "imageFile.absolutePath");
                        addImage(absolutePath, i10, i11, i12, i13, callBack);
                        pathCallBack.invoke(file3.getAbsolutePath());
                        return;
                    }
                    callBack = interfaceC9540l;
                }
                String str = file2.getAbsolutePath() + File.separator + imageName + ".jpg";
                FileUtils.Companion.copyFileUsingFileChannels(file, new File(str));
                addImage(str, i10, i11, i12, i13, interfaceC9540l);
                pathCallBack.invoke(str);
                return;
            }
            String str2 = file2.getAbsolutePath() + File.separator + imageName + ".jpg";
            companion.copyFileUsingFileChannels(file, new File(str2));
            addImage(str2, i10, i11, i12, i13, interfaceC9540l);
            pathCallBack.invoke(str2);
            return;
        }
        callBack.invoke(null);
    }
}
