.class public final synthetic Ly4/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

.field public final synthetic b:Lcom/zykj/study/ui/home/find/MicroCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Lcom/zykj/study/ui/home/find/MicroCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly4/d0;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iput-object p2, p0, Ly4/d0;->b:Lcom/zykj/study/ui/home/find/MicroCropFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Ly4/d0;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-object v1, p0, Ly4/d0;->b:Lcom/zykj/study/ui/home/find/MicroCropFragment;

    invoke-static {v0, v1}, Lcom/zykj/study/ui/home/find/MicroCropFragment;->j(Lcom/zykj/view/board/crop/BlackboardCropFragment;Lcom/zykj/study/ui/home/find/MicroCropFragment;)V

    return-void
.end method
