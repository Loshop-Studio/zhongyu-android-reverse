.class Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/internal/ToOneGetter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/data/dao/HeaderEntity_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/internal/ToOneGetter<",
        "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public getToOne(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)Lio/objectbox/relation/ToOne;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/data/dao/HeaderEntity;",
            ")",
            "Lio/objectbox/relation/ToOne<",
            "Lcom/zykj/blackboard/core/data/dao/BackgroundLineConfigEntity;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object p1, p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;->defaultBackgroundLineConfig:Lio/objectbox/relation/ToOne;

    return-object p1
.end method

.method public bridge synthetic getToOne(Ljava/lang/Object;)Lio/objectbox/relation/ToOne;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/HeaderEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/HeaderEntity_$2;->getToOne(Lcom/zykj/blackboard/core/data/dao/HeaderEntity;)Lio/objectbox/relation/ToOne;

    move-result-object p1

    return-object p1
.end method
