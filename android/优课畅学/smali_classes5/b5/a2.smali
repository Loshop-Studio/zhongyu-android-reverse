.class public final synthetic Lb5/a2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/p;


# instance fields
.field public final synthetic a:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/a2;->a:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb5/a2;->a:Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    check-cast p2, Lcom/zykj/study/bean/OtherSubscribe;

    invoke-static {v0, p1, p2}, Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;->m(Lcom/zykj/study/ui/home/my/ManagementSubscribeFragment;ILcom/zykj/study/bean/OtherSubscribe;)Lh7/p;

    move-result-object p1

    return-object p1
.end method
