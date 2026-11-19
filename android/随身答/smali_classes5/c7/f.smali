.class public final synthetic Lc7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public synthetic constructor <init>(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lc7/f;->a:I

    iput-object p2, p0, Lc7/f;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lc7/f;->a:I

    iget-object v1, p0, Lc7/f;->b:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->m(ILcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method
