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

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0017R\u001a\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/view/board/play/PlaySettingAdapter;",
        "Landroidx/recyclerview/widget/RecyclerView$Adapter;",
        "Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;",
        "Landroid/content/Context;",
        "context",
        "",
        "Lcom/zykj/view/board/play/PlayerConfigSetting;",
        "data",
        "<init>",
        "(Landroid/content/Context;Ljava/util/List;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;",
        "getItemCount",
        "()I",
        "holder",
        "position",
        "Ld6/s;",
        "onBindViewHolder",
        "(Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;I)V",
        "Landroid/content/Context;",
        "Ljava/util/List;",
        "PlaySpeedRateHolder",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final data:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/view/board/play/PlayerConfigSetting;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/zykj/view/board/play/PlayerConfigSetting;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->context:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->data:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/PlaySettingAdapter;->onBindViewHolder$lambda$0(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$0(Lcom/zykj/view/board/play/PlaySettingAdapter;ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->data:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/zykj/view/board/play/PlayerConfigSetting;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/zykj/view/board/play/PlayerConfigSetting;->getClickCallback()Lr6/a;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->data:Ljava/util/List;

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

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/PlaySettingAdapter;->onBindViewHolder(Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;I)V
    .locals 3
    .param p1    # Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;->getIcon()Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->data:Ljava/util/List;

    invoke-interface {v2, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zykj/view/board/play/PlayerConfigSetting;

    invoke-virtual {v2}, Lcom/zykj/view/board/play/PlayerConfigSetting;->getDrawableId()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 3
    invoke-virtual {p1}, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;->getContent()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->data:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/zykj/view/board/play/PlayerConfigSetting;

    invoke-virtual {v1}, Lcom/zykj/view/board/play/PlayerConfigSetting;->getDisplayText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Landroidx/navigation/k;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p2, v1}, Landroidx/navigation/k;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/PlaySettingAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p2, "parent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/zykj/view/board/play/PlaySettingAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lcom/zykj/view/R$layout;->view_item_play_setting:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    invoke-direct {p2, p1}, Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;-><init>(Landroid/view/View;)V

    return-object p2
.end method
