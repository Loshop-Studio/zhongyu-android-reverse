.class public final Lcom/friday/document/adapter/ShareFileAdapter$ShareFileDiffUtilCallback;
.super Landroidx/recyclerview/widget/DiffUtil$ItemCallback;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/ShareFileAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ShareFileDiffUtilCallback"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/DiffUtil$ItemCallback<",
        "Lcom/friday/document/model/ShareListEntity;",
        ">;"
    }
.end annotation


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
.method public a(Lcom/friday/document/model/ShareListEntity;Lcom/friday/document/model/ShareListEntity;)Z
    .locals 2

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
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_0

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getShareTime()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getUpdateTime()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    invoke-virtual {v1}, Lcom/friday/document/model/ShareFile;->getUpdateTime()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_0

    .line 98
    .line 99
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->isSelected()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->isSelected()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-ne v0, v1, :cond_0

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getRoot()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->getRoot()Z

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    if-ne p1, p2, :cond_0

    .line 118
    .line 119
    const/4 p1, 0x1

    .line 120
    return p1

    .line 121
    :cond_0
    const/4 p1, 0x0

    .line 122
    return p1
.end method

.method public bridge synthetic areContentsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/model/ShareListEntity;

    .line 2
    .line 3
    check-cast p2, Lcom/friday/document/model/ShareListEntity;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter$ShareFileDiffUtilCallback;->a(Lcom/friday/document/model/ShareListEntity;Lcom/friday/document/model/ShareListEntity;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public bridge synthetic areItemsTheSame(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/model/ShareListEntity;

    .line 2
    .line 3
    check-cast p2, Lcom/friday/document/model/ShareListEntity;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter$ShareFileDiffUtilCallback;->b(Lcom/friday/document/model/ShareListEntity;Lcom/friday/document/model/ShareListEntity;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public b(Lcom/friday/document/model/ShareListEntity;Lcom/friday/document/model/ShareListEntity;)Z
    .locals 1

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
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p2}, Lcom/friday/document/model/ShareFile;->getFileId()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public c(Lcom/friday/document/model/ShareListEntity;Lcom/friday/document/model/ShareListEntity;)Ljava/lang/Object;
    .locals 1

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
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->isSelected()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Lcom/friday/document/model/ShareListEntity;->isSelected()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eq p1, p2, :cond_0

    .line 20
    .line 21
    sget-object p1, Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;->c:Lcom/friday/document/adapter/ShareFileAdapter$PayloadKey;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    return-object p1
.end method

.method public bridge synthetic getChangePayload(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lcom/friday/document/model/ShareListEntity;

    .line 2
    .line 3
    check-cast p2, Lcom/friday/document/model/ShareListEntity;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter$ShareFileDiffUtilCallback;->c(Lcom/friday/document/model/ShareListEntity;Lcom/friday/document/model/ShareListEntity;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
