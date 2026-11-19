.class public final synthetic Llb/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/d;->c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iput-boolean p2, p0, Llb/d;->d:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Llb/d;->c:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-boolean v1, p0, Llb/d;->d:Z

    invoke-static {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->w(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lqc/q;

    move-result-object v0

    return-object v0
.end method
