.class public final Lcom/zykj/view/board/play/SpeedRateAdapter;
.super Landroidx/recyclerview/widget/ListAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/ListAdapter<",
        "Lcom/zykj/view/board/play/SpeedRate;",
        "Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/zykj/view/board/play/SpeedRateAdapter;",
        "Landroidx/recyclerview/widget/ListAdapter;",
        "Lcom/zykj/view/board/play/SpeedRate;",
        "Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;",
        "Lkotlin/Function1;",
        "Ld6/s;",
        "itemClickListener",
        "<init>",
        "(Lr6/c;)V",
        "Landroid/view/ViewGroup;",
        "parent",
        "",
        "viewType",
        "onCreateViewHolder",
        "(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;",
        "holder",
        "position",
        "onBindViewHolder",
        "(Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;I)V",
        "Lr6/c;",
        "SpeedRateViewHolder",
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
.field private final itemClickListener:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr6/c;)V
    .locals 1
    .param p1    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "itemClickListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/view/board/play/SpeedRateAdapter$1;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/zykj/view/board/play/SpeedRateAdapter$1;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/ListAdapter;-><init>(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/zykj/view/board/play/SpeedRateAdapter;->itemClickListener:Lr6/c;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Lcom/zykj/view/board/play/SpeedRateAdapter;Lcom/zykj/view/board/play/SpeedRate;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/zykj/view/board/play/SpeedRateAdapter;->onBindViewHolder$lambda$1(Lcom/zykj/view/board/play/SpeedRateAdapter;Lcom/zykj/view/board/play/SpeedRate;Landroid/view/View;)V

    return-void
.end method

.method private static final onBindViewHolder$lambda$1(Lcom/zykj/view/board/play/SpeedRateAdapter;Lcom/zykj/view/board/play/SpeedRate;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/view/board/play/SpeedRateAdapter;->itemClickListener:Lr6/c;

    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SpeedRateAdapter;->onBindViewHolder(Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;I)V
    .locals 3
    .param p1    # Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/ListAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/zykj/view/board/play/SpeedRate;

    .line 3
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;->getLabel()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/zykj/view/board/play/SpeedRate;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;->getLabel()Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/zykj/view/board/play/SpeedRate;->getSelected()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 5
    invoke-virtual {p1}, Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;->getLabel()Landroid/widget/TextView;

    move-result-object v0

    .line 6
    iget-object v1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 7
    invoke-virtual {p2}, Lcom/zykj/view/board/play/SpeedRate;->getTextColor()I

    move-result v2

    .line 8
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 10
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, La5/f;

    const/16 v1, 0x8

    invoke-direct {v0, v1, p0, p2}, La5/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/zykj/view/board/play/SpeedRateAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;
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
    new-instance p2, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 3
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 4
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/zykj/view/R$dimen;->view_18:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    const/4 v1, -0x1

    .line 5
    invoke-direct {p1, v1, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v0, Lcom/zykj/view/R$dimen;->text_8:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    const/4 v0, 0x0

    .line 7
    invoke-virtual {p2, v0, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    const/16 p1, 0x11

    .line 8
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 9
    new-instance p1, Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;

    invoke-direct {p1, p2}, Lcom/zykj/view/board/play/SpeedRateAdapter$SpeedRateViewHolder;-><init>(Landroid/widget/TextView;)V

    return-object p1
.end method
