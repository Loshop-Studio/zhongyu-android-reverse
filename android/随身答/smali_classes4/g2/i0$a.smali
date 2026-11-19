.class public Lg2/i0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg2/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Lg2/i0;


# direct methods
.method public constructor <init>(Lg2/i0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg2/i0$a;->a:Lg2/i0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg2/i0$a;->a:Lg2/i0;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/i0;->d(Lg2/i0;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "MobclickRT"

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lg2/i0$a;->a:Lg2/i0;

    .line 12
    .line 13
    invoke-static {v0}, Lg2/i0;->f(Lg2/i0;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lg2/i0$a;->a:Lg2/i0;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v0, v2}, Lg2/i0;->e(Lg2/i0;Z)Z

    .line 23
    .line 24
    .line 25
    const-string v0, "--->>> went background."

    .line 26
    .line 27
    invoke-static {v1, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Lg2/i0$a;->a:Lg2/i0;

    .line 31
    .line 32
    invoke-static {v0}, Lg2/i0;->g(Lg2/i0;)Ljava/util/ArrayList;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-ge v2, v0, :cond_0

    .line 41
    .line 42
    iget-object v0, p0, Lg2/i0$a;->a:Lg2/i0;

    .line 43
    .line 44
    invoke-static {v0}, Lg2/i0;->g(Lg2/i0;)Ljava/util/ArrayList;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Lg2/j0;

    .line 53
    .line 54
    invoke-interface {v0}, Lg2/j0;->n()V

    .line 55
    .line 56
    .line 57
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    return-void

    .line 61
    :cond_1
    const-string v0, "--->>> still foreground."

    .line 62
    .line 63
    invoke-static {v1, v0}, Lm2/h;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
