package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.BackgroundLineConfigEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class BackgroundLineConfigEntityCursor extends Cursor<BackgroundLineConfigEntity> {
    private static final BackgroundLineConfigEntity_.BackgroundLineConfigEntityIdGetter ID_GETTER = BackgroundLineConfigEntity_.__ID_GETTER;
    private static final int __ID_lineColor = BackgroundLineConfigEntity_.lineColor.f8916id;
    private static final int __ID_lineSpace = BackgroundLineConfigEntity_.lineSpace.f8916id;
    private static final int __ID_lineType = BackgroundLineConfigEntity_.lineType.f8916id;
    private static final int __ID_lineWidth = BackgroundLineConfigEntity_.lineWidth.f8916id;
    private final BackgroundLineTypeEnumConverter lineTypeConverter;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<BackgroundLineConfigEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new BackgroundLineConfigEntityCursor(transaction, j7, boxStore);
        }
    }

    public BackgroundLineConfigEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, BackgroundLineConfigEntity_.__INSTANCE, boxStore);
        this.lineTypeConverter = new BackgroundLineTypeEnumConverter();
    }

    @Override // io.objectbox.Cursor
    public final long getId(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        return ID_GETTER.getId(backgroundLineConfigEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(BackgroundLineConfigEntity backgroundLineConfigEntity) {
        int i = backgroundLineConfigEntity.getLineType() != null ? __ID_lineType : 0;
        long jCollect002033 = Cursor.collect002033(this.cursor, backgroundLineConfigEntity.getId(), 3, __ID_lineColor, backgroundLineConfigEntity.getLineColor(), i, i != 0 ? this.lineTypeConverter.convertToDatabaseValue(r1).intValue() : 0L, __ID_lineSpace, backgroundLineConfigEntity.getLineSpace(), __ID_lineWidth, backgroundLineConfigEntity.getLineWidth(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        backgroundLineConfigEntity.setId(jCollect002033);
        return jCollect002033;
    }
}
