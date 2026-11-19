package com.zykj.blackboard.core.data;

// RE note 本类字节码直接引用的读写或显示接口包括ObjectBox。

import com.blankj.utilcode.util.AbstractC5380q;
import com.google.protobuf.ByteString;
import com.zykj.blackboard.core.data.dao.AudioInfoEntity;
import com.zykj.blackboard.core.data.dao.AudioRecordEntity;
import com.zykj.blackboard.core.data.dao.AuthorEntity;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity;
import com.zykj.blackboard.core.data.dao.BlackBoardEntity_;
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
import com.zykj.blackboard.utils.FileUtils;
import com.zykj.blackboard.utils.FileValidateUtils;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageRouter;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRouterRecord;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import io.objectbox.C8957a;
import io.objectbox.query.Query;
import io.objectbox.query.QueryBuilder;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;

/* loaded from: classes4.dex */
public final class SourceSave {
    public static final String HEADER_FILE_NAME = "header.bin";
    public static final SourceSave INSTANCE = new SourceSave();
    public static final String PAGE_ROUTER_FILE_NAME = "page_router.bin";
    public static final String ROUTER_FILE_NAME = "router.bin";

    private SourceSave() {
    }

    private final EzyHeader.Author buildAuthor(AuthorEntity authorEntity) {
        EzyHeader.Author.C7210b c7210bM8008s = EzyHeader.Author.m8008s();
        String authorName = authorEntity.getAuthorName();
        if (authorName != null) {
            c7210bM8008s.m8033r(authorName);
        }
        String authorId = authorEntity.getAuthorId();
        if (authorId != null) {
            c7210bM8008s.m8032q(authorId);
        }
        String schoolId = authorEntity.getSchoolId();
        if (schoolId != null) {
            c7210bM8008s.m8037v(schoolId);
        }
        String url = authorEntity.getUrl();
        if (url != null) {
            c7210bM8008s.m8040y(url);
        }
        Long startTime = authorEntity.getStartTime();
        if (startTime != null) {
            c7210bM8008s.m8038w(startTime.longValue());
        }
        Long duration = authorEntity.getDuration();
        if (duration != null) {
            c7210bM8008s.m8034s(duration.longValue());
        }
        EzyHeader.Author authorBuild = c7210bM8008s.build();
        AbstractC9133u.m16132f(authorBuild, "newBuilder().apply {\n   …      }\n        }.build()");
        return authorBuild;
    }

    private final EzyHeader.BackgroundLineConfig buildBackgroundLineConfig(BackgroundLineConfigEntity backgroundLineConfigEntity) { // 页头写回：只编码颜色、间距与类型。录制时的显式线宽位于 ACTION_CONFIG 命令中。
        EzyHeader.BackgroundLineConfig.C7212b c7212bM8047n = EzyHeader.BackgroundLineConfig.m8047n();
        c7212bM8047n.m8072r(backgroundLineConfigEntity.getLineColor());
        c7212bM8047n.m8073s(backgroundLineConfigEntity.getLineSpace());
        c7212bM8047n.m8074t(backgroundLineConfigEntity.getLineType());
        EzyHeader.BackgroundLineConfig backgroundLineConfigBuild = c7212bM8047n.build();
        AbstractC9133u.m16132f(backgroundLineConfigBuild, "newBuilder().apply {\n   …ineType\n        }.build()");
        return backgroundLineConfigBuild;
    }

    private final EzyHeader.MoveConfig buildMoveConfig(MoveConfigEntity moveConfigEntity) {
        EzyHeader.MoveConfig.C7216b c7216bM8176r = EzyHeader.MoveConfig.m8176r();
        c7216bM8176r.m8204s(moveConfigEntity.isEnable());
        c7216bM8176r.m8211z(moveConfigEntity.getVerticalTranslate());
        c7216bM8176r.m8203r(moveConfigEntity.getHorizontalTranslate());
        c7216bM8176r.m8209x(moveConfigEntity.getScale());
        c7216bM8176r.m8208w(moveConfigEntity.getRotate());
        c7216bM8176r.m8205t(moveConfigEntity.getMaxHeightTimes());
        c7216bM8176r.m8206u(moveConfigEntity.getMaxWidthTimes());
        EzyHeader.MoveConfig moveConfigBuild = c7216bM8176r.build();
        AbstractC9133u.m16132f(moveConfigBuild, "newBuilder().apply {\n   …thTimes\n        }.build()");
        return moveConfigBuild;
    }

