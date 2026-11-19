.class public interface abstract Lcom/zykj/merge/sketch/listener/Play;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addPlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
.end method

.method public abstract destroy()V
.end method

.method public abstract getPath()Ljava/lang/String;
.end method

.method public abstract isRend(Z)V
.end method

.method public abstract loadData(Ljava/lang/String;Lhd/l;Lhd/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract pause()V
.end method

.method public abstract release()V
.end method

.method public abstract removePlayActionListener(Lcom/zykj/merge/sketch/listener/PlayStatusListener;)V
.end method

.method public abstract reset()V
.end method

.method public abstract resume()V
.end method

.method public abstract seekTo(ILhd/l;Lhd/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lhd/l;",
            "Lhd/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setRate(D)Z
.end method

.method public abstract start()V
.end method

.method public abstract status()Lcom/zykj/merge/sketch/constant/PlayStatus;
.end method

.method public abstract waiting()V
.end method
