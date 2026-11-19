.class public interface abstract Lcom/zykj/blackboard/core/edit/IBoardControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract createPage(ZLx7/a;)Lcom/zykj/blackboard/core/edit/IPageControl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lx7/a;",
            ")",
            "Lcom/zykj/blackboard/core/edit/IPageControl;"
        }
    .end annotation
.end method

.method public abstract currentPage(ILx7/a;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/a;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract deletePage(ILx7/a;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lx7/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract drop(Lx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getBoardDirPath()Ljava/lang/String;
.end method

.method public abstract getConfig()Lcom/zykj/blackboard/bean/BoardConfig;
.end method

.method public abstract getCurrentPage()Lcom/zykj/blackboard/core/edit/IPageControl;
.end method

.method public abstract getCurrentPageIndex()I
.end method

.method public abstract getPageListener()Lcom/zykj/blackboard/listener/PageListener;
.end method

.method public abstract getPages()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/edit/IPageControl;",
            ">;"
        }
    .end annotation
.end method

.method public abstract loadDir(Ljava/lang/String;Lx7/p;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lx7/p;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract save(ZZLx7/l;Lx7/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lx7/l;",
            "Lx7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setErrorListener(Lcom/zykj/blackboard/listener/ErrorListener;)V
.end method

.method public abstract setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
.end method
