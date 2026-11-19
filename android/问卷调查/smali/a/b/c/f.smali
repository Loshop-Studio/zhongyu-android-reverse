.class public La/b/c/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/a/d/b;


# instance fields
.field public final synthetic a:La/b/c/g;


# direct methods
.method public constructor <init>(La/b/c/g;)V
    .locals 0

    iput-object p1, p0, La/b/c/f;->a:La/b/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    iget-object p1, p0, La/b/c/f;->a:La/b/c/g;

    invoke-virtual {p1}, La/b/c/g;->q()La/b/c/i;

    move-result-object p1

    invoke-virtual {p1}, La/b/c/i;->i()V

    iget-object v0, p0, La/b/c/f;->a:La/b/c/g;

    .line 1
    iget-object v0, v0, Landroidx/activity/ComponentActivity;->e:La/p/b;

    .line 2
    iget-object v0, v0, La/p/b;->b:La/p/a;

    const-string v1, "androidx:appcompat"

    .line 3
    invoke-virtual {v0, v1}, La/p/a;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, La/b/c/i;->l(Landroid/os/Bundle;)V

    return-void
.end method
