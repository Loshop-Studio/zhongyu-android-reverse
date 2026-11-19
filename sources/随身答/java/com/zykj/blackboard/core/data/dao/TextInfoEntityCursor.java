package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.TextInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class TextInfoEntityCursor extends Cursor<TextInfoEntity> {

    /* renamed from: j */
    public static final TextInfoEntity_.C7038a f8851j = TextInfoEntity_.f8860c;

    /* renamed from: k */
    public static final int f8852k = TextInfoEntity_.f8863f.f14006c;

    /* renamed from: l */
    public static final int f8853l = TextInfoEntity_.f8864g.f14006c;

    /* renamed from: m */
    public static final int f8854m = TextInfoEntity_.f8865h.f14006c;

    /* renamed from: n */
    public static final int f8855n = TextInfoEntity_.f8866i.f14006c;

    /* renamed from: o */
    public static final int f8856o = TextInfoEntity_.f8867j.f14006c;

    /* renamed from: p */
    public static final int f8857p = TextInfoEntity_.f8868k.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.TextInfoEntityCursor$a */
    public static final class C7036a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new TextInfoEntityCursor(transaction, j9, boxStore);
        }
    }

    public TextInfoEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, TextInfoEntity_.f8861d, boxStore);
    }

    /* renamed from: r */
    public final void m7668r(TextInfoEntity textInfoEntity) {
        textInfoEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(TextInfoEntity textInfoEntity) {
        return f8851j.mo2406a(textInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(TextInfoEntity textInfoEntity) {
        ToOne<TextRecordEntity> toOne = textInfoEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(TextRecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        String content = textInfoEntity.getContent();
        Cursor.collect313311(this.f13997b, 0L, 1, content != null ? f8856o : 0, content, 0, null, 0, null, 0, null, f8857p, textInfoEntity.record.m13185n(), f8853l, textInfoEntity.getColor(), f8855n, textInfoEntity.getStyle(), 0, 0, 0, 0, 0, 0, f8852k, textInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13997b, textInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f8854m, textInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        textInfoEntity.m7667i(jCollect313311);
        m7668r(textInfoEntity);
        return jCollect313311;
    }
}
