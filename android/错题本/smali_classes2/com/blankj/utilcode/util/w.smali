.class public final Lcom/blankj/utilcode/util/w;
.super Lcom/blankj/utilcode/util/t;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/blankj/utilcode/util/x;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/blankj/utilcode/util/t;-><init>(Lcom/blankj/utilcode/util/x;)V

    .line 2
    .line 3
    .line 4
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v0, 0x19

    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    :try_start_0
    const-class p1, Landroid/widget/Toast;

    .line 11
    .line 12
    const-string v0, "mTN"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v2, "mHandler"

    .line 33
    .line 34
    invoke-virtual {p1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroid/os/Handler;

    .line 46
    .line 47
    new-instance v2, Lcom/blankj/utilcode/util/h;

    .line 48
    .line 49
    invoke-direct {v2}, Lcom/blankj/utilcode/util/h;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, v2, Lcom/blankj/utilcode/util/h;->b:Ljava/lang/Object;

    .line 53
    .line 54
    invoke-virtual {p1, v1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    .line 57
    :catch_0
    :cond_0
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/Toast;->setDuration(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/blankj/utilcode/util/t;->a:Landroid/widget/Toast;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 13
    .line 14
    .line 15
    return-void
.end method
