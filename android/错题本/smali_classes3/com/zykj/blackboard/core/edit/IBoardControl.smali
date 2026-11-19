.class public interface abstract Lcom/zykj/blackboard/core/edit/IBoardControl;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u0008H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0011H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0011H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00192\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u00132\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u0011H&\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0019H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00190 H&\u00a2\u0006\u0004\u0008!\u0010\"JK\u0010)\u001a\u00020\n2\u0008\u0008\u0002\u0010#\u001a\u00020\u00132\u0008\u0008\u0002\u0010$\u001a\u00020\u00132\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\n0%H&\u00a2\u0006\u0004\u0008)\u0010*J7\u0010+\u001a\u00020\n2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0%2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\n0%H&\u00a2\u0006\u0004\u0008+\u0010,JE\u00100\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00022\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\n0.2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\n0%H&\u00a2\u0006\u0004\u00080\u00101J\u0019\u00104\u001a\u00020\n2\u0008\u00103\u001a\u0004\u0018\u000102H&\u00a2\u0006\u0004\u00084\u00105\u00a8\u00066"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/edit/IBoardControl;",
        "",
        "",
        "getBoardDirPath",
        "()Ljava/lang/String;",
        "Lcom/zykj/blackboard/bean/BoardConfig;",
        "getConfig",
        "()Lcom/zykj/blackboard/bean/BoardConfig;",
        "Lcom/zykj/blackboard/listener/PageListener;",
        "pageListener",
        "Ld6/s;",
        "setPageListener",
        "(Lcom/zykj/blackboard/listener/PageListener;)V",
        "getPageListener",
        "()Lcom/zykj/blackboard/listener/PageListener;",
        "",
        "pageIndex",
        "Lkotlin/Function0;",
        "renderCallback",
        "",
        "currentPage",
        "(ILr6/a;)Z",
        "deletePage",
        "(ILr6/a;)V",
        "isSwitch",
        "Lcom/zykj/blackboard/core/edit/IPageControl;",
        "createPage",
        "(ZLr6/a;)Lcom/zykj/blackboard/core/edit/IPageControl;",
        "getCurrentPage",
        "()Lcom/zykj/blackboard/core/edit/IPageControl;",
        "getCurrentPageIndex",
        "()I",
        "",
        "getPages",
        "()Ljava/util/List;",
        "needClear",
        "isContentThumbnail",
        "Lkotlin/Function1;",
        "callback",
        "",
        "error",
        "save",
        "(ZZLr6/c;Lr6/c;)V",
        "drop",
        "(Lr6/c;Lr6/c;)V",
        "dirPath",
        "Lkotlin/Function2;",
        "",
        "loadDir",
        "(Ljava/lang/String;Lr6/e;Lr6/c;)V",
        "Lcom/zykj/blackboard/listener/ErrorListener;",
        "errorListener",
        "setErrorListener",
        "(Lcom/zykj/blackboard/listener/ErrorListener;)V",
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
.method public abstract createPage(ZLr6/a;)Lcom/zykj/blackboard/core/edit/IPageControl;
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lr6/a;",
            ")",
            "Lcom/zykj/blackboard/core/edit/IPageControl;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract currentPage(ILr6/a;)Z
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/a;",
            ")Z"
        }
    .end annotation
.end method

.method public abstract deletePage(ILr6/a;)V
    .param p2    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lr6/a;",
            ")V"
        }
    .end annotation
.end method

.method public abstract drop(Lr6/c;Lr6/c;)V
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract getBoardDirPath()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getConfig()Lcom/zykj/blackboard/bean/BoardConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract getCurrentPage()Lcom/zykj/blackboard/core/edit/IPageControl;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract getCurrentPageIndex()I
.end method

.method public abstract getPageListener()Lcom/zykj/blackboard/listener/PageListener;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract loadDir(Ljava/lang/String;Lr6/e;Lr6/c;)V
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lr6/e;
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
            "Lr6/e;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract save(ZZLr6/c;Lr6/c;)V
    .param p3    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation
.end method

.method public abstract setErrorListener(Lcom/zykj/blackboard/listener/ErrorListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/ErrorListener;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
.end method

.method public abstract setPageListener(Lcom/zykj/blackboard/listener/PageListener;)V
    .param p1    # Lcom/zykj/blackboard/listener/PageListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
