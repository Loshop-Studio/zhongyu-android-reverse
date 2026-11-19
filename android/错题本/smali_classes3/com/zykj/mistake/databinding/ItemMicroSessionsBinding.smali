.class public abstract Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/ImageView;

.field public final b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->a:Landroid/widget/ImageView;

    .line 6
    .line 7
    iput-object p4, p0, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;->b:Landroid/widget/TextView;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;
    .locals 3

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget v1, Lcom/zykj/mistake/R$layout;->item_micro_sessions:I

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p0, v1, p1, v2, v0}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lcom/zykj/mistake/databinding/ItemMicroSessionsBinding;

    .line 13
    .line 14
    return-object p0
.end method
