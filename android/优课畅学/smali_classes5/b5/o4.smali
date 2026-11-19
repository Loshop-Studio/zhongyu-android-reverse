.class public final synthetic Lb5/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/o4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/o4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    check-cast p1, Landroid/view/View;

    check-cast p2, Lcom/zykj/study/bean/teach/SuperviseGroup;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->n(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Landroid/view/View;Lcom/zykj/study/bean/teach/SuperviseGroup;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
