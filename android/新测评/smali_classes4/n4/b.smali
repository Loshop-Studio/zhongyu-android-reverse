.class public final synthetic Ln4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/edit/BasePageControl;

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/blackboard/core/edit/BasePageControl;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/b;->a:Lcom/zykj/blackboard/core/edit/BasePageControl;

    iput-object p2, p0, Ln4/b;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ln4/b;->a:Lcom/zykj/blackboard/core/edit/BasePageControl;

    iget-object v1, p0, Ln4/b;->b:Lkotlin/jvm/functions/Function0;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/edit/BasePageControl;->F(Lcom/zykj/blackboard/core/edit/BasePageControl;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method
