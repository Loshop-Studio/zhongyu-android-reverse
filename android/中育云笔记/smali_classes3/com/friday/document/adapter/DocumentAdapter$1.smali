.class public final Lcom/friday/document/adapter/DocumentAdapter$1;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/adapter/DocumentAdapter;-><init>()V
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
.method public a(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "oldItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "newItem"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-ne v1, v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v1, v2, :cond_1

    .line 35
    .line 36
    :cond_0
    sget-object v1, Lcom/friday/document/adapter/b$b;->a:Lcom/friday/document/adapter/b$b;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eq v1, v2, :cond_2

    .line 58
    .line 59
    sget-object v1, Lcom/friday/document/adapter/b$c;->a:Lcom/friday/document/adapter/b$c;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    :cond_2
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_3

    .line 85
    .line 86
    sget-object v1, Lcom/friday/document/adapter/b$a;->a:Lcom/friday/document/adapter/b$a;

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-nez p1, :cond_4

    .line 112
    .line 113
    sget-object p1, Lcom/friday/document/adapter/b$d;->a:Lcom/friday/document/adapter/b$d;

    .line 114
    .line 115
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    :cond_4
    return-object v0
.end method

.method public areContentsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z
    .locals 2

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode()Z

    move-result v0

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->isInMultiSelectMode()Z

    move-result v1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected()Z

    move-result v0

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->isSelected()Z

    move-result v1

    if-ne v0, v1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    move-result v0

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getSyncStatus()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 5
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object v1

    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    check-cast p2, Lcom/friday/document/adapter/MultiModeFileEntity;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter$1;->areContentsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z

    move-result p1

    return p1
.end method

.method public areItemsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z
    .locals 1

    const-string v0, "oldItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object p1

    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lcom/friday/document/adapter/MultiModeFileEntity;->getEntity()Lcom/friday/common/entity/FileEntity;

    move-result-object p2

    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    check-cast p2, Lcom/friday/document/adapter/MultiModeFileEntity;

    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter$1;->areItemsTheSame(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 2
    .line 3
    check-cast p2, Lcom/friday/document/adapter/MultiModeFileEntity;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/DocumentAdapter$1;->a(Lcom/friday/document/adapter/MultiModeFileEntity;Lcom/friday/document/adapter/MultiModeFileEntity;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
