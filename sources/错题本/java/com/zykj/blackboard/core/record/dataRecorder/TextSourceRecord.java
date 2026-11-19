package com.zykj.blackboard.core.record.dataRecorder;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.CommonSourceResult;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TextRecordEntity;
import com.zykj.blackboard.core.record.DataRecorder;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzySource$TextSource;
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

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord;", "Lcom/zykj/blackboard/core/record/DataRecorder;", "<init>", "()V", "Ld6/s;", "checkLength", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "initRecordEntity", "()Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "buildRecordEntity", "", "content", "Lcom/zykj/board/EzyPaint$Paint;", "paint", "Lcom/zykj/blackboard/bean/CommonSourceResult;", "addText", "(Ljava/lang/String;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/blackboard/bean/CommonSourceResult;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "recordEntity", "setRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "textRecordEntity", "Lcom/zykj/blackboard/core/data/dao/TextRecordEntity;", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextSourceRecord extends DataRecorder {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOURCE_FILE_NAME_SUFFIX = "_text.bin";

    @Nullable
    private RecordEntity recordEntity;

    @Nullable
    private TextRecordEntity textRecordEntity;

    @Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/dataRecorder/TextSourceRecord$Companion;", "", "()V", "SOURCE_FILE_NAME_SUFFIX", "", "getTextInfo", "Lcom/zykj/board/EzySource$TextSource$TextInfo;", "pageRootPath", "sourceFileName", "sourceId", "", "getTextSource", "Lcom/zykj/board/EzySource$TextSource;", "fileName", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final EzySource$TextSource.TextInfo getTextInfo(@NotNull String pageRootPath, @NotNull String sourceFileName, int sourceId) {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
            EzySource$TextSource.TextInfo textInfo = getTextSource(pageRootPath, sourceFileName).getTextInfoList().get(sourceId);
            AbstractC5830k.m5329f(textInfo, "this.textInfoList[sourceId]");
            return textInfo;
        }

        @NotNull
        public final EzySource$TextSource getTextSource(@NotNull String pageRootPath, @NotNull String fileName) throws IOException {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(fileName, "fileName");
            File file = new File(pageRootPath, fileName);
            if (!file.exists()) {
                throw new FileNotFoundException(file.getPath());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzySource$TextSource record = EzySource$TextSource.parseFrom(fileInputStream);
            fileInputStream.close();
            AbstractC5830k.m5329f(record, "record");
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
                AbstractC5830k.m5327d(textRecordEntity);
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
        return (recordEntity == null || (textList = recordEntity.getTextList()) == null || (textRecordEntity = (TextRecordEntity) AbstractC5805t.m5236p0(textList)) == null || textRecordEntity.getTextInfoEntityList().size() >= 100) ? buildRecordEntity() : textRecordEntity;
    }

    @Nullable
    public final CommonSourceResult addText(@NotNull String content, @NotNull EzyPaint$Paint paint) {
        CommonSourceResult commonSourceResult;
        AbstractC5830k.m5330g(content, "content");
        AbstractC5830k.m5330g(paint, "paint");
        TextRecordEntity textRecordEntity = this.textRecordEntity;
        if (textRecordEntity != null) {
            TextInfoEntity textInfoEntity = new TextInfoEntity(0L, paint.getWidth(), paint.getColor(), paint.getTextSize(), paint.getStyle(), content);
            textInfoEntity.getRecord().setTarget(textRecordEntity);
            textInfoEntity.put();
            textRecordEntity.getTextInfoEntityList().add(textInfoEntity);
            textRecordEntity.put();
            commonSourceResult = new CommonSourceResult(textRecordEntity.getFileName(), textRecordEntity.getTextInfoEntityList().indexOfId(textInfoEntity.getId()));
        } else {
            commonSourceResult = null;
        }
        checkLength();
        return commonSourceResult;
    }

    public final void setRecord(@NotNull RecordEntity recordEntity) {
        AbstractC5830k.m5330g(recordEntity, "recordEntity");
        this.recordEntity = recordEntity;
        this.textRecordEntity = initRecordEntity();
    }
}
