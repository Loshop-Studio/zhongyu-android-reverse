.class public final Lcom/friday/document/model/ManualSyncEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final fileEntity:Lcom/friday/common/entity/FileEntity;

.field private syncState:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/entity/FileEntity;I)V
    .locals 1

    const-string v0, "fileEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    iput p2, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/friday/common/entity/FileEntity;IILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/friday/document/model/ManualSyncEntity;-><init>(Lcom/friday/common/entity/FileEntity;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/document/model/ManualSyncEntity;Lcom/friday/common/entity/FileEntity;IILjava/lang/Object;)Lcom/friday/document/model/ManualSyncEntity;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget p2, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/model/ManualSyncEntity;->copy(Lcom/friday/common/entity/FileEntity;I)Lcom/friday/document/model/ManualSyncEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/friday/common/entity/FileEntity;
    .locals 1

    iget-object v0, p0, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    return v0
.end method

.method public final copy(Lcom/friday/common/entity/FileEntity;I)Lcom/friday/document/model/ManualSyncEntity;
    .locals 1

    const-string v0, "fileEntity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/document/model/ManualSyncEntity;

    invoke-direct {v0, p1, p2}, Lcom/friday/document/model/ManualSyncEntity;-><init>(Lcom/friday/common/entity/FileEntity;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/document/model/ManualSyncEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/document/model/ManualSyncEntity;

    iget-object v1, p0, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    iget-object v3, p1, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    iget p1, p1, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getFileEntity()Lcom/friday/common/entity/FileEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSyncState()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setSyncState(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/friday/document/model/ManualSyncEntity;->fileEntity:Lcom/friday/common/entity/FileEntity;

    iget v1, p0, Lcom/friday/document/model/ManualSyncEntity;->syncState:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ManualSyncEntity(fileEntity="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", syncState="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
