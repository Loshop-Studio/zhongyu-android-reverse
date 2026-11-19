.class public final synthetic Lw4/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw4/q;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lw4/q;->b:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lw4/q;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw4/q;->b:Ljava/lang/Exception;

    invoke-static {v0, v1}, Lcom/zykj/blackboard/core/play/PlayControl;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)V

    return-void
.end method
