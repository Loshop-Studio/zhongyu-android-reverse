.class public abstract Lcom/xuexiang/xui/utils/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/xuexiang/xui/utils/j;->a:Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Lx2/b$b;->k()Lx2/b$b;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/16 v1, 0xc8

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lx2/b$b;->l(I)Lx2/b$b;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-static {}, Lp1/b;->c()Landroid/graphics/Typeface;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v0, v1}, Lx2/b$b;->n(Landroid/graphics/Typeface;)Lx2/b$b;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v0, v1}, Lx2/b$b;->j(Z)Lx2/b$b;

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static a(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/utils/j$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/utils/j$b;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/xuexiang/xui/utils/j;->b(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static b(Ljava/lang/Runnable;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    sget-object v0, Lcom/xuexiang/xui/utils/j;->a:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static c(I)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/utils/j$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/utils/j$a;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/xuexiang/xui/utils/j;->b(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
