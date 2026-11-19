.class public final Lm8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# instance fields
.field public final a:Lkotlinx/coroutines/channels/f;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm8/m;->a:Lkotlinx/coroutines/channels/f;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/m;->a:Lkotlinx/coroutines/channels/f;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lkotlinx/coroutines/channels/f;->send(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Lh7/p;->a:Lh7/p;

    .line 15
    .line 16
    return-object p1
.end method
