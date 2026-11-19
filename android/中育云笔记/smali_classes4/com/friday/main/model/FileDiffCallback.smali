.class public final Lcom/friday/main/model/FileDiffCallback;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/friday/common/entity/FileEntity;",
        ">;"
    }
.end annotation


# static fields
.field public static final $stable:I = 0x8


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

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
.method public areContentsTheSame(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/FileEntity;)Z
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
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    check-cast p2, Lcom/friday/common/entity/FileEntity;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/model/FileDiffCallback;->areContentsTheSame(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/FileEntity;)Z

    move-result p1

    return p1
.end method

.method public areItemsTheSame(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/FileEntity;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/common/entity/FileEntity;

    check-cast p2, Lcom/friday/common/entity/FileEntity;

    invoke-virtual {p0, p1, p2}, Lcom/friday/main/model/FileDiffCallback;->areItemsTheSame(Lcom/friday/common/entity/FileEntity;Lcom/friday/common/entity/FileEntity;)Z

    move-result p1

    return p1
.end method
