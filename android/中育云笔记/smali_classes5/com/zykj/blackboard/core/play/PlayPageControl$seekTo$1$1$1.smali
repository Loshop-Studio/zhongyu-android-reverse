.class final Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1;->invoke()V
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
.field public final synthetic c:Lcom/zykj/blackboard/core/play/PlayPageControl;

.field public final synthetic d:J


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/play/PlayPageControl;J)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    iput-wide p2, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->d:J

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->invoke()V

    sget-object v0, Lqc/q;->a:Lqc/q;

    return-object v0
.end method

.method public final invoke()V
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    invoke-virtual {v0}, Lha/f;->o()Lha/h;

    move-result-object v0

    iget-wide v1, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->d:J

    invoke-virtual {v0, v1, v2}, Lha/h;->C(J)V

    .line 3
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    invoke-virtual {v0}, Lha/f;->p()Lv9/b;

    move-result-object v0

    invoke-virtual {v0}, Lv9/b;->I()Z

    move-result v0

    if-nez v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    invoke-virtual {v0}, Lha/f;->p()Lv9/b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lv9/b;->l(Z)V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5feb\u8fdb\u7ed3\u675f\u540e\u6e32\u67d3\u5f00\u59cb "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 7
    iget-object v2, p0, Lcom/zykj/blackboard/core/play/PlayPageControl$seekTo$1$1$1;->c:Lcom/zykj/blackboard/core/play/PlayPageControl;

    invoke-virtual {v2}, Lha/f;->p()Lv9/b;

    move-result-object v2

    invoke-virtual {v2}, Lv9/b;->g()V

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u5feb\u8fdb\u7ed3\u675f\u540e\u6e32\u67d3\u7ed3\u675f "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :cond_0
    const-wide/16 v0, 0x32

    .line 9
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    return-void
.end method
