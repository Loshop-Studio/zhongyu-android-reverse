.class public final Lcom/friday/document/adapter/SyncFileAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/document/model/ManualSyncEntity;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget v0, Lcom/friday/document/R$layout;->item_sync_file:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    invoke-direct {p0, v0, v1, v2, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(ILjava/util/List;ILkotlin/jvm/internal/n;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/document/model/ManualSyncEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/SyncFileAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/document/model/ManualSyncEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/document/model/ManualSyncEntity;)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "item"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget v0, Lcom/friday/document/R$id;->tv_filename:I

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/friday/document/model/ManualSyncEntity;->getFileEntity()Lcom/friday/common/entity/FileEntity;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget v1, Lcom/friday/document/R$id;->tv_modify_time:I

    .line 26
    .line 27
    invoke-virtual {p2}, Lcom/friday/document/model/ManualSyncEntity;->getFileEntity()Lcom/friday/common/entity/FileEntity;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v0, v1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/friday/document/model/ManualSyncEntity;->getSyncState()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    if-eq p2, v0, :cond_2

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    if-eq p2, v0, :cond_1

    .line 49
    .line 50
    const/4 v0, 0x3

    .line 51
    if-eq p2, v0, :cond_0

    .line 52
    .line 53
    return-void

    .line 54
    :cond_0
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 55
    .line 56
    const-string v0, "\u540c\u6b65\u6210\u529f"

    .line 57
    .line 58
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 59
    .line 60
    .line 61
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 62
    .line 63
    const-string v0, "#3EDBAA"

    .line 64
    .line 65
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setTextColor(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_1
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 74
    .line 75
    const-string v0, "\u540c\u6b65\u5931\u8d25,\u8bf7\u8054\u7cfb\u5b9e\u65bd\u4eba\u5458"

    .line 76
    .line 77
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 78
    .line 79
    .line 80
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 81
    .line 82
    const-string v0, "#FF6B57"

    .line 83
    .line 84
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setTextColor(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 93
    .line 94
    const-string v0, "\u6b63\u5728\u540c\u6b65"

    .line 95
    .line 96
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 97
    .line 98
    .line 99
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 100
    .line 101
    const-string v0, "#4797F3"

    .line 102
    .line 103
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setTextColor(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_3
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 112
    .line 113
    const-string v0, "\u5373\u5c06\u540c\u6b65"

    .line 114
    .line 115
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 116
    .line 117
    .line 118
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 119
    .line 120
    const-string v0, "#494949"

    .line 121
    .line 122
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setTextColor(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 127
    .line 128
    .line 129
    return-void
.end method
