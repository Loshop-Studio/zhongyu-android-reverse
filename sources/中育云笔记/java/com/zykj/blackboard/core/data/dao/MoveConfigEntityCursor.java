package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class MoveConfigEntityCursor extends Cursor<MoveConfigEntity> {

    /* renamed from: l */
    public static final MoveConfigEntity_.C8393a f18344l = MoveConfigEntity_.f18354e;

    /* renamed from: m */
    public static final int f18345m = MoveConfigEntity_.f18357h.f22265e;

    /* renamed from: n */
    public static final int f18346n = MoveConfigEntity_.f18358i.f22265e;

    /* renamed from: o */
    public static final int f18347o = MoveConfigEntity_.f18359j.f22265e;

    /* renamed from: p */
    public static final int f18348p = MoveConfigEntity_.f18360k.f22265e;

    /* renamed from: q */
    public static final int f18349q = MoveConfigEntity_.f18361l.f22265e;

    /* renamed from: r */
    public static final int f18350r = MoveConfigEntity_.f18362m.f22265e;

    /* renamed from: s */
    public static final int f18351s = MoveConfigEntity_.f18363n.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.MoveConfigEntityCursor$a */
    public static final class C8392a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MoveConfigEntityCursor(transaction, j10, boxStore);
        }
    }

    public MoveConfigEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MoveConfigEntity_.f18355f, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(MoveConfigEntity moveConfigEntity) {
        return f18344l.mo14001a(moveConfigEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(MoveConfigEntity moveConfigEntity) {
        Cursor.collect004000(this.f22256d, 0L, 1, f18350r, moveConfigEntity.m14224c(), f18351s, moveConfigEntity.m14225d(), f18345m, moveConfigEntity.m14229h() ? 1L : 0L, f18346n, moveConfigEntity.m14228g() ? 1L : 0L);
        long jCollect004000 = Cursor.collect004000(this.f22256d, moveConfigEntity.m14223b(), 2, f18347o, moveConfigEntity.m14222a() ? 1L : 0L, f18348p, moveConfigEntity.m14227f() ? 1L : 0L, f18349q, moveConfigEntity.m14226e() ? 1L : 0L, 0, 0L);
        moveConfigEntity.m14232k(jCollect004000);
        return jCollect004000;
    }
}
