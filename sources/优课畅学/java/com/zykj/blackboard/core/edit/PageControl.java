package com.zykj.blackboard.core.edit;

// RE note 管理 Blackboard 页面编辑状态及页面快照。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.ITouchAction;
import com.zykj.blackboard.core.action.MoveAction;
import com.zykj.blackboard.core.action.SelectAction;
import com.zykj.blackboard.core.action.TextAction;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.record.ITimeRecord;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.listener.GraphDeleteListener;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.MicroPhoneListener;
import com.zykj.blackboard.listener.RecordListener;
import com.zykj.blackboard.listener.WithdrawListener;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.OutOfMaxImageCountException;
import com.zykj.blackboard.utils.ProtoFileUtils;
import com.zykj.blackboard.utils.TextGraphUtils;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9116d0;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes4.dex */
public final class PageControl extends BasePageControl {
    public /* synthetic */ PageControl(BoardControl boardControl, RenderLayer renderLayer, PageEntity pageEntity, int i10, AbstractC9126n abstractC9126n) {
        this(boardControl, renderLayer, (i10 & 4) != 0 ? null : pageEntity);
    }

    private final ImageGraph addImageGraphFromLocal(File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z10) {
        String fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, file, null, 2, null);
        if (fileSignature$default == null) {
            return null;
        }
        String absolutePath = file.getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "localFile.absolutePath");
        Float[] wHFromLocalByType = PageControlExtKt.getWHFromLocalByType(this, absolutePath, scaleTypeEnum, num, num2);
        String name = file.getName();
        AbstractC9133u.m16132f(name, "localFile.name");
        ImageGraph imageGraphBuildImageGraph = buildImageGraph(name, fileSignature$default, wHFromLocalByType[0].floatValue(), wHFromLocalByType[1].floatValue(), PageControlExtKt.getTranslateMatrix$default(this, wHFromLocalByType[0].floatValue(), wHFromLocalByType[1].floatValue(), positionEnum, 0, 8, null), z10);
        saveSnapshot();
        return imageGraphBuildImageGraph;
    }

    public static /* synthetic */ ImageGraph addImageGraphFromLocal$default(PageControl pageControl, File file, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, Integer num, Integer num2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return pageControl.addImageGraphFromLocal(file, positionEnum, scaleTypeEnum, num, num2, z10);
    }

    private final ImageGraph buildImageGraph(String str, String str2, float f10, float f11, Matrix matrix, boolean z10) {
        CommandInfoEntity commandInfoEntityAddCommand;
        String strRootGraphId = getGraphControl().rootGraphId();
        if (strRootGraphId == null || (commandInfoEntityAddCommand = getRouterRecord().getCommandRecord().addCommand(strRootGraphId, str, EzyGraphEnum.GraphEnum.IMAGE_GRAPH, str2, (int) f10, (int) f11, System.currentTimeMillis(), getBoardControl().getConfig().isImageBackground())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandInfoEntityAddCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9133u.m16132f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, getSourceLoad());
        if (graph == null) {
            return null;
        }
        Matrix matrix2 = new Matrix(matrix);
        if (!z10) {
            matrix2.postConcat(MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()));
        }
        getActionManager().transformGraphEvent(AbstractC8809v.m14764g(graph), AbstractC8809v.m14776s(MatrixExtKt.toEzyMatrix(matrix2, System.currentTimeMillis())));
        graph.concatMatrix(matrix2);
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.WRITE_NEW_GROUP);
        if (getBoardControl().getConfig().isImageBackground()) {
            GraphControl graphControl = getGraphControl();
            AbstractC9133u.m16131e(graph, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
            graphControl.addImageGraph((ImageGraph) graph);
        } else {
            getGraphControl().addGraph(graphData.m7764w(), graph);
        }
        String absolutePath = new File(SourceRouterRecord.Companion.getResPath(getPagePath(), DocumentType.IMAGE), str).getAbsolutePath();
        if (isRecording()) {
            getRecordingImageList().add(absolutePath);
        } else {
            getNoRecordingImageList().add(absolutePath);
        }
        AbstractC9133u.m16131e(graph, "null cannot be cast to non-null type com.zykj.blackboard.core.graph.group.ImageGraph");
        return (ImageGraph) graph;
    }

    public static /* synthetic */ ImageGraph buildImageGraph$default(PageControl pageControl, String str, String str2, float f10, float f11, Matrix matrix, boolean z10, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        return pageControl.buildImageGraph(str, str2, f10, f11, matrix, z10);
    }

    private final Matrix calculateMatrixForSpecial(float f10, float f11) {
        float fMax;
        List<IGraph> childGraph;
        float fMin = Math.min(f10, getBoardControl().getConfig().getWidth());
        float f12 = fMin / f10;
        float f13 = (f11 * fMin) / f10;
        Matrix matrix = new Matrix();
        matrix.setScale(f12, f12);
        matrix.postConcat(PageControlExtKt.getTranslateMatrix$default(this, fMin, f13, EzyPositionEnum.PositionEnum.TOP_CENTER, 0, 8, null));
        IGraph iGraphRootGraph = getGraphControl().rootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            fMax = 0.0f;
        } else {
            fMax = 0.0f;
            for (IGraph iGraph : childGraph) {
                if (iGraph instanceof ImageGraph) {
                    fMax = Math.max(iGraph.getRenderRectF().bottom, fMax);
                }
            }
        }
        matrix.postTranslate(0.0f, fMax);
        return matrix;
    }

    private final float safeCountProgress(float f10) {
        if (f10 > 1.0f) {
            return 1.0f;
        }
        if (f10 < 0.0f) {
            return 0.0f;
        }
        return f10;
    }

    private final void saveData(InterfaceC10559a interfaceC10559a) throws Throwable {
        List<IGraph> childGraph;
        if (isRecording()) {
            stopRecord();
        }
        Bitmap bitmap = (Bitmap) interfaceC10559a.invoke();
        if (bitmap != null) {
            ProtoFileUtils.Companion.createBitmapFile(getPagePath(), BasePageControl.SCREENSHOT_FILE_NAME, bitmap);
        }
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotSnapshot = getGraphControl().snapshot();
        if (graphSnapshotSnapshot != null) {
            EzyPageSnapshot.PageSnapshot.C7230b c7230bM8345k = EzyPageSnapshot.PageSnapshot.m8345k();
            c7230bM8345k.m8463z(graphSnapshotSnapshot);
            c7230bM8345k.m8461x(MatrixExtKt.toEzyMatrix(getMatrixAdapter().getCameraMatrix(), 0L));
            StringBuilder sb = new StringBuilder();
            sb.append("[PageControl]:saveData -> [");
            sb.append(getFileName());
            sb.append("] s:");
            sb.append(graphSnapshotSnapshot.getChildGraphList().size());
            sb.append(", g:");
            IGraph iGraphRootGraph = getGraphControl().rootGraph();
            sb.append((iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) ? null : Integer.valueOf(childGraph.size()));
            sb.append("cm:");
            sb.append(c7230bM8345k.m8449l().getScaleX());
            AbstractC5380q.m2623s(sb.toString());
            ProtoFileUtils.Companion companion = ProtoFileUtils.Companion;
            String pagePath = getPagePath();
            EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c7230bM8345k.build();
            AbstractC9133u.m16132f(pageSnapshotBuild, "builder.build()");
            companion.createPageSnapshotFile(pagePath, BasePageControl.SNAPSHOT_FILE_NAME, pageSnapshotBuild);
        }
        HeaderEntity headerEntity = (HeaderEntity) getPageEntity().getHeaderEntity().m15511c();
        if (headerEntity != null) {
            headerEntity.setUpdateDate(System.currentTimeMillis());
            headerEntity.setDuration(getTimeRecord().getTime(System.currentTimeMillis()));
            headerEntity.setDefaultBackgroundColor(getGraphControl().getDefaultBackgroundColor());
            headerEntity.setLastBackgroundColor(getGraphControl().getBackgroundColor());
            ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig = headerEntity.getDefaultBackgroundLineConfig();
            BackgroundLineConfigEntity entity = ConvertExtKt.toEntity(getGraphControl().getDefaultBackgroundLineConfig());
            entity.put();
            defaultBackgroundLineConfig.m15518k(entity);
            ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig = headerEntity.getLastBackgroundLineConfig();
            BackgroundLineConfigEntity entity2 = ConvertExtKt.toEntity(getGraphControl().getBackgroundLineConfig());
            entity2.put();
            lastBackgroundLineConfig.m15518k(entity2);
            ToOne<MoveConfigEntity> moveConfig = headerEntity.getMoveConfig();
            MoveConfigEntity entity3 = ConvertExtKt.toEntity(getBoardControl().getConfig().getMoveActionConfig());
            entity3.put();
            moveConfig.m15518k(entity3);
            headerEntity.put();
        }
        if (getPageEntity().isChange()) {
            getPageEntity().setChange(false);
            getPageEntity().setCommandFileName("");
            getPageEntity().setCommandIndex(-1);
            getPageEntity().put();
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addEventListener(EventListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getRouterRecord().getCommandRecord().registerEventListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addGraphDeleteListener(GraphDeleteListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getActionManager().getMGraphDeleteListenerList().add(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public ImageGraph addImage(String path, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z10) throws Throwable {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(position, "position");
        AbstractC9133u.m16133g(scaleType, "scaleType");
        if (getImageGraphCount() >= getBoardControl().getConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileSaveFileToLocal = PageControlExtKt.saveFileToLocal(this, path);
        if (fileSaveFileToLocal == null) {
            return null;
        }
        return addImageGraphFromLocal$default(this, fileSaveFileToLocal, position, scaleType, null, null, z10, 24, null);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public List<ImageGraph> addImageList(List<String> pathList, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum) throws Throwable {
        String fileSignature$default;
        AbstractC9133u.m16133g(pathList, "pathList");
        EzyPositionEnum.PositionEnum position = positionEnum;
        AbstractC9133u.m16133g(position, "position");
        EzyScaleTypeEnum.ScaleTypeEnum scaleType = scaleTypeEnum;
        AbstractC9133u.m16133g(scaleType, "scaleType");
        ArrayList arrayList = new ArrayList();
        int size = pathList.size();
        int i10 = 0;
        while (i10 < size) {
            String str = pathList.get(i10);
            if (getImageGraphCount() >= getBoardControl().getConfig().getMaxImageSize()) {
                throw new OutOfMaxImageCountException();
            }
            File fileSaveFileToLocal = PageControlExtKt.saveFileToLocal(this, str);
            if (fileSaveFileToLocal == null || (fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, fileSaveFileToLocal, null, 2, null)) == null) {
                return arrayList;
            }
            String absolutePath = fileSaveFileToLocal.getAbsolutePath();
            AbstractC9133u.m16132f(absolutePath, "newFile.absolutePath");
            Float[] wHFromLocalByType$default = PageControlExtKt.getWHFromLocalByType$default(this, absolutePath, scaleType, null, null, 12, null);
            Matrix translateMatrix$default = PageControlExtKt.getTranslateMatrix$default(this, wHFromLocalByType$default[0].floatValue(), wHFromLocalByType$default[1].floatValue(), position, 0, 8, null);
            float multiImageOffset = getBoardControl().getConfig().getMultiImageOffset() * i10;
            translateMatrix$default.postTranslate(multiImageOffset, multiImageOffset);
            String name = fileSaveFileToLocal.getName();
            AbstractC9133u.m16132f(name, "newFile.name");
            ImageGraph imageGraphBuildImageGraph$default = buildImageGraph$default(this, name, fileSignature$default, wHFromLocalByType$default[0].floatValue(), wHFromLocalByType$default[1].floatValue(), translateMatrix$default, false, 32, null);
            if (imageGraphBuildImageGraph$default != null) {
                arrayList.add(imageGraphBuildImageGraph$default);
            }
            i10++;
            position = positionEnum;
            scaleType = scaleTypeEnum;
        }
        saveSnapshot();
        return arrayList;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addRenderRectChangeListener(RenderChangeListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getGraphControl().registerRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public ImageGraph addSpecialImage(String path) throws Throwable {
        String fileSignature$default;
        AbstractC9133u.m16133g(path, "path");
        if (getImageGraphCount() >= getBoardControl().getConfig().getMaxImageSize()) {
            throw new OutOfMaxImageCountException();
        }
        File fileSaveFileToLocal = PageControlExtKt.saveFileToLocal(this, path);
        if (fileSaveFileToLocal == null || (fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, fileSaveFileToLocal, null, 2, null)) == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        if (getGraphControl().rootGraph() == null) {
            return null;
        }
        String name = fileSaveFileToLocal.getName();
        AbstractC9133u.m16132f(name, "newFile.name");
        Matrix matrixCalculateMatrixForSpecial = calculateMatrixForSpecial(f10, f11);
        matrixCalculateMatrixForSpecial.postConcat(getMatrixAdapter().getCameraMatrix());
        C8736p c8736p = C8736p.f16368a;
        ImageGraph imageGraphBuildImageGraph$default = buildImageGraph$default(this, name, fileSignature$default, f10, f11, matrixCalculateMatrixForSpecial, false, 32, null);
        saveSnapshot();
        return imageGraphBuildImageGraph$default;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public TextGraph addText(String content, EzyPositionEnum.PositionEnum position, int i10) {
        CommandInfoEntity commandInfoEntityAddTextGraphCommand;
        AbstractC9133u.m16133g(content, "content");
        AbstractC9133u.m16133g(position, "position");
        Paint paint = new Paint();
        paint.setColor(getBoardControl().getConfig().getAddTextOriginalTextColor());
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(getBoardControl().getConfig().getAddTextOriginalTextSize());
        paint.setDither(true);
        paint.setAntiAlias(true);
        float fWidth = getBoardControl().getConfig().getAddTextRectF().width();
        float fHeight = getBoardControl().getConfig().getAddTextRectF().height();
        float size = (paint.getFontMetrics().bottom - paint.getFontMetrics().top) * TextGraphUtils.INSTANCE.calculateTextToList(content, paint, fWidth).size();
        float f10 = size > fHeight ? size : fHeight;
        String strRootGraphId = getGraphControl().rootGraphId();
        if (strRootGraphId == null || (commandInfoEntityAddTextGraphCommand = getRouterRecord().getCommandRecord().addTextGraphCommand(strRootGraphId, fWidth, f10, GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandInfoEntityAddTextGraphCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9133u.m16132f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, getSourceLoad());
        if (graph == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postConcat(PageControlExtKt.getTranslateMatrix(this, fWidth, f10, position, i10));
        matrix.postConcat(MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()));
        getActionManager().transformGraphEvent(AbstractC8809v.m14764g(graph), AbstractC8809v.m14776s(MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis())));
        graph.concatMatrix(matrix);
        getGraphControl().addGraph(strRootGraphId, graph);
        return (TextGraph) graph;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void addWithdrawListener(WithdrawListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getHistoryControl().addWithdrawListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void areaMoveEnd(Float f10, Float f11) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            ((MoveAction) currentAction).areaMovEnd(f10, f11);
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void areaMoveStart() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            ((MoveAction) currentAction).areaMoveStart();
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void areaMoving(Float f10, Float f11) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            ((MoveAction) currentAction).areaMoving(f10, f11);
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean canSave() {
        return getActionManager().getModeFactory().getWritingAction$blackboard_release().executorsTaskDone() && getRouterRecord().getCanSave();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void changeImageOriginRect(ImageGraph graph, RectF newRectF) {
        AbstractC9133u.m16133g(graph, "graph");
        AbstractC9133u.m16133g(newRectF, "newRectF");
        IActionListener.DefaultImpls.changeGraph$default(getActionManager(), graph, EzyGraphEnum.GraphEnum.IMAGE_GRAPH, newRectF, null, null, null, null, null, 248, null);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean changeTextColor(int i10) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof TextAction) {
            return ((TextAction) currentAction).changeTextColor(i10);
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean changeTextSize(float f10) {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof TextAction) {
            return ((TextAction) currentAction).changeTextSize(f10);
        }
        return false;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void cleanPage(IGraph iGraph) {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().rootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : childGraph) {
            if (!AbstractC9133u.m16128b((IGraph) obj, iGraph)) {
                arrayList.add(obj);
            }
        }
        getActionManager().deleteGraphEvent(arrayList, System.currentTimeMillis());
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        getGraphControl().delete(AbstractC9116d0.m16094c(arrayList));
        saveSnapshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void clearHistoryList() {
        getHistoryControl().clearHistoryList();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void clearHistoryListWithoutCurrent() {
        getHistoryControl().clearHistoryListWithoutCurrent();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public int getBackgroundColor() {
        return getGraphControl().getBackgroundColor();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public BackgroundLineConfig getBackgroundLineConfig() {
        return getGraphControl().getBackgroundLineConfig();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public IGraph getFirstGraph() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().rootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return null;
        }
        return (IGraph) AbstractC8778f0.m14568n0(childGraph);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public int getGroupGraphSize() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().rootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return 0;
        }
        return childGraph.size();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public int getImageGraphCount() {
        return getGraphControl().getImageGraphCount();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public float getMoveHorizontalProgress() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        if (currentAction instanceof MoveAction) {
            return ((MoveAction) currentAction).getHorizontalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public float getMoveVerticalProgress() {
        ITouchAction currentAction = getActionManager().getCurrentAction();
        Log.i("MoveProgress", String.valueOf(currentAction));
        if (currentAction instanceof MoveAction) {
            return ((MoveAction) currentAction).getVerticalProgress();
        }
        return 0.0f;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public List<String> getNoRecordImagePathList() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().rootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return AbstractC8809v.m14771n();
        }
        ArrayList<ImageGraph> arrayList = new ArrayList();
        for (Object obj : childGraph) {
            if (obj instanceof ImageGraph) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(arrayList, 10));
        for (ImageGraph imageGraph : arrayList) {
            if (imageGraph.getFilePath() == null) {
                imageGraph.initPath();
            }
            String filePath = imageGraph.getFilePath();
            if (filePath == null) {
                filePath = "";
            }
            arrayList2.add(filePath);
        }
        return arrayList2;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public List<String> getPageImagePathList() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getNoRecordingImageList());
        arrayList.addAll(getRecordingImageList());
        return arrayList;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public RectF getRenderRect() {
        return getMatrixAdapter().getAdapterRectF();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public float getZoomLevel() {
        return MatrixExtKt.getScaleX(getMatrixAdapter().getCameraMatrix());
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean isMicroTurnOn() {
        return getAudioControl().isMicroTurnOn();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean isPageNotEmpty() {
        List<IGraph> childGraph;
        IGraph iGraphRootGraph = getGraphControl().rootGraph();
        return (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null || !(childGraph.isEmpty() ^ true)) ? false : true;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean isRecording() {
        return getTimeRecord().isRecord();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public Bitmap minScreenshot(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, IGraph iGraph) {
        return getGraphControl().minScreenShot(i10, i11, i12, i13, z10, z11, z12, iGraph);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void newSelectGraph(List<String> graphIdList) {
        AbstractC9133u.m16133g(graphIdList, "graphIdList");
        getBoardControl().getConfig().setMode(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
        ITouchAction currentAction = getActionManager().getCurrentAction();
        AbstractC9133u.m16131e(currentAction, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction");
        ((NewSelectAction) currentAction).selectGraphList(graphIdList);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void onTouchEvent(MotionEvent motionEvent) {
        AbstractC9133u.m16133g(motionEvent, "motionEvent");
        getActionManager().handleTouchEvent(motionEvent);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean recover() {
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        HistoryData historyDataRecover = getHistoryControl().recover();
        if (historyDataRecover == null) {
            return false;
        }
        getRouterRecord().getCommandRecord().rebuild(historyDataRecover.getRootGraph(), historyDataRecover.getBackgroundColor(), System.currentTimeMillis());
        return true;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeEventListener(EventListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getRouterRecord().getCommandRecord().unRegisterEventListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeGraphDeleteListener(GraphDeleteListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getActionManager().getMGraphDeleteListenerList().remove(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeRenderRectChangeListener(RenderChangeListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getGraphControl().unRegisterRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void removeWithdrawListener(WithdrawListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getHistoryControl().removeWithdrawListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void save() throws Throwable {
        saveData(new InterfaceC10559a() { // from class: com.zykj.blackboard.core.edit.PageControl.save.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Bitmap invoke() {
                return PageControl.this.getGraphControl().screenshot();
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void saveWithContentThumbnail() throws Throwable {
        saveData(new InterfaceC10559a() { // from class: com.zykj.blackboard.core.edit.PageControl.saveWithContentThumbnail.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public final Bitmap invoke() {
                return PageControl.this.getGraphControl().contentThumbnail();
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public Bitmap screenshot() {
        return getGraphControl().screenshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void selectedGraph(String graphId) {
        AbstractC9133u.m16133g(graphId, "graphId");
        getBoardControl().getConfig().setMode(EzyModeEnum.ModeEnum.ACTION_SELECT);
        ITouchAction currentAction = getActionManager().getCurrentAction();
        AbstractC9133u.m16131e(currentAction, "null cannot be cast to non-null type com.zykj.blackboard.core.action.SelectAction");
        ((SelectAction) currentAction).selectGraphList(AbstractC8809v.m14764g(graphId));
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setAreaMoveListener(IAreaMoveListener iAreaMoveListener) {
        getActionManager().setMAreaMoveListener(iAreaMoveListener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setBackgroundColor(int i10) {
        int backgroundColor = getGraphControl().getBackgroundColor();
        if (backgroundColor != i10) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        getGraphControl().updateBackgroundColor(i10);
        getGraphControl().reDrawFixView();
        BackgroundLineConfig backgroundLineConfig = getGraphControl().getBackgroundLineConfig();
        getRouterRecord().getCommandRecord().addConfigCommand(backgroundColor, i10, backgroundLineConfig, backgroundLineConfig, System.currentTimeMillis());
        HeaderEntity headerEntity = (HeaderEntity) getPageEntity().getHeaderEntity().m15511c();
        if (headerEntity != null) {
            headerEntity.setLastBackgroundColor(i10);
            headerEntity.put();
        }
        saveSnapshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setBackgroundColorWithLineConfig(int i10, BackgroundLineConfig backgroundLineConfig) throws IllegalAccessException, IllegalArgumentException { // 配置命令两次写入新底色，线条配置分别取修改前和修改后的值。
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        int backgroundColor = getGraphControl().getBackgroundColor();
        BackgroundLineConfig backgroundLineConfig2 = getGraphControl().getBackgroundLineConfig();
        if (backgroundColor != i10 || !AbstractC9133u.m16128b(backgroundLineConfig2, backgroundLineConfig)) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        getGraphControl().updateBackgroundColor(i10);
        getGraphControl().updateBackgroundLineConfig(backgroundLineConfig);
        getGraphControl().reDrawFixView();
        getRouterRecord().getCommandRecord().addConfigCommand(i10, i10, backgroundLineConfig2, backgroundLineConfig, System.currentTimeMillis());
        HeaderEntity headerEntity = (HeaderEntity) getPageEntity().getHeaderEntity().m15511c();
        if (headerEntity != null) {
            headerEntity.setLastBackgroundColor(i10);
            ToOne<BackgroundLineConfigEntity> lastBackgroundLineConfig = headerEntity.getLastBackgroundLineConfig();
            BackgroundLineConfigEntity entity = ConvertExtKt.toEntity(backgroundLineConfig);
            entity.put();
            lastBackgroundLineConfig.m15518k(entity);
            headerEntity.put();
        }
        saveSnapshot();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setGeometryCreateListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getActionManager().setMGeometryCreateListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setMicroPhoneListener(MicroPhoneListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        getAudioControl().setListener(listener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setRecordListener(RecordListener recordListener) {
        AbstractC9133u.m16133g(recordListener, "recordListener");
        getTimeRecord().setListener(recordListener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setTextSelectListener(ITextSelectListener iTextSelectListener) {
        getActionManager().setMTextSelectListener(iTextSelectListener);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void setVisibleAreaProgress(Float f10, Float f11) {
        RectF adapterRectF = getMatrixAdapter().getAdapterRectF();
        BoardConfig config = getBoardControl().getConfig();
        float fWidth = adapterRectF.width() - config.getWidth();
        float fHeight = adapterRectF.height() - config.getHeight();
        Float fValueOf = null;
        Float fValueOf2 = (f10 == null || adapterRectF.width() <= ((float) config.getWidth())) ? null : Float.valueOf(fWidth * (safeCountProgress((-adapterRectF.left) / fWidth) - safeCountProgress(f10.floatValue())));
        if (f11 != null && adapterRectF.height() > config.getHeight()) {
            fValueOf = Float.valueOf(fHeight * (safeCountProgress((-adapterRectF.top) / fHeight) - safeCountProgress(f11.floatValue())));
        }
        Matrix cameraMatrix = getMatrixAdapter().getCameraMatrix();
        getMatrixAdapter().postCameraTranslate(fValueOf2, fValueOf);
        setCameraEvent(MatrixExtKt.toEzyMatrix(cameraMatrix, 0L), MatrixExtKt.toEzyMatrix(getMatrixAdapter().getCameraMatrix(), 0L));
        getGraphControl().reDrawFixView();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void startRecord(boolean z10) {
        getTimeRecord().startRecord(System.currentTimeMillis());
        if (z10) {
            turnOnMicro();
        }
        getRecordingImageList().addAll(getNoRecordingImageList());
        getNoRecordingImageList().clear();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void stopRecord() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        if (isMicroTurnOn()) {
            turnOffMicro();
        }
        getRouterRecord().getCommandRecord().stopRecord(ITimeRecord.DefaultImpls.getDelayTime$default(getTimeRecord(), System.currentTimeMillis(), false, 2, null));
        getTimeRecord().stopRecord(System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void turnOffMicro() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        getAudioControl().stopRecord(new InterfaceC10574p() { // from class: com.zykj.blackboard.core.edit.PageControl.turnOffMicro.1
            {
                super(2);
            }

            @Override // p300x7.InterfaceC10574p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((String) obj, ((Number) obj2).longValue());
                return C8736p.f16368a;
            }

            public final void invoke(String fileName, long j10) {
                AbstractC9133u.m16133g(fileName, "fileName");
                PageControl.this.getRouterRecord().getAudioRecord().updateAudio(fileName, j10);
            }
        });
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void turnOnMicro() {
        if (isRecording()) {
            getAudioControl().startRecord(new InterfaceC10570l() { // from class: com.zykj.blackboard.core.edit.PageControl.turnOnMicro.1
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((String) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(String fileName) {
                    AbstractC9133u.m16133g(fileName, "fileName");
                    PageControl.this.getRouterRecord().getAudioRecord().addAudio(fileName, 0L, System.currentTimeMillis());
                }
            });
        }
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public boolean withdraw() {
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        HistoryData historyDataWithDraw = getHistoryControl().withDraw();
        if (historyDataWithDraw == null) {
            return false;
        }
        getRouterRecord().getCommandRecord().rebuild(historyDataWithDraw.getRootGraph(), historyDataWithDraw.getBackgroundColor(), System.currentTimeMillis());
        return true;
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public void zoomLevel(float f10, float f11, float f12) {
        Matrix matrix = new Matrix(getMatrixAdapter().getCameraMatrix());
        float scaleX = MatrixExtKt.getScaleX(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.postScale(scaleX, scaleX, f10, f11);
        matrix.postConcat(MatrixExtKt.invert(matrix2));
        matrix.postScale(f12, f12, f10, f11);
        Matrix cameraMatrix = getMatrixAdapter().getCameraMatrix();
        getMatrixAdapter().setCameraMatrix(matrix);
        setCameraEvent(MatrixExtKt.toEzyMatrix(cameraMatrix, 0L), MatrixExtKt.toEzyMatrix(getMatrixAdapter().getCameraMatrix(), 0L));
        EventBus eventBus = EventBus.INSTANCE;
        eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
        eventBus.post(EventKey.WRITE_NEW_GROUP);
        getGraphControl().reDrawFixView();
        getGraphControl().updateBackgroundMatrix();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageControl(BoardControl boardControl, RenderLayer renderLayer, PageEntity pageEntity) {
        super(boardControl, renderLayer, pageEntity);
        AbstractC9133u.m16133g(boardControl, "boardControl");
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public ImageGraph addImage(Bitmap bitmap, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z10, boolean z11) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        AbstractC9133u.m16133g(position, "position");
        AbstractC9133u.m16133g(scaleType, "scaleType");
        return addImage(bitmap, "", position, scaleType, z10, z11);
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public ImageGraph addImage(Bitmap bitmap, String filename, EzyPositionEnum.PositionEnum position, EzyScaleTypeEnum.ScaleTypeEnum scaleType, boolean z10, boolean z11) throws OutOfMaxImageCountException {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        AbstractC9133u.m16133g(filename, "filename");
        AbstractC9133u.m16133g(position, "position");
        AbstractC9133u.m16133g(scaleType, "scaleType");
        if (getImageGraphCount() < getBoardControl().getConfig().getMaxImageSize()) {
            File fileSaveBitmapToLocal = PageControlExtKt.saveBitmapToLocal(this, bitmap, z11, filename);
            if (fileSaveBitmapToLocal == null) {
                return null;
            }
            return addImageGraphFromLocal(fileSaveBitmapToLocal, position, scaleType, Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), z10);
        }
        throw new OutOfMaxImageCountException();
    }

    @Override // com.zykj.blackboard.core.edit.IPageControl
    public ImageGraph addSpecialImage(Bitmap bitmap) throws OutOfMaxImageCountException {
        String fileSignature$default;
        AbstractC9133u.m16133g(bitmap, "bitmap");
        if (getImageGraphCount() < getBoardControl().getConfig().getMaxImageSize()) {
            File fileSaveBitmapToLocal$default = PageControlExtKt.saveBitmapToLocal$default(this, bitmap, false, null, 4, null);
            if (fileSaveBitmapToLocal$default == null || (fileSignature$default = FileValidateUtils.getFileSignature$default(FileValidateUtils.INSTANCE, fileSaveBitmapToLocal$default, null, 2, null)) == null || getGraphControl().rootGraph() == null) {
                return null;
            }
            String name = fileSaveBitmapToLocal$default.getName();
            AbstractC9133u.m16132f(name, "newFile.name");
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            Matrix matrixCalculateMatrixForSpecial = calculateMatrixForSpecial(bitmap.getWidth(), bitmap.getHeight());
            matrixCalculateMatrixForSpecial.postConcat(getMatrixAdapter().getCameraMatrix());
            C8736p c8736p = C8736p.f16368a;
            ImageGraph imageGraphBuildImageGraph$default = buildImageGraph$default(this, name, fileSignature$default, width, height, matrixCalculateMatrixForSpecial, false, 32, null);
            saveSnapshot();
            return imageGraphBuildImageGraph$default;
        }
        throw new OutOfMaxImageCountException();
    }
}
