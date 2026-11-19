.class public final Lcom/friday/document/adapter/SyncFailedAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/common/entity/FileEntity;",
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
    sget v0, Lcom/friday/document/R$layout;->item_sync_file_for_teacher:I

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
    check-cast p2, Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/friday/document/adapter/SyncFailedAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/FileEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/FileEntity;)V
    .locals 2

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
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget v1, Lcom/friday/document/R$id;->tv_modify_time:I

    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v0, v1, p2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 28
    .line 29
    .line 30
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 31
    .line 32
    const-string v0, "\u540c\u6b65\u5931\u8d25,\u8bf7\u8054\u7cfb\u5b9e\u65bd\u4eba\u5458"

    .line 33
    .line 34
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 35
    .line 36
    .line 37
    sget p2, Lcom/friday/document/R$id;->tv_status:I

    .line 38
    .line 39
    const-string v0, "#FF6B57"

    .line 40
    .line 41
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p1, p2, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setTextColor(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 46
    .line 47
    .line 48
    return-void
.end method
