.class public final Ln/o$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln/k$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
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

.method private final c(Lk/t;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Lk/t;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "android.resource"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Lw/n;Lcoil3/e;)Ln/k;
    .locals 0

    .line 1
    check-cast p1, Lk/t;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Ln/o$a;->b(Lk/t;Lw/n;Lcoil3/e;)Ln/k;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b(Lk/t;Lw/n;Lcoil3/e;)Ln/k;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ln/o$a;->c(Lk/t;)Z

    .line 2
    .line 3
    .line 4
    move-result p3

    .line 5
    if-nez p3, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance p3, Ln/o;

    .line 10
    .line 11
    invoke-direct {p3, p1, p2}, Ln/o;-><init>(Lk/t;Lw/n;)V

    .line 12
    .line 13
    .line 14
    return-object p3
.end method
