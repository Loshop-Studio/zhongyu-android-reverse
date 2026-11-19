package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225r8.InterfaceC9047b;

/* loaded from: classes4.dex */
public final class MoveConfigEntityCursor extends Cursor<MoveConfigEntity> {

    /* renamed from: j */
    public static final MoveConfigEntity_.C6696a f7501j = MoveConfigEntity_.f7511c;

    /* renamed from: k */
    public static final int f7502k = MoveConfigEntity_.f7514f.f13192c;

    /* renamed from: l */
    public static final int f7503l = MoveConfigEntity_.f7515g.f13192c;

    /* renamed from: m */
    public static final int f7504m = MoveConfigEntity_.f7516h.f13192c;

    /* renamed from: n */
    public static final int f7505n = MoveConfigEntity_.f7517i.f13192c;

    /* renamed from: o */
    public static final int f7506o = MoveConfigEntity_.f7518j.f13192c;

    /* renamed from: p */
    public static final int f7507p = MoveConfigEntity_.f7519k.f13192c;

    /* renamed from: q */
    public static final int f7508q = MoveConfigEntity_.f7520l.f13192c;

    /* renamed from: com.zykj.blackboard.core.data.dao.MoveConfigEntityCursor$a */
    public static final class C6695a implements InterfaceC9047b {
        @Override // p225r8.InterfaceC9047b
        /* renamed from: a */
        public Cursor mo6269a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MoveConfigEntityCursor(transaction, j10, boxStore);
        }
    }

    public MoveConfigEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MoveConfigEntity_.f7512d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final long mo6264i(MoveConfigEntity moveConfigEntity) {
        return f7501j.mo6279a(moveConfigEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo6265p(MoveConfigEntity moveConfigEntity) {
        Cursor.collect004000(this.f13183b, 0L, 1, f7507p, moveConfigEntity.getMaxHeightTimes(), f7508q, moveConfigEntity.getMaxWidthTimes(), f7502k, moveConfigEntity.getIsEnable() ? 1L : 0L, f7503l, moveConfigEntity.getVerticalTranslate() ? 1L : 0L);
        long jCollect004000 = Cursor.collect004000(this.f13183b, moveConfigEntity.getId(), 2, f7504m, moveConfigEntity.getHorizontalTranslate() ? 1L : 0L, f7505n, moveConfigEntity.getScale() ? 1L : 0L, f7506o, moveConfigEntity.getRotate() ? 1L : 0L, 0, 0L);
        moveConfigEntity.m6503k(jCollect004000);
        return jCollect004000;
    }
}
