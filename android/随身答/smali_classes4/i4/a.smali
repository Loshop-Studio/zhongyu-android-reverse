.class public Li4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lj4/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lk4/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj4/a;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-direct {v0, v1}, Lj4/a;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Li4/a;->a:Lj4/a;

    .line 11
    .line 12
    iput-object p1, v0, Lj4/a;->C:Landroid/content/Context;

    .line 13
    .line 14
    iput-object p2, v0, Lj4/a;->a:Lk4/c;

    .line 15
    .line 16
    sget p2, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 17
    .line 18
    invoke-static {p1, p2}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;I)I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iput p2, v0, Lj4/a;->G:I

    .line 23
    .line 24
    iget-object p2, p0, Li4/a;->a:Lj4/a;

    .line 25
    .line 26
    sget v0, Lcom/xuexiang/xui/R$attr;->colorAccent:I

    .line 27
    .line 28
    invoke-static {p1, v0}, Lcom/xuexiang/xui/utils/g;->l(Landroid/content/Context;I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p2, Lj4/a;->H:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public a()Lg4/b;
    .locals 2

    .line 1
    new-instance v0, Lg4/b;

    .line 2
    .line 3
    iget-object v1, p0, Li4/a;->a:Lj4/a;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lg4/b;-><init>(Lj4/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public b(Landroid/view/ViewGroup;)Li4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->a:Lj4/a;

    .line 2
    .line 3
    iput-object p1, v0, Lj4/a;->A:Landroid/view/ViewGroup;

    .line 4
    .line 5
    return-object p0
.end method

.method public c(Ljava/util/Calendar;Ljava/util/Calendar;)Li4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->a:Lj4/a;

    .line 2
    .line 3
    iput-object p1, v0, Lj4/a;->h:Ljava/util/Calendar;

    .line 4
    .line 5
    iput-object p2, v0, Lj4/a;->i:Ljava/util/Calendar;

    .line 6
    .line 7
    return-object p0
.end method

.method public d(Ljava/lang/String;)Li4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->a:Lj4/a;

    .line 2
    .line 3
    iput-object p1, v0, Lj4/a;->F:Ljava/lang/String;

    .line 4
    .line 5
    return-object p0
.end method

.method public e(Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;)Li4/a;
    .locals 1

    .line 1
    iget-object v0, p0, Li4/a;->a:Lj4/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/widget/configure/TimePickerType;->a()[Z

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iput-object p1, v0, Lj4/a;->f:[Z

    .line 8
    .line 9
    return-object p0
.end method
