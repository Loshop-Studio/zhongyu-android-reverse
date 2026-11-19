.class public La/b/c/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/p/a$b;


# instance fields
.field public final synthetic a:La/b/c/g;


# direct methods
.method public constructor <init>(La/b/c/g;)V
    .locals 0

    iput-object p1, p0, La/b/c/e;->a:La/b/c/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, La/b/c/e;->a:La/b/c/g;

    invoke-virtual {v1}, La/b/c/g;->q()La/b/c/i;

    move-result-object v1

    invoke-virtual {v1, v0}, La/b/c/i;->p(Landroid/os/Bundle;)V

    return-object v0
.end method
