.class public final synthetic Lr7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/crop/BlackboardCropFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr7/h;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr7/h;->a:Lcom/zykj/view/board/crop/BlackboardCropFragment;

    invoke-static {v0}, Lcom/zykj/view/board/crop/BlackboardCropFragment;->g(Lcom/zykj/view/board/crop/BlackboardCropFragment;)V

    return-void
.end method
