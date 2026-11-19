.class Lcom/zykj/sketch/permission/RxPermissions$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/sketch/permission/RxPermissions$Lazy;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/permission/RxPermissions;->getLazySingleton(Landroidx/fragment/app/FragmentManager;)Lcom/zykj/sketch/permission/RxPermissions$Lazy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/zykj/sketch/permission/RxPermissions$Lazy<",
        "Lcom/zykj/sketch/permission/RxPermissionsFragment;",
        ">;"
    }
.end annotation


# instance fields
.field private rxPermissionsFragment:Lcom/zykj/sketch/permission/RxPermissionsFragment;

.field final synthetic this$0:Lcom/zykj/sketch/permission/RxPermissions;

.field final synthetic val$fragmentManager:Landroidx/fragment/app/FragmentManager;


# direct methods
.method public constructor <init>(Lcom/zykj/sketch/permission/RxPermissions;Landroidx/fragment/app/FragmentManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/sketch/permission/RxPermissions$1;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/sketch/permission/RxPermissions$1;->val$fragmentManager:Landroidx/fragment/app/FragmentManager;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public declared-synchronized get()Lcom/zykj/sketch/permission/RxPermissionsFragment;
    .locals 2

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$1;->rxPermissionsFragment:Lcom/zykj/sketch/permission/RxPermissionsFragment;

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$1;->this$0:Lcom/zykj/sketch/permission/RxPermissions;

    iget-object v1, p0, Lcom/zykj/sketch/permission/RxPermissions$1;->val$fragmentManager:Landroidx/fragment/app/FragmentManager;

    invoke-static {v0, v1}, Lcom/zykj/sketch/permission/RxPermissions;->access$000(Lcom/zykj/sketch/permission/RxPermissions;Landroidx/fragment/app/FragmentManager;)Lcom/zykj/sketch/permission/RxPermissionsFragment;

    move-result-object v0

    iput-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$1;->rxPermissionsFragment:Lcom/zykj/sketch/permission/RxPermissionsFragment;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    .line 4
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/zykj/sketch/permission/RxPermissions$1;->rxPermissionsFragment:Lcom/zykj/sketch/permission/RxPermissionsFragment;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/sketch/permission/RxPermissions$1;->get()Lcom/zykj/sketch/permission/RxPermissionsFragment;

    move-result-object v0

    return-object v0
.end method
