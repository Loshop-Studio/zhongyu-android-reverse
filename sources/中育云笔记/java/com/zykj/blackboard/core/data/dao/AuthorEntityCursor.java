package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.AuthorEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class AuthorEntityCursor extends Cursor<AuthorEntity> {

    /* renamed from: l */
    public static final AuthorEntity_.C8341a f18053l = AuthorEntity_.f18062e;

    /* renamed from: m */
    public static final int f18054m = AuthorEntity_.f18065h.f22265e;

    /* renamed from: n */
    public static final int f18055n = AuthorEntity_.f18066i.f22265e;

    /* renamed from: o */
    public static final int f18056o = AuthorEntity_.f18067j.f22265e;

    /* renamed from: p */
    public static final int f18057p = AuthorEntity_.f18068k.f22265e;

    /* renamed from: q */
    public static final int f18058q = AuthorEntity_.f18069l.f22265e;

    /* renamed from: r */
    public static final int f18059r = AuthorEntity_.f18070m.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.AuthorEntityCursor$a */
    public static final class C8340a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new AuthorEntityCursor(transaction, j10, boxStore);
        }
    }

    public AuthorEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, AuthorEntity_.f18063f, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(AuthorEntity authorEntity) {
        return f18053l.mo14001a(authorEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(AuthorEntity authorEntity) {
        String strM14018b = authorEntity.m14018b();
        int i10 = strM14018b != null ? f18054m : 0;
        String strM14017a = authorEntity.m14017a();
        int i11 = strM14017a != null ? f18055n : 0;
        String strM14021e = authorEntity.m14021e();
        int i12 = strM14021e != null ? f18056o : 0;
        String strM14023g = authorEntity.m14023g();
        Cursor.collect400000(this.f22256d, 0L, 1, i10, strM14018b, i11, strM14017a, i12, strM14021e, strM14023g != null ? f18057p : 0, strM14023g);
        Long lM14022f = authorEntity.m14022f();
        int i13 = lM14022f != null ? f18058q : 0;
        Long lM14019c = authorEntity.m14019c();
        int i14 = lM14019c != null ? f18059r : 0;
        long jCollect004000 = Cursor.collect004000(this.f22256d, authorEntity.m14020d(), 2, i13, i13 != 0 ? lM14022f.longValue() : 0L, i14, i14 != 0 ? lM14019c.longValue() : 0L, 0, 0L, 0, 0L);
        authorEntity.m14025i(jCollect004000);
        return jCollect004000;
    }
}
