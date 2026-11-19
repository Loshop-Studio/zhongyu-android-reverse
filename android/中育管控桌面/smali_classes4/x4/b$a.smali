.class public Lx4/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx4/b;->d(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;)Landroidx/lifecycle/ViewModelProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lx4/b;


# direct methods
.method public constructor <init>(Lx4/b;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx4/b$a;->b:Lx4/b;

    .line 2
    .line 3
    iput-object p2, p0, Lx4/b$a;->a:Landroid/content/Context;

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
    new-instance p1, Lx4/h;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lx4/h;-><init>(Landroidx/lifecycle/viewmodel/CreationExtras;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lx4/b$a;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-class v0, Lx4/b$b;

    .line 9
    .line 10
    invoke-static {p2, v0}, Lr4/b;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lx4/b$b;

    .line 15
    .line 16
    invoke-interface {p2}, Lx4/b$b;->e()Lv4/b;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p1}, Lv4/b;->a(Lx4/h;)Lv4/b;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Lv4/b;->build()Ls4/b;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v0, Lx4/b$c;

    .line 29
    .line 30
    invoke-direct {v0, p2, p1}, Lx4/b$c;-><init>(Ls4/b;Lx4/h;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
