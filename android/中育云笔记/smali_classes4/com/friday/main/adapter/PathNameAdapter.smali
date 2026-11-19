.class public final Lcom/friday/main/adapter/PathNameAdapter;
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
    sget v0, Lcom/friday/main/R$layout;->item_path_name:I

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
    invoke-virtual {p0, p1, p2}, Lcom/friday/main/adapter/PathNameAdapter;->i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/FileEntity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public i(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/common/entity/FileEntity;)V
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
    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    sget v1, Lcom/friday/main/R$id;->folder:I

    .line 16
    .line 17
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/widget/ImageView;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    add-int/lit8 v2, v2, -0x1

    .line 28
    .line 29
    if-ne v2, v0, :cond_0

    .line 30
    .line 31
    sget v2, Lcom/friday/main/R$mipmap;->icon_folder_notopen:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    sget v2, Lcom/friday/main/R$mipmap;->icon_folder_open:I

    .line 35
    .line 36
    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 37
    .line 38
    .line 39
    sget v1, Lcom/friday/main/R$id;->mTvPathName:I

    .line 40
    .line 41
    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    add-int/lit8 v2, v2, -0x1

    .line 52
    .line 53
    if-eq v2, v0, :cond_1

    .line 54
    .line 55
    sget v0, Lcom/friday/main/R$color;->date_time:I

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    sget v0, Lcom/friday/main/R$color;->colorAccent:I

    .line 59
    .line 60
    :goto_1
    invoke-static {v0}, Lz1/b;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 65
    .line 66
    .line 67
    sget v0, Lcom/friday/main/R$id;->mTvPathName:I

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-virtual {p2}, Lcom/friday/common/entity/FileEntity;->getFileName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method
