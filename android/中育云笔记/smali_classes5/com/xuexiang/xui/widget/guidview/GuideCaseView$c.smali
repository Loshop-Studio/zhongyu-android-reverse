.class public Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/xuexiang/xui/widget/guidview/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, Lcom/xuexiang/xui/R$id;->gcv_title:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Landroid/widget/TextView;

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->a(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 19
    .line 20
    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->c(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, -0x1

    .line 25
    if-eq v0, v1, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 28
    .line 29
    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->d(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget-object v1, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 34
    .line 35
    invoke-static {v1}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->c(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    invoke-virtual {p1, v0, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->e(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Ly7/b;->c()Landroid/graphics/Typeface;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 60
    .line 61
    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->f(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/text/Spanned;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 68
    .line 69
    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->f(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Landroid/text/Spanned;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/guidview/GuideCaseView$c;->a:Lcom/xuexiang/xui/widget/guidview/GuideCaseView;

    .line 78
    .line 79
    invoke-static {v0}, Lcom/xuexiang/xui/widget/guidview/GuideCaseView;->g(Lcom/xuexiang/xui/widget/guidview/GuideCaseView;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method
