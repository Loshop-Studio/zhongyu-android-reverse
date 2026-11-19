.class final Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Choreographer$FrameCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/runtime/DefaultChoreographerFrameClock;->withFrameNanos(Lhd/l;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $co:Lsd/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsd/j;"
        }
    .end annotation
.end field

.field final synthetic $onFrame:Lhd/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhd/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lsd/j;Lhd/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/j;",
            "Lhd/l;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;->$co:Lsd/j;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;->$onFrame:Lhd/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final doFrame(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;->$co:Lsd/j;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/runtime/DefaultChoreographerFrameClock;->INSTANCE:Landroidx/compose/runtime/DefaultChoreographerFrameClock;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/runtime/DefaultChoreographerFrameClock$withFrameNanos$2$callback$1;->$onFrame:Lhd/l;

    .line 6
    .line 7
    :try_start_0
    sget-object v2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 8
    .line 9
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v1, p1}, Lhd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception p1

    .line 23
    sget-object p2, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 24
    .line 25
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {v0, p1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
