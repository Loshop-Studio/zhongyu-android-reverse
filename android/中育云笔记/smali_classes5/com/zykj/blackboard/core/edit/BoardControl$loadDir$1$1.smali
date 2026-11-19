.class final Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/BoardControl;->u(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lhd/p;Lhd/l;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lhd/p;

.field public final synthetic d:Z

.field public final synthetic e:J


# direct methods
.method public constructor <init>(Lhd/p;ZJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;->c:Lhd/p;

    .line 2
    .line 3
    iput-boolean p2, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;->d:Z

    .line 4
    .line 5
    iput-wide p3, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;->e:J

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 4

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;->c:Lhd/p;

    iget-boolean v1, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;->d:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-wide v2, p0, Lcom/zykj/blackboard/core/edit/BoardControl$loadDir$1$1;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lhd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
