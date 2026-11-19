package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p225kc.InterfaceC9909b;

/* loaded from: classes5.dex */
public final class GeometryPointFEntityCursor extends Cursor<GeometryPointFEntity> {

    /* renamed from: l */
    public static final GeometryPointFEntity_.C8368a f18206l = GeometryPointFEntity_.f18212e;

    /* renamed from: m */
    public static final int f18207m = GeometryPointFEntity_.f18215h.f22265e;

    /* renamed from: n */
    public static final int f18208n = GeometryPointFEntity_.f18216i.f22265e;

    /* renamed from: o */
    public static final int f18209o = GeometryPointFEntity_.f18217j.f22265e;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryPointFEntityCursor$a */
    public static final class C8366a implements InterfaceC9909b {
        @Override // p225kc.InterfaceC9909b
        /* renamed from: a */
        public Cursor mo13991a(Transaction transaction, long j10, BoxStore boxStore) {
            return new GeometryPointFEntityCursor(transaction, j10, boxStore);
        }
    }

    public GeometryPointFEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, GeometryPointFEntity_.f18213f, boxStore);
    }

    /* renamed from: u */
    public final void m14126u(GeometryPointFEntity geometryPointFEntity) {
        geometryPointFEntity.__boxStore = this.f22258f;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final long mo13986i(GeometryPointFEntity geometryPointFEntity) {
        return f18206l.mo14001a(geometryPointFEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final long mo13987s(GeometryPointFEntity geometryPointFEntity) {
        ToOne<GeometryInfoEntity> toOne = geometryPointFEntity.record;
        if (toOne != null && toOne.m19041m()) {
            Cursor cursorM18975l = m18975l(GeometryInfoEntity.class);
            try {
                toOne.m19040k(cursorM18975l);
            } finally {
                cursorM18975l.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.f22256d, geometryPointFEntity.m14120a(), 3, f18209o, geometryPointFEntity.record.m19038f(), 0, 0L, f18207m, geometryPointFEntity.m14122c(), f18208n, geometryPointFEntity.m14123d(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryPointFEntity.m14125f(jCollect002033);
        m14126u(geometryPointFEntity);
        return jCollect002033;
    }
}
