.class public final Lcom/friday/document/model/ShareClassEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private checked:Z

.field private deleteMode:Z

.field private final id:I

.field private final name:Ljava/lang/String;

.field private final shareStatus:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;IZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/friday/document/model/ShareClassEntity;->id:I

    .line 3
    iput-object p2, p0, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    .line 4
    iput p3, p0, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    .line 5
    iput-boolean p4, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    .line 6
    iput-boolean p5, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;IZZILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p7, p6, 0x8

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move p4, v0

    :cond_0
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_1

    move p6, v0

    :goto_0
    move p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_1
    move p6, p5

    goto :goto_0

    .line 7
    :goto_1
    invoke-direct/range {p1 .. p6}, Lcom/friday/document/model/ShareClassEntity;-><init>(ILjava/lang/String;IZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/document/model/ShareClassEntity;ILjava/lang/String;IZZILjava/lang/Object;)Lcom/friday/document/model/ShareClassEntity;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/friday/document/model/ShareClassEntity;->id:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-boolean p5, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    :cond_4
    move p6, p4

    move p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/friday/document/model/ShareClassEntity;->copy(ILjava/lang/String;IZZ)Lcom/friday/document/model/ShareClassEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/friday/document/model/ShareClassEntity;->id:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    return v0
.end method

.method public final copy(ILjava/lang/String;IZZ)Lcom/friday/document/model/ShareClassEntity;
    .locals 6

    new-instance v0, Lcom/friday/document/model/ShareClassEntity;

    move v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/friday/document/model/ShareClassEntity;-><init>(ILjava/lang/String;IZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/document/model/ShareClassEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/document/model/ShareClassEntity;

    iget v1, p0, Lcom/friday/document/model/ShareClassEntity;->id:I

    iget v3, p1, Lcom/friday/document/model/ShareClassEntity;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    iget v3, p1, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    iget-boolean v3, p1, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    iget-boolean p1, p1, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getDeleteMode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/document/model/ShareClassEntity;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShareStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/friday/document/model/ShareClassEntity;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setChecked(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDeleteMode(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/friday/document/model/ShareClassEntity;->id:I

    iget-object v1, p0, Lcom/friday/document/model/ShareClassEntity;->name:Ljava/lang/String;

    iget v2, p0, Lcom/friday/document/model/ShareClassEntity;->shareStatus:I

    iget-boolean v3, p0, Lcom/friday/document/model/ShareClassEntity;->checked:Z

    iget-boolean v4, p0, Lcom/friday/document/model/ShareClassEntity;->deleteMode:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ShareClassEntity(id="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", name="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", shareStatus="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", checked="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", deleteMode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
