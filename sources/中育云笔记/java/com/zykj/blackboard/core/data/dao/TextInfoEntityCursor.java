package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class TextInfoEntityCursor extends Cursor<TextInfoEntity> {

    /* renamed from: l */
    public static final TextInfoEntity_.C8418a f18412l = TextInfoEntity_.f18421e;

    /* renamed from: m */
    public static final int f18413m = TextInfoEntity_.f18424h.f22265e;

    /* renamed from: n */
    public static final int f18414n = TextInfoEntity_.f18425i.f22265e;

    /* renamed from: o */
    public static final int f18415o = TextInfoEntity_.f18426j.f22265e;

    /* renamed from: p */
    public static final int f18416p = TextInfoEntity_.f18427k.f22265e;

    /* renamed from: q */
    public static final int f18417q = TextInfoEntity_.f18428l.f22265e;

    /* renamed from: r */
    public static final int f18418r = TextInfoEntity_.f18429m.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextInfoEntityCursor$a */
    public static final class C8416a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TextInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public TextInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TextInfoEntity_.f18422f, boxStore);
    }

    /* renamed from: u */
    public final void m14296u(TextInfoEntity textInfoEntity) {
        textInfoEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(TextInfoEntity textInfoEntity) {
        return f18412l.mo14001a(textInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(TextInfoEntity textInfoEntity) {
        ToOne<TextRecordEntity> toOne = textInfoEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(TextRecordEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        String strM14288b = textInfoEntity.m14288b();
        Cursor.collect313311(this.f22256d, 0L, 1, strM14288b != null ? f18417q : 0, strM14288b, 0, null, 0, null, 0, null, f18418r, textInfoEntity.record.m19038f(), f18414n, textInfoEntity.m14287a(), f18416p, textInfoEntity.m14291e(), 0, 0, 0, 0, 0, 0, f18413m, textInfoEntity.m14293g(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f22256d, textInfoEntity.m14289c(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f18415o, textInfoEntity.m14292f(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textInfoEntity.m14295i(jCollect313311);
        m14296u(textInfoEntity);
        return jCollect313311;
    }
}
