.class Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ViewHolder"
.end annotation


# instance fields
.field private mTextView:Landroid/widget/TextView;


# direct methods
.method private constructor <init>(Landroid/view/View;IFI)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    sget v0, Lcom/xuexiang/xui/R$id;->tv_tinted_spinner:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;->mTextView:Landroid/widget/TextView;

    .line 4
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;->mTextView:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p3}, Landroid/widget/TextView;->setTextSize(IF)V

    if-eqz p4, :cond_0

    .line 6
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;->mTextView:Landroid/widget/TextView;

    invoke-virtual {p2, p4}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result p1

    const/4 p2, 0x1

    if-ne p1, p2, :cond_1

    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;->mTextView:Landroid/widget/TextView;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextDirection(I)V

    :cond_1
    return-void
.end method

.method synthetic constructor <init>(Landroid/view/View;IFILcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;-><init>(Landroid/view/View;IFI)V

    return-void
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;)Landroid/widget/TextView;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinnerAdapter$ViewHolder;->mTextView:Landroid/widget/TextView;

    return-object p0
.end method
