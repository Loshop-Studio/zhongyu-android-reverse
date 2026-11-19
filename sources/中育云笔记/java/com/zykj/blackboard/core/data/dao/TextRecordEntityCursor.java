package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextRecordEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class TextRecordEntityCursor extends Cursor<TextRecordEntity> {

    /* renamed from: l */
    public static final TextRecordEntity_.C8422a f18434l = TextRecordEntity_.f18440e;

    /* renamed from: m */
    public static final int f18435m = TextRecordEntity_.f18443h.f22265e;

    /* renamed from: n */
    public static final int f18436n = TextRecordEntity_.f18444i.f22265e;

    /* renamed from: o */
    public static final int f18437o = TextRecordEntity_.f18445j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextRecordEntityCursor$a */
    public static final class C8419a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TextRecordEntityCursor(transaction, j10, boxStore);
        }
    }

    public TextRecordEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TextRecordEntity_.f18441f, boxStore);
    }

    /* renamed from: u */
    public final void m14308u(TextRecordEntity textRecordEntity) {
        textRecordEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(TextRecordEntity textRecordEntity) {
        return f18434l.mo14001a(textRecordEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(TextRecordEntity textRecordEntity) {
        ToOne<RecordEntity> toOne = textRecordEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(RecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14301a = textRecordEntity.m14301a();
        int i10 = strM14301a != null ? f18435m : 0;
        String strM14304d = textRecordEntity.m14304d();
        long jCollect313311 = Cursor.collect313311(this.f22256d, textRecordEntity.m14302b(), 3, i10, strM14301a, strM14304d != null ? f18436n : 0, strM14304d, 0, null, 0, null, f18437o, textRecordEntity.record.m19038f(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textRecordEntity.m14306f(jCollect313311);
        m14308u(textRecordEntity);
        m18968a(textRecordEntity.textInfoEntityList, TextInfoEntity.class);
        return jCollect313311;
    }
}
