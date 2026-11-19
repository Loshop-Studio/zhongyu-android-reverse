.class public final Lcom/friday/main/adapter/FolderMoveAdapter;
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


# instance fields
.field public a:Lcom/friday/common/entity/FileEntity;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget v0, Lcom/friday/main/R$layout;->res_item_folder:I

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
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/FolderMoveAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/FileEntity;)V

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
    sget v0, Lcom/friday/main/R$id;->ivFolder:I

    .line 12
    .line 13
    invoke-virtual {p0, p2}, Lcom/friday/main/adapter/FolderMoveAdapter;->j(Lcom/friday/common/entity/FileEntity;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setImageResource(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 18
    .line 19
    .line 20
    sget v0, Lcom/friday/main/R$id;->tvFolderName:I

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 27
    .line 28
    .line 29
    sget v0, Lcom/friday/main/R$id;->tvFolderName:I

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->isFolder()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_0
    const-string v1, "#C8C9CC"

    .line 45
    .line 46
    :goto_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    :goto_1
    const-string v1, "#323233"

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :goto_2
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setTextColor(II)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 55
    .line 56
    .line 57
    sget v0, Lcom/friday/main/R$id;->tvUpdateTime:I

    .line 58
    .line 59
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getUpdateTime()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 64
    .line 65
    .line 66
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 67
    .line 68
    iget-object v0, p0, Lcom/friday/main/adapter/FolderMoveAdapter;->a:Lcom/friday/common/entity/FileEntity;

    .line 69
    .line 70
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-virtual {p1, p2}, Landroid/view/View;->setSelected(Z)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method public final j(Lcom/friday/common/entity/FileEntity;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getFileType()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    sget p1, Lcom/friday/main/R$drawable;->res_icon_item_folder:I

    .line 14
    .line 15
    return p1

    .line 16
    :cond_0
    const-string v1, "1"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    sget p1, Lcom/friday/main/R$drawable;->res_file_type_note:I

    .line 31
    .line 32
    return p1

    .line 33
    :cond_1
    sget p1, Lcom/friday/main/R$drawable;->res_file_type_note_gray:I

    .line 34
    .line 35
    return p1

    .line 36
    :cond_2
    invoke-virtual {p1}, Lcom/friday/common/entity/FileEntity;->getCached()Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-eqz p1, :cond_3

    .line 41
    .line 42
    sget p1, Lcom/friday/main/R$drawable;->res_file_type_new_note:I

    .line 43
    .line 44
    return p1

    .line 45
    :cond_3
    sget p1, Lcom/friday/main/R$drawable;->res_file_type_new_note_gray:I

    .line 46
    .line 47
    return p1
.end method

.method public final k()Lcom/friday/common/entity/FileEntity;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/adapter/FolderMoveAdapter;->a:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l(Lcom/friday/common/entity/FileEntity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/adapter/FolderMoveAdapter;->a:Lcom/friday/common/entity/FileEntity;

    .line 2
    .line 3
    return-void
.end method
