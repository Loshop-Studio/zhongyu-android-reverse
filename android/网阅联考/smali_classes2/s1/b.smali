.class public final Ls1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj3/c;


# instance fields
.field public final a:Ljava/lang/reflect/Type;

.field public final b:Lj3/i;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Lj3/i;)V
    .locals 1

    .line 1
    const-string v0, "successType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "errorBodyConverter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ls1/b;->a:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    iput-object p2, p0, Ls1/b;->b:Lj3/i;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lj3/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ls1/b;->c(Lj3/b;)Lj3/b;

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
    iget-object v0, p0, Ls1/b;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public c(Lj3/b;)Lj3/b;
    .locals 2

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ls1/d;

    .line 7
    .line 8
    iget-object v1, p0, Ls1/b;->b:Lj3/i;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, Ls1/d;-><init>(Lj3/b;Lj3/i;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
