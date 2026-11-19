.class public Ldc/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldc/b;->d(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;)Landroidx/lifecycle/ViewModelProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ldc/b;


# direct methods
.method public constructor <init>(Ldc/b;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldc/b$a;->b:Ldc/b;

    .line 2
    .line 3
    iput-object p2, p0, Ldc/b$a;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public create(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;
    .locals 1

    .line 1
    new-instance p1, Ldc/h;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Ldc/h;-><init>(Landroidx/lifecycle/viewmodel/CreationExtras;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Ldc/b$a;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-class v0, Ldc/b$b;

    .line 9
    .line 10
    invoke-static {p2, v0}, Lxb/b;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Ldc/b$b;

    .line 15
    .line 16
    invoke-interface {p2}, Ldc/b$b;->d()Lbc/b;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p1}, Lbc/b;->a(Ldc/h;)Lbc/b;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Lbc/b;->build()Lyb/b;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v0, Ldc/b$c;

    .line 29
    .line 30
    invoke-direct {v0, p2, p1}, Ldc/b$c;-><init>(Lyb/b;Ldc/h;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
