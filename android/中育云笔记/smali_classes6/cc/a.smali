.class public abstract Lcc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcc/a$a;,
        Lcc/a$c;,
        Lcc/a$b;
    }
.end annotation


# direct methods
.method public static a(Landroidx/activity/ComponentActivity;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 1
    const-class v0, Lcc/a$a;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lwb/a;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcc/a$a;

    .line 8
    .line 9
    invoke-interface {v0}, Lcc/a$a;->a()Lcc/a$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0, p1}, Lcc/a$c;->a(Landroidx/activity/ComponentActivity;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static b(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 1
    const-class v0, Lcc/a$b;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lwb/a;->a(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcc/a$b;

    .line 8
    .line 9
    invoke-interface {v0}, Lcc/a$b;->a()Lcc/a$c;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0, p1}, Lcc/a$c;->b(Landroidx/fragment/app/Fragment;Landroidx/lifecycle/ViewModelProvider$Factory;)Landroidx/lifecycle/ViewModelProvider$Factory;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
