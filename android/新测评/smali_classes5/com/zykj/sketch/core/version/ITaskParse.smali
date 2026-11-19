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
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J4\u0010\u0002\u001a\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH&\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/zykj/sketch/core/version/ITaskParse;",
        "",
        "parse",
        "Lcom/zykj/sketch/core/data/RenderTask;",
        "content",
        "",
        "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
        "eventListener",
        "Lcom/zykj/sketch/core/listener/EventListener;",
        "viewBack",
        "Lkotlin/Function1;",
        "Lcom/zykj/sketch/core/listener/ViewControl;",
        "",
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
.method public abstract parse(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lkotlin/jvm/functions/Function1;)Lcom/zykj/sketch/core/data/RenderTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zykj/sketch/core/listener/ViewControl;",
            "Lkotlin/Unit;",
            ">;)",
            "Lcom/zykj/sketch/core/data/RenderTask;"
        }
    .end annotation
.end method
