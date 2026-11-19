.class public interface abstract Lcom/zykj/blackboard/listener/PageListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0006J\u0017\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0008\u0010\u0006\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/zykj/blackboard/listener/PageListener;",
        "",
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "pageControl",
        "Ld6/s;",
        "addPage",
        "(Lcom/zykj/blackboard/core/edit/IPageControl;)V",
        "removePage",
        "changPage",
        "blackboard_release"
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
.method public abstract addPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .param p1    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract changPage(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .param p1    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract removePage(Lcom/zykj/blackboard/core/edit/IPageControl;)V
    .param p1    # Lcom/zykj/blackboard/core/edit/IPageControl;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
