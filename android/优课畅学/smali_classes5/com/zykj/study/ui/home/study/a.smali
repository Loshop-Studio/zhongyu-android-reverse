.class public final synthetic Lcom/zykj/study/ui/home/study/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/study/StudyListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/study/StudyListFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/study/a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/study/a;->a:Lcom/zykj/study/ui/home/study/StudyListFragment;

    invoke-static {v0}, Lcom/zykj/study/ui/home/study/StudyListFragment$initData$4;->c(Lcom/zykj/study/ui/home/study/StudyListFragment;)Lcom/xuexiang/xui/widget/statelayout/MultipleStatusView;

    move-result-object v0

    return-object v0
.end method
