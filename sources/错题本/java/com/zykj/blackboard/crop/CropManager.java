package com.zykj.blackboard.crop;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.data.SourceLoad;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.blackboard.core.edit.BasePageControl;
import com.zykj.blackboard.core.execute.BaseCommandExecuteFactory;
import com.zykj.blackboard.core.execute.CommandFactory;
import com.zykj.blackboard.core.loader.EntityConvertEzy;
import com.zykj.blackboard.core.loader.SimpleSourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.crop.CropManager;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.exception.FileVerificationException;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.FileUtils;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.ProtoFileUtils;
import com.zykj.board.C4355b0;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyCommandEnum$CommandEnum;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyPageSnapshot$PageSnapshot;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u0018J)\u0010\u001e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R$\u0010.\u001a\u0012\u0012\u0004\u0012\u00020$0,j\b\u0012\u0004\u0012\u00020$`-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0006`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u00068"}, m5110d2 = {"Lcom/zykj/blackboard/crop/CropManager;", "", "", "pagePath", "<init>", "(Ljava/lang/String;)V", "", "commandInfoIndex", "Ld6/s;", "cropCommandByIndex", "([I)V", "", "cropTime", "cropAudioByTime", "(J)V", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "createGraphControl", "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;)Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "sourceFileName", "", "sourceId", "deleteFileEntity", "(Ljava/lang/String;I)V", "deleteTextEntity", "deleteTouchEntity", "deleteMatrixEntity", "Lkotlin/Function1;", "callback", "cropByTime", "(JLr6/c;)V", "time", "calculateRecentTime", "(J)J", "", "", "getCommandDelayTimeList", "()Ljava/util/List;", "Ljava/lang/String;", "rootPath", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "pageEntity", "Lcom/zykj/blackboard/core/data/dao/PageEntity;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "commandDelayTimeList", "Ljava/util/ArrayList;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "commandDelayTimeToIndex", "Ljava/util/HashMap;", "deleteCommandIndexArray", "[I", "stopCommandDelayTime", "J", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CropManager {

    @NotNull
    private final ArrayList<long[]> commandDelayTimeList;

    @NotNull
    private final HashMap<long[], int[]> commandDelayTimeToIndex;

    @NotNull
    private int[] deleteCommandIndexArray;

    @NotNull
    private final PageEntity pageEntity;

    @NotNull
    private final String pagePath;

    @NotNull
    private final String rootPath;
    private long stopCommandDelayTime;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyCommandEnum$CommandEnum.values().length];
            iArr[EzyCommandEnum$CommandEnum.ACTION_GRAPH_ADD.ordinal()] = 1;
            iArr[EzyCommandEnum$CommandEnum.ACTION_CAMERA_MATRIX.ordinal()] = 2;
            iArr[EzyCommandEnum$CommandEnum.ACTION_GRAPH_MATRIX.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CropManager(@NotNull String pagePath) throws FileVerificationException, IOException {
        AbstractC5830k.m5330g(pagePath, "pagePath");
        this.pagePath = pagePath;
        this.commandDelayTimeList = new ArrayList<>();
        this.commandDelayTimeToIndex = new HashMap<>();
        this.deleteCommandIndexArray = new int[2];
        File file = new File(pagePath);
        String parent = file.getParent();
        AbstractC5830k.m5329f(parent, "pageFile.parent");
        this.rootPath = parent;
        String name = file.getName();
        AbstractC5830k.m5329f(name, "pageFile.name");
        PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
        this.pageEntity = pageEntity;
        SourceLoad.INSTANCE.loadPage(parent, pageEntity);
    }

    private final GraphControl createGraphControl(MatrixAdapter matrixAdapter) {
        ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig;
        BackgroundLineConfigEntity target;
        BackgroundLineConfig config;
        GraphControl graphControl = new GraphControl(matrixAdapter, new RenderLayer(new SimpleBackgroundView(this.pageEntity.getHeaderEntity().getTarget().getWidth(), this.pageEntity.getHeaderEntity().getTarget().getHeight()), new SimpleFixView(this.pageEntity.getHeaderEntity().getTarget().getWidth(), this.pageEntity.getHeaderEntity().getTarget().getHeight()), null, null), new BoardConfig(this.pageEntity.getHeaderEntity().getTarget().getWidth(), this.pageEntity.getHeaderEntity().getTarget().getHeight()));
        HeaderEntity target2 = this.pageEntity.getHeaderEntity().getTarget();
        if (target2 != null) {
            graphControl.setDefaultBackgroundColor(target2.getDefaultBackgroundColor());
        }
        HeaderEntity target3 = this.pageEntity.getHeaderEntity().getTarget();
        if (target3 != null && (defaultBackgroundLineConfig = target3.getDefaultBackgroundLineConfig()) != null && (target = defaultBackgroundLineConfig.getTarget()) != null && (config = ConvertExtKt.toConfig(target)) != null) {
            graphControl.setDefaultBackgroundLineConfig(config);
        }
        CommandFactory commandFactory = CommandFactory.INSTANCE;
        int version = this.pageEntity.getHeaderEntity().getTarget().getVersion();
        RecordEntity target4 = this.pageEntity.getRecordEntity().getTarget();
        AbstractC5830k.m5329f(target4, "pageEntity.recordEntity.target");
        SimpleSourceLoader simpleSourceLoader = new SimpleSourceLoader(target4);
        simpleSourceLoader.initPath(this.pagePath);
        BaseCommandExecuteFactory baseCommandExecuteFactoryCreateCommandFactory = commandFactory.createCommandFactory(version, simpleSourceLoader, matrixAdapter, graphControl);
        Iterator<CommandRecordEntity> it = this.pageEntity.getRecordEntity().getTarget().getCommandList().iterator();
        while (it.hasNext()) {
            Iterator<CommandInfoEntity> it2 = it.next().getCommandInfoEntity().iterator();
            while (it2.hasNext()) {
                EzyCommand$CommandSource.CommandInfo commandInfoCommandInfoConvertEzyCommandInfo = EntityConvertEzy.INSTANCE.commandInfoConvertEzyCommandInfo(it2.next());
                if (commandInfoCommandInfoConvertEzyCommandInfo != null) {
                    baseCommandExecuteFactoryCreateCommandFactory.execute(commandInfoCommandInfoConvertEzyCommandInfo);
                }
            }
        }
        return graphControl;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[PHI: r2
      0x00e8: PHI (r2v6 int) = (r2v5 int), (r2v9 int) binds: [B:15:0x008c, B:17:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void cropAudioByTime(long r14) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.crop.CropManager.cropAudioByTime(long):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/crop/CropManager.smali:889
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cropByTime$lambda-4, reason: not valid java name */
    public static final void m13811cropByTime$lambda4(CropManager this$0, long j7, InterfaceC6471c callback) throws Throwable {
        AbstractC5830k.m5330g(this$0, "this$0");
        AbstractC5830k.m5330g(callback, "$callback");
        try {
            long jCalculateRecentTime = this$0.calculateRecentTime(j7);
            this$0.cropCommandByIndex(this$0.deleteCommandIndexArray);
            this$0.cropAudioByTime(jCalculateRecentTime);
            MatrixAdapter matrixAdapter = new MatrixAdapter();
            GraphControl graphControlCreateGraphControl = this$0.createGraphControl(matrixAdapter);
            HeaderEntity target = this$0.pageEntity.getHeaderEntity().getTarget();
            target.setUpdateDate(System.currentTimeMillis());
            target.setDuration(jCalculateRecentTime);
            target.setLastBackgroundColor(graphControlCreateGraphControl.getBackgroundColor());
            BackgroundLineConfigEntity target2 = target.getLastBackgroundLineConfig().getTarget();
            if (target2 != null) {
                BackgroundLineConfig backgroundLineConfig = graphControlCreateGraphControl.getBackgroundLineConfig();
                target2.setLineColor(backgroundLineConfig.getLineColor());
                target2.setLineSpace(backgroundLineConfig.getLineSpace());
                target2.setLineWidth(backgroundLineConfig.getLineWidth());
                target2.setLineType(ConvertExtKt.toEzyBackgroundLineTypeEnum(backgroundLineConfig.getLineType()));
            }
            SourceSave sourceSave = SourceSave.INSTANCE;
            sourceSave.saveHeader(this$0.pageEntity, this$0.rootPath);
            EzyPageSnapshot$PageSnapshot.GraphSnapshot graphSnapshotSnapshot = graphControlCreateGraphControl.snapshot();
            if (graphSnapshotSnapshot != null) {
                C4355b0 c4355b0NewBuilder = EzyPageSnapshot$PageSnapshot.newBuilder();
                c4355b0NewBuilder.m3699k(graphSnapshotSnapshot);
                c4355b0NewBuilder.m3698j(MatrixExtKt.toEzyMatrix(matrixAdapter.getCameraMatrix(), 0L));
                ProtoFileUtils.INSTANCE.createPageSnapshotFile(this$0.pagePath, BasePageControl.SNAPSHOT_FILE_NAME, c4355b0NewBuilder.build());
            }
            Bitmap bitmapScreenshot = graphControlCreateGraphControl.screenshot();
            if (bitmapScreenshot != null) {
                ProtoFileUtils.INSTANCE.createBitmapFile(this$0.pagePath, BasePageControl.SCREENSHOT_FILE_NAME, bitmapScreenshot);
            }
            sourceSave.saveRouter(this$0.pageEntity, this$0.rootPath);
            callback.invoke("");
        } catch (Exception e) {
            callback.invoke(e.toString());
            e.printStackTrace();
        }
    }

    private final void cropCommandByIndex(int[] commandInfoIndex) throws InvalidProtocolBufferException {
        ToMany<CommandRecordEntity> commandList = this.pageEntity.getRecordEntity().getTarget().getCommandList();
        ToMany<CommandInfoEntity> commandInfoEntity = commandList.get(commandInfoIndex[0]).getCommandInfoEntity();
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        int size = commandList.size();
        for (int i8 = commandInfoIndex[0]; i8 < size; i8++) {
            int size2 = commandList.get(i8).getCommandInfoEntity().size();
            for (int i9 = commandInfoIndex[1]; i9 < size2; i9++) {
                CommandInfoEntity commandInfoEntity2 = commandList.get(i8).getCommandInfoEntity().get(i9);
                int i10 = WhenMappings.$EnumSwitchMapping$0[commandInfoEntity2.getCommandEnum().ordinal()];
                if (i10 == 1) {
                    EzyCommand$CommandSource.CommandInfo.GraphData from = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandInfoEntity2.getData());
                    if (from.getGraphEnum() == EzyGraphEnum$GraphEnum.IMAGE_GRAPH && !zArr[0]) {
                        String sourceFileName = from.getSourceFileName();
                        AbstractC5830k.m5329f(sourceFileName, "data.sourceFileName");
                        deleteFileEntity(sourceFileName, from.getSourceId());
                        zArr[0] = true;
                    } else if (from.getGraphEnum() == EzyGraphEnum$GraphEnum.TEXT_GRAPH && !zArr[1]) {
                        String sourceFileName2 = from.getSourceFileName();
                        AbstractC5830k.m5329f(sourceFileName2, "data.sourceFileName");
                        deleteTextEntity(sourceFileName2, from.getSourceId());
                        zArr[1] = true;
                    } else if (from.getGraphEnum() == EzyGraphEnum$GraphEnum.STROKE_GRAPH || (from.getGraphEnum() == EzyGraphEnum$GraphEnum.BEELINE_STROKE_GRAPH && !zArr[2])) {
                        String sourceFileName3 = from.getSourceFileName();
                        AbstractC5830k.m5329f(sourceFileName3, "data.sourceFileName");
                        deleteTouchEntity(sourceFileName3, from.getSourceId());
                        zArr[2] = true;
                    }
                } else if (i10 == 2) {
                    EzyCommand$CommandSource.CommandInfo.CameraMatrix from2 = EzyCommand$CommandSource.CommandInfo.CameraMatrix.parseFrom(commandInfoEntity2.getData());
                    if (!zArr[3]) {
                        String sourceFileName4 = from2.getSourceFileName();
                        AbstractC5830k.m5329f(sourceFileName4, "data.sourceFileName");
                        deleteMatrixEntity(sourceFileName4, from2.getSourceId());
                        zArr[3] = true;
                    }
                } else if (i10 == 3) {
                    EzyCommand$CommandSource.CommandInfo.GraphMatrix from3 = EzyCommand$CommandSource.CommandInfo.GraphMatrix.parseFrom(commandInfoEntity2.getData());
                    if (!zArr[3]) {
                        String sourceFileName5 = from3.getSourceFileName();
                        AbstractC5830k.m5329f(sourceFileName5, "data.sourceFileName");
                        deleteMatrixEntity(sourceFileName5, from3.getSourceId());
                        zArr[3] = true;
                    }
                }
            }
        }
        if (commandInfoIndex[0] + 1 < commandList.size()) {
            int size3 = commandList.size();
            for (int i11 = commandInfoIndex[0] + 1; i11 < size3; i11++) {
                commandList.remove(commandInfoIndex[0] + 1);
            }
        }
        if (commandInfoIndex[1] < commandInfoEntity.size()) {
            int size4 = commandInfoEntity.size();
            for (int i12 = commandInfoIndex[1]; i12 < size4; i12++) {
                commandInfoEntity.remove(commandInfoIndex[1]);
            }
        }
        if (commandInfoEntity.isEmpty()) {
            commandList.remove(commandInfoIndex[0]);
        }
        ToMany<CommandInfoEntity> commandInfoEntity3 = ((CommandRecordEntity) AbstractC5805t.m5235o0(commandList)).getCommandInfoEntity();
        long j7 = this.stopCommandDelayTime;
        EzyCommandEnum$CommandEnum ezyCommandEnum$CommandEnum = EzyCommandEnum$CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        AbstractC5830k.m5329f(byteArray, "newBuilder().build().toByteArray()");
        commandInfoEntity3.add(new CommandInfoEntity(0L, j7, 0L, true, ezyCommandEnum$CommandEnum, byteArray));
    }

    private final void deleteFileEntity(String sourceFileName, int sourceId) {
        ToMany<FileRecordEntity> fileList = this.pageEntity.getRecordEntity().getTarget().getFileList();
        Iterator<FileRecordEntity> it = fileList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC5830k.m5325b(it.next().getFileName(), sourceFileName)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        ToMany<FileInfoEntity> fileInfoEntity = fileList.get(i).getFileInfoEntity();
        int i8 = i + 1;
        int size = fileList.size();
        for (int i9 = i8; i9 < size; i9++) {
            Iterator<FileInfoEntity> it2 = fileList.get(i9).getFileInfoEntity().iterator();
            while (it2.hasNext()) {
                FileUtils.INSTANCE.delete(SourceRouterRecord.INSTANCE.getResPath(this.pagePath, DocumentType.IMAGE) + File.separatorChar + it2.next().getFileName());
            }
        }
        int size2 = fileInfoEntity.size();
        for (int i10 = sourceId; i10 < size2; i10++) {
            FileUtils.INSTANCE.delete(SourceRouterRecord.INSTANCE.getResPath(this.pagePath, DocumentType.IMAGE) + File.separatorChar + fileInfoEntity.get(i10).getFileName());
        }
        if (i8 < fileList.size()) {
            int size3 = fileList.size();
            for (int i11 = i8; i11 < size3; i11++) {
                fileList.remove(i8);
            }
        }
        int size4 = fileInfoEntity.size();
        for (int i12 = sourceId; i12 < size4; i12++) {
            fileInfoEntity.remove(sourceId);
        }
        if (fileInfoEntity.isEmpty()) {
            fileList.remove(i);
        }
    }

    private final void deleteMatrixEntity(String sourceFileName, int sourceId) {
        ToMany<MatrixRecordEntity> matrixList = this.pageEntity.getRecordEntity().getTarget().getMatrixList();
        Iterator<MatrixRecordEntity> it = matrixList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC5830k.m5325b(it.next().getFileName(), sourceFileName)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        ToMany<MatrixEventEntity> matrixEventEntity = matrixList.get(i).getMatrixEventEntity();
        int i8 = i + 1;
        if (i8 < matrixList.size()) {
            int size = matrixList.size();
            for (int i9 = i8; i9 < size; i9++) {
                matrixList.remove(i8);
            }
        }
        int size2 = matrixEventEntity.size();
        for (int i10 = sourceId; i10 < size2; i10++) {
            matrixEventEntity.remove(sourceId);
        }
        if (matrixEventEntity.isEmpty()) {
            matrixList.remove(i);
        }
    }

    private final void deleteTextEntity(String sourceFileName, int sourceId) {
        ToMany<TextRecordEntity> textList = this.pageEntity.getRecordEntity().getTarget().getTextList();
        Iterator<TextRecordEntity> it = textList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC5830k.m5325b(it.next().getFileName(), sourceFileName)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        ToMany<TextInfoEntity> textInfoEntityList = textList.get(i).getTextInfoEntityList();
        int i8 = i + 1;
        if (i8 < textList.size()) {
            int size = textList.size();
            for (int i9 = i8; i9 < size; i9++) {
                textList.remove(i8);
            }
        }
        int size2 = textInfoEntityList.size();
        for (int i10 = sourceId; i10 < size2; i10++) {
            textInfoEntityList.remove(sourceId);
        }
        if (textInfoEntityList.isEmpty()) {
            textList.remove(i);
        }
    }

    private final void deleteTouchEntity(String sourceFileName, int sourceId) {
        ToMany<TouchRecordEntity> touchList = this.pageEntity.getRecordEntity().getTarget().getTouchList();
        Iterator<TouchRecordEntity> it = touchList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC5830k.m5325b(it.next().getFileName(), sourceFileName)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        ToMany<TouchEventEntity> touchEventList = touchList.get(i).getTouchEventList();
        int i8 = i + 1;
        if (i8 < touchList.size()) {
            int size = touchList.size();
            for (int i9 = i8; i9 < size; i9++) {
                touchList.remove(i8);
            }
        }
        int size2 = touchEventList.size();
        for (int i10 = sourceId; i10 < size2; i10++) {
            touchEventList.remove(sourceId);
        }
        if (touchEventList.isEmpty()) {
            touchList.remove(i);
        }
    }

    public final long calculateRecentTime(long time) {
        if (this.commandDelayTimeList.isEmpty()) {
            getCommandDelayTimeList();
        }
        int size = this.commandDelayTimeList.size();
        for (int i = 0; i < size; i++) {
            if (time >= this.commandDelayTimeList.get(i)[0] && time <= this.commandDelayTimeList.get(i)[1]) {
                int[] iArr = this.commandDelayTimeToIndex.get(this.commandDelayTimeList.get(i));
                AbstractC5830k.m5327d(iArr);
                this.deleteCommandIndexArray = iArr;
                this.stopCommandDelayTime = time - this.commandDelayTimeList.get(i)[0];
                return time;
            }
            if (time < this.commandDelayTimeList.get(i)[0]) {
                int i8 = i - 1;
                if (time - this.commandDelayTimeList.get(i8)[1] > this.commandDelayTimeList.get(i)[0] - time) {
                    int[] iArr2 = this.commandDelayTimeToIndex.get(this.commandDelayTimeList.get(i));
                    AbstractC5830k.m5327d(iArr2);
                    this.deleteCommandIndexArray = iArr2;
                    this.stopCommandDelayTime = 0L;
                    return this.commandDelayTimeList.get(i)[0];
                }
                int[] iArr3 = this.commandDelayTimeToIndex.get(this.commandDelayTimeList.get(i8));
                AbstractC5830k.m5327d(iArr3);
                this.deleteCommandIndexArray = iArr3;
                this.stopCommandDelayTime = this.commandDelayTimeList.get(i8)[1] - this.commandDelayTimeList.get(i8)[0];
                return this.commandDelayTimeList.get(i8)[1];
            }
        }
        return ((long[]) AbstractC5805t.m5235o0(this.commandDelayTimeList))[1];
    }

    public final void cropByTime(final long cropTime, @NotNull final InterfaceC6471c callback) {
        AbstractC5830k.m5330g(callback, "callback");
        new Thread(new Runnable() { // from class: z3.a
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                CropManager.m13811cropByTime$lambda4(this.f11538a, cropTime, callback);
            }
        }).start();
    }

    @NotNull
    public final List<long[]> getCommandDelayTimeList() {
        if (this.commandDelayTimeList.isEmpty()) {
            int size = this.pageEntity.getRecordEntity().getTarget().getCommandList().size();
            long duration = 0;
            for (int i = 0; i < size; i++) {
                CommandRecordEntity commandRecordEntity = this.pageEntity.getRecordEntity().getTarget().getCommandList().get(i);
                int size2 = commandRecordEntity.getCommandInfoEntity().size();
                for (int i8 = 0; i8 < size2; i8++) {
                    CommandInfoEntity commandInfoEntity = commandRecordEntity.getCommandInfoEntity().get(i8);
                    if (commandInfoEntity.isPlay()) {
                        long[] jArr = {duration, commandInfoEntity.getDelayTime() + duration};
                        this.commandDelayTimeList.add(jArr);
                        if (!this.commandDelayTimeToIndex.containsKey(jArr)) {
                            this.commandDelayTimeToIndex.put(jArr, new int[]{i, i8});
                        }
                        duration += commandInfoEntity.getDuration() + commandInfoEntity.getDelayTime();
                    }
                }
            }
        }
        return AbstractC5805t.m5217D0(this.commandDelayTimeList);
    }
}
