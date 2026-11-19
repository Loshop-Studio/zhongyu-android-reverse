.class public final Lcom/friday/main/viewmodel/HomeViewModel$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/viewmodel/HomeViewModel;-><init>(Lu3/a;Lcom/friday/common/network/StudentSession;Lcom/friday/common/dao/FileDao;Lcom/friday/common/dao/UserDao;Lvd/l;Lvd/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/friday/main/viewmodel/HomeViewModel;


# direct methods
.method public constructor <init>(Lcom/friday/main/viewmodel/HomeViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$b;->c:Lcom/friday/main/viewmodel/HomeViewModel;

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
    iget-object p1, p0, Lcom/friday/main/viewmodel/HomeViewModel$b;->c:Lcom/friday/main/viewmodel/HomeViewModel;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/friday/main/viewmodel/HomeViewModel;->r()Lvd/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Lv7/a$a;->l(Landroid/os/IBinder;)Lv7/a;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-interface {p1, p2}, Lvd/l;->setValue(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 0

    return-void
.end method
