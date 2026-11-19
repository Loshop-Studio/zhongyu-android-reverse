.class public final Lu0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu0/b;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu0/b$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lu0/b$a;)V
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
    iput-object p1, p0, Lu0/d;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lu0/d;->b:Lu0/b$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public d()V
    .locals 0

    .line 1
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lu0/r;->a(Landroid/content/Context;)Lu0/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu0/d;->b:Lu0/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lu0/r;->d(Lu0/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu0/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lu0/r;->a(Landroid/content/Context;)Lu0/r;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu0/d;->b:Lu0/b$a;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lu0/r;->e(Lu0/b$a;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu0/d;->j()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu0/d;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
