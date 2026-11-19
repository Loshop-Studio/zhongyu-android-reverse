.class Lanet/channel/strategy/StrategyList;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lanet/channel/strategy/StrategyList$Predicate;
    }
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lanet/channel/strategy/IPConnStrategy;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lanet/channel/strategy/ConnHistoryItem;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z

.field private transient d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lanet/channel/strategy/IPConnStrategy;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    .line 3
    new-instance v0, Lanet/channel/strategy/utils/SerialLruCache;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Lanet/channel/strategy/utils/SerialLruCache;-><init>(I)V

    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lanet/channel/strategy/StrategyList;->c:Z

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->d:Ljava/util/Comparator;

    return-void
.end method

.method constructor <init>(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lanet/channel/strategy/IPConnStrategy;",
            ">;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    .line 8
    new-instance v0, Lanet/channel/strategy/utils/SerialLruCache;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Lanet/channel/strategy/utils/SerialLruCache;-><init>(I)V

    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lanet/channel/strategy/StrategyList;->c:Z

    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->d:Ljava/util/Comparator;

    .line 11
    iput-object p1, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    return-void
.end method

.method private static a(Ljava/util/Collection;Lanet/channel/strategy/StrategyList$Predicate;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "TT;>;",
            "Lanet/channel/strategy/StrategyList$Predicate<",
            "TT;>;)I"
        }
    .end annotation

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 20
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 21
    invoke-interface {p1, v3}, Lanet/channel/strategy/StrategyList$Predicate;->apply(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 22
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result p0

    if-ne v1, p0, :cond_3

    goto :goto_2

    :cond_3
    move v0, v1

    :goto_2
    return v0
.end method

.method private a()Ljava/util/Comparator;
    .locals 1

    .line 17
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->d:Ljava/util/Comparator;

    if-nez v0, :cond_0

    .line 18
    new-instance v0, Lanet/channel/strategy/k;

    invoke-direct {v0, p0}, Lanet/channel/strategy/k;-><init>(Lanet/channel/strategy/StrategyList;)V

    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->d:Ljava/util/Comparator;

    .line 19
    :cond_0
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->d:Ljava/util/Comparator;

    return-object v0
.end method

.method static synthetic a(Lanet/channel/strategy/StrategyList;)Ljava/util/Map;
    .locals 0

    .line 1
    iget-object p0, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    return-object p0
.end method

.method private a(Ljava/lang/String;ILanet/channel/strategy/l$a;)V
    .locals 3

    .line 2
    invoke-static {p3}, Lanet/channel/strategy/ConnProtocol;->valueOf(Lanet/channel/strategy/l$a;)Lanet/channel/strategy/ConnProtocol;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    new-instance v2, Lanet/channel/strategy/j;

    invoke-direct {v2, p0, p3, p1, v0}, Lanet/channel/strategy/j;-><init>(Lanet/channel/strategy/StrategyList;Lanet/channel/strategy/l$a;Ljava/lang/String;Lanet/channel/strategy/ConnProtocol;)V

    invoke-static {v1, v2}, Lanet/channel/strategy/StrategyList;->a(Ljava/util/Collection;Lanet/channel/strategy/StrategyList$Predicate;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_0

    .line 4
    iget-object p1, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lanet/channel/strategy/IPConnStrategy;

    .line 5
    iget v0, p3, Lanet/channel/strategy/l$a;->c:I

    iput v0, p1, Lanet/channel/strategy/IPConnStrategy;->cto:I

    .line 6
    iget v0, p3, Lanet/channel/strategy/l$a;->d:I

    iput v0, p1, Lanet/channel/strategy/IPConnStrategy;->rto:I

    .line 7
    iget p3, p3, Lanet/channel/strategy/l$a;->f:I

    iput p3, p1, Lanet/channel/strategy/IPConnStrategy;->heartbeat:I

    .line 8
    iput p2, p1, Lanet/channel/strategy/IPConnStrategy;->a:I

    .line 9
    iput v1, p1, Lanet/channel/strategy/IPConnStrategy;->b:I

    .line 10
    iput-boolean v1, p1, Lanet/channel/strategy/IPConnStrategy;->c:Z

    goto :goto_0

    .line 11
    :cond_0
    invoke-static {p1, p3}, Lanet/channel/strategy/IPConnStrategy;->a(Ljava/lang/String;Lanet/channel/strategy/l$a;)Lanet/channel/strategy/IPConnStrategy;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 12
    iput p2, p1, Lanet/channel/strategy/IPConnStrategy;->a:I

    .line 13
    iput v1, p1, Lanet/channel/strategy/IPConnStrategy;->b:I

    .line 14
    iget-object p2, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lanet/channel/strategy/IPConnStrategy;->getUniqueId()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    .line 15
    iget-object p2, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lanet/channel/strategy/IPConnStrategy;->getUniqueId()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-instance v0, Lanet/channel/strategy/ConnHistoryItem;

    invoke-direct {v0}, Lanet/channel/strategy/ConnHistoryItem;-><init>()V

    invoke-interface {p2, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_1
    iget-object p2, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public checkInit()V
    .locals 4

    .line 1
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    .line 3
    :cond_0
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    if-nez v0, :cond_1

    .line 4
    new-instance v0, Lanet/channel/strategy/utils/SerialLruCache;

    const/16 v1, 0x28

    invoke-direct {v0, v1}, Lanet/channel/strategy/utils/SerialLruCache;-><init>(I)V

    iput-object v0, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    .line 5
    :cond_1
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 6
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 7
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lanet/channel/strategy/ConnHistoryItem;

    invoke-virtual {v1}, Lanet/channel/strategy/ConnHistoryItem;->d()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 9
    :cond_3
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lanet/channel/strategy/IPConnStrategy;

    .line 10
    iget-object v2, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-virtual {v1}, Lanet/channel/strategy/IPConnStrategy;->getUniqueId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 11
    iget-object v2, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-virtual {v1}, Lanet/channel/strategy/IPConnStrategy;->getUniqueId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v3, Lanet/channel/strategy/ConnHistoryItem;

    invoke-direct {v3}, Lanet/channel/strategy/ConnHistoryItem;-><init>()V

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 12
    :cond_5
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-direct {p0}, Lanet/channel/strategy/StrategyList;->a()Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public getStrategyList()Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lanet/channel/strategy/IConnStrategy;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 3
    :cond_0
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lanet/channel/strategy/IPConnStrategy;

    .line 4
    iget-object v4, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-virtual {v3}, Lanet/channel/strategy/IPConnStrategy;->getUniqueId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lanet/channel/strategy/ConnHistoryItem;

    if-eqz v4, :cond_1

    .line 5
    invoke-virtual {v4}, Lanet/channel/strategy/ConnHistoryItem;->c()Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    const-string v6, "strategy"

    aput-object v6, v4, v5

    const/4 v5, 0x1

    aput-object v3, v4, v5

    const-string v3, "awcn.StrategyList"

    const-string v5, "strategy ban!"

    .line 6
    invoke-static {v3, v5, v1, v4}, Lanet/channel/util/ALog;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    if-nez v2, :cond_2

    .line 7
    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    .line 8
    :cond_2
    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    if-nez v2, :cond_4

    .line 9
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :cond_4
    return-object v2
.end method

.method public notifyConnEvent(Lanet/channel/strategy/IConnStrategy;Lanet/channel/strategy/ConnEvent;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lanet/channel/strategy/IPConnStrategy;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    .line 2
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 3
    check-cast p1, Lanet/channel/strategy/IPConnStrategy;

    .line 4
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lanet/channel/strategy/IPConnStrategy;->getUniqueId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lanet/channel/strategy/ConnHistoryItem;

    iget-boolean p2, p2, Lanet/channel/strategy/ConnEvent;->isSuccess:Z

    invoke-virtual {p1, p2}, Lanet/channel/strategy/ConnHistoryItem;->a(Z)V

    .line 5
    iget-object p1, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    iget-object p2, p0, Lanet/channel/strategy/StrategyList;->d:Ljava/util/Comparator;

    invoke-static {p1, p2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    :cond_0
    return-void
.end method

.method public shouldRefresh()Z
    .locals 8

    .line 1
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lanet/channel/strategy/IPConnStrategy;

    .line 2
    iget-object v6, p0, Lanet/channel/strategy/StrategyList;->b:Ljava/util/Map;

    invoke-virtual {v4}, Lanet/channel/strategy/IPConnStrategy;->getUniqueId()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lanet/channel/strategy/ConnHistoryItem;

    invoke-virtual {v6}, Lanet/channel/strategy/ConnHistoryItem;->b()Z

    move-result v6

    if-nez v6, :cond_0

    .line 3
    iget v3, v4, Lanet/channel/strategy/IPConnStrategy;->a:I

    if-nez v3, :cond_1

    const/4 v2, 0x0

    :cond_1
    const/4 v3, 0x0

    goto :goto_0

    .line 4
    :cond_2
    iget-boolean v0, p0, Lanet/channel/strategy/StrategyList;->c:Z

    if-eqz v0, :cond_3

    if-nez v2, :cond_5

    :cond_3
    if-eqz v3, :cond_4

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :cond_5
    :goto_1
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public update(Lanet/channel/strategy/l$b;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lanet/channel/strategy/IPConnStrategy;

    .line 2
    iput-boolean v2, v1, Lanet/channel/strategy/IPConnStrategy;->c:Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 3
    :goto_1
    iget-object v3, p1, Lanet/channel/strategy/l$b;->h:[Lanet/channel/strategy/l$a;

    array-length v3, v3

    if-ge v1, v3, :cond_4

    const/4 v3, 0x0

    .line 4
    :goto_2
    iget-object v4, p1, Lanet/channel/strategy/l$b;->f:[Ljava/lang/String;

    array-length v5, v4

    if-ge v3, v5, :cond_1

    .line 5
    aget-object v4, v4, v3

    iget-object v5, p1, Lanet/channel/strategy/l$b;->h:[Lanet/channel/strategy/l$a;

    aget-object v5, v5, v1

    invoke-direct {p0, v4, v2, v5}, Lanet/channel/strategy/StrategyList;->a(Ljava/lang/String;ILanet/channel/strategy/l$a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 6
    :cond_1
    iget-object v3, p1, Lanet/channel/strategy/l$b;->g:[Ljava/lang/String;

    if-eqz v3, :cond_2

    .line 7
    iput-boolean v2, p0, Lanet/channel/strategy/StrategyList;->c:Z

    const/4 v3, 0x0

    .line 8
    :goto_3
    iget-object v4, p1, Lanet/channel/strategy/l$b;->g:[Ljava/lang/String;

    array-length v5, v4

    if-ge v3, v5, :cond_3

    .line 9
    aget-object v4, v4, v3

    iget-object v5, p1, Lanet/channel/strategy/l$b;->h:[Lanet/channel/strategy/l$a;

    aget-object v5, v5, v1

    invoke-direct {p0, v4, v0, v5}, Lanet/channel/strategy/StrategyList;->a(Ljava/lang/String;ILanet/channel/strategy/l$a;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    .line 10
    :cond_2
    iput-boolean v0, p0, Lanet/channel/strategy/StrategyList;->c:Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 11
    :cond_4
    iget-object v1, p1, Lanet/channel/strategy/l$b;->i:[Lanet/channel/strategy/l$e;

    if-eqz v1, :cond_6

    .line 12
    :goto_4
    iget-object v1, p1, Lanet/channel/strategy/l$b;->i:[Lanet/channel/strategy/l$e;

    array-length v3, v1

    if-ge v0, v3, :cond_6

    .line 13
    aget-object v1, v1, v0

    .line 14
    iget-object v3, v1, Lanet/channel/strategy/l$e;->a:Ljava/lang/String;

    .line 15
    invoke-static {v3}, Lanet/channel/strategy/utils/c;->c(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/4 v4, -0x1

    goto :goto_5

    :cond_5
    const/4 v4, 0x1

    :goto_5
    iget-object v1, v1, Lanet/channel/strategy/l$e;->b:Lanet/channel/strategy/l$a;

    .line 16
    invoke-direct {p0, v3, v4, v1}, Lanet/channel/strategy/StrategyList;->a(Ljava/lang/String;ILanet/channel/strategy/l$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 17
    :cond_6
    iget-object p1, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    .line 18
    :cond_7
    :goto_6
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 19
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lanet/channel/strategy/IPConnStrategy;

    iget-boolean v0, v0, Lanet/channel/strategy/IPConnStrategy;->c:Z

    if-eqz v0, :cond_7

    .line 20
    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    goto :goto_6

    .line 21
    :cond_8
    iget-object p1, p0, Lanet/channel/strategy/StrategyList;->a:Ljava/util/List;

    invoke-direct {p0}, Lanet/channel/strategy/StrategyList;->a()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method
