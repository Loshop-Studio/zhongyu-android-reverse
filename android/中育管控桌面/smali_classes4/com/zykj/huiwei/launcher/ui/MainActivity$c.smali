.class public final Lcom/zykj/huiwei/launcher/ui/MainActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/ui/MainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/MainActivity;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/ui/MainActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$c;->a:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "iBinder"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$c;->a:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 12
    .line 13
    invoke-static {p2}, Lj/a$a;->p(Landroid/os/IBinder;)Lj/a;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->E(Lcom/zykj/huiwei/launcher/ui/MainActivity;Lj/a;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$c;->a:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 21
    .line 22
    invoke-static {p1}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->C(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lj/a;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-interface {p1}, Lj/a;->j()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    iget-object p2, p0, Lcom/zykj/huiwei/launcher/ui/MainActivity$c;->a:Lcom/zykj/huiwei/launcher/ui/MainActivity;

    .line 35
    .line 36
    invoke-static {p2}, Lcom/zykj/huiwei/launcher/ui/MainActivity;->D(Lcom/zykj/huiwei/launcher/ui/MainActivity;)Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2, p1}, Lcom/zykj/huiwei/launcher/viewmodels/MainViewModel;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "componentName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
