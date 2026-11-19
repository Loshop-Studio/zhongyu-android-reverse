package com.zykj.blackboard.core.record.dataRecorder;

import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzySource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class FileSourceRecord extends DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_FILE_NAME_SUFFIX = "_file.bin";
    private FileRecordEntity fileRecordEntity;
    private RecordEntity recordEntity;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EzySource.FileSource.FileInfo getFileInfo(String pageRootPath, String sourceFileName, int i10) {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
            Object obj = getFileSource(pageRootPath, sourceFileName).m8719h().get(i10);
            AbstractC9133u.m16132f(obj, "this.fileInfoList[sourceId]");
            return (EzySource.FileSource.FileInfo) obj;
        }

        public final EzySource.FileSource getFileSource(String pageRootPath, String fileName) throws IOException {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.FileSource record = EzySource.FileSource.m8716l(fileInputStream);
            fileInputStream.close();
            AbstractC9133u.m16132f(record, "record");
            return record;
        }

        private Companion() {
        }
    }

    public FileSourceRecord() {
        super(null);
    }

    private final FileRecordEntity buildRecordEntity() {
        RecordEntity recordEntity = this.recordEntity;
        if (recordEntity == null) {
            return null;
        }
        FileRecordEntity fileRecordEntity = new FileRecordEntity(0L, UUID.randomUUID() + SOURCE_FILE_NAME_SUFFIX, "");
        recordEntity.getFileList().add(fileRecordEntity);
        recordEntity.put();
        return fileRecordEntity;
    }

    private final synchronized void checkLength() {
        try {
            FileRecordEntity fileRecordEntity = this.fileRecordEntity;
            if (fileRecordEntity == null) {
                this.fileRecordEntity = buildRecordEntity();
            } else {
                AbstractC9133u.m16130d(fileRecordEntity);
                if (fileRecordEntity.getFileInfoEntity().size() >= 100) {
                    this.fileRecordEntity = buildRecordEntity();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final FileRecordEntity initRecordEntity() {
        ToMany<FileRecordEntity> fileList;
        FileRecordEntity fileRecordEntity;
        RecordEntity recordEntity = this.recordEntity;
        return (recordEntity == null || (fileList = recordEntity.getFileList()) == null || (fileRecordEntity = (FileRecordEntity) AbstractC8778f0.m14579y0(fileList)) == null || fileRecordEntity.getFileInfoEntity().size() >= 100) ? buildRecordEntity() : fileRecordEntity;
    }

    public final CommonSourceResult addFile(String fileName, String validate, int i10, int i11) throws IllegalAccessException, IllegalArgumentException {
        CommonSourceResult commonSourceResult;
        AbstractC9133u.m16133g(fileName, "fileName");
        AbstractC9133u.m16133g(validate, "validate");
        FileRecordEntity fileRecordEntity = this.fileRecordEntity;
        if (fileRecordEntity != null) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity(0L, fileName, i10, i11, validate);
            fileInfoEntity.getRecord().m15518k(fileRecordEntity);
            fileInfoEntity.put();
            fileRecordEntity.getFileInfoEntity().add(fileInfoEntity);
            fileRecordEntity.put();
            commonSourceResult = new CommonSourceResult(fileRecordEntity.getFileName(), fileRecordEntity.getFileInfoEntity().m15499i(fileInfoEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.fileRecordEntity = initRecordEntity();
    }
}
