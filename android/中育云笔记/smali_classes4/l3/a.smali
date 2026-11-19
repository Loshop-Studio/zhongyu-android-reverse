.class public final synthetic Ll3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/friday/lecture/view/LectureDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/view/LectureDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/a;->a:Lcom/friday/lecture/view/LectureDialogFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/a;->a:Lcom/friday/lecture/view/LectureDialogFragment;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/friday/lecture/view/LectureDialogFragment;->t(Lcom/friday/lecture/view/LectureDialogFragment;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
