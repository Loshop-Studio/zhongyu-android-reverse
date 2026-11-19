.class public final synthetic Lq7/q1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardViewModel;

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/q1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    iput-object p2, p0, Lq7/q1;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq7/q1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lq7/q1;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->k(Lcom/zykj/view/board/board/BoardViewModel;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
