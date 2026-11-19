.class final Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll8/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ll8/d;"
    }
.end annotation


# instance fields
.field final synthetic $$this$launch:Li8/b0;

.field final synthetic this$0:Landroidx/paging/PageFetcherSnapshot;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/paging/PageFetcherSnapshot<",
            "TKey;TValue;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/paging/PageFetcherSnapshot;Li8/b0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/paging/PageFetcherSnapshot<",
            "TKey;TValue;>;",
            "Li8/b0;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->$$this$launch:Li8/b0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final emit(Lh7/p;Lm7/c;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lh7/p;",
            "Lm7/c<",
            "-",
            "Lh7/p;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;

    iget v0, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;

    invoke-direct {p1, p0, p2}, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;-><init>(Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;Lm7/c;)V

    :goto_0
    iget-object p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Ln7/a;->f()Ljava/lang/Object;

    move-result-object v0

    .line 1
    iget v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v0, Lr8/a;

    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v2, Li8/b0;

    iget-object p1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast p1, Landroidx/paging/PageFetcherSnapshot;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_1b

    :pswitch_1
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/LoadType;

    iget-object v2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v2, Li8/b0;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PageFetcherSnapshot;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v11, v4

    move-object v4, v1

    move-object v1, v11

    goto/16 :goto_19

    :pswitch_2
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/PageFetcherSnapshot;

    iget-object v2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    check-cast v2, Landroidx/paging/LoadType;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v4, Lr8/a;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/LoadType;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v7, Li8/b0;

    iget-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/PageFetcherSnapshot;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_17

    :pswitch_3
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/LoadType;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v5, Li8/b0;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    :try_start_0
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_14

    :catchall_0
    move-exception p1

    goto/16 :goto_15

    :pswitch_4
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v5, Landroidx/paging/LoadType;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v6, Li8/b0;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/PageFetcherSnapshot;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object p2, v7

    goto/16 :goto_13

    :pswitch_5
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v5, Li8/b0;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_6
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/LoadType;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v4, Li8/b0;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v5, Landroidx/paging/PageFetcherSnapshot;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    goto/16 :goto_10

    :pswitch_7
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$7:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/PageFetcherSnapshot;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/LoadType;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lr8/a;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/LoadType;

    iget-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v8, Li8/b0;

    iget-object v9, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v9, Landroidx/paging/PageFetcherSnapshot;

    iget-object v10, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v10, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_8
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/LoadType;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v5, Li8/b0;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/LoadStates;

    :try_start_1
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_b

    :catchall_1
    move-exception p1

    goto/16 :goto_c

    :pswitch_9
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v5, Landroidx/paging/LoadType;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v6, Li8/b0;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/PageFetcherSnapshot;

    iget-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object p2, v7

    move-object v7, v8

    goto/16 :goto_a

    :pswitch_a
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v5, Li8/b0;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_b
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/LoadType;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v4, Li8/b0;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v5, Landroidx/paging/PageFetcherSnapshot;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    goto/16 :goto_7

    :pswitch_c
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$7:Ljava/lang/Object;

    check-cast v1, Landroidx/paging/PageFetcherSnapshot;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/LoadType;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lr8/a;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/LoadType;

    iget-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v8, Li8/b0;

    iget-object v9, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v9, Landroidx/paging/PageFetcherSnapshot;

    iget-object v10, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v10, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_d
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/LoadType;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v5, Li8/b0;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshot;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/LoadStates;

    :try_start_2
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    goto :goto_2

    :pswitch_e
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v5, Landroidx/paging/LoadType;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v6, Li8/b0;

    iget-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v7, Landroidx/paging/PageFetcherSnapshot;

    iget-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v8, Landroidx/paging/LoadStates;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 2
    :try_start_3
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 3
    iput-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    const/4 v4, 0x3

    iput v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-static {v7, p2, v5, p1}, Landroidx/paging/PageFetcherSnapshot;->access$setLoading(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_1

    goto/16 :goto_1a

    :cond_1
    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    :goto_1
    sget-object p2, Lh7/p;->a:Lh7/p;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 4
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    move-object v8, v5

    move-object v1, v6

    move-object v10, v7

    goto/16 :goto_4

    :goto_2
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 5
    :pswitch_f
    iget-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lr8/a;

    iget-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    check-cast v4, Landroidx/paging/PageFetcherSnapshot;

    iget-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    check-cast v5, Landroidx/paging/PageFetcherSnapshotState$Holder;

    iget-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast v6, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;

    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_10
    invoke-static {p2}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 6
    iget-object p2, p0, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    invoke-static {p2}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v5

    iget-object v4, p0, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    .line 7
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v1

    .line 8
    iput-object p0, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput v2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v1, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_2

    goto/16 :goto_1a

    :cond_2
    move-object v6, p0

    .line 9
    :goto_3
    :try_start_4
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 10
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    move-result-object v5

    invoke-virtual {v5}, Landroidx/paging/MutableLoadStateCollection;->snapshot()Landroidx/paging/LoadStates;

    move-result-object v5

    .line 11
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshot;->access$getHintHandler$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/HintHandler;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/paging/HintHandler;->getLastAccessHint()Landroidx/paging/ViewportHint$Access;

    move-result-object v4

    .line 12
    invoke-virtual {p2, v4}, Landroidx/paging/PageFetcherSnapshotState;->currentPagingState$paging_common_release(Landroidx/paging/ViewportHint$Access;)Landroidx/paging/PagingState;

    move-result-object p2

    invoke-static {v5, p2}, Lh7/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_9

    .line 13
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    .line 14
    invoke-virtual {p2}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/paging/LoadStates;

    invoke-virtual {p2}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/paging/PagingState;

    .line 15
    iget-object v4, v6, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    invoke-virtual {v4}, Landroidx/paging/PageFetcherSnapshot;->getRemoteMediatorConnection()Landroidx/paging/RemoteMediatorConnection;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-interface {v4, p2}, Landroidx/paging/RemoteMediatorConnection;->retryFailed(Landroidx/paging/PagingState;)V

    sget-object p2, Lh7/p;->a:Lh7/p;

    .line 16
    :cond_3
    iget-object p2, v6, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->this$0:Landroidx/paging/PageFetcherSnapshot;

    iget-object v4, v6, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->$$this$launch:Li8/b0;

    .line 17
    sget-object v5, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getRefresh()Landroidx/paging/LoadState;

    move-result-object v6

    .line 18
    instance-of v6, v6, Landroidx/paging/LoadState$Error;

    if-eqz v6, :cond_9

    move-object v10, v1

    move-object v8, v4

    move-object v4, v5

    move-object v1, p2

    .line 19
    :goto_4
    sget-object p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget p2, p2, v5

    if-ne p2, v2, :cond_4

    move-object v5, v1

    move-object p2, v3

    move-object v6, v4

    goto :goto_6

    .line 20
    :cond_4
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v6

    .line 21
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v5

    .line 22
    iput-object v10, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$7:Ljava/lang/Object;

    const/4 p2, 0x4

    iput p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v5, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    goto/16 :goto_1a

    :cond_5
    move-object v9, v1

    move-object v7, v4

    .line 23
    :goto_5
    :try_start_5
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 24
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getFailedHintsByLoadType$paging_common_release()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/paging/ViewportHint;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 25
    invoke-interface {v5, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    move-object v5, v1

    move-object v6, v4

    move-object v4, v7

    move-object v1, v9

    .line 26
    :goto_6
    iput-object v10, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$7:Ljava/lang/Object;

    const/4 v7, 0x5

    iput v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-static {v5, v6, p2, p1}, Landroidx/paging/PageFetcherSnapshot;->access$retryLoadError(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_6

    goto/16 :goto_1a

    :cond_6
    move-object v6, v1

    move-object v1, v4

    move-object v5, v8

    move-object v7, v10

    .line 27
    :goto_7
    sget-object p2, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    if-ne v1, p2, :cond_8

    .line 28
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v4

    .line 29
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v1

    .line 30
    iput-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    const/4 p2, 0x6

    iput p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v1, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_7

    goto/16 :goto_1a

    .line 31
    :cond_7
    :goto_8
    :try_start_6
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 32
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    move-result-object p2

    sget-object v4, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    invoke-virtual {p2, v4}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    move-result-object p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 33
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    .line 34
    instance-of p2, p2, Landroidx/paging/LoadState$Error;

    if-nez p2, :cond_8

    .line 35
    invoke-static {v6, v5}, Landroidx/paging/PageFetcherSnapshot;->access$startConsumingHints(Landroidx/paging/PageFetcherSnapshot;Li8/b0;)V

    :cond_8
    move-object v4, v5

    move-object p2, v6

    move-object v1, v7

    goto :goto_9

    :catchall_3
    move-exception p1

    .line 36
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    :catchall_4
    move-exception p1

    .line 37
    invoke-interface {v5, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 38
    :cond_9
    :goto_9
    sget-object v5, Landroidx/paging/LoadType;->PREPEND:Landroidx/paging/LoadType;

    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getPrepend()Landroidx/paging/LoadState;

    move-result-object v6

    .line 39
    instance-of v6, v6, Landroidx/paging/LoadState$Error;

    if-eqz v6, :cond_12

    .line 40
    sget-object v6, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    if-eq v5, v6, :cond_c

    .line 41
    invoke-static {p2}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v6

    .line 42
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v7

    .line 43
    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    const/4 v8, 0x7

    iput v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v7, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_a

    goto/16 :goto_1a

    :cond_a
    move-object v11, v7

    move-object v7, v1

    move-object v1, v11

    move-object v11, v6

    move-object v6, v4

    move-object v4, v11

    .line 44
    :goto_a
    :try_start_7
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object v4

    .line 45
    iput-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    const/16 v8, 0x8

    iput v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-static {p2, v4, v5, p1}, Landroidx/paging/PageFetcherSnapshot;->access$setLoading(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lm7/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_b

    goto/16 :goto_1a

    :cond_b
    move-object v4, v5

    move-object v5, v6

    move-object v6, p2

    :goto_b
    sget-object p2, Lh7/p;->a:Lh7/p;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 46
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    move-object v8, v5

    move-object v1, v6

    move-object v10, v7

    goto :goto_d

    :goto_c
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    :cond_c
    move-object v10, v1

    move-object v8, v4

    move-object v4, v5

    move-object v1, p2

    .line 47
    :goto_d
    sget-object p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget p2, p2, v5

    if-ne p2, v2, :cond_d

    move-object v5, v1

    move-object p2, v3

    move-object v6, v4

    goto :goto_f

    .line 48
    :cond_d
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v6

    .line 49
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v5

    .line 50
    iput-object v10, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$7:Ljava/lang/Object;

    const/16 p2, 0x9

    iput p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v5, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_e

    goto/16 :goto_1a

    :cond_e
    move-object v9, v1

    move-object v7, v4

    .line 51
    :goto_e
    :try_start_8
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 52
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getFailedHintsByLoadType$paging_common_release()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/paging/ViewportHint;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 53
    invoke-interface {v5, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    move-object v5, v1

    move-object v6, v4

    move-object v4, v7

    move-object v1, v9

    .line 54
    :goto_f
    iput-object v10, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v8, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$7:Ljava/lang/Object;

    const/16 v7, 0xa

    iput v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-static {v5, v6, p2, p1}, Landroidx/paging/PageFetcherSnapshot;->access$retryLoadError(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_f

    goto/16 :goto_1a

    :cond_f
    move-object v6, v1

    move-object v1, v4

    move-object v5, v8

    move-object v7, v10

    .line 55
    :goto_10
    sget-object p2, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    if-ne v1, p2, :cond_11

    .line 56
    invoke-static {v6}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v4

    .line 57
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v1

    .line 58
    iput-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    const/16 p2, 0xb

    iput p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v1, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_10

    goto/16 :goto_1a

    .line 59
    :cond_10
    :goto_11
    :try_start_9
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 60
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    move-result-object p2

    sget-object v4, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    invoke-virtual {p2, v4}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    move-result-object p2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 61
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    .line 62
    instance-of p2, p2, Landroidx/paging/LoadState$Error;

    if-nez p2, :cond_11

    .line 63
    invoke-static {v6, v5}, Landroidx/paging/PageFetcherSnapshot;->access$startConsumingHints(Landroidx/paging/PageFetcherSnapshot;Li8/b0;)V

    :cond_11
    move-object v4, v5

    move-object p2, v6

    move-object v1, v7

    goto :goto_12

    :catchall_5
    move-exception p1

    .line 64
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    :catchall_6
    move-exception p1

    .line 65
    invoke-interface {v5, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 66
    :cond_12
    :goto_12
    sget-object v5, Landroidx/paging/LoadType;->APPEND:Landroidx/paging/LoadType;

    invoke-virtual {v1}, Landroidx/paging/LoadStates;->getAppend()Landroidx/paging/LoadState;

    move-result-object v1

    .line 67
    instance-of v1, v1, Landroidx/paging/LoadState$Error;

    if-eqz v1, :cond_1a

    .line 68
    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    if-eq v5, v1, :cond_15

    .line 69
    invoke-static {p2}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v1

    .line 70
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v6

    .line 71
    iput-object p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    const/16 v7, 0xc

    iput v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v6, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_13

    goto/16 :goto_1a

    :cond_13
    move-object v11, v4

    move-object v4, v1

    move-object v1, v6

    move-object v6, v11

    .line 72
    :goto_13
    :try_start_a
    invoke-static {v4}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object v4

    .line 73
    iput-object p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    const/16 v7, 0xd

    iput v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-static {p2, v4, v5, p1}, Landroidx/paging/PageFetcherSnapshot;->access$setLoading(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/PageFetcherSnapshotState;Landroidx/paging/LoadType;Lm7/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_14

    goto/16 :goto_1a

    :cond_14
    move-object v4, v5

    move-object v5, v6

    move-object v6, p2

    :goto_14
    sget-object p2, Lh7/p;->a:Lh7/p;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 74
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v1, v6

    goto :goto_16

    :goto_15
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    :cond_15
    move-object v1, p2

    move-object v7, v4

    move-object v4, v5

    .line 75
    :goto_16
    sget-object p2, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget p2, p2, v5

    if-ne p2, v2, :cond_16

    move-object v2, v1

    move-object p2, v3

    move-object v5, v4

    goto :goto_18

    .line 76
    :cond_16
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object v5

    .line 77
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object p2

    .line 78
    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    const/16 v2, 0xe

    iput v2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {p2, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_17

    goto :goto_1a

    :cond_17
    move-object v8, v1

    move-object v2, v4

    move-object v6, v2

    move-object v4, p2

    .line 79
    :goto_17
    :try_start_b
    invoke-static {v5}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 80
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getFailedHintsByLoadType$paging_common_release()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/paging/ViewportHint;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 81
    invoke-interface {v4, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    move-object v5, v2

    move-object v4, v6

    move-object v2, v1

    move-object v1, v8

    .line 82
    :goto_18
    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v7, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$4:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$5:Ljava/lang/Object;

    iput-object v3, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$6:Ljava/lang/Object;

    const/16 v6, 0xf

    iput v6, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-static {v2, v5, p2, p1}, Landroidx/paging/PageFetcherSnapshot;->access$retryLoadError(Landroidx/paging/PageFetcherSnapshot;Landroidx/paging/LoadType;Landroidx/paging/ViewportHint;Lm7/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_18

    goto :goto_1a

    :cond_18
    move-object v2, v7

    .line 83
    :goto_19
    sget-object p2, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    if-ne v4, p2, :cond_1a

    .line 84
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshot;->access$getStateHolder$p(Landroidx/paging/PageFetcherSnapshot;)Landroidx/paging/PageFetcherSnapshotState$Holder;

    move-result-object p2

    .line 85
    invoke-static {p2}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getLock$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Lr8/a;

    move-result-object v4

    .line 86
    iput-object v1, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$0:Ljava/lang/Object;

    iput-object v2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$1:Ljava/lang/Object;

    iput-object p2, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$2:Ljava/lang/Object;

    iput-object v4, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->L$3:Ljava/lang/Object;

    const/16 v5, 0x10

    iput v5, p1, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1$emit$1;->label:I

    invoke-interface {v4, v3, p1}, Lr8/a;->lock(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_19

    :goto_1a
    return-object v0

    :cond_19
    move-object p1, v1

    move-object v0, v4

    move-object v1, p2

    .line 87
    :goto_1b
    :try_start_c
    invoke-static {v1}, Landroidx/paging/PageFetcherSnapshotState$Holder;->access$getState$p(Landroidx/paging/PageFetcherSnapshotState$Holder;)Landroidx/paging/PageFetcherSnapshotState;

    move-result-object p2

    .line 88
    invoke-virtual {p2}, Landroidx/paging/PageFetcherSnapshotState;->getSourceLoadStates$paging_common_release()Landroidx/paging/MutableLoadStateCollection;

    move-result-object p2

    sget-object v1, Landroidx/paging/LoadType;->REFRESH:Landroidx/paging/LoadType;

    invoke-virtual {p2, v1}, Landroidx/paging/MutableLoadStateCollection;->get(Landroidx/paging/LoadType;)Landroidx/paging/LoadState;

    move-result-object p2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    .line 89
    invoke-interface {v0, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    .line 90
    instance-of p2, p2, Landroidx/paging/LoadState$Error;

    if-nez p2, :cond_1a

    .line 91
    invoke-static {p1, v2}, Landroidx/paging/PageFetcherSnapshot;->access$startConsumingHints(Landroidx/paging/PageFetcherSnapshot;Li8/b0;)V

    goto :goto_1c

    :catchall_7
    move-exception p1

    .line 92
    invoke-interface {v0, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    :catchall_8
    move-exception p1

    .line 93
    invoke-interface {v4, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    .line 94
    :cond_1a
    :goto_1c
    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1

    :catchall_9
    move-exception p1

    .line 95
    invoke-interface {v1, v3}, Lr8/a;->unlock(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;
    .locals 0

    .line 96
    check-cast p1, Lh7/p;

    invoke-virtual {p0, p1, p2}, Landroidx/paging/PageFetcherSnapshot$pageEventFlow$1$4$1;->emit(Lh7/p;Lm7/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
