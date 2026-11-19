package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class TextRecordEntityCursor extends Cursor<TextRecordEntity> {

    /* renamed from: j */
    public static final TextRecordEntity_.C7042a f8873j = TextRecordEntity_.f8879c;

    /* renamed from: k */
    public static final int f8874k = TextRecordEntity_.f8882f.f14006c;

    /* renamed from: l */
    public static final int f8875l = TextRecordEntity_.f8883g.f14006c;

    /* renamed from: m */
    public static final int f8876m = TextRecordEntity_.f8884h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextRecordEntityCursor$a */
    public static final class C7039a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new TextRecordEntityCursor(transaction, j9, boxStore);
        }
    }

    public TextRecordEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, TextRecordEntity_.f8880d, boxStore);
    }

    /* renamed from: r */
    public final void m7680r(TextRecordEntity textRecordEntity) {
        textRecordEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(TextRecordEntity textRecordEntity) {
        return f8873j.mo2406a(textRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(TextRecordEntity textRecordEntity) {
        ToOne<RecordEntity> toOne = textRecordEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(RecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String fileName = textRecordEntity.getFileName();
        int i9 = fileName != null ? f8874k : 0;
        String validate = textRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13997b, textRecordEntity.getId(), 3, i9, fileName, validate != null ? f8875l : 0, validate, 0, null, 0, null, f8876m, textRecordEntity.record.m13185n(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textRecordEntity.m7678f(jCollect313311);
        m7680r(textRecordEntity);
        m13117a(textRecordEntity.textInfoEntityList, TextInfoEntity.class);
        return jCollect313311;
    }
}
