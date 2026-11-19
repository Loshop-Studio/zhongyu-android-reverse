.class public final Lg6/h$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu7/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "i"
.end annotation


# instance fields
.field public final a:Lg6/h$h;

.field public final b:Lg6/h$d;

.field public c:Landroidx/lifecycle/SavedStateHandle;

.field public d:Lq7/c;


# direct methods
.method public constructor <init>(Lg6/h$h;Lg6/h$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lg6/h$i;->a:Lg6/h$h;

    .line 4
    iput-object p2, p0, Lg6/h$i;->b:Lg6/h$d;

    return-void
.end method

.method public synthetic constructor <init>(Lg6/h$h;Lg6/h$d;Lg6/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lg6/h$i;-><init>(Lg6/h$h;Lg6/h$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/lifecycle/SavedStateHandle;)Lu7/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg6/h$i;->d(Landroidx/lifecycle/SavedStateHandle;)Lg6/h$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(Lq7/c;)Lu7/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lg6/h$i;->e(Lq7/c;)Lg6/h$i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic build()Lr7/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg6/h$i;->c()Lg6/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lg6/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lg6/h$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lz7/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lg6/h$i;->d:Lq7/c;

    .line 9
    .line 10
    const-class v1, Lq7/c;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lz7/e;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lg6/h$j;

    .line 16
    .line 17
    iget-object v1, p0, Lg6/h$i;->a:Lg6/h$h;

    .line 18
    .line 19
    iget-object v2, p0, Lg6/h$i;->b:Lg6/h$d;

    .line 20
    .line 21
    iget-object v3, p0, Lg6/h$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    .line 23
    iget-object v4, p0, Lg6/h$i;->d:Lq7/c;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v3, v4}, Lg6/h$j;-><init>(Lg6/h$h;Lg6/h$d;Landroidx/lifecycle/SavedStateHandle;Lq7/c;)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public d(Landroidx/lifecycle/SavedStateHandle;)Lg6/h$i;
    .locals 0

    .line 1
    invoke-static {p1}, Lz7/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    .line 6
    .line 7
    iput-object p1, p0, Lg6/h$i;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Lq7/c;)Lg6/h$i;
    .locals 0

    .line 1
    invoke-static {p1}, Lz7/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lq7/c;

    .line 6
    .line 7
    iput-object p1, p0, Lg6/h$i;->d:Lq7/c;

    .line 8
    .line 9
    return-object p0
.end method
