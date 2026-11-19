.class public final Lca/r$c;
.super Lca/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final d:Lca/e;


# direct methods
.method public constructor <init>(Lca/b0;Li9/e$a;Lca/h;Lca/e;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lca/r;-><init>(Lca/b0;Li9/e$a;Lca/h;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lca/r$c;->d:Lca/e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public c(Lca/d;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/r$c;->d:Lca/e;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lca/e;->b(Lca/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lca/d;

    .line 8
    .line 9
    array-length v0, p2

    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    aget-object p2, p2, v0

    .line 13
    .line 14
    check-cast p2, Lm7/c;

    .line 15
    .line 16
    :try_start_0
    invoke-static {p1, p2}, Lretrofit2/KotlinExtensions;->c(Lca/d;Lm7/c;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    return-object p1

    .line 21
    :catch_0
    move-exception p1

    .line 22
    invoke-static {p1, p2}, Lretrofit2/KotlinExtensions;->e(Ljava/lang/Throwable;Lm7/c;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
.end method
