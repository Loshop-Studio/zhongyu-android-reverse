.class public final Lm2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public a:Lm2/b$a;

.field public b:Lhd/q;

.field public final synthetic c:Lm2/a;


# direct methods
.method public constructor <init>(Lm2/a;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lm2/a$a;->c:Lm2/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lm2/b$a;

    .line 7
    .line 8
    invoke-static {p1}, Lm2/a;->a(Lm2/a;)Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {v0, p1}, Lm2/b$a;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Lm2/a;
    .locals 4

    .line 1
    new-instance v0, Lm2/a;

    .line 2
    .line 3
    iget-object v1, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 4
    .line 5
    invoke-virtual {v1}, Lm2/b$a;->c()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lm2/a;-><init>(Landroid/content/Context;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lm2/a;->b()Lm2/b;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Lm2/b$a;->a(Lm2/b;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lm2/a$a;->b:Lhd/q;

    .line 22
    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0}, Lm2/a;->b()Lm2/b;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v2}, Lm2/b;->a()Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    iget-object v3, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 36
    .line 37
    invoke-virtual {v3}, Lm2/b$a;->b()Landroidx/databinding/ViewDataBinding;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    invoke-interface {v1, v2, v0, v3}, Lhd/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    :cond_0
    return-object v0
.end method

.method public final b(Landroidx/databinding/ViewDataBinding;)Lm2/a$a;
    .locals 2

    .line 1
    const-string v0, "t"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Lm2/b$a;->g(Landroid/view/View;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lm2/b$a;->d(Landroidx/databinding/ViewDataBinding;)V

    .line 15
    .line 16
    .line 17
    return-object p0
.end method

.method public final c(Lhd/q;)Lm2/a$a;
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lm2/a$a;->b:Lhd/q;

    .line 7
    .line 8
    return-object p0
.end method

.method public final d(Z)Lm2/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm2/b$a;->f(Z)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final e(II)Lm2/a$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm2/b$a;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm2/a$a;->a:Lm2/b$a;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Lm2/b$a;->e(I)V

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
