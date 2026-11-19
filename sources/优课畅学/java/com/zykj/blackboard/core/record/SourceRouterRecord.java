package com.zykj.blackboard.core.record;

import com.zykj.blackboard.core.data.SourceSave;
import com.zykj.blackboard.core.data.dao.RecordEntity;
import com.zykj.blackboard.core.record.dataRecorder.AudioRecord;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyRouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class SourceRouterRecord {
    public static final Companion Companion = new Companion(null);
    public static final String SOURCE_RES_IMAGE = "res";
    private final AudioRecord audioCommandRecord;
    private final CommandRecord commandRecord;
    private RecordEntity record;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private final String getResRootPath(String str) {
            String absolutePath = new File(new File(str).getParent(), SourceRouterRecord.SOURCE_RES_IMAGE).getAbsolutePath();
            AbstractC9133u.m16132f(absolutePath, "File(File(pageRootPath).…E_RES_IMAGE).absolutePath");
            return absolutePath;
        }

        public final String getResPath(String pageRootPath, DocumentType type) {
            AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
            AbstractC9133u.m16133g(type, "type");
            String resRootPath = getResRootPath(pageRootPath);
            String strName = type.name();
            Locale ROOT = Locale.ROOT;
            AbstractC9133u.m16132f(ROOT, "ROOT");
            String lowerCase = strName.toLowerCase(ROOT);
            AbstractC9133u.m16132f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String absolutePath = new File(resRootPath, lowerCase).getAbsolutePath();
            AbstractC9133u.m16132f(absolutePath, "File(\n                ge…           ).absolutePath");
            return absolutePath;
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

        private Companion() {
        }
    }

    public SourceRouterRecord(TimeRecord timeRecord) {
        AbstractC9133u.m16133g(timeRecord, "timeRecord");
        this.commandRecord = new CommandRecord(timeRecord);
        this.audioCommandRecord = new AudioRecord(timeRecord);
    }

    public final AudioRecord getAudioRecord() {
        return this.audioCommandRecord;
    }

    public final boolean getCanSave() {
        return this.commandRecord.isExecutorsTaskDone();
    }

    public final CommandRecord getCommandRecord() {
        return this.commandRecord;
    }

    public final RecordEntity getRecord() {
        return this.record;
    }

    public final void initRecord(RecordEntity record) {
        AbstractC9133u.m16133g(record, "record");
        this.record = record;
        this.commandRecord.setRecord(record);
        this.audioCommandRecord.setRecord(record);
    }

    public final void setRecord(RecordEntity recordEntity) {
        this.record = recordEntity;
    }
}
