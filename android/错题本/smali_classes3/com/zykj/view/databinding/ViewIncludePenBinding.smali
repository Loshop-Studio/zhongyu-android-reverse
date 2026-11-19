.class public abstract Lcom/zykj/view/databinding/ViewIncludePenBinding;
.super Landroidx/databinding/ViewDataBinding;
.source "SourceFile"


# instance fields
.field public final rbCustomColor:Lcom/zykj/view/widget/radio/CustomColorRadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenCursor:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenCustom:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenDottedLine:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenHighlighter:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenLine:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenSizeBig:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenSizeLittle:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rbPenSizeMedium:Landroid/widget/RadioButton;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rgPenColor:Landroid/widget/RadioGroup;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rgPenSize:Landroid/widget/RadioGroup;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final rgPenType:Landroid/widget/RadioGroup;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final viewLine:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public final viewLine2:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroid/view/View;ILcom/zykj/view/widget/radio/CustomColorRadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioButton;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;Landroid/widget/RadioGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p3}, Landroidx/databinding/ViewDataBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    .line 2
    iput-object p4, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbCustomColor:Lcom/zykj/view/widget/radio/CustomColorRadioButton;

    .line 3
    iput-object p5, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenCursor:Landroid/widget/RadioButton;

    .line 4
    iput-object p6, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenCustom:Landroid/widget/RadioButton;

    .line 5
    iput-object p7, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenDottedLine:Landroid/widget/RadioButton;

    .line 6
    iput-object p8, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenHighlighter:Landroid/widget/RadioButton;

    .line 7
    iput-object p9, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenLine:Landroid/widget/RadioButton;

    .line 8
    iput-object p10, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenSizeBig:Landroid/widget/RadioButton;

    .line 9
    iput-object p11, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenSizeLittle:Landroid/widget/RadioButton;

    .line 10
    iput-object p12, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rbPenSizeMedium:Landroid/widget/RadioButton;

    .line 11
    iput-object p13, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenColor:Landroid/widget/RadioGroup;

    .line 12
    iput-object p14, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenSize:Landroid/widget/RadioGroup;

    .line 13
    iput-object p15, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->rgPenType:Landroid/widget/RadioGroup;

    move-object/from16 p1, p16

    .line 14
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->viewLine:Landroid/view/View;

    move-object/from16 p1, p17

    .line 15
    iput-object p1, p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;->viewLine2:Landroid/view/View;

    return-void
.end method

.method public static bind(Landroid/view/View;)Lcom/zykj/view/databinding/ViewIncludePenBinding;
    .locals 1
    .param p0    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Landroidx/databinding/DataBindingUtil;->getDefaultComponent()Landroidx/databinding/DataBindingComponent;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewIncludePenBinding;->bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludePenBinding;

    move-result-object p0

    return-object p0
.end method

.method public static bind(Landroid/view/View;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludePenBinding;
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
    sget v0, Lcom/zykj/view/R$layout;->view_include_pen:I

    invoke-static {p1, p0, v0}, Landroidx/databinding/ViewDataBinding;->bind(Ljava/lang/Object;Landroid/view/View;I)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;)Lcom/zykj/view/databinding/ViewIncludePenBinding;
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

    invoke-static {p0, v0}, Lcom/zykj/view/databinding/ViewIncludePenBinding;->inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludePenBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/zykj/view/databinding/ViewIncludePenBinding;
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

    invoke-static {p0, p1, p2, v0}, Lcom/zykj/view/databinding/ViewIncludePenBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludePenBinding;

    move-result-object p0

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ZLjava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludePenBinding;
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
    sget v0, Lcom/zykj/view/R$layout;->view_include_pen:I

    invoke-static {p0, v0, p1, p2, p3}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;

    return-object p0
.end method

.method public static inflate(Landroid/view/LayoutInflater;Ljava/lang/Object;)Lcom/zykj/view/databinding/ViewIncludePenBinding;
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
    sget v0, Lcom/zykj/view/R$layout;->view_include_pen:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2, p1}, Landroidx/databinding/ViewDataBinding;->inflateInternal(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;ZLjava/lang/Object;)Landroidx/databinding/ViewDataBinding;

    move-result-object p0

    check-cast p0, Lcom/zykj/view/databinding/ViewIncludePenBinding;

    return-object p0
.end method
