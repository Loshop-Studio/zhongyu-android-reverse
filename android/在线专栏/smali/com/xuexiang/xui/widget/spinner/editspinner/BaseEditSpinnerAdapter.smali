.class public abstract Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/widget/BaseAdapter;"
    }
.end annotation


# instance fields
.field protected final mDataSource:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected mDisplayData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field protected final mIndexs:[I


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDataSource:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->initDisplayData(Ljava/util/List;)V

    .line 5
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mIndexs:[I

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 6
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDataSource:Ljava/util/List;

    .line 8
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    .line 10
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->initDisplayData(Ljava/util/List;)V

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [I

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mIndexs:[I

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CollectionUtils;->getSize(Ljava/util/Collection;)I

    move-result v0

    return v0
.end method

.method protected getDataSourceString(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDataSource:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/CollectionUtils;->getListItem(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method public abstract getEditSpinnerFilter()Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getItem(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getItem(I)Ljava/lang/String;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-static {v0, p1}, Lcom/xuexiang/xui/utils/CollectionUtils;->getListItem(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method protected getItemString(I)Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDataSource:Ljava/util/List;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mIndexs:[I

    aget p1, v1, p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected initDisplayData(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/xuexiang/xui/utils/CollectionUtils;->isEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public recycle()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDataSource:Ljava/util/List;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CollectionUtils;->clear(Ljava/util/Collection;)V

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-static {v0}, Lcom/xuexiang/xui/utils/CollectionUtils;->clear(Ljava/util/Collection;)V

    .line 3
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
