.class public final synthetic Lud/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/q;


# instance fields
.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lkotlinx/coroutines/channels/BufferedChannel;

.field public final synthetic e:Lae/k;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lkotlinx/coroutines/channels/BufferedChannel;Lae/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lud/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lud/c;->d:Lkotlinx/coroutines/channels/BufferedChannel;

    iput-object p3, p0, Lud/c;->e:Lae/k;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lud/c;->c:Ljava/lang/Object;

    iget-object v1, p0, Lud/c;->d:Lkotlinx/coroutines/channels/BufferedChannel;

    iget-object v2, p0, Lud/c;->e:Lae/k;

    move-object v3, p1

    check-cast v3, Ljava/lang/Throwable;

    move-object v5, p3

    check-cast v5, Lkotlin/coroutines/d;

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/channels/BufferedChannel;->a(Ljava/lang/Object;Lkotlinx/coroutines/channels/BufferedChannel;Lae/k;Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/d;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
