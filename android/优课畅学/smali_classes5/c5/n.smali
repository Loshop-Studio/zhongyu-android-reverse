.class public final synthetic Lc5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

.field public final synthetic b:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/n;->a:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    iput-object p2, p0, Lc5/n;->b:Lx7/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/n;->a:Lcom/zykj/study/bean/exercise/AuthorizeLesson;

    iget-object v1, p0, Lc5/n;->b:Lx7/a;

    invoke-static {v0, v1}, Lcom/zykj/study/ui/home/my/card/AuthorizationSearchListKt;->c(Lcom/zykj/study/bean/exercise/AuthorizeLesson;Lx7/a;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
