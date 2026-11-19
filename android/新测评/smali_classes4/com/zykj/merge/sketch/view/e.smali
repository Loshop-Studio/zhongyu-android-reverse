.class public final synthetic Lcom/zykj/merge/sketch/view/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function1;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/merge/sketch/view/e;->a:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lcom/zykj/merge/sketch/view/e;->b:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/merge/sketch/view/e;->a:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Lcom/zykj/merge/sketch/view/e;->b:I

    invoke-static {v0, v1}, Lcom/zykj/merge/sketch/view/BlackBoardProxyView$seekTo$1;->a(Lkotlin/jvm/functions/Function1;I)V

    return-void
.end method
