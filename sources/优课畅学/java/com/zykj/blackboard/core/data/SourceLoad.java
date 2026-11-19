package com.zykj.blackboard.core.data;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox、文件流。

import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.AuthorEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.CommandRecordEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.GeometryRecordEntity;
import com.zykj.blackboard.core.data.dao.HeaderEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.MatrixRecordEntity;
import com.zykj.blackboard.core.data.dao.MoveConfigEntity;
import com.zykj.blackboard.core.data.dao.PageEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchRecordEntity;
import com.zykj.blackboard.utils.BoardBox;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.board.EzyBackgroundLineTypeEnum;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageRouter;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRouterRecord;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class SourceLoad {
    public static final SourceLoad INSTANCE = new SourceLoad();

    private SourceLoad() {
    }

    private final AuthorEntity buildAuthorEntity(EzyHeader.Author author) {
        return new AuthorEntity(0L, author.m8010m(), author.m8009l(), author.m8013q(), author.m8014r(), Long.valueOf(author.getStartTime()), Long.valueOf(author.m8012p()));
    }

    private final BackgroundLineConfigEntity buildBackgroundLineConfigEntity(EzyHeader.BackgroundLineConfig backgroundLineConfig) { // 页头导入：颜色、间距与类型取自消息，构造掩码 16 使线宽使用 3 像素默认值。
        int iM8049i = backgroundLineConfig.m8049i();
        float fM8050j = backgroundLineConfig.m8050j();
        EzyBackgroundLineTypeEnum.BackgroundLineTypeEnum backgroundLineTypeEnumM8051k = backgroundLineConfig.m8051k();
        AbstractC9133u.m16132f(backgroundLineTypeEnumM8051k, "backgroundLineConfig.lineType");
        return new BackgroundLineConfigEntity(0L, iM8049i, fM8050j, backgroundLineTypeEnumM8051k, 0.0f, 16, null);
    }

    private final MoveConfigEntity buildMoveConfigEntity(EzyHeader.MoveConfig moveConfig) {
        return new MoveConfigEntity(0L, moveConfig.m8179l(), moveConfig.m8184q(), moveConfig.m8178k(), moveConfig.m8183p(), moveConfig.m8182o(), moveConfig.m8180m(), moveConfig.m8181n());
    }

    public final EzyCommand.CommandSource getAudioRecord(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m7431l(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzyCommand.CommandSource getCommandRecord(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyCommand.CommandSource record = EzyCommand.CommandSource.m7431l(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzySource.FileSource getFileRecord(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.FileSource record = EzySource.FileSource.m8716l(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzySource.GeometrySource getGeometryRecord(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.GeometrySource record = EzySource.GeometrySource.m8784l(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzyHeader.Header getHeader(String path) throws IOException {
        AbstractC9133u.m16133g(path, "path");
        File file = new File(path, SourceSave.HEADER_FILE_NAME);
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyHeader.Header header = EzyHeader.Header.m8080M(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(header, "header");
        return header;
    }

    public final EzySource.MatrixSource getMatrixRecord(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.MatrixSource record = EzySource.MatrixSource.m8863k(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzyPageRouter.PageRouter getPageRouter(String path) throws IOException {
        AbstractC9133u.m16133g(path, "path");
        File file = new File(path, SourceSave.PAGE_ROUTER_FILE_NAME);
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyPageRouter.PageRouter record = EzyPageRouter.PageRouter.m8278k(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzyRouterRecord.RouterRecord getRouter(String path) throws IOException {
        AbstractC9133u.m16133g(path, "path");
        File file = new File(path, SourceSave.ROUTER_FILE_NAME);
        if (!file.exists()) {
            throw new FileNotFoundException(path);
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzyRouterRecord.RouterRecord record = EzyRouterRecord.RouterRecord.m8580L(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzySource.TextSource getTextRecord(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TextSource record = EzySource.TextSource.m8927l(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final EzySource.TouchSource getTouchRecord(String pagePath, String fileName, String validate) throws NoSuchAlgorithmException, IOException {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        File file = new File(pagePath, fileName);
        FileValidateUtils.INSTANCE.validateFile(FileValidateUtils.TypeEnum.SHA256, validate, file);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        EzySource.TouchSource record = EzySource.TouchSource.m8997l(fileInputStream);
        fileInputStream.close();
        AbstractC9133u.m16132f(record, "record");
        return record;
    }

    public final void loadAudioInfoList(AudioRecordEntity audioRecordEntity, List<EzyCommand.CommandSource.CommandInfo> audioInfoList) {
        AbstractC9133u.m16133g(audioRecordEntity, "audioRecordEntity");
        AbstractC9133u.m16133g(audioInfoList, "audioInfoList");
        ArrayList arrayList = new ArrayList();
        for (EzyCommand.CommandSource.CommandInfo commandInfo : audioInfoList) {
            long jM7450m = commandInfo.m7450m();
            long jM7451n = commandInfo.m7451n();
            boolean zM7452o = commandInfo.m7452o();
            EzyCommandEnum.CommandEnum commandEnumM7446h = commandInfo.m7446h();
            AbstractC9133u.m16132f(commandEnumM7446h, "it.commandEnum");
            byte[] byteArray = commandInfo.m7448j().toByteArray();
            AbstractC9133u.m16132f(byteArray, "it.data.toByteArray()");
            arrayList.add(new AudioInfoEntity(0L, jM7450m, jM7451n, zM7452o, commandEnumM7446h, byteArray));
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(AudioInfoEntity.class).m15415m(arrayList);
        audioRecordEntity.getAudioInfoEntity().addAll(arrayList);
    }

    public final void loadAudioRecordList(String pagePath, RecordEntity recordEntity, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> list) {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        AbstractC9133u.m16133g(list, "list");
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName, "it.fileName");
            String strM8624h = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h, "it.validate");
            AudioRecordEntity audioRecordEntity = new AudioRecordEntity(0L, fileName, strM8624h);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName2, "it.fileName");
            String strM8624h2 = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h2, "it.validate");
            List listM7433e = sourceLoad.getAudioRecord(pagePath, fileName2, strM8624h2).m7433e();
            AbstractC9133u.m16132f(listM7433e, "this.commandInfoList");
            sourceLoad.loadAudioInfoList(audioRecordEntity, listM7433e);
            audioRecordEntity.put();
            recordEntity.getAudioList().add(audioRecordEntity);
        }
    }

    public final void loadCommandInfoEntityList(CommandRecordEntity commandRecordEntity, List<EzyCommand.CommandSource.CommandInfo> commandInfoList) {
        AbstractC9133u.m16133g(commandRecordEntity, "commandRecordEntity");
        AbstractC9133u.m16133g(commandInfoList, "commandInfoList");
        ArrayList arrayList = new ArrayList();
        for (EzyCommand.CommandSource.CommandInfo commandInfo : commandInfoList) {
            long jM7450m = commandInfo.m7450m();
            long jM7451n = commandInfo.m7451n();
            boolean zM7452o = commandInfo.m7452o();
            EzyCommandEnum.CommandEnum commandEnumM7446h = commandInfo.m7446h();
            AbstractC9133u.m16132f(commandEnumM7446h, "it.commandEnum");
            byte[] byteArray = commandInfo.m7448j().toByteArray();
            AbstractC9133u.m16132f(byteArray, "it.data.toByteArray()");
            arrayList.add(new CommandInfoEntity(0L, jM7450m, jM7451n, zM7452o, commandEnumM7446h, byteArray));
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(CommandInfoEntity.class).m15415m(arrayList);
        commandRecordEntity.getCommandInfoEntity().addAll(arrayList);
    }

    public final void loadCommandRecordList(String pagePath, RecordEntity recordEntity, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> sourceCommandRecordList) {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        AbstractC9133u.m16133g(sourceCommandRecordList, "sourceCommandRecordList");
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : sourceCommandRecordList) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName, "it.fileName");
            String strM8624h = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h, "it.validate");
            CommandRecordEntity commandRecordEntity = new CommandRecordEntity(0L, fileName, strM8624h);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName2, "it.fileName");
            String strM8624h2 = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h2, "it.validate");
            List listM7433e = sourceLoad.getCommandRecord(pagePath, fileName2, strM8624h2).m7433e();
            AbstractC9133u.m16132f(listM7433e, "this.commandInfoList");
            sourceLoad.loadCommandInfoEntityList(commandRecordEntity, listM7433e);
            commandRecordEntity.put();
            recordEntity.getCommandList().add(commandRecordEntity);
        }
    }

    public final void loadFileInfoList(FileRecordEntity record, List<EzySource.FileSource.FileInfo> list) {
        AbstractC9133u.m16133g(record, "record");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource.FileSource.FileInfo fileInfo : list) {
            String name = fileInfo.getName();
            AbstractC9133u.m16132f(name, "it.name");
            int width = fileInfo.getWidth();
            int height = fileInfo.getHeight();
            String strM8732j = fileInfo.m8732j();
            AbstractC9133u.m16132f(strM8732j, "it.validate");
            arrayList.add(new FileInfoEntity(0L, name, width, height, strM8732j));
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(FileInfoEntity.class).m15415m(arrayList);
        record.getFileInfoEntity().addAll(arrayList);
    }

    public final void loadFileRecordList(String pagePath, RecordEntity recordEntity, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> list) {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        AbstractC9133u.m16133g(list, "list");
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName, "it.fileName");
            String strM8624h = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h, "it.validate");
            FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, fileName, strM8624h);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName2, "it.fileName");
            String strM8624h2 = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h2, "it.validate");
            List listM8719h = sourceLoad.getFileRecord(pagePath, fileName2, strM8624h2).m8719h();
            AbstractC9133u.m16132f(listM8719h, "this.fileInfoList");
            sourceLoad.loadFileInfoList(fileRecordEntity, listM8719h);
            fileRecordEntity.put();
            recordEntity.getFileList().add(fileRecordEntity);
        }
    }

    public final void loadGeometryInfoList(GeometryRecordEntity record, List<EzySource.GeometrySource.GeometryInfo> list) {
        AbstractC9133u.m16133g(record, "record");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource.GeometrySource.GeometryInfo geometryInfo : list) {
            GeometryInfoEntity geometryInfoEntity = new GeometryInfoEntity(0L, geometryInfo.m8803m().getWidth(), geometryInfo.m8803m().getColor(), geometryInfo.m8803m().m8479m(), geometryInfo.m8803m().m8478l(), geometryInfo.m8802l());
            SourceLoad sourceLoad = INSTANCE;
            List<EzyPointF.PointF> listM8805o = geometryInfo.m8805o();
            AbstractC9133u.m16132f(listM8805o, "it.pointsList");
            sourceLoad.loadGeometryPointFList(geometryInfoEntity, listM8805o);
            arrayList.add(geometryInfoEntity);
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(GeometryInfoEntity.class).m15415m(arrayList);
        record.getGeometryInfoEntityList().addAll(arrayList);
    }

    public final void loadGeometryPointFList(GeometryInfoEntity geometryInfo, List<EzyPointF.PointF> list) {
        AbstractC9133u.m16133g(geometryInfo, "geometryInfo");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzyPointF.PointF pointF : list) {
            arrayList.add(new GeometryPointFEntity(0L, pointF.getX(), pointF.getY()));
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(GeometryPointFEntity.class).m15415m(arrayList);
        geometryInfo.getPointList().addAll(arrayList);
    }

    public final void loadGeometryRecordList(String pagePath, RecordEntity recordEntity, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> list) {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        AbstractC9133u.m16133g(list, "list");
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName, "it.fileName");
            String strM8624h = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h, "it.validate");
            GeometryRecordEntity geometryRecordEntity = new GeometryRecordEntity(0L, fileName, strM8624h);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName2, "it.fileName");
            String strM8624h2 = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h2, "it.validate");
            List listM8787h = sourceLoad.getGeometryRecord(pagePath, fileName2, strM8624h2).m8787h();
            AbstractC9133u.m16132f(listM8787h, "this.geometryInfoList");
            sourceLoad.loadGeometryInfoList(geometryRecordEntity, listM8787h);
            geometryRecordEntity.put();
            recordEntity.getGeometryList().add(geometryRecordEntity);
        }
    }

    public final void loadMatrixEventEntityList(MatrixRecordEntity record, List<EzySource.MatrixSource.MatrixInfo> list) {
        AbstractC9133u.m16133g(record, "record");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource.MatrixSource.MatrixInfo matrixInfo : list) {
            MatrixEventEntity matrixEventEntity = new MatrixEventEntity(0L);
            SourceLoad sourceLoad = INSTANCE;
            List<EzyMatrix.Matrix> matrixList = matrixInfo.getMatrixList();
            AbstractC9133u.m16132f(matrixList, "it.matrixList");
            sourceLoad.loadMatrixInfo(matrixEventEntity, matrixList);
            arrayList.add(matrixEventEntity);
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(MatrixEventEntity.class).m15415m(arrayList);
        record.getMatrixEventEntity().addAll(arrayList);
    }

    public final void loadMatrixInfo(MatrixEventEntity event, List<EzyMatrix.Matrix> list) {
        AbstractC9133u.m16133g(event, "event");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzyMatrix.Matrix matrix : list) {
            arrayList.add(new MatrixInfoEntity(0L, matrix.getEventTime(), matrix.getScaleX(), matrix.m8231q(), matrix.m8233s(), matrix.m8232r(), matrix.getScaleY(), matrix.m8234t(), matrix.m8228n(), matrix.m8229o(), matrix.m8230p()));
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(MatrixInfoEntity.class).m15415m(arrayList);
        event.getMatrixInfo().addAll(arrayList);
    }

    public final void loadMatrixRecordList(String pagePath, RecordEntity recordEntity, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> matrixSourceRecordList) {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        AbstractC9133u.m16133g(matrixSourceRecordList, "matrixSourceRecordList");
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : matrixSourceRecordList) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName, "it.fileName");
            String strM8624h = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h, "it.validate");
            MatrixRecordEntity matrixRecordEntity = new MatrixRecordEntity(0L, fileName, strM8624h);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName2, "it.fileName");
            String strM8624h2 = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h2, "it.validate");
            List listM8866g = sourceLoad.getMatrixRecord(pagePath, fileName2, strM8624h2).m8866g();
            AbstractC9133u.m16132f(listM8866g, "this.matrixInfoList");
            sourceLoad.loadMatrixEventEntityList(matrixRecordEntity, listM8866g);
            matrixRecordEntity.put();
            recordEntity.getMatrixList().add(matrixRecordEntity);
        }
    }

    public final void loadPage(String dir, PageEntity pageEntity) throws IllegalAccessException, IOException, IllegalArgumentException {
        AbstractC9133u.m16133g(dir, "dir");
        AbstractC9133u.m16133g(pageEntity, "pageEntity");
        String pagePath = new File(dir, pageEntity.getDirName()).getAbsolutePath();
        AbstractC9133u.m16132f(pagePath, "pagePath");
        EzyRouterRecord.RouterRecord router = getRouter(pagePath);
        RecordEntity recordEntity = new RecordEntity(0L);
        SourceLoad sourceLoad = INSTANCE;
        List<EzyRouterRecord.RouterRecord.SourceCommandRecord> commandRecordList = router.m8613v();
        AbstractC9133u.m16132f(commandRecordList, "commandRecordList");
        sourceLoad.loadCommandRecordList(pagePath, recordEntity, commandRecordList);
        List<EzyRouterRecord.RouterRecord.SourceCommandRecord> touchSourceRecordList = router.m8606H();
        AbstractC9133u.m16132f(touchSourceRecordList, "touchSourceRecordList");
        sourceLoad.loadTouchRecordList(pagePath, recordEntity, touchSourceRecordList);
        List<EzyRouterRecord.RouterRecord.SourceCommandRecord> matrixSourceRecordList = router.m8602D();
        AbstractC9133u.m16132f(matrixSourceRecordList, "matrixSourceRecordList");
        sourceLoad.loadMatrixRecordList(pagePath, recordEntity, matrixSourceRecordList);
        List<EzyRouterRecord.RouterRecord.SourceCommandRecord> fileSourceRecordList = router.m8616z();
        AbstractC9133u.m16132f(fileSourceRecordList, "fileSourceRecordList");
        sourceLoad.loadFileRecordList(pagePath, recordEntity, fileSourceRecordList);
        List<EzyRouterRecord.RouterRecord.SourceCommandRecord> textSourceRecordList = router.m8604F();
        AbstractC9133u.m16132f(textSourceRecordList, "textSourceRecordList");
        sourceLoad.loadTextRecordList(pagePath, recordEntity, textSourceRecordList);
        List<EzyRouterRecord.RouterRecord.SourceCommandRecord> geometrySourceRecordList = router.m8600B();
        AbstractC9133u.m16132f(geometrySourceRecordList, "geometrySourceRecordList");
        sourceLoad.loadGeometryRecordList(pagePath, recordEntity, geometrySourceRecordList);
        List<EzyRouterRecord.RouterRecord.SourceCommandRecord> audioRecordList = router.m8611t();
        AbstractC9133u.m16132f(audioRecordList, "audioRecordList");
        sourceLoad.loadAudioRecordList(pagePath, recordEntity, audioRecordList);
        recordEntity.put();
        pageEntity.getRecordEntity().m15518k(recordEntity);
        EzyHeader.Header header = getHeader(pagePath);
        int version = header.getVersion();
        int width = header.getWidth();
        int height = header.getHeight();
        long createDate = header.getCreateDate();
        long updateDate = header.getUpdateDate();
        long jM8117z = header.m8117z();
        String strM8113u = header.m8113u();
        AbstractC9133u.m16132f(strM8113u, "this.convertUrl");
        HeaderEntity headerEntity = new HeaderEntity(0L, version, width, height, createDate, updateDate, jM8117z, strM8113u, header.m8114v(), header.m8100A());
        EzyHeader.Author authorM8112t = header.m8112t();
        AbstractC9133u.m16132f(authorM8112t, "this.author");
        AuthorEntity authorEntityBuildAuthorEntity = sourceLoad.buildAuthorEntity(authorM8112t);
        authorEntityBuildAuthorEntity.put();
        headerEntity.getAuthor().m15518k(authorEntityBuildAuthorEntity);
        EzyHeader.MoveConfig moveConfig = header.m8102C();
        AbstractC9133u.m16132f(moveConfig, "moveConfig");
        MoveConfigEntity moveConfigEntityBuildMoveConfigEntity = sourceLoad.buildMoveConfigEntity(moveConfig);
        moveConfigEntityBuildMoveConfigEntity.put();
        headerEntity.getMoveConfig().m15518k(moveConfigEntityBuildMoveConfigEntity);
        EzyHeader.BackgroundLineConfig defaultBackgroundLineConfig = header.m8115w();
        AbstractC9133u.m16132f(defaultBackgroundLineConfig, "defaultBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityBuildBackgroundLineConfigEntity = sourceLoad.buildBackgroundLineConfigEntity(defaultBackgroundLineConfig);
        backgroundLineConfigEntityBuildBackgroundLineConfigEntity.put();
        headerEntity.getDefaultBackgroundLineConfig().m15518k(backgroundLineConfigEntityBuildBackgroundLineConfigEntity);
        EzyHeader.BackgroundLineConfig lastBackgroundLineConfig = header.m8101B();
        AbstractC9133u.m16132f(lastBackgroundLineConfig, "lastBackgroundLineConfig");
        BackgroundLineConfigEntity backgroundLineConfigEntityBuildBackgroundLineConfigEntity2 = sourceLoad.buildBackgroundLineConfigEntity(lastBackgroundLineConfig);
        backgroundLineConfigEntityBuildBackgroundLineConfigEntity2.put();
        headerEntity.getLastBackgroundLineConfig().m15518k(backgroundLineConfigEntityBuildBackgroundLineConfigEntity2);
        List<EzyHeader.Author> listM8104E = header.m8104E();
        AbstractC9133u.m16132f(listM8104E, "this.providerList");
        for (EzyHeader.Author it : listM8104E) {
            SourceLoad sourceLoad2 = INSTANCE;
            AbstractC9133u.m16132f(it, "it");
            AuthorEntity authorEntityBuildAuthorEntity2 = sourceLoad2.buildAuthorEntity(it);
            authorEntityBuildAuthorEntity2.put();
            headerEntity.getProvider().add(authorEntityBuildAuthorEntity2);
        }
        headerEntity.put();
        pageEntity.getHeaderEntity().m15518k(headerEntity);
    }

    public final BlackBoardEntity loadRecord(String path) throws IllegalAccessException, IOException, IllegalArgumentException {
        AbstractC9133u.m16133g(path, "path");
        File file = new File(path, SourceSave.PAGE_ROUTER_FILE_NAME);
        if (!file.exists() || !file.isFile()) {
            throw new FileNotFoundException(path);
        }
        BlackBoardEntity blackBoardEntity = new BlackBoardEntity(0L, path);
        List<EzyPageRouter.PageRouter.PageInfo> pageInfoList = EzyPageRouter.PageRouter.m8278k(new FileInputStream(file)).m8281g();
        AbstractC9133u.m16132f(pageInfoList, "pageInfoList");
        for (EzyPageRouter.PageRouter.PageInfo pageInfo : pageInfoList) {
            AbstractC5380q.m2623s("[SourceLoad]:loadRecord-> page:" + pageInfo.getName());
            String name = pageInfo.getName();
            AbstractC9133u.m16132f(name, "it.name");
            PageEntity pageEntity = new PageEntity(0L, name, false, null, 0, 28, null);
            INSTANCE.loadPage(path, pageEntity);
            pageEntity.getBlackBoardEntity().m15518k(blackBoardEntity);
            pageEntity.put();
            blackBoardEntity.getPages().add(pageEntity);
        }
        blackBoardEntity.put();
        return blackBoardEntity;
    }

    public final void loadTextInfoList(TextRecordEntity record, List<EzySource.TextSource.TextInfo> list) {
        AbstractC9133u.m16133g(record, "record");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource.TextSource.TextInfo textInfo : list) {
            float width = textInfo.m8942i().getWidth();
            int color = textInfo.m8942i().getColor();
            float fM8479m = textInfo.m8942i().m8479m();
            int iM8478l = textInfo.m8942i().m8478l();
            String content = textInfo.getContent();
            AbstractC9133u.m16132f(content, "it.content");
            arrayList.add(new TextInfoEntity(0L, width, color, fM8479m, iM8478l, content));
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(TextInfoEntity.class).m15415m(arrayList);
        record.getTextInfoEntityList().addAll(arrayList);
    }

    public final void loadTextRecordList(String pagePath, RecordEntity recordEntity, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> list) {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        AbstractC9133u.m16133g(list, "list");
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : list) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName, "it.fileName");
            String strM8624h = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h, "it.validate");
            TextRecordEntity textRecordEntity = new TextRecordEntity(0L, fileName, strM8624h);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName2, "it.fileName");
            String strM8624h2 = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h2, "it.validate");
            List listM8930h = sourceLoad.getTextRecord(pagePath, fileName2, strM8624h2).m8930h();
            AbstractC9133u.m16132f(listM8930h, "this.textInfoList");
            sourceLoad.loadTextInfoList(textRecordEntity, listM8930h);
            textRecordEntity.put();
            recordEntity.getTextList().add(textRecordEntity);
        }
    }

    public final void loadTouchEventEntityList(TouchRecordEntity record, List<EzySource.TouchSource.TouchInfo> list) {
        AbstractC9133u.m16133g(record, "record");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzySource.TouchSource.TouchInfo touchInfo : list) {
            TouchEventEntity touchEventEntity = new TouchEventEntity(0L, touchInfo.m9013j().getWidth(), touchInfo.m9013j().getColor(), touchInfo.m9013j().m8477k(), touchInfo.m9013j().m8476j(), touchInfo.m9013j().m8478l(), touchInfo.m9013j().m8479m());
            SourceLoad sourceLoad = INSTANCE;
            List<EzyTouchEvent.TouchEvent> touchEventList = touchInfo.getTouchEventList();
            AbstractC9133u.m16132f(touchEventList, "it.touchEventList");
            sourceLoad.loadTouchInfo(touchEventEntity, touchEventList);
            arrayList.add(touchEventEntity);
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(TouchEventEntity.class).m15415m(arrayList);
        record.getTouchEventList().addAll(arrayList);
    }

    public final void loadTouchInfo(TouchEventEntity event, List<EzyTouchEvent.TouchEvent> list) {
        AbstractC9133u.m16133g(event, "event");
        AbstractC9133u.m16133g(list, "list");
        ArrayList arrayList = new ArrayList();
        for (EzyTouchEvent.TouchEvent touchEvent : list) {
            arrayList.add(new TouchInfoEntity(0L, touchEvent.getEventTime(), touchEvent.getX(), touchEvent.getY()));
        }
        BoardBox.INSTANCE.getBoxStore().m15370d(TouchInfoEntity.class).m15415m(arrayList);
        event.getTouchInfoList().addAll(arrayList);
    }

    public final void loadTouchRecordList(String pagePath, RecordEntity recordEntity, List<EzyRouterRecord.RouterRecord.SourceCommandRecord> touchSourceRecordList) {
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        AbstractC9133u.m16133g(touchSourceRecordList, "touchSourceRecordList");
        for (EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord : touchSourceRecordList) {
            String fileName = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName, "it.fileName");
            String strM8624h = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h, "it.validate");
            TouchRecordEntity touchRecordEntity = new TouchRecordEntity(0L, fileName, strM8624h);
            SourceLoad sourceLoad = INSTANCE;
            String fileName2 = sourceCommandRecord.getFileName();
            AbstractC9133u.m16132f(fileName2, "it.fileName");
            String strM8624h2 = sourceCommandRecord.m8624h();
            AbstractC9133u.m16132f(strM8624h2, "it.validate");
            List listM9000h = sourceLoad.getTouchRecord(pagePath, fileName2, strM8624h2).m9000h();
            AbstractC9133u.m16132f(listM9000h, "this.touchInfoList");
            sourceLoad.loadTouchEventEntityList(touchRecordEntity, listM9000h);
            touchRecordEntity.put();
            recordEntity.getTouchList().add(touchRecordEntity);
        }
    }
}
