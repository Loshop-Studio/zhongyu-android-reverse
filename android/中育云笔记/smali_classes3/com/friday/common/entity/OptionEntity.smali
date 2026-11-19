.class public final Lcom/friday/common/entity/OptionEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private isSelected:Z

.field private final isSingle:Z

.field private final option:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Z)V
    .locals 1

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    iput-object p2, p0, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;ZILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/friday/common/entity/OptionEntity;-><init>(ZLjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/OptionEntity;ZLjava/lang/String;ZILjava/lang/Object;)Lcom/friday/common/entity/OptionEntity;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/common/entity/OptionEntity;->copy(ZLjava/lang/String;Z)Lcom/friday/common/entity/OptionEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    return v0
.end method

.method public final copy(ZLjava/lang/String;Z)Lcom/friday/common/entity/OptionEntity;
    .locals 1

    const-string v0, "option"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/common/entity/OptionEntity;

    invoke-direct {v0, p1, p2, p3}, Lcom/friday/common/entity/OptionEntity;-><init>(ZLjava/lang/String;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/OptionEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/OptionEntity;

    iget-boolean v1, p0, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    iget-boolean v3, p1, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    iget-boolean p1, p1, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getOption()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isSingle()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    .line 2
    .line 3
    return v0
.end method

.method public final setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/friday/common/entity/OptionEntity;->isSingle:Z

    iget-object v1, p0, Lcom/friday/common/entity/OptionEntity;->option:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/friday/common/entity/OptionEntity;->isSelected:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "OptionEntity(isSingle="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", option="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
