.class public abstract Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Landroidx/recyclerview/widget/RecyclerView$b0;",
        ">",
        "Landroidx/recyclerview/widget/RecyclerView$g<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private mClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected final mData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field private mLongClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected mSelectPosition:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    const/4 v1, -0x1

    .line 6
    iput v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    if-eqz p1, :cond_0

    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$g;-><init>()V

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    const/4 v1, -0x1

    .line 10
    iput v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    if-eqz p1, :cond_0

    .line 11
    array-length v1, p1

    if-lez v1, :cond_0

    .line 12
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mLongClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener;

    return-object p0
.end method

.method private checkPosition(I)Z
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private getBundle(Ljava/lang/String;Ljava/lang/Object;)Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 2
    instance-of v1, p2, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 3
    check-cast p2, Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 4
    :cond_0
    instance-of v1, p2, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    .line 5
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_0

    .line 6
    :cond_1
    instance-of v1, p2, Ljava/lang/Integer;

    if-eqz v1, :cond_2

    .line 7
    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    goto :goto_0

    .line 8
    :cond_2
    instance-of v1, p2, Ljava/lang/Float;

    if-eqz v1, :cond_3

    .line 9
    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    goto :goto_0

    .line 10
    :cond_3
    instance-of v1, p2, Ljava/lang/Double;

    if-eqz v1, :cond_4

    .line 11
    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    .line 12
    :cond_4
    instance-of v1, p2, Ljava/lang/Short;

    if-eqz v1, :cond_5

    .line 13
    check-cast p2, Ljava/lang/Short;

    invoke-virtual {p2}, Ljava/lang/Short;->shortValue()S

    move-result p2

    int-to-double v1, p2

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    .line 14
    :cond_5
    instance-of v1, p2, Ljava/lang/Long;

    if-eqz v1, :cond_6

    .line 15
    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-double v1, v1

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    goto :goto_0

    .line 16
    :cond_6
    instance-of v1, p2, Landroid/os/Parcelable;

    if-eqz v1, :cond_7

    .line 17
    check-cast p2, Landroid/os/Parcelable;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    goto :goto_0

    .line 18
    :cond_7
    instance-of v1, p2, Ljava/io/Serializable;

    if-eqz v1, :cond_8

    .line 19
    check-cast p2, Ljava/io/Serializable;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    goto :goto_0

    .line 20
    :cond_8
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method


# virtual methods
.method public add(ILjava/lang/Object;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    if-ltz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->getItemCount()I

    move-result v0

    if-gt p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyItemInserted(I)V

    :cond_0
    return-object p0
.end method

.method public add(Ljava/lang/Object;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyItemInserted(I)V

    return-object p0
.end method

.method protected abstract bindData(Landroidx/recyclerview/widget/RecyclerView$b0;ILjava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;ITT;)V"
        }
    .end annotation
.end method

.method public clear()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, -0x1

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public delete(I)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->checkPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyItemRemoved(I)V

    :cond_0
    return-object p0
.end method

.method public getData()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->checkPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getSelectItem()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getSelectPosition()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    return v0
.end method

.method protected abstract getViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)TV;"
        }
    .end annotation
.end method

.method protected inflateView(Landroid/view/ViewGroup;I)Landroid/view/View;
    .locals 2

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->getItemCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public load(Ljava/lang/Object;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    :cond_0
    return-object p0
.end method

.method public loadMore(Ljava/util/Collection;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    :cond_0
    return-object p0
.end method

.method public loadMore([Ljava/lang/Object;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 3
    array-length v0, p1

    if-lez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    :cond_0
    return-object p0
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$b0;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;I)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->bindData(Landroidx/recyclerview/widget/RecyclerView$b0;ILjava/lang/Object;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/ViewGroup;",
            "I)TV;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->getViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;

    move-result-object p1

    .line 2
    iget-object p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$b0;->itemView:Landroid/view/View;

    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;

    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$1;-><init>(Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;Landroidx/recyclerview/widget/RecyclerView$b0;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    :cond_0
    iget-object p2, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mLongClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener;

    if-eqz p2, :cond_1

    .line 5
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$b0;->itemView:Landroid/view/View;

    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$2;

    invoke-direct {v0, p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter$2;-><init>(Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;Landroidx/recyclerview/widget/RecyclerView$b0;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_1
    return-object p1
.end method

.method public refresh(ILjava/lang/Object;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITT;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->checkPosition(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyItemChanged(I)V

    :cond_0
    return-object p0
.end method

.method public refresh(Ljava/util/Collection;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    .line 7
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    :cond_0
    return-object p0
.end method

.method public refresh([Ljava/lang/Object;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 8
    array-length v0, p1

    if-lez v0, :cond_0

    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    const/4 p1, -0x1

    .line 11
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    :cond_0
    return-object p0
.end method

.method public refreshPartly(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->getBundle(Ljava/lang/String;Ljava/lang/Object;)Landroid/os/Bundle;

    move-result-object p2

    .line 2
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyItemChanged(ILjava/lang/Object;)V

    return-void
.end method

.method public resetDataSource(Ljava/util/Collection;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "TT;>;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-object p0
.end method

.method public setOnItemClickListener(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener<",
            "TT;>;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;

    return-object p0
.end method

.method public setOnItemLongClickListener(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener;)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener<",
            "TT;>;)",
            "Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;"
        }
    .end annotation

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mLongClickListener:Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener;

    return-object p0
.end method

.method public setSelectPosition(I)Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/XRecyclerAdapter;->mSelectPosition:I

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$g;->notifyDataSetChanged()V

    return-object p0
.end method
