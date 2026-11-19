.class public final synthetic Llb/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/i;->c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iput-boolean p2, p0, Llb/i;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Llb/i;->c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-boolean v1, p0, Llb/i;->d:Z

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->q(Lcom/zykj/view/board/crop/BlackboardCropFragment;ZLjava/lang/String;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
