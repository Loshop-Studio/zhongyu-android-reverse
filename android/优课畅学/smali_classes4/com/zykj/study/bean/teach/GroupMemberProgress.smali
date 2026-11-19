.class public final Lcom/zykj/study/bean/teach/GroupMemberProgress;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final catalogs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation
.end field

.field private final completed:I

.field private final groupId:I

.field private final groupName:Ljava/lang/String;

.field private final members:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "groupName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "catalogs"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    .line 17
    .line 18
    iput p3, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    .line 19
    .line 20
    iput p4, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    .line 21
    .line 22
    iput-object p5, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    .line 23
    .line 24
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/teach/GroupMemberProgress;ILjava/lang/String;IILjava/util/List;ILjava/lang/Object;)Lcom/zykj/study/bean/teach/GroupMemberProgress;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget p4, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    :cond_4
    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/study/bean/teach/GroupMemberProgress;->copy(ILjava/lang/String;IILjava/util/List;)Lcom/zykj/study/bean/teach/GroupMemberProgress;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;IILjava/util/List;)Lcom/zykj/study/bean/teach/GroupMemberProgress;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;)",
            "Lcom/zykj/study/bean/teach/GroupMemberProgress;"
        }
    .end annotation

    const-string v0, "groupName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "catalogs"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/study/bean/teach/GroupMemberProgress;-><init>(ILjava/lang/String;IILjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/teach/GroupMemberProgress;

    iget v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    iget v3, p1, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    iget v3, p1, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    iget v3, p1, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    iget-object p1, p1, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCatalogs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/study/bean/course/CatalogBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCompleted()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    .line 2
    .line 3
    return v0
.end method

.method public final getGroupId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getGroupName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMembers()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupId:I

    iget-object v1, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->groupName:Ljava/lang/String;

    iget v2, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->members:I

    iget v3, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->completed:I

    iget-object v4, p0, Lcom/zykj/study/bean/teach/GroupMemberProgress;->catalogs:Ljava/util/List;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "GroupMemberProgress(groupId="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", groupName="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", members="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", completed="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", catalogs="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
