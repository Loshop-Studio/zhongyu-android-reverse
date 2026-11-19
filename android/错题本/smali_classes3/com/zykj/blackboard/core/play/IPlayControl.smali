.class public interface abstract Lcom/zykj/blackboard/core/play/IPlayControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008f\u0018\u00002\u00020\u0001JE\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0008\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u00070\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00070\u0004H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00132\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0013H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0006H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/play/IPlayControl;",
        "",
        "",
        "path",
        "Lkotlin/Function1;",
        "",
        "Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "Ld6/s;",
        "successCallBack",
        "",
        "failCallBack",
        "loadPath",
        "(Ljava/lang/String;Lr6/c;Lr6/c;)V",
        "Lcom/zykj/blackboard/listener/PageListener;",
        "pageListener",
        "setPageListener",
        "(Lcom/zykj/blackboard/listener/PageListener;)V",
        "",
        "pageIndex",
        "Lkotlin/Function0;",
        "callback",
        "onError",
        "",
        "switchCurrentPlayPage",
        "(ILr6/a;Lr6/a;)Z",
        "getPlayPageControlList",
        "()Ljava/util/List;",
        "getCurrentPlayPageControl",
        "()Lcom/zykj/blackboard/core/play/IPlayPageControl;",
        "getCurrentPlayPageIndex",
        "()I",
        "getRootPath",
        "()Ljava/lang/String;",
        "release",
        "()V",
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
.method public abstract getCurrentPlayPageControl()Lcom/zykj/blackboard/core/play/IPlayPageControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getRootPath()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract loadPath(Ljava/lang/String;Lr6/c;Lr6/c;)V
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

.method public abstract release()V
.end method

.method public abstract setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/PageListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract switchCurrentPlayPage(ILr6/a;Lr6/a;)Z
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/a;",
            "Lr6/a;",
            ")Z"
        }
    .end annotation
.end method
