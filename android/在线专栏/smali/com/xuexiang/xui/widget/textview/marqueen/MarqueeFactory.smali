.class public abstract Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;,
        Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private isOnItemClickRegistered:Z

.field protected mContext:Landroid/content/Context;

.field protected mDatas:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TE;>;"
        }
    .end annotation
.end field

.field private mMarqueeView:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;

.field protected mOnItemClickListener:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener<",
            "TT;TE;>;"
        }
    .end annotation
.end field

.field protected mViews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mContext:Landroid/content/Context;

    return-void
.end method

.method private registerOnItemClick()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->isOnItemClickRegistered:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mOnItemClickListener:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mDatas:Ljava/util/List;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mDatas:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mViews:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 4
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mDatas:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    .line 5
    new-instance v3, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;

    invoke-direct {v3, v1, v2, v0}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;-><init>(Landroid/view/View;Ljava/lang/Object;I)V

    .line 6
    new-instance v2, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$1;

    invoke-direct {v2, p0, v3}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$1;-><init>(Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$ViewHolder;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->isOnItemClickRegistered:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public abstract generateMarqueeItemView(Ljava/lang/Object;)Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)TT;"
        }
    .end annotation
.end method

.method public getMarqueeViews()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mViews:Ljava/util/List;

    return-object v0
.end method

.method public setAttachedToMarqueeView(Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;)V
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mMarqueeView:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;

    return-void
.end method

.method public setData(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TE;>;)V"
        }
    .end annotation

    if-eqz p1, :cond_2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mDatas:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mViews:Ljava/util/List;

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 5
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    .line 6
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->generateMarqueeItemView(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mViews:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 8
    :cond_1
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->registerOnItemClick()V

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mMarqueeView:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;

    if-eqz p1, :cond_2

    .line 10
    invoke-virtual {p1, p0}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeView;->setMarqueeFactory(Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public setOnItemClickListener(Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener<",
            "TT;TE;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->mOnItemClickListener:Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory$OnItemClickListener;

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/marqueen/MarqueeFactory;->registerOnItemClick()V

    return-void
.end method
