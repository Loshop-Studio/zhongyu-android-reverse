.class public final synthetic Lo6/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/n0;->a:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo6/n0;->a:Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;->h(Lcom/zykj/student/dialogue/ui/detail/NewAnswerFragment;Ljava/lang/Boolean;)V

    return-void
.end method
