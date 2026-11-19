.class public Li6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li6/b;->d(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;)Landroidx/lifecycle/ViewModelProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Li6/b;


# direct methods
.method public constructor <init>(Li6/b;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li6/b$a;->b:Li6/b;

    .line 2
    .line 3
    iput-object p2, p0, Li6/b$a;->a:Landroid/content/Context;

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
    new-instance p1, Li6/g;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Li6/g;-><init>(Landroidx/lifecycle/viewmodel/CreationExtras;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Li6/b$a;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-class v0, Li6/b$b;

    .line 9
    .line 10
    invoke-static {p2, v0}, Lc6/b;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Li6/b$b;

    .line 15
    .line 16
    invoke-interface {p2}, Li6/b$b;->c()Lg6/b;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p1}, Lg6/b;->a(Li6/g;)Lg6/b;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Lg6/b;->build()Ld6/b;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v0, Li6/b$c;

    .line 29
    .line 30
    invoke-direct {v0, p2, p1}, Li6/b$c;-><init>(Ld6/b;Li6/g;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
