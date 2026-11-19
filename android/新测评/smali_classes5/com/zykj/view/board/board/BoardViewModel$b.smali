.class public final Lcom/zykj/view/board/board/BoardViewModel$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc5/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/BoardViewModel;->q0(Ln4/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$b;->a:Lcom/zykj/view/board/board/BoardViewModel;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lq4/c;)V
    .locals 1

    .line 1
    const-string v0, "graph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of p1, p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/zykj/view/board/board/BoardViewModel$b;->a:Lcom/zykj/view/board/board/BoardViewModel;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/zykj/view/board/board/BoardViewModel;->O()Lq7/a;

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
