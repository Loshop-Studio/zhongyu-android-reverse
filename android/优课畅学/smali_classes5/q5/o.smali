.class public final synthetic Lq5/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/o;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iput-boolean p2, p0, Lq5/o;->b:Z

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lq5/o;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    iget-boolean v1, p0, Lq5/o;->b:Z

    invoke-static {v0, v1}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->x(Lcom/zykj/view/board/crop/BlackboardCropFragment;Z)Lh7/p;

    move-result-object v0

    return-object v0
.end method
