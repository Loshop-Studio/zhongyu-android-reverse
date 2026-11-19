package com.zykj.blackboard.core.record.dataRecorder;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.FileRecordEntity;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzySource$FileSource;
import io.objectbox.relation.ToMany;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ/\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord;", "Lcom/zykj/blackboard/core/record/DataRecorder;", "<init>", "()V", "Ld6/s;", "checkLength", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "initRecordEntity", "()Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "buildRecordEntity", "", "fileName", "validate", "", "width", "height", "Lcom/zykj/blackboard/bean/CommonSourceResult;", "addFile", "(Ljava/lang/String;Ljava/lang/String;II)Lcom/zykj/blackboard/bean/CommonSourceResult;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "setRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "fileRecordEntity", "Lcom/zykj/blackboard/core/data/dao/FileRecordEntity;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FileSourceRecord extends DataRecorder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOURCE_FILE_NAME_SUFFIX = "_file.bin";

    @Nullable
    private FileRecordEntity fileRecordEntity;

    @Nullable
    private RecordEntity recordEntity;

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/FileSourceRecord$Companion;", "", "()V", "SOURCE_FILE_NAME_SUFFIX", "", "getFileInfo", "Lcom/zykj/board/EzySource$FileSource$FileInfo;", "pageRootPath", "sourceFileName", "sourceId", "", "getFileSource", "Lcom/zykj/board/EzySource$FileSource;", "fileName", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final EzySource$FileSource.FileInfo getFileInfo(@NotNull String pageRootPath, @NotNull String sourceFileName, int sourceId) {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
            EzySource$FileSource.FileInfo fileInfo = getFileSource(pageRootPath, sourceFileName).getFileInfoList().get(sourceId);
            AbstractC5830k.m5329f(fileInfo, "this.fileInfoList[sourceId]");
            return fileInfo;
        }

        @NotNull
        public final EzySource$FileSource getFileSource(@NotNull String pageRootPath, @NotNull String fileName) throws IOException {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource$FileSource record = EzySource$FileSource.parseFrom(fileInputStream);
            fileInputStream.close();
            AbstractC5830k.m5329f(record, "record");
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
                AbstractC5830k.m5327d(fileRecordEntity);
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
        return (recordEntity == null || (fileList = recordEntity.getFileList()) == null || (fileRecordEntity = (FileRecordEntity) AbstractC5805t.m5236p0(fileList)) == null || fileRecordEntity.getFileInfoEntity().size() >= 100) ? buildRecordEntity() : fileRecordEntity;
    }

    @Nullable
    public final CommonSourceResult addFile(@NotNull String fileName, @NotNull String validate, int width, int height) {
        CommonSourceResult commonSourceResult;
        AbstractC5830k.m5330g(fileName, "fileName");
        AbstractC5830k.m5330g(validate, "validate");
        FileRecordEntity fileRecordEntity = this.fileRecordEntity;
        if (fileRecordEntity != null) {
            FileInfoEntity fileInfoEntity = new FileInfoEntity(0L, fileName, width, height, validate);
            fileInfoEntity.getRecord().setTarget(fileRecordEntity);
            fileInfoEntity.put();
            fileRecordEntity.getFileInfoEntity().add(fileInfoEntity);
            fileRecordEntity.put();
            commonSourceResult = new CommonSourceResult(fileRecordEntity.getFileName(), fileRecordEntity.getFileInfoEntity().indexOfId(fileInfoEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.fileRecordEntity = initRecordEntity();
    }
}
