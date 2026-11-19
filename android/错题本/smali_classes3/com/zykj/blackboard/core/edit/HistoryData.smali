.class public final Lcom/zykj/blackboard/core/edit/HistoryData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\'\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/zykj/blackboard/core/edit/HistoryData;",
        "",
        "rootGraph",
        "Lcom/zykj/blackboard/core/graph/Graph;",
        "backgroundColor",
        "",
        "backgroundLineConfig",
        "Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V",
        "getBackgroundColor",
        "()I",
        "getBackgroundLineConfig",
        "()Lcom/zykj/blackboard/bean/BackgroundLineConfig;",
        "getRootGraph",
        "()Lcom/zykj/blackboard/core/graph/Graph;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final backgroundColor:I

.field private final backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final rootGraph:Lcom/zykj/blackboard/core/graph/Graph;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "backgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 19
    .line 20
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/blackboard/core/edit/HistoryData;Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/HistoryData;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/HistoryData;->copy(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/edit/HistoryData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/blackboard/core/graph/Graph;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    return v0
.end method

.method public final component3()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    return-object v0
.end method

.method public final copy(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/edit/HistoryData;
    .locals 1
    .param p1    # Lcom/zykj/blackboard/core/graph/Graph;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/zykj/blackboard/bean/BackgroundLineConfig;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "rootGraph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundLineConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/blackboard/core/edit/HistoryData;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/HistoryData;-><init>(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/blackboard/core/edit/HistoryData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/blackboard/core/edit/HistoryData;

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    iget-object v3, p1, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    iget v3, p1, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    iget-object p1, p1, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    .line 2
    .line 3
    return v0
.end method

.method public final getBackgroundLineConfig()Lcom/zykj/blackboard/bean/BackgroundLineConfig;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRootGraph()Lcom/zykj/blackboard/core/graph/Graph;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, Landroidx/collection/a;->c(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HistoryData(rootGraph="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", backgroundLineConfig="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
