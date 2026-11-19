.class public abstract Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final btBatchDelete:Landroidx/appcompat/widget/AppCompatButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final btReset:Landroidx/appcompat/widget/AppCompatButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final btSearch:Landroidx/appcompat/widget/AppCompatButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final freeSubNumber:Landroidx/appcompat/widget/AppCompatTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivSearch:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final ivSearchEmpty:Landroidx/appcompat/widget/AppCompatImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llBatchDelete:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llFreeListHead:Landroidx/appcompat/widget/LinearLayoutCompat;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llSearch:Landroidx/appcompat/widget/LinearLayoutCompat;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final llSearchEmpty:Landroidx/appcompat/widget/LinearLayoutCompat;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rvFreeSubscriberList:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final spRoleSelect:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvDateSelect:Landroidx/appcompat/widget/AppCompatTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvSearch:Landroidx/appcompat/widget/AppCompatEditText;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final tvSearchEmpty:Landroidx/appcompat/widget/AppCompatTextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILandroidx/appcompat/widget/AppCompatButton;Landroidx/appcompat/widget/AppCompatButton;Landroidx/appcompat/widget/AppCompatButton;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/LinearLayoutCompat;Landroidx/appcompat/widget/LinearLayoutCompat;Landroidx/appcompat/widget/LinearLayoutCompat;Landroidx/recyclerview/widget/RecyclerView;Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatEditText;Landroidx/appcompat/widget/AppCompatTextView;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    iput-object p4, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->btBatchDelete:Landroidx/appcompat/widget/AppCompatButton;

    .line 3
    iput-object p5, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->btReset:Landroidx/appcompat/widget/AppCompatButton;

    .line 4
    iput-object p6, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->btSearch:Landroidx/appcompat/widget/AppCompatButton;

    .line 5
    iput-object p7, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->freeSubNumber:Landroidx/appcompat/widget/AppCompatTextView;

    .line 6
    iput-object p8, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->ivSearch:Landroidx/appcompat/widget/AppCompatImageView;

    .line 7
    iput-object p9, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->ivSearchEmpty:Landroidx/appcompat/widget/AppCompatImageView;

    .line 8
    iput-object p10, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->llBatchDelete:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    iput-object p11, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->llFreeListHead:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 10
    iput-object p12, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->llSearch:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 11
    iput-object p13, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->llSearchEmpty:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 12
    iput-object p14, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->rvFreeSubscriberList:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    iput-object p15, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->spRoleSelect:Lcom/xuexiang/xui/widget/spinner/materialspinner/MaterialSpinner;

    move-object/from16 p1, p16

    .line 14
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvDateSelect:Landroidx/appcompat/widget/AppCompatTextView;

    move-object/from16 p1, p17

    .line 15
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvSearch:Landroidx/appcompat/widget/AppCompatEditText;

    move-object/from16 p1, p18

    .line 16
    iput-object p1, p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->tvSearchEmpty:Landroidx/appcompat/widget/AppCompatTextView;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/study/R$layout;->layout_free_subscriber_list:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;
    .locals 1
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    sget v0, Lcom/zykj/study/R$layout;->layout_free_subscriber_list:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;
    .locals 3
    .param p0    # Landroid/view/LayoutInflater;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    sget v0, Lcom/zykj/study/R$layout;->layout_free_subscriber_list:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/study/databinding/LayoutFreeSubscriberListBinding;

    return-object p0
.end method
