.class public final Ll8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/l;
.implements Ll8/c;
.implements Lm8/i;


# instance fields
.field public final a:Lkotlinx/coroutines/n;

.field public final synthetic b:Ll8/l;


# direct methods
.method public constructor <init>(Ll8/l;Lkotlinx/coroutines/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ll8/i;->a:Lkotlinx/coroutines/n;

    .line 5
    .line 6
    iput-object p1, p0, Ll8/i;->b:Ll8/l;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public c(Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ll8/c;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ll8/m;->e(Ll8/l;Lkotlin/coroutines/d;ILkotlinx/coroutines/channels/BufferOverflow;)Ll8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public collect(Ll8/d;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/i;->b:Ll8/l;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Ll8/l;->collect(Ll8/d;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/i;->b:Ll8/l;

    .line 2
    .line 3
    invoke-interface {v0}, Ll8/l;->d()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
