.class public final synthetic Lcom/zykj/blackboard/core/action/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lw4/b;

.field public final synthetic b:Lcom/zykj/blackboard/core/action/BaseWriteAction;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lcom/zykj/board/EzyPaint$Paint;

.field public final synthetic e:Lg5/c;

.field public final synthetic f:Ljava/lang/String;

.field public final synthetic g:Lg5/a;


# direct methods
.method public synthetic constructor <init>(Lw4/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Lg5/c;Ljava/lang/String;Lg5/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/blackboard/core/action/a;->a:Lw4/b;

    iput-object p2, p0, Lcom/zykj/blackboard/core/action/a;->b:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iput-object p3, p0, Lcom/zykj/blackboard/core/action/a;->c:Ljava/util/List;

    iput-object p4, p0, Lcom/zykj/blackboard/core/action/a;->d:Lcom/zykj/board/EzyPaint$Paint;

    iput-object p5, p0, Lcom/zykj/blackboard/core/action/a;->e:Lg5/c;

    iput-object p6, p0, Lcom/zykj/blackboard/core/action/a;->f:Ljava/lang/String;

    iput-object p7, p0, Lcom/zykj/blackboard/core/action/a;->g:Lg5/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/action/a;->a:Lw4/b;

    iget-object v1, p0, Lcom/zykj/blackboard/core/action/a;->b:Lcom/zykj/blackboard/core/action/BaseWriteAction;

    iget-object v2, p0, Lcom/zykj/blackboard/core/action/a;->c:Ljava/util/List;

    iget-object v3, p0, Lcom/zykj/blackboard/core/action/a;->d:Lcom/zykj/board/EzyPaint$Paint;

    iget-object v4, p0, Lcom/zykj/blackboard/core/action/a;->e:Lg5/c;

    iget-object v5, p0, Lcom/zykj/blackboard/core/action/a;->f:Ljava/lang/String;

    iget-object v6, p0, Lcom/zykj/blackboard/core/action/a;->g:Lg5/a;

    invoke-static/range {v0 .. v6}, Lcom/zykj/blackboard/core/action/BaseWriteAction$singleTouchUp$1;->a(Lw4/b;Lcom/zykj/blackboard/core/action/BaseWriteAction;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Lg5/c;Ljava/lang/String;Lg5/a;)V

    return-void
.end method
