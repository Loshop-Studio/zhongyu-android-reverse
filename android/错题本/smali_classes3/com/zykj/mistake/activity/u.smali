.class public final synthetic Lcom/zykj/mistake/activity/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/activity/MistakeDetailActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/u;->a:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    sget v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/u;->a:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 4
    .line 5
    invoke-static {v0}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, Lv0/k;->a:[C

    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-eq v1, v2, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lcom/bumptech/glide/b;->a:Lcom/bumptech/glide/load/engine/c;

    .line 25
    .line 26
    iget-object v0, v0, Lcom/bumptech/glide/load/engine/c;->f:Lb0/t;

    .line 27
    .line 28
    invoke-virtual {v0}, Lb0/t;->a()Ld0/a;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-interface {v0}, Ld0/a;->clear()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string v1, "You must call this method on a background thread"

    .line 39
    .line 40
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw v0
.end method
