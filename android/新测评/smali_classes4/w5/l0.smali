.class public final synthetic Lw5/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/a;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/l0;->a:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lw5/l0;->b:Lcom/zykj/evaluation/ui/detail/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/l0;->a:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lw5/l0;->b:Lcom/zykj/evaluation/ui/detail/a;

    invoke-static {v0, v1}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->S(Lkotlin/jvm/functions/Function1;Lcom/zykj/evaluation/ui/detail/a;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
