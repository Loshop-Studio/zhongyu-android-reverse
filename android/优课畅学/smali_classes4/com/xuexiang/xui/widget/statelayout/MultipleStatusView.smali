.class public Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final o:Landroid/widget/FrameLayout$LayoutParams;


# instance fields
.field public a:Landroid/view/View;

.field public b:Landroid/view/View;

.field public c:Landroid/view/View;

.field public d:Landroid/view/View;

.field public e:Landroid/view/View;

.field public f:I

.field public g:I

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:Landroid/view/LayoutInflater;

.field public m:Landroid/view/View$OnClickListener;

.field public final n:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->o:Landroid/widget/FrameLayout$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Lcom/xuexiang/xui/R$attr;->MultipleStatusViewStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_empty_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_error_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_loading_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$layout;->msv_layout_no_network_view:I

    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i:I

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n:Ljava/util/List;

    .line 8
    invoke-virtual {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public final varargs a([Landroid/view/View;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_2

    .line 4
    :cond_0
    :try_start_0
    array-length v0, p1

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_2

    .line 7
    .line 8
    aget-object v2, p1, v1

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    goto :goto_1

    .line 16
    :catch_0
    move-exception p1

    .line 17
    goto :goto_3

    .line 18
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    :goto_2
    return-void

    .line 22
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final b(I)Landroid/view/View;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->l:Landroid/view/LayoutInflater;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView:[I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_emptyView:I

    .line 9
    .line 10
    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f:I

    .line 11
    .line 12
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f:I

    .line 17
    .line 18
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_errorView:I

    .line 19
    .line 20
    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g:I

    .line 21
    .line 22
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g:I

    .line 27
    .line 28
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_loadingView:I

    .line 29
    .line 30
    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h:I

    .line 31
    .line 32
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h:I

    .line 37
    .line 38
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_noNetworkView:I

    .line 39
    .line 40
    iget p3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i:I

    .line 41
    .line 42
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i:I

    .line 47
    .line 48
    sget p2, Lcom/xuexiang/xui/R$styleable;->MultipleStatusView_msv_contentView:I

    .line 49
    .line 50
    const/4 p3, -0x1

    .line 51
    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    iput p2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->j:I

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->l:Landroid/view/LayoutInflater;

    .line 69
    .line 70
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->k:I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e:Landroid/view/View;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->j:I

    .line 9
    .line 10
    const/4 v2, -0x1

    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->l:Landroid/view/LayoutInflater;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-virtual {v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e:Landroid/view/View;

    .line 21
    .line 22
    sget-object v2, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->o:Landroid/widget/FrameLayout$LayoutParams;

    .line 23
    .line 24
    invoke-virtual {p0, v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final e()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget-object v4, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n:Ljava/util/List;

    .line 14
    .line 15
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    const/16 v4, 0x8

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    move v4, v1

    .line 33
    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->f:I

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->o:Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g(ILandroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->e:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEmptyView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getErrorView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getLoadingView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNoNetworkView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public getViewStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    const-string v0, "Empty view is null!"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/h;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->k:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->m:Landroid/view/View$OnClickListener;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n:Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->r(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final i()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->g:I

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->o:Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->j(ILandroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final j(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    const-string v0, "Error view is null!"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/h;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->k:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:Landroid/view/View;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->m:Landroid/view/View$OnClickListener;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n:Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:Landroid/view/View;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->r(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final l()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->h:I

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->o:Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->m(ILandroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final m(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    const-string v0, "Loading view is null!"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/h;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->k:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:Landroid/view/View;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:Landroid/view/View;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    invoke-virtual {p0, p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->r(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->i:I

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->o:Landroid/widget/FrameLayout$LayoutParams;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->p(ILandroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->c:Landroid/view/View;

    .line 7
    .line 8
    iget-object v2, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b:Landroid/view/View;

    .line 9
    .line 10
    iget-object v3, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:Landroid/view/View;

    .line 11
    .line 12
    filled-new-array {v0, v1, v2, v3}, [Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->a([Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->m:Landroid/view/View$OnClickListener;

    .line 26
    .line 27
    iput-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->l:Landroid/view/LayoutInflater;

    .line 28
    .line 29
    return-void
.end method

.method public onFinishInflate()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final p(ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->b(I)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->q(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    const-string v0, "No network view is null!"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/h;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    iput v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->k:I

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:Landroid/view/View;

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->m:Landroid/view/View$OnClickListener;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->n:Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:Landroid/view/View;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:Landroid/view/View;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, p1, v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->d:Landroid/view/View;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->r(I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final r(I)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    if-ge v2, v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-ne v4, p1, :cond_0

    .line 18
    .line 19
    move v4, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const/16 v4, 0x8

    .line 22
    .line 23
    :goto_1
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    return-void
.end method

.method public setOnRetryClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;->m:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    return-void
.end method
