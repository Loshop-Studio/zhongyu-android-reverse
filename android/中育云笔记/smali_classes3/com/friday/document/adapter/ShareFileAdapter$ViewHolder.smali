.class public final Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/ShareFileAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ViewHolder"
.end annotation


# instance fields
.field public final c:Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

.field public final d:Lhd/l;

.field public final synthetic e:Lcom/friday/document/adapter/ShareFileAdapter;


# direct methods
.method public constructor <init>(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;Lhd/l;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "onItemClick"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->e:Lcom/friday/document/adapter/ShareFileAdapter;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    iput-object p2, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

    .line 21
    .line 22
    iput-object p3, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->d:Lhd/l;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance p3, Lo2/j;

    .line 29
    .line 30
    invoke-direct {p3, p1, p0}, Lo2/j;-><init>(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic a(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->b(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;Landroid/view/View;)V

    return-void
.end method

.method public static final b(Lcom/friday/document/adapter/ShareFileAdapter;Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/ListAdapter;->getCurrentList()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string p2, "getCurrentList(...)"

    .line 6
    .line 7
    invoke-static {p0, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    invoke-static {p0, p2}, Lrc/g0;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/friday/document/model/ShareListEntity;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    iget-object p1, p1, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->d:Lhd/l;

    .line 23
    .line 24
    invoke-interface {p1, p0}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method


# virtual methods
.method public final c(Lcom/friday/document/model/ShareListEntity;)V
    .locals 5

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

    .line 11
    .line 12
    iget-object v1, v1, Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;->d:Landroid/widget/ImageView;

    .line 13
    .line 14
    sget-object v2, Lk2/n;->a:Lk2/n$a;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getType()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-virtual {v2, v3}, Lk2/n$a;->d(Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

    .line 28
    .line 29
    iget-object v2, v1, Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;->g:Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget v3, Lcom/friday/document/R$string;->share_by_owner:I

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getOwnerName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v1, v3, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

    .line 57
    .line 58
    iget-object v1, v1, Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;->e:Landroid/widget/TextView;

    .line 59
    .line 60
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getFileName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

    .line 68
    .line 69
    iget-object v1, v1, Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;->f:Landroid/widget/TextView;

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getRoot()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_0

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->getShareFile()Lcom/friday/document/model/ShareFile;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getLatestTimestamp()J

    .line 82
    .line 83
    .line 84
    move-result-wide v2

    .line 85
    invoke-static {v2, v3}, Lcom/blankj/utilcode/util/TimeUtils;->millis2String(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {v0}, Lcom/friday/document/model/ShareFile;->getUpdateTime()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, p1}, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->d(Lcom/friday/document/model/ShareListEntity;)V

    .line 98
    .line 99
    .line 100
    return-void
.end method

.method public final d(Lcom/friday/document/model/ShareListEntity;)V
    .locals 2

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/friday/document/model/ShareListEntity;->isSelected()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    sget p1, Lcom/friday/document/R$color;->select:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget p1, Lcom/friday/document/R$color;->transparent:I

    .line 16
    .line 17
    :goto_0
    iget-object v0, p0, Lcom/friday/document/adapter/ShareFileAdapter$ViewHolder;->c:Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;

    .line 18
    .line 19
    iget-object v1, v0, Lcom/friday/document/databinding/ItemListTeacherFileShareBinding;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    invoke-virtual {v1, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
