package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.HeaderEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.relation.ToOne;
import java.io.Closeable;
import p116m5.InterfaceC6109a;

/* loaded from: classes3.dex */
public final class HeaderEntityCursor extends Cursor<HeaderEntity> {
    private static final HeaderEntity_.HeaderEntityIdGetter ID_GETTER = HeaderEntity_.__ID_GETTER;
    private static final int __ID_version = HeaderEntity_.version.f8916id;
    private static final int __ID_width = HeaderEntity_.width.f8916id;
    private static final int __ID_height = HeaderEntity_.height.f8916id;
    private static final int __ID_createDate = HeaderEntity_.createDate.f8916id;
    private static final int __ID_updateDate = HeaderEntity_.updateDate.f8916id;
    private static final int __ID_duration = HeaderEntity_.duration.f8916id;
    private static final int __ID_convertUrl = HeaderEntity_.convertUrl.f8916id;
    private static final int __ID_defaultBackgroundColor = HeaderEntity_.defaultBackgroundColor.f8916id;
    private static final int __ID_lastBackgroundColor = HeaderEntity_.lastBackgroundColor.f8916id;
    private static final int __ID_pageId = HeaderEntity_.pageId.f8916id;
    private static final int __ID_defaultBackgroundLineConfigId = HeaderEntity_.defaultBackgroundLineConfigId.f8916id;
    private static final int __ID_lastBackgroundLineConfigId = HeaderEntity_.lastBackgroundLineConfigId.f8916id;
    private static final int __ID_authorId = HeaderEntity_.authorId.f8916id;
    private static final int __ID_moveConfigId = HeaderEntity_.moveConfigId.f8916id;

    @Internal
    public static final class Factory implements InterfaceC6109a {
        @Override // p116m5.InterfaceC6109a
        public Cursor<HeaderEntity> createCursor(Transaction transaction, long j7, BoxStore boxStore) {
            return new HeaderEntityCursor(transaction, j7, boxStore);
        }
    }

    public HeaderEntityCursor(Transaction transaction, long j7, BoxStore boxStore) {
        super(transaction, j7, HeaderEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(HeaderEntity headerEntity) {
        headerEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(HeaderEntity headerEntity) {
        return ID_GETTER.getId(headerEntity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.objectbox.Cursor
    public final long put(HeaderEntity headerEntity) {
        Closeable relationTargetCursor;
        ToOne<PageEntity> toOne = headerEntity.page;
        if (toOne != 0 && toOne.internalRequiresPutTarget()) {
            relationTargetCursor = getRelationTargetCursor(PageEntity.class);
            try {
                toOne.internalPutTarget(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne2 = headerEntity.defaultBackgroundLineConfig;
        if (toOne2 != 0 && toOne2.internalRequiresPutTarget()) {
            relationTargetCursor = getRelationTargetCursor(BackgroundLineConfigEntity.class);
            try {
                toOne2.internalPutTarget(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne3 = headerEntity.lastBackgroundLineConfig;
        if (toOne3 != 0 && toOne3.internalRequiresPutTarget()) {
            relationTargetCursor = getRelationTargetCursor(BackgroundLineConfigEntity.class);
            try {
                toOne3.internalPutTarget(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<AuthorEntity> toOne4 = headerEntity.author;
        if (toOne4 != 0 && toOne4.internalRequiresPutTarget()) {
            relationTargetCursor = getRelationTargetCursor(AuthorEntity.class);
            try {
                toOne4.internalPutTarget(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<MoveConfigEntity> toOne5 = headerEntity.moveConfig;
        if (toOne5 != 0 && toOne5.internalRequiresPutTarget()) {
            try {
                toOne5.internalPutTarget(getRelationTargetCursor(MoveConfigEntity.class));
            } finally {
            }
        }
        String convertUrl = headerEntity.getConvertUrl();
        Cursor.collect313311(this.cursor, 0L, 1, convertUrl != null ? __ID_convertUrl : 0, convertUrl, 0, null, 0, null, 0, null, __ID_createDate, headerEntity.getCreateDate(), __ID_updateDate, headerEntity.getUpdateDate(), __ID_duration, headerEntity.getDuration(), __ID_version, headerEntity.getVersion(), __ID_width, headerEntity.getWidth(), __ID_height, headerEntity.getHeight(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect313311(this.cursor, 0L, 0, 0, null, 0, null, 0, null, 0, null, __ID_pageId, headerEntity.page.getTargetId(), __ID_defaultBackgroundLineConfigId, headerEntity.defaultBackgroundLineConfig.getTargetId(), __ID_lastBackgroundLineConfigId, headerEntity.lastBackgroundLineConfig.getTargetId(), __ID_defaultBackgroundColor, headerEntity.getDefaultBackgroundColor(), __ID_lastBackgroundColor, headerEntity.getLastBackgroundColor(), 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, headerEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, __ID_authorId, headerEntity.author.getTargetId(), __ID_moveConfigId, headerEntity.moveConfig.getTargetId(), 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        headerEntity.setId(jCollect313311);
        attachEntity(headerEntity);
        checkApplyToManyToDb(headerEntity.provider, AuthorEntity.class);
        return jCollect313311;
    }
}
