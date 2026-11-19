.class public abstract Lkb/w1;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkb/w1;->h(Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic b(Lhd/l;Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lkb/w1;->m(Lhd/l;Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lqc/q;
    .locals 1

    .line 1
    invoke-static {}, Lkb/w1;->l()Lqc/q;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ljava/lang/String;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0}, Lkb/w1;->k(Ljava/lang/String;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lhd/a;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lkb/w1;->g(Lhd/a;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static final f(Landroid/content/Context;Lhd/a;)V
    .locals 3

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroidx/appcompat/app/AlertDialog$Builder;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Landroidx/appcompat/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    sget v1, Lcom/zykj/view/R$string;->clear_canvas:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setMessage(I)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget v1, Lcom/zykj/view/R$string;->sure:I

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    new-instance v2, Lkb/s1;

    .line 29
    .line 30
    invoke-direct {v2, p1}, Lkb/s1;-><init>(Lhd/a;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    sget v0, Lcom/zykj/view/R$string;->cancel:I

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lkb/t1;

    .line 44
    .line 45
    invoke-direct {v1}, Lkb/t1;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Landroidx/appcompat/app/AlertDialog$Builder;->create()Landroidx/appcompat/app/AlertDialog;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    .line 57
    .line 58
    .line 59
    const/4 v0, -0x1

    .line 60
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget v1, Lcom/zykj/view/R$color;->button_text:I

    .line 65
    .line 66
    invoke-static {p0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 71
    .line 72
    .line 73
    const/high16 v1, 0x41600000    # 14.0f

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 76
    .line 77
    .line 78
    const/4 v0, -0x2

    .line 79
    invoke-virtual {p1, v0}, Landroidx/appcompat/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    sget v0, Lcom/zykj/view/R$color;->button_text:I

    .line 84
    .line 85
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public static final g(Lhd/a;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Lhd/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final h(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    invoke-interface {p0}, Landroid/content/DialogInterface;->dismiss()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final i(Landroid/content/Context;Ljava/lang/String;Lhd/l;Lhd/a;Lhd/l;)V
    .locals 4

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "initText"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "afterTextChangeCallback"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "cancelCallback"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "callback"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lpb/l;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v0, p0, v3, v1, v2}, Lpb/l;-><init>(Landroid/content/Context;IILkotlin/jvm/internal/n;)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Lkb/r1;

    .line 35
    .line 36
    invoke-direct {p0, p4}, Lkb/r1;-><init>(Lhd/l;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1, p2, p0, p3}, Lpb/l;->s(Ljava/lang/String;Lhd/l;Lhd/l;Lhd/a;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static synthetic j(Landroid/content/Context;Ljava/lang/String;Lhd/l;Lhd/a;Lhd/l;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    new-instance p2, Lkb/u1;

    .line 12
    .line 13
    invoke-direct {p2}, Lkb/u1;-><init>()V

    .line 14
    .line 15
    .line 16
    :cond_1
    and-int/lit8 p5, p5, 0x4

    .line 17
    .line 18
    if-eqz p5, :cond_2

    .line 19
    .line 20
    new-instance p3, Lkb/v1;

    .line 21
    .line 22
    invoke-direct {p3}, Lkb/v1;-><init>()V

    .line 23
    .line 24
    .line 25
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lkb/w1;->i(Landroid/content/Context;Ljava/lang/String;Lhd/l;Lhd/a;Lhd/l;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public static final k(Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public static final l()Lqc/q;
    .locals 1

    .line 1
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final m(Lhd/l;Ljava/lang/String;)Lqc/q;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    sget-object p0, Lqc/q;->a:Lqc/q;

    .line 10
    .line 11
    return-object p0
.end method
