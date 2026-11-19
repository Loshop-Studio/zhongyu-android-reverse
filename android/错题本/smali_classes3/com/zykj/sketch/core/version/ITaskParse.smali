.class public interface abstract Lcom/zykj/sketch/core/version/ITaskParse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/version/ITaskParse$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J;\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H&\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/zykj/sketch/core/version/ITaskParse;",
        "",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "content",
        "Lcom/zykj/sketch/core/listener/EventListener;",
        "eventListener",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "Ld6/s;",
        "viewBack",
        "Lcom/zykj/sketch/core/data/RenderTask;",
        "parse",
        "(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lr6/c;)Lcom/zykj/sketch/core/data/RenderTask;",
        "sketch_release"
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
.method public abstract parse(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lr6/c;)Lcom/zykj/sketch/core/data/RenderTask;
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/zykj/sketch/core/listener/EventListener;
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
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lr6/c;",
            ")",
            "Lcom/zykj/sketch/core/data/RenderTask;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
