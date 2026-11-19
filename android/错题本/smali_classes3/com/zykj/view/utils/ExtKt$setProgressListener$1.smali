.class public final Lcom/zykj/view/utils/ExtKt$setProgressListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/view/widget/SketchProgressView$ProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/utils/ExtKt;->setProgressListener(Lcom/zykj/view/widget/SketchProgressView;Lr6/a;Lr6/c;Lr6/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "com/zykj/view/utils/ExtKt$setProgressListener$1",
        "Lcom/zykj/view/widget/SketchProgressView$ProgressListener;",
        "Ld6/s;",
        "onTouchStart",
        "()V",
        "",
        "progress",
        "onProgress",
        "(F)V",
        "onTouchEnd",
        "view_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onProgress:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onTouchEnd:Lr6/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/c;"
        }
    .end annotation
.end field

.field final synthetic $onTouchStart:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr6/a;Lr6/c;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;->$onTouchStart:Lr6/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;->$onProgress:Lr6/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;->$onTouchEnd:Lr6/c;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public onProgress(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;->$onProgress:Lr6/c;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onTouchEnd(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;->$onTouchEnd:Lr6/c;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onTouchStart()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/utils/ExtKt$setProgressListener$1;->$onTouchStart:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
