.class public final synthetic Ln4/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/adapter/StudentViewMemberAdapter;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/adapter/StudentViewMemberAdapter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln4/s0;->a:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ln4/s0;->a:Lcom/zykj/study/adapter/StudentViewMemberAdapter;

    check-cast p1, Lcom/zykj/study/bean/teach/SuperviseGroup;

    check-cast p2, Lcom/zykj/study/bean/teach/SuperviseGroupMember;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/adapter/StudentViewMemberAdapter;->e(Lcom/zykj/study/adapter/StudentViewMemberAdapter;Lcom/zykj/study/bean/teach/SuperviseGroup;Lcom/zykj/study/bean/teach/SuperviseGroupMember;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
