.class public final synthetic Ll3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/view/LectureDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/view/LectureDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/e;->c:Lcom/friday/lecture/view/LectureDialogFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/e;->c:Lcom/friday/lecture/view/LectureDialogFragment;

    invoke-static {v0, p1}, Lcom/friday/lecture/view/LectureDialogFragment;->s(Lcom/friday/lecture/view/LectureDialogFragment;Ljava/lang/Object;)V

    return-void
.end method
