.class public Lio/objectbox/sync/SyncClientImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/objectbox/sync/SyncClientImpl$InternalSyncClientListener;
    }
.end annotation


# instance fields
.field public a:Lio/objectbox/BoxStore;

.field public volatile b:J


# direct methods
.method private native nativeCancelUpdates(J)Z
.end method

.method private static native nativeCreate(JLjava/lang/String;[Ljava/lang/String;)J
    .param p3    # [Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method private native nativeDelete(J)V
.end method

.method private native nativeGetState(J)I
.end method

.method private native nativeRequestFullSync(JZ)Z
.end method

.method private native nativeRequestUpdates(JZ)Z
.end method

.method private native nativeSetListener(JLio/objectbox/sync/SyncClientImpl$InternalSyncClientListener;)V
    .param p3    # Lio/objectbox/sync/SyncClientImpl$InternalSyncClientListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method private native nativeSetLoginInfo(JJ[B)V
    .param p5    # [B
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method private native nativeSetRequestUpdatesMode(JZZ)V
.end method

.method private native nativeSetSyncChangesListener(JLio/objectbox/sync/listener/SyncChangeListener;)V
    .param p3    # Lio/objectbox/sync/listener/SyncChangeListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
.end method

.method private native nativeSetUncommittedAcks(JZ)V
.end method

.method private native nativeStart(J)V
.end method

.method private native nativeStop(J)V
.end method

.method private native nativeTriggerReconnect(J)Z
.end method


# virtual methods
.method public close()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lio/objectbox/sync/SyncClientImpl;->a:Lio/objectbox/BoxStore;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Lio/objectbox/BoxStore;->u()Lr6/a;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne v1, p0, :cond_0

    .line 12
    .line 13
    invoke-static {v0, v2}, Lio/objectbox/d;->b(Lio/objectbox/BoxStore;Lr6/a;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    iput-object v2, p0, Lio/objectbox/sync/SyncClientImpl;->a:Lio/objectbox/BoxStore;

    .line 20
    .line 21
    :cond_1
    iget-wide v0, p0, Lio/objectbox/sync/SyncClientImpl;->b:J

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    iput-wide v2, p0, Lio/objectbox/sync/SyncClientImpl;->b:J

    .line 26
    .line 27
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    cmp-long v2, v0, v2

    .line 29
    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-direct {p0, v0, v1}, Lio/objectbox/sync/SyncClientImpl;->nativeDelete(J)V

    .line 33
    .line 34
    .line 35
    :cond_2
    return-void

    .line 36
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw v0
.end method

.method public finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/sync/SyncClientImpl;->close()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
