.class final Landroidx/paging/SeparatorState$onEvent$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/SeparatorState;->onEvent(Landroidx/paging/PageEvent;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.paging.SeparatorState"
    f = "Separators.kt"
    l = {
        0xd9,
        0xdb,
        0xdc
    }
    m = "onEvent"
    v = 0x1
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/paging/SeparatorState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/SeparatorState<",
            "TR;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/SeparatorState;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/SeparatorState<",
            "TR;TT;>;",
            "Lvc/c<",
            "-",
            "Landroidx/paging/SeparatorState$onEvent$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/SeparatorState$onEvent$1;->this$0:Landroidx/paging/SeparatorState;

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

    iput-object p1, p0, Landroidx/paging/SeparatorState$onEvent$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/paging/SeparatorState$onEvent$1;->label:I

    iget-object p1, p0, Landroidx/paging/SeparatorState$onEvent$1;->this$0:Landroidx/paging/SeparatorState;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/paging/SeparatorState;->onEvent(Landroidx/paging/PageEvent;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
