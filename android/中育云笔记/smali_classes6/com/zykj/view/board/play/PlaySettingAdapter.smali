.class public final Lcom/zykj/view/board/play/PlaySettingAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->a:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->b:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/PlaySettingAdapter;->c(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V

    return-void
.end method

.method public static final c(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnb/g;

    .line 8
    .line 9
    invoke-virtual {p0}, Lnb/g;->a()Lhd/a;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public b(Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;I)V
    .locals 3

    .line 1
    const-string v0, "holder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;->b()Landroid/widget/ImageView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v1, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->a:Landroid/content/Context;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->b:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lnb/g;

    .line 19
    .line 20
    invoke-virtual {v2}, Lnb/g;->c()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;->a()Landroid/widget/TextView;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->b:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Lnb/g;

    .line 42
    .line 43
    invoke-virtual {v1}, Lnb/g;->b()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 51
    .line 52
    new-instance v0, Lnb/c;

    .line 53
    .line 54
    invoke-direct {v0, p0, p2}, Lnb/c;-><init>(Lcom/zykj/view/board/play/PlaySettingAdapter;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public d(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;
    .locals 2

    .line 1
    const-string p2, "parent"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->a:Landroid/content/Context;

    .line 7
    .line 8
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget v0, Lcom/zykj/view/R$layout;->view_item_play_setting:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    new-instance p2, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;

    .line 20
    .line 21
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {p2, p1}, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;-><init>(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/PlaySettingAdapter;->b(Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/PlaySettingAdapter;->d(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
