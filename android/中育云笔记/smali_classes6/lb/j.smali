.class public final synthetic Llb/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/j;->c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iput-boolean p2, p0, Llb/j;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Llb/j;->c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-boolean v1, p0, Llb/j;->d:Z

    invoke-static {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->o(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V

    return-void
.end method
