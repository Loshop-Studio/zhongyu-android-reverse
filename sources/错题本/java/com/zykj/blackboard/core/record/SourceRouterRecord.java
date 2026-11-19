package com.zykj.blackboard.core.record;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.dataRecorder.AudioRecord;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/SourceRouterRecord;", "", "Lcom/zykj/blackboard/core/record/TimeRecord;", "timeRecord", "<init>", "(Lcom/zykj/blackboard/core/record/TimeRecord;)V", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "record", "Ld6/s;", "initRecord", "(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)V", "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;", "getCommandRecord", "()Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;", "Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;", "getAudioRecord", "()Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;", "Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "getRecord", "()Lcom/zykj/blackboard/core/data/dao/RecordEntity;", "setRecord", "commandRecord", "Lcom/zykj/blackboard/core/record/dataRecorder/CommandRecord;", "audioCommandRecord", "Lcom/zykj/blackboard/core/record/dataRecorder/AudioRecord;", "", "getCanSave", "()Z", "canSave", "Companion", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SourceRouterRecord {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String SOURCE_RES_IMAGE = "res";

    @NotNull
    private final AudioRecord audioCommandRecord;

    @NotNull
    private final CommandRecord commandRecord;

    @Nullable
    private RecordEntity record;

    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m5110d2 = {"Lcom/zykj/blackboard/core/record/SourceRouterRecord$Companion;", "", "()V", "SOURCE_RES_IMAGE", "", "getResPath", "pageRootPath", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Lcom/zykj/blackboard/enums/DocumentType;", "getResRootPath", "getRouter", "Lcom/zykj/board/EzyRouterRecord$RouterRecord;", "path", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        private final String getResRootPath(String pageRootPath) {
            String absolutePath = new File(new File(pageRootPath).getParent(), SourceRouterRecord.SOURCE_RES_IMAGE).getAbsolutePath();
            AbstractC5830k.m5329f(absolutePath, "File(File(pageRootPath).…E_RES_IMAGE).absolutePath");
            return absolutePath;
        }

        @NotNull
        public final String getResPath(@NotNull String pageRootPath, @NotNull DocumentType type) {
            AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
            AbstractC5830k.m5330g(type, "type");
            String resRootPath = getResRootPath(pageRootPath);
            String strName = type.name();
            Locale ROOT = Locale.ROOT;
            AbstractC5830k.m5329f(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            AbstractC5830k.m5329f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String absolutePath = new File(resRootPath, lowerCase).getAbsolutePath();
            AbstractC5830k.m5329f(absolutePath, "File(\n                ge…           ).absolutePath");
            return absolutePath;
        }

        @NotNull
        public final EzyRouterRecord$RouterRecord getRouter(@NotNull String path) throws IOException {
            AbstractC5830k.m5330g(path, "path");
            File file = new File(path, SourceSave.ROUTER_FILE_NAME);
            if (!file.exists()) {
                throw new FileNotFoundException(path);
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            EzyRouterRecord$RouterRecord record = EzyRouterRecord$RouterRecord.parseFrom(fileInputStream);
            fileInputStream.close();
            AbstractC5830k.m5329f(record, "record");
            return record;
        }

        private Companion() {
        }
    }

    public SourceRouterRecord(@NotNull TimeRecord timeRecord) {
        AbstractC5830k.m5330g(timeRecord, "timeRecord");
        this.commandRecord = new CommandRecord(timeRecord);
        this.audioCommandRecord = new AudioRecord(timeRecord);
    }

    @NotNull
    /* renamed from: getAudioRecord, reason: from getter */
    public final AudioRecord getAudioCommandRecord() {
        return this.audioCommandRecord;
    }

    public final boolean getCanSave() {
        return this.commandRecord.isExecutorsTaskDone();
    }

    @NotNull
    public final CommandRecord getCommandRecord() {
        return this.commandRecord;
    }

    @Nullable
    public final RecordEntity getRecord() {
        return this.record;
    }

    public final void initRecord(@NotNull RecordEntity record) {
        AbstractC5830k.m5330g(record, "record");
        this.record = record;
        this.commandRecord.setRecord(record);
        this.audioCommandRecord.setRecord(record);
    }

    public final void setRecord(@Nullable RecordEntity recordEntity) {
        this.record = recordEntity;
    }
}
