.class public final Lr9/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr9/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr9/g$a$a;
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
    iput-object p1, p0, Lr9/g$a;->a:Ljava/lang/reflect/Type;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Lr9/g$a;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lr9/d;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lr9/g$a;->c(Lr9/d;)Ljava/util/concurrent/CompletableFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lr9/d;)Ljava/util/concurrent/CompletableFuture;
    .locals 2

    .line 1
    new-instance v0, Lr9/g$b;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lr9/g$b;-><init>(Lr9/d;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lr9/g$a$a;

    .line 7
    .line 8
    invoke-direct {v1, p0, v0}, Lr9/g$a$a;-><init>(Lr9/g$a;Ljava/util/concurrent/CompletableFuture;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v1}, Lr9/d;->j(Lr9/f;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
