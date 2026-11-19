.class public final Lcom/friday/document/adapter/RecycleBinAdapter$1;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/adapter/RecycleBinAdapter;-><init>(Lcom/friday/document/viewmodel/RecycleBinViewModel;Lhd/p;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/friday/document/adapter/MultiModeFileEntity;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/DiffUtil$ItemCallback;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public areContentsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    check-cast p2, Lcom/friday/document/adapter/MultiModeFileEntity;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter$1;->areContentsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z

    move-result p1

    return p1
.end method

.method public areItemsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    move-result p1

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    check-cast p2, Lcom/friday/document/adapter/MultiModeFileEntity;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/RecycleBinAdapter$1;->areItemsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z

    move-result p1

    return p1
.end method
