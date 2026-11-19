.class public final Lcom/friday/main/view/HomeActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/blankj/utilcode/util/NetworkUtils$OnNetworkStatusChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/HomeActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/main/view/HomeActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/HomeActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/HomeActivity$b;->a:Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onConnected(Lcom/blankj/utilcode/util/NetworkUtils$NetworkType;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/friday/main/view/HomeActivity$b;->a:Lcom/friday/main/view/HomeActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/friday/main/view/HomeActivity;->h0(Lcom/friday/main/view/HomeActivity;)Lcom/friday/main/viewmodel/HomeViewModel;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/friday/main/view/HomeActivity$b;->a:Lcom/friday/main/view/HomeActivity;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getPackageName(...)"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Lcom/friday/main/viewmodel/HomeViewModel;->m(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onDisconnected()V
    .locals 0

    return-void
.end method
