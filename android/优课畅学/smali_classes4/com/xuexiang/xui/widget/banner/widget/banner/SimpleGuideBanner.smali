.class public Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;
.super Ls1/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls1/b;"
    }
.end annotation


# instance fields
.field public M:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ls1/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->N()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static synthetic M(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->M:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public N()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Ls1/a;->w(Z)Ls1/a;

    .line 3
    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Ls1/a;->v(Z)Ls1/a;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public r(I)Landroid/view/View;
    .locals 8

    .line 1
    iget-object v0, p0, Ls1/a;->b:Landroid/content/Context;

    .line 2
    .line 3
    sget v1, Lcom/xuexiang/xui/R$layout;->xui_adapter_simple_guide:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget v1, Lcom/xuexiang/xui/R$id;->iv:I

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/widget/ImageView;

    .line 17
    .line 18
    sget v2, Lcom/xuexiang/xui/R$id;->tv_jump:I

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/widget/TextView;

    .line 25
    .line 26
    sget v3, Lcom/xuexiang/xui/R$id;->tv_start:I

    .line 27
    .line 28
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/widget/TextView;

    .line 33
    .line 34
    iget-object v4, p0, Ls1/a;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    const/16 v5, 0x8

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    move v7, v6

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move v7, v5

    .line 48
    :goto_0
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 49
    .line 50
    .line 51
    iget-object v7, p0, Ls1/a;->f:Ljava/util/List;

    .line 52
    .line 53
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    add-int/lit8 v7, v7, -0x1

    .line 58
    .line 59
    if-ne p1, v7, :cond_1

    .line 60
    .line 61
    move v5, v6

    .line 62
    :cond_1
    invoke-virtual {v3, v5}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lc2/a;->b()Lc2/a;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1, v1, v4}, Lc2/a;->a(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    new-instance p1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$a;

    .line 73
    .line 74
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$a;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    new-instance p1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$b;

    .line 81
    .line 82
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$b;-><init>(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method

.method public setOnJumpClickListener(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->M:Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;

    .line 2
    .line 3
    return-void
.end method
