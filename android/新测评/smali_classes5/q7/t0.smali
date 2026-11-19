.class public final synthetic Lq7/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/t0;->a:Lcom/zykj/view/board/board/BoardFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lq7/t0;->a:Lcom/zykj/view/board/board/BoardFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->y(Lcom/zykj/view/board/board/BoardFragment;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
