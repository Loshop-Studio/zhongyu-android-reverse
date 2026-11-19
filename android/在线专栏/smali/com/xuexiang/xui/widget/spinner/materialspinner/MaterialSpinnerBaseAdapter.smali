.class public abstract Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/widget/BaseAdapter;"
    }
.end annotation


# instance fields
.field private backgroundSelector:I

.field private final context:Landroid/content/Context;

.field private selectedIndex:I

.field private textColor:I

.field private textSize:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public abstract get(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public abstract getCount()I
.end method

.method public abstract getItem(I)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getItemText(I)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract getItems()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end method

.method public getSelectedIndex()I
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->selectedIndex:I

    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p2, :cond_2

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->context:Landroid/content/Context;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    .line 2
    sget v0, Lcom/xuexiang/xui/R$layout;->ms_layout_list_item:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 3
    sget p3, Lcom/xuexiang/xui/R$id;->tv_tinted_spinner:I

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->textColor:I

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->textSize:F

    invoke-virtual {p3, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->backgroundSelector:I

    if-eqz v0, :cond_0

    .line 7
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x4

    .line 10
    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTextDirection(I)V

    .line 11
    :cond_1
    new-instance v0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter$ViewHolder;

    const/4 v1, 0x0

    invoke-direct {v0, p3, v1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter$ViewHolder;-><init>(Landroid/widget/TextView;Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter$1;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 12
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter$ViewHolder;

    invoke-static {p3}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter$ViewHolder;->access$100(Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter$ViewHolder;)Landroid/widget/TextView;

    move-result-object p3

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->getItemText(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-object p2
.end method

.method public notifyItemSelected(I)V
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->selectedIndex:I

    return-void
.end method

.method public setBackgroundSelector(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter<",
            "TT;>;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->backgroundSelector:I

    return-object p0
.end method

.method public setTextColor(I)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter<",
            "TT;>;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->textColor:I

    return-object p0
.end method

.method public setTextSize(F)Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter<",
            "TT;>;"
        }
    .end annotation

    iput p1, p0, Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinnerBaseAdapter;->textSize:F

    return-object p0
.end method
