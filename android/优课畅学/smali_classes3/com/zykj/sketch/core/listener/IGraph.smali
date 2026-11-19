.class public interface abstract Lcom/zykj/sketch/core/listener/IGraph;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/sketch/core/listener/IGraph$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract findGraphByName(Ljava/lang/String;)Lcom/zykj/sketch/core/graph/Graph;
.end method

.method public abstract findGraphByType(Ljava/lang/Class;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/zykj/sketch/core/graph/Graph;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public abstract getGraphName()Ljava/lang/String;
.end method

.method public abstract getSnapshot()Lcom/zykj/sketch/GraphSnapshot$GraphData;
.end method

.method public abstract graphType()Lcom/zykj/sketch/GraphSnapshot$GraphType;
.end method

.method public abstract isComplete()Z
.end method

.method public abstract isInRect(FFF)Z
.end method

.method public abstract onMeasure()V
.end method

.method public abstract removeGraph(Ljava/lang/String;)V
.end method
