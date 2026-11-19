.class public final Lw0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw0/b;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Lw0/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lw0/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lw0/d;->c:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lw0/d;->d:Lw0/b$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final i()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/d;->c:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lw0/r;->a(Landroid/content/Context;)Lw0/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lw0/d;->d:Lw0/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lw0/r;->d(Lw0/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw0/d;->c:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lw0/r;->a(Landroid/content/Context;)Lw0/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lw0/d;->d:Lw0/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lw0/r;->e(Lw0/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 1
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw0/d;->i()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lw0/d;->j()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
