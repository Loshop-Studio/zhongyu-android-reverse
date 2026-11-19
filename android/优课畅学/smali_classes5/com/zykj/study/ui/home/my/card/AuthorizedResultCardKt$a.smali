.class public final Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt;->j(Landroidx/compose/ui/Modifier;Lcom/zykj/study/viewmodels/AuthorizedLessonViewModel;Lx7/l;Lx7/a;Landroidx/compose/runtime/Composer;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Lcom/zykj/study/bean/exercise/AuthorizeLesson;


# direct methods
.method public constructor <init>(Lx7/l;Lcom/zykj/study/bean/exercise/AuthorizeLesson;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt$a;->a:Lx7/l;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt$a;->b:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt$a;->a:Lx7/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt$a;->b:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Lx7/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/study/ui/home/my/card/AuthorizedResultCardKt$a;->a()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lh7/p;->a:Lh7/p;

    .line 5
    .line 6
    return-object v0
.end method
