.class public final synthetic Lo6/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/y;->a:Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lo6/y;->a:Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;

    check-cast p1, Landroidx/activity/OnBackPressedCallback;

    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;->f(Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;Landroidx/activity/OnBackPressedCallback;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
