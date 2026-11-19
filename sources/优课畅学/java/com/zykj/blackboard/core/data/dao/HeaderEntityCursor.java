package com.zykj.blackboard.core.data.dao;

import androidx.camera.video.AudioStats;
import com.zykj.blackboard.core.data.dao.HeaderEntity_;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import io.objectbox.relation.ToOne;
import p189n6.InterfaceC9429b;

/* loaded from: classes4.dex */
public final class HeaderEntityCursor extends Cursor<HeaderEntity> {
    private static final HeaderEntity_.HeaderEntityIdGetter ID_GETTER = HeaderEntity_.__ID_GETTER;
    private static final int __ID_version = HeaderEntity_.version.f16872c;
    private static final int __ID_width = HeaderEntity_.width.f16872c;
    private static final int __ID_height = HeaderEntity_.height.f16872c;
    private static final int __ID_createDate = HeaderEntity_.createDate.f16872c;
    private static final int __ID_updateDate = HeaderEntity_.updateDate.f16872c;
    private static final int __ID_duration = HeaderEntity_.duration.f16872c;
    private static final int __ID_convertUrl = HeaderEntity_.convertUrl.f16872c;
    private static final int __ID_defaultBackgroundColor = HeaderEntity_.defaultBackgroundColor.f16872c;
    private static final int __ID_lastBackgroundColor = HeaderEntity_.lastBackgroundColor.f16872c;
    private static final int __ID_pageId = HeaderEntity_.pageId.f16872c;
    private static final int __ID_defaultBackgroundLineConfigId = HeaderEntity_.defaultBackgroundLineConfigId.f16872c;
    private static final int __ID_lastBackgroundLineConfigId = HeaderEntity_.lastBackgroundLineConfigId.f16872c;
    private static final int __ID_authorId = HeaderEntity_.authorId.f16872c;
    private static final int __ID_moveConfigId = HeaderEntity_.moveConfigId.f16872c;

    public static final class Factory implements InterfaceC9429b {
        @Override // p189n6.InterfaceC9429b
        public Cursor<HeaderEntity> createCursor(Transaction transaction, long j10, BoxStore boxStore) {
            return new HeaderEntityCursor(transaction, j10, boxStore);
        }
    }

    public HeaderEntityCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, HeaderEntity_.__INSTANCE, boxStore);
    }

    private void attachEntity(HeaderEntity headerEntity) {
        headerEntity.__boxStore = this.boxStoreForEntities;
    }

    @Override // io.objectbox.Cursor
    public final long getId(HeaderEntity headerEntity) {
        return ID_GETTER.getId(headerEntity);
    }

    @Override // io.objectbox.Cursor
    public final long put(HeaderEntity headerEntity) {
        Cursor<TARGET> relationTargetCursor;
        ToOne<PageEntity> toOne = headerEntity.page;
        if (toOne != null && toOne.m15516i()) {
            relationTargetCursor = getRelationTargetCursor(PageEntity.class);
            try {
                toOne.m15515h(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne2 = headerEntity.defaultBackgroundLineConfig;
        if (toOne2 != null && toOne2.m15516i()) {
            relationTargetCursor = getRelationTargetCursor(BackgroundLineConfigEntity.class);
            try {
                toOne2.m15515h(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<BackgroundLineConfigEntity> toOne3 = headerEntity.lastBackgroundLineConfig;
        if (toOne3 != null && toOne3.m15516i()) {
            relationTargetCursor = getRelationTargetCursor(BackgroundLineConfigEntity.class);
            try {
                toOne3.m15515h(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<AuthorEntity> toOne4 = headerEntity.author;
        if (toOne4 != null && toOne4.m15516i()) {
            relationTargetCursor = getRelationTargetCursor(AuthorEntity.class);
            try {
                toOne4.m15515h(relationTargetCursor);
                relationTargetCursor.close();
            } finally {
            }
        }
        ToOne<MoveConfigEntity> toOne5 = headerEntity.moveConfig;
        if (toOne5 != null && toOne5.m15516i()) {
            try {
                toOne5.m15515h(getRelationTargetCursor(MoveConfigEntity.class));
            } finally {
            }
        }
        String convertUrl = headerEntity.getConvertUrl();
        Cursor.collect313311(this.cursor, 0L, 1, convertUrl != null ? __ID_convertUrl : 0, convertUrl, 0, null, 0, null, 0, null, __ID_createDate, headerEntity.getCreateDate(), __ID_updateDate, headerEntity.getUpdateDate(), __ID_duration, headerEntity.getDuration(), __ID_version, headerEntity.getVersion(), __ID_width, headerEntity.getWidth(), __ID_height, headerEntity.getHeight(), 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        Cursor.collect313311(this.cursor, 0L, 0, 0, null, 0, null, 0, null, 0, null, __ID_pageId, headerEntity.page.m15513e(), __ID_defaultBackgroundLineConfigId, headerEntity.defaultBackgroundLineConfig.m15513e(), __ID_lastBackgroundLineConfigId, headerEntity.lastBackgroundLineConfig.m15513e(), __ID_defaultBackgroundColor, headerEntity.getDefaultBackgroundColor(), __ID_lastBackgroundColor, headerEntity.getLastBackgroundColor(), 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        long jCollect313311 = Cursor.collect313311(this.cursor, headerEntity.getId(), 2, 0, null, 0, null, 0, null, 0, null, __ID_authorId, headerEntity.author.m15513e(), __ID_moveConfigId, headerEntity.moveConfig.m15513e(), 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, AudioStats.AUDIO_AMPLITUDE_NONE);
        headerEntity.setId(jCollect313311);
        attachEntity(headerEntity);
        checkApplyToManyToDb(headerEntity.provider, AuthorEntity.class);
        return jCollect313311;
    }
}
