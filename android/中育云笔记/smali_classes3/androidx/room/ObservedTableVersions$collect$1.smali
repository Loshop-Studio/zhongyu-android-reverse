.class final Landroidx/room/ObservedTableVersions$collect$1;
.super Lkotlin/coroutines/jvm/internal/ContinuationImpl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/room/ObservedTableVersions;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lxc/d;
    c = "androidx.room.ObservedTableVersions"
    f = "InvalidationTracker.kt"
    l = {
        0x25a
    }
    m = "collect"
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Landroidx/room/ObservedTableVersions;


# direct methods
.method public constructor <init>(Landroidx/room/ObservedTableVersions;Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/room/ObservedTableVersions;",
            "Lvc/c<",
            "-",
            "Landroidx/room/ObservedTableVersions$collect$1;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/room/ObservedTableVersions$collect$1;->this$0:Landroidx/room/ObservedTableVersions;

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

    iput-object p1, p0, Landroidx/room/ObservedTableVersions$collect$1;->result:Ljava/lang/Object;

    iget p1, p0, Landroidx/room/ObservedTableVersions$collect$1;->label:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Landroidx/room/ObservedTableVersions$collect$1;->label:I

    iget-object p1, p0, Landroidx/room/ObservedTableVersions$collect$1;->this$0:Landroidx/room/ObservedTableVersions;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p0}, Landroidx/room/ObservedTableVersions;->collect(Lvd/d;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
