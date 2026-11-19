.class public final Ldf/g$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/g$c$a;
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
    iput-object p1, p0, Ldf/g$c;->a:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ldf/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldf/g$c;->c(Ldf/d;)Ljava/util/concurrent/CompletableFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public b()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Ldf/g$c;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Ldf/d;)Ljava/util/concurrent/CompletableFuture;
    .locals 2

    .line 1
    new-instance v0, Ldf/g$b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ldf/g$b;-><init>(Ldf/d;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ldf/g$c$a;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Ldf/g$c$a;-><init>(Ldf/g$c;Ljava/util/concurrent/CompletableFuture;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v1}, Ldf/d;->c(Ldf/f;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
