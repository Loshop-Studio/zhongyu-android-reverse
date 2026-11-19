.class public Ls3/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lt3/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu3/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt3/a;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lt3/a;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Ls3/a;->a:Lt3/a;

    .line 11
    .line 12
    iput-object p1, v0, Lt3/a;->C:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p2, v0, Lt3/a;->a:Lu3/c;

    .line 15
    .line 16
    invoke-static {p1}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    iput p2, v0, Lt3/a;->G:I

    .line 21
    .line 22
    iget-object p2, p0, Ls3/a;->a:Lt3/a;

    .line 23
    .line 24
    invoke-static {p1}, Lcom/xuexiang/xui/utils/g;->f(Landroid/content/Context;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p2, Lt3/a;->H:I

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public a()Lq3/b;
    .locals 2

    .line 1
    new-instance v0, Lq3/b;

    .line 2
    .line 3
    iget-object v1, p0, Ls3/a;->a:Lt3/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lq3/b;-><init>(Lt3/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public b(Landroid/view/ViewGroup;)Ls3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls3/a;->a:Lt3/a;

    .line 2
    .line 3
    iput-object p1, v0, Lt3/a;->A:Landroid/view/ViewGroup;

    .line 4
    .line 5
    return-object p0
.end method

.method public c(Ljava/util/Calendar;Ljava/util/Calendar;)Ls3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls3/a;->a:Lt3/a;

    .line 2
    .line 3
    iput-object p1, v0, Lt3/a;->h:Ljava/util/Calendar;

    .line 4
    .line 5
    iput-object p2, v0, Lt3/a;->i:Ljava/util/Calendar;

    .line 6
    .line 7
    return-object p0
.end method

.method public d(Ljava/lang/String;)Ls3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls3/a;->a:Lt3/a;

    .line 2
    .line 3
    iput-object p1, v0, Lt3/a;->F:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public e(Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;)Ls3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Ls3/a;->a:Lt3/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->a()[Z

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, v0, Lt3/a;->f:[Z

    .line 8
    .line 9
    return-object p0
.end method
