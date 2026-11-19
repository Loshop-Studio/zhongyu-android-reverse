.class public final La6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:Ljava/lang/reflect/Type;

.field public final b:Lc9/f;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Type;Lc9/f;)V
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
    iput-object p1, p0, La6/b;->a:Ljava/lang/reflect/Type;

    .line 15
    .line 16
    iput-object p2, p0, La6/b;->b:Lc9/f;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, La6/b;->a:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic b(Lc9/b;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La6/b;->c(Lc9/b;)Lc9/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public c(Lc9/b;)Lc9/b;
    .locals 2

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, La6/d;

    .line 7
    .line 8
    iget-object v1, p0, La6/b;->b:Lc9/f;

    .line 9
    .line 10
    invoke-direct {v0, p1, v1}, La6/d;-><init>(Lc9/b;Lc9/f;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method
