.class public final synthetic Lcom/zykj/sketch/core/record/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/sketch/EzyDrawBoard$BoardHead;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

.field public final synthetic d:Lcom/zykj/sketch/core/record/RecordControl;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;Lcom/zykj/sketch/core/record/RecordControl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/sketch/core/record/a;->a:Lcom/zykj/sketch/EzyDrawBoard$BoardHead;

    iput-object p2, p0, Lcom/zykj/sketch/core/record/a;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/sketch/core/record/a;->c:Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    iput-object p4, p0, Lcom/zykj/sketch/core/record/a;->d:Lcom/zykj/sketch/core/record/RecordControl;

    iput-object p5, p0, Lcom/zykj/sketch/core/record/a;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/zykj/sketch/core/record/a;->f:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/zykj/sketch/core/record/a;->a:Lcom/zykj/sketch/EzyDrawBoard$BoardHead;

    iget-object v1, p0, Lcom/zykj/sketch/core/record/a;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/zykj/sketch/core/record/a;->c:Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;

    iget-object v3, p0, Lcom/zykj/sketch/core/record/a;->d:Lcom/zykj/sketch/core/record/RecordControl;

    iget-object v4, p0, Lcom/zykj/sketch/core/record/a;->e:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lcom/zykj/sketch/core/record/a;->f:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v5}, Lcom/zykj/sketch/core/record/RecordControl;->a(Lcom/zykj/sketch/EzyDrawBoard$BoardHead;Ljava/lang/String;Lcom/zykj/sketch/EzyDrawBoard$DrawBoard;Lcom/zykj/sketch/core/record/RecordControl;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
