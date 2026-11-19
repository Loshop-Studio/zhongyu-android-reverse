.class public final synthetic Lb5/s4;
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

    iput-object p1, p0, Lb5/s4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/s4;->a:Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;

    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    check-cast p2, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;->l(Lcom/zykj/study/ui/home/my/StudentViewMemberFragment;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
