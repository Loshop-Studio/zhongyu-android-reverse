.class public final Lcom/friday/document/adapter/MultiModeFileEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final entity:Lcom/friday/common/entity/FileEntity;

.field private final isInMultiSelectMode:Z

.field private final isSelected:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/friday/common/entity/FileEntity;->$stable:I

    sput v0, Lcom/friday/document/adapter/MultiModeFileEntity;->$stable:I

    return-void
.end method

.method public constructor <init>(ZZLcom/friday/common/entity/FileEntity;)V
    .locals 1

    const-string v0, "entity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    .line 3
    iput-boolean p2, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    .line 4
    iput-object p3, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    return-void
.end method

.method public synthetic constructor <init>(ZZLcom/friday/common/entity/FileEntity;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    move p2, v0

    .line 5
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/friday/document/adapter/MultiModeFileEntity;-><init>(ZZLcom/friday/common/entity/FileEntity;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/document/adapter/MultiModeFileEntity;ZZLcom/friday/common/entity/FileEntity;ILjava/lang/Object;)Lcom/friday/document/adapter/MultiModeFileEntity;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/document/adapter/MultiModeFileEntity;->copy(ZZLcom/friday/common/entity/FileEntity;)Lcom/friday/document/adapter/MultiModeFileEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    return v0
.end method

.method public final component3()Lcom/friday/common/entity/FileEntity;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    return-object v0
.end method

.method public final copy(ZZLcom/friday/common/entity/FileEntity;)Lcom/friday/document/adapter/MultiModeFileEntity;
    .locals 1

    const-string v0, "entity"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/document/adapter/MultiModeFileEntity;

    invoke-direct {v0, p1, p2, p3}, Lcom/friday/document/adapter/MultiModeFileEntity;-><init>(ZZLcom/friday/common/entity/FileEntity;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    iget-boolean v1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    iget-boolean v3, p1, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    iget-boolean v3, p1, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    iget-object p1, p1, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEntity()Lcom/friday/common/entity/FileEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isInMultiSelectMode()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode:Z

    iget-boolean v1, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected:Z

    iget-object v2, p0, Lcom/friday/document/adapter/MultiModeFileEntity;->entity:Lcom/friday/common/entity/FileEntity;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "MultiModeFileEntity(isInMultiSelectMode="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", entity="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
