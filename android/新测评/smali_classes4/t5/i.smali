.class public final synthetic Lt5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt5/i;->a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt5/i;->a:Lcom/zykj/evaluation/ui/board/SketchDraftFragment;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, p1}, Lcom/zykj/evaluation/ui/board/SketchDraftFragment;->k(Lcom/zykj/evaluation/ui/board/SketchDraftFragment;Landroid/graphics/Bitmap;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
