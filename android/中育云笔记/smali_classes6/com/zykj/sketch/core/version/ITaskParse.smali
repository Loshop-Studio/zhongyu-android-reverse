.class public interface abstract Lcom/zykj/sketch/core/version/ITaskParse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/version/ITaskParse$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract parse(Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lhd/l;)Lcom/zykj/sketch/core/data/RenderTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;",
            ">;",
            "Lcom/zykj/sketch/core/listener/EventListener;",
            "Lhd/l;",
            ")",
            "Lcom/zykj/sketch/core/data/RenderTask;"
        }
    .end annotation
.end method
