.class public final Lcom/zykj/blackboard/core/edit/HistoryData;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final backgroundColor:I

.field private final backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

.field private final rootGraph:Lcom/zykj/blackboard/core/graph/Graph;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V
    .locals 1

    .line 1
    const-string v0, "rootGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "backgroundLineConfig"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

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

    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    return-object v0
.end method

.method public final copy(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)Lcom/zykj/blackboard/core/edit/HistoryData;
    .locals 1

    const-string v0, "rootGraph"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundLineConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/blackboard/core/edit/HistoryData;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/blackboard/core/edit/HistoryData;-><init>(Lcom/zykj/blackboard/core/graph/Graph;ILcom/zykj/blackboard/bean/BackgroundLineConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

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

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

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

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRootGraph()Lcom/zykj/blackboard/core/graph/Graph;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->rootGraph:Lcom/zykj/blackboard/core/graph/Graph;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundColor:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/blackboard/core/edit/HistoryData;->backgroundLineConfig:Lcom/zykj/blackboard/bean/BackgroundLineConfig;

    invoke-virtual {v1}, Lcom/zykj/blackboard/bean/BackgroundLineConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HistoryData(rootGraph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
