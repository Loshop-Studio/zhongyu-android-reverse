package com.zykj.blackboard.core.record.dataRecorder;

import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyPaint;
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
public final class TextSourceRecord extends DataRecorder {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_FILE_NAME_SUFFIX = "_text.bin";
    private RecordEntity recordEntity;
    private TextRecordEntity textRecordEntity;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EzySource.TextSource.TextInfo getTextInfo(String pageRootPath, String sourceFileName, int i10) {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
            Object obj = getTextSource(pageRootPath, sourceFileName).m8930h().get(i10);
            AbstractC9133u.m16132f(obj, "this.textInfoList[sourceId]");
            return (EzySource.TextSource.TextInfo) obj;
        }

        public final EzySource.TextSource getTextSource(String pageRootPath, String fileName) throws IOException {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource.TextSource record = EzySource.TextSource.m8927l(fileInputStream);
            fileInputStream.close();
            AbstractC9133u.m16132f(record, "record");
            return record;
        }

        private Companion() {
        }
    }

    public TextSourceRecord() {
        super(null);
    }

    private final TextRecordEntity buildRecordEntity() {
        RecordEntity recordEntity = this.recordEntity;
        if (recordEntity == null) {
            return null;
        }
        TextRecordEntity textRecordEntity = new TextRecordEntity(0L, UUID.randomUUID() + SOURCE_FILE_NAME_SUFFIX, "");
        recordEntity.getTextList().add(textRecordEntity);
        recordEntity.put();
        return textRecordEntity;
    }

    private final synchronized void checkLength() {
        try {
            TextRecordEntity textRecordEntity = this.textRecordEntity;
            if (textRecordEntity == null) {
                this.textRecordEntity = buildRecordEntity();
            } else {
                AbstractC9133u.m16130d(textRecordEntity);
                if (textRecordEntity.getTextInfoEntityList().size() >= 100) {
                    this.textRecordEntity = buildRecordEntity();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final TextRecordEntity initRecordEntity() {
        ToMany<TextRecordEntity> textList;
        TextRecordEntity textRecordEntity;
        RecordEntity recordEntity = this.recordEntity;
        return (recordEntity == null || (textList = recordEntity.getTextList()) == null || (textRecordEntity = (TextRecordEntity) AbstractC8778f0.m14579y0(textList)) == null || textRecordEntity.getTextInfoEntityList().size() >= 100) ? buildRecordEntity() : textRecordEntity;
    }

    public final CommonSourceResult addText(String content, EzyPaint.Paint paint) throws IllegalAccessException, IllegalArgumentException {
        CommonSourceResult commonSourceResult;
        AbstractC9133u.m16133g(content, "content");
        AbstractC9133u.m16133g(paint, "paint");
        TextRecordEntity textRecordEntity = this.textRecordEntity;
        if (textRecordEntity != null) {
            TextInfoEntity textInfoEntity = new TextInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.m8479m(), paint.m8478l(), content);
            textInfoEntity.getRecord().m15518k(textRecordEntity);
            textInfoEntity.put();
            textRecordEntity.getTextInfoEntityList().add(textInfoEntity);
            textRecordEntity.put();
            commonSourceResult = new CommonSourceResult(textRecordEntity.getFileName(), textRecordEntity.getTextInfoEntityList().m15499i(textInfoEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(RecordEntity recordEntity) {
        AbstractC9133u.m16133g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.textRecordEntity = initRecordEntity();
    }
}
