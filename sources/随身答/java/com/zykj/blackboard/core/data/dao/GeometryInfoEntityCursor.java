package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p037c8.InterfaceC5267b;

/* loaded from: classes4.dex */
public final class GeometryInfoEntityCursor extends Cursor<GeometryInfoEntity> {

    /* renamed from: j */
    public static final GeometryInfoEntity_.C6985a f8620j = GeometryInfoEntity_.f8629c;

    /* renamed from: k */
    public static final int f8621k = GeometryInfoEntity_.f8632f.f14006c;

    /* renamed from: l */
    public static final int f8622l = GeometryInfoEntity_.f8633g.f14006c;

    /* renamed from: m */
    public static final int f8623m = GeometryInfoEntity_.f8634h.f14006c;

    /* renamed from: n */
    public static final int f8624n = GeometryInfoEntity_.f8635i.f14006c;

    /* renamed from: o */
    public static final int f8625o = GeometryInfoEntity_.f8636j.f14006c;

    /* renamed from: p */
    public static final int f8626p = GeometryInfoEntity_.f8637k.f14006c;

    /* renamed from: com.zykj.blackboard.core.data.dao.GeometryInfoEntityCursor$a */
    public static final class C6982a implements InterfaceC5267b {
        @Override // p037c8.InterfaceC5267b
        /* renamed from: a */
        public Cursor mo2405a(Transaction transaction, long j9, BoxStore boxStore) {
            return new GeometryInfoEntityCursor(transaction, j9, boxStore);
        }
    }

    public GeometryInfoEntityCursor(Transaction transaction, long j9, BoxStore boxStore) {
        super(transaction, j9, GeometryInfoEntity_.f8630d, boxStore);
    }

    /* renamed from: r */
    public final void m7487r(GeometryInfoEntity geometryInfoEntity) {
        geometryInfoEntity.__boxStore = this.f13999d;
    }

    @Override // io.objectbox.Cursor
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final long mo7358i(GeometryInfoEntity geometryInfoEntity) {
        return f8620j.mo2406a(geometryInfoEntity);
    }

    @Override // io.objectbox.Cursor
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final long mo7359p(GeometryInfoEntity geometryInfoEntity) {
        ToOne<GeometryRecordEntity> toOne = geometryInfoEntity.record;
        if (toOne != null && toOne.m13188u()) {
            Cursor cursorM13123l = m13123l(GeometryRecordEntity.class);
            try {
                toOne.m13187t(cursorM13123l);
            } finally {
                cursorM13123l.close();
            }
        }
        Cursor.collect313311(this.f13997b, 0L, 1, 0, null, 0, null, 0, null, 0, null, f8626p, geometryInfoEntity.record.m13185n(), f8622l, geometryInfoEntity.getColor(), f8624n, geometryInfoEntity.getStyle(), f8625o, geometryInfoEntity.getGeometryType(), 0, 0, 0, 0, f8621k, geometryInfoEntity.getWidth(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.f13997b, geometryInfoEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, 0, 0L, 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, f8623m, geometryInfoEntity.getTextSize(), 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        geometryInfoEntity.m7486j(jCollect313311);
        m7487r(geometryInfoEntity);
        m13117a(geometryInfoEntity.pointList, GeometryPointFEntity.class);
        return jCollect313311;
    }
}
