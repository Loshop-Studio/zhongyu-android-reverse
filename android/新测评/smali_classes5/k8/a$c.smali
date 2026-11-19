.class public final Lk8/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lj8/d;


# direct methods
.method public constructor <init>(Ljava/util/Map;Lj8/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk8/a$c;->a:Ljava/util/Map;

    .line 5
    .line 6
    iput-object p2, p0, Lk8/a$c;->b:Lj8/d;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Landroidx/activity/ComponentActivity;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lk8/a$c;->c(Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, Lk8/a$c;->c(Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final c(Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    new-instance v0, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;

    .line 2
    .line 3
    iget-object v1, p0, Lk8/a$c;->a:Ljava/util/Map;

    .line 4
    .line 5
    invoke-static {p1}, Ln8/c;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 10
    .line 11
    iget-object v2, p0, Lk8/a$c;->b:Lj8/d;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1, v2}, Ldagger/hilt/android/internal/lifecycle/HiltViewModelFactory;-><init>(Ljava/util/Map;Landroidx/lifecycle/ViewModelProvider$Factory;Lj8/d;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
