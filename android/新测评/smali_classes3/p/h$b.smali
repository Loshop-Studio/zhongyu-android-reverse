.class public final Lp/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ly/k;Lcoil3/e;)Lp/k;
    .locals 0

    .line 1
    check-cast p1, Lk/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lp/h$b;->b(Lk/t;Ly/k;Lcoil3/e;)Lp/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Lk/t;Ly/k;Lcoil3/e;)Lp/k;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lk/t;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const-string v0, "data"

    .line 6
    .line 7
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    if-nez p3, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p3, Lp/h;

    .line 16
    .line 17
    invoke-direct {p3, p1, p2}, Lp/h;-><init>(Lk/t;Ly/k;)V

    .line 18
    .line 19
    .line 20
    return-object p3
.end method
