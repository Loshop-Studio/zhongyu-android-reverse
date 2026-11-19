.class Lcom/zykj/blackboard/core/data/dao/RecordEntity_$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/internal/ToManyGetter;


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
        "Lio/objectbox/internal/ToManyGetter<",
        "Lcom/zykj/blackboard/core/data/dao/RecordEntity;",
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
.method public a(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p1, p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;->geometryList:Lio/objectbox/relation/ToMany;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/RecordEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/RecordEntity_$14;->a(Lcom/zykj/blackboard/core/data/dao/RecordEntity;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
