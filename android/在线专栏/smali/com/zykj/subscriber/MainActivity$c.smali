.class public final Lcom/zykj/subscriber/MainActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/subscriber/MainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/subscriber/MainActivity$c;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 6
    .param p1    # Landroid/content/ComponentName;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/os/IBinder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$c;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p2}, Lt1/a$a;->y(Landroid/os/IBinder;)Lt1/a;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/zykj/subscriber/MainActivity;->B(Lcom/zykj/subscriber/MainActivity;Lt1/a;)V

    .line 2
    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$c;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {p1}, Landroidx/lifecycle/m;->a(Landroidx/lifecycle/l;)Landroidx/lifecycle/g;

    move-result-object v0

    invoke-static {}, Lf3/v0;->b()Lf3/e0;

    move-result-object v1

    new-instance v3, Lcom/zykj/subscriber/MainActivity$c$a;

    iget-object p1, p0, Lcom/zykj/subscriber/MainActivity$c;->a:Lcom/zykj/subscriber/MainActivity;

    const/4 p2, 0x0

    invoke-direct {v3, p1, p2}, Lcom/zykj/subscriber/MainActivity$c$a;-><init>(Lcom/zykj/subscriber/MainActivity;Lq2/d;)V

    const/4 v2, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lf3/g;->d(Lf3/h0;Lq2/g;Lf3/j0;Lx2/p;ILjava/lang/Object;)Lf3/m1;

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0
    .param p1    # Landroid/content/ComponentName;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    return-void
.end method
