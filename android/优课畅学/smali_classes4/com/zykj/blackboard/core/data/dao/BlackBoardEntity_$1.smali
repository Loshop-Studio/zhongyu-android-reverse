.class Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/objectbox/internal/ToManyGetter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/objectbox/internal/ToManyGetter<",
        "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
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
.method public getToMany(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;",
            ")",
            "Ljava/util/List<",
            "Lcom/zykj/blackboard/core/data/dao/PageEntity;",
            ">;"
        }
    .end annotation

    .line 2
    iget-object p1, p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;->pages:Lio/objectbox/relation/ToMany;

    return-object p1
.end method

.method public bridge synthetic getToMany(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;

    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity_$1;->getToMany(Lcom/zykj/blackboard/core/data/dao/BlackBoardEntity;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
