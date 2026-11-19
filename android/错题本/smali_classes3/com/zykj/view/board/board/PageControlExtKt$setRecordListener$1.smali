.class public final Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/blackboard/listener/RecordListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/view/board/board/PageControlExtKt;->setRecordListener(Lcom/zykj/blackboard/core/edit/IPageControl;Lr6/a;Lr6/c;Lr6/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "com/zykj/view/board/board/PageControlExtKt$setRecordListener$1",
        "Lcom/zykj/blackboard/listener/RecordListener;",
        "",
        "time",
        "Ld6/s;",
        "progress",
        "(J)V",
        "startRecord",
        "()V",
        "stopRecord",
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

.field final synthetic $onStart:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field

.field final synthetic $onStop:Lr6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr6/a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr6/c;Lr6/a;Lr6/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/c;",
            "Lr6/a;",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;->$onProgress:Lr6/c;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;->$onStart:Lr6/a;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;->$onStop:Lr6/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public progress(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;->$onProgress:Lr6/c;

    .line 2
    .line 3
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

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

.method public startRecord()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;->$onStart:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public stopRecord()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/PageControlExtKt$setRecordListener$1;->$onStop:Lr6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method
