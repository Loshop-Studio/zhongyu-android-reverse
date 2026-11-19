.class public Lio/microshow/rxffmpeg/RxFFmpegInvoke;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;
    }
.end annotation


# static fields
.field public static final TAG:Ljava/lang/String; = "RxFFmpegInvoke"

.field private static volatile instance:Lio/microshow/rxffmpeg/RxFFmpegInvoke;


# instance fields
.field private ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "rxffmpeg-core"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "rxffmpeg-invoke"

    .line 7
    .line 8
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static getInstance()Lio/microshow/rxffmpeg/RxFFmpegInvoke;
    .locals 2

    .line 1
    sget-object v0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->instance:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->instance:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 13
    .line 14
    invoke-direct {v1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->instance:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    :cond_1
    :goto_2
    sget-object v0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->instance:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 27
    .line 28
    return-object v0
.end method


# virtual methods
.method public native exit()V
.end method

.method public getFFmpegListener()Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public native getMediaInfo(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public onCancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onCancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onClean()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 7
    .line 8
    :cond_0
    sget-object v0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->instance:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    sput-object v1, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->instance:Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 13
    .line 14
    :cond_1
    return-void
.end method

.method public onError(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onError(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onFinish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onFinish()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public onProgress(IJ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2, p3}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;->onProgress(IJ)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public runCommand([Ljava/lang/String;Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;)I
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->setFFmpegListener(Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;)V

    .line 2
    .line 3
    .line 4
    const-class p2, Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 5
    .line 6
    monitor-enter p2

    .line 7
    :try_start_0
    invoke-virtual {p0, p1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->runFFmpegCmd([Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {p0}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->onClean()V

    .line 12
    .line 13
    .line 14
    monitor-exit p2

    .line 15
    return p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p1
.end method

.method public runCommandAsync([Ljava/lang/String;Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->setFFmpegListener(Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;)V

    .line 2
    .line 3
    .line 4
    const-class p2, Lio/microshow/rxffmpeg/RxFFmpegInvoke;

    .line 5
    .line 6
    monitor-enter p2

    .line 7
    :try_start_0
    new-instance v0, Ljava/lang/Thread;

    .line 8
    .line 9
    new-instance v1, Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;

    .line 10
    .line 11
    invoke-direct {v1, p0, p1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$1;-><init>(Lio/microshow/rxffmpeg/RxFFmpegInvoke;[Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 18
    .line 19
    .line 20
    monitor-exit p2

    .line 21
    return-void

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    throw p1
.end method

.method public runCommandRxJava([Ljava/lang/String;)Ls6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ls6/b;"
        }
    .end annotation

    .line 1
    new-instance v0, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lio/microshow/rxffmpeg/RxFFmpegInvoke$2;-><init>(Lio/microshow/rxffmpeg/RxFFmpegInvoke;[Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lio/reactivex/BackpressureStrategy;->c:Lio/reactivex/BackpressureStrategy;

    .line 7
    .line 8
    invoke-static {v0, p1}, Ls6/b;->c(Ls6/d;Lio/reactivex/BackpressureStrategy;)Ls6/b;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lg7/a;->b()Ls6/f;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Ls6/b;->l(Ls6/f;)Ls6/b;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-static {}, Lu6/a;->a()Ls6/f;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ls6/b;->f(Ls6/f;)Ls6/b;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method public native runFFmpegCmd([Ljava/lang/String;)I
.end method

.method public native setDebug(Z)V
.end method

.method public setFFmpegListener(Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lio/microshow/rxffmpeg/RxFFmpegInvoke;->ffmpegListener:Lio/microshow/rxffmpeg/RxFFmpegInvoke$IFFmpegListener;

    .line 2
    .line 3
    return-void
.end method
