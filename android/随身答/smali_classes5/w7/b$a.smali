.class public Lw7/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/ViewModelProvider$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw7/b;->d(Landroidx/lifecycle/ViewModelStoreOwner;Landroid/content/Context;)Landroidx/lifecycle/ViewModelProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lw7/b;


# direct methods
.method public constructor <init>(Lw7/b;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw7/b$a;->b:Lw7/b;

    .line 2
    .line 3
    iput-object p2, p0, Lw7/b$a;->a:Landroid/content/Context;

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
    new-instance p1, Lw7/g;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Lw7/g;-><init>(Landroidx/lifecycle/viewmodel/CreationExtras;)V

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lw7/b$a;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-class v0, Lw7/b$b;

    .line 9
    .line 10
    invoke-static {p2, v0}, Lq7/b;->a(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    check-cast p2, Lw7/b$b;

    .line 15
    .line 16
    invoke-interface {p2}, Lw7/b$b;->c()Lu7/b;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-interface {p2, p1}, Lu7/b;->a(Lw7/g;)Lu7/b;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-interface {p2}, Lu7/b;->build()Lr7/b;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    new-instance v0, Lw7/b$c;

    .line 29
    .line 30
    invoke-direct {v0, p2, p1}, Lw7/b$c;-><init>(Lr7/b;Lw7/g;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
