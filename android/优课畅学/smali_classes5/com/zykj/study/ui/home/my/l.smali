.class public final synthetic Lcom/zykj/study/ui/home/my/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/study/ui/home/my/l;->a:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/ui/home/my/l;->a:Lcom/zykj/study/ui/home/my/StudentViewContentFragment;

    check-cast p1, Lcom/zykj/study/bean/course/CatalogBean;

    invoke-static {v0, p1}, Lcom/zykj/study/ui/home/my/StudentViewContentFragment$initData$2;->c(Lcom/zykj/study/ui/home/my/StudentViewContentFragment;Lcom/zykj/study/bean/course/CatalogBean;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
