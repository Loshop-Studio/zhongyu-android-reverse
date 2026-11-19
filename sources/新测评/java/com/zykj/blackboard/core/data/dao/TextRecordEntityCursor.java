package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class TextRecordEntityCursor extends Cursor<TextRecordEntity> {

    /* renamed from: j */
    public static final TextRecordEntity_.C6725a f7591j = TextRecordEntity_.f7597c;

    /* renamed from: k */
    public static final int f7592k = TextRecordEntity_.f7600f.f13192c;

    /* renamed from: l */
    public static final int f7593l = TextRecordEntity_.f7601g.f13192c;

    /* renamed from: m */
    public static final int f7594m = TextRecordEntity_.f7602h.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextRecordEntityCursor$a */
    public static final class C6722a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TextRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public TextRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TextRecordEntity_.f7598d, boxStore);
    }

    /* renamed from: r */
    public final void m6577r(TextRecordEntity textRecordEntity) {
        textRecordEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(TextRecordEntity textRecordEntity) {
        return f7591j.mo6279a(textRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(TextRecordEntity textRecordEntity) {
        ToOne<RecordEntity> toOne = textRecordEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(RecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String fileName = textRecordEntity.getFileName();
        int i10 = fileName != null ? f7592k : 0;
        String validate = textRecordEntity.getValidate();
        long jCollect313311 = Cursor.collect313311(this.f13183b, textRecordEntity.getId(), 3, i10, fileName, validate != null ? f7593l : 0, validate, 0, null, 0, null, f7594m, textRecordEntity.record.m13066m(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textRecordEntity.m6576f(jCollect313311);
        m6577r(textRecordEntity);
        m12997a(textRecordEntity.textInfoEntityList, TextInfoEntity.class);
        return jCollect313311;
    }
}
