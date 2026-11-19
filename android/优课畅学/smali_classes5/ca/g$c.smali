.class public final Lca/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lca/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lca/g$c$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lca/g$c;->a:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lca/g$c;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lca/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lca/g$c;->c(Lca/d;)Ljava/util/concurrent/CompletableFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lca/d;)Ljava/util/concurrent/CompletableFuture;
    .locals 2

    .line 1
    new-instance v0, Lca/g$b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lca/g$b;-><init>(Lca/d;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lca/g$c$a;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lca/g$c$a;-><init>(Lca/g$c;Ljava/util/concurrent/CompletableFuture;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v1}, Lca/d;->d(Lca/f;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
