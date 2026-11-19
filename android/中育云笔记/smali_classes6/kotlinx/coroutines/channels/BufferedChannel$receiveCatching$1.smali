.class final Lkotlinx/coroutines/channels/BufferedChannel$receiveCatching$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/channels/BufferedChannel;->W0(Lkotlinx/coroutines/channels/BufferedChannel;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/ContinuationImpl;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "kotlinx.coroutines.channels.BufferedChannel"
    f = "BufferedChannel.kt"
    l = {
        0x2f7
    }
    m = "receiveCatching-JP2dKIU$suspendImpl"
.end annotation


# instance fields
.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lkotlinx/coroutines/channels/BufferedChannel;

.field public e:I


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/BufferedChannel;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lkotlinx/coroutines/channels/BufferedChannel$receiveCatching$1;->d:Lkotlinx/coroutines/channels/BufferedChannel;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;-><init>(Lvc/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lkotlinx/coroutines/channels/BufferedChannel$receiveCatching$1;->c:Ljava/lang/Object;

    iget p1, p0, Lkotlinx/coroutines/channels/BufferedChannel$receiveCatching$1;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lkotlinx/coroutines/channels/BufferedChannel$receiveCatching$1;->e:I

    iget-object p1, p0, Lkotlinx/coroutines/channels/BufferedChannel$receiveCatching$1;->d:Lkotlinx/coroutines/channels/BufferedChannel;

    invoke-static {p1, p0}, Lkotlinx/coroutines/channels/BufferedChannel;->W0(Lkotlinx/coroutines/channels/BufferedChannel;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lkotlinx/coroutines/channels/c;->b(Ljava/lang/Object;)Lkotlinx/coroutines/channels/c;

    move-result-object p1

    return-object p1
.end method
