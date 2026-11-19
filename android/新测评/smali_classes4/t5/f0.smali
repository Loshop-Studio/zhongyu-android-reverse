.class public final synthetic Lt5/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/f0;->a:Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/f0;->a:Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;->m(Lcom/zykj/evaluation/ui/board/WhiteBoardDialogFragment;F)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
