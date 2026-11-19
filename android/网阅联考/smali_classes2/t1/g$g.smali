.class public final Lt1/g$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:Lt1/g$f;

.field public final b:Lt1/g$d;

.field public c:Landroidx/lifecycle/SavedStateHandle;

.field public d:Ld2/c;


# direct methods
.method public constructor <init>(Lt1/g$f;Lt1/g$d;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lt1/g$g;->a:Lt1/g$f;

    .line 4
    iput-object p2, p0, Lt1/g$g;->b:Lt1/g$d;

    return-void
.end method

.method public synthetic constructor <init>(Lt1/g$f;Lt1/g$d;Lt1/m;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lt1/g$g;-><init>(Lt1/g$f;Lt1/g$d;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Landroidx/lifecycle/SavedStateHandle;)Lg2/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt1/g$g;->d(Landroidx/lifecycle/SavedStateHandle;)Lt1/g$g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic b(Ld2/c;)Lg2/c;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lt1/g$g;->e(Ld2/c;)Lt1/g$g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic build()Le2/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lt1/g$g;->c()Lt1/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public c()Lt1/e;
    .locals 8

    .line 1
    iget-object v0, p0, Lt1/g$g;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 2
    .line 3
    const-class v1, Landroidx/lifecycle/SavedStateHandle;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lk2/b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lt1/g$g;->d:Ld2/c;

    .line 9
    .line 10
    const-class v1, Ld2/c;

    .line 11
    .line 12
    invoke-static {v0, v1}, Lk2/b;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lt1/g$h;

    .line 16
    .line 17
    iget-object v3, p0, Lt1/g$g;->a:Lt1/g$f;

    .line 18
    .line 19
    iget-object v4, p0, Lt1/g$g;->b:Lt1/g$d;

    .line 20
    .line 21
    iget-object v5, p0, Lt1/g$g;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    .line 23
    iget-object v6, p0, Lt1/g$g;->d:Ld2/c;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    move-object v2, v0

    .line 27
    invoke-direct/range {v2 .. v7}, Lt1/g$h;-><init>(Lt1/g$f;Lt1/g$d;Landroidx/lifecycle/SavedStateHandle;Ld2/c;Lt1/n;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public d(Landroidx/lifecycle/SavedStateHandle;)Lt1/g$g;
    .locals 0

    .line 1
    invoke-static {p1}, Lk2/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/lifecycle/SavedStateHandle;

    .line 6
    .line 7
    iput-object p1, p0, Lt1/g$g;->c:Landroidx/lifecycle/SavedStateHandle;

    .line 8
    .line 9
    return-object p0
.end method

.method public e(Ld2/c;)Lt1/g$g;
    .locals 0

    .line 1
    invoke-static {p1}, Lk2/b;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ld2/c;

    .line 6
    .line 7
    iput-object p1, p0, Lt1/g$g;->d:Ld2/c;

    .line 8
    .line 9
    return-object p0
.end method
