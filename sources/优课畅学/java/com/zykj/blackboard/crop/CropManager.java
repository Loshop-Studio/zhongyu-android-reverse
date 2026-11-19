package com.zykj.blackboard.crop;

import android.graphics.Bitmap;
import com.google.protobuf.Any;
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
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.FileUtils;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.ProtoFileUtils;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import io.objectbox.relation.ToMany;
import io.objectbox.relation.ToOne;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class CropManager {
    private final ArrayList<long[]> commandDelayTimeList;
    private final HashMap<long[], int[]> commandDelayTimeToIndex;
    private int[] deleteCommandIndexArray;
    private final PageEntity pageEntity;
    private final String pagePath;
    private final String rootPath;
    private long stopCommandDelayTime;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD.ordinal()] = 1;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX.ordinal()] = 2;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CropManager(String pagePath) throws IllegalAccessException, IOException, IllegalArgumentException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        this.pagePath = pagePath;
        this.commandDelayTimeList = new ArrayList<>();
        this.commandDelayTimeToIndex = new HashMap<>();
        this.deleteCommandIndexArray = new int[2];
        File file = new File(pagePath);
        String parent = file.getParent();
        AbstractC9133u.m16132f(parent, "pageFile.parent");
        this.rootPath = parent;
        String name = file.getName();
        AbstractC9133u.m16132f(name, "pageFile.name");
        PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
        this.pageEntity = pageEntity;
        SourceLoad.INSTANCE.loadPage(parent, pageEntity);
    }

    private final GraphControl createGraphControl(MatrixAdapter matrixAdapter) {
        ToOne<BackgroundLineConfigEntity> defaultBackgroundLineConfig;
        BackgroundLineConfigEntity backgroundLineConfigEntity;
        BackgroundLineConfig config;
        GraphControl graphControl = new GraphControl(matrixAdapter, new RenderLayer(new SimpleBackgroundView(((HeaderEntity) this.pageEntity.getHeaderEntity().m15511c()).getWidth(), ((HeaderEntity) this.pageEntity.getHeaderEntity().m15511c()).getHeight()), new SimpleFixView(((HeaderEntity) this.pageEntity.getHeaderEntity().m15511c()).getWidth(), ((HeaderEntity) this.pageEntity.getHeaderEntity().m15511c()).getHeight()), null, null), new BoardConfig(((HeaderEntity) this.pageEntity.getHeaderEntity().m15511c()).getWidth(), ((HeaderEntity) this.pageEntity.getHeaderEntity().m15511c()).getHeight()));
        HeaderEntity headerEntity = (HeaderEntity) this.pageEntity.getHeaderEntity().m15511c();
        if (headerEntity != null) {
            graphControl.setDefaultBackgroundColor(headerEntity.getDefaultBackgroundColor());
        }
        HeaderEntity headerEntity2 = (HeaderEntity) this.pageEntity.getHeaderEntity().m15511c();
        if (headerEntity2 != null && (defaultBackgroundLineConfig = headerEntity2.getDefaultBackgroundLineConfig()) != null && (backgroundLineConfigEntity = (BackgroundLineConfigEntity) defaultBackgroundLineConfig.m15511c()) != null && (config = ConvertExtKt.toConfig(backgroundLineConfigEntity)) != null) {
            graphControl.setDefaultBackgroundLineConfig(config);
        }
        CommandFactory commandFactory = CommandFactory.INSTANCE;
        int version = ((HeaderEntity) this.pageEntity.getHeaderEntity().m15511c()).getVersion();
        Object objM15511c = this.pageEntity.getRecordEntity().m15511c();
        AbstractC9133u.m16132f(objM15511c, "pageEntity.recordEntity.target");
        SimpleSourceLoader simpleSourceLoader = new SimpleSourceLoader((RecordEntity) objM15511c);
        simpleSourceLoader.initPath(this.pagePath);
        C8736p c8736p = C8736p.f16368a;
        BaseCommandExecuteFactory baseCommandExecuteFactoryCreateCommandFactory = commandFactory.createCommandFactory(version, simpleSourceLoader, matrixAdapter, graphControl);
        Iterator<CommandRecordEntity> it = ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getCommandList().iterator();
        while (it.hasNext()) {
            Iterator<CommandInfoEntity> it2 = it.next().getCommandInfoEntity().iterator();
            while (it2.hasNext()) {
                EzyCommand.CommandSource.CommandInfo commandInfoCommandInfoConvertEzyCommandInfo = EntityConvertEzy.INSTANCE.commandInfoConvertEzyCommandInfo(it2.next());
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
    private final void cropAudioByTime(long r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.crop.CropManager.cropAudioByTime(long):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/crop/CropManager.smali:799
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cropByTime$lambda-4, reason: not valid java name */
    public static final void m27475cropByTime$lambda4(CropManager this$0, long j10, InterfaceC10570l callback) throws Throwable {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(callback, "$callback");
        try {
            long jCalculateRecentTime = this$0.calculateRecentTime(j10);
            this$0.cropCommandByIndex(this$0.deleteCommandIndexArray);
            this$0.cropAudioByTime(jCalculateRecentTime);
            MatrixAdapter matrixAdapter = new MatrixAdapter();
            GraphControl graphControlCreateGraphControl = this$0.createGraphControl(matrixAdapter);
            HeaderEntity headerEntity = (HeaderEntity) this$0.pageEntity.getHeaderEntity().m15511c();
            headerEntity.setUpdateDate(System.currentTimeMillis());
            headerEntity.setDuration(jCalculateRecentTime);
            headerEntity.setLastBackgroundColor(graphControlCreateGraphControl.getBackgroundColor());
            BackgroundLineConfigEntity target = (BackgroundLineConfigEntity) headerEntity.getLastBackgroundLineConfig().m15511c();
            if (target != null) {
                AbstractC9133u.m16132f(target, "target");
                BackgroundLineConfig backgroundLineConfig = graphControlCreateGraphControl.getBackgroundLineConfig();
                target.setLineColor(backgroundLineConfig.getLineColor());
                target.setLineSpace(backgroundLineConfig.getLineSpace());
                target.setLineWidth(backgroundLineConfig.getLineWidth());
                target.setLineType(ConvertExtKt.toEzyBackgroundLineTypeEnum(backgroundLineConfig.getLineType()));
            }
            SourceSave sourceSave = SourceSave.INSTANCE;
            sourceSave.saveHeader(this$0.pageEntity, this$0.rootPath);
            EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotSnapshot = graphControlCreateGraphControl.snapshot();
            if (graphSnapshotSnapshot != null) {
                EzyPageSnapshot.PageSnapshot.C7230b c7230bM8345k = EzyPageSnapshot.PageSnapshot.m8345k();
                c7230bM8345k.m8463z(graphSnapshotSnapshot);
                c7230bM8345k.m8461x(MatrixExtKt.toEzyMatrix(matrixAdapter.getCameraMatrix(), 0L));
                ProtoFileUtils.Companion companion = ProtoFileUtils.Companion;
                String str = this$0.pagePath;
                EzyPageSnapshot.PageSnapshot pageSnapshotBuild = c7230bM8345k.build();
                AbstractC9133u.m16132f(pageSnapshotBuild, "builder.build()");
                companion.createPageSnapshotFile(str, BasePageControl.SNAPSHOT_FILE_NAME, pageSnapshotBuild);
            }
            Bitmap bitmapScreenshot = graphControlCreateGraphControl.screenshot();
            if (bitmapScreenshot != null) {
                ProtoFileUtils.Companion.createBitmapFile(this$0.pagePath, BasePageControl.SCREENSHOT_FILE_NAME, bitmapScreenshot);
            }
            sourceSave.saveRouter(this$0.pageEntity, this$0.rootPath);
            callback.invoke("");
        } catch (Exception e10) {
            callback.invoke(e10.toString());
            e10.printStackTrace();
        }
    }

    private final void cropCommandByIndex(int[] iArr) {
        ToMany<CommandRecordEntity> commandList = ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getCommandList();
        ToMany<CommandInfoEntity> commandInfoEntity = ((CommandRecordEntity) commandList.get(iArr[0])).getCommandInfoEntity();
        boolean[] zArr = new boolean[4];
        for (int i10 = 0; i10 < 4; i10++) {
            zArr[i10] = false;
        }
        int size = commandList.size();
        for (int i11 = iArr[0]; i11 < size; i11++) {
            int size2 = ((CommandRecordEntity) commandList.get(i11)).getCommandInfoEntity().size();
            for (int i12 = iArr[1]; i12 < size2; i12++) {
                CommandInfoEntity commandInfoEntity2 = (CommandInfoEntity) ((CommandRecordEntity) commandList.get(i11)).getCommandInfoEntity().get(i12);
                int i13 = WhenMappings.$EnumSwitchMapping$0[commandInfoEntity2.getCommandEnum().ordinal()];
                if (i13 == 1) {
                    EzyCommand.CommandSource.CommandInfo.GraphData graphDataM7738D = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandInfoEntity2.getData());
                    if (graphDataM7738D.m7760s() == EzyGraphEnum.GraphEnum.IMAGE_GRAPH && !zArr[0]) {
                        String strM7765x = graphDataM7738D.m7765x();
                        AbstractC9133u.m16132f(strM7765x, "data.sourceFileName");
                        deleteFileEntity(strM7765x, graphDataM7738D.m7766y());
                        zArr[0] = true;
                    } else if (graphDataM7738D.m7760s() == EzyGraphEnum.GraphEnum.TEXT_GRAPH && !zArr[1]) {
                        String strM7765x2 = graphDataM7738D.m7765x();
                        AbstractC9133u.m16132f(strM7765x2, "data.sourceFileName");
                        deleteTextEntity(strM7765x2, graphDataM7738D.m7766y());
                        zArr[1] = true;
                    } else if (graphDataM7738D.m7760s() == EzyGraphEnum.GraphEnum.STROKE_GRAPH || (graphDataM7738D.m7760s() == EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH && !zArr[2])) {
                        String strM7765x3 = graphDataM7738D.m7765x();
                        AbstractC9133u.m16132f(strM7765x3, "data.sourceFileName");
                        deleteTouchEntity(strM7765x3, graphDataM7738D.m7766y());
                        zArr[2] = true;
                    }
                } else if (i13 == 2) {
                    EzyCommand.CommandSource.CommandInfo.CameraMatrix cameraMatrixM7542t = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m7542t(commandInfoEntity2.getData());
                    if (!zArr[3]) {
                        String strM7546l = cameraMatrixM7542t.m7546l();
                        AbstractC9133u.m16132f(strM7546l, "data.sourceFileName");
                        deleteMatrixEntity(strM7546l, cameraMatrixM7542t.m7547m());
                        zArr[3] = true;
                    }
                } else if (i13 == 3) {
                    EzyCommand.CommandSource.CommandInfo.GraphMatrix graphMatrixM7809z = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m7809z(commandInfoEntity2.getData());
                    if (!zArr[3]) {
                        String strM7816r = graphMatrixM7809z.m7816r();
                        AbstractC9133u.m16132f(strM7816r, "data.sourceFileName");
                        deleteMatrixEntity(strM7816r, graphMatrixM7809z.m7817s());
                        zArr[3] = true;
                    }
                }
            }
        }
        if (iArr[0] + 1 < commandList.size()) {
            int size3 = commandList.size();
            for (int i14 = iArr[0] + 1; i14 < size3; i14++) {
                commandList.remove(iArr[0] + 1);
            }
        }
        if (iArr[1] < commandInfoEntity.size()) {
            int size4 = commandInfoEntity.size();
            for (int i15 = iArr[1]; i15 < size4; i15++) {
                commandInfoEntity.remove(iArr[1]);
            }
        }
        if (commandInfoEntity.isEmpty()) {
            commandList.remove(iArr[0]);
        }
        ToMany<CommandInfoEntity> commandInfoEntity3 = ((CommandRecordEntity) AbstractC8778f0.m14578x0(commandList)).getCommandInfoEntity();
        long j10 = this.stopCommandDelayTime;
        EzyCommandEnum.CommandEnum commandEnum = EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP;
        byte[] byteArray = Any.newBuilder().build().toByteArray();
        AbstractC9133u.m16132f(byteArray, "newBuilder().build().toByteArray()");
        commandInfoEntity3.add(new CommandInfoEntity(0L, j10, 0L, true, commandEnum, byteArray));
    }

    private final void deleteFileEntity(String str, int i10) {
        ToMany<FileRecordEntity> fileList = ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getFileList();
        Iterator<FileRecordEntity> it = fileList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (AbstractC9133u.m16128b(it.next().getFileName(), str)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        ToMany<FileInfoEntity> fileInfoEntity = ((FileRecordEntity) fileList.get(i11)).getFileInfoEntity();
        int i12 = i11 + 1;
        int size = fileList.size();
        for (int i13 = i12; i13 < size; i13++) {
            Iterator<FileInfoEntity> it2 = ((FileRecordEntity) fileList.get(i13)).getFileInfoEntity().iterator();
            while (it2.hasNext()) {
                FileUtils.INSTANCE.delete(SourceRouterRecord.Companion.getResPath(this.pagePath, DocumentType.IMAGE) + File.separatorChar + it2.next().getFileName());
            }
        }
        int size2 = fileInfoEntity.size();
        for (int i14 = i10; i14 < size2; i14++) {
            FileUtils.INSTANCE.delete(SourceRouterRecord.Companion.getResPath(this.pagePath, DocumentType.IMAGE) + File.separatorChar + ((FileInfoEntity) fileInfoEntity.get(i14)).getFileName());
        }
        if (i12 < fileList.size()) {
            int size3 = fileList.size();
            for (int i15 = i12; i15 < size3; i15++) {
                fileList.remove(i12);
            }
        }
        int size4 = fileInfoEntity.size();
        for (int i16 = i10; i16 < size4; i16++) {
            fileInfoEntity.remove(i10);
        }
        if (fileInfoEntity.isEmpty()) {
            fileList.remove(i11);
        }
    }

    private final void deleteMatrixEntity(String str, int i10) {
        ToMany<MatrixRecordEntity> matrixList = ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getMatrixList();
        Iterator<MatrixRecordEntity> it = matrixList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (AbstractC9133u.m16128b(it.next().getFileName(), str)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        ToMany<MatrixEventEntity> matrixEventEntity = ((MatrixRecordEntity) matrixList.get(i11)).getMatrixEventEntity();
        int i12 = i11 + 1;
        if (i12 < matrixList.size()) {
            int size = matrixList.size();
            for (int i13 = i12; i13 < size; i13++) {
                matrixList.remove(i12);
            }
        }
        int size2 = matrixEventEntity.size();
        for (int i14 = i10; i14 < size2; i14++) {
            matrixEventEntity.remove(i10);
        }
        if (matrixEventEntity.isEmpty()) {
            matrixList.remove(i11);
        }
    }

    private final void deleteTextEntity(String str, int i10) {
        ToMany<TextRecordEntity> textList = ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getTextList();
        Iterator<TextRecordEntity> it = textList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (AbstractC9133u.m16128b(it.next().getFileName(), str)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        ToMany<TextInfoEntity> textInfoEntityList = ((TextRecordEntity) textList.get(i11)).getTextInfoEntityList();
        int i12 = i11 + 1;
        if (i12 < textList.size()) {
            int size = textList.size();
            for (int i13 = i12; i13 < size; i13++) {
                textList.remove(i12);
            }
        }
        int size2 = textInfoEntityList.size();
        for (int i14 = i10; i14 < size2; i14++) {
            textInfoEntityList.remove(i10);
        }
        if (textInfoEntityList.isEmpty()) {
            textList.remove(i11);
        }
    }

    private final void deleteTouchEntity(String str, int i10) {
        ToMany<TouchRecordEntity> touchList = ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getTouchList();
        Iterator<TouchRecordEntity> it = touchList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (AbstractC9133u.m16128b(it.next().getFileName(), str)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        ToMany<TouchEventEntity> touchEventList = ((TouchRecordEntity) touchList.get(i11)).getTouchEventList();
        int i12 = i11 + 1;
        if (i12 < touchList.size()) {
            int size = touchList.size();
            for (int i13 = i12; i13 < size; i13++) {
                touchList.remove(i12);
            }
        }
        int size2 = touchEventList.size();
        for (int i14 = i10; i14 < size2; i14++) {
            touchEventList.remove(i10);
        }
        if (touchEventList.isEmpty()) {
            touchList.remove(i11);
        }
    }

    public final long calculateRecentTime(long j10) {
        if (this.commandDelayTimeList.isEmpty()) {
            getCommandDelayTimeList();
        }
        int size = this.commandDelayTimeList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (j10 >= this.commandDelayTimeList.get(i10)[0] && j10 <= this.commandDelayTimeList.get(i10)[1]) {
                int[] iArr = this.commandDelayTimeToIndex.get(this.commandDelayTimeList.get(i10));
                AbstractC9133u.m16130d(iArr);
                this.deleteCommandIndexArray = iArr;
                this.stopCommandDelayTime = j10 - this.commandDelayTimeList.get(i10)[0];
                return j10;
            }
            if (j10 < this.commandDelayTimeList.get(i10)[0]) {
                int i11 = i10 - 1;
                if (j10 - this.commandDelayTimeList.get(i11)[1] > this.commandDelayTimeList.get(i10)[0] - j10) {
                    int[] iArr2 = this.commandDelayTimeToIndex.get(this.commandDelayTimeList.get(i10));
                    AbstractC9133u.m16130d(iArr2);
                    this.deleteCommandIndexArray = iArr2;
                    this.stopCommandDelayTime = 0L;
                    return this.commandDelayTimeList.get(i10)[0];
                }
                int[] iArr3 = this.commandDelayTimeToIndex.get(this.commandDelayTimeList.get(i11));
                AbstractC9133u.m16130d(iArr3);
                this.deleteCommandIndexArray = iArr3;
                this.stopCommandDelayTime = this.commandDelayTimeList.get(i11)[1] - this.commandDelayTimeList.get(i11)[0];
                return this.commandDelayTimeList.get(i11)[1];
            }
        }
        return ((long[]) AbstractC8778f0.m14578x0(this.commandDelayTimeList))[1];
    }

    public final void cropByTime(final long j10, final InterfaceC10570l callback) {
        AbstractC9133u.m16133g(callback, "callback");
        new Thread(new Runnable() { // from class: d3.a
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                CropManager.m27475cropByTime$lambda4(this.f15691a, j10, callback);
            }
        }).start();
    }

    public final List<long[]> getCommandDelayTimeList() {
        if (this.commandDelayTimeList.isEmpty()) {
            int size = ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getCommandList().size();
            long delayTime = 0;
            for (int i10 = 0; i10 < size; i10++) {
                CommandRecordEntity commandRecordEntity = (CommandRecordEntity) ((RecordEntity) this.pageEntity.getRecordEntity().m15511c()).getCommandList().get(i10);
                int size2 = commandRecordEntity.getCommandInfoEntity().size();
                for (int i11 = 0; i11 < size2; i11++) {
                    CommandInfoEntity commandInfoEntity = (CommandInfoEntity) commandRecordEntity.getCommandInfoEntity().get(i11);
                    if (commandInfoEntity.isPlay()) {
                        long[] jArr = {delayTime, commandInfoEntity.getDelayTime() + delayTime};
                        this.commandDelayTimeList.add(jArr);
                        if (!this.commandDelayTimeToIndex.containsKey(jArr)) {
                            this.commandDelayTimeToIndex.put(jArr, new int[]{i10, i11});
                        }
                        delayTime += commandInfoEntity.getDelayTime() + commandInfoEntity.getDuration();
                    }
                }
            }
        }
        return AbstractC8778f0.m14544U0(this.commandDelayTimeList);
    }
}
