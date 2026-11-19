.class public final Lcom/zykj/evaluation/ui/home/HomeFilterState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J \u0010\t\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0008\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/zykj/evaluation/ui/home/HomeFilterState;",
        "",
        "",
        "Ls6/d;",
        "filterDataList",
        "<init>",
        "(Ljava/util/List;)V",
        "component1",
        "()Ljava/util/List;",
        "copy",
        "(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/util/List;",
        "getFilterDataList",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final filterDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls6/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lcom/zykj/evaluation/ui/home/HomeFilterState;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls6/d;",
            ">;)V"
        }
    .end annotation

    const-string v0, "filterDataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 21

    const/4 v0, 0x1

    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_0

    .line 4
    new-instance v2, Ls6/d;

    .line 5
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$d$a;->d:Lcom/zykj/evaluation/ui/home/c$d$a;

    .line 6
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v6, 0x4

    const/4 v7, 0x0

    .line 7
    const-string v3, "\u79d1\u76ee\uff08\u53ef\u591a\u9009\uff09"

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Ls6/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    new-instance v3, Ls6/d;

    .line 9
    sget-object v1, Lcom/zykj/evaluation/ui/home/c$b$a;->d:Lcom/zykj/evaluation/ui/home/c$b$a;

    .line 10
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    .line 11
    const-string v4, "\u5e74\u7ea7"

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Ls6/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    new-instance v4, Ls6/d;

    const/4 v1, 0x5

    .line 13
    new-array v1, v1, [Lcom/zykj/evaluation/ui/home/c$a;

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$a$d;->d:Lcom/zykj/evaluation/ui/home/c$a$d;

    const/4 v10, 0x0

    aput-object v5, v1, v10

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$a$a;->d:Lcom/zykj/evaluation/ui/home/c$a$a;

    aput-object v5, v1, v0

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$a$c;->d:Lcom/zykj/evaluation/ui/home/c$a$c;

    const/4 v11, 0x2

    aput-object v5, v1, v11

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$a$b;->d:Lcom/zykj/evaluation/ui/home/c$a$b;

    const/4 v12, 0x3

    aput-object v5, v1, v12

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$a$e;->d:Lcom/zykj/evaluation/ui/home/c$a$e;

    const/4 v13, 0x4

    aput-object v5, v1, v13

    .line 14
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const/4 v8, 0x4

    const/4 v9, 0x0

    .line 15
    const-string v5, "\u6d4b\u8bc4\u7c7b\u578b"

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Ls6/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 16
    new-instance v14, Ls6/d;

    .line 17
    new-array v1, v12, [Lcom/zykj/evaluation/ui/home/c$c;

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$c$c;->d:Lcom/zykj/evaluation/ui/home/c$c$c;

    aput-object v5, v1, v10

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$c$a;->d:Lcom/zykj/evaluation/ui/home/c$c$a;

    aput-object v5, v1, v0

    sget-object v5, Lcom/zykj/evaluation/ui/home/c$c$b;->d:Lcom/zykj/evaluation/ui/home/c$c$b;

    aput-object v5, v1, v11

    .line 18
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v18, 0x4

    const/16 v19, 0x0

    .line 19
    const-string v15, "\u662f\u5426\u903e\u671f"

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Ls6/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 20
    new-instance v15, Ls6/d;

    .line 21
    new-instance v1, Lcom/zykj/evaluation/ui/home/c$e$a;

    const/4 v5, 0x0

    invoke-direct {v1, v5, v5, v12, v5}, Lcom/zykj/evaluation/ui/home/c$e$a;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-array v5, v13, [Lcom/zykj/evaluation/ui/home/c$e;

    sget-object v6, Lcom/zykj/evaluation/ui/home/c$e$d;->e:Lcom/zykj/evaluation/ui/home/c$e$d;

    aput-object v6, v5, v10

    sget-object v6, Lcom/zykj/evaluation/ui/home/c$e$c;->e:Lcom/zykj/evaluation/ui/home/c$e$c;

    aput-object v6, v5, v0

    sget-object v0, Lcom/zykj/evaluation/ui/home/c$e$b;->e:Lcom/zykj/evaluation/ui/home/c$e$b;

    aput-object v0, v5, v11

    aput-object v1, v5, v12

    .line 22
    invoke-static {v5}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v19, 0x4

    const/16 v20, 0x0

    .line 23
    const-string v16, "\u5f00\u59cb\u65f6\u95f4"

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Ls6/d;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v2, v3, v4, v14, v15}, [Ls6/d;

    move-result-object v0

    .line 24
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    move-object/from16 v0, p1

    goto :goto_0

    .line 25
    :goto_1
    invoke-direct {v1, v0}, Lcom/zykj/evaluation/ui/home/HomeFilterState;-><init>(Ljava/util/List;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/ui/home/HomeFilterState;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/evaluation/ui/home/HomeFilterState;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/evaluation/ui/home/HomeFilterState;->copy(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls6/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Ljava/util/List;)Lcom/zykj/evaluation/ui/home/HomeFilterState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls6/d;",
            ">;)",
            "Lcom/zykj/evaluation/ui/home/HomeFilterState;"
        }
    .end annotation

    const-string v0, "filterDataList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    invoke-direct {v0, p1}, Lcom/zykj/evaluation/ui/home/HomeFilterState;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/ui/home/HomeFilterState;

    iget-object v1, p0, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getFilterDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ls6/d;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/HomeFilterState;->filterDataList:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HomeFilterState(filterDataList="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
