.class Lcom/zykj/blackboard/core/data/dao/RecordEntity_$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/internal/ToOneGetter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/data/dao/RecordEntity_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/internal/ToOneGetter<",
        "Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;",
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
.method public a(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)Lio/objectbox/relation/ToOne;
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;->record:Lio/objectbox/relation/ToOne;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;)Lio/objectbox/relation/ToOne;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$15;->a(Lcom/zykj/blackboard/core/data/dao/GeometryRecordEntity;)Lio/objectbox/relation/ToOne;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
