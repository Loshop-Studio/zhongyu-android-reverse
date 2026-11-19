.class public final Lw1/g$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final a:Lw1/g$h;

.field public final b:Lw1/g$d;

.field public c:Landroidx/lifecycle/SavedStateHandle;

.field public d:Lxb/c;


# direct methods
.method public constructor <init>(Lw1/g$h;Lw1/g$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lw1/g$i;->a:Lw1/g$h;

    .line 4
    iput-object p2, p0, Lw1/g$i;->b:Lw1/g$d;

    return-void
.end method

.method public synthetic constructor <init>(Lw1/g$h;Lw1/g$d;Lw1/h;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lw1/g$i;-><init>(Lw1/g$h;Lw1/g$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/lifecycle/SavedStateHandle;)Lbc/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$i;->d(Landroidx/lifecycle/SavedStateHandle;)Lw1/g$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(Lxb/c;)Lbc/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw1/g$i;->e(Lxb/c;)Lw1/g$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic build()Lyb/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw1/g$i;->c()Lw1/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lw1/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lw1/g$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lgc/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lw1/g$i;->d:Lxb/c;

    .line 9
    .line 10
    const-class v1, Lxb/c;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lgc/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lw1/g$j;

    .line 16
    .line 17
    iget-object v1, p0, Lw1/g$i;->a:Lw1/g$h;

    .line 18
    .line 19
    iget-object v2, p0, Lw1/g$i;->b:Lw1/g$d;

    .line 20
    .line 21
    iget-object v3, p0, Lw1/g$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    .line 23
    iget-object v4, p0, Lw1/g$i;->d:Lxb/c;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lw1/g$j;-><init>(Lw1/g$h;Lw1/g$d;Landroidx/lifecycle/SavedStateHandle;Lxb/c;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public d(Landroidx/lifecycle/SavedStateHandle;)Lw1/g$i;
    .locals 0

    .line 1
    invoke-static {p1}, Lgc/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    .line 6
    .line 7
    iput-object p1, p0, Lw1/g$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Lxb/c;)Lw1/g$i;
    .locals 0

    .line 1
    invoke-static {p1}, Lgc/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lxb/c;

    .line 6
    .line 7
    iput-object p1, p0, Lw1/g$i;->d:Lxb/c;

    .line 8
    .line 9
    return-object p0
.end method
