.class public interface abstract Lcom/zykj/merge/sketch/listener/Play;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J]\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u0008\u0012\u0004\u0012\u00020\t0\u00042!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\t0\u0004H&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001bJ]\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00052!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008( \u0012\u0004\u0012\u00020\t0\u00042!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0006\u0012\u0008\u0008\u0007\u0012\u0004\u0008\u0008(\u000c\u0012\u0004\u0012\u00020\t0\u0004H&\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\tH&\u00a2\u0006\u0004\u0008#\u0010\u001bJ\u000f\u0010$\u001a\u00020\tH&\u00a2\u0006\u0004\u0008$\u0010\u001bJ\u000f\u0010%\u001a\u00020\tH&\u00a2\u0006\u0004\u0008%\u0010\u001bJ\u0017\u0010\'\u001a\u00020\t2\u0006\u0010\'\u001a\u00020&H&\u00a2\u0006\u0004\u0008\'\u0010(J\u0017\u0010+\u001a\u00020&2\u0006\u0010*\u001a\u00020)H&\u00a2\u0006\u0004\u0008+\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lcom/zykj/merge/sketch/listener/Play;",
        "",
        "",
        "path",
        "Lkotlin/Function1;",
        "",
        "Lkotlin/ParameterName;",
        "name",
        "duration",
        "Ld6/s;",
        "onSuccess",
        "",
        "throwable",
        "onFailure",
        "loadData",
        "(Ljava/lang/String;Lr6/c;Lr6/c;)V",
        "Lcom/zykj/merge/sketch/listener/PlayStatusListener;",
        "listener",
        "addPlayActionListener",
        "(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V",
        "getPath",
        "()Ljava/lang/String;",
        "removePlayActionListener",
        "Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "status",
        "()Lcom/zykj/merge/sketch/constant/PlayStatus;",
        "start",
        "()V",
        "pause",
        "waiting",
        "resume",
        "position",
        "progress",
        "seekTo",
        "(ILr6/c;Lr6/c;)V",
        "reset",
        "release",
        "destroy",
        "",
        "isRend",
        "(Z)V",
        "",
        "rate",
        "setRate",
        "(D)Z",
        "merge_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .param p1    # Lcom/zykj/merge/sketch/listener/PlayStatusListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract destroy()V
.end method

.method public abstract getPath()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract isRend(Z)V
.end method

.method public abstract loadData(Ljava/lang/String;Lr6/c;Lr6/c;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract pause()V
.end method

.method public abstract release()V
.end method

.method public abstract removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
    .param p1    # Lcom/zykj/merge/sketch/listener/PlayStatusListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract reset()V
.end method

.method public abstract resume()V
.end method

.method public abstract seekTo(ILr6/c;Lr6/c;)V
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setRate(D)Z
.end method

.method public abstract start()V
.end method

.method public abstract status()Lcom/zykj/merge/sketch/constant/PlayStatus;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract waiting()V
.end method
