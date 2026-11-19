package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class MoveConfigEntityCursor extends Cursor<MoveConfigEntity> {

    /* renamed from: j */
    public static final MoveConfigEntity_.C7013a f8783j = MoveConfigEntity_.f8793c;

    /* renamed from: k */
    public static final int f8784k = MoveConfigEntity_.f8796f.f14006c;

    /* renamed from: l */
    public static final int f8785l = MoveConfigEntity_.f8797g.f14006c;

    /* renamed from: m */
    public static final int f8786m = MoveConfigEntity_.f8798h.f14006c;

    /* renamed from: n */
    public static final int f8787n = MoveConfigEntity_.f8799i.f14006c;

    /* renamed from: o */
    public static final int f8788o = MoveConfigEntity_.f8800j.f14006c;

    /* renamed from: p */
    public static final int f8789p = MoveConfigEntity_.f8801k.f14006c;

    /* renamed from: q */
    public static final int f8790q = MoveConfigEntity_.f8802l.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MoveConfigEntityCursor$a */
    public static final class C7012a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new MoveConfigEntityCursor(transaction, j9, boxStore);
        }
    }

    public MoveConfigEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, MoveConfigEntity_.f8794d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(MoveConfigEntity moveConfigEntity) {
        return f8783j.mo2406a(moveConfigEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(MoveConfigEntity moveConfigEntity) {
        Cursor.collect004000(this.f13997b, 0L, 1, f8789p, moveConfigEntity.getMaxHeightTimes(), f8790q, moveConfigEntity.getMaxWidthTimes(), f8784k, moveConfigEntity.getIsEnable() ? 1L : 0L, f8785l, moveConfigEntity.getVerticalTranslate() ? 1L : 0L);
        long jCollect004000 = Cursor.collect004000(this.f13997b, moveConfigEntity.getId(), 2, f8786m, moveConfigEntity.getHorizontalTranslate() ? 1L : 0L, f8787n, moveConfigEntity.getScale() ? 1L : 0L, f8788o, moveConfigEntity.getRotate() ? 1L : 0L, 0, 0L);
        moveConfigEntity.m7605k(jCollect004000);
        return jCollect004000;
    }
}
