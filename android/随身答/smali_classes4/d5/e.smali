.class public final synthetic Ld5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/e;->a:Ljava/lang/String;

    iput-object p2, p0, Ld5/e;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p3, p0, Ld5/e;->c:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Ld5/e;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld5/e;->a:Ljava/lang/String;

    iget-object v1, p0, Ld5/e;->b:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v2, p0, Ld5/e;->c:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, Ld5/e;->d:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1, v2, v3}, Lcom/zykj/blackboard/core/edit/BoardControl;->i(Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
