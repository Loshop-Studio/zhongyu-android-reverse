.class public final Lk5/h$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final a:Lk5/h$h;

.field public final b:Lk5/h$d;

.field public c:Landroidx/lifecycle/SavedStateHandle;

.field public d:Lf8/c;


# direct methods
.method public constructor <init>(Lk5/h$h;Lk5/h$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lk5/h$i;->a:Lk5/h$h;

    .line 4
    iput-object p2, p0, Lk5/h$i;->b:Lk5/h$d;

    return-void
.end method

.method public synthetic constructor <init>(Lk5/h$h;Lk5/h$d;Lk5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lk5/h$i;-><init>(Lk5/h$h;Lk5/h$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lf8/c;)Lj8/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk5/h$i;->e(Lf8/c;)Lk5/h$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(Landroidx/lifecycle/SavedStateHandle;)Lj8/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk5/h$i;->d(Landroidx/lifecycle/SavedStateHandle;)Lk5/h$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic build()Lg8/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk5/h$i;->c()Lk5/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lk5/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/h$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lo8/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lk5/h$i;->d:Lf8/c;

    .line 9
    .line 10
    const-class v1, Lf8/c;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lo8/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lk5/h$j;

    .line 16
    .line 17
    iget-object v1, p0, Lk5/h$i;->a:Lk5/h$h;

    .line 18
    .line 19
    iget-object v2, p0, Lk5/h$i;->b:Lk5/h$d;

    .line 20
    .line 21
    iget-object v3, p0, Lk5/h$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    .line 23
    iget-object v4, p0, Lk5/h$i;->d:Lf8/c;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lk5/h$j;-><init>(Lk5/h$h;Lk5/h$d;Landroidx/lifecycle/SavedStateHandle;Lf8/c;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public d(Landroidx/lifecycle/SavedStateHandle;)Lk5/h$i;
    .locals 0

    .line 1
    invoke-static {p1}, Lo8/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    .line 6
    .line 7
    iput-object p1, p0, Lk5/h$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Lf8/c;)Lk5/h$i;
    .locals 0

    .line 1
    invoke-static {p1}, Lo8/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lf8/c;

    .line 6
    .line 7
    iput-object p1, p0, Lk5/h$i;->d:Lf8/c;

    .line 8
    .line 9
    return-object p0
.end method
