.class public interface abstract Lcom/zykj/blackboard/core/play/IPlayControl;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getCurrentPlayPageControl()Lcom/zykj/blackboard/core/play/IPlayPageControl;
.end method

.method public abstract getCurrentPlayPageIndex()I
.end method

.method public abstract getPlayPageControlList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getRootPath()Ljava/lang/String;
.end method

.method public abstract loadPath(Ljava/lang/String;Lx7/l;Lx7/l;)V
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

.method public abstract release()V
.end method

.method public abstract setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
.end method

.method public abstract switchCurrentPlayPage(ILx7/a;Lx7/a;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/a;",
            "Lx7/a;",
            ")Z"
        }
    .end annotation
.end method
