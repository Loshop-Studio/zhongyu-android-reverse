.class public Lio/objectbox/sync/server/SyncServerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public volatile a:J


# direct methods
.method private native nativeAddPeer(JLjava/lang/String;J[B)V
.end method

.method private static native nativeCreate(JLjava/lang/String;Ljava/lang/String;)J
.end method

.method private native nativeDelete(J)V
.end method

.method private native nativeGetPort(J)I
.end method

.method private native nativeGetStatsString(J)Ljava/lang/String;
.end method

.method private native nativeIsRunning(J)Z
.end method

.method private native nativeSetAuthenticator(JJ[B)V
.end method

.method private native nativeSetSyncChangesListener(JLio/objectbox/sync/listener/SyncChangeListener;)V
.end method

.method private native nativeStart(J)V
.end method

.method private native nativeStop(J)V
.end method


# virtual methods
.method public close()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lio/objectbox/sync/server/SyncServerImpl;->a:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    iput-wide v2, p0, Lio/objectbox/sync/server/SyncServerImpl;->a:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0, v1}, Lio/objectbox/sync/server/SyncServerImpl;->nativeDelete(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public finalize()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lio/objectbox/sync/server/SyncServerImpl;->close()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
