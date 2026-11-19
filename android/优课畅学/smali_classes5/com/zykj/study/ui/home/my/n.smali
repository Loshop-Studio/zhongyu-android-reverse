.class public final synthetic Lcom/zykj/study/ui/home/my/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/n;->a:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/n;->a:Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/my/TeachCourseAddFragment$initData$3;->d(Lcom/zykj/study/ui/home/my/TeachCourseAddFragment;)Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v0

    return-object v0
.end method
