.class public final Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$a;->a:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

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
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel$a;->a:Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/zykj/huiwei/launcher/viewmodels/AppUpdateViewModel;->e()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Lo1/a$a;->p(Landroid/os/IBinder;)Lo1/a;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
