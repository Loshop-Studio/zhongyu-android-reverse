.class public final synthetic Lq5/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/e0;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iput-wide p2, p0, Lq5/e0;->b:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq5/e0;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-wide v1, p0, Lq5/e0;->b:J

    invoke-static {v0, v1, v2}, Lcom/zykj/view/board/crop/BlackboardCropFragment$d;->c(Lcom/zykj/view/board/crop/BlackboardCropFragment;J)V

    return-void
.end method
