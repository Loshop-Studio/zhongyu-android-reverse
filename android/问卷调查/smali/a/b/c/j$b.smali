.class public final La/b/c/j$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/b/g/i/m$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/b/c/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic b:La/b/c/j;


# direct methods
.method public constructor <init>(La/b/c/j;)V
    .locals 0

    iput-object p1, p0, La/b/c/j$b;->b:La/b/c/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(La/b/g/i/g;Z)V
    .locals 0

    iget-object p2, p0, La/b/c/j$b;->b:La/b/c/j;

    invoke-virtual {p2, p1}, La/b/c/j;->D(La/b/g/i/g;)V

    return-void
.end method

.method public d(La/b/g/i/g;)Z
    .locals 2

    iget-object v0, p0, La/b/c/j$b;->b:La/b/c/j;

    invoke-virtual {v0}, La/b/c/j;->O()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
