.class public final Lcom/friday/paint/view/six/NewThumbnailListAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "SourceFile"

# interfaces
.implements Lp1/d;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/paint/view/six/NewThumbnailListAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/friday/paint/model/NoteListEntity;",
        "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
        ">;",
        "Lp1/d;"
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
    .locals 3

    .line 1
    sget v0, Lcom/friday/paint/R$layout;->res_item_thumbnail_list:I

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
.method public addDraggableModule(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lp1/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
            "**>;)",
            "Lp1/a;"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lp1/d;->addDraggableModule(Lcom/chad/library/adapter/base/BaseQuickAdapter;)Lp1/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/paint/model/NoteListEntity;)V
    .locals 3

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    sget v0, Lcom/friday/paint/R$id;->tv_page_num:I

    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    move-result-object v0

    .line 4
    sget v1, Lcom/friday/paint/R$id;->iv_in_class:I

    invoke-virtual {p2}, Lcom/friday/paint/model/NoteListEntity;->getInClass()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setGone(IZ)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 5
    sget v0, Lcom/friday/paint/R$id;->iv_thumbnail:I

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 6
    invoke-virtual {p2}, Lcom/friday/paint/model/NoteListEntity;->getSelected()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 7
    new-instance v0, Ljava/io/File;

    invoke-virtual {p2}, Lcom/friday/paint/model/NoteListEntity;->getThumbnailFile()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    .line 9
    invoke-static {p2}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    move-result-object p2

    .line 10
    new-instance v1, Lw/g$a;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 11
    invoke-virtual {v1, v0}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    move-result-object v0

    .line 12
    invoke-static {v0, p1}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    move-result-object v0

    .line 13
    new-instance v1, Lcom/friday/paint/view/six/NewThumbnailListAdapter$c;

    invoke-direct {v1, p1, p0}, Lcom/friday/paint/view/six/NewThumbnailListAdapter$c;-><init>(Landroid/widget/ImageView;Lcom/friday/paint/view/six/NewThumbnailListAdapter;)V

    invoke-virtual {v0, v1}, Lw/g$a;->s(Ly/a;)Lw/g$a;

    .line 14
    new-instance v1, Lcom/friday/paint/view/six/NewThumbnailListAdapter$b;

    invoke-direct {v1, p1}, Lcom/friday/paint/view/six/NewThumbnailListAdapter$b;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v0, v1}, Lw/g$a;->j(Lw/g$d;)Lw/g$a;

    .line 15
    sget-object p1, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    invoke-virtual {v0, p1}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 16
    invoke-virtual {v0, p1}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 17
    invoke-virtual {v0, p1}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 18
    invoke-virtual {v0}, Lw/g$a;->c()Lw/g;

    move-result-object p1

    .line 19
    invoke-interface {p2, p1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    return-void
.end method

.method public convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/paint/model/NoteListEntity;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;",
            "Lcom/friday/paint/model/NoteListEntity;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "payloads"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    invoke-super {p0, p1, p2, p3}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V

    .line 21
    sget v0, Lcom/friday/paint/R$id;->tv_page_num:I

    invoke-virtual {p0, p2}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemPosition(Ljava/lang/Object;)I

    move-result v1

    const/4 v2, 0x1

    add-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    .line 22
    sget v0, Lcom/friday/paint/R$id;->iv_thumbnail:I

    invoke-virtual {p1, v0}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 23
    check-cast p3, Ljava/lang/Iterable;

    .line 24
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 25
    instance-of v3, v1, Lcom/friday/common/entity/PayloadKey;

    if-eqz v3, :cond_0

    .line 26
    check-cast v1, Lcom/friday/common/entity/PayloadKey;

    sget-object v3, Lcom/friday/paint/view/six/NewThumbnailListAdapter$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v3, v1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    const/4 v3, 0x3

    if-eq v1, v3, :cond_1

    goto :goto_0

    .line 27
    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-virtual {p2}, Lcom/friday/paint/model/NoteListEntity;->getThumbnailFile()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 29
    invoke-static {v3}, Lcoil3/l;->a(Landroid/content/Context;)Lcoil3/e;

    move-result-object v3

    .line 30
    new-instance v4, Lw/g$a;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Lw/g$a;-><init>(Landroid/content/Context;)V

    .line 31
    invoke-virtual {v4, v1}, Lw/g$a;->d(Ljava/lang/Object;)Lw/g$a;

    move-result-object v1

    .line 32
    invoke-static {v1, v0}, Lw/j;->q(Lw/g$a;Landroid/widget/ImageView;)Lw/g$a;

    move-result-object v1

    .line 33
    new-instance v4, Lcom/friday/paint/view/six/NewThumbnailListAdapter$e;

    invoke-direct {v4, v0, p0}, Lcom/friday/paint/view/six/NewThumbnailListAdapter$e;-><init>(Landroid/widget/ImageView;Lcom/friday/paint/view/six/NewThumbnailListAdapter;)V

    invoke-virtual {v1, v4}, Lw/g$a;->s(Ly/a;)Lw/g$a;

    .line 34
    new-instance v4, Lcom/friday/paint/view/six/NewThumbnailListAdapter$d;

    invoke-direct {v4, v0}, Lcom/friday/paint/view/six/NewThumbnailListAdapter$d;-><init>(Landroid/widget/ImageView;)V

    invoke-virtual {v1, v4}, Lw/g$a;->j(Lw/g$d;)Lw/g$a;

    .line 35
    sget-object v4, Lcoil3/request/CachePolicy;->h:Lcoil3/request/CachePolicy;

    invoke-virtual {v1, v4}, Lw/g$a;->k(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 36
    invoke-virtual {v1, v4}, Lw/g$a;->f(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 37
    invoke-virtual {v1, v4}, Lw/g$a;->l(Lcoil3/request/CachePolicy;)Lw/g$a;

    .line 38
    invoke-virtual {v1}, Lw/g$a;->c()Lw/g;

    move-result-object v1

    .line 39
    invoke-interface {v3, v1}, Lcoil3/e;->c(Lw/g;)Lw/c;

    goto :goto_0

    .line 40
    :cond_2
    sget v1, Lcom/friday/paint/R$id;->iv_in_class:I

    invoke-virtual {p2}, Lcom/friday/paint/model/NoteListEntity;->getInClass()Z

    move-result v3

    xor-int/2addr v3, v2

    invoke-virtual {p1, v1, v3}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->setGone(IZ)Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;

    goto :goto_0

    .line 41
    :cond_3
    sget v1, Lcom/friday/paint/R$id;->iv_thumbnail:I

    invoke-virtual {p1, v1}, Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-virtual {p2}, Lcom/friday/paint/model/NoteListEntity;->getSelected()Z

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setSelected(Z)V

    goto/16 :goto_0

    :cond_4
    return-void
.end method

.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/friday/paint/model/NoteListEntity;

    invoke-virtual {p0, p1, p2}, Lcom/friday/paint/view/six/NewThumbnailListAdapter;->convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/paint/model/NoteListEntity;)V

    return-void
.end method

.method public bridge synthetic convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Ljava/lang/Object;Ljava/util/List;)V
    .locals 0

    .line 2
    check-cast p2, Lcom/friday/paint/model/NoteListEntity;

    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/paint/view/six/NewThumbnailListAdapter;->convert(Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;Lcom/friday/paint/model/NoteListEntity;Ljava/util/List;)V

    return-void
.end method

.method public final updateSelectedItem(I)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-eqz v3, :cond_3

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    add-int/lit8 v4, v2, 0x1

    .line 24
    .line 25
    if-gez v2, :cond_0

    .line 26
    .line 27
    invoke-static {}, Lrc/w;->w()V

    .line 28
    .line 29
    .line 30
    :cond_0
    check-cast v3, Lcom/friday/paint/model/NoteListEntity;

    .line 31
    .line 32
    if-ne v2, p1, :cond_1

    .line 33
    .line 34
    const/4 v5, 0x1

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v5, v1

    .line 37
    :goto_1
    invoke-virtual {v3}, Lcom/friday/paint/model/NoteListEntity;->getSelected()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eq v6, v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v3, v5}, Lcom/friday/paint/model/NoteListEntity;->setSelected(Z)V

    .line 44
    .line 45
    .line 46
    sget-object v3, Lcom/friday/common/entity/PayloadKey;->SELECTED:Lcom/friday/common/entity/PayloadKey;

    .line 47
    .line 48
    invoke-virtual {p0, v2, v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    move v2, v4

    .line 52
    goto :goto_0

    .line 53
    :cond_3
    return-void
.end method

.method public final updateThumbnailExceptCurrent(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    add-int/lit8 v3, v1, 0x1

    .line 23
    .line 24
    if-gez v1, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lrc/w;->w()V

    .line 27
    .line 28
    .line 29
    :cond_0
    check-cast v2, Lcom/friday/paint/model/NoteListEntity;

    .line 30
    .line 31
    if-eq v1, p1, :cond_1

    .line 32
    .line 33
    sget-object v2, Lcom/friday/common/entity/PayloadKey;->THUMBNAIL:Lcom/friday/common/entity/PayloadKey;

    .line 34
    .line 35
    invoke-virtual {p0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    move v1, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    return-void
.end method
