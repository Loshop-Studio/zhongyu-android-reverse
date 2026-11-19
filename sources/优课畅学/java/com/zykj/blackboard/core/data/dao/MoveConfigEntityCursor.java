package com.zykj.blackboard.core.data.dao;

import com.zykj.blackboard.core.data.dao.MoveConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class MoveConfigEntityCursor extends Cursor<MoveConfigEntity> {
    private static final MoveConfigEntity_.MoveConfigEntityIdGetter ID_GETTER = MoveConfigEntity_.__ID_GETTER;
    private static final int __ID_isEnable = MoveConfigEntity_.isEnable.f16872c;
    private static final int __ID_verticalTranslate = MoveConfigEntity_.verticalTranslate.f16872c;
    private static final int __ID_horizontalTranslate = MoveConfigEntity_.horizontalTranslate.f16872c;
    private static final int __ID_scale = MoveConfigEntity_.scale.f16872c;
    private static final int __ID_rotate = MoveConfigEntity_.rotate.f16872c;
    private static final int __ID_maxHeightTimes = MoveConfigEntity_.maxHeightTimes.f16872c;
    private static final int __ID_maxWidthTimes = MoveConfigEntity_.maxWidthTimes.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<MoveConfigEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new MoveConfigEntityCursor(transaction, j10, boxStore);
        }
    }

    public MoveConfigEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, MoveConfigEntity_.__INSTANCE, boxStore);
    }

    @Override // io.objectbox.Cursor
    public final long getId(MoveConfigEntity moveConfigEntity) {
        return ID_GETTER.getId(moveConfigEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(MoveConfigEntity moveConfigEntity) {
        Cursor.collect004000(this.cursor, 0L, 1, __ID_maxHeightTimes, moveConfigEntity.getMaxHeightTimes(), __ID_maxWidthTimes, moveConfigEntity.getMaxWidthTimes(), __ID_isEnable, moveConfigEntity.isEnable() ? 1L : 0L, __ID_verticalTranslate, moveConfigEntity.getVerticalTranslate() ? 1L : 0L);
        long jCollect004000 = Cursor.collect004000(this.cursor, moveConfigEntity.getId(), 2, __ID_horizontalTranslate, moveConfigEntity.getHorizontalTranslate() ? 1L : 0L, __ID_scale, moveConfigEntity.getScale() ? 1L : 0L, __ID_rotate, moveConfigEntity.getRotate() ? 1L : 0L, 0, 0L);
        moveConfigEntity.setId(jCollect004000);
        return jCollect004000;
    }
}
