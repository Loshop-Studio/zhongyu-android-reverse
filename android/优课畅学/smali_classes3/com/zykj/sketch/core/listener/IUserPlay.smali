.class public interface abstract Lcom/zykj/sketch/core/listener/IUserPlay;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addPlayActionListener(Lcom/zykj/sketch/core/listener/PlayActionListener;)V
.end method

.method public abstract destroy()V
.end method

.method public abstract getPlayStatus()Lcom/zykj/sketch/core/data/PlayStatus;
.end method

.method public abstract loadData(Ljava/lang/String;Lx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract pause()V
.end method

.method public abstract removePlayActionListener(Lcom/zykj/sketch/core/listener/PlayActionListener;)V
.end method

.method public abstract seekTo(ILx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract start()V
.end method

.method public abstract waiting()V
.end method
