.class public final synthetic Ld5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/zykj/blackboard/core/edit/BoardControl;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Z

.field public final synthetic f:Lkotlin/jvm/functions/Function1;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld5/d;->a:Ljava/util/ArrayList;

    iput-object p2, p0, Ld5/d;->b:Ljava/lang/String;

    iput-object p3, p0, Ld5/d;->c:Lcom/zykj/blackboard/core/edit/BoardControl;

    iput-object p4, p0, Ld5/d;->d:Lkotlin/jvm/functions/Function1;

    iput-boolean p5, p0, Ld5/d;->e:Z

    iput-object p6, p0, Ld5/d;->f:Lkotlin/jvm/functions/Function1;

    iput-boolean p7, p0, Ld5/d;->g:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Ld5/d;->a:Ljava/util/ArrayList;

    iget-object v1, p0, Ld5/d;->b:Ljava/lang/String;

    iget-object v2, p0, Ld5/d;->c:Lcom/zykj/blackboard/core/edit/BoardControl;

    iget-object v3, p0, Ld5/d;->d:Lkotlin/jvm/functions/Function1;

    iget-boolean v4, p0, Ld5/d;->e:Z

    iget-object v5, p0, Ld5/d;->f:Lkotlin/jvm/functions/Function1;

    iget-boolean v6, p0, Ld5/d;->g:Z

    invoke-static/range {v0 .. v6}, Lcom/zykj/blackboard/core/edit/BoardControl;->h(Ljava/util/ArrayList;Ljava/lang/String;Lcom/zykj/blackboard/core/edit/BoardControl;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Z)V

    return-void
.end method