    public static /* synthetic */ void saveRecord$default(SourceSave sourceSave, List list, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = str;
        }
        sourceSave.saveRecord(list, str, str2);
    }

    public final void saveAudio(String pagePath, AudioRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(record, "record");
        EzyCommand.CommandSource.C7204b c7204bM7430i = EzyCommand.CommandSource.m7430i();
        for (AudioInfoEntity audioInfoEntity : record.getAudioInfoEntity()) {
            EzyCommand.CommandSource.CommandInfo.C7202b c7202bM7445p = EzyCommand.CommandSource.CommandInfo.m7445p();
            c7202bM7445p.m7948t(audioInfoEntity.getDelayTime());
            c7202bM7445p.m7949u(audioInfoEntity.getDuration());
            c7202bM7445p.m7951w(audioInfoEntity.isPlay());
            c7202bM7445p.m7945q(audioInfoEntity.getCommandEnum());
            c7202bM7445p.m7947s(ByteString.copyFrom(audioInfoEntity.getData()));
            c7204bM7430i.m7955c(c7202bM7445p);
        }
        if (c7204bM7430i.m7966o() <= 0) {
            AbstractC5380q.m2623s("[SourceSave]: saveAudio-> [" + record.getFileName() + "]commandInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzyCommand.CommandSource commandSourceBuild = c7204bM7430i.build();
        AbstractC9133u.m16132f(commandSourceBuild, "audioRecord.build()");
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, commandSourceBuild);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveCommand(String pagePath, CommandRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(record, "record");
        EzyCommand.CommandSource.C7204b c7204bM7430i = EzyCommand.CommandSource.m7430i();
        for (CommandInfoEntity commandInfoEntity : record.getCommandInfoEntity()) {
            EzyCommand.CommandSource.CommandInfo.C7202b c7202bM7445p = EzyCommand.CommandSource.CommandInfo.m7445p();
            c7202bM7445p.m7948t(commandInfoEntity.getDelayTime());
            c7202bM7445p.m7949u(commandInfoEntity.getDuration());
            c7202bM7445p.m7951w(commandInfoEntity.isPlay());
            c7202bM7445p.m7945q(commandInfoEntity.getCommandEnum());
            c7202bM7445p.m7947s(ByteString.copyFrom(commandInfoEntity.getData()));
            c7204bM7430i.m7955c(c7202bM7445p);
        }
        if (c7204bM7430i.m7966o() <= 0) {
            AbstractC5380q.m2623s("[SourceSave]: saveCommand-> [" + record.getFileName() + "]commandInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzyCommand.CommandSource commandSourceBuild = c7204bM7430i.build();
        AbstractC9133u.m16132f(commandSourceBuild, "commandRecord.build()");
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, commandSourceBuild);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveFile(String pagePath, FileRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(record, "record");
        EzySource.FileSource.C7251b c7251bM8715i = EzySource.FileSource.m8715i();
        for (FileInfoEntity fileInfoEntity : record.getFileInfoEntity()) {
            EzySource.FileSource.FileInfo.C7249b c7249bM8730k = EzySource.FileSource.FileInfo.m8730k();
            c7249bM8730k.m8752s(fileInfoEntity.getFileName());
            c7249bM8730k.m8755v(fileInfoEntity.getValidate());
            c7251bM8715i.m8758c(c7249bM8730k);
        }
        if (c7251bM8715i.m8770p() <= 0) {
            AbstractC5380q.m2623s("[SourceSave]: saveFile-> [" + record.getFileName() + "]fileInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource.FileSource fileSourceBuild = c7251bM8715i.build();
        AbstractC9133u.m16132f(fileSourceBuild, "fileRecord.build()");
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, fileSourceBuild);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveGeometry(String pagePath, GeometryRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(record, "record");
        EzySource.GeometrySource.C7255b c7255bM8783i = EzySource.GeometrySource.m8783i();
        for (GeometryInfoEntity geometryInfoEntity : record.getGeometryInfoEntityList()) {
            EzySource.GeometrySource.GeometryInfo.C7253b c7253bM8800q = EzySource.GeometrySource.GeometryInfo.m8800q();
            c7253bM8800q.m8836z(geometryInfoEntity.getGeometryType());
            EzyPaint.Paint.C7233b c7233bM8474n = EzyPaint.Paint.m8474n();
            c7233bM8474n.m8497q(geometryInfoEntity.getColor());
            c7233bM8474n.m8505y(geometryInfoEntity.getWidth());
            c7233bM8474n.m8503w(geometryInfoEntity.getTextSize());
            c7233bM8474n.m8502v(geometryInfoEntity.getStyle());
            c7253bM8800q.m8814A(c7233bM8474n.build());
            for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.getPointList()) {
                EzyPointF.PointF.C7236b c7236bM8512e = EzyPointF.PointF.m8512e();
                c7236bM8512e.m8534t(geometryPointFEntity.getX());
                c7236bM8512e.m8535u(geometryPointFEntity.getY());
                c7253bM8800q.m8817c(c7236bM8512e.build());
            }
            c7255bM8783i.m8838c(c7253bM8800q);
        }
        if (c7255bM8783i.m8850p() <= 0) {
            AbstractC5380q.m2623s("[SourceSave]: saveGeometry-> [" + record.getFileName() + "]geometryInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource.GeometrySource geometrySourceBuild = c7255bM8783i.build();
        AbstractC9133u.m16132f(geometrySourceBuild, "geometryRecord.build()");
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, geometrySourceBuild);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveHeader(PageEntity pageEntity, String path) throws Throwable {
        AbstractC9133u.m16133g(pageEntity, "pageEntity");
        AbstractC9133u.m16133g(path, "path");
        HeaderEntity headerEntity = (HeaderEntity) pageEntity.getHeaderEntity().m15511c();
        EzyHeader.Header.C7214b c7214bM8079J = EzyHeader.Header.m8079J();
        c7214bM8079J.m8144Y(headerEntity.getVersion());
        c7214bM8079J.m8145Z(headerEntity.getWidth());
        c7214bM8079J.m8137R(headerEntity.getHeight());
        c7214bM8079J.m8132M(headerEntity.getCreateDate());
        c7214bM8079J.m8143X(headerEntity.getUpdateDate());
        c7214bM8079J.m8135P(headerEntity.getDuration());
        c7214bM8079J.m8133N(headerEntity.getDefaultBackgroundColor());
        c7214bM8079J.m8138S(headerEntity.getLastBackgroundColor());
        AuthorEntity authorEntity = (AuthorEntity) headerEntity.getAuthor().m15511c();
        if (authorEntity != null) {
            c7214bM8079J.m8131L(INSTANCE.buildAuthor(authorEntity));
        }
        MoveConfigEntity moveConfigEntity = (MoveConfigEntity) headerEntity.getMoveConfig().m15511c();
        if (moveConfigEntity != null) {
            c7214bM8079J.m8140U(INSTANCE.buildMoveConfig(moveConfigEntity));
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity = (BackgroundLineConfigEntity) headerEntity.getDefaultBackgroundLineConfig().m15511c();
        if (backgroundLineConfigEntity != null) {
            c7214bM8079J.m8134O(INSTANCE.buildBackgroundLineConfig(backgroundLineConfigEntity));
        }
        BackgroundLineConfigEntity backgroundLineConfigEntity2 = (BackgroundLineConfigEntity) headerEntity.getLastBackgroundLineConfig().m15511c();
        if (backgroundLineConfigEntity2 != null) {
            c7214bM8079J.m8139T(INSTANCE.buildBackgroundLineConfig(backgroundLineConfigEntity2));
        }
        for (AuthorEntity it : headerEntity.getProvider()) {
            SourceSave sourceSave = INSTANCE;
            AbstractC9133u.m16132f(it, "it");
            c7214bM8079J.m8147e(sourceSave.buildAuthor(it));
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String absolutePath = new File(path, pageEntity.getDirName()).getAbsolutePath();
        AbstractC9133u.m16132f(absolutePath, "File(path, pageEntity.dirName).absolutePath");
        EzyHeader.Header headerBuild = c7214bM8079J.build();
        AbstractC9133u.m16132f(headerBuild, "header.build()");
        fileUtils.saveToFile(absolutePath, HEADER_FILE_NAME, headerBuild);
    }

    public final void saveMatrix(String pagePath, MatrixRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(record, "record");
        EzySource.MatrixSource.C7259b c7259bM8862h = EzySource.MatrixSource.m8862h();
        for (MatrixEventEntity matrixEventEntity : record.getMatrixEventEntity()) {
            EzySource.MatrixSource.MatrixInfo.C7257b c7257bM8874g = EzySource.MatrixSource.MatrixInfo.m8874g();
            for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.getMatrixInfo()) {
                EzyMatrix.Matrix.C7219b c7219bM8226u = EzyMatrix.Matrix.m8226u();
                c7219bM8226u.m8255q(matrixInfoEntity.getEventTime());
                c7219bM8226u.m8261w(matrixInfoEntity.getScaleX());
                c7219bM8226u.m8263y(matrixInfoEntity.getSkewX());
                c7219bM8226u.m8239A(matrixInfoEntity.getTransX());
                c7219bM8226u.m8264z(matrixInfoEntity.getSkewY());
                c7219bM8226u.m8262x(matrixInfoEntity.getScaleY());
                c7219bM8226u.m8240B(matrixInfoEntity.getTransY());
                c7219bM8226u.m8257s(matrixInfoEntity.getPerSp0());
                c7219bM8226u.m8258t(matrixInfoEntity.getPerSp1());
                c7219bM8226u.m8259u(matrixInfoEntity.getPerSp2());
                c7257bM8874g.m8881e(c7219bM8226u.build());
            }
            c7259bM8862h.m8901c(c7257bM8874g.build());
        }
        if (c7259bM8862h.m8913p() <= 0) {
            AbstractC5380q.m2623s("[SourceSave]: saveMatrix-> [" + record.getFileName() + "]matrixInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource.MatrixSource matrixSourceBuild = c7259bM8862h.build();
        AbstractC9133u.m16132f(matrixSourceBuild, "matrixRecord.build()");
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, matrixSourceBuild);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveRecord(List<String> pagePathList, String path, String boardPath) {
        AbstractC9133u.m16133g(pagePathList, "pagePathList");
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(boardPath, "boardPath");
        StringBuilder sb = new StringBuilder();
        sb.append("[SourceSave]: saveRecord-> boardPath:" + boardPath);
        int i10 = 0;
        for (Object obj : pagePathList) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            sb.append('[' + i10 + "]:" + ((String) obj));
            i10 = i11;
        }
        C8736p c8736p = C8736p.f16368a;
        AbstractC5380q.m2623s(sb);
        C8957a c8957aM15370d = BoardBox.INSTANCE.getBoxStore().m15370d(BlackBoardEntity.class);
        AbstractC9133u.m16132f(c8957aM15370d, "BoardBox.boxStore.boxFor…kBoardEntity::class.java)");
        QueryBuilder builder = c8957aM15370d.m15416n();
        AbstractC9133u.m16132f(builder, "builder");
        builder.m15488c(BlackBoardEntity_.dir, boardPath);
        Query queryM15486a = builder.m15486a();
        AbstractC9133u.m16132f(queryM15486a, "builder.build()");
        BlackBoardEntity blackBoardEntity = (BlackBoardEntity) queryM15486a.m15480l();
        if (blackBoardEntity != null) {
            INSTANCE.saveRecord(blackBoardEntity, pagePathList);
        }
    }

    public final void saveRouter(PageEntity pageEntity, String path) throws Throwable {
        AbstractC9133u.m16133g(pageEntity, "pageEntity");
        AbstractC9133u.m16133g(path, "path");
        EzyRouterRecord.RouterRecord.C7245b c7245bM8579I = EzyRouterRecord.RouterRecord.m8579I();
        String pagePath = new File(path, pageEntity.getDirName()).getAbsolutePath();
        RecordEntity recordEntity = (RecordEntity) pageEntity.getRecordEntity().m15511c();
        for (CommandRecordEntity it : recordEntity.getCommandList()) {
            AbstractC5380q.m2623s("[SourceSave]: saveRouter-> command:" + it.getFileName());
            if (!it.getCommandInfoEntity().isEmpty()) {
                SourceSave sourceSave = INSTANCE;
                AbstractC9133u.m16132f(pagePath, "pagePath");
                AbstractC9133u.m16132f(it, "it");
                sourceSave.saveCommand(pagePath, it);
                AbstractC5380q.m2623s("[SourceSave]: saveRouter-> command:" + it.getFileName() + ", validate:" + it.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7243b c7243bM8622i = EzyRouterRecord.RouterRecord.SourceCommandRecord.m8622i();
                c7243bM8622i.m8643r(it.getFileName());
                c7243bM8622i.m8646u(it.getValidate());
                c7245bM8579I.m8664e(c7243bM8622i);
            }
        }
        for (FileRecordEntity it2 : recordEntity.getFileList()) {
            AbstractC5380q.m2623s("[SourceSave]: saveRouter-> file:" + it2.getFileName());
            if (!it2.getFileInfoEntity().isEmpty()) {
                SourceSave sourceSave2 = INSTANCE;
                AbstractC9133u.m16132f(pagePath, "pagePath");
                AbstractC9133u.m16132f(it2, "it");
                sourceSave2.saveFile(pagePath, it2);
                AbstractC5380q.m2623s("[SourceSave]: saveRouter-> file:" + it2.getFileName() + ", validate:" + it2.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7243b c7243bM8622i2 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m8622i();
                c7243bM8622i2.m8643r(it2.getFileName());
                c7243bM8622i2.m8646u(it2.getValidate());
                c7245bM8579I.m8665f(c7243bM8622i2);
            }
        }
        for (TouchRecordEntity it3 : recordEntity.getTouchList()) {
            AbstractC5380q.m2623s("[SourceSave]: saveRouter-> touch:" + it3.getFileName());
            if (!it3.getTouchEventList().isEmpty()) {
                SourceSave sourceSave3 = INSTANCE;
                AbstractC9133u.m16132f(pagePath, "pagePath");
                AbstractC9133u.m16132f(it3, "it");
                sourceSave3.saveTouch(pagePath, it3);
                AbstractC5380q.m2623s("[SourceSave]: saveRouter-> touch:" + it3.getFileName() + ", validate:" + it3.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7243b c7243bM8622i3 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m8622i();
                c7243bM8622i3.m8643r(it3.getFileName());
                c7243bM8622i3.m8646u(it3.getValidate());
                c7245bM8579I.m8670k(c7243bM8622i3);
            }
        }
        for (MatrixRecordEntity it4 : recordEntity.getMatrixList()) {
            AbstractC5380q.m2623s("[SourceSave]: saveRouter-> matrix:" + it4.getFileName());
            if (!it4.getMatrixEventEntity().isEmpty()) {
                SourceSave sourceSave4 = INSTANCE;
                AbstractC9133u.m16132f(pagePath, "pagePath");
                AbstractC9133u.m16132f(it4, "it");
                sourceSave4.saveMatrix(pagePath, it4);
                AbstractC5380q.m2623s("[SourceSave]: saveRouter-> matrix:" + it4.getFileName() + ", validate:" + it4.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7243b c7243bM8622i4 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m8622i();
                c7243bM8622i4.m8643r(it4.getFileName());
                c7243bM8622i4.m8646u(it4.getValidate());
                c7245bM8579I.m8667h(c7243bM8622i4);
            }
        }
        for (AudioRecordEntity it5 : recordEntity.getAudioList()) {
            AbstractC5380q.m2623s("[SourceSave]: saveRouter-> audio:" + it5.getFileName());
            if (!it5.getAudioInfoEntity().isEmpty()) {
                SourceSave sourceSave5 = INSTANCE;
                AbstractC9133u.m16132f(pagePath, "pagePath");
                AbstractC9133u.m16132f(it5, "it");
                sourceSave5.saveAudio(pagePath, it5);
                AbstractC5380q.m2623s("[SourceSave]: saveRouter-> audio:" + it5.getFileName() + ", validate:" + it5.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7243b c7243bM8622i5 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m8622i();
                c7243bM8622i5.m8643r(it5.getFileName());
                c7243bM8622i5.m8646u(it5.getValidate());
                c7245bM8579I.m8663c(c7243bM8622i5);
            }
        }
        for (TextRecordEntity it6 : recordEntity.getTextList()) {
            AbstractC5380q.m2623s("[SourceSave]: saveRouter-> text:" + it6.getFileName());
            if (!it6.getTextInfoEntityList().isEmpty()) {
                SourceSave sourceSave6 = INSTANCE;
                AbstractC9133u.m16132f(pagePath, "pagePath");
                AbstractC9133u.m16132f(it6, "it");
                sourceSave6.saveText(pagePath, it6);
                AbstractC5380q.m2623s("[SourceSave]: saveRouter-> text:" + it6.getFileName() + ", validate:" + it6.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7243b c7243bM8622i6 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m8622i();
                c7243bM8622i6.m8643r(it6.getFileName());
                c7243bM8622i6.m8646u(it6.getValidate());
                c7245bM8579I.m8669j(c7243bM8622i6);
            }
        }
        for (GeometryRecordEntity it7 : recordEntity.getGeometryList()) {
            AbstractC5380q.m2623s("[SourceSave]: saveRouter-> geometry:" + it7.getFileName());
            if (!it7.getGeometryInfoEntityList().isEmpty()) {
                SourceSave sourceSave7 = INSTANCE;
                AbstractC9133u.m16132f(pagePath, "pagePath");
                AbstractC9133u.m16132f(it7, "it");
                sourceSave7.saveGeometry(pagePath, it7);
                AbstractC5380q.m2623s("[SourceSave]: saveRouter-> geometry:" + it7.getFileName() + ", validate:" + it7.getValidate());
                EzyRouterRecord.RouterRecord.SourceCommandRecord.C7243b c7243bM8622i7 = EzyRouterRecord.RouterRecord.SourceCommandRecord.m8622i();
                c7243bM8622i7.m8643r(it7.getFileName());
                c7243bM8622i7.m8646u(it7.getValidate());
                c7245bM8579I.m8666g(c7243bM8622i7);
            }
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        AbstractC9133u.m16132f(pagePath, "pagePath");
        EzyRouterRecord.RouterRecord routerRecordM8671l = c7245bM8579I.build();
        AbstractC9133u.m16132f(routerRecordM8671l, "routerRecord.build()");
        fileUtils.saveToFile(pagePath, ROUTER_FILE_NAME, routerRecordM8671l);
    }

    public final void saveText(String pagePath, TextRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(record, "record");
        EzySource.TextSource.C7263b c7263bM8926i = EzySource.TextSource.m8926i();
        for (TextInfoEntity textInfoEntity : record.getTextInfoEntityList()) {
            EzySource.TextSource.TextInfo.C7261b c7261bM8940k = EzySource.TextSource.TextInfo.m8940k();
            c7261bM8940k.m8965u(textInfoEntity.getContent());
            EzyPaint.Paint.C7233b c7233bM8474n = EzyPaint.Paint.m8474n();
            c7233bM8474n.m8497q(textInfoEntity.getColor());
            c7233bM8474n.m8505y(textInfoEntity.getWidth());
            c7233bM8474n.m8503w(textInfoEntity.getTextSize());
            c7233bM8474n.m8502v(textInfoEntity.getStyle());
            c7261bM8940k.m8967w(c7233bM8474n.build());
            c7263bM8926i.m8972e(c7261bM8940k);
        }
        if (c7263bM8926i.m8983p() <= 0) {
            AbstractC5380q.m2623s("[SourceSave]: saveText-> [" + record.getFileName() + "]textInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource.TextSource textSourceBuild = c7263bM8926i.build();
        AbstractC9133u.m16132f(textSourceBuild, "textRecord.build()");
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, textSourceBuild);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveTouch(String pagePath, TouchRecordEntity record) throws Throwable {
        String fileSignature;
        AbstractC9133u.m16133g(pagePath, "pagePath");
        AbstractC9133u.m16133g(record, "record");
        EzySource.TouchSource.C7267b c7267bM8996i = EzySource.TouchSource.m8996i();
        for (TouchEventEntity touchEventEntity : record.getTouchEventList()) {
            EzySource.TouchSource.TouchInfo.C7265b c7265bM9011l = EzySource.TouchSource.TouchInfo.m9011l();
            EzyPaint.Paint.C7233b c7233bM8474n = EzyPaint.Paint.m8474n();
            c7233bM8474n.m8505y(touchEventEntity.getWidth());
            c7233bM8474n.m8497q(touchEventEntity.getColor());
            c7233bM8474n.m8501u(touchEventEntity.getSpacing());
            c7233bM8474n.m8499s(touchEventEntity.getItemLength());
            c7233bM8474n.m8502v(touchEventEntity.getStyle());
            c7233bM8474n.m8503w(touchEventEntity.getTextSize());
            c7265bM9011l.m9041y(c7233bM8474n.build());
            for (TouchInfoEntity touchInfoEntity : touchEventEntity.getTouchInfoList()) {
                EzyTouchEvent.TouchEvent.C7274b c7274bM9083o = EzyTouchEvent.TouchEvent.m9083o();
                c7274bM9083o.m9145B(touchInfoEntity.getX());
                c7274bM9083o.m9146C(touchInfoEntity.getY());
                c7274bM9083o.m9165v(touchInfoEntity.getEventTime());
                c7265bM9011l.m9023f(c7274bM9083o.build());
            }
            c7267bM8996i.m9045e(c7265bM9011l);
        }
        if (c7267bM8996i.m9056p() <= 0) {
            AbstractC5380q.m2623s("[SourceSave]: saveTouch-> [" + record.getFileName() + "]touchInfoCount==0");
            return;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        String fileName = record.getFileName();
        EzySource.TouchSource touchSourceBuild = c7267bM8996i.build();
        AbstractC9133u.m16132f(touchSourceBuild, "touchRecord.build()");
        File fileSaveToFile = fileUtils.saveToFile(pagePath, fileName, touchSourceBuild);
        if (fileSaveToFile == null || (fileSignature = FileValidateUtils.INSTANCE.getFileSignature(fileSaveToFile, FileValidateUtils.TypeEnum.SHA256)) == null) {
            return;
        }
        record.setValidate(fileSignature);
    }

    public final void saveRecord(BlackBoardEntity boardEntity, List<String> pagePathList) {
        AbstractC9133u.m16133g(boardEntity, "boardEntity");
        AbstractC9133u.m16133g(pagePathList, "pagePathList");
        String dir = boardEntity.getDir();
        if (dir == null) {
            return;
        }
        EzyPageRouter.PageRouter.C7225b c7225bM8277h = EzyPageRouter.PageRouter.m8277h();
        int i10 = 0;
        for (PageEntity pageEntity : boardEntity.getPages()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            PageEntity pageEntity2 = pageEntity;
            AbstractC5380q.m2623s("[SourceSave]: saveRecord-> [" + i10 + "][" + pageEntity2.getDirName() + ']');
            if (pagePathList.contains(pageEntity2.getDirName())) {
                EzyPageRouter.PageRouter.PageInfo.C7223b c7223bM8289h = EzyPageRouter.PageRouter.PageInfo.m8289h();
                c7223bM8289h.m8311s(i10);
                c7223bM8289h.m8310r(pageEntity2.getDirName());
                c7225bM8277h.m8315c(c7223bM8289h);
                SourceSave sourceSave = INSTANCE;
                AbstractC9133u.m16132f(pageEntity2, "pageEntity");
                sourceSave.saveHeader(pageEntity2, dir);
                sourceSave.saveRouter(pageEntity2, dir);
                AbstractC5380q.m2623s("[SourceSave]: saveRecord-> [" + i10 + "][" + pageEntity2.getDirName() + "] 结束");
            }
            i10 = i11;
        }
        FileUtils fileUtils = FileUtils.INSTANCE;
        EzyPageRouter.PageRouter pageRouterBuild = c7225bM8277h.build();
        AbstractC9133u.m16132f(pageRouterBuild, "pageRecord.build()");
        fileUtils.saveToFile(dir, PAGE_ROUTER_FILE_NAME, pageRouterBuild);
    }
}
