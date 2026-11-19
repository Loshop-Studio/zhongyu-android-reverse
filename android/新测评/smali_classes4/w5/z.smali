.class public final synthetic Lw5/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function4;

.field public final synthetic b:Lcom/zykj/evaluation/ui/detail/b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function4;Lcom/zykj/evaluation/ui/detail/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw5/z;->a:Lkotlin/jvm/functions/Function4;

    iput-object p2, p0, Lw5/z;->b:Lcom/zykj/evaluation/ui/detail/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lw5/z;->a:Lkotlin/jvm/functions/Function4;

    iget-object v1, p0, Lw5/z;->b:Lcom/zykj/evaluation/ui/detail/b;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    invoke-static {v0, v1, p1, p2, p3}, Lcom/zykj/evaluation/ui/detail/TaskDetailPageKt;->Q(Lkotlin/jvm/functions/Function4;Lcom/zykj/evaluation/ui/detail/b;Ljava/lang/String;Ljava/lang/String;Z)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
