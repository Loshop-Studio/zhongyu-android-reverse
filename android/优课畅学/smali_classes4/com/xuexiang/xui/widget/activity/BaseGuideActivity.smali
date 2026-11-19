.class public abstract Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract m()Ljava/util/List;
.end method

.method public abstract n()Ljava/lang/Class;
.end method

.method public o(Ljava/util/List;Ljava/lang/Class;)V
    .locals 1

    .line 1
    const-class v0, Lcom/xuexiang/xui/widget/banner/transform/DepthTransformer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0, p2}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->p(Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lcom/xuexiang/xui/utils/i;->b(Landroid/app/Activity;)V

    .line 5
    .line 6
    .line 7
    sget p1, Lcom/xuexiang/xui/R$layout;->xui_activity_guide:I

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->m()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->n()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->o(Ljava/util/List;Ljava/lang/Class;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;->q()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public p(Ljava/util/List;Ljava/lang/Class;Ljava/lang/Class;)V
    .locals 3

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->sgb:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 8
    .line 9
    const/high16 v1, 0x40c00000    # 6.0f

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ls1/b;->K(F)Ls1/b;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ls1/b;->I(F)Ls1/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 22
    .line 23
    const/high16 v2, 0x41400000    # 12.0f

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ls1/b;->H(F)Ls1/b;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 30
    .line 31
    const/high16 v2, 0x40600000    # 3.5f

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ls1/b;->G(F)Ls1/b;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 38
    .line 39
    const-class v2, Lr1/a;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ls1/b;->L(Ljava/lang/Class;)Ls1/b;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 46
    .line 47
    invoke-virtual {v1, p2}, Ls1/a;->z(Ljava/lang/Class;)Ls1/a;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    check-cast p2, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    const/high16 v2, 0x41200000    # 10.0f

    .line 55
    .line 56
    invoke-virtual {p2, v1, v2, v1, v2}, Ls1/a;->h(FFFF)Ls1/a;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 61
    .line 62
    invoke-virtual {p2, p1}, Ls1/a;->y(Ljava/util/List;)Ls1/a;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;

    .line 67
    .line 68
    invoke-virtual {p1}, Ls1/a;->C()V

    .line 69
    .line 70
    .line 71
    new-instance p1, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$a;

    .line 72
    .line 73
    invoke-direct {p1, p0, p3}, Lcom/xuexiang/xui/widget/activity/BaseGuideActivity$a;-><init>(Lcom/xuexiang/xui/widget/activity/BaseGuideActivity;Ljava/lang/Class;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->setOnJumpClickListener(Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner$c;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public q()V
    .locals 0

    .line 1
    return-void
.end method
