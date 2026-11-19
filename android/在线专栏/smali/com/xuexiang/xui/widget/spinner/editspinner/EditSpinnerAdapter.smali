.class public Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;
.super Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter<",
        "TT;>;",
        "Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;"
    }
.end annotation


# instance fields
.field private mBackgroundSelector:I

.field private mFilterColor:Ljava/lang/String;

.field private mIsFilterKey:Z

.field private mTextColor:I

.field private mTextSize:F


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;-><init>(Ljava/util/List;)V

    const-string p1, "#F15C58"

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mFilterColor:Ljava/lang/String;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mIsFilterKey:Z

    return-void
.end method

.method public constructor <init>([Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([TT;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;-><init>([Ljava/lang/Object;)V

    const-string p1, "#F15C58"

    .line 5
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mFilterColor:Ljava/lang/String;

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mIsFilterKey:Z

    return-void
.end method


# virtual methods
.method public getEditSpinnerFilter()Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerFilter;
    .locals 0

    return-object p0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    if-nez p2, :cond_0

    .line 1
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    sget v0, Lcom/xuexiang/xui/R$layout;->ms_layout_list_item:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 2
    new-instance p3, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;

    iget v4, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mTextColor:I

    iget v5, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mTextSize:F

    iget v6, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mBackgroundSelector:I

    const/4 v7, 0x0

    move-object v2, p3

    move-object v3, p2

    invoke-direct/range {v2 .. v7}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;-><init>(Landroid/view/View;IFILcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$1;)V

    .line 3
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;

    .line 5
    :goto_0
    invoke-static {p3}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;->access$100(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object p3

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getItem(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method

.method public onFilter(Ljava/lang/String;)Z
    .locals 7

    const-string v0, "[^\\s]*"

    .line 1
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDataSource:Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->initDisplayData(Ljava/util/List;)V

    const/4 p1, 0x0

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mIndexs:[I

    array-length v1, v0

    if-ge p1, v1, :cond_3

    .line 5
    aput p1, v0, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 6
    :cond_0
    :try_start_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 8
    :goto_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDataSource:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_3

    .line 9
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getDataSourceString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "\\s+"

    const-string v5, "|"

    .line 10
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 11
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 12
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mIndexs:[I

    iget-object v4, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    aput v0, v3, v4

    .line 13
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mIsFilterKey:Z

    if-eqz v3, :cond_1

    .line 14
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getDataSourceString(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "<font color=\""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v6, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mFilterColor:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "\">"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "</font>"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, p1, v5}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 15
    :cond_1
    iget-object v3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->getDataSourceString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :catch_0
    move-exception p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    :cond_3
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 18
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/BaseEditSpinnerAdapter;->mDisplayData:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_4

    const/4 v2, 0x1

    :cond_4
    return v2
.end method

.method public setBackgroundSelector(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mBackgroundSelector:I

    return-object p0
.end method

.method public setFilterColor(Ljava/lang/String;)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mFilterColor:Ljava/lang/String;

    return-object p0
.end method

.method public setIsFilterKey(Z)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;
    .locals 0

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mIsFilterKey:Z

    return-object p0
.end method

.method public setTextColor(I)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mTextColor:I

    return-object p0
.end method

.method public setTextSize(F)Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;->mTextSize:F

    return-object p0
.end method
