package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class TextInfoEntityCursor extends Cursor<TextInfoEntity> {

    /* renamed from: j */
    public static final TextInfoEntity_.C6721a f7569j = TextInfoEntity_.f7578c;

    /* renamed from: k */
    public static final int f7570k = TextInfoEntity_.f7581f.f13192c;

    /* renamed from: l */
    public static final int f7571l = TextInfoEntity_.f7582g.f13192c;

    /* renamed from: m */
    public static final int f7572m = TextInfoEntity_.f7583h.f13192c;

    /* renamed from: n */
    public static final int f7573n = TextInfoEntity_.f7584i.f13192c;

    /* renamed from: o */
    public static final int f7574o = TextInfoEntity_.f7585j.f13192c;

    /* renamed from: p */
    public static final int f7575p = TextInfoEntity_.f7586k.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextInfoEntityCursor$a */
    public static final class C6719a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new TextInfoEntityCursor(transaction, j10, boxStore);
        }
    }

    public TextInfoEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, TextInfoEntity_.f7579d, boxStore);
    }

    /* renamed from: r */
    public final void m6566r(TextInfoEntity textInfoEntity) {
        textInfoEntity.__boxStore = this.f13185d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(TextInfoEntity textInfoEntity) {
        return f7569j.mo6279a(textInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(TextInfoEntity textInfoEntity) {
        ToOne<TextRecordEntity> toOne = textInfoEntity.record;
        if (toOne != null && toOne.m13069r()) {
            Cursor cursorM13003l = m13003l(TextRecordEntity.class);
            try {
                toOne.m13068q(cursorM13003l);
            } finally {
                cursorM13003l.close();
            }
        }
        String content = textInfoEntity.getContent();
        Cursor.collect313311(this.f13183b, 0L, 1, content != null ? f7574o : 0, content, 0, null, 0, null, 0, null, f7575p, textInfoEntity.record.m13066m(), f7571l, textInfoEntity.getColor(), f7573n, textInfoEntity.getStyle(), 0, 0, 0, 0, 0, 0, f7570k, textInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13183b, textInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f7572m, textInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textInfoEntity.m6565i(jCollect313311);
        m6566r(textInfoEntity);
        return jCollect313311;
    }
}
