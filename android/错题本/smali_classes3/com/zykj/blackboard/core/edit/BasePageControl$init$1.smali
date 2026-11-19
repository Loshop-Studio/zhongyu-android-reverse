.class public final Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/EventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/BasePageControl;->init(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/zykj/blackboard/core/edit/BasePageControl$init$1",
        "Lcom/zykj/blackboard/listener/EventListener;",
        "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;",
        "entity",
        "Ld6/s;",
        "onEvent",
        "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V",
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


# instance fields
.field final synthetic $pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;->$pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onEvent(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V
    .locals 4
    .param p1    # Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "entity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;->$pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->isChange()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;->$pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getFileName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandFileName(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;->$pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-virtual {v0, v1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setChange(Z)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;->$pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getRecord()Lio/objectbox/relation/ToOne;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lio/objectbox/relation/ToOne;->getTarget()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/zykj/blackboard/core/data/dao/CommandRecordEntity;->getCommandInfoEntity()Lio/objectbox/relation/ToMany;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;->getId()J

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    invoke-virtual {v1, v2, v3}, Lio/objectbox/relation/ToMany;->indexOfId(J)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {v0, p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->setCommandIndex(I)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$init$1;->$pageEntity:Lcom/zykj/blackboard/core/data/dao/PageEntity;

    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/zykj/blackboard/core/data/dao/PageEntity;->put()V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void
.end method
