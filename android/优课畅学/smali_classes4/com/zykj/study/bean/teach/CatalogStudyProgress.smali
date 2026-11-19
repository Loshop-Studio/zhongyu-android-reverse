.class public final Lcom/zykj/study/bean/teach/CatalogStudyProgress;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final catalogId:I

.field private final catalogName:Ljava/lang/String;

.field private final groupList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupProgress;",
            ">;"
        }
    .end annotation
.end field

.field private final superviseId:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupProgress;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "catalogName"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "groupList"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    .line 15
    .line 16
    iput p2, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    .line 17
    .line 18
    iput-object p3, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p4, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/CatalogStudyProgress;IILjava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/CatalogStudyProgress;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->copy(IILjava/lang/String;Ljava/util/List;)Lcom/zykj/study/bean/teach/CatalogStudyProgress;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupProgress;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    return-object v0
.end method

.method public final copy(IILjava/lang/String;Ljava/util/List;)Lcom/zykj/study/bean/teach/CatalogStudyProgress;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupProgress;",
            ">;)",
            "Lcom/zykj/study/bean/teach/CatalogStudyProgress;"
        }
    .end annotation

    const-string v0, "catalogName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "groupList"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/study/bean/teach/CatalogStudyProgress;-><init>(IILjava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/CatalogStudyProgress;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/CatalogStudyProgress;

    iget v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCatalogId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCatalogName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGroupList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/teach/SuperviseGroupProgress;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuperviseId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->superviseId:I

    iget v1, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogId:I

    iget-object v2, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->catalogName:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/study/bean/teach/CatalogStudyProgress;->groupList:Ljava/util/List;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "CatalogStudyProgress(superviseId="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogName="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", groupList="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
