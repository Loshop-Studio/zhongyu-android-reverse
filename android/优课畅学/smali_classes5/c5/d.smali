.class public final synthetic Lc5/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

.field public final synthetic b:Lx7/a;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Lx7/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/d;->a:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    iput-object p2, p0, Lc5/d;->b:Lx7/a;

    iput p3, p0, Lc5/d;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lc5/d;->a:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    iget-object v1, p0, Lc5/d;->b:Lx7/a;

    iget v2, p0, Lc5/d;->c:I

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->j(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Lx7/a;ILandroidx/compose/runtime/Composer;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
