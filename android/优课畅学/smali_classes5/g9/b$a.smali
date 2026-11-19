.class public Lg9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg9/b;


# direct methods
.method public constructor <init>(Lg9/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg9/b$a;->a:Lg9/b;

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
    iget-object v0, p0, Lg9/b$a;->a:Lg9/b;

    .line 2
    .line 3
    invoke-static {v0}, Lg9/b;->d(Lg9/b;)Ly8/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lg9/b$a;->a:Lg9/b;

    .line 11
    .line 12
    invoke-static {v0}, Lg9/b;->f(Lg9/b;)I

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lg9/b$a;->a:Lg9/b;

    .line 16
    .line 17
    invoke-static {v0}, Lg9/b;->e(Lg9/b;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x4

    .line 22
    if-gt v0, v1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lg9/b$a;->a:Lg9/b;

    .line 25
    .line 26
    invoke-static {v0}, Lg9/b;->g(Lg9/b;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    iget-object v0, p0, Lg9/b$a;->a:Lg9/b;

    .line 34
    .line 35
    invoke-static {v0}, Lg9/b;->d(Lg9/b;)Ly8/c;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-object v1, p0, Lg9/b$a;->a:Lg9/b;

    .line 40
    .line 41
    invoke-static {v1}, Lg9/b;->e(Lg9/b;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    mul-int/lit8 v1, v1, 0x64

    .line 46
    .line 47
    int-to-long v1, v1

    .line 48
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    :goto_0
    iget-object v0, p0, Lg9/b$a;->a:Lg9/b;

    .line 53
    .line 54
    invoke-static {v0}, Lg9/b;->d(Lg9/b;)Ly8/c;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ly8/c;->L()V

    .line 59
    .line 60
    .line 61
    return-void
.end method
