package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class GeometryPointFEntityCursor extends Cursor<GeometryPointFEntity> {

    /* renamed from: j */
    public static final GeometryPointFEntity_.C6988a f8645j = GeometryPointFEntity_.f8651c;

    /* renamed from: k */
    public static final int f8646k = GeometryPointFEntity_.f8654f.f14006c;

    /* renamed from: l */
    public static final int f8647l = GeometryPointFEntity_.f8655g.f14006c;

    /* renamed from: m */
    public static final int f8648m = GeometryPointFEntity_.f8656h.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryPointFEntityCursor$a */
    public static final class C6986a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new GeometryPointFEntityCursor(transaction, j9, boxStore);
        }
    }

    public GeometryPointFEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, GeometryPointFEntity_.f8652d, boxStore);
    }

    /* renamed from: r */
    public final void m7499r(GeometryPointFEntity geometryPointFEntity) {
        geometryPointFEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(GeometryPointFEntity geometryPointFEntity) {
        return f8645j.mo2406a(geometryPointFEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(GeometryPointFEntity geometryPointFEntity) {
        ToOne<GeometryInfoEntity> toOne = geometryPointFEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(GeometryInfoEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        long jCollect002033 = Cursor.collect002033(this.f13997b, geometryPointFEntity.getId(), 3, f8648m, geometryPointFEntity.record.m13185n(), 0, 0L, f8646k, geometryPointFEntity.getX(), f8647l, geometryPointFEntity.getY(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryPointFEntity.m7498f(jCollect002033);
        m7499r(geometryPointFEntity);
        return jCollect002033;
    }
}
